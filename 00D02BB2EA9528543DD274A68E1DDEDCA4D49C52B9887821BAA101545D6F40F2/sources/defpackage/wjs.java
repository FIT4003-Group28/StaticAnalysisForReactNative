package defpackage;
/* compiled from: PG */
/* renamed from: wjs  reason: default package */
/* loaded from: classes7.dex */
public class wjs {
    public final dzsj<vtn> a;
    public final dzsj<qbt> b;
    public final dzsj<wsm> c;
    public final dzsj<wjv> d;
    public final dzsj<zrt> e;

    public wjs(dzsj<vtn> dzsjVar, dzsj<qbt> dzsjVar2, dzsj<wsm> dzsjVar3, dzsj<wjv> dzsjVar4, dzsj<zrt> dzsjVar5) {
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
