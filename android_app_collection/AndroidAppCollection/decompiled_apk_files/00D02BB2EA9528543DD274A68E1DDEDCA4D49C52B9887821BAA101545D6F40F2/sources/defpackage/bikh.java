package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bikh  reason: default package */
/* loaded from: classes3.dex */
public class bikh implements bikf {
    final dnfu a;
    final Context b;

    public bikh(dnfu dnfuVar, Context context) {
        this.a = dnfuVar;
        this.b = context;
    }

    @Override // defpackage.bike
    public int b() {
        return 2131231612;
    }

    @Override // defpackage.bikf
    @dzsi
    public String c() {
        return null;
    }

    @Override // defpackage.bike
    public String a() {
        int a = dnft.a(this.a.d);
        if (a != 0 && a != 1) {
            Context context = this.b;
            Object[] objArr = new Object[1];
            dnfr dnfrVar = this.a.c;
            if (dnfrVar == null) {
                dnfrVar = dnfr.c;
            }
            dnjl dnjlVar = dnfrVar.a;
            if (dnjlVar == null) {
                dnjlVar = dnjl.b;
            }
            objArr[0] = dnjlVar.a;
            return context.getString(R.string.PERSONAL_CAR_RENTAL_DROP_OFF_WHEN, objArr);
        }
        Context context2 = this.b;
        Object[] objArr2 = new Object[1];
        dnfr dnfrVar2 = this.a.b;
        if (dnfrVar2 == null) {
            dnfrVar2 = dnfr.c;
        }
        dnjl dnjlVar2 = dnfrVar2.a;
        if (dnjlVar2 == null) {
            dnjlVar2 = dnjl.b;
        }
        objArr2[0] = dnjlVar2.a;
        return context2.getString(R.string.PERSONAL_CAR_RENTAL_PICKUP_WHEN, objArr2);
    }
}
