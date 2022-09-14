package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: cxqh  reason: default package */
/* loaded from: classes5.dex */
public final class cxqh {
    public final View a;
    public final ChannelChip b;
    public final Activity c;
    public final PeopleKitDataLayer d;
    public final PeopleKitConfig e;
    public final PeopleKitVisualElementPath f;
    public final cxqo g;
    public final PeopleKitSelectionModel h;
    public PopupWindow j;
    public boolean l;
    public String m;
    public cxoy o;
    public cxsq i = cxsq.b();
    public boolean k = false;
    public boolean n = false;

    public cxqh(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitConfig peopleKitConfig, cxqo cxqoVar, PeopleKitVisualElementPath peopleKitVisualElementPath, PeopleKitSelectionModel peopleKitSelectionModel) {
        this.c = activity;
        this.d = peopleKitDataLayer;
        this.e = peopleKitConfig;
        this.g = cxqoVar;
        this.f = peopleKitVisualElementPath;
        this.h = peopleKitSelectionModel;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_chip, (ViewGroup) null);
        this.a = inflate;
        this.b = (ChannelChip) inflate.findViewById(R.id.peoplekit_chip);
    }

    public final void a(cxsq cxsqVar) {
        this.i = cxsqVar;
        this.b.setChipBackgroundColorResource(cxsqVar.a);
        this.b.setChipStrokeColorResource(cxsqVar.l);
        this.b.setTextColor(akm.c(this.c, cxsqVar.e));
        c(this.b, sl.b(this.c, R.drawable.quantum_gm_ic_expand_more_vd_theme_24));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [crxy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.libraries.social.peoplekit.common.dataservice.Channel] */
    public final void b(Channel channel) {
        String str;
        Drawable b;
        if (this.e.o()) {
            Activity activity = this.c;
            ChannelChip channelChip = this.b;
            int g = this.e.g();
            cxsq cxsqVar = this.i;
            cxqk.a(activity, channelChip, channel, this.m);
            channelChip.setChipIconSize(activity.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_drawable_size));
            channelChip.setIconStartPadding(activity.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_start_padding));
            if (channel.y()) {
                channelChip.setChipIcon(sl.b(activity, g));
                return;
            }
            if (channel.d() == 1) {
                b = sl.b(activity, R.drawable.quantum_gm_ic_email_vd_theme_24);
            } else {
                b = sl.b(activity, R.drawable.quantum_gm_ic_message_vd_theme_24);
            }
            channelChip.setChipIcon(b);
            ks.b(b);
            b.mutate().setTint(akm.c(activity, cxsqVar.q));
            return;
        }
        Activity activity2 = this.c;
        ChannelChip channelChip2 = this.b;
        cxqk.a(activity2, channelChip2, channel, this.m);
        int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.peoplekit_ui_chip_avatar_size);
        String n = channel.n();
        if (TextUtils.isEmpty(n)) {
            if (TextUtils.isEmpty(channel.m())) {
                channelChip2.setChipIcon(new cxpx(activity2, cxpq.a(activity2, channel.i(activity2)), dimensionPixelSize));
            } else {
                channelChip2.setChipIcon(new cxpw(activity2, channel.m(), cxpq.a(activity2, channel.i(activity2)), dimensionPixelSize));
            }
        } else {
            channelChip2.setChipIcon(new cxpx(activity2, akm.c(activity2, R.color.quantum_grey500), dimensionPixelSize));
            if (!TextUtils.isEmpty(n)) {
                if (cxot.a(n)) {
                    cryd crydVar = new cryd();
                    crydVar.c();
                    crydVar.a();
                    crydVar.b();
                    crydVar.e();
                    str = new crxy(n, crydVar);
                } else {
                    str = null;
                }
                int dimensionPixelSize2 = activity2.getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_default_size);
                brw<Drawable> h = brc.e(activity2).h();
                if (str != null) {
                    n = str;
                }
                h.j(n);
                brw t = h.e(chw.b(dimensionPixelSize2, dimensionPixelSize2)).t(cdl.d, false);
                t.g(new cxqj(channelChip2));
                t.c();
            }
        }
        this.b.setCloseIcon(null);
    }

    public final void c(Chip chip, Drawable drawable) {
        if (!this.e.o()) {
            return;
        }
        chip.setCloseIcon(drawable);
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.c, this.i.m));
    }
}
