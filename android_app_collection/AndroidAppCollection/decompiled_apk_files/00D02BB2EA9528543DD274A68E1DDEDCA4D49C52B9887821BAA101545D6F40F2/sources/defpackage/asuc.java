package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asuc  reason: default package */
/* loaded from: classes2.dex */
public class asuc {
    private final dzsj<ckrp> a;
    private final dzsj<btvo> b;

    public asuc(dzsj<ckrp> dzsjVar, dzsj<btvo> dzsjVar2) {
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

    public final asub a(Context context) {
        dzsj<ckrp> dzsjVar = this.a;
        btvo a = this.b.a();
        b(a, 2);
        b(context, 3);
        return new asub(dzsjVar, a, context);
    }
}
