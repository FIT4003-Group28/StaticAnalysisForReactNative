package defpackage;

import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: anr  reason: default package */
/* loaded from: classes.dex */
public final class anr implements anl {
    public static final ThreadLocal a = new ThreadLocal();
    public final TextPaint b;

    public anr() {
        TextPaint textPaint = new TextPaint();
        this.b = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
