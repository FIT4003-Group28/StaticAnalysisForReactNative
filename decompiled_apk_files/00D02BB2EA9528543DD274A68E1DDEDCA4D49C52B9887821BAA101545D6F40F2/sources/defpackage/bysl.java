package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bysl  reason: default package */
/* loaded from: classes4.dex */
public class bysl {
    private final dzsj<Resources> a;
    private final dzsj<dxio<auhi>> b;
    private final dzsj<dxio<byqh>> c;
    private final dzsj<dxio<cjqy>> d;

    public bysl(dzsj<Resources> dzsjVar, dzsj<dxio<auhi>> dzsjVar2, dzsj<dxio<byqh>> dzsjVar3, dzsj<dxio<cjqy>> dzsjVar4) {
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

    public final bysk a(dpyv dpyvVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, int i, int i2, @dzsi bysj bysjVar) {
        Resources a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        b(dpyvVar, 5);
        b(ddhoVar, 6);
        b(ddhoVar2, 7);
        b(ddhoVar3, 8);
        b(ddhoVar4, 9);
        return new bysk(a, a2, a3, a4, dpyvVar, ddhoVar, ddhoVar2, ddhoVar3, ddhoVar4, i, i2, R.string.HOME_ONLY_COMMUTE_NOTIFICATION_OPT_IN_BUTTON, R.string.HOME_ONLY_COMMUTE_NOTIFICATION_OPT_OUT_BUTTON, bysjVar);
    }
}
