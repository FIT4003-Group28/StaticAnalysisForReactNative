package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: hyt  reason: default package */
/* loaded from: classes3.dex */
public final class hyt extends hym {
    public hys ae;
    public CoordinatorLayout af;
    public iee ag;
    public gfu ah;
    private int ai = 0;

    public static hyt aG(int i) {
        hyt hytVar = new hyt();
        Bundle bundle = new Bundle();
        bundle.putInt("COMMENT_HEIGHT_KEY", i);
        hytVar.ae(bundle);
        return hytVar;
    }

    public final void aH(ex exVar, CoordinatorLayout coordinatorLayout, String str) {
        coordinatorLayout.getClass();
        this.af = coordinatorLayout;
        exVar.r(this, str);
        exVar.d();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, this.ah.a() == gfs.LIGHT ? 2132083334 : 2132083333);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ai = this.ag.b();
        this.d.setOnShowListener(new DialogInterface.OnShowListener() { // from class: hyr
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                hyt hytVar = hyt.this;
                Bundle bundle2 = hytVar.m;
                if (bundle2 != null) {
                    CoordinatorLayout coordinatorLayout = hytVar.af;
                    if (coordinatorLayout == null || coordinatorLayout.getParent() == null || !((View) hytVar.af.getParent()).isAttachedToWindow()) {
                        hytVar.onDismiss(dialogInterface);
                        return;
                    }
                    BottomSheetBehavior.v((View) hytVar.af.getParent()).D(bundle2.getInt("COMMENT_HEIGHT_KEY"));
                    hytVar.af.getParent().requestLayout();
                }
            }
        });
        return this.af;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CoordinatorLayout coordinatorLayout = this.af;
        if (coordinatorLayout != null && coordinatorLayout.getParent() != null) {
            ((ViewGroup) this.af.getParent()).removeView(this.af);
            this.af = null;
        }
        this.ag.c(this.ai);
        this.ai = 0;
        hys hysVar = this.ae;
        if (hysVar != null) {
            hzd hzdVar = (hzd) hysVar;
            hzdVar.c();
            InteractionLoggingScreen interactionLoggingScreen = hzdVar.g;
            if (interactionLoggingScreen != null) {
                hzdVar.d.B(interactionLoggingScreen);
            }
        }
        super.onDismiss(dialogInterface);
    }
}
