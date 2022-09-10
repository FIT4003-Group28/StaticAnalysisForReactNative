package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cavn  reason: default package */
/* loaded from: classes4.dex */
public final class cavn {
    public final dzsj<Resources> a;
    public final dzsj<bzyt> b;
    public final dzsj<bzyu> c;
    public final dzsj<bzyo> d;
    public final dzsj<cavr> e;
    public final dzsj<cklf> f;
    public final dzsj<cafi> g;
    public final dzsj<ech> h;

    public cavn(dzsj<Resources> dzsjVar, dzsj<bzyt> dzsjVar2, dzsj<bzyu> dzsjVar3, dzsj<bzyo> dzsjVar4, dzsj<cavr> dzsjVar5, dzsj<cklf> dzsjVar6, dzsj<cafi> dzsjVar7, dzsj<ech> dzsjVar8) {
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
