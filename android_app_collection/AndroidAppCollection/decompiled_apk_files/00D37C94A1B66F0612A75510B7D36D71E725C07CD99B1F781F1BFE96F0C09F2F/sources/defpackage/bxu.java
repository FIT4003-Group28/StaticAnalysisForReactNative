package defpackage;
/* compiled from: PG */
/* renamed from: bxu  reason: default package */
/* loaded from: classes2.dex */
final class bxu implements Runnable {
    final /* synthetic */ bxw a;

    public bxu(bxw bxwVar) {
        this.a = bxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b == null) {
            return;
        }
        bxt bxtVar = this.a.b;
        Object obj = bxtVar.a;
        if (obj != null) {
            this.a.b(obj);
        } else {
            this.a.a(bxtVar.b);
        }
    }
}
