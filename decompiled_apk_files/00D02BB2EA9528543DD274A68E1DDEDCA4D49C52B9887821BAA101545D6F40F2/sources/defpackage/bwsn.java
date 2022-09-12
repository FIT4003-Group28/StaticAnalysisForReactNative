package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwsn  reason: default package */
/* loaded from: classes4.dex */
final class bwsn {
    public final dzsj<Application> a;
    public final dzsj<bunk> b;
    public final dzsj<btvo> c;
    public final dzsj<Executor> d;
    public final dzsj<bwzj> e;
    public final dzsj<dxio<befw>> f;

    public bwsn(dzsj<Application> dzsjVar, dzsj<bunk> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<bwzj> dzsjVar5, dzsj<dxio<befw>> dzsjVar6) {
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
