package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqrl  reason: default package */
/* loaded from: classes2.dex */
public class aqrl {
    private final dzsj<Activity> a;
    private final dzsj<apyx> b;
    private final dzsj<apzy> c;
    private final dzsj<aqcl> d;
    private final dzsj<dxio<auhi>> e;
    private final dzsj<dxio<afha>> f;

    public aqrl(dzsj<Activity> dzsjVar, dzsj<apyx> dzsjVar2, dzsj<apzy> dzsjVar3, dzsj<aqcl> dzsjVar4, dzsj<dxio<auhi>> dzsjVar5, dzsj<dxio<afha>> dzsjVar6) {
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

    public final aqrk a(aujb aujbVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        apyx a = this.b.a();
        b(a, 2);
        apzy a2 = this.c.a();
        b(a2, 3);
        aqcl a3 = this.d.a();
        b(a3, 4);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 5);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 6);
        b(aujbVar, 7);
        return new aqrk(activity, a, a2, a3, a4, a5, aujbVar);
    }
}
