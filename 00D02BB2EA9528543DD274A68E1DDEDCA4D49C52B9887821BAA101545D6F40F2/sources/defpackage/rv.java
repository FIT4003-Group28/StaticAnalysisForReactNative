package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rv  reason: default package */
/* loaded from: classes.dex */
public final class rv extends rd implements LayoutInflater.Factory2, vd {
    private static final aim<String, Integer> I = new aim<>();
    private static final int[] J = {16842836};
    public static final boolean d = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean e = true;
    public boolean A;
    public boolean B;
    boolean C;
    public int D;
    boolean E;
    int F;
    public Rect G;
    public Rect H;
    private rn K;
    private CharSequence L;
    private rk M;
    private ru N;
    private boolean O;
    private TextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private rt[] T;
    private boolean U;
    private boolean V;
    private int W;
    private boolean X;
    private boolean Y;
    private rq Z;
    private rq aa;
    private boolean ac;
    private AppCompatViewInflater ad;
    final Object f;
    final Context g;
    Window h;
    final rc i;
    qk j;
    MenuInflater k;
    public yq l;
    ud m;
    ActionBarContextView n;
    PopupWindow o;
    Runnable p;
    ViewGroup s;
    public View t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    public rt z;
    oi q = null;
    public boolean r = true;
    private final Runnable ab = new re(this);

