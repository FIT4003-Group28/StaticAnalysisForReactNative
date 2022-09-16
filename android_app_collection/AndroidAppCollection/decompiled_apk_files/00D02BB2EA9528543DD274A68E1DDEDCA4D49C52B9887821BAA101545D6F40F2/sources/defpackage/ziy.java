package defpackage;
/* compiled from: PG */
/* renamed from: ziy  reason: default package */
/* loaded from: classes7.dex */
public final class ziy implements brva {
    private final dzsj<gga> a;
    private final dzsj<bmom> b;
    private final dzsj<brsc> c;
    private final dzsj<btvo> d;

    public ziy(dzsj<gga> dzsjVar, dzsj<bmom> dzsjVar2, dzsj<brsc> dzsjVar3, dzsj<btvo> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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
        bmom a2 = this.b.a();
        b(a2, 2);
        brsc a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        b(jbaVar, 5);
        b(brrxVar, 6);
        return new zix(a, a2, a3, a4, jbaVar, brrxVar);
    }
}
