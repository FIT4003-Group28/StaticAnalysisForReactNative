package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bknu  reason: default package */
/* loaded from: classes3.dex */
public final class bknu {
    public final dzsj<Resources> a;
    public final dzsj<cjqy> b;
    public final dzsj<btvo> c;
    public final dzsj<dxio<bbut>> d;

    public bknu(dzsj<Resources> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<dxio<bbut>> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
