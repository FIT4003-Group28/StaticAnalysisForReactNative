package defpackage;
/* compiled from: PG */
/* renamed from: awza  reason: default package */
/* loaded from: classes.dex */
public final class awza implements awyw {
    private final dmkz a;
    private final awyx b;

    public awza(dmkz dmkzVar, awyx awyxVar) {
        this.a = dmkzVar;
        this.b = awyxVar;
    }

    @Override // defpackage.awyw
    public final boolean a(dqpe dqpeVar, dmlb dmlbVar) {
        boolean z = false;
        if ((dqpeVar.a & 4) != 0) {
            dmkz dmkzVar = this.a;
            dqpc dqpcVar = dqpeVar.d;
            if (dqpcVar == null) {
                dqpcVar = dqpc.f;
            }
            if (dmkzVar.a(dqpcVar, dmlbVar)) {
                z = true;
            }
        }
        if (this.b.a() && z && (dqpeVar.a & 4) != 0) {
            dqpc dqpcVar2 = dqpeVar.d;
            if (dqpcVar2 == null) {
                dqpcVar2 = dqpc.f;
            }
            dqpcVar2.toString();
        }
        return z;
    }
}
