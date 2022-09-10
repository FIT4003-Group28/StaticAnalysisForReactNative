package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cfsc  reason: default package */
/* loaded from: classes4.dex */
public class cfsc {
    public final dzsj<dxio<bbut>> a;
    public final dzsj<akzh> b;
    public final dzsj<Resources> c;

    public cfsc(dzsj<dxio<bbut>> dzsjVar, dzsj<akzh> dzsjVar2, dzsj<Resources> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final cfsb a(CharSequence charSequence, CharSequence charSequence2) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        akzh a2 = this.b.a();
        b(a2, 2);
        Resources a3 = this.c.a();
        b(a3, 3);
        b(charSequence, 4);
        b(charSequence2, 5);
        return new cfsb(a, a2, a3, charSequence, charSequence2);
    }
}
