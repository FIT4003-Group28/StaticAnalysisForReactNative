package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: boza  reason: default package */
/* loaded from: classes3.dex */
public final class boza {
    public final dzsj<bvpe> a;
    public final dzsj<huc> b;
    public final dzsj<bnjv> c;
    public final dzsj<cqhn> d;
    public final dzsj<Resources> e;

    public boza(dzsj<bvpe> dzsjVar, dzsj<huc> dzsjVar2, dzsj<bnjv> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<Resources> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
