package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: znt  reason: default package */
/* loaded from: classes7.dex */
public class znt implements zdq, ahvl {
    public final ahvo a;
    private final vmw b;
    private final Activity c;
    private final dxio<cztz> d;
    private final gdc e;
    private int f = 390;
    private final View.OnClickListener g = new znr(this);
    private final View.OnClickListener h = new zns(this);

    public znt(ahvo ahvoVar, vmw vmwVar, Activity activity, cqhn cqhnVar, dxio<cztz> dxioVar, gdc gdcVar) {
        this.a = ahvoVar;
        this.b = vmwVar;
        this.d = dxioVar;
        this.c = activity;
        this.e = gdcVar;
    }

    private final void k(String str, String str2, View.OnClickListener onClickListener) {
        cztq a = cztt.a(this.d.a());
        a.c = str;
        a.f(str2, onClickListener);
        a.c();
    }

    @Override // defpackage.zdq
    public cqkl a() {
        if (this.a.e()) {
            if (!j().booleanValue()) {
                String string = this.c.getString(R.string.TRANSIT_TO_GO_STOP_SHARE_CONFIRM_TEXT);
                gcz a = this.e.a();
                a.j();
                a.e = string;
                a.i = cjtd.a(dtyc.db);
                a.h(R.string.YES_BUTTON, cjtd.a(dtyc.dd), new gdd(this) { // from class: znp
                    private final znt a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        this.a.b();
                    }
                });
                a.e(R.string.NO_BUTTON, cjtd.a(dtyc.dc), znq.a);
                a.b();
            } else {
                b();
            }
        } else if (!this.a.f()) {
            this.b.l();
            this.a.a(this);
        }
        return cqkl.a;
    }

    public final void b() {
        this.a.d();
        this.a.b(this);
    }

    @Override // defpackage.zdq
    @dzsi
    public cjtd c() {
        if (this.a.e() || this.a.f()) {
            return cjtd.a(dtyc.de);
        }
        return cjtd.a(dtyc.cX);
    }

    @Override // defpackage.zdq
    public String d() {
        if (this.a.e()) {
            return this.c.getResources().getString(R.string.TRANSIT_TO_GO_STOP_SHARE_BUTTON);
        }
        if (this.a.f()) {
            return this.c.getResources().getString(R.string.TRANSIT_TO_GO_SHARE_STARTING_BUTTON);
        }
        return this.c.getResources().getString(R.string.TRANSIT_TO_GO_SHARE_ETA_BUTTON);
    }

    @Override // defpackage.zdq
    public cqtd e() {
        if (this.a.e()) {
            return cqrt.g(2131231801, ibm.x());
        }
        return cqrt.g(2131231801, irg.k());
    }

    @Override // defpackage.zdq
    public Boolean f() {
        return Boolean.valueOf(this.a.e());
    }

    @Override // defpackage.ahvl
    public void g() {
        cqkx.p(this);
    }

    @Override // defpackage.ahvl
    public void h() {
        cqkx.p(this);
        if (this.d != null) {
            if (this.a.e()) {
                List<String> g = this.a.g();
                if (g.size() != 1 || g.isEmpty()) {
                    k(this.c.getResources().getString(R.string.JOURNEY_SHARING_CREATED), this.c.getResources().getString(R.string.JOURNEY_CANCEL), this.h);
                    return;
                } else {
                    k(this.c.getResources().getString(R.string.JOURNEY_SHARING_CREATED_ONE_USER, g.get(0)), this.c.getResources().getString(R.string.JOURNEY_CANCEL), this.h);
                    return;
                }
            }
            k(this.c.getResources().getString(R.string.JOURNEY_WAS_NOT_CREATED), this.c.getResources().getString(R.string.JOURNEY_RETRY), this.g);
        }
    }

    @Override // defpackage.ahvl
    public void i() {
        cqkx.p(this);
    }

    @Override // defpackage.zdq
    public Boolean j() {
        return Boolean.valueOf(cqsz.c().e(this.c) > cqrp.d((double) this.f).e(this.c));
    }
}
