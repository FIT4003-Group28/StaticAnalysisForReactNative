package defpackage;
/* compiled from: PG */
/* renamed from: bkkb  reason: default package */
/* loaded from: classes3.dex */
public final class bkkb {
    private final dzsj<dxio<bkpi>> a;
    private final dzsj<btvo> b;

    public bkkb(dzsj<dxio<bkpi>> dzsjVar, dzsj<btvo> dzsjVar2) {
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

    public final bkka a(CharSequence charSequence, String str, dgly dglyVar, String str2, bwrs<ilo> bwrsVar) {
        b(charSequence, 1);
        b(str, 2);
        b(bwrsVar, 5);
        dxio a = ((dxjh) this.a).a();
        b(a, 6);
        btvo a2 = this.b.a();
        b(a2, 7);
        return new bkka(charSequence, str, dglyVar, str2, bwrsVar, a, a2);
    }
}
