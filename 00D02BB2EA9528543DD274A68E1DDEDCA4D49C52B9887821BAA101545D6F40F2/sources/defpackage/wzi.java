package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: wzi  reason: default package */
/* loaded from: classes7.dex */
public class wzi implements wyn {
    public final wzg a;
    public final Activity b;
    private final wvp d;
    private final djws e;
    private final wvw f;
    private final String h;
    private wzo i;
    private wzb j;
    private wzd k;
    private final wys l;
    private final drhn m;
    private final boolean n;
    public boolean c = false;
    private boolean g = false;

    public wzi(wzp wzpVar, wzc wzcVar, wze wzeVar, wvp wvpVar, cqhn cqhnVar, Activity activity, xaz xazVar, wzg wzgVar, wvy wvyVar, djws djwsVar, wvw wvwVar) {
        djpk bK;
        this.a = wzgVar;
        this.d = wvpVar;
        this.e = djwsVar;
        this.f = wvwVar;
        this.b = activity;
        boolean z = false;
        this.h = activity.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_SAVE_FAILED_TEXT);
        String j = wvwVar.j();
        if (j != null) {
            djpj bZ = djpk.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar = (djpk) bZ.b;
            j.getClass();
            djpkVar.a |= 8;
            djpkVar.d = j;
            bK = bZ.bK();
        } else {
            djpj bZ2 = djpk.e.bZ();
            String e = wvwVar.e();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpk djpkVar2 = (djpk) bZ2.b;
            e.getClass();
            djpkVar2.a |= 1;
            djpkVar2.b = e;
            long h = wvwVar.h();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpk djpkVar3 = (djpk) bZ2.b;
            djpkVar3.a |= 2;
            djpkVar3.c = h;
            bK = bZ2.bK();
        }
        dpjb a = wvwVar.a();
        drhj drhjVar = djwsVar.c;
        drhn a2 = xazVar.a(bK, a, drhjVar == null ? drhj.c : drhjVar);
        this.m = a2;
        drhj drhjVar2 = djwsVar.c;
        drhjVar2 = drhjVar2 == null ? drhj.c : drhjVar2;
        HashMap<drhj, drhn> a3 = xazVar.a.a(bK);
        if (a3 != null && a3.containsKey(drhjVar2)) {
            z = true;
        }
        this.n = z;
        a2 = wvyVar.b() != null ? wvyVar.b() : a2;
        if (djwsVar.a != 5) {
            cqhn a4 = wzeVar.a.a();
            wze.a(a4, 1);
            Activity activity2 = (Activity) ((dxjd) wzeVar.b).a;
            wze.a(activity2, 2);
            wze.a(djwsVar, 4);
            wzd wzdVar = new wzd(a4, activity2, a2, djwsVar);
            this.k = wzdVar;
            this.l = wzdVar;
            return;
        }
        int a5 = djwk.a(djwsVar.e);
        if (a5 != 0 && a5 == 2) {
            wzm a6 = wzpVar.a.a();
            wzp.a(a6, 1);
            wzp.a(djwsVar, 3);
            wzo wzoVar = new wzo(a6, a2, djwsVar);
            this.i = wzoVar;
            this.l = wzoVar;
            return;
        }
        wza a7 = wzcVar.a.a();
        wzc.a(a7, 1);
        wzc.a(djwsVar, 3);
        wzb wzbVar = new wzb(a7, a2, djwsVar);
        this.j = wzbVar;
        this.l = wzbVar;
    }

    @Override // defpackage.wyn
    public cqkl a() {
        wzf wzfVar = new wzf(this);
        wvy f = f();
        drhn b = f == null ? null : f.b();
        if (b == null) {
            this.a.a();
        } else {
            wvp wvpVar = this.d;
            djws djwsVar = this.e;
            drhx drhxVar = b.e;
            if (drhxVar == null) {
                drhxVar = drhx.c;
            }
            wvw wvwVar = this.f;
            drhn drhnVar = this.m;
            boolean z = this.n;
            djpa bZ = djpm.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpm djpmVar = (djpm) bZ.b;
            djpmVar.c = 83547;
            djpmVar.a |= 1;
            djpc bZ2 = djpl.f.bZ();
            djpg bZ3 = djph.e.bZ();
            if (drhnVar != null) {
                drhl b2 = drhl.b(drhnVar.c);
                if (b2 == null) {
                    b2 = drhl.UNKNOWN_ATTRIBUTE_SOURCE;
                }
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djph djphVar = (djph) bZ3.b;
                djphVar.c = b2.g;
                djphVar.a |= 2;
                drhx drhxVar2 = drhnVar.e;
                if (drhxVar2 == null) {
                    drhxVar2 = drhx.c;
                }
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djph djphVar2 = (djph) bZ3.b;
                drhxVar2.getClass();
                djphVar2.b = drhxVar2;
                int i = djphVar2.a | 1;
                djphVar2.a = i;
                djphVar2.a = i | 4;
                djphVar2.d = z;
            }
            djpf bZ4 = djpi.e.bZ();
            drhj drhjVar = djwsVar.c;
            if (drhjVar == null) {
                drhjVar = drhj.c;
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djpi djpiVar = (djpi) bZ4.b;
            drhjVar.getClass();
            djpiVar.b = drhjVar;
            int i2 = djpiVar.a | 1;
            djpiVar.a = i2;
            drhxVar.getClass();
            djpiVar.c = drhxVar;
            djpiVar.a = i2 | 2;
            djph bK = bZ3.bK();
            bK.getClass();
            djpiVar.d = bK;
            djpiVar.a |= 4;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpl djplVar = (djpl) bZ2.b;
            djpi bK2 = bZ4.bK();
            bK2.getClass();
            dsrj<djpi> dsrjVar = djplVar.d;
            if (!dsrjVar.a()) {
                djplVar.d = dsqw.cl(dsrjVar);
            }
            djplVar.d.add(bK2);
            djpj bZ5 = djpk.e.bZ();
            String e = wvwVar.e();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djpk djpkVar = (djpk) bZ5.b;
            e.getClass();
            djpkVar.a |= 1;
            djpkVar.b = e;
            long h = wvwVar.h();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djpk djpkVar2 = (djpk) bZ5.b;
            djpkVar2.a |= 2;
            djpkVar2.c = h;
            String j = wvwVar.j();
            if (j != null) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djpk djpkVar3 = (djpk) bZ5.b;
                j.getClass();
                djpkVar3.a |= 8;
                djpkVar3.d = j;
            }
            djpk bK3 = bZ5.bK();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpl djplVar2 = (djpl) bZ2.b;
            bK3.getClass();
            djplVar2.b = bK3;
            djplVar2.a |= 1;
            djpd bZ6 = djpe.e.bZ();
            String i3 = wvwVar.i();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djpe djpeVar = (djpe) bZ6.b;
            i3.getClass();
            djpeVar.a |= 1;
            djpeVar.b = i3;
            long j2 = wvwVar.d().b;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djpe djpeVar2 = (djpe) bZ6.b;
            djpeVar2.a |= 2;
            djpeVar2.c = j2;
            String str = wvwVar.d().c;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            djpe djpeVar3 = (djpe) bZ6.b;
            str.getClass();
            djpeVar3.a |= 4;
            djpeVar3.d = str;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpl djplVar3 = (djpl) bZ2.b;
            djpe bK4 = bZ6.bK();
            bK4.getClass();
            djplVar3.c = bK4;
            djplVar3.a |= 2;
            String g = wvwVar.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpl djplVar4 = (djpl) bZ2.b;
            g.getClass();
            djplVar4.a |= 4;
            djplVar4.e = g;
            djpl bK5 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpm djpmVar2 = (djpm) bZ.b;
            bK5.getClass();
            dsrj<djpl> dsrjVar2 = djpmVar2.b;
            if (!dsrjVar2.a()) {
                djpmVar2.b = dsqw.cl(dsrjVar2);
            }
            djpmVar2.b.add(bK5);
            wvpVar.c.b(bZ.bK(), new wvo(wvpVar, wzfVar), wvpVar.b);
        }
        this.c = false;
        this.g = true;
        g();
        return cqkl.a;
    }

    @Override // defpackage.wyn
    public wyp b() {
        return this.i;
    }

    @Override // defpackage.wyn
    public wyl c() {
        return this.j;
    }

    @Override // defpackage.wyn
    public wym d() {
        return this.k;
    }

    @Override // defpackage.wyn
    public Boolean e() {
        return Boolean.valueOf(this.g);
    }

    public wvy f() {
        wys wysVar = this.l;
        if (wysVar != null) {
            return wysVar.f();
        }
        return null;
    }

    public void g() {
        cqkx.p(this);
        if (this.c) {
            ckos.a(this.b.findViewById(16908290), this.h, 0).c();
        }
    }

    public djws h() {
        return this.e;
    }
}
