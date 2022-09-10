package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axpe  reason: default package */
/* loaded from: classes3.dex */
public class axpe implements axon {
    private final dqkn a;
    @dzsi
    private final axne b;
    private final axog c;
    @dzsi
    private final jht d;
    private final axoo e;

    public axpe(axjh axjhVar, axoi axoiVar, dqae dqaeVar, axoo axooVar) {
        axne axneVar;
        dqau dqauVar = dqaeVar.b;
        dqkn dqknVar = (dqauVar == null ? dqau.e : dqauVar).b;
        this.a = dqknVar == null ? dqkn.e : dqknVar;
        this.e = axooVar;
        dqau dqauVar2 = dqaeVar.b;
        dqauVar2 = dqauVar2 == null ? dqau.e : dqauVar2;
        if ((dqauVar2.a & 2) != 0) {
            dqkn dqknVar2 = dqauVar2.b;
            String str = (dqknVar2 == null ? dqkn.e : dqknVar2).d;
            dqkn dqknVar3 = dqauVar2.b;
            String str2 = (dqknVar3 == null ? dqkn.e : dqknVar3).b;
            dqaw dqawVar = dqauVar2.c;
            axneVar = axjhVar.p(str, str2, dqawVar == null ? dqaw.d : dqawVar, axooVar.a());
        } else {
            axneVar = null;
        }
        this.b = axneVar;
        this.c = axoiVar.a(dqauVar2);
        this.d = axooVar.h(this);
    }

    @Override // defpackage.axon
    public axog a() {
        return this.c;
    }

    @Override // defpackage.axon
    public cjtd b() {
        return this.e.i();
    }

    @Override // defpackage.axon
    @dzsi
    public axne c() {
        return this.b;
    }

    @Override // defpackage.axon
    @dzsi
    public jht d() {
        return this.d;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof axpe)) {
            return false;
        }
        axpe axpeVar = (axpe) obj;
        return dbsd.a(this.e, axpeVar.e) && dbsd.a(this.a.d, axpeVar.a.d);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.a.d});
    }

    @Override // defpackage.axos
    public dqkn k() {
        return this.a;
    }

    @Override // defpackage.axos
    public void l(cqiv cqivVar) {
        cqivVar.a(new axla(), this);
    }
}
