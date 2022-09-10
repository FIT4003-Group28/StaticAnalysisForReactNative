package defpackage;
/* compiled from: PG */
/* renamed from: ixv  reason: default package */
/* loaded from: classes6.dex */
public class ixv {
    public final dzsj<ff> a;
    public final dzsj<bwft> b;
    public final dzsj<ckcw> c;

    public ixv(dzsj<ff> dzsjVar, dzsj<bwft> dzsjVar2, dzsj<ckcw> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ixu a(cdjd cdjdVar, String str, boolean z) {
        b(cdjdVar, 1);
        b(str, 2);
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar, 4);
        bwft a = this.b.a();
        b(a, 5);
        ckcw a2 = this.c.a();
        b(a2, 6);
        return new ixu(cdjdVar, str, z, ffVar, a, a2);
    }
}
