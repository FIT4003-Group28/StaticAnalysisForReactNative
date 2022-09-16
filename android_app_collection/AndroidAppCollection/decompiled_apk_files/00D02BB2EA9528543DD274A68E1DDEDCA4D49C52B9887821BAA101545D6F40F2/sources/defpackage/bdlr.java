package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bdlr  reason: default package */
/* loaded from: classes3.dex */
public class bdlr {
    public final dzsj<bbtk> a;
    public final dzsj<Activity> b;
    public final dzsj<dxio<apni>> c;

    public bdlr(dzsj<bbtk> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<dxio<apni>> dzsjVar3) {
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
