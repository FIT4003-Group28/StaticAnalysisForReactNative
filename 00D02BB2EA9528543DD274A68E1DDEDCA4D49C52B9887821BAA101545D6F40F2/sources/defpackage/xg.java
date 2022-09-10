package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public final class xg {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    public xg(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x002a, B:14:0x0051, B:16:0x0058, B:17:0x0061, B:19:0x0068, B:9:0x0038, B:11:0x003e, B:13:0x0044), top: B:28:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:3:0x001e, B:5:0x0024, B:7:0x002a, B:14:0x0051, B:16:0x0058, B:17:0x0061, B:19:0x0068, B:9:0x0038, B:11:0x003e, B:13:0x0044), top: B:28:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.sj.l
            r2 = 0
            aeq r0 = defpackage.aeq.b(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.a
            android.content.Context r4 = r3.getContext()
            int[] r5 = defpackage.sj.l
            android.content.res.TypedArray r7 = r0.b
            r9 = 0
            r6 = r11
            r8 = r12
            defpackage.od.a(r3, r4, r5, r6, r7, r8, r9)
            r11 = 1
            boolean r12 = r0.p(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L38
            int r11 = r0.o(r11, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L38
            android.widget.CompoundButton r12 = r10.a     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.content.Context r1 = r12.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.sl.b(r1, r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L38 java.lang.Throwable -> L7b
            goto L51
        L38:
            boolean r11 = r0.p(r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            int r11 = r0.o(r2, r2)     // Catch: java.lang.Throwable -> L7b
            if (r11 == 0) goto L51
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L7b
            android.graphics.drawable.Drawable r11 = defpackage.sl.b(r1, r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L7b
        L51:
            r11 = 2
            boolean r12 = r0.p(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L61
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            android.content.res.ColorStateList r11 = r0.j(r11)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintList(r11)     // Catch: java.lang.Throwable -> L7b
        L61:
            r11 = 3
            boolean r12 = r0.p(r11)     // Catch: java.lang.Throwable -> L7b
            if (r12 == 0) goto L77
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L7b
            r1 = -1
            int r11 = r0.i(r11, r1)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            android.graphics.PorterDuff$Mode r11 = defpackage.ze.d(r11, r1)     // Catch: java.lang.Throwable -> L7b
            r12.setButtonTintMode(r11)     // Catch: java.lang.Throwable -> L7b
        L77:
            r0.q()
            return
        L7b:
            r11 = move-exception
            r0.q()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.a(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        e();
    }

    final void e() {
        Drawable a = pv.a(this.a);
        if (a != null) {
            if (!this.d && !this.e) {
                return;
            }
            Drawable mutate = ks.b(a).mutate();
            if (this.d) {
                mutate.setTintList(this.b);
            }
            if (this.e) {
                mutate.setTintMode(this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }
}
