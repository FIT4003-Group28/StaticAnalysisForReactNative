package com.google.android.libraries.onegoogle.account.disc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AccountParticleDisc<AccountT> extends FrameLayout {
    public final RoundBorderImageView a;
    public final WeakReference<FrameLayout> b;
    public final int c;
    public final cvvz<AccountT> d;
    public cvwh e;
    public boolean f;
    public int g;
    public cvuu<AccountT> h;
    public cvvi<AccountT> i;
    public AccountT j;
    public cvvm<cvvh<?>> k;
    public dbsg<cvvx> l;
    public boolean m;
    private final boolean n;
    private final CopyOnWriteArrayList<cvur<AccountT>> o;
    private final cvvl<cvvh<?>> p;
    private final boolean q;
    private final int r;
    private final int s;
    private final cvwc t;
    private int u;

    public AccountParticleDisc(Context context) {
        this(context, null);
    }

    private final void n() {
        int dimension = (this.n || this.f) ? (int) getResources().getDimension(R.dimen.og_apd_min_padding) : 0;
        this.g = dimension;
        this.a.setPadding(dimension, dimension, dimension, dimension);
        this.a.a();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = this.u;
        layoutParams.height = this.u;
    }

    public final boolean a() {
        return this.h != null;
    }

    public final void b() {
        czhz.b();
        dbsg<cvvx> c = c();
        this.l = c;
        cvwh cvwhVar = this.e;
        if (cvwhVar != null) {
            czhz.b();
            Drawable a = cvwhVar.a(c);
            if (cvwhVar.a.getDrawable() != a) {
                dccx F = dcdc.F();
                if (cvwhVar.a.getDrawable() != null) {
                    ObjectAnimator duration = ObjectAnimator.ofInt(cvwhVar.a, cvwh.d, cvwhVar.c, 0).setDuration(200L);
                    duration.addListener(new cvwe(cvwhVar));
                    F.g(duration);
                }
                if (a != null) {
                    ObjectAnimator duration2 = ObjectAnimator.ofInt(cvwhVar.a, cvwh.d, 0, cvwhVar.c).setDuration(200L);
                    duration2.addListener(new cvwf(cvwhVar, a));
                    F.g(duration2);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(F.f());
                cvwhVar.b(animatorSet);
            }
        }
        e();
    }

    public final dbsg<cvvx> c() {
        cvvx cvvxVar;
        czhz.b();
        if (this.f) {
            cvvz<AccountT> cvvzVar = this.d;
            czhz.b();
            if (cvvzVar.c != null) {
                for (cvvn<cvvx, AccountT> cvvnVar : cvvzVar.a()) {
                    cvvm<cvvx> a = cvvnVar.a(cvvzVar.c);
                    if (a != null && (cvvxVar = a.a) != null) {
                        return dbsg.i(cvvxVar);
                    }
                }
            }
        }
        return dbpy.a;
    }

    public final int d() {
        return h() - this.c;
    }

    public final void e() {
        Iterator<cvur<AccountT>> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void g(final cvvh<?> cvvhVar) {
        post(new Runnable(this, cvvhVar) { // from class: cvup
            private final AccountParticleDisc a;
            private final cvvh b;

            {
                this.a = this;
                this.b = cvvhVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
                if (r3.a().equals(r1.a()) == false) goto L16;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cvup.run():void");
            }
        });
    }

    public final int h() {
        int i = this.u;
        int i2 = this.g;
        return i - (i2 + i2);
    }

    public final void i(cvur<AccountT> cvurVar) {
        this.o.add(cvurVar);
    }

    public final void j(cvur<AccountT> cvurVar) {
        this.o.remove(cvurVar);
    }

    public final void k() {
        RoundBorderImageView roundBorderImageView = this.a;
        roundBorderImageView.setImageDrawable(cwiz.a(roundBorderImageView.getContext(), R.drawable.disc_oval, this.s));
    }

    public final void l(cvuu<AccountT> cvuuVar, final cwfn cwfnVar) {
        dbsk.s(cvuuVar);
        this.h = cvuuVar;
        if (this.q) {
            int i = this.r - this.u;
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int max = Math.max(0, ((i - paddingLeft) - paddingRight) / 2);
            int max2 = Math.max(0, ((i - paddingTop) - paddingBottom) / 2);
            setPadding(getPaddingLeft() + max, getPaddingTop() + max2, getPaddingRight() + max, getPaddingBottom() + max2);
        }
        n();
        if (this.n) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        cwjf.a(new Runnable(this, cwfnVar) { // from class: cvum
            private final AccountParticleDisc a;
            private final cwfn b;

            {
                this.a = this;
                this.b = cwfnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = this.a;
                cvvz<AccountT> cvvzVar = accountParticleDisc.d;
                final cvvu cvvuVar = new cvvu(accountParticleDisc.getResources());
                cvvn cvvnVar = new cvvn(cvvuVar) { // from class: cvvs
                    private final cvvu a;

                    {
                        this.a = cvvuVar;
                    }

                    @Override // defpackage.cvvn
                    public final cvvm a(Object obj) {
                        cvvx cvvxVar;
                        final cvvu cvvuVar2 = this.a;
                        if (cwfn.e(obj).a()) {
                            if (cvvu.a == null) {
                                cvvu.a = cvvx.c(new cvvy(cvvuVar2) { // from class: cvvt
                                    private final cvvu a;

                                    {
                                        this.a = cvvuVar2;
                                    }

                                    @Override // defpackage.cvvy
                                    public final Drawable a(int i2, int i3) {
                                        final cvwc cvwcVar = new cvwc(this.a.b);
                                        cvwb cvwbVar = new cvwb(cvwcVar) { // from class: cvwa
                                            private final cvwc a;

                                            {
                                                this.a = cvwcVar;
                                            }

                                            @Override // defpackage.cvwb
                                            public final int a(int i4) {
                                                return this.a.b(i4);
                                            }
                                        };
                                        dbsk.l(cvwbVar.a(i2) == i3);
                                        return new cvvr(cvwbVar);
                                    }
                                }, cvvuVar2.b.getString(R.string.og_google_one_account_a11y));
                            }
                            cvvxVar = cvvu.a;
                        } else {
                            cvvxVar = null;
                        }
                        return new cvvm(cvvxVar);
                    }
                };
                czhz.b();
                cvvzVar.a.add(cvvnVar);
                cvvzVar.b(cvvnVar, cvvzVar.c);
            }
        });
        this.a.requestLayout();
        if (this.f) {
            this.e = new cvwh((RingView) findViewById(R.id.og_apd_ring_view), d());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc.m():java.lang.String");
    }

    public void setAccount(final AccountT accountt) {
        cwjf.a(new Runnable(this, accountt) { // from class: cvuo
            private final AccountParticleDisc a;
            private final Object b;

            {
                this.a = this;
                this.b = accountt;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                r0.k();
                r2 = r0.a;
                r3 = r0.g;
                r2.setPadding(r3, r3, r3, r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
                if (r3.equals(r2) == false) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
                if (r1 != r2) goto L28;
             */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, AccountT] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r6 = this;
                    com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r0 = r6.a
                    java.lang.Object r1 = r6.b
                    boolean r2 = r0.a()
                    java.lang.String r3 = "initialize must be called first"
                    defpackage.dbsk.m(r2, r3)
                    AccountT r2 = r0.j
                    if (r1 == 0) goto L23
                    if (r2 != 0) goto L14
                    goto L23
                L14:
                    java.lang.String r3 = defpackage.cwfn.a(r1)
                    java.lang.String r2 = defpackage.cwfn.a(r2)
                    boolean r2 = r3.equals(r2)
                    if (r2 != 0) goto L2f
                    goto L25
                L23:
                    if (r1 == r2) goto L2f
                L25:
                    r0.k()
                    com.google.android.libraries.onegoogle.account.disc.RoundBorderImageView r2 = r0.a
                    int r3 = r0.g
                    r2.setPadding(r3, r3, r3, r3)
                L2f:
                    r0.j = r1
                    cvvz<AccountT> r2 = r0.d
                    defpackage.czhz.b()
                    java.lang.Iterable r3 = r2.a()
                    java.util.Iterator r3 = r3.iterator()
                L3e:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L53
                    java.lang.Object r4 = r3.next()
                    cvvn r4 = (defpackage.cvvn) r4
                    AccountT r5 = r2.c
                    r2.c(r4, r5)
                    r2.b(r4, r1)
                    goto L3e
                L53:
                    r2.c = r1
                    dbsg r2 = r0.c()
                    r0.l = r2
                    cvwh r2 = r0.e
                    if (r2 == 0) goto L71
                    dbsg<cvvx> r3 = r0.l
                    defpackage.czhz.b()
                    com.google.android.libraries.onegoogle.account.disc.RingView r4 = r2.a
                    android.graphics.drawable.Drawable r3 = r2.a(r3)
                    r4.setImageDrawable(r3)
                    r3 = 0
                    r2.b(r3)
                L71:
                    com.google.android.libraries.onegoogle.account.disc.RoundBorderImageView r2 = r0.a
                    defpackage.czhz.b()
                    dbsg<cvvx> r3 = r0.l
                    boolean r3 = r3.a()
                    if (r3 == 0) goto L86
                    int r3 = r0.g
                    int r4 = r0.c
                    int r4 = r4 / 2
                    int r3 = r3 + r4
                    goto L88
                L86:
                    int r3 = r0.g
                L88:
                    if (r1 != 0) goto L8e
                    r2.a()
                    goto La6
                L8e:
                    dbsg<cvvx> r4 = r0.l
                    boolean r4 = r4.a()
                    if (r4 == 0) goto L9b
                    int r4 = r0.d()
                    goto L9f
                L9b:
                    int r4 = r0.h()
                L9f:
                    int r4 = r4 + (-2)
                    r2.b = r4
                    r2.b()
                La6:
                    r2.setPadding(r3, r3, r3, r3)
                    cvuu<AccountT> r3 = r0.h
                    r3.a(r1, r2)
                    r0.f()
                    r0.e()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cvuo.run():void");
            }
        });
    }

    public void setAllowRings(boolean z) {
        if (z == this.f) {
            return;
        }
        dbsk.m(!a(), "setAllowRings is only allowed before calling initialize.");
        this.f = z;
    }

    public void setBadgeRetriever(cvvi<AccountT> cvviVar) {
        dbsk.m(this.n, "setBadgeRetriever is not allowed with false allowBadges.");
        this.i = cvviVar;
        f();
        e();
    }

    public void setDiscScale(float f) {
        dbsk.m(a(), "setDiscScale() may only be called after initialize() has been invoked.");
        if (this.e != null) {
            int d = d();
            int round = Math.round(f * this.t.d(d));
            cvwh cvwhVar = this.e;
            Drawable drawable = cvwhVar.a.getDrawable();
            boolean z = true;
            if (!(drawable instanceof cvwi) && drawable != null) {
                z = false;
            }
            dbsk.m(z, "RingViewHolder.setScale() may not be called on ring drawables that are not of type ScalableRing.");
            int i = (cvwhVar.b - round) / 2;
            cvwhVar.a.setPadding(i, i, i, i);
            f = ((round - Math.round(this.t.c(round) * 4.0f)) - 2) / d;
        }
        this.a.setScaleX(f);
        this.a.setScaleY(f);
    }

    public void setGreyScale(boolean z) {
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.a.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            return;
        }
        this.a.setColorFilter((ColorFilter) null);
    }

    public void setMaxDiscContentSize(int i) {
        dbsk.m(!a(), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.u = i;
    }

    public void setRingRetriever(final cvvn<cvvx, AccountT> cvvnVar) {
        this.m = cvvnVar != null;
        cwjf.a(new Runnable(this, cvvnVar) { // from class: cvun
            private final AccountParticleDisc a;
            private final cvvn b;

            {
                this.a = this;
                this.b = cvvnVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AccountParticleDisc accountParticleDisc = this.a;
                cvvn<cvvx, AccountT> cvvnVar2 = this.b;
                dbsk.m(accountParticleDisc.f, "setRingRetriever is not allowed with false allowRings.");
                cvvz<AccountT> cvvzVar = accountParticleDisc.d;
                czhz.b();
                Object obj = cvvzVar.b;
                if (obj != null) {
                    cvvzVar.c(obj, cvvzVar.c);
                }
                cvvzVar.b = cvvnVar2;
                if (cvvnVar2 != 0) {
                    cvvzVar.b(cvvnVar2, cvvzVar.c);
                }
                accountParticleDisc.b();
            }
        });
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleDiscStyle);
    }

    public AccountParticleDisc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new CopyOnWriteArrayList<>();
        this.p = new cvvl(this) { // from class: cvuk
            private final AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.cvvl
            public final void a(Object obj) {
                AccountParticleDisc accountParticleDisc = this.a;
                accountParticleDisc.g((cvvh) obj);
                accountParticleDisc.e();
            }
        };
        this.d = new cvvz<>(new cvvl(this) { // from class: cvul
            private final AccountParticleDisc a;

            {
                this.a = this;
            }

            @Override // defpackage.cvvl
            public final void a(Object obj) {
                final AccountParticleDisc accountParticleDisc = this.a;
                cvvx cvvxVar = (cvvx) obj;
                cwjf.a(new Runnable(accountParticleDisc) { // from class: cvuq
                    private final AccountParticleDisc a;

                    {
                        this.a = accountParticleDisc;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                });
            }
        });
        this.l = dbpy.a;
        LayoutInflater.from(context).inflate(R.layout.account_particle_disc, (ViewGroup) this, true);
        RoundBorderImageView roundBorderImageView = (RoundBorderImageView) findViewById(R.id.og_apd_internal_image_view);
        this.a = roundBorderImageView;
        this.b = new WeakReference<>((FrameLayout) findViewById(R.id.badge_wrapper));
        this.t = new cvwc(getResources());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvvv.a, i, 2132017742);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, -1);
            this.u = dimensionPixelSize;
            if (dimensionPixelSize == -1) {
                this.u = obtainStyledAttributes.getDimensionPixelSize(9, getResources().getDimensionPixelSize(R.dimen.og_apd_default_max_disc_content_size));
            }
            int i2 = 0;
            this.n = obtainStyledAttributes.getBoolean(0, true);
            this.f = obtainStyledAttributes.getBoolean(1, false);
            this.q = obtainStyledAttributes.getBoolean(8, false);
            this.r = obtainStyledAttributes.getDimensionPixelSize(6, getResources().getDimensionPixelSize(R.dimen.og_apd_default_disc_min_touch_target_size));
            int color = obtainStyledAttributes.getColor(2, 0);
            roundBorderImageView.c = color;
            roundBorderImageView.a.setColor(color);
            roundBorderImageView.a.setAlpha(30);
            this.s = obtainStyledAttributes.getColor(7, getResources().getColor(R.color.og_default_disc_placeholder_color_light));
            this.c = obtainStyledAttributes.getBoolean(12, true) ? getResources().getDimensionPixelSize(R.dimen.og_apd_amount_to_reduce_avatar_size_when_has_ring) : i2;
            obtainStyledAttributes.recycle();
            k();
            n();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void f() {
        AccountT accountt;
        cvvm<cvvh<?>> cvvmVar = this.k;
        cvvh<?> cvvhVar = cvvmVar == null ? null : cvvmVar.a;
        if (cvvmVar != null) {
            cvvmVar.b(this.p);
            this.k = null;
        }
        cvvi<AccountT> cvviVar = this.i;
        if (cvviVar != null && (accountt = this.j) != null) {
            cvvm<cvvh<?>> a = cvviVar.a(accountt);
            this.k = a;
            if (a != null) {
                a.a(this.p);
            }
        }
        g(cvvhVar);
    }
}
