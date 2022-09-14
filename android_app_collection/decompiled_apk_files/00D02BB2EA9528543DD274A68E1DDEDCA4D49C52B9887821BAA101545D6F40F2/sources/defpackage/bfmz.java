package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bfmz  reason: default package */
/* loaded from: classes3.dex */
public class bfmz {
    public final dzsj<dxio<bvvw>> a;
    public final dzsj<Resources> b;

    public bfmz(dzsj<dxio<bvvw>> dzsjVar, dzsj<Resources> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
