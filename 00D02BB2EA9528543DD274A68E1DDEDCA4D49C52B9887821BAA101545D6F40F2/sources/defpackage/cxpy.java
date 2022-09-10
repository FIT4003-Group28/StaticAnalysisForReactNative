package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxpy  reason: default package */
/* loaded from: classes5.dex */
public final class cxpy implements View.OnClickListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ Channel b;
    final /* synthetic */ Drawable c;
    final /* synthetic */ cxqh d;

    public cxpy(cxqh cxqhVar, Drawable drawable, Channel channel, Drawable drawable2) {
        this.d = cxqhVar;
        this.a = drawable;
        this.b = channel;
        this.c = drawable2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View inflate;
        String b;
        int i;
        ChannelChip channelChip = this.d.b;
        if (!channelChip.b) {
            channelChip.setChipSelected(true);
            cxqh cxqhVar = this.d;
            cxqhVar.c(cxqhVar.b, this.a);
            cxqh cxqhVar2 = this.d;
            Channel channel = this.b;
            LinearLayout linearLayout = new LinearLayout(cxqhVar2.c);
            if (cxqhVar2.e.o()) {
                inflate = LayoutInflater.from(cxqhVar2.c).inflate(R.layout.peoplekit_chip_multiple_alternative_popup, linearLayout);
            } else {
                inflate = LayoutInflater.from(cxqhVar2.c).inflate(R.layout.peoplekit_chip_single_alternative_popup, linearLayout);
            }
            cxpr cxprVar = new cxpr(cxqhVar2.c, cxqhVar2.g, cxqhVar2.f);
            ((RelativeLayout) inflate.findViewById(R.id.peoplekit_autocomplete_popup_avatar)).addView(cxprVar.a);
            cxprVar.b(channel);
            TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_autocomplete_popup_contact_name);
            textView.setText(cxqhVar2.m);
            textView.setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.e));
            inflate.findViewById(R.id.peoplekit_chip_popup_menu_divider).setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.l));
            boolean o = cxqhVar2.e.o();
            int i2 = R.id.peoplekit_autocomplete_popup_contact_method;
            if (!o) {
                TextView textView2 = (TextView) inflate.findViewById(R.id.peoplekit_autocomplete_popup_contact_method);
                if (TextUtils.equals(channel.i(cxqhVar2.c), channel.b(cxqhVar2.c))) {
                    textView.setText(channel.b(cxqhVar2.c));
                    textView.setPadding(0, cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding), 0, 0);
                    textView2.setVisibility(8);
                } else {
                    if (cxqhVar2.l) {
                        b = cxrc.l(channel, cxqhVar2.c);
                    } else {
                        b = channel.b(cxqhVar2.c);
                    }
                    textView2.setText(b);
                    textView2.setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.f));
                }
                cxqhVar2.d.f(channel);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.peoplekit_autocomplete_popup_methods);
                CoalescedChannels b2 = cxqhVar2.b.b();
                int i3 = R.layout.peoplekit_chip_popup_contact_method;
                if (b2 != null) {
                    List<Channel> b3 = cxqhVar2.b.b().b();
                    int i4 = 0;
                    while (i4 < b3.size()) {
                        Channel channel2 = b3.get(i4);
                        View inflate2 = LayoutInflater.from(cxqhVar2.c).inflate(i3, (ViewGroup) linearLayout2, false);
                        inflate2.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
                        TextView textView3 = (TextView) inflate2.findViewById(i2);
                        textView3.setText(channel2.b(cxqhVar2.c));
                        textView3.setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.f));
                        if (cxqhVar2.h.f(channel2)) {
                            AppCompatImageView appCompatImageView = (AppCompatImageView) inflate2.findViewById(R.id.peoplekit_popup_checkmark);
                            appCompatImageView.setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.h));
                            appCompatImageView.setVisibility(0);
                            Activity activity = cxqhVar2.c;
                            inflate2.setContentDescription(activity.getString(R.string.peoplekit_contact_name_and_method_selected_description, new Object[]{channel2.b(activity), ""}));
                        } else {
                            Activity activity2 = cxqhVar2.c;
                            inflate2.setContentDescription(activity2.getString(R.string.peoplekit_contact_method_unselected_description, new Object[]{channel2.b(activity2)}));
                        }
                        inflate2.setOnClickListener(new cxqg(cxqhVar2, channel2, channel));
                        linearLayout2.addView(inflate2);
                        i4++;
                        i2 = R.id.peoplekit_autocomplete_popup_contact_method;
                        i3 = R.layout.peoplekit_chip_popup_contact_method;
                    }
                } else if (!TextUtils.isEmpty(channel.f())) {
                    View inflate3 = LayoutInflater.from(cxqhVar2.c).inflate(R.layout.peoplekit_chip_popup_contact_method, (ViewGroup) linearLayout2, false);
                    inflate3.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
                    TextView textView4 = (TextView) inflate3.findViewById(R.id.peoplekit_autocomplete_popup_contact_method);
                    textView4.setText(channel.b(cxqhVar2.c));
                    textView4.setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.f));
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) inflate3.findViewById(R.id.peoplekit_popup_checkmark);
                    appCompatImageView2.setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.h));
                    appCompatImageView2.setVisibility(0);
                    linearLayout2.addView(inflate3);
                }
            }
            if (cxqhVar2.e.k() && !channel.k() && channel.j()) {
                View findViewById = inflate.findViewById(R.id.peoplekit_autocomplete_hide_name_row);
                findViewById.setVisibility(0);
                ((TextView) findViewById.findViewById(R.id.peoplekit_autocomplete_hide_name_text)).setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.h));
                ((AppCompatImageView) findViewById.findViewById(R.id.peoplekit_autocomplete_hide_name_icon)).setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.p));
                findViewById.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
                View findViewById2 = inflate.findViewById(R.id.peoplekit_chip_popup_hide_name_divider);
                findViewById2.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.l));
                findViewById2.setVisibility(0);
                findViewById.setOnClickListener(new cxqb(cxqhVar2, channel));
                cxqo cxqoVar = cxqhVar2.g;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.a(new czhc(dhjm.k));
                peopleKitVisualElementPath.a(new czhc(dhjm.j));
                peopleKitVisualElementPath.c(cxqhVar2.f);
                cxqoVar.d(-1, peopleKitVisualElementPath);
            }
            if (cxsg.c()) {
                View findViewById3 = inflate.findViewById(R.id.peoplekit_autocomplete_copy_row);
                ((TextView) findViewById3.findViewById(R.id.peoplekit_autocomplete_copy_text)).setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.h));
                ((AppCompatImageView) findViewById3.findViewById(R.id.peoplekit_autocomplete_copy_icon)).setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.p));
                findViewById3.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
                findViewById3.setOnClickListener(new cxqc(cxqhVar2, channel));
                findViewById3.setVisibility(0);
                cxqo cxqoVar2 = cxqhVar2.g;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.a(new czhc(dhjm.i));
                peopleKitVisualElementPath2.a(new czhc(dhjm.j));
                peopleKitVisualElementPath2.c(cxqhVar2.f);
                cxqoVar2.d(-1, peopleKitVisualElementPath2);
            }
            if (cxqhVar2.h.b().size() > 1 && cxsg.d()) {
                View findViewById4 = inflate.findViewById(R.id.peoplekit_autocomplete_copy_all_row);
                ((TextView) findViewById4.findViewById(R.id.peoplekit_autocomplete_copy_all_text)).setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.h));
                ((AppCompatImageView) findViewById4.findViewById(R.id.peoplekit_autocomplete_copy_all_icon)).setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.p));
                findViewById4.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
                findViewById4.setOnClickListener(new cxqd(cxqhVar2));
                findViewById4.setVisibility(0);
                cxqo cxqoVar3 = cxqhVar2.g;
                PeopleKitVisualElementPath peopleKitVisualElementPath3 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath3.a(new czhc(dhjm.h));
                peopleKitVisualElementPath3.a(new czhc(dhjm.j));
                peopleKitVisualElementPath3.c(cxqhVar2.f);
                cxqoVar3.d(-1, peopleKitVisualElementPath3);
            }
            if (cxsg.c() || (cxqhVar2.h.b().size() > 1 && cxsg.d())) {
                View findViewById5 = inflate.findViewById(R.id.peoplekit_chip_popup_copy_divider);
                findViewById5.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.l));
                findViewById5.setVisibility(0);
            }
            View findViewById6 = inflate.findViewById(R.id.peoplekit_autocomplete_delete_row);
            ((TextView) findViewById6.findViewById(R.id.peoplekit_autocomplete_delete_text)).setTextColor(akm.c(cxqhVar2.c, cxqhVar2.i.h));
            ((AppCompatImageView) findViewById6.findViewById(R.id.peoplekit_autocomplete_delete_icon)).setColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.p));
            findViewById6.setBackgroundColor(akm.c(cxqhVar2.c, cxqhVar2.i.g));
            findViewById6.setOnClickListener(new cxqe(cxqhVar2, channel));
            cxqo cxqoVar4 = cxqhVar2.g;
            PeopleKitVisualElementPath peopleKitVisualElementPath4 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath4.a(new czhc(dhjm.m));
            peopleKitVisualElementPath4.a(new czhc(dhjm.j));
            peopleKitVisualElementPath4.c(cxqhVar2.f);
            cxqoVar4.d(-1, peopleKitVisualElementPath4);
            inflate.findViewById(R.id.peoplekit_autocomplete_popup_primary).setOnClickListener(new cxqf(cxqhVar2));
            cxqhVar2.j = new PopupWindow(inflate, -2, -2, true);
            Drawable b4 = sl.b(cxqhVar2.c, R.drawable.peoplekit_popup_background);
            b4.setColorFilter(new PorterDuffColorFilter(akm.c(cxqhVar2.c, cxqhVar2.i.g), PorterDuff.Mode.SRC_ATOP));
            cxqhVar2.j.setBackgroundDrawable(b4);
            cxqhVar2.j.setElevation(cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_elevation));
            int[] iArr = new int[2];
            cxqhVar2.b.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            Point point = new Point();
            cxqhVar2.c.getWindowManager().getDefaultDisplay().getSize(point);
            int dimensionPixelSize = i5 + cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_width);
            int dimensionPixelSize2 = dimensionPixelSize > point.x ? (point.x - dimensionPixelSize) - cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_popup_half_padding) : 0;
            if (cxqhVar2.k) {
                inflate.measure(View.MeasureSpec.makeMeasureSpec(inflate.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                i = inflate.getMeasuredHeight();
            } else {
                i = 0;
            }
            cxqhVar2.j.showAsDropDown(cxqhVar2.b, dimensionPixelSize2, -(cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_height) + cxqhVar2.c.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_spacing) + i));
            cxqhVar2.j.setOnDismissListener(new cxqa(cxqhVar2));
            ((InputMethodManager) cxqhVar2.c.getSystemService("input_method")).hideSoftInputFromWindow(cxqhVar2.a.getWindowToken(), 0);
            cxoy cxoyVar = cxqhVar2.o;
            if (cxoyVar != null) {
                cxoyVar.a.e.setCursorVisible(false);
            }
            cxqo cxqoVar5 = cxqhVar2.g;
            PeopleKitVisualElementPath peopleKitVisualElementPath5 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath5.a(new czhc(dhjm.j));
            peopleKitVisualElementPath5.c(cxqhVar2.f);
            cxqoVar5.d(-1, peopleKitVisualElementPath5);
            cxqo cxqoVar6 = this.d.g;
            PeopleKitVisualElementPath peopleKitVisualElementPath6 = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath6.a(new czhc(dhjm.l));
            peopleKitVisualElementPath6.c(this.d.f);
            cxqoVar6.d(4, peopleKitVisualElementPath6);
            return;
        }
        channelChip.setChipSelected(false);
        cxqh cxqhVar3 = this.d;
        cxqhVar3.c(cxqhVar3.b, this.c);
        PopupWindow popupWindow = this.d.j;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.d.j.dismiss();
    }
}
