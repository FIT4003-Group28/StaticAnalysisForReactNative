package defpackage;
/* compiled from: PG */
/* renamed from: bdog  reason: default package */
/* loaded from: classes3.dex */
public final class bdog {
    private final dzsj<fd> a;
    private final dzsj<ckcw> b;
    private final dzsj<bdgd> c;

    public bdog(dzsj<fd> dzsjVar, dzsj<ckcw> dzsjVar2, dzsj<bdgd> dzsjVar3) {
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

    public final bdof a(bdmb bdmbVar, dbsg<bdmb> dbsgVar, bdoe bdoeVar, int i, int i2, boolean z) {
        b(bdmbVar, 1);
        b(dbsgVar, 2);
        b(bdoeVar, 3);
        fd fdVar = (fd) ((dxjd) this.a).a;
        b(fdVar, 7);
        ckcw a = this.b.a();
        b(a, 8);
        bdgd a2 = this.c.a();
        b(a2, 9);
        return new bdof(bdmbVar, dbsgVar, bdoeVar, i, i2, z, fdVar, a, a2);
    }
}
