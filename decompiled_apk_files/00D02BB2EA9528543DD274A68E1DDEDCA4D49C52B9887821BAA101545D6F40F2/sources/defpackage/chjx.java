package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: chjx  reason: default package */
/* loaded from: classes4.dex */
public final class chjx {
    private final dzsj<Resources> a;

    public chjx(dzsj<Resources> dzsjVar) {
        b(dzsjVar);
        this.a = dzsjVar;
    }

    private static <T> void b(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final chjw a(int i, boolean z) {
        Resources a = this.a.a();
        b(a);
        return new chjw(a, i, z);
    }
}
