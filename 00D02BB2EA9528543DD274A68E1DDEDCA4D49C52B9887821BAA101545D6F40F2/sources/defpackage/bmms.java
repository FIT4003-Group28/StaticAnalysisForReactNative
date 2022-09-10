package defpackage;
/* compiled from: PG */
/* renamed from: bmms  reason: default package */
/* loaded from: classes3.dex */
public class bmms {
    private final dzsj<gga> a;
    private final dzsj<dxio<afha>> b;

    public bmms(dzsj<gga> dzsjVar, dzsj<dxio<afha>> dzsjVar2) {
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

    public final bmmr a(String str, String str2, @dzsi String str3, boolean z, bwrs<ilo> bwrsVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        b(str, 3);
        b(str2, 4);
        b(bwrsVar, 7);
        return new bmmr(a, a2, str, str2, str3, z, bwrsVar);
    }
}
