package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gmm.base.views.core.GmmProgressBar;
import com.google.android.apps.viewer.client.Dimensions;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: yxg  reason: default package */
/* loaded from: classes7.dex */
public final class yxg extends hxf {
    @dzsi
    private cqkf<yyc> ad;
    @dzsi
    private clcl ae;
    @dzsi
    private GmmProgressBar af;
    @dzsi
    private View ag;
    @dzsi
    private yxf ah;
    @dzsi
    private yxn ai;
    public cqkj b;
    public efg c;
    public amfi d;
    public bvrb e;
    @dzsi
    private String f;
    private yyg g;

    private final void aU(@dzsi yxf yxfVar) {
        yxf yxfVar2;
        yxf yxfVar3 = this.ah;
        if (yxfVar3 != null) {
            yxfVar3.b();
        }
        this.ah = yxfVar;
        if (S() || (yxfVar2 = this.ah) == null) {
            return;
        }
        yxfVar2.b();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        hashCode();
        aU(null);
        yxn yxnVar = this.ai;
        if (yxnVar != null) {
            bvrj.UI_THREAD.c();
            clbi<clck> clbiVar = yxnVar.b.d;
            yxh yxhVar = yxnVar.f;
            synchronized (clbiVar.b) {
                clbk.b(clbiVar.b.remove(yxhVar), String.format("Remove inexistant Observer %s.", yxhVar));
            }
            yxm yxmVar = yxnVar.e;
            if (yxmVar != null) {
                yxmVar.b();
            }
        }
        super.Qe();
    }

    public final void aR(boolean z) {
        if (!S()) {
            return;
        }
        if (!z) {
            this.f = null;
        }
        int i = 4;
        this.ae.setVisibility(true != z ? 4 : 0);
        View view = this.ag;
        if (true != z) {
            i = 0;
        }
        view.setVisibility(i);
        this.af.b();
    }

    public final void aS() {
        yyd yydVar = this.g.c().get(this.g.Os().intValue());
        String b = yydVar.b();
        hashCode();
        if (!b.equals(this.f)) {
            if (S()) {
                this.f = b;
                GmmProgressBar gmmProgressBar = this.af;
                gmmProgressBar.a.removeMessages(1);
                gmmProgressBar.a.removeMessages(2);
                if (gmmProgressBar.d.isStarted()) {
                    gmmProgressBar.d.cancel();
                }
                gmmProgressBar.setVisibility(4);
                for (View view : gmmProgressBar.c) {
                    view.setVisibility(4);
                }
                this.af.a();
            }
            yxf yxfVar = new yxf(this);
            aU(yxfVar);
            amfu a = this.d.a(yydVar.b(), String.valueOf(getClass().getName()).concat("#loadMapResource"), yxfVar);
            if (a.a()) {
                aT(a);
            } else if (!a.d()) {
                yxfVar.b();
                aR(false);
            }
        }
    }

    public final void aT(amfu amfuVar) {
        try {
            byte[] bArr = amfuVar.d;
            if (bArr != null) {
                yxn yxnVar = this.ai;
                bvrj.UI_THREAD.c();
                yxm yxmVar = new yxm(yxnVar, bArr);
                yxm yxmVar2 = yxnVar.e;
                if (yxmVar2 != null) {
                    yxmVar2.b();
                }
                yxnVar.e = yxmVar;
                clcb clcbVar = yxnVar.c;
                Bitmap bitmap = clcbVar.e;
                if (bitmap != null) {
                    clcbVar.c.b(bitmap);
                }
                clcbVar.e = null;
                clcbVar.f = null;
                if (clcbVar.d != null) {
                    clcbVar.c();
                } else {
                    boolean z = clcbVar.getChildCount() == 0;
                    String valueOf = String.valueOf(clcbVar.getChildAt(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Has Children with no TileBoard, e.g. ");
                    sb.append(valueOf);
                    clbk.a(z, sb.toString());
                    clbk.a(clcbVar.g.size() == 0, "Has TileViews with no TileBoard.");
                }
                clcb clcbVar2 = yxnVar.c;
                Dimensions dimensions = yxmVar.b;
                claz clazVar = clbu.b;
                clcbVar2.b.set(0, 0, dimensions.a, dimensions.b);
                clcbVar2.b.isEmpty();
                clcbVar2.c = clazVar;
                clcbVar2.k = yxmVar;
                clcbVar2.requestLayout();
                yxnVar.d = true;
                yxnVar.c.e(yxn.a(yxnVar.b.f()));
                aR(true);
                return;
            }
            throw new IOException("resource has null raw byte data.");
        } catch (IOException unused) {
            aR(false);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        super.aj(bundle);
        aS();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        return jib.g(J(), "");
    }

    @Override // defpackage.hxf
    @dzsi
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<yyc> c = this.b.c(new yya(), null);
        this.ad = c;
        View c2 = c.c();
        this.af = (GmmProgressBar) cqkx.e(c2, yya.b, GmmProgressBar.class);
        View d = cqkx.d(c2, yya.c);
        this.ag = cqkx.d(c2, yya.a);
        this.ae = (clcl) cqkx.e(c2, yya.d, clcl.class);
        this.af.setDependentViews(d);
        bvrb bvrbVar = this.e;
        clcl clclVar = this.ae;
        bvrj.UI_THREAD.c();
        yxn yxnVar = new yxn(bvrbVar, clclVar, (clcb) cqkx.e(c2, yya.e, clcb.class));
        clcl clclVar2 = yxnVar.b;
        clclVar2.p = 2;
        clclVar2.o = 1;
        clclVar2.u = true;
        clclVar2.q = true;
        clclVar2.t = 1;
        clclVar2.s = 1;
        clclVar2.r = 1;
        clclVar2.m = 1.0f;
        clclVar2.setMaxZoom(4.0f);
        clbi<clck> clbiVar = yxnVar.b.d;
        yxh yxhVar = yxnVar.f;
        clbk.c(yxhVar, null);
        synchronized (clbiVar.b) {
            clbk.a(clbiVar.b.add(yxhVar), String.format("Observer %s previously registered.", yxhVar));
        }
        this.ai = yxnVar;
        return c2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2 = this.o;
        yyg yygVar = new yyg(H(), (djyo) bvrs.e(bundle2, djyo.class, (dssr) djyo.h.cu(7)), bundle2.getInt("selectedMapIndex"), new yxd(this));
        this.g = yygVar;
        yygVar.Y(new yxe(this));
        q(jib.g(J(), this.g.e()));
        super.l(bundle);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<yyc> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.g);
        efg efgVar = this.c;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.f(false);
        egjVar.ag(null);
        egjVar.e(this);
        egjVar.D(ise.b.e(J()));
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<yyc> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(null);
        super.u();
    }
}
