package defpackage;
/* compiled from: PG */
/* renamed from: dcxl  reason: default package */
/* loaded from: classes5.dex */
final class dcxl extends dcxm {
    private final dcyk[] a;

    public dcxl(dcyk[] dcykVarArr) {
        this.a = dcykVarArr;
    }

    @Override // defpackage.dcxm
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.dcxm
    public final dcyk c(int i) {
        return this.a[i];
    }
}
