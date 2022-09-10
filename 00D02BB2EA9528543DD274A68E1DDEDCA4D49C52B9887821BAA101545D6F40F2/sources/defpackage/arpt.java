package defpackage;

import android.content.Intent;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: arpt  reason: default package */
/* loaded from: classes.dex */
public final class arpt extends afho {
    public static final dbsl<afga> a = arps.a;
    private final btvo i;
    private final cjqy j;
    private final dxio<ascb> k;
    private final qeg l;

    public arpt(Intent intent, @dzsi String str, gga ggaVar, afih afihVar, afhe afheVar, btvo btvoVar, cjqy cjqyVar, dxio<ascb> dxioVar, eeu eeuVar, dxio<afwr> dxioVar2, qeg qegVar) {
        super(intent, str, afid.FREE_NAV_ACTION, ggaVar, eeuVar, afihVar, afheVar, dxioVar2);
        this.i = btvoVar;
        this.j = cjqyVar;
        this.k = dxioVar;
        this.l = qegVar;
    }

    @Override // defpackage.afho
    public final void e(afia afiaVar, String str) {
        if (!this.i.getNavigationParameters().A()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        amvh amvhVar = afiaVar.i;
        if (amvhVar != null) {
            arrayList.add(amvhVar);
        }
        arrayList.addAll(afiaVar.j);
        dqvj b = afiaVar.b();
        if (b == null || (b == dqvj.TWO_WHEELER && !this.l.b())) {
            b = dqvj.DRIVE;
        }
        cjqy cjqyVar = this.j;
        cjsx i = cjsy.i();
        i.b(ddda.d);
        cjqyVar.k(i.a());
        asby e = asbz.e();
        e.d(b);
        e.c(arrayList);
        e.b(true);
        this.k.a().f(e.a());
    }
}
