/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.q1;

/**
 *
 * @author Tsiyon
 */

public class Swimmer{
    public String name;
    public String sex;
    public int age;
    public float time;
    public String ageGroup = "Child";

//    Teen: 13-17, Young Adult: 18-19, Adult: 20-55

    public Swimmer(String name, String sex, int age, float time){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.time = time;

        if(this.age >= 13 && this.age <= 17){
            this.ageGroup = "Teen";
        }
        if(this.age >= 18 && this.age <= 19){
            this.ageGroup = "Young Adult";
        }
        if(this.age >= 20 && this.age <= 55){
            this.ageGroup = "Adult";
        }
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public float getTime(){
        return this.time;
    }

    public int getAge(){
        return this.age;
    }

    public String getAgeGroup(){
        return this.ageGroup;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAgeGroup(int age) {
        if(age >= 13 && age <= 17){
            this.ageGroup = "Teen";
        }
        if(age >= 18 && age <= 19){
            this.ageGroup = "Young Adult";
        }
        if(age >= 20 && age <= 55){
            this.ageGroup = "Adult";
        }
    }
}

