package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: anxn  reason: default package */
/* loaded from: classes.dex */
public final class anxn {
    public final Set a;
    public final Set b;
    public final int c;
    public final anxp d;
    public final Set e;
    private final int f;

    public anxn(Set set, Set set2, int i, int i2, anxp anxpVar, Set set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.f = i2;
        this.d = anxpVar;
        this.e = Collections.unmodifiableSet(set3);
    }

    public static anxm a(Class cls) {
        return new anxm(cls, new Class[0]);
    }

    @SafeVarargs
    public static anxn b(Object obj, Class cls, Class... clsArr) {
        anxm anxmVar = new anxm(cls, clsArr);
        anxmVar.c(new anxl(obj));
        return anxmVar.a();
    }

    public final boolean c() {
        return this.f == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
