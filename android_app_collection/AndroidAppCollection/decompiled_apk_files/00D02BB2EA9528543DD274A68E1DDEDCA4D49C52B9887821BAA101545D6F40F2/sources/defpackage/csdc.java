package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csdc  reason: default package */
/* loaded from: classes5.dex */
public final class csdc implements Runnable {
    final /* synthetic */ csdd a;

    public csdc(csdd csddVar) {
        this.a = csddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        ((aumj) this.a.a).b.finish();
    }
}
