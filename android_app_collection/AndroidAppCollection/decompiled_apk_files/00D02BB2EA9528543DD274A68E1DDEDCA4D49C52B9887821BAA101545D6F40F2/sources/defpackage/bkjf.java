package defpackage;
/* compiled from: PG */
/* renamed from: bkjf  reason: default package */
/* loaded from: classes3.dex */
public class bkjf {
    public final dzsj<gga> a;
    public final dzsj<begg> b;
    public final dzsj<brba> c;
    public final dzsj<bnjv> d;

    public bkjf(dzsj<gga> dzsjVar, dzsj<begg> dzsjVar2, dzsj<brba> dzsjVar3, dzsj<bnjv> dzsjVar4) {
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
