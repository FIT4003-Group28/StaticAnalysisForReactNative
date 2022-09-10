package defpackage;
/* compiled from: PG */
/* renamed from: arfa  reason: default package */
/* loaded from: classes2.dex */
final class arfa implements Runnable {
    final /* synthetic */ arfb a;

    public arfa(arfb arfbVar) {
        this.a = arfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        arfb arfbVar = this.a;
        if (arfbVar.aD) {
            arfbVar.g.a().i(dvum.MYMAPS_OPENED, null);
        }
    }
}
