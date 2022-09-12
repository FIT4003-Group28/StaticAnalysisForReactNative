package defpackage;
/* compiled from: PG */
/* renamed from: bnhv  reason: default package */
/* loaded from: classes3.dex */
public class bnhv {
    private final dzsj<begg> a;
    private final dzsj<cjqy> b;

    public bnhv(dzsj<begg> dzsjVar, dzsj<cjqy> dzsjVar2) {
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

    public final bnhu a(String str, akqi akqiVar, cjtd cjtdVar) {
        begg a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        b(str, 3);
        b(akqiVar, 4);
        b(cjtdVar, 5);
        return new bnhu(a, a2, str, akqiVar, cjtdVar);
    }
}
