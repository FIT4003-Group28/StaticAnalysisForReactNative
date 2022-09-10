package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clyy  reason: default package */
/* loaded from: classes5.dex */
public final class clyy implements clyz {
    private final List<cmag> a;
    private final clvk[] b;
    private boolean c;
    private int d;
    private int e;
    private long f;

    public clyy(List<cmag> list) {
        this.a = list;
        this.b = new clvk[list.size()];
    }

    private final boolean f(cmnk cmnkVar, int i) {
        if (cmnkVar.d() == 0) {
            return false;
        }
        if (cmnkVar.l() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    @Override // defpackage.clyz
    public final void a() {
        this.c = false;
    }

    @Override // defpackage.clyz
    public final void b(clup clupVar, cmaj cmajVar) {
        for (int i = 0; i < this.b.length; i++) {
            cmag cmagVar = this.a.get(i);
            cmajVar.a();
            clvk RT = clupVar.RT(cmajVar.b());
            clnf clnfVar = new clnf();
            clnfVar.a = cmajVar.c();
            clnfVar.k = "application/dvbsubs";
            clnfVar.m = Collections.singletonList(cmagVar.b);
            clnfVar.c = cmagVar.a;
            RT.a(clnfVar.a());
            this.b[i] = RT;
        }
    }

    @Override // defpackage.clyz
    public final void c(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // defpackage.clyz
    public final void d(cmnk cmnkVar) {
        clvk[] clvkVarArr;
        if (this.c) {
            if (this.d == 2 && !f(cmnkVar, 32)) {
                return;
            }
            if (this.d == 1 && !f(cmnkVar, 0)) {
                return;
            }
            int i = cmnkVar.b;
            int d = cmnkVar.d();
            for (clvk clvkVar : this.b) {
                cmnkVar.f(i);
                clvkVar.d(cmnkVar, d);
            }
            this.e += d;
        }
    }

    @Override // defpackage.clyz
    public final void e() {
        if (this.c) {
            for (clvk clvkVar : this.b) {
                clvkVar.b(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }
}
