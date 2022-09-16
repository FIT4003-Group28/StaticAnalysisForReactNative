package defpackage;
/* compiled from: PG */
/* renamed from: nci  reason: default package */
/* loaded from: classes3.dex */
final class nci implements Runnable {
    public boolean a;
    private final yni b;
    private final Object c;

    public nci(yni yniVar, Object obj) {
        yniVar.getClass();
        this.b = yniVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            this.b.d(aabk.a(this.c));
        }
    }
}
