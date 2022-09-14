package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: ckmu  reason: default package */
/* loaded from: classes4.dex */
public final class ckmu {
    public final dzsj<ckmm> a;
    public final dzsj<cqat> b;
    public final dzsj<Handler> c;

    public ckmu(dzsj<ckmm> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<Handler> dzsjVar3) {
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
