package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aal  reason: default package */
/* loaded from: classes.dex */
final class aal extends lp {
    final /* synthetic */ int a;
    final /* synthetic */ aam b;
    private boolean c = false;

    public aal(aam aamVar, int i) {
        this.b = aamVar;
        this.a = i;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void a(View view) {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }

    @Override // defpackage.lp, defpackage.lo
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void c() {
        this.b.a.setVisibility(0);
    }
}
