package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqm  reason: default package */
/* loaded from: classes6.dex */
public class eaqm extends eaqf implements Serializable, eapu {
    private static final eapu b = new eaql();
    private static final long serialVersionUID = -2110953284060001145L;
    public final eapo a;
    private final int[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqm(long j) {
        this.a = eapo.a();
        int[] j2 = earp.E.j(b, j);
        int[] iArr = new int[8];
        this.c = iArr;
        System.arraycopy(j2, 0, iArr, 4, 4);
    }

    @Override // defpackage.eapu
    public final eapo e() {
        return this.a;
    }

    @Override // defpackage.eapu
    public final int h(int i) {
        return this.c[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqm() {
        eapo j = eaor.j();
        eaok d = eaor.d(null);
        this.a = j;
        this.c = d.j(this, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqm(eapr eaprVar, eapr eaprVar2) {
        eapo j = eaor.j();
        long b2 = eaor.b(eaprVar);
        long b3 = eaor.b(eaprVar2);
        eaok i = eaor.i();
        this.a = j;
        this.c = i.i(this, b2, b3);
    }
}
