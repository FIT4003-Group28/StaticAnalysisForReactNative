package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awpy  reason: default package */
/* loaded from: classes3.dex */
public final class awpy {
    private static final dmlm a;
    private final Application b;
    private final dxio<akvz> c;
    private final awtg d;

    static {
        dmll bZ = dmlm.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlm dmlmVar = (dmlm) bZ.b;
        int i = dmlmVar.a | 8;
        dmlmVar.a = i;
        dmlmVar.e = 27547;
        dmlmVar.a = i | 16;
        dmlmVar.f = 27547;
        a = bZ.bK();
    }

    public awpy(Application application, dxio<akvz> dxioVar, awtg awtgVar) {
        this.b = application;
        this.c = dxioVar;
        this.d = awtgVar;
    }

    public final synchronized dmpn a(awtn awtnVar, long j) {
        dmpk g;
        dmqc dmqcVar;
        akuh a2;
        g = this.c.a().a(dmqc.LEGEND_STYLE_SAVED_PARKING_LABEL_LAYOUT).g();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        awtg awtgVar = this.d;
        boolean p = awtnVar.p();
        if (awtg.a()) {
            dmqcVar = p ? awtgVar.c : awtgVar.d;
        } else {
            dmqcVar = p ? awtgVar.a : awtgVar.b;
        }
        if (dmqcVar != null) {
            a2 = awtgVar.e.a().a(dmqcVar);
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = true != p ? "saved" : "detected";
            bvoo.f(new RuntimeException(String.format("No parking icons configured for %s icon parking style ", objArr)));
            a2 = awtgVar.e.a().a(dmqc.LEGEND_STYLE_UNDEFINED);
        }
        dmpeVar.b(a2.e());
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar = (dmpn) g.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmpn dmpnVar2 = dmpn.r;
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
        dmpc e = this.c.a().a(dmqc.LEGEND_STYLE_SAVED_PARKING_TEXT_TITLE).e();
        String string = this.b.getString(R.string.PARKING_LOCATION_LABEL);
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        string.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = string;
        dmpeVar2.b(e);
        if (awtnVar.o()) {
            dmpc e2 = this.c.a().a(dmqc.LEGEND_STYLE_SAVED_PARKING_TEXT_SUBTITLE).e();
            String a3 = awtj.a(this.b, awtnVar.b(), j);
            if (e2.c) {
                e2.bF();
                e2.c = false;
            }
            dmpd dmpdVar3 = (dmpd) e2.b;
            a3.getClass();
            int i = dmpdVar3.a | 1;
            dmpdVar3.a = i;
            dmpdVar3.b = a3;
            dmpdVar3.a = i | 16;
            dmpdVar3.f = true;
            dmpeVar2.b(e2);
        }
        dmph dmphVar2 = (dmph) dmpeVar2.bK();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar3 = (dmpn) g.b;
        dmphVar2.getClass();
        dmpnVar3.c = dmphVar2;
        dmpnVar3.a |= 2;
        dmls a4 = akxh.a(akra.f(awtnVar.c()));
        dmlp bZ = dmlq.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a4.getClass();
        dmlqVar.b = a4;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.CENTER;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        dmlq bK = bZ.bK();
        if (g.c) {
            g.bF();
            g.c = false;
        }
        dmpn dmpnVar4 = (dmpn) g.b;
        bK.getClass();
        dmpnVar4.d = bK;
        int i2 = dmpnVar4.a | 4;
        dmpnVar4.a = i2;
        int i3 = i2 | 32;
        dmpnVar4.a = i3;
        dmpnVar4.g = 1;
        dmpnVar4.a = i3 | 128;
        dmpnVar4.i = 80;
        g.k(dmnl.G, a);
        return (dmpn) g.bK();
    }
}
