package defpackage;
/* compiled from: PG */
/* renamed from: dcxk  reason: default package */
/* loaded from: classes5.dex */
final class dcxk extends dcxm {
    private static final long serialVersionUID = 1;
    private final dcyk a;
    private final dcyk b;

    public dcxk(dcyk dcykVar, dcyk dcykVar2) {
        this.a = dcykVar;
        this.b = dcykVar2;
    }

    @Override // defpackage.dcxm
    public final int b() {
        return 2;
    }

    @Override // defpackage.dcxm
    public final dcyk c(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.b;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a;
    }
}
