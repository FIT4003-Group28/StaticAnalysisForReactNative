package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: vol  reason: default package */
/* loaded from: classes7.dex */
public final class vol {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<ahth> c;
    public final dzsj<vog> d;
    public final dzsj<dxio<bxzv>> e;
    public final dzsj<wts> f;

    public vol(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<ahth> dzsjVar3, dzsj<vog> dzsjVar4, dzsj<dxio<bxzv>> dzsjVar5, dzsj<wts> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
