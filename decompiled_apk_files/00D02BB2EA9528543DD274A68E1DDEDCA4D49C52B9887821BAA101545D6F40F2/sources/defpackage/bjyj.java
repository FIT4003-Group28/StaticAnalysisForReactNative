package defpackage;
/* compiled from: PG */
/* renamed from: bjyj  reason: default package */
/* loaded from: classes3.dex */
public class bjyj {
    public final dzsj<gga> a;
    public final dzsj<bkpi> b;
    public final dzsj<bjxv> c;
    public final dzsj<bkaa> d;
    public final dzsj<bjhc> e;

    public bjyj(dzsj<gga> dzsjVar, dzsj<bkpi> dzsjVar2, dzsj<bjxv> dzsjVar3, dzsj<bkaa> dzsjVar4, dzsj<bjhc> dzsjVar5) {
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
