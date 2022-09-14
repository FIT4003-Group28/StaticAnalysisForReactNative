package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: mcc  reason: default package */
/* loaded from: classes7.dex */
public final class mcc {
    private final dzsj<btrm> a;
    private final dzsj<aufc> b;
    private final dzsj<Executor> c;
    private final dzsj<cjqq> d;

    public mcc(dzsj<btrm> dzsjVar, dzsj<aufc> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cjqq> dzsjVar4) {
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

    public final mcb a(asmp asmpVar, Context context, akoq akoqVar) {
        btrm a = this.a.a();
        b(a, 1);
        aufc a2 = this.b.a();
        b(a2, 2);
        Executor a3 = this.c.a();
        b(a3, 3);
        cjqq a4 = this.d.a();
        b(a4, 4);
        b(asmpVar, 5);
        b(context, 6);
        b(akoqVar, 7);
        return new mcb(a, a2, a3, a4, asmpVar, context, akoqVar);
    }
}
