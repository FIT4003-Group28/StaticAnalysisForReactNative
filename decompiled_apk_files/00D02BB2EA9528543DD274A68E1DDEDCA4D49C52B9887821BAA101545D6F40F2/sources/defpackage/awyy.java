package defpackage;
/* compiled from: PG */
/* renamed from: awyy  reason: default package */
/* loaded from: classes.dex */
public final class awyy implements awyw {
    private final dmkz a;
    private final awyx b;

    public awyy(dmkz dmkzVar, awyx awyxVar) {
        this.a = dmkzVar;
        this.b = awyxVar;
    }

    @Override // defpackage.awyw
    public final boolean a(dqpe dqpeVar, dmlb dmlbVar) {
        boolean z = true;
        if ((dqpeVar.a & 2) != 0) {
            dmkz dmkzVar = this.a;
            dqpc dqpcVar = dqpeVar.c;
            if (dqpcVar == null) {
                dqpcVar = dqpc.f;
            }
            if (!dmkzVar.a(dqpcVar, dmlbVar)) {
                z = false;
            }
        }
        if (this.b.a() && !z && (dqpeVar.a & 2) != 0) {
            dqpc dqpcVar2 = dqpeVar.c;
            if (dqpcVar2 == null) {
                dqpcVar2 = dqpc.f;
            }
            dqpcVar2.toString();
        }
        return z;
    }
}
