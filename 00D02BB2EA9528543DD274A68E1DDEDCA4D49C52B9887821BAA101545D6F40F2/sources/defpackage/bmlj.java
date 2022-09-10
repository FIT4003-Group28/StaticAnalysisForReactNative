package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmlj  reason: default package */
/* loaded from: classes3.dex */
final class bmlj extends gt {
    private dcdc<begd> a;

    public bmlj(gn gnVar) {
        super(gnVar);
        this.a = dcdc.e();
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.a.size();
    }

    @Override // defpackage.bas
    public final int OX(Object obj) {
        return !this.a.contains(obj) ? -2 : -1;
    }

    @Override // defpackage.gt
    public final fd a(int i) {
        return this.a.get(i).Ny();
    }

    @Override // defpackage.gt
    public final long i(int i) {
        return this.a.get(i).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(List<begd> list) {
        if (t(list)) {
            this.a = dcdc.r(list);
            Pa();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(List<begd> list) {
        return !list.equals(this.a);
    }
}
