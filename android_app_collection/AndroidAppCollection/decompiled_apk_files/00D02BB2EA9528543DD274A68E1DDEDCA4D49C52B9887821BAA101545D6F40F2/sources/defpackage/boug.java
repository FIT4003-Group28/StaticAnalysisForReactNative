package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: boug  reason: default package */
/* loaded from: classes3.dex */
public final class boug {
    private final dzsj<Activity> a;
    private final dzsj<Executor> b;
    private final dzsj<buqs> c;
    private final dzsj<chht> d;
    private final dzsj<bvrb> e;
    private final dzsj<btvo> f;

    public boug(dzsj<Activity> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<buqs> dzsjVar3, dzsj<chht> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<btvo> dzsjVar6) {
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

    public final bouf a(bovf bovfVar, dbsg<bwrs<ilo>> dbsgVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        Executor a = this.b.a();
        b(a, 2);
        buqs a2 = this.c.a();
        b(a2, 3);
        chht a3 = this.d.a();
        b(a3, 4);
        bvrb a4 = this.e.a();
        b(a4, 5);
        btvo a5 = this.f.a();
        b(a5, 6);
        b(bovfVar, 7);
        b(dbsgVar, 8);
        return new bouf(activity, a, a2, a3, a4, a5, bovfVar, dbsgVar);
    }
}
