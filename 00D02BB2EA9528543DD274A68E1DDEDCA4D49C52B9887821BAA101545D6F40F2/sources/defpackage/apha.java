package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: apha  reason: default package */
/* loaded from: classes2.dex */
public final class apha {
    public final dzsj<Resources> a;
    public final dzsj<gga> b;

    public apha(dzsj<Resources> dzsjVar, dzsj<gga> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
