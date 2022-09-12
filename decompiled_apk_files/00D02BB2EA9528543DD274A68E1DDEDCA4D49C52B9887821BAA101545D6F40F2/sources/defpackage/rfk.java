package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rfk  reason: default package */
/* loaded from: classes7.dex */
public final class rfk implements rfm {
    final /* synthetic */ rfn a;

    public rfk(rfn rfnVar) {
        this.a = rfnVar;
    }

    @Override // defpackage.rfm
    public final void a(int i) {
        rfn rfnVar = this.a;
        if (rfnVar.v != i) {
            rfnVar.v = i;
            dcdc<reh> dcdcVar = rfnVar.r;
            int size = dcdcVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                reh rehVar = dcdcVar.get(i2);
                rehVar.b(rehVar.v().intValue() == this.a.v);
            }
            this.a.E();
            cqkx.p(this.a);
        }
    }
}
