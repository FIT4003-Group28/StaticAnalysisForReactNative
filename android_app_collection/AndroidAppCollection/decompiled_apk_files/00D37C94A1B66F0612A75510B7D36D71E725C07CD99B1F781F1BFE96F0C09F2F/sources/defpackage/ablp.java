package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ablp  reason: default package */
/* loaded from: classes.dex */
public final class ablp extends abld implements abkr {
    public abks ae;
    public abkj af;
    private Activity ag;
    private int ah;

    private final void aH(int i) {
        Window window;
        Dialog dialog = this.d;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i);
    }

    private final void aI() {
        Window window = this.d.getWindow();
        if (window != null) {
            window.setLayout(this.ae.a, -2);
            window.setGravity(this.ae.b);
        }
    }

    @Override // defpackage.abld, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        this.ag = activity;
    }

    public final void aG(Bundle bundle) {
        eo mL = mL();
        if (bundle.get("picker_panel") != null) {
            if (mL.f("purchase_menu_fragment") != null) {
                return;
            }
            ex l = mL.l();
            ablu abluVar = new ablu();
            abluVar.ae(bundle);
            l.u(R.id.content_container, abluVar, "purchase_menu_fragment");
            l.a();
            mL.ab();
        } else if (bundle.get("navigation_endpoint") == null || mL.f("purchase_flow_fragment") != null) {
        } else {
            ex l2 = mL.l();
            ablt abltVar = new ablt();
            abltVar.ae(bundle);
            l2.u(R.id.content_container, abltVar, "purchase_flow_fragment");
            if (mL.f("purchase_menu_fragment") != null) {
                l2.s();
            }
            l2.a();
            mL.ab();
        }
    }

    @Override // defpackage.abkr
    public final void d() {
        aI();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        WindowManager.LayoutParams attributes;
        super.mS();
        aI();
        this.ae.a(this);
        Window window = this.ag.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            this.ah = attributes.softInputMode;
        }
        aH(32);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.live_chat_purchase_dialog, viewGroup);
        inflate.setOnClickListener(new ablo(this));
        aG(this.m);
        return inflate;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        this.ae.b(this);
        this.af.d();
        aH(this.ah);
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.requestWindowFeature(1);
        if (oy.getWindow() != null) {
            oy.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        return oy;
    }
}
