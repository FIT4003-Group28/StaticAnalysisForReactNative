package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cfse  reason: default package */
/* loaded from: classes4.dex */
public class cfse {
    public final dzsj<dxio<cqg>> a;
    public final dzsj<Resources> b;

    public cfse(dzsj<dxio<cqg>> dzsjVar, dzsj<Resources> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final cfsd a(CharSequence charSequence, CharSequence charSequence2) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        Resources a2 = this.b.a();
        b(a2, 2);
        b(charSequence, 3);
        b(charSequence2, 4);
        return new cfsd(a, a2, charSequence, charSequence2);
    }
}