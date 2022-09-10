package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bysp  reason: default package */
/* loaded from: classes4.dex */
public class bysp {
    private final dzsj<Resources> a;
    private final dzsj<dxio<auhi>> b;
    private final dzsj<dxio<byqh>> c;
    private final dzsj<dxio<byye>> d;
    private final dzsj<dxio<cjqy>> e;
    private final dzsj<dxio<akfa>> f;
    private final dzsj<Executor> g;

    public bysp(dzsj<Resources> dzsjVar, dzsj<dxio<auhi>> dzsjVar2, dzsj<dxio<byqh>> dzsjVar3, dzsj<dxio<byye>> dzsjVar4, dzsj<dxio<cjqy>> dzsjVar5, dzsj<dxio<akfa>> dzsjVar6, dzsj<Executor> dzsjVar7) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    public final byso a(dpyv dpyvVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, int i, int i2, @dzsi String str, @dzsi String str2, @dzsi bysn bysnVar) {
        Resources a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        Executor a7 = this.g.a();
        b(a7, 7);
        b(dpyvVar, 8);
        b(ddhoVar, 9);
        b(ddhoVar2, 10);
        b(ddhoVar3, 11);
        b(ddhoVar4, 12);
        return new byso(a, a2, a3, a4, a5, a6, a7, dpyvVar, ddhoVar, ddhoVar2, ddhoVar3, ddhoVar4, i, i2, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_WARMUP_BANNER_ACCEPT, R.string.INFERRED_COMMUTE_DESTINATION_NOTIFICATION_WARMUP_BANNER_DECLINE, str, str2, bysnVar);
    }
}
