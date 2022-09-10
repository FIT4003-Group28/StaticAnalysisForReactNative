package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bcnc  reason: default package */
/* loaded from: classes3.dex */
final class bcnc {
    private final dspd[] a;
    private final Map<dspd, Integer> b;

    public bcnc(List<bclt> list) {
        this.a = new dspd[list.size()];
        dcdg dcdgVar = new dcdg();
        for (int i = 0; i < list.size(); i++) {
            dspd k = list.get(i).k();
            this.a[i] = k;
            dcdgVar.f(k, Integer.valueOf(i));
        }
        this.b = dcdgVar.b();
    }

    public final dbsg<Integer> a(dspd dspdVar) {
        return dbsg.j(this.b.get(dspdVar));
    }
}
