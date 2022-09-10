package defpackage;
/* compiled from: PG */
/* renamed from: ypc  reason: default package */
/* loaded from: classes7.dex */
final class ypc implements Runnable {
    final /* synthetic */ yph a;

    public ypc(yph yphVar) {
        this.a = yphVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dbsk.a(!this.a.g);
        yph yphVar = this.a;
        yphVar.g = true;
        cqkx.p(yphVar);
        this.a.g = false;
    }
}
