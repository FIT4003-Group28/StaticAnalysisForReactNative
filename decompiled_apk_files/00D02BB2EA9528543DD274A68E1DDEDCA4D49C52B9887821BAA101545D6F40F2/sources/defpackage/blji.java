package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blji  reason: default package */
/* loaded from: classes3.dex */
public class blji {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<dxio<bkpi>> c;
    public final dzsj<cafi> d;
    public final dzsj<dxio<afha>> e;

    public blji(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dxio<bkpi>> dzsjVar3, dzsj<cafi> dzsjVar4, dzsj<dxio<afha>> dzsjVar5) {
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