package defpackage;
/* compiled from: PG */
/* renamed from: bfll  reason: default package */
/* loaded from: classes3.dex */
public class bfll {
    private final dzsj<bfli> a;
    private final dzsj<bvsx> b;

    public bfll(dzsj<bfli> dzsjVar, dzsj<bvsx> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bflk a(gga ggaVar, String str, cjtd cjtdVar, bflm bflmVar) {
        bfli a = this.a.a();
        b(a, 1);
        bvsx a2 = this.b.a();
        b(a2, 2);
        b(ggaVar, 3);
        b(str, 4);
        b(cjtdVar, 5);
        b(bflmVar, 6);
        return new bflk(a, a2, ggaVar, str, cjtdVar, bflmVar);
    }
}
