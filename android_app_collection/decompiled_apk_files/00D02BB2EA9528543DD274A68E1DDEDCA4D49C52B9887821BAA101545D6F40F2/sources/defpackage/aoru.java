package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoru  reason: default package */
/* loaded from: classes2.dex */
public class aoru {
    public final dzsj<Application> a;
    public final dzsj<anqv> b;
    public final dzsj<aorn> c;
    public final dzsj<jkf> d;
    public final dzsj<apjv> e;
    public final dzsj<anru> f;
    public final dzsj<anrz> g;

    public aoru(dzsj<Application> dzsjVar, dzsj<anqv> dzsjVar2, dzsj<aorn> dzsjVar3, dzsj<jkf> dzsjVar4, dzsj<apjv> dzsjVar5, dzsj<anru> dzsjVar6, dzsj<anrz> dzsjVar7) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
