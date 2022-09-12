package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bepv  reason: default package */
/* loaded from: classes3.dex */
public final class bepv {
    public final dzsj<Resources> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<beii>> c;
    public final dzsj<bvrb> d;

    public bepv(dzsj<Resources> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<beii>> dzsjVar3, dzsj<bvrb> dzsjVar4) {
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
