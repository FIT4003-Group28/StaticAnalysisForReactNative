package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bngj  reason: default package */
/* loaded from: classes3.dex */
public final class bngj {
    public final dzsj<Activity> a;
    public final dzsj<akfa> b;
    public final dzsj<dxio<cdjj>> c;
    public final dzsj<dxio<bkpi>> d;
    public final dzsj<Executor> e;

    public bngj(dzsj<Activity> dzsjVar, dzsj<akfa> dzsjVar2, dzsj<dxio<cdjj>> dzsjVar3, dzsj<dxio<bkpi>> dzsjVar4, dzsj<Executor> dzsjVar5) {
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
