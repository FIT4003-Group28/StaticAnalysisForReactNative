package defpackage;

import android.text.Spanned;
/* compiled from: PG */
/* renamed from: cfos  reason: default package */
/* loaded from: classes4.dex */
public class cfos {
    public static final cfor a(Spanned spanned, @dzsi Runnable runnable) {
        if (spanned != null) {
            return new cfor(spanned, runnable);
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
