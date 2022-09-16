package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfrk  reason: default package */
/* loaded from: classes3.dex */
public class bfrk implements bfrc {
    private final Activity a;
    private final dxio<cwv> b;
    private final cjtd c;
    private final dqxs d;
    private final boolean e;
    private final String f;
    private final dnnn g;

    public bfrk(Activity activity, dxio<cwv> dxioVar, dqxq dqxqVar, boolean z, String str, int i, dnnn dnnnVar) {
        this.a = activity;
        this.b = dxioVar;
        cjta b = cjtd.b();
        b.d = dtxy.dH;
        b.i(i);
        this.c = b.a();
        dbsk.a(!dqxqVar.a.isEmpty());
        this.d = dqxqVar.a.get(0);
        this.e = z;
        this.f = str;
        this.g = dnnnVar;
    }

    @Override // defpackage.bfrc
    public cqkl a() {
        cwv a = this.b.a();
        dnpq dnpqVar = this.d.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        a.a(dnpqVar.c);
        return cqkl.a;
    }

    @Override // defpackage.bfrc
    @dzsi
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.bfrc
    public String c() {
        return this.e ? this.d.e : this.d.f;
    }

    @Override // defpackage.bfrc
    @dzsi
    public String d() {
        dbsg dbsgVar;
        dqxs dqxsVar = this.d;
        boolean z = false;
        if ((dqxsVar.a & 2) != 0) {
            dqxc dqxcVar = dqxsVar.c;
            if (dqxcVar == null) {
                dqxcVar = dqxc.c;
            }
            if (bfre.b(dqxcVar, this.g)) {
                z = true;
            }
        }
        if (z || (this.d.a & 4) != 0) {
            Activity activity = this.a;
            dqxo dqxoVar = this.d.d;
            if (dqxoVar == null) {
                dqxoVar = dqxo.b;
            }
            if (z) {
                dqxc dqxcVar2 = this.d.c;
                if (dqxcVar2 == null) {
                    dqxcVar2 = dqxc.c;
                }
                dbsgVar = dbsg.i(dqxcVar2);
            } else {
                dbsgVar = dbpy.a;
            }
            return bfro.s(activity, dqxoVar, dbsgVar);
        }
        return null;
    }

    @Override // defpackage.bfrc
    public String e() {
        if (this.e) {
            return this.a.getString(R.string.TOTAL_PRICE);
        }
        return this.a.getString(R.string.PRICE_WITH_TAXES, new Object[]{this.d.e});
    }

    @Override // defpackage.bfrc
    public String f() {
        return this.f;
    }
}
