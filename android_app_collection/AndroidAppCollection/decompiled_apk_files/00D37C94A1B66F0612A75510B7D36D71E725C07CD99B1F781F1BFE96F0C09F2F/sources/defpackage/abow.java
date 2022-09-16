package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatBannerContainerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatBannerHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatItemRenderer;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abow  reason: default package */
/* loaded from: classes.dex */
public final class abow implements View.OnClickListener, abqv, abkx, aboc {
    private final acti A;
    private apzg C;
    private boolean D;
    private apzg E;
    protected final View a;
    final LiveChatBannerContainerLayout b;
    public final ImageView c;
    public final LottieAnimationView d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final aafo h;
    public final ajyi i;
    protected final ajsk k;
    public final abky l;
    public abhd m;
    public aunb n;
    public ajru o;
    public ObjectAnimator p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public apzg u;
    public View.OnLayoutChangeListener v;
    private final ImageButton w;
    private final ViewGroup x;
    private final TextView y;
    private final Handler z;
    public final ajrs j = new ajrs();
    private final Runnable B = new abot(this);

    public abow(Context context, ajyi ajyiVar, abky abkyVar, aafo aafoVar, ajsk ajskVar, acti actiVar, Handler handler, View view) {
        this.h = aafoVar;
        this.a = view;
        this.i = ajyiVar;
        this.k = ajskVar;
        this.A = actiVar;
        this.l = abkyVar;
        this.z = handler;
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = (LiveChatBannerContainerLayout) view.findViewById(R.id.live_chat_banner);
        this.b = liveChatBannerContainerLayout;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.foreground_content);
        this.e = viewGroup;
        ImageView imageView = (ImageView) view.findViewById(R.id.background_image);
        this.c = imageView;
        this.d = (LottieAnimationView) view.findViewById(R.id.background_animation);
        this.y = (TextView) view.findViewById(R.id.header_text);
        this.w = (ImageButton) view.findViewById(R.id.context_menu_toggle);
        this.f = (ViewGroup) view.findViewById(R.id.banner_content);
        this.x = (ViewGroup) view.findViewById(R.id.header_mid_section_container);
        this.g = (ViewGroup) view.findViewById(R.id.live_chat_banner_container);
        viewGroup.setOnClickListener(this);
        liveChatBannerContainerLayout.b = new abos(this);
        imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_banner_background, null));
        ajyiVar.a(assn.class);
    }

    private final void l() {
        zgd.t(this.f, zgd.e(this.D && !this.r ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_content_bottom_margin) : 0), ViewGroup.MarginLayoutParams.class);
        boolean z = this.D;
        this.e.setPaddingRelative(z ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_start) : 0, 0, z ? this.a.getContext().getResources().getDimensionPixelOffset(R.dimen.live_chat_banner_padding_end) : 0, 0);
    }

    private final void m() {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.p.end();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, 0.0f);
        this.p = ofFloat;
        ofFloat.setDuration(200L);
        this.p.addListener(new abov(this));
        this.p.start();
    }

    private final void n(boolean z) {
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.p.end();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, this.b.getTranslationY(), -this.b.getHeight());
        this.p = ofFloat;
        ofFloat.setDuration(200L);
        this.p.addListener(new abou(this, z));
        this.p.start();
    }

    private final void o() {
        k(false);
    }

    @Override // defpackage.aboc
    public final void a(CharSequence charSequence) {
        this.f.setContentDescription(charSequence);
    }

    @Override // defpackage.abkx
    public final int b() {
        return 0;
    }

    @Override // defpackage.abkx
    public final void c() {
        this.z.removeCallbacks(this.B);
        n(false);
    }

    public final void d() {
        float width = this.e.getWidth() / this.d.getDrawable().getIntrinsicWidth();
        Matrix matrix = new Matrix();
        matrix.setScale(width, width);
        this.d.setImageMatrix(matrix);
    }

    public final void e(asqg asqgVar) {
        aovr aovrVar;
        int i = asqgVar.b;
        if ((i & 4) != 0) {
            if ((i & 2) != 0) {
                aunb aunbVar = asqgVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (!aunbVar.qn(LiveChatBannerHeaderRendererOuterClass.liveChatBannerHeaderRenderer)) {
                    return;
                }
            }
            aunb aunbVar2 = asqgVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (!aunbVar2.qn(LiveChatItemRenderer.liveChatTextMessageRenderer) && !aunbVar2.qn(ElementRendererOuterClass.elementRenderer)) {
                return;
            }
            int y = akzj.y(asqgVar.k);
            if (y == 0 || y != 3) {
                this.t = false;
                if (this.d.o()) {
                    this.d.c();
                }
                this.d.setVisibility(8);
                this.c.setVisibility(0);
            } else {
                this.t = true;
                LottieAnimationView lottieAnimationView = this.d;
                if (lottieAnimationView.f == null) {
                    lottieAnimationView.q(new bxr() { // from class: abor
                        @Override // defpackage.bxr
                        public final void a(bwx bwxVar) {
                            final abow abowVar = abow.this;
                            abowVar.v = new View.OnLayoutChangeListener() { // from class: aboq
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                    abow.this.d();
                                }
                            };
                            abowVar.e.addOnLayoutChangeListener(abowVar.v);
                            abowVar.d();
                            if (abowVar.t) {
                                abowVar.c.setVisibility(8);
                                abowVar.d.e();
                                abowVar.d.setVisibility(0);
                            }
                        }
                    });
                    this.d.f(R.raw.background_shimmer_lottie);
                } else {
                    this.c.setVisibility(8);
                    this.d.e();
                    this.d.setVisibility(0);
                }
            }
            this.b.a = !asqgVar.f;
            apzg apzgVar = asqgVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.E = apzgVar;
            apzg apzgVar2 = asqgVar.i;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            this.u = apzgVar2;
            this.z.removeCallbacks(this.B);
            if (this.r) {
                o();
            }
            this.j.h();
            this.j.f("on_content_clicked_listener", this);
            this.j.f("accessibility_data_receiver_key", this);
            this.j.a(this.A);
            this.f.removeAllViews();
            if ((asqgVar.b & 2) != 0) {
                this.D = true;
                aunb aunbVar3 = asqgVar.d;
                if (aunbVar3 == null) {
                    aunbVar3 = aunb.a;
                }
                asqf asqfVar = (asqf) aunbVar3.qm(LiveChatBannerHeaderRendererOuterClass.liveChatBannerHeaderRenderer);
                if ((asqfVar.b & 4) != 0) {
                    aunb aunbVar4 = asqfVar.d;
                    if (aunbVar4 == null) {
                        aunbVar4 = aunb.a;
                    }
                    apoj apojVar = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
                    if ((apojVar.b & 131072) != 0) {
                        aovs aovsVar = apojVar.s;
                        if (aovsVar == null) {
                            aovsVar = aovs.a;
                        }
                        aovrVar = aovsVar.c;
                        if (aovrVar == null) {
                            aovrVar = aovr.a;
                        }
                    } else {
                        aovrVar = apojVar.r;
                        if (aovrVar == null) {
                            aovrVar = aovr.a;
                        }
                    }
                    if (aovrVar != null) {
                        this.w.setContentDescription(aovrVar.c);
                    }
                    if ((apojVar.b & 32768) != 0) {
                        apzg apzgVar3 = apojVar.p;
                        if (apzgVar3 == null) {
                            apzgVar3 = apzg.a;
                        }
                        this.C = apzgVar3;
                    }
                    this.w.setOnClickListener(this);
                    this.w.setVisibility(0);
                } else {
                    this.w.setVisibility(8);
                }
                TextView textView = this.y;
                arag aragVar = asqfVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                zag.m(textView, ajgl.b(aragVar));
            } else {
                this.D = false;
                this.y.setText((CharSequence) null);
                this.y.setVisibility(8);
                this.w.setVisibility(8);
            }
            aunb aunbVar5 = asqgVar.e;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            this.n = aunbVar5;
            j(aunbVar5);
            ajsk ajskVar = this.k;
            if (ajskVar != null) {
                ajskVar.a(asqgVar, this.g);
            }
            l();
            if (!this.q) {
                if (this.s) {
                    m();
                    this.z.postDelayed(this.B, 7000L);
                    abhd abhdVar = this.m;
                    if (abhdVar != null) {
                        abhdVar.f();
                    }
                } else {
                    this.l.b(this);
                }
                this.q = true;
                return;
            }
            h();
        }
    }

    public final void f() {
        if (!this.q) {
            return;
        }
        n(true);
    }

    @Override // defpackage.abqv
    public final void g() {
        o();
    }

    public final void h() {
        this.z.postDelayed(this.B, 7000L);
        abhd abhdVar = this.m;
        if (abhdVar != null) {
            abhdVar.f();
        }
    }

    @Override // defpackage.abkx
    public final void i() {
        m();
        this.z.postDelayed(this.B, 7000L);
        abhd abhdVar = this.m;
        if (abhdVar != null) {
            abhdVar.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ajsa] */
    public final void j(aunb aunbVar) {
        Object qm;
        if (aunbVar == null) {
            return;
        }
        if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            qm = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
        } else {
            qm = aunbVar.qm(LiveChatItemRenderer.liveChatTextMessageRenderer);
        }
        ajru h = akel.h(this.i.get(), qm, (ViewGroup) this.a);
        this.o = h;
        if (h == null) {
            return;
        }
        h.oK(this.j, qm);
        this.f.addView(this.o.a());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.w) {
            aunb aunbVar = this.n;
            HashMap hashMap = null;
            if (aunbVar != null && aunbVar.qn(LiveChatItemRenderer.liveChatTextMessageRenderer)) {
                hashMap = new HashMap();
                hashMap.put("context_menu_header_renderer_key", this.n.qm(LiveChatItemRenderer.liveChatTextMessageRenderer));
            }
            this.h.c(this.C, hashMap);
            return;
        }
        o();
    }

    public final void k(boolean z) {
        boolean z2 = true;
        int i = 0;
        if (z) {
            if (this.r) {
                return;
            }
        } else if (this.r) {
            z2 = false;
        }
        this.r = z2;
        this.z.removeCallbacks(this.B);
        this.f.removeAllViews();
        this.j.f("render_content_collapsed", Boolean.valueOf(this.r));
        LiveChatBannerContainerLayout liveChatBannerContainerLayout = this.b;
        bnr bnrVar = new bnr();
        bnrVar.f(new bnb());
        bnrVar.f(new bne());
        bnrVar.J(0);
        bnrVar.z(this.b);
        bnrVar.z(this.g);
        bnrVar.z(this.c);
        bnrVar.z(this.d);
        bnrVar.z(this.x);
        bnrVar.z(this.y);
        bnrVar.z(this.f);
        bno.b(liveChatBannerContainerLayout, bnrVar);
        TextView textView = this.y;
        if (this.r || textView.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        j(this.n);
        l();
        if (this.r) {
            apzg apzgVar = this.E;
            if (apzgVar != null) {
                this.h.c(apzgVar, null);
            }
        } else {
            apzg apzgVar2 = this.u;
            if (apzgVar2 != null) {
                this.h.c(apzgVar2, null);
            }
        }
        this.e.sendAccessibilityEvent(8);
    }
}