    public rv(Context context, Window window, rc rcVar, Object obj) {
        aim<String, Integer> aimVar;
        Integer num;
        rb rbVar = null;
        this.W = -100;
        this.g = context;
        this.i = rcVar;
        this.f = obj;
        if (this.W == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof rb)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        rbVar = (rb) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (rbVar != null) {
                this.W = ((rv) rbVar.k()).W;
            }
        }
        if (this.W == -100 && (num = (aimVar = I).get(this.f.getClass().getName())) != null) {
            this.W = num.intValue();
            aimVar.remove(this.f.getClass().getName());
        }
        if (window != null) {
            Q(window);
        }
        xi.a();
    }

    public static final Configuration L(Context context, int i, Configuration configuration) {
        int i2;
        if (i != 1) {
            i2 = i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private final void P() {
        if (this.h == null) {
            Object obj = this.f;
            if (obj instanceof Activity) {
                Q(((Activity) obj).getWindow());
            }
        }
        if (this.h != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
        if (r14.f != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void R(defpackage.rt r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.R(rt, android.view.KeyEvent):void");
    }

    private final void S(int i) {
        this.F = (1 << i) | this.F;
        if (!this.E) {
            od.j(this.h.getDecorView(), this.ab);
            this.E = true;
        }
    }

    private final void T() {
        if (!this.O) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private final rq U(Context context) {
        if (this.Z == null) {
            if (sd.a == null) {
                Context applicationContext = context.getApplicationContext();
                sd.a = new sd(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Z = new rr(this, sd.a);
        }
        return this.Z;
    }

    private final rq V(Context context) {
        if (this.aa == null) {
            this.aa = new ro(this, context);
        }
        return this.aa;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void W(boolean r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.W(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        ViewGroup viewGroup;
        return this.O && (viewGroup = this.s) != null && od.ae(viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B() {
        oi oiVar = this.q;
        if (oiVar != null) {
            oiVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.C(android.view.KeyEvent):boolean");
    }

    public final boolean D(rt rtVar, KeyEvent keyEvent) {
        yq yqVar;
        Resources.Theme theme;
        yq yqVar2;
        yq yqVar3;
        if (this.C) {
            return false;
        }
        if (rtVar.k) {
            return true;
        }
        rt rtVar2 = this.z;
        if (rtVar2 != null && rtVar2 != rtVar) {
            F(rtVar2, false);
        }
        Window.Callback t = t();
        if (t != null) {
            rtVar.g = t.onCreatePanelView(rtVar.a);
        }
        int i = rtVar.a;
        boolean z = i == 0 || i == 108;
        if (z && (yqVar3 = this.l) != null) {
            yqVar3.setMenuPrepared();
        }
        if (rtVar.g == null) {
            vf vfVar = rtVar.h;
            if (vfVar == null || rtVar.o) {
                if (vfVar == null) {
                    Context context = this.g;
                    int i2 = rtVar.a;
                    if ((i2 == 0 || i2 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            uf ufVar = new uf(context, 0);
                            ufVar.getTheme().setTo(theme);
                            context = ufVar;
                        }
                    }
                    vf vfVar2 = new vf(context);
                    vfVar2.b = this;
                    rtVar.a(vfVar2);
                    if (rtVar.h == null) {
                        return false;
                    }
                }
                if (z && this.l != null) {
                    if (this.M == null) {
                        this.M = new rk(this);
                    }
                    this.l.setMenu(rtVar.h, this.M);
                }
                rtVar.h.s();
                if (!t.onCreatePanelMenu(rtVar.a, rtVar.h)) {
                    rtVar.a(null);
                    if (z && (yqVar = this.l) != null) {
                        yqVar.setMenu(null, this.M);
                    }
                    return false;
                }
                rtVar.o = false;
            }
            rtVar.h.s();
            Bundle bundle = rtVar.p;
            if (bundle != null) {
                rtVar.h.e(bundle);
                rtVar.p = null;
            }
            if (!t.onPreparePanel(0, rtVar.g, rtVar.h)) {
                if (z && (yqVar2 = this.l) != null) {
                    yqVar2.setMenu(null, this.M);
                }
                rtVar.h.t();
                return false;
            }
            rtVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            rtVar.h.t();
        }
        rtVar.k = true;
        rtVar.l = false;
        this.z = rtVar;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(vf vfVar) {
        if (this.S) {
            return;
        }
        this.S = true;
        this.l.o();
        Window.Callback t = t();
        if (t != null && !this.C) {
            t.onPanelClosed(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, vfVar);
        }
        this.S = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(rt rtVar, boolean z) {
        ViewGroup viewGroup;
        yq yqVar;
        if (!z || rtVar.a != 0 || (yqVar = this.l) == null || !yqVar.k()) {
            WindowManager windowManager = (WindowManager) this.g.getSystemService("window");
            if (windowManager != null && rtVar.m && (viewGroup = rtVar.e) != null) {
                windowManager.removeView(viewGroup);
                if (z) {
                    G(rtVar.a, rtVar, null);
                }
            }
            rtVar.k = false;
            rtVar.l = false;
            rtVar.m = false;
            rtVar.f = null;
            rtVar.n = true;
            if (this.z != rtVar) {
                return;
            }
            this.z = null;
            return;
        }
        E(rtVar.h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(int i, rt rtVar, Menu menu) {
        if (menu == null) {
            menu = rtVar.h;
        }
        if (!rtVar.m || this.C) {
            return;
        }
        this.K.b.onPanelClosed(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rt H(Menu menu) {
        rt[] rtVarArr = this.T;
        int length = rtVarArr != null ? rtVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            rt rtVar = rtVarArr[i];
            if (rtVar != null && rtVar.h == menu) {
                return rtVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(int i) {
        rt N = N(i);
        if (N.h != null) {
            Bundle bundle = new Bundle();
            N.h.d(bundle);
            if (bundle.size() > 0) {
                N.p = bundle;
            }
            N.h.s();
            N.h.clear();
        }
        N.o = true;
        N.n = true;
        if ((i == 108 || i == 0) && this.l != null) {
            rt N2 = N(0);
            N2.k = false;
            D(N2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(android.content.Context r22, int r23) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.J(android.content.Context, int):int");
    }

    public final int K() {
        int i = this.W;
        return i != -100 ? i : rd.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r9.equals("Spinner") != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M(java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.M(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rt N(int i) {
        rt[] rtVarArr = this.T;
        if (rtVarArr == null || rtVarArr.length <= i) {
            rt[] rtVarArr2 = new rt[i + 1];
            if (rtVarArr != null) {
                System.arraycopy(rtVarArr, 0, rtVarArr2, 0, rtVarArr.length);
            }
            this.T = rtVarArr2;
            rtVarArr = rtVarArr2;
        }
        rt rtVar = rtVarArr[i];
        if (rtVar == null) {
            rt rtVar2 = new rt(i);
            rtVarArr[i] = rtVar2;
            return rtVar2;
        }
        return rtVar;
    }

    public final boolean O(rt rtVar, int i, KeyEvent keyEvent) {
        vf vfVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!rtVar.k && !D(rtVar, keyEvent)) || (vfVar = rtVar.h) == null) {
            return false;
        }
        return vfVar.performShortcut(i, keyEvent, 1);
    }

    @Override // defpackage.rd
    public final qk c() {
        u();
        return this.j;
    }

    @Override // defpackage.rd
    public final void d() {
        this.B = false;
        qk c = c();
        if (c != null) {
            c.f(false);
        }
    }

    @Override // defpackage.rd
    public final <T extends View> T e(int i) {
        w();
        return (T) this.h.findViewById(i);
    }

    @Override // defpackage.rd
    public final void f(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.K.b.onContentChanged();
    }

    @Override // defpackage.rd
    public final void g(int i) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.g).inflate(i, viewGroup);
        this.K.b.onContentChanged();
    }

    @Override // defpackage.rd
    public final void h(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.s.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.K.b.onContentChanged();
    }

    @Override // defpackage.rd
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ((ViewGroup) this.s.findViewById(16908290)).addView(view, layoutParams);
        this.K.b.onContentChanged();
    }

    @Override // defpackage.rd
    public final void j(CharSequence charSequence) {
        this.L = charSequence;
        yq yqVar = this.l;
        if (yqVar != null) {
            yqVar.setWindowTitle(charSequence);
            return;
        }
        qk qkVar = this.j;
        if (qkVar != null) {
            qkVar.h(charSequence);
            return;
        }
        TextView textView = this.P;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // defpackage.rd
    public final void k() {
        c();
        S(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.rd.c
            monitor-enter(r0)
            defpackage.rd.o(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.E
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.h
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ab
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.B = r0
            r0 = 1
            r3.C = r0
            int r0 = r3.W
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            aim<java.lang.String, java.lang.Integer> r0 = defpackage.rv.I
            java.lang.Object r1 = r3.f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            aim<java.lang.String, java.lang.Integer> r0 = defpackage.rv.I
            java.lang.Object r1 = r3.f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            rq r0 = r3.Z
            if (r0 == 0) goto L66
            r0.d()
        L66:
            rq r0 = r3.aa
            if (r0 == 0) goto L6d
            r0.d()
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.l():void");
    }

    @Override // defpackage.rd
    public final void m() {
        LayoutInflater from = LayoutInflater.from(this.g);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return M(str, context, attributeSet);
    }

    @Override // defpackage.rd
    public final void p() {
        W(true);
    }

    @Override // defpackage.rd
    public final void q() {
        String str;
        this.A = true;
        W(false);
        P();
        Object obj = this.f;
        if (obj instanceof Activity) {
            try {
                str = hv.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                qk qkVar = this.j;
                if (qkVar == null) {
                    this.ac = true;
                } else {
                    qkVar.e(true);
                }
            }
            synchronized (rd.c) {
                rd.o(this);
                rd.b.add(new WeakReference<>(this));
            }
        }
        this.V = true;
    }

    @Override // defpackage.rd
    public final void r() {
        qk c;
        if (this.u && this.O && (c = c()) != null) {
            si siVar = (si) c;
            siVar.k(ub.a(siVar.a).c());
        }
        xi.b().d(this.g);
        W(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Window.Callback t() {
        return this.h.getCallback();
    }

    public final void u() {
        w();
        if (!this.u || this.j != null) {
            return;
        }
        Object obj = this.f;
        if (obj instanceof Activity) {
            this.j = new si((Activity) obj, this.v);
        } else if (obj instanceof Dialog) {
            this.j = new si((Dialog) obj);
        }
        qk qkVar = this.j;
        if (qkVar == null) {
            return;
        }
        qkVar.e(this.ac);
    }

    final Context v() {
        qk c = c();
        Context d2 = c != null ? c.d() : null;
        return d2 == null ? this.g : d2;
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.O) {
            TypedArray obtainStyledAttributes = this.g.obtainStyledAttributes(sj.j);
            if (!obtainStyledAttributes.hasValue(com.google.android.filament.R.styleable.AppCompatTheme_windowActionBar)) {
                obtainStyledAttributes.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (obtainStyledAttributes.getBoolean(com.google.android.filament.R.styleable.AppCompatTheme_windowNoTitle, false)) {
                s(1);
            } else if (obtainStyledAttributes.getBoolean(com.google.android.filament.R.styleable.AppCompatTheme_windowActionBar, false)) {
                s(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
            }
            if (obtainStyledAttributes.getBoolean(com.google.android.filament.R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                s(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
            }
            if (obtainStyledAttributes.getBoolean(com.google.android.filament.R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                s(10);
            }
            this.x = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            P();
            this.h.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.g);
            if (this.y) {
                viewGroup = this.w ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            } else if (this.x) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.v = false;
                this.u = false;
            } else if (this.u) {
                TypedValue typedValue = new TypedValue();
                this.g.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new uf(this.g, typedValue.resourceId);
                } else {
                    context = this.g;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                yq yqVar = (yq) viewGroup.findViewById(R.id.decor_content_parent);
                this.l = yqVar;
                yqVar.setWindowCallback(t());
                if (this.v) {
                    this.l.i(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                }
                if (this.Q) {
                    this.l.i(2);
                }
                if (this.R) {
                    this.l.i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.u + ", windowActionBarOverlay: " + this.v + ", android:windowIsFloating: " + this.x + ", windowActionModeOverlay: " + this.w + ", windowNoTitle: " + this.y + " }");
            }
            od.O(viewGroup, new rf(this));
            if (this.l == null) {
                this.P = (TextView) viewGroup.findViewById(R.id.title);
            }
            afm.b(viewGroup);
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.h.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.h.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new rg(this));
            this.s = viewGroup;
            Object obj = this.f;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = this.L;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                yq yqVar2 = this.l;
                if (yqVar2 != null) {
                    yqVar2.setWindowTitle(charSequence);
                } else {
                    qk qkVar = this.j;
                    if (qkVar != null) {
                        qkVar.h(charSequence);
                    } else {
                        TextView textView = this.P;
                        if (textView != null) {
                            textView.setText(charSequence);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.s.findViewById(16908290);
            View decorView = this.h.getDecorView();
            contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            TypedArray obtainStyledAttributes2 = this.g.obtainStyledAttributes(sj.j);
            if (contentFrameLayout2.b == null) {
                contentFrameLayout2.b = new TypedValue();
            }
            obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.b);
            if (contentFrameLayout2.c == null) {
                contentFrameLayout2.c = new TypedValue();
            }
            obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.c);
            if (obtainStyledAttributes2.hasValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
                if (contentFrameLayout2.d == null) {
                    contentFrameLayout2.d = new TypedValue();
                }
                obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.d);
            }
            if (obtainStyledAttributes2.hasValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
                if (contentFrameLayout2.e == null) {
                    contentFrameLayout2.e = new TypedValue();
                }
                obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.e);
            }
            if (obtainStyledAttributes2.hasValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
                if (contentFrameLayout2.f == null) {
                    contentFrameLayout2.f = new TypedValue();
                }
                obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.f);
            }
            if (obtainStyledAttributes2.hasValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
                if (contentFrameLayout2.g == null) {
                    contentFrameLayout2.g = new TypedValue();
                }
                obtainStyledAttributes2.getValue(com.google.android.filament.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.g);
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.O = true;
            rt N = N(0);
            if (this.C || N.h != null) {
                return;
            }
            S(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle);
        }
    }

    @Override // defpackage.vd
    public final boolean x(vf vfVar, MenuItem menuItem) {
        rt H;
        Window.Callback t = t();
        if (t == null || this.C || (H = H(vfVar.y())) == null) {
            return false;
        }
        return t.onMenuItemSelected(H.a, menuItem);
    }

    @Override // defpackage.vd
    public final void y(vf vfVar) {
        yq yqVar = this.l;
        if (yqVar == null || !yqVar.j() || (ViewConfiguration.get(this.g).hasPermanentMenuKey() && !this.l.l())) {
            rt N = N(0);
            N.n = true;
            F(N, false);
            R(N, null);
            return;
        }
        Window.Callback t = t();
        if (this.l.k()) {
            this.l.n();
            if (this.C) {
                return;
            }
            t.onPanelClosed(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, N(0).h);
        } else if (t == null || this.C) {
        } else {
            if (this.E && (1 & this.F) != 0) {
                this.h.getDecorView().removeCallbacks(this.ab);
                this.ab.run();
            }
            rt N2 = N(0);
            vf vfVar2 = N2.h;
            if (vfVar2 == null || N2.o || !t.onPreparePanel(0, N2.g, vfVar2)) {
                return;
            }
            t.onMenuOpened(com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, N2.h);
            this.l.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ud z(defpackage.uc r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rv.z(uc):ud");
    }

    private final void Q(Window window) {
        if (this.h != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof rn) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        rn rnVar = new rn(this, callback);
        this.K = rnVar;
        window.setCallback(rnVar);
        aeq a = aeq.a(this.g, null, J);
        Drawable e2 = a.e(0);
        if (e2 != null) {
            window.setBackgroundDrawable(e2);
        }
        a.q();
        this.h = window;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return M(str, context, attributeSet);
    }

    @Override // defpackage.rd
    public final void s(int i) {
        if (i == 8) {
            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle;
        } else if (i == 9) {
            i = com.google.android.filament.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu;
        }
        if (!this.y || i != 108) {
            if (this.u && i == 1) {
                this.u = false;
            }
            if (i == 1) {
                T();
                this.y = true;
            } else if (i == 2) {
                T();
                this.Q = true;
            } else if (i == 5) {
                T();
                this.R = true;
            } else if (i == 10) {
                T();
                this.w = true;
            } else if (i == 108) {
                T();
                this.u = true;
            } else if (i == 109) {
                T();
                this.v = true;
            } else {
                this.h.requestFeature(i);
            }
        }
    }
}
