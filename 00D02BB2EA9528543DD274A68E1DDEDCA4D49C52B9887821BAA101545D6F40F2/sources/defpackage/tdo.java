package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tdo  reason: default package */
/* loaded from: classes7.dex */
public final class tdo {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<vtn> c;
    public final dzsj<bvsl> d;
    public final dzsj<tam> e;
    public final dzsj<tao> f;

    public tdo(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<bvsl> dzsjVar4, dzsj<tam> dzsjVar5, dzsj<tao> dzsjVar6) {
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
