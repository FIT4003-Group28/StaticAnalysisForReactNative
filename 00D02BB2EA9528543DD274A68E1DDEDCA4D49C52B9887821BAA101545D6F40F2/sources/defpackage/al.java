package defpackage;
/* compiled from: PG */
/* renamed from: al  reason: default package */
/* loaded from: classes2.dex */
public final class al implements aa {
    boolean a = true;
    final /* synthetic */ x b;

    public al(x xVar) {
        this.b = xVar;
    }

    @Override // defpackage.aa
    public final void m(Object obj) {
        T h = this.b.h();
        if (this.a || ((h == 0 && obj != null) || (h != 0 && !h.equals(obj)))) {
            this.a = false;
            this.b.g(obj);
        }
    }
}
