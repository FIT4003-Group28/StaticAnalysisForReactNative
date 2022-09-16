package defpackage;
/* compiled from: PG */
/* renamed from: dld  reason: default package */
/* loaded from: classes3.dex */
final class dld implements Runnable {
    final /* synthetic */ dle a;

    public dld(dle dleVar) {
        this.a = dleVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dln dlnVar = this.a.a;
        if (dlnVar == null || !dlnVar.b) {
            return;
        }
        dlnVar.l(false);
    }
}
