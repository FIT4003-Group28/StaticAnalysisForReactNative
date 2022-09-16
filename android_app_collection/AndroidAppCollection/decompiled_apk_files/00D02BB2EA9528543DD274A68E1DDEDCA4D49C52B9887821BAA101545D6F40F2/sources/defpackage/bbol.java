package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bbol  reason: default package */
/* loaded from: classes3.dex */
public class bbol {
    public final dzsj<dxio<begg>> a;
    public final dzsj<Activity> b;
    public final dzsj<cjqy> c;

    public bbol(dzsj<dxio<begg>> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<cjqy> dzsjVar3) {
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
