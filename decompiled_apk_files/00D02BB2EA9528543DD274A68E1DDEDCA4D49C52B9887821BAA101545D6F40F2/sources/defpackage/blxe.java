package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blxe  reason: default package */
/* loaded from: classes3.dex */
public class blxe implements blwq {
    private final Activity a;
    @dzsi
    private blxd b;
    private blzm c = blzm.NONE;
    @dzsi
    private cqfc d;

    public blxe(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.blwq
    public cqkl a() {
        blxd blxdVar = this.b;
        if (blxdVar != null) {
            blxdVar.B();
        }
        return cqkl.a;
    }

    @Override // defpackage.blwq
    @dzsi
    public cjtd b() {
        return cjtd.a(dtxz.G);
    }

    @Override // defpackage.blwq
    @dzsi
    public cqfc c() {
        return this.d;
    }

    public void d(blxd blxdVar) {
        this.b = blxdVar;
    }

    public void e(blzm blzmVar) {
        this.c = blzmVar;
        this.d = blzn.a(this.a, blzmVar);
    }

    public boolean f() {
        return this.c != blzm.NONE;
    }
}
