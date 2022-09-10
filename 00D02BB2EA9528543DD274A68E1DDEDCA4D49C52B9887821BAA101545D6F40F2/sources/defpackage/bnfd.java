package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnfd  reason: default package */
/* loaded from: classes3.dex */
public final class bnfd implements bnej {
    private final String a;
    private final dnpq b;
    private final dnpq c;
    private final boolean d;
    private final View.OnClickListener e;
    private final Activity f;
    private final dxio<beqb> g;
    private final dxio<afha> h;
    private final btvo i;

    public bnfd(Activity activity, dxio<beqb> dxioVar, dxio<afha> dxioVar2, btvo btvoVar, ilo iloVar) {
        dnpq dnpqVar;
        this.f = activity;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = btvoVar;
        this.a = iloVar.n();
        dvxh bf = iloVar.bf();
        dnpq dnpqVar2 = null;
        if ((bf.a & 8388608) != 0) {
            dnpqVar = bf.u;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        this.b = dnpqVar;
        dvxh bf2 = iloVar.bf();
        if ((bf2.a & 4194304) != 0 && (dnpqVar2 = bf2.t) == null) {
            dnpqVar2 = dnpq.g;
        }
        this.c = dnpqVar2;
        dvyw h = iloVar.h();
        dzvx.b(h, "placemark.tactilePlace");
        dghy dghyVar = h.f;
        this.d = ((dghyVar == null ? dghy.e : dghyVar).a & 32) != 0;
        this.e = new bnfc(this);
        dzvx.b(cjtd.b, "Ue3LoggingCommonParams.EMPTY");
    }

    @Override // defpackage.bnej
    public String a() {
        return this.a;
    }

    @Override // defpackage.bnej
    public boolean b() {
        return this.d;
    }

    @Override // defpackage.bnej
    public View.OnClickListener c() {
        return this.e;
    }
}
