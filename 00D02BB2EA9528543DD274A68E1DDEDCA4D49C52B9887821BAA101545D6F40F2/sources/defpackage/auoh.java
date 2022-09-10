package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: auoh  reason: default package */
/* loaded from: classes2.dex */
public class auoh {
    private final dzsj<Application> a;
    private final dzsj<bvjj> b;
    private final dzsj<aunx> c;
    private final dzsj<auhz> d;

    public auoh(dzsj<Application> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<aunx> dzsjVar3, dzsj<auhz> dzsjVar4) {
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

    public final auog a(@dzsi String str, pas pasVar, dlfv dlfvVar) {
        Application a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        aunx a2 = this.c.a();
        b(a2, 3);
        auhz a3 = this.d.a();
        b(a3, 4);
        b(pasVar, 6);
        b(dlfvVar, 7);
        return new auog(a, a2, a3, str, pasVar, dlfvVar);
    }
}
