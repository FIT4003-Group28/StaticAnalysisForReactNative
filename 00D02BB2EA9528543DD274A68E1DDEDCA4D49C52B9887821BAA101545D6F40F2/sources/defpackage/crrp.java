package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: crrp  reason: default package */
/* loaded from: classes5.dex */
public final class crrp {
    private final dzsj<btrm> a;
    private final dzsj<btvo> b;
    private final dzsj<btwd> c;
    private final dzsj<bvrb> d;
    private final dzsj<amyl> e;

    public crrp(dzsj<btrm> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<btwd> dzsjVar3, dzsj<bvrb> dzsjVar4, dzsj<amyl> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final crro a(crrs crrsVar, amco amcoVar, EnumSet<dqvj> enumSet, @dzsi String str) {
        btrm a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        btwd a2 = this.c.a();
        b(a2, 3);
        bvrb a3 = this.d.a();
        b(a3, 4);
        amyl a4 = this.e.a();
        b(a4, 5);
        b(crrsVar, 6);
        b(amcoVar, 7);
        b(enumSet, 8);
        return new crro(a, a2, a3, a4, crrsVar, amcoVar, enumSet, str);
    }
}
