package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acio  reason: default package */
/* loaded from: classes.dex */
public final class acio extends acjd {
    public acin a;
    private TextView ae;
    private ProgressBar af;
    private Button b;
    private ImageView c;
    private acim d;
    private ImageView e;

    @Override // defpackage.acjd, defpackage.dp
    public final void T(Activity activity) {
        super.T(activity);
        if (!(activity instanceof acin)) {
            String obj = activity.toString();
            String simpleName = acin.class.getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 16 + String.valueOf(simpleName).length());
            sb.append(obj);
            sb.append(" must implement ");
            sb.append(simpleName);
            throw new ClassCastException(sb.toString());
        }
        this.a = (acin) activity;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = mJ().getLayoutInflater().inflate(R.layout.lc_error_state_fragment, viewGroup, false);
        this.d = (acim) this.m.getSerializable("state");
        this.b = (Button) inflate.findViewById(R.id.action_button);
        this.c = (ImageView) inflate.findViewById(R.id.bitmap_view);
        this.e = (ImageView) inflate.findViewById(R.id.error_icon);
        this.ae = (TextView) inflate.findViewById(R.id.error_message_text);
        this.af = (ProgressBar) inflate.findViewById(R.id.spinner);
        this.c.setBackground(rh().getDrawable(R.color.lc_black_20));
        this.b.setOnClickListener(new acil(this));
        acim acimVar = acim.NO_INTERNET;
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            this.b.setVisibility(8);
            this.af.setVisibility(8);
            this.e.setVisibility(0);
            this.e.setImageResource(2131232448);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_no_internet);
        } else if (ordinal == 1) {
            this.b.setVisibility(8);
            this.af.setVisibility(0);
            this.e.setVisibility(8);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_reconnecting);
        } else if (ordinal == 2) {
            this.af.setVisibility(8);
            this.b.setVisibility(0);
            this.b.setText(17039370);
            this.e.setVisibility(0);
            this.e.setImageResource(2131232448);
            this.ae.setVisibility(0);
            this.ae.setText(R.string.lc_error_state_connection_failed);
        } else if (ordinal == 3) {
            this.b.setVisibility(0);
            this.b.setText(17039370);
            this.e.setVisibility(0);
            this.e.setImageResource(2131231795);
            this.af.setVisibility(8);
            this.ae.setVisibility(0);
            this.ae.setText(this.m.getString("message"));
        } else {
            throw new IllegalStateException("Unknown error state");
        }
        return inflate;
    }
}
