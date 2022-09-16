package defpackage;
/* compiled from: PG */
/* renamed from: zov  reason: default package */
/* loaded from: classes7.dex */
class zov implements zer {
    final /* synthetic */ zpe a;

    public zov(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.zer
    @dzsi
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.zer
    @dzsi
    public cqtd b() {
        zpa zpaVar = this.a.f;
        if (zpaVar == null) {
            return null;
        }
        return ((zgl) zpaVar).a;
    }

    @Override // defpackage.zer
    @dzsi
    public cjtd c() {
        if (this.a.f == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = dtxn.dU;
        b.g(((zgl) this.a.f).b);
        return b.a();
    }

    @Override // defpackage.zer
    public Boolean d() {
        boolean z = false;
        if (this.a.h().booleanValue() && this.a.r().a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zer
    public zet e() {
        return this.a.n;
    }
}
