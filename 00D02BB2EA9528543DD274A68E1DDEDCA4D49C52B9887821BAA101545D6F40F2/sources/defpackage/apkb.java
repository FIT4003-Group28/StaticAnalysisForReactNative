package defpackage;
/* compiled from: PG */
/* renamed from: apkb  reason: default package */
/* loaded from: classes2.dex */
public final class apkb implements bbb {
    private final dcdc<bbb> a;

    public apkb(dcdc<bbb> dcdcVar) {
        this.a = dcdcVar;
    }

    public static apkb d(bbb... bbbVarArr) {
        return new apkb(dcdc.t(bbbVarArr));
    }

    @Override // defpackage.bbb
    public final void a(int i, float f, int i2) {
        dcdc<bbb> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            dcdcVar.get(i3).a(i, f, i2);
        }
    }

    @Override // defpackage.bbb
    public final void b(int i) {
        dcdc<bbb> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dcdcVar.get(i2).b(i);
        }
    }

    @Override // defpackage.bbb
    public final void c(int i) {
        dcdc<bbb> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            dcdcVar.get(i2).c(i);
        }
    }
}
