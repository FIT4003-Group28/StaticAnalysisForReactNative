package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxuz  reason: default package */
/* loaded from: classes5.dex */
public final class cxuz implements cxso {
    private static final DecelerateInterpolator t = new DecelerateInterpolator();
    public final Context a;
    public final View b;
    public final cxpr c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final LinearLayout g;
    public final PeopleKitDataLayer h;
    public final PeopleKitSelectionModel i;
    public final cxqo j;
    public final PeopleKitConfig k;
    public final cxse l;
    public final PeopleKitVisualElementPath m;
    public cxov n;
    public CoalescedChannels o;
    public Channel p;
    public boolean q;
    public int r;
    public cxsq s = cxsq.b();
    private final cxuk u;

    public cxuz(Context context, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxuk cxukVar, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxse cxseVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        this.a = context;
        this.u = cxukVar;
        this.j = cxqoVar;
        this.k = peopleKitConfig;
        this.l = cxseVar;
        this.m = peopleKitVisualElementPath;
        View inflate = LayoutInflater.from(context).inflate(R.layout.expandable_peoplekit_row_view, (ViewGroup) null);
        this.b = inflate;
        this.d = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_name);
        this.e = (TextView) inflate.findViewById(R.id.peoplekit_listview_contact_method);
        this.f = (TextView) inflate.findViewById(R.id.peoplekit_listview_status_text);
        this.g = (LinearLayout) inflate.findViewById(R.id.peoplekit_listview_expanded_contact_methods);
        this.h = peopleKitDataLayer;
        this.i = peopleKitSelectionModel;
        peopleKitSelectionModel.i(this);
        cxpr cxprVar = new cxpr(context, cxqoVar, peopleKitVisualElementPath);
        this.c = cxprVar;
        cxprVar.k();
        cxprVar.c = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_listview_icon_offset);
        ((RelativeLayout) inflate.findViewById(R.id.peoplekit_listview_row_avatar)).addView(cxprVar.a);
        a();
    }

    private final String g(Channel channel) {
        if (this.q) {
            return cxrc.l(channel, this.a);
        }
        if (channel.y()) {
            Context context = this.a;
            return context.getString(R.string.peoplekit_listview_send_via_app, channel.b(context));
        }
        return channel.b(this.a);
    }

    private final void h(String str) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        obtain.getText().add(str);
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(obtain);
    }

    private final void i() {
        this.c.f(true != this.i.f(this.p) ? 1 : 2);
        if (this.k.r()) {
            ((ImageView) this.c.a.findViewById(R.id.peoplekit_avatars_in_app_indicator)).setVisibility(true != this.p.y() ? 8 : 0);
        }
    }

    private final void j(View view) {
        for (int i = 0; i < this.g.getChildCount(); i++) {
            View childAt = this.g.getChildAt(i);
            childAt.findViewById(R.id.peoplekit_listview_checkmark).setVisibility(childAt != view ? 4 : 0);
        }
    }

    public final void a() {
        this.b.setBackgroundColor(akm.c(this.a, this.s.a));
        this.b.findViewById(R.id.peoplekit_listview_header).setBackgroundColor(akm.c(this.a, this.s.a));
        ((AppCompatTextView) this.b.findViewById(R.id.peoplekit_listview_main_header)).setTextColor(akm.c(this.a, this.s.e));
        ((TextView) this.b.findViewById(R.id.peoplekit_listview_header_letter)).setTextColor(akm.c(this.a, this.s.f));
        Drawable drawable = ((AppCompatImageView) this.b.findViewById(R.id.peoplekit_listview_header_info_icon)).getDrawable();
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.a, this.s.f));
        this.b.findViewById(R.id.peoplekit_listview_main_row).setBackgroundColor(akm.c(this.a, this.s.a));
        this.b.findViewById(R.id.peoplekit_listview_permissions_row).setBackgroundColor(akm.c(this.a, this.s.a));
        for (int i = 0; i < this.g.getChildCount(); i++) {
            View childAt = this.g.getChildAt(i);
            childAt.setBackgroundColor(akm.c(this.a, this.s.a));
            ((TextView) childAt.findViewById(R.id.peoplekit_listview_expanded_contact_method_text_view)).setTextColor(akm.c(this.a, this.s.h));
            ((TextView) childAt.findViewById(R.id.peoplekit_listview_expanded_shared_text)).setTextColor(akm.c(this.a, this.s.h));
        }
        this.d.setTextColor(akm.c(this.a, this.s.e));
        this.e.setTextColor(akm.c(this.a, this.s.f));
        this.f.setTextColor(akm.c(this.a, this.s.e));
        if (this.b.findViewById(R.id.peoplekit_listview_chevron).getVisibility() == 0) {
            Drawable drawable2 = ((AppCompatImageView) this.b.findViewById(R.id.peoplekit_listview_chevron)).getDrawable();
            ks.b(drawable2);
            drawable2.mutate().setTint(akm.c(this.a, this.s.m));
            ((AppCompatImageView) this.b.findViewById(R.id.peoplekit_listview_chevron)).setImageDrawable(drawable2);
        }
    }

    public final void b(CoalescedChannels coalescedChannels) {
        if (this.g.getChildCount() > 0) {
            return;
        }
        coalescedChannels.d(this.a);
        List<Channel> b = this.o.b();
        for (int i = 0; i < b.size(); i++) {
            Channel channel = b.get(i);
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.peoplekit_expanded_contact_method_field, (ViewGroup) this.g, false);
            inflate.setBackgroundColor(akm.c(this.a, this.s.a));
            TextView textView = (TextView) inflate.findViewById(R.id.peoplekit_listview_expanded_contact_method_text_view);
            textView.setTextColor(akm.c(this.a, this.s.h));
            d(textView, channel);
            if (this.i.f(channel)) {
                inflate.findViewById(R.id.peoplekit_listview_checkmark).setVisibility(0);
                this.c.f(2);
                d(this.e, channel);
                inflate.setContentDescription(this.a.getString(R.string.peoplekit_contact_name_and_method_selected_description, g(channel), ""));
            } else {
                inflate.setContentDescription(this.a.getString(R.string.peoplekit_contact_method_unselected_description, g(channel)));
            }
            inflate.setOnClickListener(new cxur(this, i, channel, coalescedChannels));
            this.g.addView(inflate);
        }
    }

    public final void c(Channel channel) {
        this.h.q(channel, new cxut(this, channel));
    }

    public final void d(TextView textView, Channel channel) {
        textView.setText(g(channel));
    }

    public final void e(boolean z, boolean z2) {
        int c;
        int c2;
        int c3;
        ValueAnimator ofInt;
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.b.findViewById(R.id.peoplekit_listview_chevron);
        float f = 180.0f;
        float f2 = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = appCompatImageView.animate();
            if (true != z) {
                f = 0.0f;
            }
            animate.rotation(f).setDuration(200L).start();
        } else {
            if (true != z) {
                f = 0.0f;
            }
            appCompatImageView.setRotation(f);
        }
        Resources resources = this.a.getResources();
        if (z2) {
            this.d.animate().translationY(z ? resources.getDimensionPixelSize(R.dimen.peoplekit_listview_name_expanded_offset) : 0.0f).setInterpolator(t).setDuration(200L).start();
        } else {
            this.d.setTranslationY(z ? resources.getDimensionPixelSize(R.dimen.peoplekit_listview_name_expanded_offset) : 0.0f);
        }
        int i = 0;
        if (z) {
            Context context = this.a;
            appCompatImageView.setContentDescription(context.getString(R.string.peoplekit_collapse_button_content_description, this.p.i(context)));
            Context context2 = this.a;
            h(context2.getString(R.string.peoplekit_contact_expanded_announcement, this.p.i(context2)));
        } else {
            Context context3 = this.a;
            appCompatImageView.setContentDescription(context3.getString(R.string.peoplekit_expand_button_content_description, this.p.i(context3)));
            Context context4 = this.a;
            h(context4.getString(R.string.peoplekit_contact_collapsed_announcement, this.p.i(context4)));
        }
        this.d.setTypeface(Typeface.SANS_SERIF, z ? 1 : 0);
        if (z) {
            c = akm.c(this.a, this.s.q);
        } else {
            c = akm.c(this.a, this.s.m);
        }
        if (z) {
            c2 = akm.c(this.a, this.s.m);
        } else {
            c2 = akm.c(this.a, this.s.q);
        }
        ValueAnimator duration = ValueAnimator.ofInt(c2, c).setDuration(200L);
        duration.setEvaluator(new ArgbEvaluator());
        Drawable b = sl.b(this.a, 2131232266);
        ks.b(b);
        if (z2) {
            duration.addUpdateListener(new cxuv(b, duration, appCompatImageView));
            duration.start();
        } else {
            Drawable mutate = b.mutate();
            if (z) {
                c3 = akm.c(this.a, this.s.q);
            } else {
                c3 = akm.c(this.a, this.s.m);
            }
            mutate.setTint(c3);
            appCompatImageView.setImageDrawable(b);
        }
        if (!z2) {
            TextView textView = this.e;
            if (true != z) {
                f2 = 1.0f;
            }
            textView.setAlpha(f2);
            this.e.setVisibility(true != z ? 0 : 4);
        } else if (z) {
            this.e.setAlpha(1.0f);
            this.e.animate().alpha(0.0f).setDuration(200L).setListener(new cxuw(this)).start();
        } else {
            this.e.setVisibility(0);
            this.e.setAlpha(0.0f);
            this.e.animate().alpha(1.0f).setDuration(200L).setListener(new cxux(this)).start();
        }
        int measuredHeight = this.b.findViewById(R.id.peoplekit_listview_main_row).getMeasuredHeight();
        int childCount = (this.g.getChildCount() * resources.getDimensionPixelSize(R.dimen.peoplekit_listview_expanded_contact_row_height)) + measuredHeight + resources.getDimensionPixelSize(R.dimen.peoplekit_listview_row_top_padding);
        if (z) {
            this.g.setVisibility(0);
        }
        if (z) {
            ofInt = ValueAnimator.ofInt(measuredHeight, childCount);
        } else {
            ofInt = ValueAnimator.ofInt(childCount, measuredHeight);
        }
        View findViewById = this.b.findViewById(R.id.peoplekit_listview_main_content);
        if (z2) {
            ofInt.addUpdateListener(new cxuy(this, findViewById, z));
            ofInt.setDuration(200L);
            ofInt.setInterpolator(t);
            ofInt.start();
        } else {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (true == z) {
                measuredHeight = childCount;
            }
            layoutParams.height = measuredHeight;
            LinearLayout linearLayout = this.g;
            if (true != z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
        if (z2) {
            if (z) {
                this.u.a.e.add(this.o);
            } else {
                this.u.a.e.remove(this.o);
            }
        }
        if (z) {
            for (Channel channel : this.o.b()) {
                this.h.f(channel);
            }
        }
    }

    public final czhc f() {
        if (!this.i.f(this.p)) {
            if (this.p.a() == 2) {
                czhc czhcVar = new czhc(dhjm.Q);
                czhcVar.a(this.r);
                return czhcVar;
            }
            czhc czhcVar2 = new czhc(dhjm.x);
            czhcVar2.a(this.r);
            return czhcVar2;
        } else if (this.p.a() == 2) {
            czhc czhcVar3 = new czhc(dhjm.K);
            czhcVar3.a(this.r);
            return czhcVar3;
        } else {
            czhc czhcVar4 = new czhc(dhjm.J);
            czhcVar4.a(this.r);
            return czhcVar4;
        }
    }

    @Override // defpackage.cxso
    public final void v(Channel channel, CoalescedChannels coalescedChannels) {
        CoalescedChannels coalescedChannels2 = this.o;
        if (coalescedChannels2 != null) {
            List<Channel> b = coalescedChannels2.b();
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i).equals(channel)) {
                    this.p = channel;
                    d(this.e, channel);
                    i();
                    if (this.o.a() > 1 && this.o.e() != 1) {
                        b(this.o);
                        List<Channel> b2 = this.o.b();
                        for (int i2 = 0; i2 < b2.size(); i2++) {
                            Channel channel2 = b2.get(i2);
                            View childAt = this.g.getChildAt(i2);
                            if (channel2.equals(channel)) {
                                j(childAt);
                                childAt.setContentDescription(this.a.getString(R.string.peoplekit_contact_name_and_method_selected_description, g(channel2), ""));
                            } else {
                                childAt.setContentDescription(this.a.getString(R.string.peoplekit_contact_method_unselected_description, g(channel2)));
                            }
                        }
                    }
                    View findViewById = this.b.findViewById(R.id.peoplekit_listview_main_content);
                    Context context = this.a;
                    findViewById.setContentDescription(context.getString(R.string.peoplekit_contact_name_and_method_selected_description, channel.i(context), channel.b(this.a)));
                    return;
                }
            }
        }
    }

    @Override // defpackage.cxso
    public final void w(Channel channel) {
        CoalescedChannels coalescedChannels = this.o;
        if (coalescedChannels != null) {
            List<Channel> b = coalescedChannels.b();
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i).equals(channel)) {
                    i();
                    j(null);
                    this.b.findViewById(R.id.peoplekit_listview_main_content).setContentDescription(null);
                    return;
                }
            }
        }
    }
}
