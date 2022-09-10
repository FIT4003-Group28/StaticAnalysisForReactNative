package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sxo  reason: default package */
/* loaded from: classes7.dex */
public class sxo {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<btvo> c;
    public final dzsj<Executor> d;

    public sxo(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<Executor> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
