package defpackage;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: alr  reason: default package */
/* loaded from: classes2.dex */
public final class alr {
    public final TextPaint a;
    public TextDirectionHeuristic b;
    public int c;
    public int d;

    public alr(TextPaint textPaint) {
        this.a = textPaint;
        if (Build.VERSION.SDK_INT >= 23) {
            this.c = 1;
            this.d = 1;
        } else {
            this.d = 0;
            this.c = 0;
        }
        this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }
}
