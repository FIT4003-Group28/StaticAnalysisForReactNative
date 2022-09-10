package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dss  reason: default package */
/* loaded from: classes6.dex */
public final class dss {
    public final dzsj<akox> a;
    public final dzsj<ahjq> b;
    public final dzsj<Executor> c;
    public final dzsj<btrm> d;
    public final dzsj<Resources> e;

    public dss(dzsj<akox> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<Resources> dzsjVar5) {
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
