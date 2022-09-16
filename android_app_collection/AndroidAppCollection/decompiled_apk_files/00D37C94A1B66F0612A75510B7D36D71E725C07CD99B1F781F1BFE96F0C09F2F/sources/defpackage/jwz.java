package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jwz  reason: default package */
/* loaded from: classes3.dex */
public final class jwz implements jwo {
    private long A;
    public jxc a;
    private final Context b;
    private final acti c;
    private final ajmy d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final ftb m;
    private TextView n;
    private TextView o;
    private TextView p;
    private ImageView q;
    private View r;
    private jwp s;
    private View t;
    private TextView u;
    private View v;
    private TextView w;
    private View x;
    private ezx y;
    private boolean z;

    public jwz(Context context, acti actiVar, ajmy ajmyVar, ftb ftbVar) {
        this.b = context;
        actiVar.getClass();
        this.c = actiVar;
        ajmyVar.getClass();
        this.d = ajmyVar;
        this.m = ftbVar;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin);
        this.g = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_vertical_margin_fullscreen);
        this.h = dimensionPixelSize2;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height);
        this.i = dimensionPixelSize3;
        int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.autonav_explicit_action_button_height_fullscreen);
        this.j = dimensionPixelSize4;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.autonav_info_panel_margin_bottom_fullscreen);
        this.e = dimensionPixelSize3 + dimensionPixelSize + dimensionPixelSize;
        this.f = dimensionPixelSize4 + dimensionPixelSize2 + dimensionPixelSize2;
    }

    private final void h(ezx ezxVar) {
        jwp jwpVar = this.s;
        int i = 2132083726;
        if (ezxVar.b() && !this.z) {
            i = 2132083729;
        }
        YouTubeTextView youTubeTextView = jwpVar.e;
        youTubeTextView.setTextAppearance(youTubeTextView.getContext(), i);
        YouTubeTextView youTubeTextView2 = jwpVar.e;
        youTubeTextView2.setTextColor(zhn.d(youTubeTextView2.getContext(), R.attr.ytOverlayTextPrimary));
    }

    @Override // defpackage.jwo
    public final int a() {
        ezx ezxVar = this.y;
        return (ezxVar == null || !ezxVar.b()) ? this.e : this.f;
    }

    @Override // defpackage.jwo
    public final void b(jxc jxcVar, ViewGroup viewGroup) {
        this.a = jxcVar;
        LayoutInflater.from(this.b).inflate(R.layout.explicit_actions_autonav_view, viewGroup, true);
        this.n = (TextView) viewGroup.findViewById(R.id.countdown_text);
        this.o = (TextView) viewGroup.findViewById(R.id.title);
        this.p = (TextView) viewGroup.findViewById(R.id.alternative_title);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.close_button);
        this.q = imageView;
        imageView.setOnClickListener(new jwy(this, 1));
        View findViewById = viewGroup.findViewById(R.id.cancel);
        this.t = findViewById;
        findViewById.setOnClickListener(new jwy(this));
        this.u = (TextView) viewGroup.findViewById(R.id.cancel_text);
        View findViewById2 = viewGroup.findViewById(R.id.play);
        this.v = findViewById2;
        findViewById2.setOnClickListener(new jwy(this, 2));
        this.w = (TextView) viewGroup.findViewById(R.id.play_text);
        this.x = viewGroup.findViewById(R.id.action_bar);
        this.r = viewGroup.findViewById(R.id.info_panel);
        this.s = new jwp(this.r, this.d, this.b, this.m);
    }

    @Override // defpackage.jwo
    public final void c(int i, int i2) {
        boolean z = false;
        if (this.z != (i2 > i)) {
            if (i2 > i) {
                z = true;
            }
            this.z = z;
            h(this.y);
        }
    }

    @Override // defpackage.jwo
    public final void d(ezx ezxVar) {
        ezx ezxVar2 = this.y;
        if (ezxVar2 == ezxVar) {
            return;
        }
        if (ezxVar2 == null || ezxVar2.b() != ezxVar.b()) {
            zgd.t(this.x, zgd.b(zgd.h(ezxVar.b() ? this.j : this.i), zgd.e(ezxVar.b() ? this.h : this.g)), ViewGroup.MarginLayoutParams.class);
            zgd.t(this.r, zgd.e(ezxVar.b() ? this.l : this.k), ViewGroup.MarginLayoutParams.class);
            h(ezxVar);
        }
        this.y = ezxVar;
    }

    @Override // defpackage.jwo
    public final void e(long j, long j2) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds((j2 - j) + 999);
        if (this.A != seconds) {
            this.A = seconds;
            TextView textView = this.n;
            String l = Long.toString(seconds);
            String string = textView.getResources().getString(R.string.up_next_in, Long.valueOf(seconds));
            int indexOf = string.indexOf(l);
            SpannableString spannableString = new SpannableString(string);
            if (indexOf != -1) {
                spannableString.setSpan(new ForegroundColorSpan(zhn.d(textView.getContext(), R.attr.ytOverlayTextPrimary)), indexOf, l.length() + indexOf, 33);
            }
            textView.setText(spannableString);
        }
    }

    @Override // defpackage.jwo
    public final void f(boolean z) {
        zag.o(this.n, !z);
        zag.o(this.o, z);
    }

    @Override // defpackage.jwo
    public final void g(auaz auazVar) {
        String str;
        arag aragVar;
        String str2;
        arag aragVar2;
        String str3;
        arag aragVar3;
        arag aragVar4;
        jwp jwpVar = this.s;
        jwpVar.j = auazVar;
        jwpVar.k = false;
        jwpVar.k = true;
        auaz auazVar2 = jwpVar.j;
        arag aragVar5 = null;
        if (auazVar2 != null) {
            ajmy ajmyVar = jwpVar.a;
            ImageView imageView = jwpVar.g;
            avhn avhnVar = auazVar2.j;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            YouTubeTextView youTubeTextView = jwpVar.e;
            auaz auazVar3 = jwpVar.j;
            if ((auazVar3.b & 2) != 0) {
                aragVar3 = auazVar3.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            youTubeTextView.setText(ajgl.b(aragVar3));
            TextView textView = jwpVar.f;
            auaz auazVar4 = jwpVar.j;
            if ((auazVar4.b & 4) != 0) {
                aragVar4 = auazVar4.e;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            textView.setText(ajgl.b(aragVar4));
            hqs.p(jwpVar.h, null, null, jwpVar.j.k, null);
            jwpVar.i.setContentDescription(jwpVar.e.getText());
            zag.o(jwpVar.d, false);
            jwpVar.d.removeAllViews();
            aopu<aunb> aopuVar = jwpVar.j.n;
            if (!aopuVar.isEmpty()) {
                for (aunb aunbVar : aopuVar) {
                    if (aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                        View inflate = LayoutInflater.from(jwpVar.c).inflate(R.layout.metadata_badge, (ViewGroup) jwpVar.d, false);
                        jwpVar.b.a(jwpVar.c, inflate).f((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                        jwpVar.d.addView(inflate);
                    }
                }
                zag.o(jwpVar.d, true);
            }
        }
        apoj b = ahfc.b(auazVar);
        if (b != null) {
            this.s.a(new jwy(this, 3));
            zag.o(this.v, true);
            TextView textView2 = this.w;
            if ((b.b & 256) != 0) {
                aragVar2 = b.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            View view = this.v;
            if ((b.b & 65536) != 0) {
                aovr aovrVar = b.r;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                str3 = aovrVar.c;
            } else {
                str3 = null;
            }
            view.setContentDescription(str3);
            this.c.u(new acte(b.t.I()), null);
        } else {
            this.s.a(null);
            zag.o(this.v, false);
        }
        apoj a = ahfc.a(auazVar);
        if (a != null) {
            ImageView imageView2 = this.q;
            if ((a.b & 65536) != 0) {
                aovr aovrVar2 = a.r;
                if (aovrVar2 == null) {
                    aovrVar2 = aovr.a;
                }
                str = aovrVar2.c;
            } else {
                str = null;
            }
            imageView2.setContentDescription(str);
            TextView textView3 = this.u;
            if ((a.b & 256) != 0) {
                aragVar = a.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView3.setText(ajgl.b(aragVar));
            View view2 = this.t;
            if ((65536 & a.b) != 0) {
                aovr aovrVar3 = a.r;
                if (aovrVar3 == null) {
                    aovrVar3 = aovr.a;
                }
                str2 = aovrVar3.c;
            } else {
                str2 = null;
            }
            view2.setContentDescription(str2);
            zag.o(this.t, true);
            this.c.u(new acte(a.t.I()), null);
        } else {
            ImageView imageView3 = this.q;
            imageView3.setContentDescription(imageView3.getResources().getString(R.string.accessibility_close_button));
            zag.o(this.t, false);
        }
        TextView textView4 = this.o;
        if ((auazVar.b & 1) != 0 && (aragVar5 = auazVar.c) == null) {
            aragVar5 = arag.a;
        }
        textView4.setText(ajgl.b(aragVar5));
        if ((auazVar.b & 8) == 0) {
            zag.o(this.p, false);
            return;
        }
        TextView textView5 = this.p;
        arag aragVar6 = auazVar.f;
        if (aragVar6 == null) {
            aragVar6 = arag.a;
        }
        textView5.setText(ajgl.b(aragVar6));
        this.p.setFocusable(true);
        zag.o(this.p, true);
    }
}
