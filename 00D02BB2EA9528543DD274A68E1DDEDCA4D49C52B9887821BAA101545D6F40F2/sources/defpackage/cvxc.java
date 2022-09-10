package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvxc  reason: default package */
/* loaded from: classes5.dex */
public final class cvxc extends cvxa {
    final /* synthetic */ cvxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxc(cvxe cvxeVar) {
        super(cvxeVar);
        this.b = cvxeVar;
    }

    @Override // defpackage.cvxa
    public final void a() {
        this.b.f.setVisibility(0);
        this.b.g.setVisibility(8);
        cvxe.f(this.b.c);
        cvxe.g(this.b.e);
        this.b.d(8388613, 8388611, 1);
        this.b.e(new int[][]{new int[]{R.id.og_privacy_policy_button, R.id.og_separator1, R.id.og_tos_button}, new int[]{R.id.og_custom_button}});
        cvxe cvxeVar = this.b;
        cvxe.h(cvxeVar.f, cvxeVar.i);
    }

    @Override // defpackage.cvxa
    public final void b(int i) {
        c(this.b.e, i);
    }
}
