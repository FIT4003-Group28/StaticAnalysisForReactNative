package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uaq  reason: default package */
/* loaded from: classes7.dex */
public final class uaq {
    public final dzsj<Activity> a;
    public final dzsj<qhn> b;
    public final dzsj<qho> c;
    public final dzsj<twn> d;
    public final dzsj<tur> e;
    public final dzsj<sux> f;
    public final dzsj<suq> g;

    public uaq(dzsj<Activity> dzsjVar, dzsj<qhn> dzsjVar2, dzsj<qho> dzsjVar3, dzsj<twn> dzsjVar4, dzsj<tur> dzsjVar5, dzsj<sux> dzsjVar6, dzsj<suq> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
