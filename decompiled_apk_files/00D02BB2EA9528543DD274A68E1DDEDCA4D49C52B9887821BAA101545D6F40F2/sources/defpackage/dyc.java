package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyc  reason: default package */
/* loaded from: classes6.dex */
public final class dyc {
    public final dzsj<Resources> a;
    public final dzsj<befw> b;
    public final dzsj<dag> c;
    public final dzsj<Executor> d;

    public dyc(dzsj<Resources> dzsjVar, dzsj<befw> dzsjVar2, dzsj<dag> dzsjVar3, dzsj<Executor> dzsjVar4) {
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
