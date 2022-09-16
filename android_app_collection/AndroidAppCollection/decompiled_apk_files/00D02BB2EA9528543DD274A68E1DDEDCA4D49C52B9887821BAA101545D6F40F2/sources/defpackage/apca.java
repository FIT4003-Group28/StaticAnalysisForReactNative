package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: apca  reason: default package */
/* loaded from: classes2.dex */
public class apca implements apbt {
    public final gga a;
    private final aphj b;
    private final apaw c;
    private final bwrs<aoyg> d;
    private final bwrs<HashSet<akqi>> e;

    public apca(gga ggaVar, aphj aphjVar, apaw apawVar, bwrs<aoyg> bwrsVar, bwrs<HashSet<akqi>> bwrsVar2) {
        this.a = ggaVar;
        this.b = aphjVar;
        this.c = apawVar;
        this.d = bwrsVar;
        this.e = bwrsVar2;
    }

    @Override // defpackage.apbt
    public jbk a() {
        return new apbz(this);
    }

    @Override // defpackage.apbt
    public CharSequence b() {
        aphj aphjVar = this.b;
        int i = this.c.i();
        int k = k();
        bvsx bvsxVar = new bvsx(aphjVar.a.getResources());
        bvsu c = bvsxVar.c(R.string.MAPS_ACTIVITY_SELECTED_PLACES_COUNT);
        bvsv a = bvsxVar.a(Integer.valueOf(i));
        a.i();
        bvsv a2 = bvsxVar.a(Integer.valueOf(k));
        a2.i();
        c.a(a, a2);
        return c.c();
    }

    @Override // defpackage.apbt
    public Boolean c() {
        boolean z = true;
        if (k() < 200) {
            if (this.c.i() != k()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (this.c.i() != 200) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.apbt
    public cqkl d() {
        apav apavVar;
        if (c().booleanValue()) {
            this.c.g();
        } else {
            apaw apawVar = this.c;
            int i = 0;
            while (true) {
                apavVar = (apav) apawVar;
                aoyg c = apavVar.ak.c();
                dbsk.s(c);
                if (i >= c.c().size() || apavVar.am.cardinality() >= 200) {
                    break;
                }
                HashSet<akqi> c2 = apavVar.al.c();
                dbsk.s(c2);
                aoyg c3 = apavVar.ak.c();
                dbsk.s(c3);
                if (!c2.contains(c3.c().get(i).a().ai())) {
                    apavVar.am.set(i);
                }
                i++;
            }
            if (apavVar.aR() > 200) {
                apavVar.aS();
            }
            apavVar.w();
        }
        return cqkl.a;
    }

    @Override // defpackage.apbt
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtyi.W;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = c().booleanValue() ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    @Override // defpackage.apbt
    public String f() {
        String string;
        if (c().booleanValue()) {
            string = this.a.getString(R.string.MAPS_ACTIVITY_CHECKBOX_SELECTED);
        } else {
            string = this.a.getString(R.string.MAPS_ACTIVITY_CHECKBOX_NOT_SELECTED);
        }
        return this.a.getString(R.string.MAPS_ACTIVITY_SELECT_ALL_CHECKBOX_CONTENT_DESCRIPTION, new Object[]{Integer.valueOf(this.c.i()), Integer.valueOf(k()), string});
    }

    @Override // defpackage.apbt
    public Boolean g() {
        return Boolean.valueOf(this.c.i() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [apaw, gfw] */
    @Override // defpackage.apbt
    public cqkl h() {
        ?? r0 = this.c;
        dccx dccxVar = new dccx();
        int i = 0;
        while (true) {
            apav apavVar = (apav) r0;
            aoyg c = apavVar.ak.c();
            dbsk.s(c);
            if (i < c.c().size()) {
                if (apavVar.am.get(i)) {
                    aoyg c2 = apavVar.ak.c();
                    dbsk.s(c2);
                    dccxVar.g(c2.c().get(i).a());
                }
                i++;
            } else {
                apavVar.ad.e(r0, bwrs.a(dccxVar.f()));
                return cqkl.a;
            }
        }
    }

    @Override // defpackage.apbt
    public cqkl i() {
        final apav apavVar = (apav) this.c;
        apavVar.g.c(apavVar.i(), new DialogInterface.OnClickListener(apavVar) { // from class: apaq
            private final apav a;

            {
                this.a = apavVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.aJ();
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.apbt
    public Boolean j() {
        return Boolean.valueOf(k() > 0);
    }

    public final int k() {
        aoyg c = this.d.c();
        dbsk.s(c);
        dcdc<aoxt> c2 = c.c();
        int size = c2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            HashSet<akqi> c3 = this.e.c();
            dbsk.s(c3);
            if (!c3.contains(c2.get(i2).a().ai())) {
                i++;
            }
        }
        return i;
    }
}
