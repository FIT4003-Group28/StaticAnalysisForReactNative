package defpackage;
/* compiled from: PG */
/* renamed from: ahha  reason: default package */
/* loaded from: classes2.dex */
public class ahha {
    public final dzsj<cqhn> a;
    public final dzsj<gga> b;
    public final dzsj<agaw> c;
    public final dzsj<dehq> d;
    public final dzsj<dehq> e;
    public final dzsj<agbv<akqi>> f;

    public ahha(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2, dzsj<agaw> dzsjVar3, dzsj<dehq> dzsjVar4, dzsj<dehq> dzsjVar5, dzsj<agbv<akqi>> dzsjVar6) {
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
