package defpackage;
/* compiled from: PG */
/* renamed from: cira  reason: default package */
/* loaded from: classes4.dex */
public final class cira {
    private final dzsj<cchz> a;
    private final dzsj<dxio<chjx>> b;
    private final dzsj<chiu> c;

    public cira(dzsj<cchz> dzsjVar, dzsj<dxio<chjx>> dzsjVar2, dzsj<chiu> dzsjVar3) {
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

    public final ciqz a(@dzsi cqix<? extends cqkp> cqixVar, int i, CharSequence charSequence, boolean z, boolean z2, cjtd cjtdVar) {
        cchz a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        chiu a3 = this.c.a();
        b(a3, 3);
        b(charSequence, 6);
        b(cjtdVar, 9);
        return new ciqz(a, a2, a3, cqixVar, i, charSequence, z, z2, cjtdVar);
    }
}
