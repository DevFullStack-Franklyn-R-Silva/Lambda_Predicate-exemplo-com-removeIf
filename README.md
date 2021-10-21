# Predicate (exemplo comremoveIf)
Predicate (exemplo com removeIf) Predicate https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html

```java
public interface Predicate<T> {
    boolean test (T t);
}
```
## Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, remova da
lista somente aqueles cujo preço mínimo seja 100.
```java
    List<Product> list = new ArrayList<>();
    
    list.add(new Product("Tv", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Tablet", 350.50));
    list.add(new Product("HD Case", 80.90));
```  
# Versões:
• Implementação da interface

• Reference method com método estático

• Reference method com método não estático

• Expressão lambda declarada

• Expressão lambda inline

### Forma padrão.
```java
list.removeIf(p -> p.getPrice() >= 100);
###  primeira forma Implementação da interface.
list.removeIf(new ProductPredicate());
```
### segunda forma Reference method com método estático.
```java
list.removeIf(Product :: staticProductPredicate);
```
###  terceira forma Reference method com método não estático.
```java
list.removeIf(Product :: nonStaticProductPredicate);
```
###  quarta forma Expressão lambda declarada.
```java
double min = 100.00;
Predicate<Product> pred = p -> p.getPrice() >= min;
list.removeIf(pred);
```
###  quinta forma Expressão lambda inline.
```java
double min = 100.00;
list.removeIf(p -> p.getPrice() >= min);
```
