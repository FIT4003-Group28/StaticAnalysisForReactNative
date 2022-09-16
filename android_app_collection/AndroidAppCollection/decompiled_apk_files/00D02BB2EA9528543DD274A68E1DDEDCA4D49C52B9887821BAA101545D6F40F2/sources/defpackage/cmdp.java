package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmdp  reason: default package */
/* loaded from: classes5.dex */
public final class cmdp extends cmdt<Void> {
    private final cmej d;
    private final long e;
    private final ArrayList<cmdm> f;
    private final clpa g;
    private cmdn h;
    private cmdo i;
    private long j;
    private long k;

    public cmdp(cmej cmejVar, long j) {
        cmmn.a(true);
        this.d = cmejVar;
        this.e = j;
        this.f = new ArrayList<>();
        this.g = new clpa();
    }

    private final void y(clpb clpbVar) {
        long j;
        long j2;
        clpbVar.u(0, this.g);
        long j3 = this.g.p;
        long j4 = Long.MIN_VALUE;
        if (this.h == null || this.f.isEmpty()) {
            long j5 = this.e;
            this.j = j3;
            if (j5 != Long.MIN_VALUE) {
                j4 = j3 + j5;
            }
            this.k = j4;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                cmdm cmdmVar = this.f.get(i);
                long j6 = this.j;
                long j7 = this.k;
                cmdmVar.b = j6;
                cmdmVar.c = j7;
            }
            j = 0;
            j2 = j5;
        } else {
            long j8 = this.j - j3;
            if (this.e != Long.MIN_VALUE) {
                j4 = this.k - j3;
            }
            j = j8;
            j2 = j4;
        }
        try {
            cmdn cmdnVar = new cmdn(clpbVar, j, j2);
            this.h = cmdnVar;
            e(cmdnVar);
        } catch (cmdo e) {
            this.i = e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdt, defpackage.cmdj
    public final void a(cmlo cmloVar) {
        super.a(cmloVar);
        x(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdt, defpackage.cmdj
    public final void d() {
        super.d();
        this.i = null;
        this.h = null;
    }

    @Override // defpackage.cmej
    public final clno q() {
        return this.d.q();
    }

    @Override // defpackage.cmej
    public final void s(cmeg cmegVar) {
        cmmn.c(this.f.remove(cmegVar));
        this.d.s(((cmdm) cmegVar).a);
        if (this.f.isEmpty()) {
            cmdn cmdnVar = this.h;
            cmmn.f(cmdnVar);
            y(cmdnVar.a);
        }
    }

    @Override // defpackage.cmej
    public final cmeg t(cmeh cmehVar, cmkk cmkkVar, long j) {
        cmdm cmdmVar = new cmdm(this.d.t(cmehVar, cmkkVar, j), this.j, this.k);
        this.f.add(cmdmVar);
        return cmdmVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdt
    public final /* bridge */ /* synthetic */ long u(long j) {
        long j2 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long a = cllt.a(0L);
            j2 = Math.max(0L, j - a);
            long j3 = this.e;
            if (j3 != Long.MIN_VALUE) {
                return Math.min(cllt.a(j3) - a, j2);
            }
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cmdt
    public final /* bridge */ /* synthetic */ void v(clpb clpbVar) {
        if (this.i != null) {
            return;
        }
        y(clpbVar);
    }

    @Override // defpackage.cmdt, defpackage.cmej
    public final void r() {
        cmdo cmdoVar = this.i;
        if (cmdoVar != null) {
            throw cmdoVar;
        }
        super.r();
    }
}
