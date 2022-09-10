package defpackage;
/* compiled from: PG */
/* renamed from: cfzb  reason: default package */
/* loaded from: classes4.dex */
public class cfzb {
    public final dzsj<btvo> a;
    public final dzsj<dxio<bqji>> b;
    public final dzsj<cgak> c;
    public final dzsj<dxio<begg>> d;

    public cfzb(dzsj<btvo> dzsjVar, dzsj<dxio<bqji>> dzsjVar2, dzsj<cgak> dzsjVar3, dzsj<dxio<begg>> dzsjVar4) {
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
