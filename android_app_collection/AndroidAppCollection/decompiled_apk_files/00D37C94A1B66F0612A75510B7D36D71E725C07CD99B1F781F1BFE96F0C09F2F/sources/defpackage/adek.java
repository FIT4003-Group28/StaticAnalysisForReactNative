package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adek  reason: default package */
/* loaded from: classes.dex */
public final class adek extends dh {
    public String ae = "";

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, R.style.MdxMusicFullscreenDialogTheme);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_mat_avod_handoff_fragment, viewGroup, false);
        adej adejVar = new adej(this, 1);
        ((ImageView) inflate.findViewById(R.id.mat_avod_handoff_dialog_close_button)).setOnClickListener(adejVar);
        ((TextView) inflate.findViewById(R.id.mat_avod_handoff_stop_casting_button)).setOnClickListener(adejVar);
        ((Button) inflate.findViewById(R.id.mat_avod_handoff_continue_button)).setOnClickListener(new adej(this));
        ((TextView) inflate.findViewById(R.id.mat_avod_dialog_title_device_name)).setText(this.ae);
        return inflate;
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setCancelable(false);
        return oy;
    }
}
