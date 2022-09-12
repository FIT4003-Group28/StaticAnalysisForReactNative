package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chla  reason: default package */
/* loaded from: classes4.dex */
public class chla {
    private final dzsj<ccif> a;
    private final dzsj<cafi> b;
    private final dzsj<chnm> c;
    private final dzsj<cdfx> d;
    private final dzsj<bwft> e;
    private final dzsj<bjbu> f;
    private final dzsj<ckcw> g;
    private final dzsj<buzm> h;
    private final dzsj<Executor> i;
    private final dzsj<Activity> j;
    private final dzsj<dxio<afha>> k;

    public chla(dzsj<ccif> dzsjVar, dzsj<cafi> dzsjVar2, dzsj<chnm> dzsjVar3, dzsj<cdfx> dzsjVar4, dzsj<bwft> dzsjVar5, dzsj<bjbu> dzsjVar6, dzsj<ckcw> dzsjVar7, dzsj<buzm> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<Activity> dzsjVar10, dzsj<dxio<afha>> dzsjVar11) {
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
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
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

    public final chkz a(chlr chlrVar, djev djevVar, ddho ddhoVar, ddho ddhoVar2, String str, @dzsi ilo iloVar) {
        b(chlrVar, 1);
        b(djevVar, 2);
        b(ddhoVar, 3);
        b(ddhoVar2, 4);
        b(str, 5);
        dzsj<ccif> dzsjVar = this.a;
        dzsj<cafi> dzsjVar2 = this.b;
        dzsj<chnm> dzsjVar3 = this.c;
        dzsj<cdfx> dzsjVar4 = this.d;
        dzsj<bwft> dzsjVar5 = this.e;
        dzsj<bjbu> dzsjVar6 = this.f;
        dzsj<ckcw> dzsjVar7 = this.g;
        dzsj<buzm> dzsjVar8 = this.h;
        Executor a = this.i.a();
        b(a, 15);
        Activity activity = (Activity) ((dxjd) this.j).a;
        b(activity, 16);
        dxio a2 = ((dxjh) this.k).a();
        b(a2, 17);
        return new chkz(chlrVar, djevVar, ddhoVar, ddhoVar2, str, iloVar, dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, dzsjVar7, dzsjVar8, a, activity, a2);
    }
}
