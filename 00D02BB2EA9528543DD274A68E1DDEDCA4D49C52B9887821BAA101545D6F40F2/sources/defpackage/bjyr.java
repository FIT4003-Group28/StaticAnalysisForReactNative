package defpackage;
/* compiled from: PG */
/* renamed from: bjyr  reason: default package */
/* loaded from: classes3.dex */
public final class bjyr {
    private final dzsj<gga> a;
    private final dzsj<afgy> b;

    public bjyr(dzsj<gga> dzsjVar, dzsj<afgy> dzsjVar2) {
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

    public final void a(bwrs<ilo> bwrsVar, djam djamVar, boolean z) {
        gga a = this.a.a();
        b(a, 1);
        afgy a2 = this.b.a();
        b(a2, 2);
        b(bwrsVar, 3);
        b(djamVar, 4);
        new bjyq(a, a2, bwrsVar, djamVar, z);
    }
}
