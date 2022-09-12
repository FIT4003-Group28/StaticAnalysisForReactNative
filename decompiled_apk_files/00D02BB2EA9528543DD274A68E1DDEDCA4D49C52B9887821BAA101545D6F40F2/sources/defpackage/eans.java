package defpackage;
/* compiled from: PG */
/* renamed from: eans  reason: default package */
/* loaded from: classes6.dex */
public final class eans {
    public final eanz a;
    public final eans b;

    public eans(eanz eanzVar, eans eansVar) {
        this.a = eanzVar;
        this.b = eansVar;
    }

    public final eanz a(int i, int i2, int i3) {
        eanz eanzVar = this.a;
        if (eanzVar.e != i || !eanzVar.b(i2, i3)) {
            for (eans eansVar = this.b; eansVar != null; eansVar = eansVar.b) {
                eanz eanzVar2 = eansVar.a;
                if (eanzVar2.e == i && eanzVar2.b(i2, i3)) {
                    return eanzVar2;
                }
            }
            return null;
        }
        return this.a;
    }
}
