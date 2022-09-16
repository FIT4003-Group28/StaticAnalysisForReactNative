package defpackage;
/* compiled from: PG */
/* renamed from: afdf  reason: default package */
/* loaded from: classes.dex */
final class afdf implements Runnable {
    final /* synthetic */ afdg a;

    public afdf(afdg afdgVar) {
        this.a = afdgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afnh afnhVar;
        afdv afdvVar = this.a.b;
        afdp afdpVar = afdvVar.u;
        afdvVar.u = null;
        if (afdpVar == null && this.a.b.t == null) {
            return;
        }
        afdv afdvVar2 = this.a.b;
        if (afdvVar2.y || (afnhVar = afdvVar2.p) == null || afnhVar.E()) {
            return;
        }
        this.a.b.F(true);
        afdv afdvVar3 = this.a.b;
        afdvVar3.V(new afkn("surfaceunavailable", afdvVar3.g(), this.a.a));
    }
}
