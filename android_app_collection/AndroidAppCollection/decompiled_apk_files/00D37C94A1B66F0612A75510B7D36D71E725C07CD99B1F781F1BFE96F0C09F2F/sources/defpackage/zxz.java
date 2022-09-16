package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zxz  reason: default package */
/* loaded from: classes4.dex */
public class zxz extends aljp {
    private String aC;
    public View ae;
    public View af;
    public YouTubeTextView ag;
    View ah;
    public FrameLayout ai;
    public zxy ak;
    public Context al;
    public CharSequence am;
    public View an;
    public View ao;
    public Boolean ap;
    public boolean aq;
    aljg av;
    private FrameLayout aw;
    public boolean aj = false;
    private boolean ax = true;
    private boolean ay = false;
    private boolean az = true;
    private boolean aA = false;
    private boolean aB = false;
    public float ar = 0.0f;
    public float as = 0.0f;
    public int at = 0;
    int au = 0;
    private boolean aD = true;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        View view = this.O;
        if (view == null || view.getParent() == null) {
            return;
        }
        View view2 = (View) this.O.getParent();
        view2.setBackgroundResource(17170445);
        view2.setFitsSystemWindows(false);
        view2.setOnApplyWindowInsetsListener(zxt.a);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        Dialog dialog = this.d;
        if (dialog != null && dialog.getWindow() != null) {
            this.d.getWindow().setWindowAnimations(2132083370);
        }
        zxy zxyVar = this.ak;
        if (zxyVar != null) {
            zxyVar.k();
        }
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        zxy zxyVar = this.ak;
        if (zxyVar != null) {
            zxyVar.l();
        }
    }

    public final void aE() {
        this.ai.removeAllViews();
        View view = this.an;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.an.getParent()).removeView(this.an);
        }
        View view2 = this.an;
        if (view2 == null || view2.getParent() != null) {
            return;
        }
        this.ai.addView(this.an);
    }

    public final void aF(boolean z) {
        this.af.setVisibility(true != z ? 8 : 0);
    }

    protected void aG() {
        mN(0, 2132083369);
    }

    public final void aH() {
        this.ag.setText(this.am);
    }

    public final void aI() {
        this.aw.removeAllViews();
        if (this.ao.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.ao.getParent()).removeView(this.ao);
        }
        if (this.ao.getParent() == null) {
            this.aw.addView(this.ao);
        }
    }

    public final boolean aJ() {
        if (mJ() != null && !mJ().isDestroyed() && !mJ().isFinishing() && !this.H && !this.s && ap()) {
            if (ar()) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 24 && mJ().isInMultiWindowMode()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        aG();
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.ax = bundle2.getBoolean("ReelsBottomSheetDialogRoundCorners", true);
            this.aC = this.m.getString("ReelsBottomSheetDialogTextureCloseButtonKey", null);
            this.az = this.m.getBoolean("ReelsBottomSheetDialogDimBackgroundKey", true);
            this.aA = this.m.getBoolean("ReelsBottomSheetDialoginitExpandedKey", false);
            this.aB = this.m.getBoolean("ReelsBottomSheetDialogDropShadowKey", false);
            this.ar = this.m.getFloat("ReelsBottomSheetDialogMinHeightKey", 0.0f);
            this.as = this.m.getFloat("ReelsBottomSheetDialogMaxDefaultHeightKey", 0.0f);
            this.aD = this.m.getBoolean("ReelsBottomSheetDialogDraggableKey", true);
            this.ay = this.m.getBoolean("ReelsBottomSheetDialogTopViewKey", false);
        }
        this.at = mJ().getResources().getDimensionPixelSize(R.dimen.reels_bottom_sheet_header_drop_shadow_elevation);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.ae = layoutInflater.inflate(true != this.ax ? R.layout.bottom_sheet_modal_container_square_corners : R.layout.bottom_sheet_modal_container_round_corners, viewGroup, false);
        if (this.ay) {
            view = layoutInflater.inflate(R.layout.bottom_sheet_with_top_view, viewGroup, false);
            this.aw = (FrameLayout) view.findViewById(R.id.top_view_container);
            ((RelativeLayout) view.findViewById(R.id.modal_view_container)).addView(this.ae);
        } else {
            view = null;
        }
        this.ag = (YouTubeTextView) this.ae.findViewById(R.id.bottom_sheet_title);
        this.ai = (FrameLayout) this.ae.findViewById(R.id.bottom_sheet_contents);
        this.af = this.ae.findViewById(R.id.header_container);
        Display defaultDisplay = ((WindowManager) rb().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.au = point.y;
        if (this.aC == null) {
            this.ah = this.ae.findViewById(R.id.bottom_sheet_close_button);
        } else {
            View findViewById = this.ae.findViewById(R.id.bottom_sheet_done_text);
            this.ah = findViewById;
            ((Button) findViewById).setText(this.aC);
        }
        this.ah.setVisibility(0);
        this.ah.setOnClickListener(new View.OnClickListener() { // from class: zxu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zxz zxzVar = zxz.this;
                zxy zxyVar = zxzVar.ak;
                if (zxyVar != null) {
                    zxyVar.A();
                }
                if (zxzVar.aJ()) {
                    zxzVar.dismiss();
                } else {
                    zep.l("Invalid fragment state while attempting to dismiss (close button clicked)");
                }
            }
        });
        this.aj = true;
        if (this.am != null) {
            aH();
        }
        if (this.an != null) {
            aE();
        }
        Boolean bool = this.ap;
        if (bool != null) {
            aF(bool.booleanValue());
        }
        if (this.aA) {
            View view2 = this.ae;
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new zxx(this, view2));
        }
        if (this.ao != null) {
            aI();
        }
        return this.ay ? view : this.ae;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        zxy zxyVar = this.ak;
        if (zxyVar != null) {
            zxyVar.f();
        }
        if (this.av != null) {
            aljo aljoVar = (aljo) this.d;
            if (aljoVar.a() == null) {
                return;
            }
            aljoVar.a().y(this.av);
        }
    }

    @Override // defpackage.aljp, defpackage.ow, defpackage.dh
    public Dialog oy(Bundle bundle) {
        Context context = this.al;
        if (context == null) {
            context = rb();
        }
        zxv zxvVar = new zxv(this, context, this.b);
        if (!this.az) {
            zxvVar.getWindow().clearFlags(2);
        }
        if (this.aA) {
            zxvVar.a().E(3);
        }
        zxvVar.a().s = this.aD;
        if (this.aB) {
            this.av = new zxw(this);
            zxvVar.a().w(this.av);
        }
        zxvVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: zxs
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                zxz zxzVar = zxz.this;
                if (zxzVar.ai.getChildCount() == 0 && zxzVar.ag.getText().length() == 0) {
                    if (zxzVar.aJ()) {
                        zxzVar.dismiss();
                        return;
                    } else {
                        zep.l("Invalid fragment state while attempting to dismiss (empty contents)");
                        return;
                    }
                }
                zxy zxyVar = zxzVar.ak;
                if (zxyVar == null) {
                    return;
                }
                zxyVar.g();
            }
        });
        return zxvVar;
    }
}
