package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: auma  reason: default package */
/* loaded from: classes2.dex */
public final class auma extends gen implements aunq {
    public cqkj a;
    public String ad;
    private aunr ae;
    private ArrayList<Integer> af;
    public cjqy b;
    public aunp c;
    public aulx d;
    public dkps e;
    public String g;

    @Override // defpackage.ges
    public final void Nv() {
        ((aumb) btsx.b(aumb.class, this)).cn(this);
    }

    @Override // defpackage.gen
    protected final void aX() {
        J().finish();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf((Context) J(), false);
        aunr aunrVar = this.ae;
        if (aunrVar != null) {
            cqkf c = this.a.c(new aune(aunrVar.c().intValue()), null);
            c.e(this.ae);
            gdfVar.setContentView(c.c());
        }
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            this.e = (dkps) dsqw.cq(dkps.k, this.o.getByteArray("survey"));
            if (bundle == null) {
                this.g = this.b.b();
                this.ad = cjrx.a(this.e.b);
                aulx aulxVar = this.d;
                int size = this.e.i.size();
                int a = dkpp.a(this.e.j);
                if (a == 0) {
                    a = 1;
                }
                ArrayList<Integer> arrayList = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Integer.valueOf(i));
                }
                int i2 = a - 1;
                if (i2 != 2) {
                    if (i2 == 3) {
                        Collections.shuffle(arrayList);
                    }
                } else if (aulxVar.a.nextBoolean()) {
                    Collections.reverse(arrayList);
                }
                this.af = arrayList;
            } else {
                String string = bundle.getString("survey_ei");
                dbsk.s(string);
                this.g = string;
                String string2 = bundle.getString("survey_ved");
                dbsk.s(string2);
                this.ad = string2;
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("display_indices");
                dbsk.s(integerArrayList);
                this.af = integerArrayList;
            }
            dkps dkpsVar = this.e;
            List unmodifiableList = Collections.unmodifiableList(this.af);
            String str = this.g;
            String str2 = this.ad;
            aunu.a(this, 1);
            aunu.a(dkpsVar, 2);
            aunu.a(unmodifiableList, 3);
            aunu.a(str, 4);
            aunu.a(str2, 5);
            aunt auntVar = new aunt(this, dkpsVar, unmodifiableList, str, str2);
            this.ae = auntVar;
            auntVar.m(bundle);
        } catch (dsrm e) {
            bvoo.f(new RuntimeException(e));
            J().finish();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.dI;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putIntegerArrayList("display_indices", this.af);
        bundle.putString("survey_ei", this.g);
        bundle.putString("survey_ved", this.ad);
        this.ae.l(bundle);
    }
}
