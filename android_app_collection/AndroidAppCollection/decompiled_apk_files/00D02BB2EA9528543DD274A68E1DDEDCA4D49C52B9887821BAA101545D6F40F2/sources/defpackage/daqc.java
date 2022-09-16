package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.acl;
/* compiled from: PG */
/* renamed from: daqc  reason: default package */
/* loaded from: classes5.dex */
public final class daqc<CVH extends acl> extends abg<acl> {
    public View a;
    private final abg<CVH> e;
    private final abi f;

    public daqc(abg<CVH> abgVar) {
        daqb daqbVar = new daqb(this);
        this.f = daqbVar;
        this.e = abgVar;
        abgVar.o(daqbVar);
        j(abgVar.c);
    }

    @Override // defpackage.abg
    public final int c() {
        int c = this.e.c();
        return this.a != null ? c + 1 : c;
    }

    @Override // defpackage.abg
    public final acl d(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new daqd(frameLayout);
        }
        return this.e.d(viewGroup, i);
    }

    @Override // defpackage.abg
    public final void e(acl aclVar, int i) {
        View view = this.a;
        if (view != null) {
            i--;
        }
        if (!(aclVar instanceof daqd)) {
            this.e.e(aclVar, i);
        } else if (view == null) {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) this.a.getParent()).removeView(this.a);
            }
            ((FrameLayout) aclVar.a).addView(this.a);
        }
    }

    @Override // defpackage.abg
    public final int i(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.e.i(i);
    }

    @Override // defpackage.abg
    public final long k(int i) {
        if (this.a != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.e.k(i);
    }
}
