package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cvxd  reason: default package */
/* loaded from: classes5.dex */
public final class cvxd extends cvxa {
    final /* synthetic */ cvxe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxd(cvxe cvxeVar) {
        super(cvxeVar);
        this.b = cvxeVar;
    }

    @Override // defpackage.cvxa
    public final void a() {
        this.b.f.setVisibility(0);
        cvxe.g(this.b.c);
        cvxe.g(this.b.d);
        this.b.d(1, 1, 1);
        if (this.b.e.getVisibility() == 0) {
            cvxe.g(this.b.e);
            this.b.g.setVisibility(0);
        }
        this.b.e(new int[][]{new int[]{R.id.og_privacy_policy_button}, new int[]{R.id.og_separator1}, new int[]{R.id.og_tos_button}, new int[]{R.id.og_separator2}, new int[]{R.id.og_custom_button}});
    }
}
