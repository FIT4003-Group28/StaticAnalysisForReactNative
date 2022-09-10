package defpackage;
/* compiled from: PG */
/* renamed from: avas  reason: default package */
/* loaded from: classes2.dex */
public final class avas {
    public final dzsj<cqat> a;
    public final dzsj<awkw> b;
    public final dzsj<dehq> c;
    public final dzsj<dehq> d;

    public avas(dzsj<cqat> dzsjVar, dzsj<awkw> dzsjVar2, dzsj<dehq> dzsjVar3, dzsj<dehq> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
