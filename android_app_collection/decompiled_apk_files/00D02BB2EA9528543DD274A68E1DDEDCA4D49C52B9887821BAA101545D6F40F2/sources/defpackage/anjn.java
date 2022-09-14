package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: anjn  reason: default package */
/* loaded from: classes2.dex */
public final class anjn extends gen {
    public bvjj a;
    public btvo b;
    public gga c;

    public static String g(dvjz dvjzVar) {
        long g = eaow.e(dvjzVar.a).g();
        String str = true != dvjzVar.b ? "disabled" : "enabled";
        StringBuilder sb = new StringBuilder(str.length() + 57);
        sb.append("Scan for ");
        sb.append(g);
        sb.append(" seconds, even distribution ");
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        dvka dvkaVar = this.b.getPersonalContextParameters().a;
        if (dvkaVar == null) {
            dvkaVar = dvka.i;
        }
        dsrj<dvjz> dsrjVar = dvkaVar.h;
        qx qxVar = new qx(this.c);
        qxVar.j("Choose a wifi scan experiment");
        dccx F = dcdc.F();
        for (dvjz dvjzVar : dsrjVar) {
            F.g(g(dvjzVar));
        }
        anjm anjmVar = new anjm(this, dsrjVar);
        qt qtVar = qxVar.a;
        qtVar.n = (CharSequence[]) dcft.e(F.f(), CharSequence.class);
        qtVar.p = anjmVar;
        return qxVar.b();
    }
}
