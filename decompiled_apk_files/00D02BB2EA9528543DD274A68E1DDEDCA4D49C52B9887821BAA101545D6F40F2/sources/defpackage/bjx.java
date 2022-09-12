package defpackage;
/* compiled from: PG */
/* renamed from: bjx  reason: default package */
/* loaded from: classes3.dex */
final class bjx implements Runnable {
    final /* synthetic */ bjz a;

    public bjx(bjz bjzVar) {
        this.a = bjzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b == null) {
            return;
        }
        bjw<T> bjwVar = this.a.b;
        V v = bjwVar.a;
        if (v != 0) {
            this.a.b(v);
        } else {
            this.a.c(bjwVar.b);
        }
    }
}
