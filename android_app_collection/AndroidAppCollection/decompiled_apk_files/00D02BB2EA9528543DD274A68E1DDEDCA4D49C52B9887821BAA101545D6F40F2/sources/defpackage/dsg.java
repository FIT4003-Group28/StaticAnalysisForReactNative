package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dsg  reason: default package */
/* loaded from: classes6.dex */
public final class dsg {
    public final dzsj<dsk> a;
    public final dzsj<Executor> b;
    public final dzsj<dyq> c;
    public final dzsj<akpn> d;
    public final dzsj<Activity> e;
    public final dzsj<akox> f;
    public final dzsj<btvo> g;
    public final dzsj<btrm> h;
    public final dzsj<bvsl> i;

    public dsg(dzsj<dsk> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<dyq> dzsjVar3, dzsj<akpn> dzsjVar4, dzsj<Activity> dzsjVar5, dzsj<akox> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<btrm> dzsjVar8, dzsj<bvsl> dzsjVar9) {
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
