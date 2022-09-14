package defpackage;
/* compiled from: PG */
/* renamed from: zpw  reason: default package */
/* loaded from: classes7.dex */
final class zpw implements Runnable {
    final /* synthetic */ zfe a;
    final /* synthetic */ amuo b;

    public zpw(zfe zfeVar, amuo amuoVar) {
        this.a = zfeVar;
        this.b = amuoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zfe zfeVar = this.a;
        if (zfeVar != null) {
            zfeVar.n(this.b);
        }
    }
}
