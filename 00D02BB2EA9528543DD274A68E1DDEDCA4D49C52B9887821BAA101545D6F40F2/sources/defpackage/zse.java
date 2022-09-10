package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: zse  reason: default package */
/* loaded from: classes7.dex */
public class zse {
    private final dzsj<Application> a;
    private final dzsj<cjqq> b;

    public zse(dzsj<Application> dzsjVar, dzsj<cjqq> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final zsd a(dpfx dpfxVar, boolean z) {
        Application a = this.a.a();
        b(a, 1);
        cjqq a2 = this.b.a();
        b(a2, 2);
        b(dpfxVar, 3);
        return new zsd(a, a2, dpfxVar, z);
    }
}
