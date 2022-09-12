package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aeol  reason: default package */
/* loaded from: classes2.dex */
public class aeol {
    private final dzsj<cqhn> a;
    private final dzsj<aens> b;
    private final dzsj<aenx> c;
    private final dzsj<cqat> d;
    private final dzsj<Resources> e;

    public aeol(dzsj<cqhn> dzsjVar, dzsj<aens> dzsjVar2, dzsj<aenx> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<Resources> dzsjVar5) {
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

    public final aeok a(aeoj aeojVar, eapg eapgVar, eapg eapgVar2, int i) {
        cqhn a = this.a.a();
        b(a, 1);
        aens a2 = this.b.a();
        b(a2, 2);
        aenx a3 = this.c.a();
        b(a3, 3);
        cqat a4 = this.d.a();
        b(a4, 4);
        Resources a5 = this.e.a();
        b(a5, 5);
        b(aeojVar, 6);
        b(eapgVar, 7);
        b(eapgVar2, 8);
        return new aeok(a, a2, a3, a4, a5, aeojVar, eapgVar, eapgVar2, i);
    }
}
