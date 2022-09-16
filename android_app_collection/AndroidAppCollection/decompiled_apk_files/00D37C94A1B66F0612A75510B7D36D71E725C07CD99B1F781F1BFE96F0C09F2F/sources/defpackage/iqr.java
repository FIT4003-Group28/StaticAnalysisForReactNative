package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iqr  reason: default package */
/* loaded from: classes3.dex */
public final class iqr extends ipf implements AdapterView.OnItemClickListener {
    private ajsm ae;

    static {
        zep.a("MDX.RemoteWatchBottomSheet");
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        this.ae = new ajsm();
        return new akaz(mJ(), this.ae);
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    @Override // defpackage.vew, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mc = super.mc(layoutInflater, viewGroup, bundle);
        if (mc instanceof ViewGroup) {
            View inflate = layoutInflater.inflate(R.layout.bottom_sheet_cancel_footer, (ViewGroup) mc);
            inflate.findViewById(R.id.bottom_sheet_footer_root).setOnClickListener(new View.OnClickListener() { // from class: iqq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    iqr.this.dismiss();
                }
            });
            ((TextView) inflate.findViewById(R.id.list_item_text)).setText(R.string.bottomsheet_cancel);
            Drawable drawable = rb().getDrawable(2131232439);
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
            drawable.setTint(zhn.d(mJ(), R.attr.ytIconActiveOther));
            ((ImageView) inflate.findViewById(R.id.list_item_icon_primary)).setImageDrawable(drawable);
        }
        return mc;
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dismiss();
    }
}
