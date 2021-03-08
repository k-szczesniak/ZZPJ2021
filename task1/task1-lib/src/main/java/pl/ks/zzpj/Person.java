package pl.ks.zzpj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Getter
    @Setter
    private String name;

    public String introducePerson() {
        return "Goodbye " + getName();
    }
}
