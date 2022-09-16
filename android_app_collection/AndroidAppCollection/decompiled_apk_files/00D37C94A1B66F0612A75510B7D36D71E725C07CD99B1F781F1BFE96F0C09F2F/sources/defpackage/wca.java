package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
/* compiled from: PG */
/* renamed from: wca  reason: default package */
/* loaded from: classes4.dex */
public final class wca extends wbe {
    public wbw af;
    public wcv ag;
    public wbo ah;
    public wbv ai;
    public wcf aj;
    public wdc ak;
    public acth al;
    private FrameLayout am;
    private ajsa an;
    private boolean ao = true;
    private boolean ap;

    public final void aE(Object obj) {
        ampq i = akel.i(this.an, obj, this.am);
        if (!i.h()) {
            return;
        }
        ajru ajruVar = (ajru) i.c();
        ajrs e = akel.e(ajruVar.a());
        e.a(this.al.oi());
        ajruVar.oK(e, obj);
        this.am.addView(ajruVar.a());
    }

    @Override // defpackage.wbj, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        ajqw ajqwVar = new ajqw();
        ajqwVar.f(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, new wbz(this, 1));
        ajqwVar.f(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, new wbz(this));
        ajqwVar.f(aqyo.class, new wbz(this, 2));
        ajqwVar.f(wcx.class, new wbz(this, 3));
        this.an = ajqwVar;
    }

    @Override // defpackage.wbj, defpackage.dp
    public final void mR() {
        Dialog dialog;
        if (this.ap && (dialog = this.d) != null) {
            dialog.setOnDismissListener(null);
            this.ap = false;
        }
        super.mR();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = this.am;
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(mJ());
            this.am = frameLayout2;
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else if (frameLayout.getParent() != null) {
            ((ViewGroup) this.am.getParent()).removeView(this.am);
        }
        return this.am;
    }

    @Override // defpackage.wbj, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.ao) {
            this.af.j(5);
        }
        this.ak.c();
    }

    @Override // defpackage.wbj, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        this.ap = true;
    }

    public final void r() {
        this.ao = false;
        o();
    }

    public final void s() {
        if (this.am.getChildCount() > 0) {
            View childAt = this.am.getChildAt(0);
            this.am.removeAllViews();
            this.an.b(childAt);
        }
    }
}
