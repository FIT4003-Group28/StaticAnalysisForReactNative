package defpackage;
/* compiled from: PG */
/* renamed from: bxad  reason: default package */
/* loaded from: classes4.dex */
public final class bxad implements degu<bwzw> {
    final /* synthetic */ dggg a;
    final /* synthetic */ bxaf b;

    public bxad(bxaf bxafVar, dggg dgggVar) {
        this.b = bxafVar;
        this.a = dgggVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        drtc drtcVar = null;
        if (th instanceof btzs) {
            btzs btzsVar = (btzs) th;
            Integer num = btzsVar.b().s;
            if (num != null) {
                drtcVar = drtc.b(num.intValue());
            }
            dwfr dwfrVar = bxaf.a;
            btzsVar.b();
        } else {
            dwfr dwfrVar2 = bxaf.a;
        }
        this.b.c(7, drtcVar, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bwzw bwzwVar) {
    }
}
