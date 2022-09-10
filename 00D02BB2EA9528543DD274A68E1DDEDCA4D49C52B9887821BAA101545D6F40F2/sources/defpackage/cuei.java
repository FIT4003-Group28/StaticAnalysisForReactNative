package defpackage;
/* compiled from: PG */
/* renamed from: cuei  reason: default package */
/* loaded from: classes5.dex */
final class cuei extends ctyu {
    private volatile transient boolean b;
    private volatile transient boolean c;

    public cuei(int i, int i2, dcdc<cuhq> dcdcVar) {
        super(i, i2, dcdcVar);
    }

    @Override // defpackage.cuhi
    public final boolean d() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    dcdc<cuhq> dcdcVar = this.a;
                    int size = dcdcVar.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        boolean equals = dcdcVar.get(i).b().equals(cuhs.UNKNOWN);
                        i++;
                        if (equals) {
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
