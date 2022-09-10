package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ceyd  reason: default package */
/* loaded from: classes4.dex */
public final class ceyd {
    public final dzsj<Activity> a;
    public final dzsj<ceet> b;
    public final dzsj<bqji> c;
    public final dzsj<ceyb> d;
    public final dzsj<cese> e;
    public final dzsj<cebr> f;

    public ceyd(dzsj<Activity> dzsjVar, dzsj<ceet> dzsjVar2, dzsj<bqji> dzsjVar3, dzsj<ceyb> dzsjVar4, dzsj<cese> dzsjVar5, dzsj<cebr> dzsjVar6) {
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
