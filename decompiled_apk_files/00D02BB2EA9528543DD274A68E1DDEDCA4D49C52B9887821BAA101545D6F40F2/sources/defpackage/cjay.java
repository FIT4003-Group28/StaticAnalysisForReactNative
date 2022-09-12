package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cjay  reason: default package */
/* loaded from: classes4.dex */
public final class cjay {
    public final dzsj<cqhn> a;
    public final dzsj<Resources> b;
    public final dzsj<cfig> c;

    public cjay(dzsj<cqhn> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<cfig> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
