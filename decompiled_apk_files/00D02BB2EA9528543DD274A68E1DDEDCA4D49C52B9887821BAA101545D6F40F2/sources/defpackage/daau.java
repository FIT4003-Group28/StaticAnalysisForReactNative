package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* compiled from: PG */
/* renamed from: daau  reason: default package */
/* loaded from: classes5.dex */
final class daau {
    public static boolean a;
    public static Constructor<StaticLayout> b;
    public static Object c;
    public CharSequence d;
    public final TextPaint e;
    public final int f;
    public int g;
    public boolean k;
    public Layout.Alignment h = Layout.Alignment.ALIGN_NORMAL;
    public int i = Integer.MAX_VALUE;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    public daau(CharSequence charSequence, TextPaint textPaint, int i) {
        this.d = charSequence;
        this.e = textPaint;
        this.f = i;
        this.g = charSequence.length();
    }
}
