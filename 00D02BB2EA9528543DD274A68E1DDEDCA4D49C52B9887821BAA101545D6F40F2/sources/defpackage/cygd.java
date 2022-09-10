package defpackage;

import com.google.android.libraries.social.populous.core.ContainerInfo;
import com.google.android.libraries.social.populous.core.EdgeKeyInfo;
import com.google.android.libraries.social.populous.core.MatchInfo;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: cygd  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygd {
    public int d;
    public int e;
    public PeopleApiAffinity f;
    public double g;
    public dcdc<MatchInfo> h = dcdc.e();
    public dcdc<EdgeKeyInfo> i = dcdc.e();
    public EnumSet<cygl> j = EnumSet.noneOf(cygl.class);
    public dcdc<ContainerInfo> k;
    public boolean l;
    public boolean m;

    public abstract PersonFieldMetadata a();

    public abstract void b(duej duejVar);

    public abstract void c(@dzsi String str);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(boolean z);

    public abstract void g(@dzsi String str);

    public abstract void h(@dzsi Long l);

    public final PersonFieldMetadata i() {
        PersonFieldMetadata a = a();
        a.h = this.f;
        a.i = this.g;
        a.j = this.d;
        a.k = this.e;
        a.n = this.h;
        a.p = this.j;
        a.q = this.k;
        a.n(this.i);
        a.l = this.l;
        a.m = this.m;
        return a;
    }

    public final void j(cygl cyglVar) {
        this.j.add(cyglVar);
    }

    public final void k(PersonFieldMetadata personFieldMetadata) {
        EnumSet<cygl> copyOf;
        if (!personFieldMetadata.p.isEmpty()) {
            copyOf = EnumSet.copyOf((EnumSet) personFieldMetadata.p);
        } else {
            copyOf = EnumSet.noneOf(cygl.class);
        }
        this.j = copyOf;
        this.f = personFieldMetadata.h;
        this.g = personFieldMetadata.i;
        this.d = personFieldMetadata.j;
        this.e = personFieldMetadata.k;
        d(personFieldMetadata.c());
        b(personFieldMetadata.d());
        c(personFieldMetadata.e());
        this.i = personFieldMetadata.o;
        e(personFieldMetadata.a());
        f(personFieldMetadata.b());
        this.h = personFieldMetadata.n;
        g(personFieldMetadata.f());
        h(personFieldMetadata.g());
        this.k = personFieldMetadata.q;
        this.l = personFieldMetadata.l;
        this.m = personFieldMetadata.m;
    }
}
