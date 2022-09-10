package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ybi  reason: default package */
/* loaded from: classes7.dex */
public class ybi implements xzi {
    public final zfd a;
    public boolean b;
    public boolean c;
    private final izx d;
    private final ivc e;
    @dzsi
    private cqkp f;

    public ybi(ddho ddhoVar, zfd zfdVar) {
        ybf ybfVar = new ybf(this);
        this.e = ybfVar;
        this.b = false;
        this.c = false;
        this.a = zfdVar;
        this.d = new ybg(this, cqrt.g(2131231610, ibm.x()), cqrt.l(R.string.SAVE_THIS_ROUTE_OFFLINE), ibm.x(), ybfVar, cjtd.a(ddhoVar));
    }

    @Override // defpackage.xzi
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.xzi
    public izx b() {
        return this.d;
    }

    public void c(cqkp cqkpVar) {
        this.f = cqkpVar;
    }

    public final void d() {
        cqkp cqkpVar = this.f;
        if (cqkpVar != null) {
            cqkx.p(cqkpVar);
        }
    }
}
