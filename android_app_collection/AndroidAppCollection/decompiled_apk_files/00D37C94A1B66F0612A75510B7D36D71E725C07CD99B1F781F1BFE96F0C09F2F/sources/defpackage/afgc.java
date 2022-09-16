package defpackage;

import android.os.Handler;
/* compiled from: PG */
/* renamed from: afgc  reason: default package */
/* loaded from: classes.dex */
public class afgc extends ovj {
    private final owy d;

    public afgc(ovk ovkVar, afga afgaVar, int i, Handler handler, ovi oviVar, int i2, int i3, owy owyVar) {
        super(ovkVar, afgaVar, i, handler, oviVar, i2, i3);
        this.d = owyVar;
    }

    @Override // defpackage.ovj, defpackage.ouh
    public int b(int i, long j, oue oueVar, oug ougVar) {
        owy owyVar;
        int b = super.b(i, j, oueVar, ougVar);
        if (b != -4 || (owyVar = this.d) == null) {
            return b;
        }
        owyVar.d(oueVar.b);
        return -4;
    }
}
