package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: ckby  reason: default package */
/* loaded from: classes.dex */
public final class ckby implements ckcv {
    private final cnko a;

    public ckby(cnko cnkoVar) {
        this.a = cnkoVar;
    }

    @Override // defpackage.ckcv
    public final void a(ckcr ckcrVar) {
        cnko cnkoVar = this.a;
        cnkq cnkqVar = ckcrVar.a;
        dbsk.s(cnkqVar);
        cnkr cnkrVar = cnkoVar.b;
        cnkc cnkcVar = cnkr.a;
        cnxn cnxnVar = cnkrVar.n;
        cnkqVar.b(SystemClock.elapsedRealtime() - cnkoVar.a, cnkr.e);
    }
}
