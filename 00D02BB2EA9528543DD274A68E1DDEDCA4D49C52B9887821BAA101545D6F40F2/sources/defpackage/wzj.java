package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: wzj  reason: default package */
/* loaded from: classes7.dex */
public class wzj {
    public final dzsj<wzp> a;
    public final dzsj<wzc> b;
    public final dzsj<wze> c;
    public final dzsj<wvp> d;
    public final dzsj<cqhn> e;
    public final dzsj<Activity> f;
    public final dzsj<xaz> g;

    public wzj(dzsj<wzp> dzsjVar, dzsj<wzc> dzsjVar2, dzsj<wze> dzsjVar3, dzsj<wvp> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<Activity> dzsjVar6, dzsj<xaz> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
