package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbvn  reason: default package */
/* loaded from: classes4.dex */
public class cbvn {
    public final dzsj<gga> a;
    public final dzsj<cbuw> b;
    public final dzsj<cbvt> c;
    public final dzsj<Executor> d;
    public final dzsj<cqhn> e;

    public cbvn(dzsj<gga> dzsjVar, dzsj<cbuw> dzsjVar2, dzsj<cbvt> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<cqhn> dzsjVar5) {
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
