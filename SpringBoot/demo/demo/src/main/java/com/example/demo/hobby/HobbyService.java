package com.example.demo.hobby;

import com.example.demo.member.Member;
import com.example.demo.store.Store;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.demo.store.Store.hobbies;
import static com.example.demo.store.Store.members;

@Service
public class HobbyService {
    public List<Hobby> findHobby()
    {

        return Store.hobbies;
    }

    public void addHobby(HobbyInsert insert)
    {


       Integer id =insert.getId();
       String name = insert.getName();
       Member member=findById(id);
       Hobby hobby=new Hobby(name,member);
       hobbies.add(hobby);
//       if(member.getHobbies()==null)
//       {
//           List<Hobby> hobbies2=new ArrayList<>();
//           hobbies2.add(hobby);
//           member.setHobbies(hobbies2);
//       }
//       else {
//           List<Hobby> hobbies2=member.getHobbies();
//           hobbies2.add(hobby);
//           member.setHobbies(hobbies2);
//       }
       //hobby에 member가 없거나//member
//       List<Hobby> mem =member.getHobbies();
//       mem.add(hobby);
//       member.setHobbies(mem);
//
//
//
//
//           List<Hobby> hobbylist2 =new ArrayList<>();
//           hobbylist2.add(hobby);
//           member.setHobbies(hobbylist2);
//
//
//
//       else {
//           List<Hobby> hobbylist2=member.getHobbies();
//           hobbylist2.add(hobby);
//           member.setHobbies(hobbylist2);
//
//       }
    }
    public Member findById(int id)
    {
        Member mem = new Member();
        for(int i=0;i<members.size();i++)
        {
            if(members.get(i).getId()==id)
            {
                mem =members.get(i);
            }
        }
        return mem;
    }
    public Hobby findHobbyById(int id)
    {
        for(int i=0; i<Store.hobbies.size();i++)
        {
            if(Store.hobbies.get(i).getId()==id)
            {
                return Store.hobbies.get(i);
            }
        }
        return null;
    }
    public Hobby changeHobbyById(int id, HobbyRequest request)
    {
        Hobby hobby=findHobbyById(id);
        String name = request.name();
        Member member =request.member();
        hobby.setMember(member);
        hobby.setName(name);
        return hobby;
    }
    public void deleteHobby(int id)
    {
        Store.hobbies.remove(findHobbyById(id));
    }
    public void insertMember(List<Member> members)
    {


    }


}
