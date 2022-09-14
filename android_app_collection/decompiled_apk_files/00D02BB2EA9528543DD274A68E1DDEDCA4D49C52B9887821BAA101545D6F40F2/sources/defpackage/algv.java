package defpackage;
/* compiled from: PG */
/* renamed from: algv  reason: default package */
/* loaded from: classes2.dex */
public final class algv {
    private final algz a;
    private boolean b;

    public algv(algz algzVar) {
        bvrj.UI_THREAD.c();
        this.a = algzVar;
    }

    public final synchronized void a() {
        bvrj.UI_THREAD.c();
        if (!this.b) {
            this.b = true;
            algz algzVar = this.a;
            bvrj.UI_THREAD.c();
            dcdc r = dcdc.r(algzVar.a);
            int size = r.size();
            for (int i = 0; i < size; i++) {
                ((algy) r.get(i)).a();
            }
            this.b = false;
        } else {
            throw new IllegalStateException("Calling post(MapZoomEvent) in listener is disallowed");
        }
    }
}
