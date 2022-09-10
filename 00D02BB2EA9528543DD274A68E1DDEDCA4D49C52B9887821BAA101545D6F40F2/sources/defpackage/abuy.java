package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abuy  reason: default package */
/* loaded from: classes.dex */
public final class abuy {
    public final dzsj<bnjv> a;
    public final dzsj<dxio<begg>> b;
    public final dzsj<Activity> c;
    public final dzsj<bvpe> d;
    public final dzsj<huc> e;
    public final dzsj<ahjq> f;
    public final dzsj<bvsl> g;
    public final dzsj<abuu> h;

    public abuy(dzsj<bnjv> dzsjVar, dzsj<dxio<begg>> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<bvpe> dzsjVar4, dzsj<huc> dzsjVar5, dzsj<ahjq> dzsjVar6, dzsj<bvsl> dzsjVar7, dzsj<abuu> dzsjVar8) {
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
