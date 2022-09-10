package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aesh  reason: default package */
/* loaded from: classes2.dex */
public final class aesh extends ipx<aesp> {
    private static final cqrp f = cqrp.d(220.0d);
    private static final cqrp g = cqrp.d(144.0d);
    private final dzsj<aetl> c;
    private final dzsj<aeto> d;
    private final dzsj<aesg> e;

    public aesh(dzsj<aeto> dzsjVar, dzsj<aetl> dzsjVar2, dzsj<aesg> dzsjVar3) {
        super(R.id.around_me_cards_scroll_view, f);
        this.d = dzsjVar;
        this.c = dzsjVar2;
        this.e = dzsjVar3;
    }

    private final void e(cqiv cqivVar, aesp aespVar, Context context) {
        aetk a = this.c.a().a(this.b, g, ckgj.SEARCH_FOR_A_PLACE, dtxy.fF);
        ixw ixwVar = new ixw();
        ixwVar.d = aespVar;
        ixwVar.a = context.getString(R.string.MAPS_ACTIVITY_SEARCH_FOR_A_PLACE_OR_ADDRESS);
        ixwVar.g = cqrt.h(2131232898, ibm.b());
        ixwVar.e = aespVar.l();
        cqivVar.a(a, ixwVar.a());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        aesp aespVar = (aesp) cqkpVar;
        if (aespVar.j().a().booleanValue()) {
            cqrp cqrpVar = this.b;
            aeso a = this.e.a().a.a();
            aesg.a(a, 1);
            aesg.a(cqrpVar, 2);
            cqivVar.a(new aesf(a, cqrpVar), aespVar.j());
            return;
        }
        if (aespVar.o().booleanValue()) {
            e(cqivVar, aespVar, context);
        }
        cqrp cqrpVar2 = this.b;
        cqrp cqrpVar3 = g;
        aeso a2 = this.d.a().a.a();
        aeto.a(a2, 1);
        aeto.a(cqrpVar2, 2);
        aeto.a(cqrpVar3, 3);
        cqivVar.f(new aetn(a2, cqrpVar2, cqrpVar3), aespVar.c());
        if (!aespVar.o().booleanValue()) {
            e(cqivVar, aespVar, context);
        }
        if (!aespVar.n().booleanValue()) {
            return;
        }
        aetk a3 = this.c.a().a(this.b, cqrpVar3, ckgj.ADD_A_MISSING_PLACE, dtxy.fs);
        ixw ixwVar = new ixw();
        ixwVar.d = aespVar;
        ixwVar.a = context.getString(R.string.ADD_A_MISSING_PLACE);
        ixwVar.g = cqrt.i(iup.e(R.raw.ic_add_location_alt), ibm.b());
        ixwVar.e = aespVar.m();
        cqivVar.a(a3, ixwVar.a());
    }
}
