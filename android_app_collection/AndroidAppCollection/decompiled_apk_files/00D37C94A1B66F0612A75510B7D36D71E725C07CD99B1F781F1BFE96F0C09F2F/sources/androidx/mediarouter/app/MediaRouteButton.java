package androidx.mediarouter.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteButton extends View {
    private static bep d;
    public boolean b;
    public ber c;
    private final bhd g;
    private final beq h;
    private bgo i;
    private bfn j;
    private boolean k;
    private int l;
    private Drawable m;
    private int n;
    private int o;
    private int p;
    private ColorStateList q;
    private int r;
    private int s;
    private boolean t;
    public static final SparseArray a = new SparseArray(2);
    private static final int[] e = {16842912};
    private static final int[] f = {16842911};

    public MediaRouteButton(Context context) {
        this(context, null);
    }

    private final void h() {
        if (this.n > 0) {
            ber berVar = this.c;
            if (berVar != null) {
                berVar.cancel(false);
            }
            ber berVar2 = new ber(this, this.n, getContext());
            this.c = berVar2;
            this.n = 0;
            berVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private final void i() {
        int i = this.p;
        setContentDescription(getContext().getString(i != 1 ? i != 2 ? R.string.mr_cast_button_disconnected : R.string.mr_cast_button_connected : R.string.mr_cast_button_connecting));
        hx.a(this, null);
    }

    private final boolean j() {
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", bhd.h());
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(putExtra, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    private final boolean k() {
        eo eoVar;
        Activity activity;
        Context context = getContext();
        while (true) {
            eoVar = null;
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (!(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = (Activity) context;
                break;
            }
        }
        if (activity instanceof dt) {
            eoVar = ((dt) activity).getSupportFragmentManager();
        }
        if (eoVar == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        if (bhd.j().j()) {
            if (eoVar.f("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                return false;
            }
            bew a2 = this.j.a();
            a2.aE(this.i);
            ex l = eoVar.l();
            l.r(a2, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
            l.k();
            return true;
        } else if (eoVar.f("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
            Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
            return false;
        } else {
            bfm b = this.j.b();
            bgo bgoVar = this.i;
            if (bgoVar != null) {
                if (b.af == null) {
                    Bundle bundle = b.m;
                    if (bundle != null) {
                        b.af = bgo.a(bundle.getBundle("selector"));
                    }
                    if (b.af == null) {
                        b.af = bgo.a;
                    }
                }
                if (!b.af.equals(bgoVar)) {
                    b.af = bgoVar;
                    Bundle bundle2 = b.m;
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putBundle("selector", bgoVar.b);
                    b.ae(bundle2);
                }
                ex l2 = eoVar.l();
                l2.r(b, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
                l2.k();
                return true;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
    }

    public final void a() {
        bhc j = bhd.j();
        boolean z = true;
        boolean z2 = !j.j();
        int i = z2 ? j.h : 0;
        if (this.p != i) {
            this.p = i;
            i();
            refreshDrawableState();
        }
        if (i == 1) {
            h();
        }
        if (this.k) {
            if (!this.t && !z2 && !bhd.k(this.i, 1)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public final void c(boolean z) {
        if (z != this.t) {
            this.t = z;
            b();
            a();
        }
    }

    public final void d(bfn bfnVar) {
        if (bfnVar != null) {
            this.j = bfnVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.m != null) {
            this.m.setState(getDrawableState());
            if (this.m.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.m.getCurrent();
                int i = this.p;
                if (i == 1 || this.o != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.o = this.p;
    }

    public final void e(Drawable drawable) {
        this.n = 0;
        f(drawable);
    }

    public final void f(Drawable drawable) {
        ber berVar = this.c;
        if (berVar != null) {
            berVar.cancel(false);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.m);
        }
        if (drawable != null) {
            if (this.q != null) {
                drawable = iy.l(drawable.mutate());
                drawable.setTintList(this.q);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.m = drawable;
        refreshDrawableState();
    }

    public final void g(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.i.equals(bgoVar)) {
            return;
        }
        if (this.k) {
            if (!this.i.d()) {
                this.g.r(this.h);
            }
            if (!bgoVar.d()) {
                this.g.p(bgoVar, this.h);
            }
        }
        this.i = bgoVar;
        a();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.k = true;
        if (!this.i.d()) {
            this.g.p(this.i, this.h);
        }
        a();
        bep bepVar = d;
        if (bepVar.c.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            bepVar.a.registerReceiver(bepVar, intentFilter);
        }
        bepVar.c.add(this);
    }

    @Override // android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.g != null && !this.b) {
            int i2 = this.p;
            if (i2 == 1) {
                mergeDrawableStates(onCreateDrawableState, f);
            } else if (i2 == 2) {
                mergeDrawableStates(onCreateDrawableState, e);
            }
            return onCreateDrawableState;
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.k = false;
            if (!this.i.d()) {
                this.g.r(this.h);
            }
            bep bepVar = d;
            bepVar.c.remove(this);
            if (bepVar.c.size() == 0) {
                bepVar.a.unregisterReceiver(bepVar);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.m != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.m.getIntrinsicWidth();
            int intrinsicHeight = this.m.getIntrinsicHeight();
            int i = paddingLeft + ((((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + ((((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2);
            this.m.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.m.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.r;
        Drawable drawable = this.m;
        int i4 = 0;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i5 = this.s;
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            i4 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i5, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
        if (r2 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r2 == false) goto L48;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performClick() {
        /*
            r8 = this;
            boolean r0 = super.performClick()
            r1 = 0
            if (r0 != 0) goto La
            r8.playSoundEffect(r1)
        La:
            r8.h()
            boolean r2 = r8.k
            r3 = 1
            if (r2 != 0) goto L14
            goto Laa
        L14:
            defpackage.bhd.c()
            bgw r2 = defpackage.bhd.a()
            if (r2 != 0) goto L1f
            r2 = 0
            goto L21
        L1f:
            bhm r2 = r2.p
        L21:
            if (r2 == 0) goto La4
            boolean r2 = r2.a
            if (r2 == 0) goto L9f
            boolean r2 = defpackage.bhd.e()
            if (r2 == 0) goto L9f
            boolean r2 = defpackage.akg.e()
            if (r2 == 0) goto L91
            android.content.Context r2 = r8.getContext()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG"
            android.content.Intent r4 = r4.setAction(r5)
            java.lang.String r5 = "com.android.systemui"
            android.content.Intent r4 = r4.setPackage(r5)
            java.lang.String r5 = r2.getPackageName()
            java.lang.String r6 = "package_name"
            android.content.Intent r4 = r4.putExtra(r6, r5)
            android.support.v4.media.session.MediaSessionCompat$Token r5 = defpackage.bhd.h()
            java.lang.String r6 = "key_media_session_token"
            android.content.Intent r4 = r4.putExtra(r6, r5)
            android.content.pm.PackageManager r5 = r2.getPackageManager()
            java.util.List r5 = r5.queryBroadcastReceivers(r4, r1)
            java.util.Iterator r5 = r5.iterator()
        L68:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r5.next()
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            if (r6 == 0) goto L68
            android.content.pm.ApplicationInfo r7 = r6.applicationInfo
            if (r7 == 0) goto L68
            android.content.pm.ApplicationInfo r6 = r6.applicationInfo
            int r6 = r6.flags
            r6 = r6 & 129(0x81, float:1.81E-43)
            if (r6 == 0) goto L68
            r2.sendBroadcast(r4)
            r2 = 1
            goto L8a
        L89:
            r2 = 0
        L8a:
            if (r2 != 0) goto L9d
            boolean r2 = r8.j()
            goto L9d
        L91:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r2 != r4) goto L9c
            boolean r2 = r8.j()
            goto L9d
        L9c:
            r2 = 0
        L9d:
            if (r2 != 0) goto Lae
        L9f:
            boolean r2 = r8.k()
            goto La8
        La4:
            boolean r2 = r8.k()
        La8:
            if (r2 != 0) goto Lae
        Laa:
            if (r0 == 0) goto Lad
            goto Lae
        Lad:
            return r1
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.performClick():boolean");
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.l = i;
        b();
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    public final void b() {
        super.setVisibility((this.l != 0 || this.t || d.b) ? this.l : 4);
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRouteButton(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = defpackage.kt.E(r10)
            r0.<init>(r10, r1)
            r10 = 2130969787(0x7f0404bb, float:1.7548266E38)
            int r10 = defpackage.kt.G(r0, r10)
            if (r10 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r10)
            r0 = r1
        L18:
            r9.<init>(r0, r11, r12)
            bgo r10 = defpackage.bgo.a
            r9.i = r10
            bfn r10 = defpackage.bfn.a
            r9.j = r10
            r10 = 0
            r9.l = r10
            android.content.Context r7 = r9.getContext()
            int[] r0 = defpackage.beo.a
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r11, r0, r12, r10)
            int[] r2 = defpackage.beo.a
            r6 = 0
            r0 = r9
            r1 = r7
            r3 = r11
            r4 = r8
            r5 = r12
            defpackage.lj.L(r0, r1, r2, r3, r4, r5, r6)
            boolean r11 = r9.isInEditMode()
            r12 = 3
            if (r11 == 0) goto L52
            r11 = 0
            r9.g = r11
            r9.h = r11
            int r10 = r8.getResourceId(r12, r10)
            android.graphics.drawable.Drawable r10 = defpackage.po.b(r7, r10)
            r9.m = r10
            return
        L52:
            bhd r11 = defpackage.bhd.b(r7)
            r9.g = r11
            beq r11 = new beq
            r11.<init>(r9)
            r9.h = r11
            bhc r11 = defpackage.bhd.j()
            boolean r0 = r11.j()
            if (r0 != 0) goto L6c
            int r11 = r11.h
            goto L6d
        L6c:
            r11 = 0
        L6d:
            r9.p = r11
            r9.o = r11
            bep r11 = androidx.mediarouter.app.MediaRouteButton.d
            if (r11 != 0) goto L80
            bep r11 = new bep
            android.content.Context r0 = r7.getApplicationContext()
            r11.<init>(r0)
            androidx.mediarouter.app.MediaRouteButton.d = r11
        L80:
            r11 = 4
            android.content.res.ColorStateList r11 = r8.getColorStateList(r11)
            r9.q = r11
            int r11 = r8.getDimensionPixelSize(r10, r10)
            r9.r = r11
            r11 = 1
            int r0 = r8.getDimensionPixelSize(r11, r10)
            r9.s = r0
            int r12 = r8.getResourceId(r12, r10)
            r0 = 2
            int r0 = r8.getResourceId(r0, r10)
            r9.n = r0
            r8.recycle()
            int r0 = r9.n
            if (r0 == 0) goto Lb7
            android.util.SparseArray r1 = androidx.mediarouter.app.MediaRouteButton.a
            java.lang.Object r0 = r1.get(r0)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto Lb7
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            r9.e(r0)
        Lb7:
            android.graphics.drawable.Drawable r0 = r9.m
            if (r0 != 0) goto Le5
            if (r12 == 0) goto Le2
            android.util.SparseArray r0 = androidx.mediarouter.app.MediaRouteButton.a
            java.lang.Object r0 = r0.get(r12)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto Lcf
            android.graphics.drawable.Drawable r10 = r0.newDrawable()
            r9.f(r10)
            goto Le5
        Lcf:
            ber r0 = new ber
            android.content.Context r1 = r9.getContext()
            r0.<init>(r9, r12, r1)
            r9.c = r0
            java.util.concurrent.Executor r12 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r10 = new java.lang.Void[r10]
            r0.executeOnExecutor(r12, r10)
            goto Le5
        Le2:
            r9.h()
        Le5:
            r9.i()
            r9.setClickable(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
