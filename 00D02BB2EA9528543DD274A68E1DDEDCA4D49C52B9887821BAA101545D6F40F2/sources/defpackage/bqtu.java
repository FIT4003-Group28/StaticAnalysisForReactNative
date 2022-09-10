package defpackage;
/* compiled from: PG */
/* renamed from: bqtu  reason: default package */
/* loaded from: classes4.dex */
class bqtu implements bqss {
    public boolean a = false;
    public boolean b;
    private final eapx c;
    private final bqtt d;

    public bqtu(eapy eapyVar, boolean z, bqtt bqttVar) {
        this.c = eapyVar.o();
        this.b = z;
        this.d = bqttVar;
    }

    @Override // defpackage.bqss
    public String a() {
        return this.c.e();
    }

    @Override // defpackage.bqss
    public String b() {
        eapx eapxVar = this.c;
        return eapxVar.a().I(eapxVar.a, eapxVar.c());
    }

    @Override // defpackage.bqss
    public Boolean c() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bqss
    public Boolean d() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bqss
    public cqkl e() {
        if (this.b) {
            return cqkl.a;
        }
        this.d.a(this.c.c());
        return cqkl.a;
    }
}
