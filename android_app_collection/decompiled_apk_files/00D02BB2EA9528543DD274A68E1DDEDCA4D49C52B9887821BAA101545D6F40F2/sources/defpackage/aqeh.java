package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aqeh  reason: default package */
/* loaded from: classes2.dex */
public class aqeh {
    private final dzsj<cqhu> a;

    public aqeh(dzsj<cqhu> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final <P extends cuvu, V extends View & cuvv<P>> aqeg<P, V> a(k kVar, Class<V> cls, cqjg cqjgVar) {
        b(this.a.a(), 1);
        b(kVar, 2);
        b(cls, 3);
        b(cqjgVar, 4);
        return new aqeg<>(kVar, cls, cqjgVar);
    }
}
