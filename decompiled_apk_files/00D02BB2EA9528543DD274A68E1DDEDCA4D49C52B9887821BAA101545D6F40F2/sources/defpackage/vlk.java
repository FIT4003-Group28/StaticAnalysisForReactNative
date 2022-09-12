package defpackage;
/* compiled from: PG */
/* renamed from: vlk  reason: default package */
/* loaded from: classes7.dex */
final class vlk implements Runnable {
    final /* synthetic */ vlm a;

    public vlk(vlm vlmVar) {
        this.a = vlmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vlm vlmVar = this.a;
        vlmVar.b = false;
        if (!vlmVar.b()) {
            this.a.d(true);
        }
    }
}
