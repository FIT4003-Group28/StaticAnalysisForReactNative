package defpackage;

import android.app.Activity;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brvh  reason: default package */
/* loaded from: classes4.dex */
public final class brvh {
    private final dzsj<Activity> a;
    private final dzsj<Map<dghs, brva>> b;
    private final dzsj<bmom> c;

    public brvh(dzsj<Activity> dzsjVar, dzsj<Map<dghs, brva>> dzsjVar2, dzsj<bmom> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final brvg a(jba jbaVar, dcdc<brrx> dcdcVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        Map<dghs, brva> a = this.b.a();
        b(a, 2);
        bmom a2 = this.c.a();
        b(a2, 3);
        b(jbaVar, 4);
        b(dcdcVar, 5);
        return new brvg(activity, a, a2, jbaVar, dcdcVar);
    }
}
