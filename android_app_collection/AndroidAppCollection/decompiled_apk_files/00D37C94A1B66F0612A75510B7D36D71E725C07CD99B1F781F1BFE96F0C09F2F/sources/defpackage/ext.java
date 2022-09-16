package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ext  reason: default package */
/* loaded from: classes3.dex */
public final class ext extends exq {
    public int ae;
    public int af;
    public ProgressBarDialogFragmentController ag;
    private double ah;
    private double ai;

    public final void aG() {
        if (!ap()) {
            return;
        }
        Point point = new Point();
        ((WindowManager) mJ().getSystemService("window")).getDefaultDisplay().getSize(point);
        Window window = this.d.getWindow();
        window.setGravity(8388691);
        WindowManager.LayoutParams attributes = window.getAttributes();
        double d = point.y;
        double d2 = this.ah;
        Double.isNaN(d);
        attributes.y = ((int) (d * d2)) - (this.af / 2);
        double d3 = point.x;
        double d4 = this.ai;
        Double.isNaN(d3);
        attributes.x = ((int) (d3 * d4)) - (this.ae / 2);
        window.setAttributes(attributes);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        this.ah = bundle2.getDouble("progressbar_height", 0.5d);
        this.ai = bundle2.getDouble("progressbar_width", 0.5d);
        mN(1, 0);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.loader_dialog, viewGroup, false);
        inflate.post(new exr(this, inflate));
        return inflate;
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aG();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ProgressBarDialogFragmentController progressBarDialogFragmentController = this.ag;
        if (progressBarDialogFragmentController != null) {
            progressBarDialogFragmentController.m();
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setCanceledOnTouchOutside(false);
        oy.getWindow().requestFeature(1);
        oy.getWindow().setBackgroundDrawableResource(17170445);
        oy.setOnKeyListener(new exs(this));
        return oy;
    }
}
