package defpackage;
/* compiled from: PG */
/* renamed from: bebo  reason: default package */
/* loaded from: classes3.dex */
public class bebo {
    public final dzsj<bebu> a;
    public final dzsj<becn> b;
    public final dzsj<dxio<brba>> c;

    public bebo(dzsj<bebu> dzsjVar, dzsj<becn> dzsjVar2, dzsj<dxio<brba>> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
