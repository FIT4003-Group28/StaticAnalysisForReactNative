package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: sgm  reason: default package */
/* loaded from: classes7.dex */
public class sgm {
    public final dzsj<Application> a;
    public final dzsj<cqhn> b;
    public final dzsj<qjk> c;
    public final dzsj<shu> d;
    public final dzsj<qsm> e;
    public final dzsj<sdz> f;

    public sgm(dzsj<Application> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<shu> dzsjVar4, dzsj<qsm> dzsjVar5, dzsj<sdz> dzsjVar6) {
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
