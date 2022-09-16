package defpackage;
/* compiled from: PG */
/* renamed from: crw  reason: default package */
/* loaded from: classes3.dex */
final class crw implements Runnable {
    final /* synthetic */ crx a;

    public crw(crx crxVar) {
        this.a = crxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        crx crxVar = this.a;
        if (crxVar.b.a) {
            crxVar.a.b();
        }
    }
}
