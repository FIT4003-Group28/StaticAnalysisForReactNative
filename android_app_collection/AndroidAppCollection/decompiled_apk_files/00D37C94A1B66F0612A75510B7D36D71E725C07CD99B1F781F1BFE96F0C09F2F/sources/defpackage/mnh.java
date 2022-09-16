package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: mnh  reason: default package */
/* loaded from: classes3.dex */
public final class mnh extends mfs implements lnt, lnr {
    private final View C;
    private final Resources D;
    private final ajyc E;
    private final akbm F;
    private final ajrp G;
    private final ajrx H;
    private final snc I;

    /* renamed from: J  reason: collision with root package name */
    private final ajsa f230J;
    private final View K;
    private final FrameLayout L;
    private final TextView M;
    private final Drawable N;
    private final Drawable O;
    private final akfb P;
    private final jrp Q;
    private final Handler R;
    private final float S;
    private final FrameLayout T;
    private View U;
    private final TextView V;
    private final TextView W;
    private final ImageView X;
    private View Y;
    private ViewStub Z;
    public final View a;
    private Integer aa;
    private Integer ab;
    private CharSequence ac;
    private zda ad;
    private List ae;
    private lnu af;
    private zdd ag;
    private jro ah;
    public final SwipeLayout b;
    public final acus c;
    public aqml d;
    public ajrs e;
    public auex f;

    public mnh(Context context, ajmy ajmyVar, gem gemVar, aafo aafoVar, snc sncVar, akbn akbnVar, ajyc ajycVar, ajsa ajsaVar, akfb akfbVar, jkv jkvVar, jrp jrpVar, acus acusVar, kua kuaVar) {
        super(context, ajmyVar, aafoVar, gemVar, R.layout.playlist_video_item, jkvVar, kuaVar);
        this.H = gemVar;
        this.E = ajycVar;
        this.G = new ajrp(aafoVar, gemVar, new ajrm() { // from class: mnd
            @Override // defpackage.ajrm
            public final boolean h(View view) {
                mnh mnhVar = mnh.this;
                if (mnhVar.c.b(mnhVar.f)) {
                    acus acusVar2 = mnhVar.c;
                    acti actiVar = mnhVar.e.a;
                    auex auexVar = mnhVar.f;
                    aqxo.p(acusVar2.b(auexVar));
                    actiVar.H(3, acun.a(acusVar2.c(auexVar)), null);
                    return false;
                }
                return false;
            }
        });
        this.I = sncVar;
        Resources resources = this.g.getResources();
        this.D = resources;
        this.f230J = ajsaVar;
        this.P = akfbVar;
        this.Q = jrpVar;
        this.c = acusVar;
        View view = this.i;
        this.a = view;
        this.b = (SwipeLayout) view.findViewById(R.id.swipe_layout);
        View findViewById = view.findViewById(R.id.playlist_video_item);
        this.K = findViewById;
        this.W = (TextView) view.findViewById(R.id.contributor_name);
        this.X = (ImageView) view.findViewById(R.id.contributor_avatar);
        View findViewById2 = view.findViewById(R.id.video_info_view);
        this.L = (FrameLayout) findViewById2.findViewById(R.id.body_start_container);
        this.M = (TextView) findViewById2.findViewById(R.id.index);
        TextView textView = (TextView) findViewById2.findViewById(R.id.offer_button);
        this.V = textView;
        this.C = findViewById2.findViewById(R.id.thumbnail_layout);
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.duration_text);
        this.T = (FrameLayout) findViewById2.findViewById(R.id.drag_handle_container);
        this.F = akbnVar.a(textView);
        this.Z = (ViewStub) view.findViewById(R.id.drag_handle);
        TextView textView3 = this.j;
        this.S = textView3 != null ? textView3.getTextSize() : 0.0f;
        this.N = findViewById.getBackground();
        ColorDrawable colorDrawable = new ColorDrawable(zhn.j(context, R.attr.ytGeneralBackgroundA).orElse(0));
        this.O = colorDrawable;
        colorDrawable.setAlpha(resources.getInteger(R.integer.list_item_dragging_background_alpha));
        this.R = new Handler(Looper.getMainLooper());
        gemVar.c(findViewById);
    }

    private static apmi d(auex auexVar) {
        apmg apmgVar = auexVar.m;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 2) != 0) {
            apmg apmgVar2 = auexVar.m;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apmi apmiVar = apmgVar2.d;
            return apmiVar == null ? apmi.a : apmiVar;
        }
        return null;
    }

    private static final int e(View view, int i) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        zgd.t(view, zgd.b(zgd.l(i), zgd.k(i)), ViewGroup.MarginLayoutParams.class);
        return marginStart;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.lnt
    public final void c(ajru ajruVar, ajsm ajsmVar, int i) {
        if (ajruVar != this) {
            return;
        }
        this.K.setBackground(this.O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x050a  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.graphics.drawable.Drawable] */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnh.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.lnr
    public final void oM(ajru ajruVar, ajsm ajsmVar, int i, int i2) {
        if (ajruVar != this) {
            return;
        }
        this.K.setBackground(this.N);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        lnu lnuVar = this.af;
        if (lnuVar != null) {
            lnu.h(lnuVar.g, this);
            lnu.h(this.af.e, this);
            this.af.b.remove(this);
            this.af = null;
        }
        View view = this.Y;
        if (view != null) {
            view.setOnTouchListener(null);
            this.Y.setOnClickListener(null);
        }
        zdd zddVar = this.ag;
        if (zddVar != null) {
            zddVar.c();
        }
        Integer num = this.aa;
        if (num != null) {
            e(this.Y, num.intValue());
            this.aa = null;
        }
        Integer num2 = this.ab;
        if (num2 != null) {
            e(this.L, num2.intValue());
            this.ab = null;
        }
        this.G.c();
        mpe.b(this.ad, this.b, this.ae, ajsaVar);
        this.ad = null;
        this.d = null;
        jro jroVar = this.ah;
        if (jroVar != null) {
            jroVar.b.m(jroVar);
            jroVar.b.m(jroVar.d);
            jroVar.d.b(jroVar.j);
            jroVar.c.b(jroVar.i);
            jroVar.f.setTextColor(zhn.j(jroVar.a, R.attr.ytTextSecondary).orElse(0));
            jroVar.f.setMaxLines(1);
            jroVar.e.getViewTreeObserver().removeOnGlobalLayoutListener(jroVar.h);
            zag.o(jroVar.e, true);
            zag.o(jroVar.g, false);
            jroVar.k = null;
            jroVar.l = null;
            this.ah = null;
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setTextSize(0, this.S);
        }
        this.e = null;
        this.f = null;
    }
}
