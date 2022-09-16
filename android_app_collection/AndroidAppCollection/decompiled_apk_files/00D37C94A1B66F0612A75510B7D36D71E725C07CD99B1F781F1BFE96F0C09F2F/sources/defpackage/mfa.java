package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.List;
/* compiled from: PG */
/* renamed from: mfa  reason: default package */
/* loaded from: classes3.dex */
public final class mfa implements ajru {
    private final gfu A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private mqf H;
    private mqf I;

    /* renamed from: J  reason: collision with root package name */
    private List f225J;
    private gdr K;
    private gef L;
    private String M;
    private boolean N;
    private Drawable O;
    private Drawable P;
    private boolean Q;
    private int R;
    private int S;
    private Drawable T;
    private mex U;
    public final dt a;
    public final View b;
    public final ajxz c;
    public final aakn d;
    public final TextView e;
    public boolean f;
    public Runnable g;
    public boq h;
    public boolean i;
    public final lmm j;
    private final ajmy k;
    private final TextView l;
    private final TextView m;
    private final ImageView n;
    private final TextView o;
    private final DurationBadgeView p;
    private final ImageView q;
    private final ImageView r;
    private final ImageView s;
    private final ViewGroup t;
    private final ajrp u;
    private final ajmu v;
    private final jku w;
    private final gdq x = new gdq() { // from class: mew
        @Override // defpackage.gdq
        public final void a() {
            mfa mfaVar = mfa.this;
            boolean z = mfaVar.f;
            boolean e = mfaVar.e();
            mfaVar.f = e;
            if (z != e) {
                mfaVar.d();
            }
        }
    };
    private final akem y;
    private final mqg z;

