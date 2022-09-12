package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.AvatarView;
import com.google.android.libraries.social.peoplekit.avatars.viewcontrollers.GroupAvatarView;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxpr  reason: default package */
/* loaded from: classes5.dex */
public final class cxpr {
    public final View a;
    public final AvatarView b;
    public int c;
    public int d;
    private final Context e;
    private final cxqo f;
    private final PeopleKitVisualElementPath g;
    private final GroupAvatarView h;
    private final TextView i;
    private final View j;
    private String k;
    private int l;
    private int m;
    private final boolean q;
    private int r;
    private final int t;
    private int n = 1;
    private int o = 1;
    private boolean p = true;
    private cxsq s = cxsq.b();

    public cxpr(Context context, cxqo cxqoVar, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        boolean z = true;
        this.e = context;
        this.f = cxqoVar;
        this.g = peopleKitVisualElementPath;
        View inflate = LayoutInflater.from(context).inflate(R.layout.avatar_group_or_monogram, (ViewGroup) null);
        this.a = inflate;
        this.b = (AvatarView) inflate.findViewById(R.id.peoplekit_avatars_avatar);
        this.h = (GroupAvatarView) inflate.findViewById(R.id.peoplekit_avatars_group);
        this.i = (TextView) inflate.findViewById(R.id.peoplekit_avatars_monogram);
        this.j = inflate.findViewById(R.id.peoplekit_avatars_selected_avatar);
        o();
        this.q = od.s(inflate) != 1 ? false : z;
        this.r = context.getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_default_size);
        this.t = akm.c(context, R.color.google_grey300);
    }

    private final void l() {
        this.i.setText(this.k);
        ((GradientDrawable) this.i.getBackground()).setColor(this.l);
        float b = cxpq.b(this.e, this.k, this.r);
        Paint paint = new Paint();
        Rect rect = new Rect();
        Typeface typeface = this.i.getTypeface();
        this.i.setTypeface(typeface);
        paint.setTypeface(typeface);
        paint.setTextSize(b);
        String str = this.k;
        paint.getTextBounds(str, 0, str.length(), rect);
        this.i.setTextSize(0, b);
    }

    private final void m() {
        j(this.t, true);
    }

    private final void n() {
        try {
            brc.d(this.e).k(this.b);
            brc.d(this.e).k(this.h);
        } catch (IllegalArgumentException unused) {
        }
    }

    private final void o() {
        this.m = akm.c(this.e, this.s.q);
        ((GradientDrawable) this.j.getBackground()).setColor(this.m);
        Drawable drawable = ((AppCompatImageView) this.a.findViewById(R.id.peoplekit_avatars_selected_avatar_inner)).getDrawable();
        ks.b(drawable);
        drawable.mutate().setTint(akm.c(this.e, this.s.r));
    }

    public final void a(String str, Channel channel) {
        Object obj;
        cryd crydVar;
        this.n = 1;
        n();
        if (str != null) {
            if (!str.startsWith("content://")) {
                if (cxot.a(str)) {
                    if (cxsg.d.f().booleanValue()) {
                        crydVar = new cryd();
                        crydVar.c();
                        crydVar.a();
                        crydVar.b();
                        crydVar.e();
                    } else {
                        crydVar = new cryd();
                        crydVar.c();
                        crydVar.b();
                        crydVar.e();
                    }
                    obj = new crxy(str, crydVar);
                } else {
                    obj = null;
                }
                m();
                bsa d = brc.d(this.e);
                if (obj == null) {
                    obj = str;
                }
                brw<Drawable> h = d.h();
                h.j(obj);
                int i = this.r;
                brw<Drawable> e = h.e(chw.b(i, i));
                e.k(new cxpp(str, this, channel));
                e.h(this.b);
                return;
            }
            m();
            brw<Drawable> i2 = brc.d(this.e).i(str);
            int i3 = this.r;
            brw<Drawable> e2 = i2.e(chw.b(i3, i3));
            e2.k(new cxpp(str, this, channel));
            e2.h(this.b);
        }
    }

    public final void b(Channel channel) {
        if (!TextUtils.isEmpty(channel.n())) {
            a(channel.n(), channel);
        } else {
            d(channel.m(), channel.i(this.e));
        }
    }

    public final void c(CoalescedChannels coalescedChannels) {
        Channel channel = coalescedChannels.b().get(0);
        if (coalescedChannels.e() == 1) {
            List<Channel> c = coalescedChannels.c();
            if (!TextUtils.isEmpty(channel.n())) {
                a(channel.n(), channel);
                return;
            } else if (coalescedChannels.a() != 1 || c.isEmpty()) {
                if (c.isEmpty()) {
                    return;
                }
                if (c.size() == 1) {
                    b(c.get(0));
                    return;
                }
                int i = 2;
                this.n = 2;
                n();
                this.b.setVisibility(8);
                this.h.setVisibility(0);
                GroupAvatarView groupAvatarView = this.h;
                int size = c.size();
                StringBuilder sb = new StringBuilder(20);
                sb.append(size);
                sb.append(" channels");
                cxpp cxppVar = new cxpp(sb.toString(), this, null);
                if (c.size() > 4) {
                    groupAvatarView.b = c.subList(0, 4);
                } else {
                    groupAvatarView.b = c;
                }
                cxpv cxpvVar = groupAvatarView.a;
                cxps cxpsVar = groupAvatarView.f;
                cxpvVar.e = new chw().e(new chw().p(R.color.quantum_grey300));
                cxpvVar.h = cxppVar;
                cxpvVar.f = R.drawable.peoplekit_default_avatar;
                cxpvVar.l = cxpsVar;
                List<Channel> list = groupAvatarView.b;
                if (list == null || list.isEmpty()) {
                    groupAvatarView.e = 1;
                } else {
                    int size2 = groupAvatarView.b.size();
                    if (size2 != 1) {
                        if (size2 == 2) {
                            groupAvatarView.e = 3;
                        } else if (size2 != 3) {
                            i = 5;
                        } else {
                            groupAvatarView.e = 4;
                        }
                    }
                    groupAvatarView.e = i;
                }
                groupAvatarView.a();
                return;
            } else {
                b(c.get(0));
                return;
            }
        }
        b(channel);
    }

    public final void d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str.length() <= 3) {
            this.k = str;
            this.l = cxpq.a(this.e, str2);
            if (str.isEmpty()) {
                this.b.setDrawDefaultSilhouette(true, this.l, true);
                return;
            }
            this.n = 3;
            this.b.setVisibility(8);
            this.i.setVisibility(0);
            l();
            return;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(54);
        sb.append("Invalid length of monogramText (max of 3): ");
        sb.append(length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(int i) {
        this.r = i;
        this.b.getLayoutParams().height = i;
        this.b.getLayoutParams().width = i;
        this.h.getLayoutParams().height = i;
        this.h.getLayoutParams().width = i;
        this.i.getLayoutParams().height = i;
        this.i.getLayoutParams().width = i;
        this.j.getLayoutParams().height = i;
        this.j.getLayoutParams().width = i;
        this.j.invalidate();
        int i2 = this.n;
        if (i2 == 1) {
            this.b.invalidate();
        } else if (i2 == 2) {
            if (i <= this.e.getResources().getDimensionPixelSize(R.dimen.peoplekit_group_avatar_bigger_size_min)) {
                GroupAvatarView groupAvatarView = this.h;
                int ceil = (int) Math.ceil(this.e.getResources().getDimensionPixelSize(R.dimen.peoplekit_group_avatar_border_width) / 4.0f);
                groupAvatarView.d = ceil;
                groupAvatarView.c.setStrokeWidth(ceil + ceil);
            }
            this.h.invalidate();
        } else {
            l();
        }
    }

    public final void f(int i) {
        this.o = i;
        if (i == 2) {
            this.j.setVisibility(0);
            this.b.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            if (this.o != 2 || this.p) {
                return;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.j.getBackground();
            gradientDrawable.setColor(this.m);
            this.j.getBackground().mutate().clearColorFilter();
            gradientDrawable.setStroke(0, 0);
            this.p = true;
            return;
        }
        this.j.setVisibility(8);
        int i2 = this.n;
        if (i2 == 1) {
            this.b.setVisibility(0);
        } else if (i2 == 2) {
            this.h.setVisibility(0);
        } else {
            this.i.setVisibility(0);
        }
    }

    public final void g(int i, int i2) {
        ImageView imageView = (ImageView) this.a.findViewById(R.id.peoplekit_avatars_in_app_indicator);
        if (this.d != 0) {
            imageView.getLayoutParams().height = this.d;
            imageView.getLayoutParams().width = this.d;
        }
        int i3 = this.c;
        if (i3 == 0) {
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.peoplekit_avatar_in_app_indicator_offset);
            if (this.q) {
                dimensionPixelSize = -dimensionPixelSize;
            }
            float f = dimensionPixelSize;
            imageView.setTranslationX(f);
            imageView.setTranslationY(f);
        } else {
            imageView.setTranslationX(i3);
            imageView.setTranslationY(this.c);
        }
        imageView.setImageResource(i);
        if (i2 == 0) {
            imageView.setBackgroundResource(0);
        } else {
            ((GradientDrawable) imageView.getBackground()).setColor(i2);
        }
        imageView.setVisibility(0);
        cxqo cxqoVar = this.f;
        if (cxqoVar != null) {
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.u));
            peopleKitVisualElementPath.c(this.g);
            cxqoVar.d(-1, peopleKitVisualElementPath);
        }
    }

    public final void h(cxsq cxsqVar) {
        if (!this.s.equals(cxsqVar)) {
            this.s = cxsqVar;
            o();
        }
    }

    public final void i() {
        this.n = 1;
        ((GradientDrawable) this.j.getBackground()).setStroke(0, 0);
        this.b.setVisibility(0);
        this.b.setDefaultAvatar(null);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        f(1);
        this.k = "";
        ((ImageView) this.a.findViewById(R.id.peoplekit_avatars_in_app_indicator)).setVisibility(8);
    }

    public final void j(int i, boolean z) {
        this.b.setDrawDefaultSilhouette(true, i, z);
    }

    public final void k() {
        this.a.setFocusable(false);
        this.a.setImportantForAccessibility(2);
    }
}
