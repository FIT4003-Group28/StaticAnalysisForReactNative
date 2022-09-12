package defpackage;
/* compiled from: PG */
/* renamed from: zow  reason: default package */
/* loaded from: classes7.dex */
class zow implements zeq {
    final /* synthetic */ zpe a;

    public zow(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.zeq
    @dzsi
    public cqtd a() {
        zpa zpaVar = this.a.f;
        if (zpaVar == null) {
            return null;
        }
        return ((zgl) zpaVar).a;
    }

    @Override // defpackage.zeq
    @dzsi
    public CharSequence b() {
        return this.a.c;
    }

    @Override // defpackage.zeq
    public Boolean c() {
        boolean z = false;
        if (this.a.h().booleanValue() && this.a.r().a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zeq
    public zet d() {
        return this.a.n;
    }
}
