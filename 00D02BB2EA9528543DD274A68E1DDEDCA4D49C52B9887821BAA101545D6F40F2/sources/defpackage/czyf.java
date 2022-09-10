package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
/* compiled from: PG */
/* renamed from: czyf  reason: default package */
/* loaded from: classes5.dex */
public final class czyf extends acl {
    final TextView s;
    final MaterialCalendarGridView t;

    public czyf(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.s = textView;
        od.aw(textView, true);
        this.t = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
