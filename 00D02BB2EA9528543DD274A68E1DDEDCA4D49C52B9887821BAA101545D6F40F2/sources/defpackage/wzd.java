package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wzd  reason: default package */
/* loaded from: classes7.dex */
public class wzd implements wym {
    private final djws a;
    private int b;
    private final CharSequence c;
    private boolean d;

    public wzd(cqhn cqhnVar, Activity activity, drhn drhnVar, djws djwsVar) {
        djwn djwnVar;
        djwn djwnVar2;
        drhs drhsVar;
        drhs drhsVar2;
        this.a = djwsVar;
        this.b = 0;
        if (drhnVar != null) {
            drhx drhxVar = drhnVar.e;
            drhxVar = drhxVar == null ? drhx.c : drhxVar;
            if (drhxVar.a == 2) {
                drhsVar = (drhs) drhxVar.b;
            } else {
                drhsVar = drhs.b;
            }
            if (drhsVar.a.size() > 0) {
                drhx drhxVar2 = drhnVar.e;
                drhxVar2 = drhxVar2 == null ? drhx.c : drhxVar2;
                if (drhxVar2.a == 2) {
                    drhsVar2 = (drhs) drhxVar2.b;
                } else {
                    drhsVar2 = drhs.b;
                }
                this.b = drhsVar2.a.get(0).b;
            }
        }
        Resources resources = activity.getResources();
        Object[] objArr = new Object[2];
        if (djwsVar.a == 6) {
            djwnVar = (djwn) djwsVar.b;
        } else {
            djwnVar = djwn.c;
        }
        objArr[0] = Integer.valueOf(djwnVar.a);
        if (djwsVar.a == 6) {
            djwnVar2 = (djwn) djwsVar.b;
        } else {
            djwnVar2 = djwn.c;
        }
        objArr[1] = Integer.valueOf(djwnVar2.b);
        this.c = resources.getString(R.string.TRANSIT_TRIP_ATTRIBUTES_NUMBER_RANGE, objArr);
        this.d = false;
    }

    @Override // defpackage.wym
    public CharSequence a() {
        return this.a.f;
    }

    @Override // defpackage.wym
    public CharSequence b() {
        int i = this.b;
        return i == 0 ? "" : Integer.toString(i);
    }

    @Override // defpackage.wym
    public CharSequence c() {
        if (this.d) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.wym
    public cqkl d(CharSequence charSequence) {
        djwn djwnVar;
        int i = 0;
        this.d = false;
        String trim = charSequence.toString().trim();
        djws djwsVar = this.a;
        if (djwsVar.a == 6) {
            djwnVar = (djwn) djwsVar.b;
        } else {
            djwnVar = djwn.c;
        }
        try {
            if (trim.length() > 0) {
                i = Integer.parseInt(trim);
            }
        } catch (NullPointerException | NumberFormatException unused) {
            this.d = true;
        }
        if (i >= djwnVar.a && i <= djwnVar.b) {
            this.b = i;
            cqkx.p(this);
            return cqkl.a;
        }
        this.d = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.wym
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtyc.et;
        ddes bZ = ddet.D.bZ();
        ddgs bZ2 = ddgt.c.bZ();
        drhj drhjVar = this.a.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        String str = drhjVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgt ddgtVar = (ddgt) bZ2.b;
        str.getClass();
        ddgtVar.a |= 1;
        ddgtVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddgt bK = bZ2.bK();
        bK.getClass();
        ddetVar.z = bK;
        ddetVar.b |= 2;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.wys
    public wvy f() {
        wvx c = wvy.c();
        drhj drhjVar = this.a.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        wvm wvmVar = (wvm) c;
        wvmVar.a = drhjVar;
        drho bZ = drhx.c.bZ();
        drhr bZ2 = drhs.b.bZ();
        drhp bZ3 = drhq.c.bZ();
        int i = this.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drhq drhqVar = (drhq) bZ3.b;
        drhqVar.a |= 1;
        drhqVar.b = i;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drhs drhsVar = (drhs) bZ2.b;
        drhq bK = bZ3.bK();
        bK.getClass();
        dsrj<drhq> dsrjVar = drhsVar.a;
        if (!dsrjVar.a()) {
            drhsVar.a = dsqw.cl(dsrjVar);
        }
        drhsVar.a.add(bK);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drhx drhxVar = (drhx) bZ.b;
        drhs bK2 = bZ2.bK();
        bK2.getClass();
        drhxVar.b = bK2;
        drhxVar.a = 2;
        drhm bZ4 = drhn.g.bZ();
        drhj drhjVar2 = this.a.c;
        if (drhjVar2 == null) {
            drhjVar2 = drhj.c;
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drhn drhnVar = (drhn) bZ4.b;
        drhjVar2.getClass();
        drhnVar.b = drhjVar2;
        drhnVar.a |= 1;
        drhx bK3 = bZ.bK();
        bK3.getClass();
        drhnVar.e = bK3;
        drhnVar.a |= 8;
        wvmVar.b = bZ4.bK();
        return c.a();
    }
}
