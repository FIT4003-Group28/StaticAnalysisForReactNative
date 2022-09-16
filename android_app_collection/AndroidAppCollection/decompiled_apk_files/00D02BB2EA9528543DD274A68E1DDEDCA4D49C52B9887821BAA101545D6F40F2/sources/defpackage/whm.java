package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whm  reason: default package */
/* loaded from: classes7.dex */
public class whm {
    private final dzsj<btvo> a;
    private final dzsj<wdt> b;
    private final dzsj<String> c;
    private final dzsj<Executor> d;

    public whm(dzsj<btvo> dzsjVar, dzsj<wdt> dzsjVar2, dzsj<String> dzsjVar3, dzsj<Executor> dzsjVar4) {
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

    public final whl a(SavedTrip.Data data) {
        btvo a = this.a.a();
        b(a, 1);
        wdt a2 = this.b.a();
        b(a2, 2);
        dzsj<String> dzsjVar = this.c;
        Executor a3 = this.d.a();
        b(a3, 4);
        b(data, 5);
        return new whl(a, a2, dzsjVar, a3, data);
    }
}
