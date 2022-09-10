package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cewg  reason: default package */
/* loaded from: classes4.dex */
public class cewg {
    public final dzsj<Resources> a;
    public final dzsj<bbut> b;

    public cewg(dzsj<Resources> dzsjVar, dzsj<bbut> dzsjVar2) {
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
