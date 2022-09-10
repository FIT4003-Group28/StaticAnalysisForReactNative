package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chnt  reason: default package */
/* loaded from: classes4.dex */
public final class chnt {
    public final dzsj<buva> a;
    public final dzsj<chnz> b;
    public final dzsj<chrz> c;
    public final dzsj<chnr> d;
    public final dzsj<bvjj> e;
    public final dzsj<btvo> f;
    public final dzsj<Resources> g;
    public final dzsj<Executor> h;

    public chnt(dzsj<buva> dzsjVar, dzsj<chnz> dzsjVar2, dzsj<chrz> dzsjVar3, dzsj<chnr> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<Resources> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
