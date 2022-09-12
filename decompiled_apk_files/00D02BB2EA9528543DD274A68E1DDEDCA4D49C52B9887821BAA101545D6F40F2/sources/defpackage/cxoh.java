package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxoh  reason: default package */
/* loaded from: classes5.dex */
public final class cxoh implements Runnable {
    final /* synthetic */ cxog a;

    public cxoh(cxog cxogVar) {
        this.a = cxogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxoi.a.add(this.a);
        if (cxoi.b != -1) {
            this.a.b();
        }
    }
}
