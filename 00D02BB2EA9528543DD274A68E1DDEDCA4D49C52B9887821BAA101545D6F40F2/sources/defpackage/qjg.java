package defpackage;
/* compiled from: PG */
/* renamed from: qjg  reason: default package */
/* loaded from: classes7.dex */
public class qjg implements qjc {
    @dzsi
    public cqtd a;
    private final String b;
    private Boolean c;
    private final cqkn<qjc> d;
    @dzsi
    private final ddho e;

    public qjg(cqhn cqhnVar, String str, Boolean bool, cqkn<qjc> cqknVar, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar) {
        this.b = str;
        this.c = bool;
        this.d = cqknVar;
        this.a = cqtdVar;
        this.e = ddhoVar;
    }

    public void OQ(boolean z) {
        this.c = Boolean.valueOf(z);
        cqkx.p(this);
    }

    @Override // defpackage.qjc
    public String a() {
        return this.b;
    }

    @Override // defpackage.qjc
    public Boolean b() {
        return this.c;
    }

    @Override // defpackage.qjc
    public cqkn<qjc> c() {
        return this.d;
    }

    @Override // defpackage.qjc
    public cjtd d() {
        if (this.e == null) {
            return cjtd.b;
        }
        cjta b = cjtd.b();
        b.d = this.e;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.c.booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    @Override // defpackage.qjc
    @dzsi
    public cqtd e() {
        return this.a;
    }
}
