package com.facebook.g.a.b;

import android.support.v4.h.b;
import android.support.v4.h.c;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: StaticLayoutProxy.java */
/* loaded from: classes.dex */
public class a {
    public static StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Layout.Alignment alignment, float f, float f2, boolean z, TextUtils.TruncateAt truncateAt, int i4, int i5, b bVar) {
        return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, a(bVar), f, f2, z, truncateAt, i4, i5);
    }

    private static TextDirectionHeuristic a(b bVar) {
        if (bVar == c.f427a) {
            return TextDirectionHeuristics.LTR;
        }
        if (bVar == c.f428b) {
            return TextDirectionHeuristics.RTL;
        }
        if (bVar == c.f429c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (bVar == c.f430d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (bVar == c.e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (bVar == c.f) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
