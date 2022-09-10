package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rkx  reason: default package */
/* loaded from: classes7.dex */
public class rkx {
    public final dzsj<Activity> a;
    public final dzsj<Executor> b;
    public final dzsj<btvo> c;
    public final dzsj<dxio<qjk>> d;
    public final dzsj<dxio<ros>> e;

    public rkx(dzsj<Activity> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<dxio<qjk>> dzsjVar4, dzsj<dxio<ros>> dzsjVar5) {
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
