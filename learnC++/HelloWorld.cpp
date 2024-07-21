#include <stdio.h>
#include <iostream>

int main() {
  std::string name;
  int age;

  std::cout << "Hello, World!" << std::endl;
  std::cout << "Please enter your name: ";
  std::getline(std::cin, name);
  
  std::cout << "Hello, " << name << ". Pleasure to meet you!" << std::endl;

  std::cout << "How old are you, " << name << "?" << std::endl;
  std::cin >> age;

  std::cout << "Wonderful! Your name is " << name << " and you are " << age << " years old" << std::endl;
  std::cout << "Would you like to know how old you are in days?" << std::endl;
  double ageInDays = age * 365;
  std::cout << "You are " << ageInDays << " days old" << std::endl;

  return 0;

}
