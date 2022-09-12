package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bjph  reason: default package */
/* loaded from: classes3.dex */
public final class bjph {
    public final dzsj<Resources> a;

    public bjph(dzsj<Resources> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
