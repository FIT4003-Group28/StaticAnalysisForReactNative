package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgoe  reason: default package */
/* loaded from: classes3.dex */
public class bgoe {
    public final dzsj<Activity> a;
    public final dzsj<bmdq> b;
    public final dzsj<bgpa> c;
    public final dzsj<dxio<afha>> d;
    public final dzsj<dxio<bvvw>> e;
    public final dzsj<dxio<apyz>> f;
    public final dzsj<btvo> g;

    public bgoe(dzsj<Activity> dzsjVar, dzsj<bmdq> dzsjVar2, dzsj<bgpa> dzsjVar3, dzsj<dxio<afha>> dzsjVar4, dzsj<dxio<bvvw>> dzsjVar5, dzsj<dxio<apyz>> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
