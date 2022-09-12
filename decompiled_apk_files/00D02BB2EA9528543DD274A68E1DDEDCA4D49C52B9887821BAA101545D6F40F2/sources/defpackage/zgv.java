package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zgv  reason: default package */
/* loaded from: classes7.dex */
public class zgv {
    private final dzsj<Activity> a;
    private final dzsj<aaap> b;
    private final dzsj<vtn> c;

    public zgv(dzsj<Activity> dzsjVar, dzsj<aaap> dzsjVar2, dzsj<vtn> dzsjVar3) {
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

    public final zgu a(dozz dozzVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        aaap a = this.b.a();
        b(a, 2);
        vtn a2 = this.c.a();
        b(a2, 3);
        b(dozzVar, 4);
        return new zgu(activity, a, a2, dozzVar);
    }
}
