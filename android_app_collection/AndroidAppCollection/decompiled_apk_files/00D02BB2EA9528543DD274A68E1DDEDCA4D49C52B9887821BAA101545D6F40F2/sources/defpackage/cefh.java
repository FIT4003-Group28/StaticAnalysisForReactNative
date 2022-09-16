package defpackage;
/* compiled from: PG */
/* renamed from: cefh  reason: default package */
/* loaded from: classes4.dex */
public class cefh {
    private final dzsj<anhk> a;
    private final dzsj<buvk> b;
    private final dzsj<cese> c;

    public cefh(dzsj<anhk> dzsjVar, dzsj<buvk> dzsjVar2, dzsj<cese> dzsjVar3) {
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

    public final cefg a(cgrc cgrcVar, dwvz dwvzVar) {
        anhk a = this.a.a();
        b(a, 1);
        buvk a2 = this.b.a();
        b(a2, 2);
        cese a3 = this.c.a();
        b(a3, 3);
        b(cgrcVar, 4);
        b(dwvzVar, 5);
        return new cefg(a, a2, a3, cgrcVar, dwvzVar);
    }
}
