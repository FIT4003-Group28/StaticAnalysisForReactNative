package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ajhr  reason: default package */
/* loaded from: classes.dex */
public final class ajhr implements srr {
    ViewGroup a;
    public WeakReference b;
    public acti c;
    private final Context d;
    private final axnm e;
    private final axnm f;
    private Handler g = null;
    private aypf h;
    private dci i;
    private awsq j;
    private tcs k;
    private String l;
    private String m;
    private final teb n;

    public ajhr(Context context, axnm axnmVar, axnm axnmVar2, teb tebVar) {
        this.d = context;
        this.e = axnmVar;
        this.f = axnmVar2;
        this.n = tebVar;
    }

    private final FrameLayout h(awnn awnnVar, acti actiVar) {
        aypf aypfVar = this.h;
        if (aypfVar != null) {
            dci dciVar = new dci(this.d);
            cyv cyvVar = dciVar.t;
            swq swqVar = (swq) this.e.get();
            tcz a = tda.a();
            a.a = dciVar;
            a.f(false);
            czf c = ComponentTree.c(dciVar.t, swqVar.a(cyvVar, a.a(), awnnVar.toByteArray(), actiVar != null ? ajjk.v(actiVar) : null, aypfVar));
            c.d = false;
            dciVar.G(c.a());
            dciVar.setBackgroundColor(zhn.d(this.d, R.attr.ytBrandBackgroundSolid));
            this.i = dciVar;
        }
        FrameLayout frameLayout = new FrameLayout(this.d);
        frameLayout.setId(R.id.bottom_sheet_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setClickable(true);
        dci dciVar2 = this.i;
        if (dciVar2 != null) {
            frameLayout.addView(dciVar2, layoutParams);
        }
        frameLayout.setImportantForAccessibility(2);
        return frameLayout;
    }

    private static apzg i(tcs tcsVar) {
        ajjf ajjfVar;
        Object obj = tcsVar.d;
        if (!(obj instanceof ajjf) || (ajjfVar = (ajjf) obj) == null) {
            return null;
        }
        return ajjfVar.d;
    }

    private static final acti j(tcs tcsVar) {
        ajjf ajjfVar;
        tdq tdqVar = tcsVar.f;
        acti w = tdqVar != null ? ajjk.w(tdqVar) : null;
        Object obj = tcsVar.d;
        return (!(obj instanceof ajjf) || w != null || (ajjfVar = (ajjf) obj) == null) ? w : ajjfVar.c;
    }

    private final ViewGroup k(int i) {
        if (i == 6) {
            return (ViewGroup) ((Activity) this.d).getWindow().findViewById(R.id.bottom_ui_container);
        }
        return (ViewGroup) ((Activity) this.d).getWindow().findViewById(R.id.interstitials_container);
    }

    private final void l(awnn awnnVar, int i, int i2, acti actiVar, apzg apzgVar, boolean z, int i3) {
        FrameLayout.LayoutParams layoutParams;
        a();
        this.h = new aypf();
        if (i == 3 || i == 4) {
            ViewGroup k = k(i);
            if (k == null) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            k.addView(h(awnnVar, actiVar), layoutParams2);
            k.setVisibility(0);
            this.a = k;
        } else if (i == 6) {
            ViewGroup k2 = k(6);
            if (k2 == null) {
                return;
            }
            int k3 = zew.k(this.d);
            if (i3 <= 0) {
                i3 = 600;
            }
            if (k3 >= i3) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388693;
                layoutParams.width = zew.i(this.d.getResources().getDisplayMetrics(), 360);
                layoutParams.bottomMargin = zew.i(this.d.getResources().getDisplayMetrics(), 20);
                layoutParams.setMarginEnd(zew.i(this.d.getResources().getDisplayMetrics(), 8));
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
            }
            k2.addView(h(awnnVar, actiVar), layoutParams);
            k2.setVisibility(0);
            this.a = k2;
        } else {
            tcs tcsVar = this.k;
            ajhz ajhzVar = new ajhz();
            awnnVar.getClass();
            Bundle bundle = new Bundle();
            aphq.m(bundle, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", awnnVar);
            ajhzVar.ae(bundle);
            ajhz.aJ(ajhzVar, tcsVar, actiVar);
            ajhzVar.ap = i2;
            ajhzVar.ai = i3;
            ajhzVar.ah = false;
            ajhzVar.qv(((dt) this.d).getSupportFragmentManager(), ajhzVar.F);
            this.b = new WeakReference(ajhzVar);
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (actiVar == null || !z) {
                return;
            }
            actiVar.d(acuo.a(123695), apzgVar, null);
        }
    }

    @Override // defpackage.srr
    public final void a() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            ajhz ajhzVar = (ajhz) weakReference.get();
            if (ajhzVar != null) {
                ajhzVar.dismiss();
            }
            this.b = null;
        }
        this.c = null;
        this.j = null;
        this.k = null;
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            dci dciVar = this.i;
            if (dciVar != null) {
                viewGroup.removeView(dciVar);
                this.i = null;
            }
            this.a.setVisibility(8);
            this.a = null;
        }
        aypf aypfVar = this.h;
        if (aypfVar != null) {
            aypfVar.qr();
            this.h = null;
        }
    }

    @Override // defpackage.srr
    public final void b(byte[] bArr, String str) {
        ajhz ajhzVar;
        acti actiVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajhzVar = (ajhz) weakReference.get()) == null || !str.contentEquals(ajhzVar.ak) || (actiVar = this.c) == null) {
            return;
        }
        actiVar.D(new acte(bArr));
    }

    @Override // defpackage.srr
    public final void c(String str) {
        ajhz ajhzVar;
        final tcs tcsVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajhzVar = (ajhz) weakReference.get()) == null || !str.contentEquals(ajhzVar.ak)) {
            return;
        }
        aloh m = aloh.m(((dt) this.d).getWindow().getDecorView().findViewById(16908290), this.d.getString(R.string.error_text_with_bottom_sheet), 0);
        View findViewById = m.e.findViewById(R.id.snackbar_action);
        String string = this.d.getString(R.string.error_with_bottom_sheet_button);
        findViewById.setContentDescription(string);
        findViewById.setBackground(null);
        final awsq awsqVar = this.j;
        if (awsqVar != null && (tcsVar = this.k) != null) {
            m.o(string, new View.OnClickListener() { // from class: ajho
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ajhr ajhrVar = ajhr.this;
                    final awsq awsqVar2 = awsqVar;
                    final tcs tcsVar2 = tcsVar;
                    view.post(new Runnable() { // from class: ajhq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajhr.this.d(awsqVar2, tcsVar2);
                        }
                    });
                }
            });
        }
        m.l();
        if (ajhzVar.mJ() != null) {
            a();
        }
        m.g();
    }

    @Override // defpackage.srr
    public final void d(awsq awsqVar, tcs tcsVar) {
        String str;
        if (awsqVar == null) {
            this.n.c(23, "ShowActionSheetCommand needs to provided.", tcsVar.i);
        } else if (awsqVar.f.size() > 0 || (awsqVar.c & 4) != 0) {
            acti j = j(tcsVar);
            if (j == null) {
                j = ajjk.w(tcsVar.f);
            }
            a();
            apzg i = i(tcsVar);
            if (i == null) {
                i = apzg.a;
            }
            if (j != null && awsqVar.i) {
                atnp atnpVar = (atnp) i.qm(atno.b);
                if (TextUtils.isEmpty(this.m) || ((str = this.l) != null && !str.contentEquals(atnpVar.c))) {
                    this.m = atnpVar.c;
                } else {
                    aopc aopcVar = (aopc) i.mo52toBuilder();
                    aopg aopgVar = atno.b;
                    aopa mo52toBuilder = atnpVar.mo52toBuilder();
                    String str2 = this.m;
                    mo52toBuilder.copyOnWrite();
                    atnp atnpVar2 = (atnp) mo52toBuilder.instance;
                    str2.getClass();
                    atnpVar2.b |= 1;
                    atnpVar2.c = str2;
                    aopcVar.e(aopgVar, (atnp) mo52toBuilder.mo39build());
                    i = (apzg) aopcVar.mo39build();
                }
                j.d(acuo.a(123695), i, null);
                this.l = j.k();
            }
            if (awsqVar.i) {
                this.c = j;
            }
            ajhz ajhzVar = new ajhz();
            Bundle bundle = new Bundle();
            aphq.m(bundle, "COMMAND_BOTTOM_SHEET_FRAGMENT_KEY", awsqVar);
            ajhzVar.ae(bundle);
            ajhz.aJ(ajhzVar, tcsVar, j);
            ajhzVar.qv(((dt) this.d).getSupportFragmentManager(), ajhzVar.F);
            this.b = new WeakReference(ajhzVar);
            this.j = awsqVar;
            this.k = tcsVar;
            if ((awsqVar.c & 8) == 0) {
                return;
            }
            tcu tcuVar = (tcu) this.f.get();
            awmt awmtVar = awsqVar.h;
            if (awmtVar == null) {
                awmtVar = awmt.a;
            }
            tcuVar.b(awmtVar, tcsVar).Q();
        } else {
            this.n.c(23, "ShowActionSheetCommand needs to have at least one list option when there is not sheet id.", tcsVar.i);
        }
    }

    @Override // defpackage.srr
    public final void e(awsy awsyVar) {
        ajhz ajhzVar;
        WeakReference weakReference = this.b;
        if (weakReference == null || (ajhzVar = (ajhz) weakReference.get()) == null || (awsyVar.c & 4) == 0) {
            return;
        }
        if (!awsyVar.g.contentEquals(ajhzVar.ak) && !awsyVar.g.contentEquals("testSheetId")) {
            return;
        }
        aphq.m(ajhzVar.m, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", awsyVar);
        dt mJ = ajhzVar.mJ();
        if (mJ == null || mJ.isFinishing()) {
            return;
        }
        ajhzVar.aG();
        ajhzVar.aH(awsyVar, mJ);
        RelativeLayout aE = ajhzVar.aE(mJ);
        ViewGroup viewGroup = ajhzVar.ao;
        if (viewGroup != null) {
            viewGroup.addView(aE);
        }
        ajhzVar.aI(mJ);
    }

    @Override // defpackage.srr
    public final void f(awnn awnnVar, int i, double d, tcs tcsVar, int i2, boolean z, int i3) {
        l(awnnVar, i, i2, j(tcsVar), i(tcsVar), z, i3);
        if (i != 4 || d <= 0.0d) {
            return;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = new Handler();
        this.g = handler2;
        handler2.postDelayed(new Runnable() { // from class: ajhp
            @Override // java.lang.Runnable
            public final void run() {
                ajhr.this.a();
            }
        }, (long) d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.srr
    public final void g(awnn awnnVar, int i, srq srqVar) {
        Object obj = srqVar.a;
        boolean z = obj instanceof acti;
        acti actiVar = obj;
        if (true != z) {
            actiVar = null;
        }
        l(awnnVar, i, 1, actiVar, null, false, 0);
    }
}
