package defpackage;

import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
/* compiled from: PG */
/* renamed from: lqe  reason: default package */
/* loaded from: classes3.dex */
final class lqe implements bpn {
    final /* synthetic */ lqh a;

    public lqe(lqh lqhVar) {
        this.a = lqhVar;
    }

    @Override // defpackage.bpn
    public final void a(int i) {
        for (fsu fsuVar : this.a.d) {
            fsuVar.oB(i);
        }
    }

    @Override // defpackage.bpn
    public final void b(int i, float f, int i2) {
        ((DefaultTabsBar) this.a.a.get()).o(i, f, true);
        for (fsu fsuVar : this.a.d) {
            fsuVar.e(f);
        }
    }

    @Override // defpackage.bpn
    public final void c(int i) {
        this.a.l(i, false);
    }
}
