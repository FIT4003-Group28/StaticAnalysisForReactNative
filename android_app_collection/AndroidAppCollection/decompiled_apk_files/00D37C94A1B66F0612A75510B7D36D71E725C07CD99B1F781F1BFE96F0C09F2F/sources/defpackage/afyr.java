package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: afyr  reason: default package */
/* loaded from: classes.dex */
public final class afyr implements yqy {
    private final azqb a;
    private final apfr b;
    private final yqy c;

    public afyr(azqb azqbVar, apfr apfrVar, yqy yqyVar) {
        this.a = azqbVar;
        this.b = apfrVar;
        this.c = yqyVar;
    }

    @Override // defpackage.yqy
    public final /* synthetic */ yqw a(ces cesVar, yqx yqxVar, String str) {
        return yhq.b(this, cesVar, yqxVar, str);
    }

    @Override // defpackage.yqy
    public final yqw b(ces cesVar, yqx yqxVar, Executor executor, aabf aabfVar, String str) {
        yqw b = this.c.b(cesVar, yqxVar, executor, aabfVar, str);
        if (this.b.l) {
            afzb afzbVar = (afzb) this.a.get();
            afyq afyqVar = (afyq) afzbVar.a.get();
            afyqVar.getClass();
            ankx ankxVar = (ankx) afzbVar.b.get();
            ankxVar.getClass();
            b.getClass();
            executor.getClass();
            return new afza(afyqVar, ankxVar, b, executor);
        }
        return b;
    }
}
