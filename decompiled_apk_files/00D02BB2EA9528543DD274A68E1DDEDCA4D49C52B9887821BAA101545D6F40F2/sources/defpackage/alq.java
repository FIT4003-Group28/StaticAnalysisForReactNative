package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
/* compiled from: PG */
/* renamed from: alq  reason: default package */
/* loaded from: classes2.dex */
public final class alq {
    public static Spanned a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, i);
        }
        return Html.fromHtml(str);
    }
}
