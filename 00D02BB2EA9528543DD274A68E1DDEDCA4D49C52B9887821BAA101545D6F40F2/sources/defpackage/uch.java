package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: uch  reason: default package */
/* loaded from: classes7.dex */
public final class uch {
    public final dzsj<Activity> a;
    public final dzsj<suv> b;
    public final dzsj<tgn> c;
    public final dzsj<cqhn> d;
    public final dzsj<cqat> e;
    public final dzsj<cqkj> f;
    public final dzsj<cqhu> g;
    public final dzsj<Executor> h;

    public uch(dzsj<Activity> dzsjVar, dzsj<suv> dzsjVar2, dzsj<tgn> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cqkj> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
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
