package defpackage;
/* compiled from: PG */
/* renamed from: crfx  reason: default package */
/* loaded from: classes5.dex */
final class crfx implements Runnable {
    final /* synthetic */ crfy a;

    public crfx(crfy crfyVar) {
        this.a = crfyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            crfy crfyVar = this.a;
            crfyVar.j = null;
            crfyVar.k = true;
            crfyVar.l = null;
        }
    }
}
