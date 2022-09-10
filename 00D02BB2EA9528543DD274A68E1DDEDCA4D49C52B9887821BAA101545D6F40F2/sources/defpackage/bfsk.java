package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfsk  reason: default package */
/* loaded from: classes3.dex */
public class bfsk implements bfrs {
    private final bvsx a;
    private final cjtd b;
    private final dqxc c;
    private final bfsq d;

    public bfsk(Resources resources, dnob dnobVar, cjtd cjtdVar, bfsq bfsqVar) {
        this.a = new bvsx(resources);
        cjta c = cjtd.c(cjtdVar);
        c.d = dtxr.cz;
        this.b = c.a();
        dqxc dqxcVar = dnobVar.g;
        this.c = dqxcVar == null ? dqxc.c : dqxcVar;
        this.d = bfsqVar;
    }

    @Override // defpackage.bfrs
    public CharSequence a() {
        bvsu c = this.a.c(R.string.HOTEL_OCCUPANCY_TIP);
        bvsu c2 = this.a.c(R.string.HOTEL_OCCUPANCY_TIP_VIEW_PRICES);
        c2.p();
        c.a(c2, Integer.valueOf(this.c.b));
        return c.c();
    }

    @Override // defpackage.bfrs
    public cqkl b() {
        this.d.a(this.c);
        return cqkl.a;
    }

    @Override // defpackage.bfrs
    public cjtd c() {
        return this.b;
    }
}
