package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: sfv  reason: default package */
/* loaded from: classes4.dex */
final class sfv extends sbs {
    final /* synthetic */ sfw a;

    public sfv(sfw sfwVar) {
        this.a = sfwVar;
    }

    @Override // defpackage.sbs
    public final void b(Map map, sfa sfaVar) {
        sfw sfwVar = this.a;
        ArrayList d = sbv.d();
        for (List list : map.values()) {
            d.addAll(list);
        }
        sfwVar.e(d, sfaVar);
    }
}
