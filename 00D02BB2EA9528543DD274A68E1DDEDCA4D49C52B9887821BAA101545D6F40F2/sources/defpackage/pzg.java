package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pzg  reason: default package */
/* loaded from: classes7.dex */
public class pzg implements qab {
    private final dxio<qbt> a;
    private final dxio<afha> b;
    private final dpgh c;
    private final boolean d;
    private final CharSequence e;
    private final CharSequence f;
    private final String g;
    private final Uri h;
    @dzsi
    private final transient pze i;

    public pzg(btpc btpcVar, dxio<qbt> dxioVar, dxio<afha> dxioVar2, Context context, dpgh dpghVar) {
        String string;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dpghVar;
        dnpq dnpqVar = dpghVar.d;
        this.e = (dnpqVar == null ? dnpq.g : dnpqVar).c;
        this.f = dpghVar.f;
        int i = dpghVar.a;
        if ((i & 32) != 0) {
            dnpq dnpqVar2 = dpghVar.g;
            string = pzj.b(dnpqVar2 == null ? dnpq.g : dnpqVar2, context.getString(R.string.TRANSIT_BUY_TICKET));
        } else if ((i & 8) == 0) {
            string = context.getString(R.string.TRANSIT_BUY_TICKET);
        } else {
            dnpq dnpqVar3 = dpghVar.e;
            string = pzj.b(dnpqVar3 == null ? dnpq.g : dnpqVar3, context.getString(R.string.TRANSIT_TICKET_INFORMATION));
        }
        this.g = string;
        this.i = pzf.a(dpghVar, context.getPackageManager());
        this.h = pzj.a(dpghVar.f);
        this.d = btpcVar.k();
    }

    @Override // defpackage.qab
    public Boolean a() {
        return Boolean.valueOf((this.c.a & 4) != 0);
    }

    @Override // defpackage.qab
    public CharSequence b() {
        return this.e;
    }

    @Override // defpackage.qab
    public View.OnClickListener c() {
        dnpq dnpqVar = this.c.d;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return pzi.a(dnpqVar.c, this.b);
    }

    @Override // defpackage.qab
    public Boolean d() {
        return Boolean.valueOf((this.c.a & 16) != 0);
    }

    @Override // defpackage.qab
    public CharSequence e() {
        return this.f;
    }

    @Override // defpackage.qab
    public Boolean f() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.qab
    public View.OnClickListener g() {
        Intent intent = new Intent("android.intent.action.DIAL", this.h);
        if (true != this.d) {
            intent = null;
        }
        return new pzi(intent, this.b);
    }

    @Override // defpackage.qab
    public Boolean h() {
        int i = this.c.a;
        boolean z = true;
        if ((i & 32) == 0 && (i & 8) == 0 && this.i == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.qab
    @dzsi
    public String i() {
        return this.g;
    }

    @Override // defpackage.qab
    public View.OnClickListener k() {
        String str;
        pze pzeVar = this.i;
        if (pzeVar != null) {
            return new pzi(((pzd) pzeVar).a, this.b);
        }
        dpgh dpghVar = this.c;
        if ((dpghVar.a & 32) != 0) {
            dnpq dnpqVar = dpghVar.g;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            str = dnpqVar.c;
        } else {
            dnpq dnpqVar2 = dpghVar.e;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            str = dnpqVar2.c;
        }
        return pzi.a(str, this.b);
    }

    @Override // defpackage.xhv
    public String l() {
        return this.c.b;
    }

    public pyx m() {
        return pyy.a(this.c);
    }

    @Override // defpackage.xhv
    public cqkl o() {
        this.a.a().p(dcdc.f(m()));
        return cqkl.a;
    }

    @Override // defpackage.qab
    @dzsi
    public CharSequence p() {
        return null;
    }

    @Override // defpackage.qab
    @dzsi
    public cjtd j() {
        pze pzeVar = this.i;
        String str = pzeVar == null ? "" : ((pzd) pzeVar).b.c;
        cjta b = cjtd.b();
        b.d = dtyc.bR;
        ddes bZ = ddet.D.bZ();
        ddgp bZ2 = ddgr.d.bZ();
        bZ2.a(str);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ2.b;
        ddgrVar.c = 1;
        ddgrVar.a = 1 | ddgrVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddgr bK = bZ2.bK();
        bK.getClass();
        ddetVar.w = bK;
        ddetVar.a |= 536870912;
        b.s(bZ.bK());
        return b.a();
    }
}
