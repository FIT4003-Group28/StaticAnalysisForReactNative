package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bniv  reason: default package */
/* loaded from: classes3.dex */
public class bniv {
    private final dzsj<Activity> a;
    private final dzsj<btrm> b;
    private final dzsj<qbt> c;
    private final dzsj<cjqy> d;
    private final dzsj<cklq> e;

    public bniv(dzsj<Activity> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<qbt> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cklq> dzsjVar5) {
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

    public final bniu a(@dzsi bnit bnitVar, @dzsi cjtd cjtdVar, boolean z, boolean z2) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        btrm a = this.b.a();
        b(a, 2);
        dzsj<qbt> dzsjVar = this.c;
        cjqy a2 = this.d.a();
        b(a2, 4);
        cklq a3 = this.e.a();
        b(a3, 5);
        return new bniu(activity, a, dzsjVar, a2, a3, bnitVar, cjtdVar, z, z2);
    }
}
