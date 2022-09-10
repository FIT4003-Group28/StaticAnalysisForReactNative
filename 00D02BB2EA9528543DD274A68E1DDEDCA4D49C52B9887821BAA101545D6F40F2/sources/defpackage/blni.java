package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: blni  reason: default package */
/* loaded from: classes3.dex */
public class blni {
    private final dzsj<dxio<cafi>> a;
    private final dzsj<dxio<afha>> b;
    private final dzsj<cqhn> c;
    private final dzsj<ceet> d;
    private final dzsj<cebr> e;

    public blni(dzsj<dxio<cafi>> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<ceet> dzsjVar4, dzsj<cebr> dzsjVar5) {
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

    public final blnh a(Context context) {
        b(context, 1);
        dxio a = ((dxjh) this.a).a();
        b(a, 2);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 3);
        cqhn a3 = this.c.a();
        b(a3, 4);
        ceet a4 = this.d.a();
        b(a4, 5);
        cebr a5 = this.e.a();
        b(a5, 6);
        return new blnh(context, a, a2, a3, a4, a5);
    }
}
