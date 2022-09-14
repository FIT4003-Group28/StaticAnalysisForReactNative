package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ywm  reason: default package */
/* loaded from: classes7.dex */
public final class ywm extends dclu<dbsi<String, List<ysx>>> {
    private static long q(List<ysx> list) {
        dooa dooaVar;
        dbsg r = dcbg.b(list).s(ywk.a).r(ywl.a);
        if (r.a()) {
            dood doodVar = (dood) r.b();
            if (doodVar.b == 1) {
                dooaVar = (dooa) doodVar.c;
            } else {
                dooaVar = dooa.m;
            }
            dgaw dgawVar = dooaVar.c;
            if (dgawVar == null) {
                dgawVar = dgaw.g;
            }
            return dgawVar.b;
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (q((List) ((dbsi) obj).b) > q((List) ((dbsi) obj2).b) ? 1 : (q((List) ((dbsi) obj).b) == q((List) ((dbsi) obj2).b) ? 0 : -1));
    }
}
