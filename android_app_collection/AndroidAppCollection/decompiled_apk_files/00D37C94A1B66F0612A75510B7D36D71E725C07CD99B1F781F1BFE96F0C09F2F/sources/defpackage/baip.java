package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: baip  reason: default package */
/* loaded from: classes2.dex */
public class baip extends bail implements Serializable, baih {
    private static final baih a = new baio();
    private static final long serialVersionUID = -2110953284060001145L;
    private final baie b;
    private final int[] c;

    /* JADX INFO: Access modifiers changed from: protected */
    public baip(long j) {
        this.b = baie.d();
        int[] M = bajl.n.M(a, j);
        int[] iArr = new int[8];
        this.c = iArr;
        System.arraycopy(M, 0, iArr, 4, 4);
    }

    @Override // defpackage.baih
    public final int b(int i) {
        return this.c[i];
    }

    @Override // defpackage.baih
    public final baie e() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public baip() {
        baie g = bahq.g();
        bahl d = bahq.d(null);
        this.b = g;
        this.c = d.M(this, 0L);
    }
}
