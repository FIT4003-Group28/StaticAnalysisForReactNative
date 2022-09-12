package defpackage;
/* compiled from: PG */
/* renamed from: zqs  reason: default package */
/* loaded from: classes7.dex */
class zqs implements zer {
    final /* synthetic */ zqu a;

    public zqs(zqu zquVar) {
        this.a = zquVar;
    }

    @Override // defpackage.zer
    @dzsi
    public CharSequence a() {
        dozz dozzVar = this.a.a.d;
        if (dozzVar == null) {
            dozzVar = dozz.y;
        }
        return dozzVar.h;
    }

    @Override // defpackage.zer
    @dzsi
    public cqtd b() {
        return this.a.c;
    }

    @Override // defpackage.zer
    @dzsi
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxn.dU;
        dozz dozzVar = this.a.a.d;
        if (dozzVar == null) {
            dozzVar = dozz.y;
        }
        b.g(dozzVar.d);
        return b.a();
    }

    @Override // defpackage.zer
    public Boolean d() {
        return false;
    }

    @Override // defpackage.zer
    public zet e() {
        return new zqt();
    }
}
