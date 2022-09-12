package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rbn  reason: default package */
/* loaded from: classes7.dex */
public final class rbn {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<acyp> d;
    public final dzsj<iwl> e;
    public final dzsj<rby> f;
    public final dzsj<rbv> g;

    public rbn(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<acyp> dzsjVar4, dzsj<iwl> dzsjVar5, dzsj<rby> dzsjVar6, dzsj<rbv> dzsjVar7) {
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
