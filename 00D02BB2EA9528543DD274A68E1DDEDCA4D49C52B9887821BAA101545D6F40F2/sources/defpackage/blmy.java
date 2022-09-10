package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blmy  reason: default package */
/* loaded from: classes3.dex */
public class blmy {
    public final dzsj<Activity> a;
    public final dzsj<eeu> b;
    public final dzsj<cjqy> c;
    public final dzsj<dxio<bqji>> d;
    public final dzsj<bvrb> e;
    public final dzsj<btvo> f;
    public final dzsj<cpv> g;
    public final dzsj<cebr> h;
    public final dzsj<dxio<cdjj>> i;

    public blmy(dzsj<Activity> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<dxio<bqji>> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<cpv> dzsjVar7, dzsj<cebr> dzsjVar8, dzsj<dxio<cdjj>> dzsjVar9) {
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
