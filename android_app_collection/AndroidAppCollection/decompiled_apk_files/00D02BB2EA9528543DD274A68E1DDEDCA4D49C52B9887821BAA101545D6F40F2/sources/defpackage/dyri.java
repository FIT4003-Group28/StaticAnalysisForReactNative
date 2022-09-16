package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyri  reason: default package */
/* loaded from: classes6.dex */
public final class dyri implements Runnable {
    final /* synthetic */ dyrp a;

    public dyri(dyrp dyrpVar) {
        this.a = dyrpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyrp dyrpVar = this.a;
        if (dyrpVar.b.w == null) {
            if (dyrpVar.a.get() == dyrz.g) {
                this.a.a.set(null);
            }
            this.a.b.z.a(dyrz.d);
        }
    }
}
