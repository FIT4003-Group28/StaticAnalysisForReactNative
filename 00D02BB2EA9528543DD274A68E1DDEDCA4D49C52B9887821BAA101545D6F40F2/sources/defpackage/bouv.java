package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bouv  reason: default package */
/* loaded from: classes3.dex */
public final class bouv {
    private final dzsj<Activity> a;
    private final dzsj<bbut> b;
    private final dzsj<bvrb> c;
    private final dzsj<bbtt> d;

    public bouv(dzsj<Activity> dzsjVar, dzsj<bbut> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<bbtt> dzsjVar4) {
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

    public final bouu a(bokf bokfVar, dwyd dwydVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        bbut a = this.b.a();
        b(a, 2);
        bvrb a2 = this.c.a();
        b(a2, 3);
        bbtt a3 = this.d.a();
        b(a3, 4);
        b(bokfVar, 5);
        b(dwydVar, 6);
        return new bouu(activity, a, a2, a3, bokfVar, dwydVar);
    }
}
