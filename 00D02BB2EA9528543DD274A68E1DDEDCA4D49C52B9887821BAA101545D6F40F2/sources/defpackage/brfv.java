package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: brfv  reason: default package */
/* loaded from: classes4.dex */
public class brfv implements brgm {
    private final String a;
    private boolean b;
    private final String c;
    private final int d;
    private final brfu e;
    private final Activity f;

    public brfv(String str, String str2, boolean z, cqhn cqhnVar, int i, brfu brfuVar, Activity activity) {
        dbsk.l(true);
        this.a = str;
        this.c = str2;
        this.b = z;
        this.d = i;
        this.e = brfuVar;
        this.f = activity;
    }

    @Override // defpackage.brgm
    public String a() {
        return this.a;
    }

    @Override // defpackage.brgm
    public String b() {
        String string;
        if (this.b) {
            string = this.f.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.f.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.f.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, new Object[]{a(), string});
    }

    @Override // defpackage.brgm
    public cqkl c() {
        boolean z = !this.b;
        this.b = z;
        brfu brfuVar = this.e;
        int i = this.d;
        brfx brfxVar = (brfx) brfuVar;
        brdl brdlVar = brfxVar.a.e;
        if (brdlVar.d.get(i) != z) {
            brdlVar.d.put(i, z);
        }
        brgb brgbVar = brfxVar.a;
        brdi brdiVar = brgbVar.d;
        brdl brdlVar2 = brgbVar.e;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < brdlVar2.d.size(); i2++) {
            if (brdlVar2.d.valueAt(i2)) {
                arrayList.add(Integer.valueOf(brdlVar2.d.keyAt(i2)));
            }
        }
        brdiVar.g(brcy.f(brdlVar2.a, brdlVar2.b, brdlVar2.e, brdlVar2.c, arrayList));
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.brgm
    public Boolean d() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.brgm
    @dzsi
    public jic e() {
        if (dbsj.d(this.c)) {
            return null;
        }
        return new jic(this.c, ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.brgm
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = dtxo.al;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = d().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        ddmb bZ2 = ddmc.d.bZ();
        int i = this.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddmc ddmcVar = (ddmc) bZ2.b;
        ddmcVar.a |= 1;
        ddmcVar.b = i;
        b.h(bZ2.bK());
        return b.a();
    }
}
