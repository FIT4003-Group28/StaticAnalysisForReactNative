package defpackage;
/* compiled from: PG */
/* renamed from: antx  reason: default package */
/* loaded from: classes2.dex */
public class antx {
    public final dzsj<anri> a;
    public final dzsj<anpb> b;
    public final dzsj<anpc> c;
    public final dzsj<bvsl> d;

    public antx(dzsj<anri> dzsjVar, dzsj<anpb> dzsjVar2, dzsj<anpc> dzsjVar3, dzsj<bvsl> dzsjVar4) {
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
