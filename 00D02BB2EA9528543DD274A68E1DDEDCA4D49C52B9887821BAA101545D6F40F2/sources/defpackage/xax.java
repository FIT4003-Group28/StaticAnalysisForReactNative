package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xax  reason: default package */
/* loaded from: classes7.dex */
public class xax {
    public final dzsj<Application> a;
    public final dzsj<xav> b;
    public final dzsj<wvi> c;
    public final dzsj<wvp> d;
    public final dzsj<wvj> e;

    public xax(dzsj<Application> dzsjVar, dzsj<xav> dzsjVar2, dzsj<wvi> dzsjVar3, dzsj<wvp> dzsjVar4, dzsj<wvj> dzsjVar5) {
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
