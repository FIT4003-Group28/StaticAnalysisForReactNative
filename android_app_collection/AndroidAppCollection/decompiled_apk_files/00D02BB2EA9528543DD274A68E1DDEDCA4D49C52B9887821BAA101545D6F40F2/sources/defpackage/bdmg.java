package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bdmg  reason: default package */
/* loaded from: classes3.dex */
public final class bdmg extends bdup {
    private final dzsj<Application> a;
    private final dzsj<cqat> b;
    private final dzsj<bdkj> c;
    private final dzsj<bdme> d;
    private final dzsj<bcpe> e;

    public bdmg(dzsj<Application> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<bdkj> dzsjVar3, dzsj<bdme> dzsjVar4, dzsj<bcpe> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    @Override // defpackage.bdup
    public final /* bridge */ /* synthetic */ bduq a(boolean z) {
        Application a = this.a.a();
        b(a, 2);
        cqat a2 = this.b.a();
        b(a2, 3);
        bdkj a3 = this.c.a();
        b(a3, 4);
        b(this.d.a(), 5);
        bcpe a4 = this.e.a();
        b(a4, 6);
        return new bdmf(z, a, a2, a3, a4);
    }
}
