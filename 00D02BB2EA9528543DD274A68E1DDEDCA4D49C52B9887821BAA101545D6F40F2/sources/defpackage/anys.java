package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: anys  reason: default package */
/* loaded from: classes2.dex */
public final class anys {
    public final dzsj<Application> a;
    public final dzsj<bvsl> b;
    public final dzsj<anuv> c;
    public final dzsj<eapg> d;

    public anys(dzsj<Application> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<anuv> dzsjVar3, dzsj<eapg> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
