package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cyfu  reason: default package */
/* loaded from: classes5.dex */
public final class cyfu implements cyfx {
    public boolean a;
    public boolean b;
    public final Set<cygl> c;
    public Set<MatchInfo> d;
    public Set<MatchInfo> e;

    public cyfu() {
        this.a = false;
        this.b = false;
        this.c = EnumSet.noneOf(cygl.class);
        this.d = new HashSet();
        this.e = new HashSet();
    }

    @Override // defpackage.cyfx
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cyfx
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cyfx
    public final Set<cygl> c() {
        return this.c;
    }

    @Override // defpackage.cyfx
    public final boolean d() {
        return !this.d.isEmpty() || !this.e.isEmpty();
    }

    @Override // defpackage.cyfx
    public final Set<MatchInfo> e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cyfx) {
            cyfx cyfxVar = (cyfx) obj;
            if (this.a == cyfxVar.a() && this.b == cyfxVar.b() && dbsd.a(this.c, cyfxVar.c()) && dbsd.a(this.d, cyfxVar.e()) && dbsd.a(this.e, cyfxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyfx
    public final Set<MatchInfo> f() {
        return this.e;
    }

    @Override // defpackage.cyfx
    public final cyfu g() {
        return new cyfu(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d, this.e});
    }

    public cyfu(cyfx cyfxVar) {
        this.a = cyfxVar.a();
        this.b = cyfxVar.b();
        Set<cygl> c = cyfxVar.c();
        EnumSet noneOf = EnumSet.noneOf(cygl.class);
        dcft.h(noneOf, c);
        this.c = noneOf;
        this.d = new HashSet(cyfxVar.e());
        this.e = new HashSet(cyfxVar.f());
    }
}
