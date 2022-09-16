package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: acdo  reason: default package */
/* loaded from: classes2.dex */
final class acdo extends ckqk {
    final /* synthetic */ acdt a;

    public acdo(acdt acdtVar) {
        this.a = acdtVar;
    }

    @Override // defpackage.ckqk
    public final void a(Bitmap bitmap) {
        acdt acdtVar = this.a;
        acdv acdvVar = acdtVar.a;
        aced acedVar = acdtVar.b;
        int i = acdtVar.c;
        synchronized (acdvVar.h) {
            if (!acdvVar.i.containsKey(acedVar)) {
                return;
            }
            acdk acdkVar = acdvVar.i.get(acedVar);
            if (acdkVar != null) {
                acdv.d(acdkVar, acdvVar.a.a(), acdvVar.b.a());
            }
            cjql d = acdvVar.f.g().d(acdvVar.d);
            acdq acdqVar = acdvVar.g;
            acdj acdjVar = new acdj(acedVar, d);
            akty a = acdvVar.a.a();
            ArrayList a2 = dchl.a();
            aced acedVar2 = acdjVar.a;
            akuh d2 = acdqVar.c.a().d(bitmap);
            a2.add(d2);
            dmpe dmpeVar = (dmpe) dmph.f.bZ();
            dmpeVar.b(d2.e());
            dmph dmphVar = (dmph) dmpeVar.bK();
            dmpk dmpkVar = (dmpk) dmpn.r.bZ();
            dmlp bZ = dmlq.e.bZ();
            dmlo dmloVar = dmlo.CENTER;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar = (dmlq) bZ.b;
            dmlqVar.c = dmloVar.j;
            dmlqVar.a |= 2;
            dmls a3 = akxh.a(acedVar2.a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmlq dmlqVar2 = (dmlq) bZ.b;
            a3.getClass();
            dmlqVar2.b = a3;
            dmlqVar2.a |= 1;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar = (dmpn) dmpkVar.b;
            dmlq bK = bZ.bK();
            bK.getClass();
            dmpnVar.d = bK;
            dmpnVar.a |= 4;
            int i2 = Integer.MAX_VALUE - i;
            if (dmpkVar.c) {
                dmpkVar.bF();
                dmpkVar.c = false;
            }
            dmpn dmpnVar2 = (dmpn) dmpkVar.b;
            int i3 = dmpnVar2.a | 64;
            dmpnVar2.a = i3;
            dmpnVar2.h = i2;
            dmphVar.getClass();
            dmpnVar2.b = dmphVar;
            int i4 = i3 | 1;
            dmpnVar2.a = i4;
            dmpnVar2.a = i4 | 32;
            dmpnVar2.g = 19;
            akuq j = akxf.j(dmpkVar);
            if (j.c) {
                j.bF();
                j.c = false;
            }
            akus akusVar = (akus) j.b;
            akus akusVar2 = akus.o;
            akusVar.b = 18;
            akusVar.c = true;
            dmpkVar.k(akvj.a, j.bK());
            aktd b = a.b((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
            b.Pt(new acdn(acdqVar, acdjVar));
            acdi acdiVar = new acdi(dcdc.r(a2), b, i);
            acdvVar.a.a().f(acdiVar.a);
            acdvVar.i.put(acedVar, acdiVar);
        }
    }
}
