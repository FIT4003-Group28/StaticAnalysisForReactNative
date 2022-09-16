package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cfki  reason: default package */
/* loaded from: classes4.dex */
public class cfki {
    public final dzsj<Resources> a;
    public final dzsj<cqhu> b;
    public final dzsj<cfgv> c;
    public final dzsj<dxio<akzh>> d;
    public final dzsj<cjnf> e;
    public final dzsj<gce> f;
    public final dzsj<cfjy> g;
    public final dzsj<cfhy> h;

    public cfki(dzsj<Resources> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<cfgv> dzsjVar3, dzsj<dxio<akzh>> dzsjVar4, dzsj<cjnf> dzsjVar5, dzsj<gce> dzsjVar6, dzsj<cfjy> dzsjVar7, dzsj<cfhy> dzsjVar8) {
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
