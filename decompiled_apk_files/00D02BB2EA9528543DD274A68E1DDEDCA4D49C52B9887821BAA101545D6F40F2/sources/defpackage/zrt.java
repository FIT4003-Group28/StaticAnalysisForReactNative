package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.directions.api.GmmNotice;
/* compiled from: PG */
/* renamed from: zrt  reason: default package */
/* loaded from: classes7.dex */
public class zrt {
    private final dzsj<Application> a;
    private final dzsj<vtn> b;
    private final dzsj<dbsg<acrq>> c;
    private final dzsj<btvo> d;

    public zrt(dzsj<Application> dzsjVar, dzsj<vtn> dzsjVar2, dzsj<dbsg<acrq>> dzsjVar3, dzsj<btvo> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final zrs a(GmmNotice gmmNotice, boolean z, int i, @dzsi cjtd cjtdVar, @dzsi cqkn<zcv> cqknVar) {
        Application a = this.a.a();
        b(a, 1);
        vtn a2 = this.b.a();
        b(a2, 2);
        dbsg<acrq> a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        b(gmmNotice, 5);
        return new zrs(a, a2, a3, a4, gmmNotice, z, i, cjtdVar, cqknVar);
    }
}
