package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoiq  reason: default package */
/* loaded from: classes2.dex */
public class aoiq {
    public final dzsj<bbut> a;
    public final dzsj<bccu> b;
    public final dzsj<Application> c;

    public aoiq(dzsj<bbut> dzsjVar, dzsj<bccu> dzsjVar2, dzsj<Application> dzsjVar3) {
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
