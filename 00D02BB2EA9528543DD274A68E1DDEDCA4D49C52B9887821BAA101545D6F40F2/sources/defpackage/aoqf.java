package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoqf  reason: default package */
/* loaded from: classes2.dex */
public class aoqf {
    public final dzsj<Application> a;
    public final dzsj<jkf> b;
    public final dzsj<anpc> c;
    public final dzsj<apjv> d;
    public final dzsj<anpb> e;

    public aoqf(dzsj<Application> dzsjVar, dzsj<jkf> dzsjVar2, dzsj<anpc> dzsjVar3, dzsj<apjv> dzsjVar4, dzsj<anpb> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
