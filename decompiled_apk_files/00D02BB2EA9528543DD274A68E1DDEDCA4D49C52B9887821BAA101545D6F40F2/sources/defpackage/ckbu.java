package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: ckbu  reason: default package */
/* loaded from: classes.dex */
final class ckbu {
    private final dzsj<cnjz> b;
    private final ddyq c;
    private final byte[] d;
    private final Map<ckgy, ckbv> a = dcjz.k(ckgy.class);
    private final String e = "GMM_COUNTERS";

    public ckbu(dzsj<cnjz> dzsjVar, ddyq ddyqVar, byte[] bArr) {
        this.b = dzsjVar;
        this.c = ddyqVar;
        this.d = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ckbv a(ckgy ckgyVar) {
        ckbv ckbvVar = this.a.get(ckgyVar);
        if (ckbvVar == null) {
            ckbv ckbvVar2 = new ckbv(new ckcs(new cnkr(this.b.a(), this.e, Integer.MAX_VALUE)), this.c, this.d);
            this.a.put(ckgyVar, ckbvVar2);
            return ckbvVar2;
        }
        return ckbvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dcdn<ckgy, ckbv> b() {
        return dcdn.r(this.a);
    }
}
