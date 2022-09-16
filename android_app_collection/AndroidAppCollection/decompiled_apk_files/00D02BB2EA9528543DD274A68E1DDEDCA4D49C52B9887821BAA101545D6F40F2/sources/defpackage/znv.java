package defpackage;
/* compiled from: PG */
/* renamed from: znv  reason: default package */
/* loaded from: classes7.dex */
public final class znv implements brva {
    private final dzsj<gga> a;
    private final dzsj<brsc> b;
    private final dzsj<btvo> c;

    public znv(dzsj<gga> dzsjVar, dzsj<brsc> dzsjVar2, dzsj<btvo> dzsjVar3) {
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

    @Override // defpackage.brva
    public final /* bridge */ /* synthetic */ brvb a(jba jbaVar, brrx brrxVar) {
        gga a = this.a.a();
        b(a, 1);
        brsc a2 = this.b.a();
        b(a2, 2);
        b(this.c.a(), 3);
        b(jbaVar, 4);
        b(brrxVar, 5);
        return new znu(a, a2, brrxVar);
    }
}
