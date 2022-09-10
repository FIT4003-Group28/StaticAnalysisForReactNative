package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blyw  reason: default package */
/* loaded from: classes3.dex */
public final class blyw {
    public final dzsj<Activity> a;
    public final dzsj<blzs> b;
    public final dzsj<blye> c;
    public final dzsj<angp> d;
    public final dzsj<blpg> e;
    public final dzsj<akfa> f;
    public final dzsj<cjqy> g;
    public final dzsj<bvrb> h;
    public final dzsj<blpp> i;
    public final dzsj<cqat> j;
    public final dzsj<bqji> k;
    public final dzsj<blwk> l;

    public blyw(dzsj<Activity> dzsjVar, dzsj<blzs> dzsjVar2, dzsj<blye> dzsjVar3, dzsj<angp> dzsjVar4, dzsj<blpg> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<blpp> dzsjVar9, dzsj<cqat> dzsjVar10, dzsj<bqji> dzsjVar11, dzsj<blwk> dzsjVar12) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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
