package defpackage;
/* compiled from: PG */
/* renamed from: akob  reason: default package */
/* loaded from: classes2.dex */
public final class akob implements Runnable {
    private final bvrb a;
    private final dbty<Runnable> b;
    @dzsi
    private bvpk c;

    public akob(bvrb bvrbVar, dbty<Runnable> dbtyVar) {
        this.a = bvrbVar;
        this.b = dbtyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvpk bvpkVar = this.c;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a = bvpk.a(((akmb) this.b).a());
        this.c = a;
        this.a.a(a, bvrj.UI_THREAD, 300L);
    }
}
