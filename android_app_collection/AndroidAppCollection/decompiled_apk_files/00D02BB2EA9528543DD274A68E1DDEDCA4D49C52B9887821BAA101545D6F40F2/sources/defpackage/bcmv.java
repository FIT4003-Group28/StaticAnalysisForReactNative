package defpackage;
/* compiled from: PG */
/* renamed from: bcmv  reason: default package */
/* loaded from: classes3.dex */
public final class bcmv {
    private final dzsj<bcms> a;

    public bcmv(dzsj<bcms> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bcmu a(String str, dweu dweuVar, bbuq bbuqVar, @dzsi dwfl dwflVar, cjtd cjtdVar, @dzsi cjtd cjtdVar2, @dzsi ilo iloVar, @dzsi bcmg bcmgVar, boolean z) {
        bcms a = this.a.a();
        b(a, 1);
        b(str, 2);
        b(dweuVar, 3);
        b(bbuqVar, 4);
        b(cjtdVar, 6);
        return new bcmu(a, str, dweuVar, bbuqVar, dwflVar, cjtdVar, cjtdVar2, iloVar, bcmgVar, z);
    }
}
