package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
/* compiled from: PG */
/* renamed from: mna  reason: default package */
/* loaded from: classes3.dex */
final class mna extends kqs {
    private final ajrp o;

    public mna(Context context, ajmy ajmyVar, int i, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, i, ajxzVar);
        this.o = new ajrp(aafoVar, gemVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    /* renamed from: n */
    public final void oK(ajrs ajrsVar, audn audnVar) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        ajrp ajrpVar = this.o;
        acti actiVar = ajrsVar.a;
        arag aragVar3 = null;
        if ((audnVar.b & 32) != 0) {
            apzgVar = audnVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        if ((audnVar.b & 2) != 0) {
            aragVar = audnVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        k(ajgl.b(aragVar));
        if ((audnVar.b & 128) != 0) {
            aragVar2 = audnVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        d(ajgl.b(aragVar2));
        aueo aueoVar = audnVar.e;
        if (aueoVar == null) {
            aueoVar = aueo.a;
        }
        auep auepVar = aueoVar.c;
        if (auepVar == null) {
            auepVar = auep.a;
        }
        if ((auepVar.b & 1) == 0) {
            if (audnVar.f.size() > 0) {
                g((avhn) audnVar.f.get(0));
            }
        } else {
            aueo aueoVar2 = audnVar.e;
            if (aueoVar2 == null) {
                aueoVar2 = aueo.a;
            }
            auep auepVar2 = aueoVar2.c;
            if (auepVar2 == null) {
                auepVar2 = auep.a;
            }
            avhn avhnVar = auepVar2.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            g(avhnVar);
        }
        if (audnVar.g.size() <= 0) {
            if ((audnVar.b & 16) != 0 && (aragVar3 = audnVar.i) == null) {
                aragVar3 = arag.a;
            }
            Spanned b = ajgl.b(aragVar3);
            j(b, b);
            return;
        }
        i(audnVar.g);
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.o.c();
    }
}
