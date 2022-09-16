package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bkml  reason: default package */
/* loaded from: classes3.dex */
public final class bkml {
    private final dzsj<Resources> a;

    public bkml(dzsj<Resources> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bkmk a(String str, bwrs<ilo> bwrsVar) {
        Resources a = this.a.a();
        b(a, 1);
        b(str, 2);
        b(bwrsVar, 3);
        return new bkmk(a, str, bwrsVar);
    }
}
