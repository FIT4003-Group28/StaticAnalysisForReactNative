package defpackage;

import android.content.Context;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: oug  reason: default package */
/* loaded from: classes7.dex */
public final class oug extends cqiw<wjk> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, wjk wjkVar, Context context, cqiv cqivVar) {
        cqiw otwVar;
        wjk wjkVar2 = wjkVar;
        Iterator<wjm> it = wjkVar2.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                otwVar = new otw();
                break;
            } else if (it.next().d()) {
                otwVar = new otv();
                break;
            }
        }
        cqivVar.f(otwVar, wjkVar2.c().subList(0, Math.min(wjkVar2.c().size(), 4)));
        cqivVar.a(new hsd(), hsd.e(irh.h()));
        if (wjkVar2.c().size() > 4) {
            cqivVar.a(new gvb(), wjkVar2);
            cqivVar.a(new oui(), wjkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<wjk> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()));
    }
}
