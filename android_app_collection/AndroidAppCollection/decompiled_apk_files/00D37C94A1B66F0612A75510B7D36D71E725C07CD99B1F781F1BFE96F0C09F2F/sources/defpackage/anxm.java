package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anxm  reason: default package */
/* loaded from: classes.dex */
public final class anxm {
    public int a;
    private final Set b;
    private final Set c;
    private int d;
    private anxp e;
    private Set f;

    @SafeVarargs
    public anxm(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.a = 0;
        this.f = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            anzk.d(cls2, "Null interface");
        }
        Collections.addAll(this.b, clsArr);
    }

    public final anxn a() {
        anzk.b(this.e != null, "Missing required property: factory.");
        return new anxn(new HashSet(this.b), new HashSet(this.c), this.d, this.a, this.e, this.f);
    }

    public final void b(anxy anxyVar) {
        if (!this.b.contains(anxyVar.a)) {
            this.c.add(anxyVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final void c(anxp anxpVar) {
        anzk.d(anxpVar, "Null factory");
        this.e = anxpVar;
    }

    public final void d(int i) {
        anzk.b(this.d == 0, "Instantiation type has already been set.");
        this.d = i;
    }

    public final void e() {
        d(1);
    }
}
