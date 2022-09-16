package defpackage;
/* compiled from: PG */
/* renamed from: vod  reason: default package */
/* loaded from: classes4.dex */
final class vod {
    final /* synthetic */ vok a;

    public vod(vok vokVar) {
        this.a = vokVar;
    }

    public final void a() {
        vok vokVar;
        synchronized (this.a.i) {
            int i = this.a.l;
            aqxo.A(i > 0, "Refcount went negative!", i);
            vokVar.l--;
            this.a.c();
        }
    }
}
