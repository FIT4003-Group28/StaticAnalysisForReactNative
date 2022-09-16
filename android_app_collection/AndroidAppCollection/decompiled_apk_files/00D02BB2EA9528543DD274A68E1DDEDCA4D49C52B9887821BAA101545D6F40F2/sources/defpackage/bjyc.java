package defpackage;
/* compiled from: PG */
/* renamed from: bjyc  reason: default package */
/* loaded from: classes3.dex */
public class bjyc {
    public final dzsj<gga> a;
    public final dzsj<bjbu> b;
    public final dzsj<bjgy> c;
    public final dzsj<bjxv> d;
    public final dzsj<bkaa> e;

    public bjyc(dzsj<gga> dzsjVar, dzsj<bjbu> dzsjVar2, dzsj<bjgy> dzsjVar3, dzsj<bjxv> dzsjVar4, dzsj<bkaa> dzsjVar5) {
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
