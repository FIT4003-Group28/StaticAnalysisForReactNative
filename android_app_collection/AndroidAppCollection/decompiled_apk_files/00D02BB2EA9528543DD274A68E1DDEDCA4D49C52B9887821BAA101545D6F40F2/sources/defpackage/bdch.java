package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bdch  reason: default package */
/* loaded from: classes3.dex */
public class bdch {
    private final dzsj<Context> a;
    private final dzsj<cqhn> b;
    private final dzsj<cjqy> c;
    private final dzsj<cjqq> d;
    private final dzsj<afxz> e;
    private final dzsj<afxn> f;
    private final dzsj<bcro> g;

    public bdch(dzsj<Context> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<afxz> dzsjVar5, dzsj<afxn> dzsjVar6, dzsj<bcro> dzsjVar7) {
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
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    public final bdcg a(afyb afybVar, dwfl dwflVar, @dzsi ilo iloVar) {
        Context a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        cjqy a2 = this.c.a();
        b(a2, 3);
        cjqq a3 = this.d.a();
        b(a3, 4);
        afxz a4 = this.e.a();
        b(a4, 5);
        afxn a5 = this.f.a();
        b(a5, 6);
        b(afybVar, 7);
        bcro a6 = this.g.a();
        b(a6, 8);
        b(dwflVar, 9);
        return new bdcg(a, a2, a3, a4, a5, afybVar, a6, dwflVar, iloVar);
    }
}
