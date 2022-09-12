package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chjr  reason: default package */
/* loaded from: classes4.dex */
public final class chjr {
    public final dzsj<cchz> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<ccif> d;
    public final dzsj<Resources> e;

    public chjr(dzsj<cchz> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<ccif> dzsjVar4, dzsj<Resources> dzsjVar5) {
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
