package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bikn  reason: default package */
/* loaded from: classes3.dex */
public class bikn implements bikf {
    final doqp a;
    final Context b;

    public bikn(doqp doqpVar, Context context) {
        this.a = doqpVar;
        this.b = context;
    }

    @Override // defpackage.bike
    public int b() {
        int a = doqo.a(this.a.e);
        if (a != 0 && a == 3) {
            return 2131231737;
        }
        int a2 = doqo.a(this.a.e);
        if (a2 != 0 && a2 == 4) {
            return 2131231676;
        }
        int a3 = doqo.a(this.a.e);
        return (a3 != 0 && a3 == 2) ? 2131231764 : 0;
    }

    @Override // defpackage.bikf
    @dzsi
    public String c() {
        int a = doqo.a(this.a.e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_BUS);
            }
            if (i == 3) {
                return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_TAXI);
            }
            return null;
        }
        return this.b.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_MODE_TRAIN);
    }

    @Override // defpackage.bike
    public String a() {
        int a = doqm.a(this.a.d);
        if (a != 0 && a != 1) {
            Context context = this.b;
            Object[] objArr = new Object[1];
            doqk doqkVar = this.a.c;
            if (doqkVar == null) {
                doqkVar = doqk.d;
            }
            dnjl dnjlVar = doqkVar.a;
            if (dnjlVar == null) {
                dnjlVar = dnjl.b;
            }
            objArr[0] = dnjlVar.a;
            return context.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_ARRIVAL_WHEN, objArr);
        }
        Context context2 = this.b;
        Object[] objArr2 = new Object[1];
        doqk doqkVar2 = this.a.b;
        if (doqkVar2 == null) {
            doqkVar2 = doqk.d;
        }
        dnjl dnjlVar2 = doqkVar2.a;
        if (dnjlVar2 == null) {
            dnjlVar2 = dnjl.b;
        }
        objArr2[0] = dnjlVar2.a;
        return context2.getString(R.string.PERSONAL_TRANSPORTATION_ROUTE_DEPARTURE_WHEN, objArr2);
    }
}
