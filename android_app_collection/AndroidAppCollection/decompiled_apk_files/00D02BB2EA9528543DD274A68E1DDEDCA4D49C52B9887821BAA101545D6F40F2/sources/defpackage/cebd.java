package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cebd  reason: default package */
/* loaded from: classes4.dex */
public final class cebd {
    private final dzsj<cjqy> a;
    private final dzsj<itg> b;

    public cebd(dzsj<cjqy> dzsjVar, dzsj<itg> dzsjVar2) {
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

    public final cebc a(View view) {
        b(view, 1);
        cjqy a = this.a.a();
        b(a, 2);
        itg a2 = this.b.a();
        b(a2, 3);
        return new cebc(view, a, a2);
    }
}
