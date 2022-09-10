package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbbo  reason: default package */
/* loaded from: classes3.dex */
final class bbbo implements DialogInterface.OnClickListener {
    final /* synthetic */ cjql a;
    final /* synthetic */ cjtd b;
    final /* synthetic */ bbbp c;

    public bbbo(bbbp bbbpVar, cjql cjqlVar, cjtd cjtdVar) {
        this.c = bbbpVar;
        this.a = cjqlVar;
        this.b = cjtdVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.d.j(this.a, this.b);
        bbbp bbbpVar = this.c;
        angp angpVar = bbbpVar.f;
        dbpy<Object> dbpyVar = dbpy.a;
        dbpy<Object> dbpyVar2 = dbpy.a;
        dvyw dvywVar = bbbpVar.a.d;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        dvyw dvywVar2 = dvywVar;
        dbpy<Object> dbpyVar3 = dbpy.a;
        dnqg bZ = dnqh.p.bZ();
        int i2 = ddfv.i.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i2;
        angpVar.g(dbpyVar, dbpyVar2, dvywVar2, dbpyVar3, bZ.bK(), dbpy.a, dbpy.a);
        bbbv bbbvVar = bbbpVar.c;
        if (bbbvVar.d.getCurrentFocus() != null) {
            bbbvVar.c.f(bbbvVar.d.getCurrentFocus(), bbbvVar.d.getString(R.string.VISITED_PLACES_ACCESSIBILITY_PLACE_REMOVED, new Object[]{bbbpVar.a()}));
        }
        bbbvVar.e.remove(bbbpVar);
        cqkx.p(bbbvVar);
    }
}
