package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: abtk  reason: default package */
/* loaded from: classes2.dex */
public final class abtk implements abjo {
    private final dzsj<Activity> a;
    private final dzsj<dxio<acyr>> b;
    private final dzsj<abfc> c;
    private final dzsj<abuf> d;
    private final dzsj<abvr> e;
    private final dzsj<abfa> f;

    public abtk(dzsj<Activity> dzsjVar, dzsj<dxio<acyr>> dzsjVar2, dzsj<abfc> dzsjVar3, dzsj<abuf> dzsjVar4, dzsj<abvr> dzsjVar5, dzsj<abfa> dzsjVar6) {
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

    @Override // defpackage.abjo
    public final /* bridge */ /* synthetic */ abqn a(List list, ddho ddhoVar, @dzsi dxio dxioVar, @dzsi acwt acwtVar, abse abseVar) {
        b((Activity) ((dxjd) this.a).a, 1);
        dxio a = ((dxjh) this.b).a();
        b(a, 2);
        abfc a2 = this.c.a();
        b(a2, 3);
        abuf a3 = this.d.a();
        b(a3, 4);
        abvr a4 = this.e.a();
        b(a4, 5);
        abfa a5 = this.f.a();
        b(a5, 6);
        b(list, 7);
        b(ddhoVar, 8);
        b(abseVar, 11);
        return new abtj(a, a2, a3, a4, a5, list, ddhoVar, dxioVar, acwtVar, abseVar);
    }
}
