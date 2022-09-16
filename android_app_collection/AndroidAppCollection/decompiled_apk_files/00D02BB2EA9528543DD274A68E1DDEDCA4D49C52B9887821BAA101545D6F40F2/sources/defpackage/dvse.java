package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dvse  reason: default package */
/* loaded from: classes6.dex */
public final class dvse extends dsqp<dvsl, dvse> implements dvsm {
    public dvse() {
        super(dvsl.o);
    }

    @Override // defpackage.dvsm
    public final String a() {
        return ((dvsl) this.b).b;
    }

    @Override // defpackage.dvsm
    public final boolean b() {
        return ((dvsl) this.b).c;
    }

    @Override // defpackage.dvsm
    public final List<String> c() {
        return Collections.unmodifiableList(((dvsl) this.b).e);
    }

    @Override // defpackage.dvsm
    public final boolean d() {
        return ((dvsl) this.b).f;
    }

    @Override // defpackage.dvsm
    public final int e() {
        return ((dvsl) this.b).g;
    }

    @Override // defpackage.dvsm
    public final int f() {
        return ((dvsl) this.b).h;
    }

    @Override // defpackage.dvsm
    public final dvsg g() {
        dvsg dvsgVar = ((dvsl) this.b).i;
        return dvsgVar == null ? dvsg.b : dvsgVar;
    }

    @Override // defpackage.dvsm
    public final boolean h() {
        return (((dvsl) this.b).a & 268435456) != 0;
    }

    @Override // defpackage.dvsm
    public final dvsk i() {
        dvsk dvskVar = ((dvsl) this.b).j;
        return dvskVar == null ? dvsk.e : dvskVar;
    }

    @Override // defpackage.dvsm
    public final float j() {
        return ((dvsl) this.b).k;
    }

    @Override // defpackage.dvsm
    public final int k() {
        return ((dvsl) this.b).l;
    }

    @Override // defpackage.dvsm
    public final boolean l() {
        return ((dvsl) this.b).m;
    }

    @Override // defpackage.dvsm
    public final boolean m() {
        return ((dvsl) this.b).n;
    }

    @Override // defpackage.dvsm
    public final int n() {
        int a = dvsi.a(((dvsl) this.b).d);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
