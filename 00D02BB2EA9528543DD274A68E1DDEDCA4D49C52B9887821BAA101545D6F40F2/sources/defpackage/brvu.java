package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: brvu  reason: default package */
/* loaded from: classes4.dex */
public final class brvu {
    public final dzsj<btvo> a;
    public final dzsj<ahjq> b;
    public final dzsj<dxio<abfa>> c;
    public final dzsj<Map<dghs, brva>> d;
    public final dzsj<bmom> e;

    public brvu(dzsj<btvo> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<dxio<abfa>> dzsjVar3, dzsj<Map<dghs, brva>> dzsjVar4, dzsj<bmom> dzsjVar5) {
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