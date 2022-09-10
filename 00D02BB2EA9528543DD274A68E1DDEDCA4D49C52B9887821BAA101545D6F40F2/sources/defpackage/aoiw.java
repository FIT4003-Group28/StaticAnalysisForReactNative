package defpackage;

import android.app.Application;
import java.util.List;
/* compiled from: PG */
/* renamed from: aoiw  reason: default package */
/* loaded from: classes2.dex */
public class aoiw {
    private final dzsj<aojt> a;
    private final dzsj<aoiz> b;
    private final dzsj<Application> c;

    public aoiw(dzsj<aojt> dzsjVar, dzsj<aoiz> dzsjVar2, dzsj<Application> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final aoiv a(List<dvan> list, dcdc<aola> dcdcVar, dqgd dqgdVar) {
        aojt a = this.a.a();
        b(a, 1);
        aoiz a2 = this.b.a();
        b(a2, 2);
        Application a3 = this.c.a();
        b(a3, 3);
        b(list, 4);
        b(dcdcVar, 5);
        b(dqgdVar, 6);
        return new aoiv(a, a2, a3, list, dcdcVar, dqgdVar);
    }
}
