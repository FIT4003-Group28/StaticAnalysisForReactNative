package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ahto  reason: default package */
/* loaded from: classes.dex */
public final class ahto {
    private final dzsj<Application> a;
    private final dzsj<cqat> b;
    private final dzsj<btrm> c;
    private final dzsj<ahjq> d;
    private final dzsj<axru> e;
    private final dzsj<bvrb> f;

    public ahto(dzsj<Application> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<ahjq> dzsjVar4, dzsj<axru> dzsjVar5, dzsj<bvrb> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final ahtn a(ahtg ahtgVar) {
        b(ahtgVar, 1);
        Application a = this.a.a();
        b(a, 2);
        cqat a2 = this.b.a();
        b(a2, 3);
        btrm a3 = this.c.a();
        b(a3, 4);
        ahjq a4 = this.d.a();
        b(a4, 5);
        axru a5 = this.e.a();
        b(a5, 6);
        bvrb a6 = this.f.a();
        b(a6, 7);
        return new ahtn(ahtgVar, a, a2, a3, a4, a5, a6);
    }
}
