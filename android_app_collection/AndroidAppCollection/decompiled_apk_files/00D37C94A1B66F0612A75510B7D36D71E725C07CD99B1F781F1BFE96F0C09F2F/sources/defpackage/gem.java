package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gem  reason: default package */
/* loaded from: classes3.dex */
public final class gem implements ajrx {
    public frf a;
    public View b;
    private final Context c;
    private final nfv d;
    private final boolean e;
    private View.OnClickListener f;
    private boolean g;

    public gem(Context context, nfv nfvVar) {
        this(context, nfvVar, false);
    }

    private final frf f(int i, int i2, int i3) {
        Drawable layerDrawable;
        nfv nfvVar = this.d;
        if (nfvVar == null || !nfvVar.a()) {
            Drawable drawable = (Drawable) zhn.i(this.c, true != this.e ? R.attr.selectableItemBackground : R.attr.selectableItemBackgroundSolid).orElse(null);
            ColorDrawable colorDrawable = new ColorDrawable(i);
            layerDrawable = drawable == null ? colorDrawable : new LayerDrawable(new Drawable[]{colorDrawable, drawable});
        } else {
            ColorDrawable colorDrawable2 = new ColorDrawable(i);
            akej a = akej.a(this.c);
            a.b = colorDrawable2;
            layerDrawable = a.b();
        }
        if (i3 == 0) {
            i3 = zhn.j(this.c, R.attr.listItemChrome).orElse(0);
        }
        if (i2 <= 0) {
            i2 = this.c.getResources().getDimensionPixelSize(R.dimen.line_separator_height);
        }
        return new frf(layerDrawable, i3, i2);
    }

    @Override // defpackage.ajrx
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajrx
    public final void b(boolean z) {
        this.g = z;
        View view = this.b;
        if (view != null) {
            view.setClickable(z);
        }
    }

    @Override // defpackage.ajrx
    public final void c(View view) {
        view.getClass();
        this.b = view;
        view.setOnClickListener(this.f);
        this.b.setClickable(this.g);
    }

    @Override // defpackage.ajrx
    public final void d(View.OnClickListener onClickListener) {
        this.f = onClickListener;
        View view = this.b;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r5.j("showLineSeparator", false) != false) goto L11;
     */
    @Override // defpackage.ajrx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ajrs r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.b
            r0.getClass()
            java.lang.String r0 = "setBackgroundColor"
            r1 = 0
            int r0 = r5.b(r0, r1)
            frf r2 = r4.a
            int r3 = r2.a
            float r3 = (float) r3
            int r3 = (int) r3
            int r2 = r2.a()
            frf r0 = r4.f(r0, r3, r2)
            r4.a = r0
            ajqx r0 = defpackage.ajqx.a(r5)
            boolean r0 = r0.b()
            r2 = 1
            if (r0 == 0) goto L48
            java.lang.String r0 = "lineSeparatorOverride"
            int r0 = r5.b(r0, r1)
            if (r0 == 0) goto L3f
            if (r0 == r2) goto L3d
            r5 = 2
            if (r0 != r5) goto L35
            goto L48
        L35:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "LineSeparatorOverrideOps not supported"
            r5.<init>(r0)
            throw r5
        L3d:
            r1 = 1
            goto L48
        L3f:
            java.lang.String r0 = "showLineSeparator"
            boolean r5 = r5.j(r0, r1)
            if (r5 == 0) goto L48
            goto L3d
        L48:
            frf r5 = r4.a
            r5.e(r1)
            android.view.View r5 = r4.b
            frf r0 = r4.a
            defpackage.zav.c(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gem.e(ajrs):void");
    }

    @Deprecated
    public gem(Context context, nfv nfvVar, boolean z) {
        context.getClass();
        this.c = context;
        this.d = nfvVar;
        this.e = z;
        this.a = f(0, 0, 0);
    }
}
