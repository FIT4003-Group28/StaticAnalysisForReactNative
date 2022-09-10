package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgrd  reason: default package */
/* loaded from: classes3.dex */
public final class bgrd {
    private final dzsj<Activity> a;
    private final dzsj<akpm> b;
    private final dzsj<brpd> c;
    private final dzsj<ckcw> d;
    private final dzsj<btvo> e;

    public bgrd(dzsj<Activity> dzsjVar, dzsj<akpm> dzsjVar2, dzsj<brpd> dzsjVar3, dzsj<ckcw> dzsjVar4, dzsj<btvo> dzsjVar5) {
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

    public final bgrc a(bgrb bgrbVar, List<String> list, String str, List<String> list2) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        akpm a = this.b.a();
        b(a, 2);
        brpd a2 = this.c.a();
        b(a2, 3);
        ckcw a3 = this.d.a();
        b(a3, 4);
        btvo a4 = this.e.a();
        b(a4, 5);
        b(bgrbVar, 6);
        b(list, 7);
        b(str, 8);
        b(list2, 9);
        return new bgrc(activity, a, a2, a3, a4, bgrbVar, list, str, list2);
    }
}
