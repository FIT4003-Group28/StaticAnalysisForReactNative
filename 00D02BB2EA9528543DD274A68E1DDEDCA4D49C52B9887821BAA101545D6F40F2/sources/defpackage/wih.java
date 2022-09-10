package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wih  reason: default package */
/* loaded from: classes7.dex */
public class wih {
    private final dzsj<wdt> a;
    private final dzsj<Executor> b;

    public wih(dzsj<wdt> dzsjVar, dzsj<Executor> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final wig a(SavedTrip savedTrip) {
        wdt a = this.a.a();
        b(a, 1);
        Executor a2 = this.b.a();
        b(a2, 2);
        b(savedTrip, 3);
        return new wig(a, a2, savedTrip);
    }
}
