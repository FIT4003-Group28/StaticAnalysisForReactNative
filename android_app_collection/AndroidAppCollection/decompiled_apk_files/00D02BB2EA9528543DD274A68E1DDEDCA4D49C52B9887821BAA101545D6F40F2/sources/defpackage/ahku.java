package defpackage;
/* compiled from: PG */
/* renamed from: ahku  reason: default package */
/* loaded from: classes.dex */
final class ahku implements Runnable {
    final /* synthetic */ ahkv a;

    public ahku(ahkv ahkvVar) {
        this.a = ahkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahkv ahkvVar = this.a;
        if (ahkvVar.u) {
            ahkvVar.u();
        }
        this.a.w();
        ahsp ahspVar = this.a.j;
        if (ahspVar != null) {
            ahspVar.c();
        }
    }
}
