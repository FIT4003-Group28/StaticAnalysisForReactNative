package defpackage;

import android.app.Activity;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;
/* compiled from: PG */
/* renamed from: adgg  reason: default package */
/* loaded from: classes2.dex */
public class adgg extends aczs implements adge {
    public int a = 999;
    private final bzqc b;
    private final cjxd c;
    private final absg d;
    @dzsi
    private abjt e;
    private final abtx f;

    public adgg(abtx abtxVar, bzqc bzqcVar, cjxd cjxdVar, absg absgVar) {
        this.f = abtxVar;
        this.b = bzqcVar;
        this.c = cjxdVar;
        this.d = absgVar;
        f();
    }

    private final void f() {
        if (this.c.b()) {
            this.b.b(bzqb.LOCATION_HISTORY, new dbsz(this) { // from class: adgf
                private final adgg a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    this.a.a = ((UdcCacheResponse.UdcSetting) obj).b;
                }
            });
        }
    }

    @Override // defpackage.adge
    @dzsi
    public abjt a() {
        return this.e;
    }

    public void b(List<String> list) {
        if (list.isEmpty()) {
            this.e = null;
        } else {
            abtx abtxVar = this.f;
            Activity activity = (Activity) ((dxjd) abtxVar.a).a;
            abtx.a(activity, 1);
            cklf a = abtxVar.b.a();
            abtx.a(a, 2);
            abtx.a(list, 3);
            this.e = new abtw(activity, a, list);
        }
        f();
    }

    public boolean c() {
        return this.e != null && this.a == 2;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.a(this.d == absg.AREA_EXPLORE ? dtxj.cq : dtxr.ah);
    }
}
