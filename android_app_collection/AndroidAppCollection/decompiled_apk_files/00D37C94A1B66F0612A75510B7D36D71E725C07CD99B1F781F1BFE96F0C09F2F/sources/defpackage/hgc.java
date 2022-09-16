package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hgc  reason: default package */
/* loaded from: classes3.dex */
public final class hgc extends ow {
    public View af;
    public hgz ah;
    private FrameLayout ai;
    private boolean aj;
    public boolean ae = false;
    public boolean ag = true;

    private final void aF() {
        dt mJ = mJ();
        if (mJ != null) {
            mJ.getWindow().clearFlags(128);
        }
    }

    private final void aG() {
        dt mJ = mJ();
        if (mJ != null) {
            mJ.getWindow().addFlags(128);
        }
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        hgz hgzVar = this.ah;
        if (hgzVar != null) {
            hgzVar.a.n();
        }
        aF();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        hgz hgzVar = this.ah;
        if (hgzVar != null) {
            hgzVar.a.o();
        }
        aG();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aE() {
        this.ai.removeAllViews();
        if (this.af.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.af.getParent()).removeView(this.af);
        }
        if (this.af.getParent() == null) {
            this.ai.addView(this.af);
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            this.aj = bundle2.getBoolean("OverlayDialogFragment.enableMusicToSoundRename", false);
        }
        mN(1, 16974383);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.overlay_dialog_fragment_container, viewGroup, false);
        this.ai = (FrameLayout) inflate.findViewById(R.id.overlay_dialog_fragment_contents);
        View findViewById = inflate.findViewById(R.id.overlay_dialog_fragment_delete_button);
        if (this.aj) {
            findViewById.setContentDescription(N(R.string.delete_sound_option));
        }
        if (this.ag) {
            findViewById.setOnClickListener(new hgb(this, 1));
        } else {
            findViewById.setVisibility(8);
        }
        inflate.findViewById(R.id.overlay_dialog_fragment_done).setOnClickListener(new hgb(this));
        this.ae = true;
        if (this.af != null) {
            aE();
        }
        aG();
        return inflate;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        hgz hgzVar = this.ah;
        if (hgzVar != null) {
            hgzVar.a.m();
        }
        aF();
    }

    @Override // defpackage.ow, defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        Window window = oy.getWindow();
        Context rb = rb();
        if (window != null && rb != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ake.d(rb, R.color.yt_black_pure_opacity60));
            window.setBackgroundDrawable(gradientDrawable);
        }
        hgz hgzVar = this.ah;
        if (hgzVar != null) {
            hgzVar.a.q();
        }
        return oy;
    }
}
