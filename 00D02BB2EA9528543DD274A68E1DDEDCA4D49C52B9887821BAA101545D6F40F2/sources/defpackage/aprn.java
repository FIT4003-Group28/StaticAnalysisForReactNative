package defpackage;

import android.util.Pair;
import java.util.List;
/* compiled from: PG */
/* renamed from: aprn  reason: default package */
/* loaded from: classes2.dex */
final class aprn implements btzi<dwuv, dwuz> {
    final String a;
    final /* synthetic */ btlu b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ apro e;

    public aprn(apro aproVar, btlu btluVar, List list, List list2) {
        this.e = aproVar;
        this.b = btluVar;
        this.c = list;
        this.d = list2;
        this.a = btluVar.d;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwuv> btzrVar, btzy btzyVar) {
        Pair<String, Long> pair = apro.a;
        Throwable th = btzyVar.r;
        this.e.e(this.a, this.c, this.d);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwuv> btzrVar, dwuz dwuzVar) {
        dwuz dwuzVar2 = dwuzVar;
        dbsg j = dbsg.j(btzrVar.c);
        if (j.a()) {
            String t = ((btlu) j.b()).t();
            if ((dwuzVar2.a & 4) != 0) {
                dwuy dwuyVar = dwuzVar2.b;
                if (dwuyVar == null) {
                    dwuyVar = dwuy.c;
                }
                if (dwuyVar.a && !dbsj.d(t)) {
                    this.c.add(t);
                }
            }
        } else {
            Pair<String, Long> pair = apro.a;
        }
        this.e.e(this.a, this.c, this.d);
    }
}
