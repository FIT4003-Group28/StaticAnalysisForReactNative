package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apny  reason: default package */
/* loaded from: classes2.dex */
public class apny {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<dxio<apqa>> c;
    public final dzsj<dxio<akfa>> d;
    public final dzsj<dxio<apnh>> e;
    public final dzsj<apqe> f;

    public apny(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<dxio<apqa>> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<dxio<apnh>> dzsjVar5, dzsj<apqe> dzsjVar6) {
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
