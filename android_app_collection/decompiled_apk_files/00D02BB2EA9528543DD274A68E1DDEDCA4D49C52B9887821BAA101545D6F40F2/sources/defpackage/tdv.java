package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tdv  reason: default package */
/* loaded from: classes7.dex */
public final class tdv implements hzz {
    final /* synthetic */ tmh a;
    final /* synthetic */ sxa b;
    final /* synthetic */ tlv c;

    public tdv(tmh tmhVar, sxa sxaVar, tlv tlvVar) {
        this.a = tmhVar;
        this.b = sxaVar;
        this.c = tlvVar;
    }

    @Override // defpackage.hzz
    public final void a(dagb dagbVar) {
    }

    @Override // defpackage.hzz
    public final void b(dagb dagbVar) {
    }

    @Override // defpackage.hzz
    public final void c(dagb dagbVar) {
        dcdc<wuv> a = this.a.a(this.a.a.get(dagbVar.d));
        if (!a.isEmpty()) {
            sxa sxaVar = this.b;
            amve amveVar = this.c.g().get(Integer.valueOf(a.get(0).s()));
            dbsk.s(amveVar);
            sxaVar.f(amveVar);
        }
    }
}
