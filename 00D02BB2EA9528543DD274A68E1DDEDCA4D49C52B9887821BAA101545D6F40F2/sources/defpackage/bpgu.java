package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bpgu  reason: default package */
/* loaded from: classes3.dex */
public final class bpgu {
    public final dzsj<Activity> a;
    public final dzsj<ff> b;
    public final dzsj<jmx> c;
    public final dzsj<bpgk> d;
    public final dzsj<booa> e;
    public final dzsj<bpto> f;
    public final dzsj<bptg> g;
    public final dzsj<bpsw> h;
    public final dzsj<cqhn> i;

    public bpgu(dzsj<Activity> dzsjVar, dzsj<ff> dzsjVar2, dzsj<jmx> dzsjVar3, dzsj<bpgk> dzsjVar4, dzsj<booa> dzsjVar5, dzsj<bpto> dzsjVar6, dzsj<bptg> dzsjVar7, dzsj<bpsw> dzsjVar8, dzsj<cqhn> dzsjVar9) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
