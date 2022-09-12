package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahdg  reason: default package */
/* loaded from: classes2.dex */
public class ahdg {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;
    private final dzsj<bviq> c;

    public ahdg(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bviq> dzsjVar3) {
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

    public final ahdf a(List<bvik> list, CharSequence charSequence, long j, int i, cjta cjtaVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        bviq a3 = this.c.a();
        b(a3, 3);
        b(list, 4);
        b(charSequence, 5);
        b(cjtaVar, 8);
        return new ahdf(a, a2, a3, list, charSequence, j, i, cjtaVar);
    }
}
