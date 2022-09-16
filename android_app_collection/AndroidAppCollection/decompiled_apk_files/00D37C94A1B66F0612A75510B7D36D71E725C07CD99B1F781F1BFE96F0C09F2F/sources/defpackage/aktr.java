package defpackage;
/* compiled from: PG */
/* renamed from: aktr  reason: default package */
/* loaded from: classes.dex */
public final class aktr implements aktx {
    public final akvh a;
    public final amtb b = amtb.a(3);
    public volatile amuk c = amuk.q();
    private final akvd d;

    public aktr(akvf akvfVar, ankx ankxVar) {
        this.a = akvfVar.e();
        akvc a = akvd.a(ankxVar, akvfVar.d());
        a.d = akvfVar.c();
        a.a = new aktq(this, 1);
        a.c = new khv(14);
        a.b = new aktq(this);
        this.d = a.a();
    }

    @Override // defpackage.aktx
    public final amuk a() {
        return this.c;
    }

    @Override // defpackage.aktx
    public final void b() {
        this.d.d();
    }

    @Override // defpackage.aktx
    public final void c() {
        this.d.e();
    }
}
