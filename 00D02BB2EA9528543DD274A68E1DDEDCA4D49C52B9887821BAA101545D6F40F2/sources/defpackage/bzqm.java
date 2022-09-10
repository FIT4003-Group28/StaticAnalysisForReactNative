package defpackage;
/* compiled from: PG */
/* renamed from: bzqm  reason: default package */
/* loaded from: classes4.dex */
public class bzqm implements bzql {
    private final dxio<gce> a;
    private final String b;
    private final String c;
    @dzsi
    private final jic d;
    @dzsi
    private final jic e;

    public bzqm(dxio<gce> dxioVar, dqkf dqkfVar) {
        this.a = dxioVar;
        this.b = dqkfVar.b;
        this.c = dqkfVar.c;
        jic jicVar = (dqkfVar.a & 4) != 0 ? new jic(dqkfVar.d, ckqc.FULLY_QUALIFIED, (cqtd) null, 0) : null;
        this.d = jicVar;
        this.e = (dqkfVar.a & 8) != 0 ? new jic(dqkfVar.e, ckqc.FULLY_QUALIFIED, (cqtd) null, 0) : jicVar;
    }

    @Override // defpackage.bzql
    public String a() {
        return this.b;
    }

    @Override // defpackage.bzql
    public String b() {
        return this.c;
    }

    @Override // defpackage.bzql
    @dzsi
    public jic c() {
        return this.a.a().h() ? this.e : this.d;
    }
}