    /* JADX INFO: Access modifiers changed from: protected */
    public mfa(final dt dtVar, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, aakn aaknVar, lmm lmmVar, jkv jkvVar, akem akemVar, mqg mqgVar, gfu gfuVar, ViewGroup viewGroup, int i, int i2) {
        this.a = dtVar;
        this.k = ajmyVar;
        this.c = ajxzVar;
        this.d = aaknVar;
        this.j = lmmVar;
        this.y = akemVar;
        this.z = mqgVar;
        this.A = gfuVar;
        View inflate = LayoutInflater.from(dtVar).inflate(i, viewGroup, false);
        this.b = inflate;
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.channel);
        this.n = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.e = (TextView) inflate.findViewById(R.id.video_info);
        this.r = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.p = (DurationBadgeView) inflate.findViewById(R.id.duration);
        this.o = (TextView) inflate.findViewById(R.id.unplayable_reason);
        this.s = (ImageView) inflate.findViewById(R.id.three_dots_menu);
        this.t = (ViewGroup) inflate.findViewById(R.id.action_buttons);
        this.q = (ImageView) inflate.findViewById(R.id.equalizer);
        ajmt b = ajmyVar.c().b();
        b.c(false);
        b.b(2131231886);
        this.v = b.a();
        this.u = new ajrp(aafoVar, inflate);
        this.w = jkvVar.a((ViewStub) inflate.findViewById(R.id.offline_badge), null);
        this.G = i2;
        this.E = 1;
        this.F = 2;
        this.B = zhn.d(dtVar, R.attr.ytTextPrimary);
        this.C = zhn.d(dtVar, R.attr.ytTextSecondary);
        this.D = zhn.d(dtVar, R.attr.ytBadgeChipBackground);
        inflate.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mev
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                mfa mfaVar = mfa.this;
                boolean z = true;
                boolean z2 = zew.n(dtVar.getResources().getDisplayMetrics(), Math.abs(i5 - i3)) >= 350;
                if (mfaVar.i == z2) {
                    return;
                }
                mfaVar.i = z2;
                TextView textView = mfaVar.e;
                if (!z2 || TextUtils.isEmpty(textView.getText())) {
                    z = false;
                }
                zag.o(textView, z);
            }
        });
    }

    private final View f(boolean z) {
        View inflate = LayoutInflater.from(this.t.getContext()).inflate(this.G, this.t, false);
        inflate.setBackground(null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.button_icon);
        imageView.setImageResource(true != z ? 2131233479 : 2131233481);
        imageView.setImageTintList(zhn.f(this.t.getContext(), R.attr.ytIconDisabled));
        return inflate;
    }

    private final mqf g() {
        return this.z.b(this.t, this.G, null);
    }

    private final void h() {
        mqf mqfVar = this.H;
        if (mqfVar != null) {
            mqfVar.b();
        }
        mqf mqfVar2 = this.I;
        if (mqfVar2 != null) {
            mqfVar2.b();
        }
        this.t.removeAllViews();
    }

    private final void i() {
        boolean z = false;
        if (this.t.getChildCount() > 0 && this.f && this.o.getVisibility() == 8) {
            z = true;
        }
        this.l.setMaxLines(z ? this.E : this.F);
        zag.o(this.t, z);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final boolean e() {
        gdr gdrVar = this.K;
        return (gdrVar == null || gdrVar.b() == null || this.M == null) ? this.N : akzj.f(this.K.b(), this.M);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        asos asosVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        ampq ampqVar;
        final audk audkVar = ((mez) obj).a;
        final acti actiVar = ajrsVar.a;
        final aafo aafoVar = (aafo) ajrsVar.c("commandRouter");
        if (aafoVar != null) {
            this.u.a = aafoVar;
        }
        ajrp ajrpVar = this.u;
        arag aragVar6 = null;
        if ((audkVar.b & 256) != 0) {
            apzgVar = audkVar.m;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, null);
        mex mexVar = new mex(actiVar, audkVar);
        this.U = mexVar;
        mexVar.a();
        gef gefVar = (gef) ajrsVar.c("PLAYLIST_VIDEO_INTERACTION_LOGGING_TRIGGER");
        this.L = gefVar;
        if (gefVar != null) {
            gefVar.pf(this.U);
        }
        this.O = null;
        this.P = null;
        if (this.A.a() == gfs.LIGHT) {
            avhn avhnVar = audkVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if ((avhnVar.b & 512) != 0) {
                avhn avhnVar2 = audkVar.f;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                asosVar = avhnVar2.h;
                if (asosVar == null) {
                    asosVar = asos.a;
                }
            } else {
                if ((audkVar.b & 67108864) != 0) {
                    asosVar = audkVar.x;
                    if (asosVar == null) {
                        asosVar = asos.a;
                    }
                }
                asosVar = null;
            }
        } else {
            if (this.A.a() == gfs.DARK) {
                avhn avhnVar3 = audkVar.f;
                if (avhnVar3 == null) {
                    avhnVar3 = avhn.a;
                }
                if ((avhnVar3.b & 1024) != 0) {
                    avhn avhnVar4 = audkVar.f;
                    if (avhnVar4 == null) {
                        avhnVar4 = avhn.a;
                    }
                    asosVar = avhnVar4.i;
                    if (asosVar == null) {
                        asosVar = asos.a;
                    }
                } else if ((audkVar.b & 134217728) != 0) {
                    asosVar = audkVar.y;
                    if (asosVar == null) {
                        asosVar = asos.a;
                    }
                }
            }
            asosVar = null;
        }
        if (asosVar != null) {
            this.R = (asosVar.e & 16777215) | (-16777216);
            this.S = (asosVar.f & 16777215) | (-16777216);
            this.T = new ColorDrawable((asosVar.d & 16777215) | (-234881024));
        } else {
            this.R = this.B;
            this.S = this.C;
            this.T = new ColorDrawable(this.D);
        }
        TextView textView = this.l;
        if ((audkVar.b & 1) != 0) {
            aragVar = audkVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.m;
        int i = audkVar.b;
        if ((i & 4) != 0) {
            aragVar2 = audkVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else if ((i & 2) != 0) {
            aragVar2 = audkVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        if ((audkVar.b & 33554432) != 0) {
            aragVar3 = audkVar.v;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        Spanned b = ajgl.b(aragVar3);
        this.e.setText(b);
        zag.o(this.e, this.i && !TextUtils.isEmpty(b));
        DurationBadgeView durationBadgeView = this.p;
        if ((audkVar.b & 16) != 0) {
            aragVar4 = audkVar.g;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        Spanned b2 = ajgl.b(aragVar4);
        if ((audkVar.b & 16) != 0) {
            aragVar5 = audkVar.g;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        hqs.p(durationBadgeView, b2, ajgl.i(aragVar5), audkVar.h, null);
        TextView textView3 = this.o;
        if ((audkVar.b & 2048) != 0 && (aragVar6 = audkVar.n) == null) {
            aragVar6 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar6));
        ajmy ajmyVar = this.k;
        ImageView imageView = this.r;
        avhn avhnVar5 = audkVar.f;
        if (avhnVar5 == null) {
            avhnVar5 = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar5, this.v);
        ates atesVar = audkVar.q;
        if (atesVar == null) {
            atesVar = ates.a;
        }
        if ((atesVar.b & 1) == 0) {
            zag.o(this.s, false);
            zgd.t(this.l, zgd.k(this.a.getResources().getDimensionPixelSize(R.dimen.compact_playlist_panel_video_title_margin_end_when_no_three_dots)), ViewGroup.MarginLayoutParams.class);
        } else {
            zag.o(this.s, true);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: meu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    mfa mfaVar = mfa.this;
                    audk audkVar2 = audkVar;
                    aafo aafoVar2 = aafoVar;
                    acti actiVar2 = actiVar;
                    dt dtVar = mfaVar.a;
                    ates atesVar2 = audkVar2.q;
                    if (atesVar2 == null) {
                        atesVar2 = ates.a;
                    }
                    atep atepVar = atesVar2.c;
                    if (atepVar == null) {
                        atepVar = atep.a;
                    }
                    akbc.b(dtVar, atepVar, aafoVar2, mfaVar.c, amup.l("com.google.android.libraries.youtube.innertube.endpoint.tag", audkVar2, "com.google.android.libraries.youtube.logging.interaction_logger", actiVar2), new kge(actiVar2, 3), mfaVar.d, mfaVar.j);
                }
            });
            zgd.t(this.l, zgd.k(0), ViewGroup.MarginLayoutParams.class);
        }
        avxe avxeVar = audkVar.u;
        if (avxeVar == null) {
            avxeVar = avxe.a;
        }
        if ((avxeVar.b & 1) != 0) {
            avxe avxeVar2 = audkVar.u;
            if (avxeVar2 == null) {
                avxeVar2 = avxe.a;
            }
            ajrsVar.f("VideoPresenterConstants.VIDEO_ID", avxeVar2.c);
        }
        this.w.b(ajrsVar);
        h();
        for (aunb aunbVar : audkVar.w) {
            auxb auxbVar = (auxb) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
            if (auxbVar.c) {
                if (this.H == null) {
                    this.H = g();
                }
                ampqVar = ampq.j(this.H);
            } else if (auxbVar.d) {
                if (this.I == null) {
                    this.I = g();
                }
                ampqVar = ampq.j(this.I);
            } else {
                ampqVar = amon.a;
            }
            if (ampqVar.h()) {
                ((mqf) ampqVar.c()).h = ColorStateList.valueOf(this.R);
                ((mqf) ampqVar.c()).k(auxbVar);
                this.t.addView(((mqf) ampqVar.c()).c);
            }
        }
        i();
        this.K = (gdr) ajrsVar.c("PLAYLIST_CURRENT_VIDEO_MONITOR");
        this.M = audkVar.o;
        this.N = audkVar.k;
        this.f = e();
        d();
        gdr gdrVar = this.K;
        if (gdrVar != null) {
            gdrVar.c(this.x);
        }
        if ((audkVar.b & 32) != 0) {
            ajmy ajmyVar2 = this.k;
            ImageView imageView2 = this.n;
            avhn avhnVar6 = audkVar.i;
            if (avhnVar6 == null) {
                avhnVar6 = avhn.a;
            }
            ajmyVar2.k(imageView2, avhnVar6, this.v);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        gdr gdrVar = this.K;
        if (gdrVar != null) {
            gdrVar.pe(this.x);
            this.K = null;
        }
        gef gefVar = this.L;
        if (gefVar != null) {
            gefVar.f(this.U);
            this.L = null;
        }
        this.U = null;
        this.O = null;
        h();
    }

    public final void d() {
        Drawable drawable;
        View view = this.b;
        if (this.f) {
            if (!this.y.d()) {
                drawable = this.T;
            } else {
                if (this.O == null) {
                    akej a = akej.a(this.a);
                    a.a = zhn.d(this.a, R.attr.ytTouchResponse);
                    a.b = this.T;
                    this.O = a.b();
                }
                drawable = this.O;
            }
        } else if (!this.y.d()) {
            drawable = null;
        } else {
            if (this.P == null) {
                akej a2 = akej.a(this.a);
                a2.a = zhn.d(this.a, R.attr.ytTouchResponse);
                this.P = a2.b();
            }
            drawable = this.P;
        }
        view.setBackground(drawable);
        this.l.setTextColor(this.f ? this.R : this.B);
        this.m.setTextColor(this.f ? this.S : this.C);
        this.e.setTextColor(this.f ? this.S : this.C);
        this.o.setTextColor(this.f ? this.S : this.C);
        this.s.setImageTintList(ColorStateList.valueOf(this.f ? this.R : this.B));
        if (this.f && this.t.getChildCount() == 0) {
            if (this.f225J == null) {
                this.f225J = amuk.s(f(true), f(false));
            }
            amzt listIterator = ((amuk) this.f225J).listIterator();
            while (listIterator.hasNext()) {
                this.t.addView((View) listIterator.next());
            }
        }
        i();
        if (this.f) {
            this.q.setVisibility(0);
            if (!this.Q) {
                boq a3 = boq.a(this.b.getContext(), R.drawable.audio_indicator_24dp_animation);
                this.h = a3;
                this.q.setImageDrawable(a3);
                this.g = new Runnable() { // from class: mey
                    @Override // java.lang.Runnable
                    public final void run() {
                        mfa mfaVar = mfa.this;
                        mfaVar.h.start();
                        mfaVar.b.postDelayed(mfaVar.g, 2140L);
                    }
                };
                this.Q = true;
            }
            this.h.start();
            this.b.postDelayed(this.g, 2140L);
        } else {
            this.b.removeCallbacks(this.g);
            this.q.setVisibility(8);
            boq boqVar = this.h;
            if (boqVar != null) {
                boqVar.stop();
            }
        }
        zag.o(this.p, !this.f);
    }
}
