package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aeau  reason: default package */
/* loaded from: classes2.dex */
public final class aeau {
    public final dzsj<Executor> a;
    public final dzsj<Executor> b;
    public final dzsj<Activity> c;

    public aeau(dzsj<Executor> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<Activity> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
