package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvxb  reason: default package */
/* loaded from: classes5.dex */
public final class cvxb extends cvxa {
    final /* synthetic */ cvxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxb(cvxe cvxeVar) {
        super(cvxeVar);
        this.b = cvxeVar;
    }

    @Override // defpackage.cvxa
    public final void a() {
        this.b.f.setVisibility(8);
        this.b.g.setVisibility(0);
        cvxe.g(this.b.c);
        cvxe.f(this.b.e);
        this.b.d(1, 8388613, 8388611);
        this.b.e(new int[][]{new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_tos_button, R.id.og_separator2, R.id.og_custom_button}});
        cvxe cvxeVar = this.b;
        cvxe.h(cvxeVar.g, cvxeVar.i);
    }

    @Override // defpackage.cvxa
    public final void b(int i) {
        c(this.b.c, i);
    }
}
