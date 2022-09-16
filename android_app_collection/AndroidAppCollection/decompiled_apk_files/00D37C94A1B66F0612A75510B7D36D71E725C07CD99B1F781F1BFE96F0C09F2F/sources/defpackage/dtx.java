package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: dtx  reason: default package */
/* loaded from: classes3.dex */
public final class dtx extends dux {
    private final Activity h;
    private final View i;

    public dtx(dtq dtqVar, aopa aopaVar, int i, View view, Activity activity) {
        super(dtqVar, "+xL1e8QZLSvc5avAdhAJ2dPMY9tJ+E+Pcw9vRCpxSgaAdjULLicuRXOYag/oEXim", "7eQogHMGEguTVuu85xhVlPdHON7voa6e8rHTHq9G1io=", aopaVar, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // defpackage.dux
    protected final void a() {
        if (this.i == null) {
            return;
        }
        boolean booleanValue = ((Boolean) qdb.n.e()).booleanValue();
        Object[] objArr = (Object[]) this.d.invoke(null, this.i, this.h, Boolean.valueOf(booleanValue));
        synchronized (this.g) {
            aopa aopaVar = this.g;
            long longValue = ((Long) objArr[0]).longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.c |= 67108864;
            dnwVar.V = longValue;
            aopa aopaVar2 = this.g;
            long longValue2 = ((Long) objArr[1]).longValue();
            aopaVar2.copyOnWrite();
            dnw dnwVar3 = (dnw) aopaVar2.instance;
            dnwVar3.c |= 134217728;
            dnwVar3.W = longValue2;
            if (booleanValue) {
                aopa aopaVar3 = this.g;
                String str = (String) objArr[2];
                aopaVar3.copyOnWrite();
                dnw dnwVar4 = (dnw) aopaVar3.instance;
                str.getClass();
                dnwVar4.c |= 268435456;
                dnwVar4.X = str;
            }
        }
    }
}
