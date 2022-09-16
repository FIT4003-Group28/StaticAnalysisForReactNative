package defpackage;

import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abvc  reason: default package */
/* loaded from: classes2.dex */
public class abvc implements abom {
    private static final Long a = 100L;
    private final gga b;
    @dzsi
    private final acwt c;
    private final dxio<axwy> d;
    private final dxio<afha> e;
    private final jic f;
    private final jic g;
    private final jic h;
    private final cjtd i;
    private final ddho j;
    @dzsi
    private final abol k;
    private final absg l;
    private final djrm m;

    public abvc(gga ggaVar, dxio<axwy> dxioVar, dxio<afha> dxioVar2, cqat cqatVar, djrm djrmVar, @dzsi acwt acwtVar, ddho ddhoVar, boolean z, absg absgVar) {
        this.b = ggaVar;
        this.c = acwtVar;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.m = djrmVar;
        this.j = ddhoVar;
        this.l = absgVar;
        djro djroVar = djrmVar.j;
        this.f = new jic((djroVar == null ? djro.c : djroVar).b, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 250);
        this.h = new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.editorial_list), 0);
        this.g = new jic(djrmVar.k, ckqc.FIFE, djrmVar.k.isEmpty() ? iup.e(R.raw.editorial_list) : null, 250);
        cjta b = cjtd.b();
        b.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        ddzh bZ2 = ddzp.i.bZ();
        drco drcoVar = djrmVar.m;
        String str = (drcoVar == null ? drco.d : drcoVar).c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzp ddzpVar = (ddzp) bZ2.b;
        str.getClass();
        ddzpVar.a |= 1;
        ddzpVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddzp bK = bZ2.bK();
        bK.getClass();
        ddetVar.h = bK;
        ddetVar.a |= 32;
        b.s(bZ.bK());
        this.i = b.a();
        if (z) {
            eaph eaphVar = new eaph(cqatVar.b());
            if ((((eaphVar.b.E().d(eaphVar.a) - eaphVar.p()) + 7) / 7) % 5 == 0) {
                this.k = new abvb(ggaVar, dxioVar);
                return;
            }
        }
        this.k = null;
    }

    private final boolean q() {
        dprg dprgVar = this.m.h;
        if (dprgVar == null) {
            dprgVar = dprg.c;
        }
        return dprgVar.a >= a.longValue();
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.abom
    public String b() {
        return this.m.b;
    }

    @Override // defpackage.abom
    @dzsi
    public String c() {
        String quantityString;
        String concat;
        String str = "";
        if (m().booleanValue()) {
            djro djroVar = this.m.j;
            if (djroVar == null) {
                djroVar = djro.c;
            }
            String valueOf = String.valueOf(djroVar.a);
            concat = valueOf.length() != 0 ? "YouTube · ".concat(valueOf) : new String("YouTube · ");
        } else {
            djrm djrmVar = this.m;
            int i = djrmVar.f;
            if (i == 0) {
                return null;
            }
            int a2 = dgik.a(djrmVar.i);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 2) {
                quantityString = this.b.getResources().getQuantityString(R.plurals.LIST_COUNT_EVENTS, i, Integer.valueOf(i));
            } else if (i2 != 4) {
                int i3 = this.m.g;
                if (i3 > 0) {
                    quantityString = this.b.getResources().getQuantityString(R.plurals.EXPLORE_SCAVENGER_HUNT_VISITEDNESS, i, Integer.valueOf(i3), Integer.valueOf(i));
                } else {
                    quantityString = this.b.getResources().getQuantityString(R.plurals.LIST_COUNT_PLACES, i, Integer.valueOf(i));
                }
            } else {
                quantityString = this.b.getResources().getQuantityString(R.plurals.LIST_COUNT_ITEMS, i, Integer.valueOf(i));
            }
            String valueOf2 = String.valueOf(quantityString);
            concat = valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str);
        }
        if (q()) {
            String valueOf3 = String.valueOf(concat);
            if (q()) {
                Resources resources = this.b.getResources();
                dprg dprgVar = this.m.h;
                if (dprgVar == null) {
                    dprgVar = dprg.c;
                }
                int i4 = (int) dprgVar.a;
                Object[] objArr = new Object[1];
                dprg dprgVar2 = this.m.h;
                if (dprgVar2 == null) {
                    dprgVar2 = dprg.c;
                }
                objArr[0] = dprgVar2.b;
                str = resources.getQuantityString(R.plurals.LIST_COUNT_VIEWS, i4, objArr);
            }
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 3 + String.valueOf(str).length());
            sb.append(valueOf3);
            sb.append(" · ");
            sb.append(str);
            return sb.toString();
        }
        return concat;
    }

    @Override // defpackage.abom
    public jic d() {
        return this.g;
    }

    @Override // defpackage.abom
    @dzsi
    public jic e() {
        return this.h;
    }

    @Override // defpackage.abom
    @dzsi
    public jic f() {
        if (m().booleanValue()) {
            return null;
        }
        return this.f;
    }

    @Override // defpackage.abom
    @dzsi
    public cqtd g() {
        if (m().booleanValue()) {
            return cqrt.h(2131232853, irg.a());
        }
        return null;
    }

    @Override // defpackage.abom
    @dzsi
    public cqtd h() {
        if (m().booleanValue()) {
            return cqrt.f(2131233003);
        }
        return null;
    }

    @Override // defpackage.abom
    public cqkl i() {
        if (m().booleanValue()) {
            boolean z = false;
            String str = this.m.u.get(0).a;
            gga ggaVar = this.b;
            daqs.a(str, "The videoId must not be null or empty");
            daqs.a("AIzaSyDIkDRrjHhsB6d1mBfpkbGUfOVCsTqiZhM", "The developerKey must not be null or empty");
            Intent putExtra = new Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", str);
            Intent putExtra2 = putExtra.putExtra("app_package", ggaVar.getPackageName()).putExtra("app_version", daqr.a(ggaVar)).putExtra("client_library_version", daqr.b()).putExtra("developer_key", "AIzaSyDIkDRrjHhsB6d1mBfpkbGUfOVCsTqiZhM").putExtra("autoplay", true).putExtra("lightbox_mode", true).putExtra("start_time_millis", 0);
            if ((ggaVar.getWindow().getAttributes().flags & 1024) == 0) {
                z = true;
            }
            putExtra2.putExtra("window_has_status_bar", z);
            this.e.a().f(this.b, putExtra, 1);
        } else {
            acwt acwtVar = this.c;
            if (acwtVar != null) {
                acwtVar.a();
            }
            axwy a2 = this.d.a();
            drco drcoVar = this.m.m;
            if (drcoVar == null) {
                drcoVar = drco.d;
            }
            a2.E(drcoVar.c);
        }
        return cqkl.a;
    }

    @Override // defpackage.abom
    public cjtd j() {
        return this.i;
    }

    @Override // defpackage.abom
    public String k() {
        StringBuilder sb = new StringBuilder();
        sb.append(b());
        if (c() != null) {
            sb.append(" ");
            sb.append(c());
        }
        return sb.toString();
    }

    @Override // defpackage.abom
    @dzsi
    public abol l() {
        return this.k;
    }

    @Override // defpackage.abom
    public Boolean m() {
        return false;
    }

    @Override // defpackage.abom
    public String n() {
        return "";
    }

    @Override // defpackage.abom
    @dzsi
    public cjtd o() {
        if (n().isEmpty()) {
            return null;
        }
        return cjtd.a(this.l == absg.AREA_EXPLORE ? dtxj.cK : dtxr.aF);
    }

    @Override // defpackage.abom
    @dzsi
    public cjtd p() {
        if (q()) {
            return cjtd.a(this.l == absg.AREA_EXPLORE ? dtxj.cO : dtxo.cK);
        }
        return null;
    }
}
