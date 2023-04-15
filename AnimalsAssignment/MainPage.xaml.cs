using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace AnimalsAssignment
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }
    }
    public interface Talkable
    {
        string talk();
        string getName();
    }
    public abstract class Pet
    {
        protected string name;
        public Pet(string name) { this.name = name; }
        public string getName() { return name; }
    }
    public abstract class Person
    {
        private String name;

        public Person(String name)
        {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }
    }
    public class Cat : Pet , Talkable
    {
        private int mousesKilled;

        public Cat(int mousesKilled, String name) : base(name) 
        { this.mousesKilled = mousesKilled; }
        

        public int getMousesKilled()
        {
            return mousesKilled;
        }

        public void addMouse()
        {
            mousesKilled++;
        }

        
    public String talk()
        {
            return "Meow";
        }

        
    public String toString()
        {
            return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
        }
    }
    public class Dog : Pet, Talkable
    {
        private bool friendly;

        public Dog(bool friendly, String name):base(name)
        {
            this.friendly = friendly;
        }

        public bool isFriendly()
        {
            return friendly;
        }

        
    public String talk()
        {
            return "Bark";
        }

        
    public String toString()
        {
            return "Dog: " + "name=" + name + " friendly=" + friendly;
        }


    }
    public class Teacher : Person, Talkable
    {
        private int age;

        public Teacher(int age, String name):base(name)
        {
            this.age = age;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }

        
    public String talk()
        {
            return "Don't forget to do the assigned reading!";
        }
    }
}
