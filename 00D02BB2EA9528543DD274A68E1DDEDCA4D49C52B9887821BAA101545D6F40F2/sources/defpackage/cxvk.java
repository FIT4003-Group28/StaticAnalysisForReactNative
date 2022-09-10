package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
/* compiled from: PG */
/* renamed from: cxvk  reason: default package */
/* loaded from: classes5.dex */
public final class cxvk {
    public final Context a;
    public final View b;
    public final cxpr c;
    public final TextView d;
    public final TextView e;
    public final cxqo f;
    public final PeopleKitVisualElementPath g;
    public final cxse h;
    public cxsq i = cxsq.b();
    private final TextView j;

    public cxvk(Context context, ViewGroup viewGroup, cxqo cxqoVar, cxse cxseVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.a = context;
        this.f = cxqoVar;
        this.h = cxseVar;
        this.g = peopleKitVisualElementPath;
        View inflate = LayoutInflater.from(context).inflate(R.layout.flattened_peoplekit_row_view, viewGroup, false);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_name);
        this.e = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_method);
        this.j = (TextView) inflate.findViewById(R.id.peoplekit_listview_status_text);
        cxpr cxprVar = new cxpr(context, cxqoVar, peopleKitVisualElementPath);
        this.c = cxprVar;
        cxprVar.c = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_icon_offset);
        ((RelativeLayout) inflate.findViewById(R.id.peoplekit_listview_row_avatar)).addView(cxprVar.a);
        a();
    }

    public final void a() {
        this.b.setBackgroundColor(akm.c(this.a, this.i.a));
        this.b.findViewById(R.id.peoplekit_listview_flattened_row).setBackgroundColor(akm.c(this.a, this.i.a));
        View findViewById = this.b.findViewById(R.id.peoplekit_listview_flattened_permissions_row);
        findViewById.setBackgroundColor(akm.c(this.a, this.i.a));
        ((TextView) findViewById.findViewById(R.id.peoplekit_listview_flattened_permissions_text)).setTextColor(akm.c(this.a, this.i.e));
        this.d.setTextColor(akm.c(this.a, this.i.e));
        this.e.setTextColor(akm.c(this.a, this.i.f));
        this.j.setTextColor(akm.c(this.a, this.i.e));
        View findViewById2 = this.b.findViewById(R.id.peoplekit_listview_no_contacts_row);
        findViewById2.setBackgroundColor(akm.c(this.a, this.i.a));
        ((TextView) findViewById2.findViewById(R.id.peoplekit_listview_no_contacts_text)).setTextColor(akm.c(this.a, this.i.e));
        View findViewById3 = this.b.findViewById(R.id.peoplekit_listview_no_results_fullscreen);
        findViewById3.setBackgroundColor(akm.c(this.a, this.i.a));
        ((TextView) findViewById3.findViewById(R.id.no_results_header)).setTextColor(akm.c(this.a, this.i.e));
        ((TextView) findViewById3.findViewById(R.id.no_results_body)).setTextColor(akm.c(this.a, this.i.e));
    }

    public final void b(String str, String str2, AutocompleteMatchInfo autocompleteMatchInfo, AutocompleteMatchInfo autocompleteMatchInfo2) {
        if (TextUtils.isEmpty(str)) {
            this.d.setText(str2);
            this.e.setVisibility(8);
            return;
        }
        if (this.e.getVisibility() == 8) {
            this.e.setVisibility(0);
        }
        if (autocompleteMatchInfo == null || str == null || autocompleteMatchInfo.a + autocompleteMatchInfo.b > str.length()) {
            this.d.setText(str);
        } else {
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(str);
            StyleSpan styleSpan = new StyleSpan(1);
            int i = autocompleteMatchInfo.a;
            newSpannable.setSpan(styleSpan, i, autocompleteMatchInfo.b + i, 33);
            this.d.setText(newSpannable);
        }
        if (autocompleteMatchInfo2 != null) {
            Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(str2);
            StyleSpan styleSpan2 = new StyleSpan(1);
            int i2 = autocompleteMatchInfo2.a;
            newSpannable2.setSpan(styleSpan2, i2, autocompleteMatchInfo2.b + i2, 33);
            this.e.setText(newSpannable2);
            return;
        }
        this.e.setText(str2);
    }

    public final void c(boolean z) {
        if (z) {
            this.c.a.setAlpha(0.38f);
            this.d.setTextColor(akm.c(this.a, this.i.f));
            this.j.setTextColor(akm.c(this.a, this.i.f));
            return;
        }
        this.c.a.setAlpha(1.0f);
        this.d.setTextColor(akm.c(this.a, this.i.e));
        this.j.setTextColor(akm.c(this.a, this.i.e));
    }

    public final void d(String str) {
        this.j.setText(str);
        this.j.setVisibility(true != TextUtils.isEmpty(str) ? 0 : 8);
    }

    public final void e(String str) {
        this.j.setContentDescription(str);
    }
}
