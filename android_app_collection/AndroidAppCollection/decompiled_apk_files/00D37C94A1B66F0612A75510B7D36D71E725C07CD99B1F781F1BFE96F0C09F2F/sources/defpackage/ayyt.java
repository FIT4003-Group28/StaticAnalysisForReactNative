package defpackage;
/* compiled from: PG */
/* renamed from: ayyt  reason: default package */
/* loaded from: classes2.dex */
final class ayyt extends ayyn {
    private static final long serialVersionUID = -5898283885385201806L;
    final int d = 1;

    @Override // defpackage.ayyn
    public final void d() {
        if (this.b > this.d) {
            ayyp ayypVar = (ayyp) ((ayyp) get()).get();
            if (ayypVar != null) {
                this.b--;
                set(ayypVar);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }
    }
}
