package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bikk  reason: default package */
/* loaded from: classes3.dex */
public class bikk implements bikf {
    final dnjy a;
    final Context b;

    public bikk(dnjy dnjyVar, Context context) {
        this.a = dnjyVar;
        this.b = context;
    }

    @Override // defpackage.bike
    public int b() {
        return 2131232684;
    }

    @Override // defpackage.bikf
    @dzsi
    public String c() {
        return null;
    }

    @Override // defpackage.bike
    public String a() {
        int a = dnjx.a(this.a.d);
        if (a != 0 && a == 2) {
            dnjv dnjvVar = this.a.b;
            if (dnjvVar == null) {
                dnjvVar = dnjv.g;
            }
            dnjl dnjlVar = dnjvVar.b;
            if (dnjlVar == null) {
                dnjlVar = dnjl.b;
            }
            String str = dnjlVar.a;
            return !str.isEmpty() ? this.b.getString(R.string.PERSONAL_FLIGHT_DEPARTS, str) : "";
        }
        dnjv dnjvVar2 = this.a.c;
        if (dnjvVar2 == null) {
            dnjvVar2 = dnjv.g;
        }
        dnjl dnjlVar2 = dnjvVar2.b;
        if (dnjlVar2 == null) {
            dnjlVar2 = dnjl.b;
        }
        String str2 = dnjlVar2.a;
        return !str2.isEmpty() ? this.b.getString(R.string.PERSONAL_FLIGHT_ARRIVES, str2) : "";
    }
}
