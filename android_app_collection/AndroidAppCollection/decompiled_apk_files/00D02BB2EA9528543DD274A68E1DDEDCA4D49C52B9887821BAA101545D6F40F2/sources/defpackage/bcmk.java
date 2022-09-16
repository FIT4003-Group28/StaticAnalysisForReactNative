package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcmk  reason: default package */
/* loaded from: classes3.dex */
public class bcmk {
    private final dzsj<bvpe> a;
    private final dzsj<bckt> b;
    private final dzsj<Activity> c;
    private final dzsj<bcld> d;

    public bcmk(dzsj<bvpe> dzsjVar, dzsj<bckt> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<bcld> dzsjVar4) {
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

    public final bcmj a(List<bclt> list, bcku bckuVar, bckr bckrVar, @dzsi ilo iloVar) {
        b(list, 1);
        b(bckuVar, 2);
        b(bckrVar, 3);
        bvpe a = this.a.a();
        b(a, 5);
        bckt a2 = this.b.a();
        b(a2, 6);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 7);
        bcld a3 = this.d.a();
        b(a3, 8);
        return new bcmj(list, bckuVar, bckrVar, iloVar, a, a2, activity, a3);
    }
}
