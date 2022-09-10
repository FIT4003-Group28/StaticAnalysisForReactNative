package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ir  reason: default package */
/* loaded from: classes6.dex */
public final class ir implements Runnable {
    final /* synthetic */ is a;
    final /* synthetic */ iu b;

    public ir(iu iuVar, is isVar) {
        this.b = iuVar;
        this.a = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.remove(this.a.a);
    }
}
