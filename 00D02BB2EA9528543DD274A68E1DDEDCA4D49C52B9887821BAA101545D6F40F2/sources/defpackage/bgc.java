package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgc  reason: default package */
/* loaded from: classes3.dex */
public final class bgc extends bc<bgb> {
    public bgc(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bc
    public final /* bridge */ /* synthetic */ void c(awj awjVar, bgb bgbVar) {
        bgb bgbVar2 = bgbVar;
        String str = bgbVar2.a;
        awjVar.f(1);
        bbp bbpVar = bgbVar2.b;
        byte[] f = bbp.f(null);
        if (f == null) {
            awjVar.f(2);
        } else {
            awjVar.j(2, f);
        }
    }

    @Override // defpackage.bt
    public final String d() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
