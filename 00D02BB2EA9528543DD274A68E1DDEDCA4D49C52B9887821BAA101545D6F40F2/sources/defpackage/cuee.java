package defpackage;
/* compiled from: PG */
/* renamed from: cuee  reason: default package */
/* loaded from: classes5.dex */
final class cuee extends ctyq {
    private volatile transient boolean b;
    private volatile transient boolean c;

    public cuee(dcdc<cuhg> dcdcVar) {
        super(dcdcVar);
    }

    @Override // defpackage.cuhv
    public final boolean b() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    dcdc<cuhg> dcdcVar = this.a;
                    int size = dcdcVar.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        boolean f = dcdcVar.get(i).f();
                        i++;
                        if (f) {
                            z = true;
                            break;
                        }
                    }
                    this.b = z;
                    this.c = true;
                }
            }
        }
        return this.b;
    }
}
