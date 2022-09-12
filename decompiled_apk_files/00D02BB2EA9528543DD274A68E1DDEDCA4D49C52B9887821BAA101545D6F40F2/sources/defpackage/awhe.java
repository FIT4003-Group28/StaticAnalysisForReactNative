package defpackage;
/* compiled from: PG */
/* renamed from: awhe  reason: default package */
/* loaded from: classes3.dex */
public class awhe {
    public final dzsj<avqd> a;
    public final dzsj<awby> b;
    public final dzsj<avyx> c;
    public final dzsj<awhh> d;

    public awhe(dzsj<avqd> dzsjVar, dzsj<awby> dzsjVar2, dzsj<avyx> dzsjVar3, dzsj<awhh> dzsjVar4) {
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
