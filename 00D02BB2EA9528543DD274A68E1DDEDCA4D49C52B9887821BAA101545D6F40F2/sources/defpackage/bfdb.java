package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfdb  reason: default package */
/* loaded from: classes3.dex */
public final class bfdb {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<cqhn> c;
    public final dzsj<cqhu> d;
    public final dzsj<bfaq> e;
    public final dzsj<gga> f;
    public final dzsj<bvrb> g;
    public final dzsj<dxio<bzmm>> h;
    public final dzsj<dxio<cjqq>> i;

    public bfdb(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cqhu> dzsjVar4, dzsj<bfaq> dzsjVar5, dzsj<gga> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<dxio<bzmm>> dzsjVar8, dzsj<dxio<cjqq>> dzsjVar9) {
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
