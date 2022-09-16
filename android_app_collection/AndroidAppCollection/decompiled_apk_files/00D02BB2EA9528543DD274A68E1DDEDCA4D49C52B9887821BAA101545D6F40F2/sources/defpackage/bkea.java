package defpackage;
/* compiled from: PG */
/* renamed from: bkea  reason: default package */
/* loaded from: classes3.dex */
public class bkea {
    private final dzsj<gga> a;
    private final dzsj<bkdc> b;
    private final dzsj<bkeo> c;

    public bkea(dzsj<gga> dzsjVar, dzsj<bkdc> dzsjVar2, dzsj<bkeo> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final bkdz a(dgiy dgiyVar, ddho ddhoVar, boolean z, boolean z2) {
        gga a = this.a.a();
        b(a, 1);
        bkdc a2 = this.b.a();
        b(a2, 2);
        b(this.c.a(), 3);
        b(dgiyVar, 4);
        b(ddhoVar, 5);
        return new bkdz(a, a2, dgiyVar, ddhoVar, z, z2);
    }
}
