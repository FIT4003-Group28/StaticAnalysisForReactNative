package defpackage;
/* compiled from: PG */
/* renamed from: ckve  reason: default package */
/* loaded from: classes4.dex */
final class ckve implements Runnable {
    final /* synthetic */ ckvk a;

    public ckve(ckvk ckvkVar) {
        this.a = ckvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ckvk ckvkVar = this.a;
        if (!ckvkVar.p) {
            return;
        }
        ckvkVar.p = false;
        ckvkVar.q = true;
    }
}
