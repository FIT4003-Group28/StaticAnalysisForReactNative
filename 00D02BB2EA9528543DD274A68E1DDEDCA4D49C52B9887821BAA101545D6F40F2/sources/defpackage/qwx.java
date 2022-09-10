package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: qwx  reason: default package */
/* loaded from: classes7.dex */
public final class qwx {
    public final dzsj<cqhn> a;
    public final dzsj<cqkj> b;
    public final dzsj<cqhu> c;
    public final dzsj<Application> d;
    public final dzsj<dxio<bsvm>> e;

    public qwx(dzsj<cqhn> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<Application> dzsjVar4, dzsj<dxio<bsvm>> dzsjVar5) {
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
