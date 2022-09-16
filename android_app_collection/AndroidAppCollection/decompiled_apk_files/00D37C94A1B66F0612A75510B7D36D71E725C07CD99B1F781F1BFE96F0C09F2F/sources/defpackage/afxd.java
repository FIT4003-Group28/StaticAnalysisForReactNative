package defpackage;
/* compiled from: PG */
/* renamed from: afxd  reason: default package */
/* loaded from: classes.dex */
final class afxd implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ yiw b;
    final /* synthetic */ afxe c;

    public afxd(afxe afxeVar, Object obj, yiw yiwVar) {
        this.c = afxeVar;
        this.a = obj;
        this.b = yiwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.a.a(this.a, this.b);
        } catch (Exception e) {
            zep.l("target requester should catch exception and pass to callback.onError");
            this.b.a(this.a, e);
        }
    }
}
