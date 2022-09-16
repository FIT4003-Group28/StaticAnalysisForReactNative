package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InlineTimeBarWrapper extends ViewGroup implements azqb {
    public final ffh a;

    public InlineTimeBarWrapper(Context context) {
        this(context, null);
    }

    @Override // defpackage.azqb
    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }

    @Override // android.view.View
    public final boolean isImportantForAccessibility() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.HashSet, java.util.Set] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i3 - i;
        int i7 = i4 - i2;
        if (i6 == 0 || i7 == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int i8 = 0;
        int max = Math.max(0, i6 - getPaddingRight());
        int b = this.a.b();
        int i9 = i7 - b;
        if (!this.a.D()) {
            ffh ffhVar = this.a;
            if (ffhVar.l == null) {
                ffhVar.l = new zaj();
            }
            ?? r6 = ffhVar.k;
            ffh ffhVar2 = null;
            if (r6 != 0) {
                if (ffhVar != r6) {
                    ?? hashSet = new HashSet();
                    for (View view = ffhVar; view != null; view = ffh.f(view)) {
                        hashSet.add(view);
                    }
                    while (true) {
                        if (r6 == 0) {
                            break;
                        }
                        if (hashSet.contains(r6)) {
                            ffhVar2 = r6;
                            break;
                        }
                        r6 = ffh.f((View) r6);
                    }
                } else {
                    ffhVar2 = ffhVar;
                }
            }
            zaj.c(ffhVar.l, ffhVar.k, ffhVar2);
            Rect rect = ffhVar.l.a;
            if (rect.width() > 0) {
                paddingLeft = rect.left - i;
                max = rect.right - i;
            }
            i5 = (rect.top - i2) + ((rect.height() - b) / 2);
        } else {
            i5 = i9;
        }
        ffh ffhVar3 = this.a;
        int i10 = max - paddingLeft;
        ffi ffiVar = ffhVar3.c;
        if (ffiVar.y) {
            b = (b / 2) + ffiVar.x;
        }
        ffhVar3.g.set(0, 0, i10, b);
        if (this.a.D()) {
            this.a.layout(0, Math.max(0, i9), i6, i7);
            return;
        }
        if (i5 <= i4) {
            i8 = Math.max(0, i5);
        }
        this.a.layout(paddingLeft, i8, max, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.a.D()) {
            size2 += Math.round((this.a.b() - this.a.i) / 2.0f);
        }
        this.a.measure(i, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        setMeasuredDimension(size, size2);
    }

    public InlineTimeBarWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ffh ffhVar = new ffh(context, attributeSet);
        this.a = ffhVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fft.b, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            int i = obtainStyledAttributes.getInt(0, -1);
            if (i != -1) {
                ffhVar.u(i);
            }
        } else {
            ffhVar.u(2);
        }
        obtainStyledAttributes.recycle();
        addView(ffhVar);
    }
}
