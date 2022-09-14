package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dmm  reason: default package */
/* loaded from: classes6.dex */
public final class dmm {
    public final dzsj<Activity> a;
    public final dzsj<bupa> b;
    public final dzsj<ahjq> c;
    public final dzsj<Executor> d;
    public final dzsj<axwq> e;

    public dmm(dzsj<Activity> dzsjVar, dzsj<bupa> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<axwq> dzsjVar5) {
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
