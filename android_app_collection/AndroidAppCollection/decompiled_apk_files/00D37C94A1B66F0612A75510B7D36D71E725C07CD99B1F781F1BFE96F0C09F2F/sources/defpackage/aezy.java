package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aezy  reason: default package */
/* loaded from: classes.dex */
final class aezy implements pry {
    private final pvf a;
    private final pry[] b;
    private pry c;

    public aezy(pvf pvfVar, pry[] pryVarArr) {
        aqxo.p(pvfVar.m() == pryVarArr.length);
        this.a = pvfVar;
        this.b = pryVarArr;
        this.c = pryVarArr[pvfVar.b()];
    }

    @Override // defpackage.pry
    public final int a(long j, List list) {
        return this.a.a(j, list);
    }

    @Override // defpackage.pry
    public final long b(long j, pkh pkhVar) {
        return j;
    }

    @Override // defpackage.pry
    public final void c(long j, long j2, List list, prw prwVar) {
        psb psbVar = list.isEmpty() ? null : (psb) arey.s(list);
        psd[] psdVarArr = new psd[this.a.m()];
        for (int i = 0; i < this.a.m(); i++) {
            pry pryVar = this.b[i];
            if (pryVar instanceof afbg) {
                psdVarArr[i] = ((afbg) pryVar).i(this.a, i, j2, psbVar);
            } else {
                psdVarArr[i] = psd.b;
            }
        }
        this.a.i(j, j2 - j, -9223372036854775807L, list, psdVarArr);
        pry pryVar2 = this.b[this.a.b()];
        this.c = pryVar2;
        pryVar2.c(j, j2, list, prwVar);
    }

    @Override // defpackage.pry
    public final void d() {
    }

    @Override // defpackage.pry
    public final void e(pru pruVar) {
        this.c.e(pruVar);
    }

    @Override // defpackage.pry
    public final void f() {
        for (pry pryVar : this.b) {
            pryVar.f();
        }
    }

    @Override // defpackage.pry
    public final boolean g(pru pruVar, boolean z, axr axrVar, axs axsVar) {
        return this.c.g(pruVar, z, axrVar, axsVar);
    }

    @Override // defpackage.pry
    public final void h() {
    }
}
