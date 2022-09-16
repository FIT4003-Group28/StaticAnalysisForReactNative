package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector;
/* compiled from: PG */
/* renamed from: ahsr  reason: default package */
/* loaded from: classes.dex */
public final class ahsr extends ahsc {
    public static final String ae = "ahsr";
    public yve af;
    public ahst ag;
    private TextView ah;

    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        view.setVisibility(0);
        view.findViewById(R.id.vr_speed_bump_icon).setVisibility(8);
        ((TextView) view.findViewById(R.id.vr_speed_bump_title)).setText(R.string.vr_watch_in_vr_title);
        this.ah = (TextView) view.findViewById(R.id.vr_speed_bump_message);
        Button button = (Button) view.findViewById(R.id.vr_speed_bump_dismiss_button);
        button.setText(R.string.vr_select_viewers_label);
        button.setOnClickListener(new ahsq(this, 1));
        Button button2 = (Button) view.findViewById(R.id.vr_speed_bump_action_button);
        button2.setText(R.string.vr_welcome_continue);
        button2.setOnClickListener(new ahsq(this));
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        return null;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return null;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    @Override // defpackage.akas, defpackage.vew, defpackage.dh, defpackage.dp
    public final void mS() {
        Spanned fromHtml;
        super.mS();
        HeadsetSelector.HeadsetInfo a = ahsp.a(rb(), this.af);
        String displayName = a != null ? a.getDisplayName() : "";
        if (Build.VERSION.SDK_INT <= 23) {
            fromHtml = Html.fromHtml(O(R.string.vr_watch_in_vr_message, displayName));
        } else {
            fromHtml = Html.fromHtml(O(R.string.vr_watch_in_vr_message, displayName), 63);
        }
        this.ah.setText(fromHtml);
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vr_speed_bump, viewGroup, false);
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 2;
    }
}
