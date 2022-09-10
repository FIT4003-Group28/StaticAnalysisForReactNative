package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bddz  reason: default package */
/* loaded from: classes3.dex */
public class bddz {
    public final dzsj<ckcw> a;
    public final dzsj<cjqq> b;
    public final dzsj<ckmm> c;
    public final dzsj<Application> d;
    public final dzsj<bwsh> e;

    public bddz(dzsj<ckcw> dzsjVar, dzsj<cjqq> dzsjVar2, dzsj<ckmm> dzsjVar3, dzsj<Application> dzsjVar4, dzsj<bwsh> dzsjVar5) {
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
