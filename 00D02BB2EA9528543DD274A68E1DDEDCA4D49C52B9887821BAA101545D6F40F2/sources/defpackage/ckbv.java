package defpackage;
/* compiled from: PG */
/* renamed from: ckbv  reason: default package */
/* loaded from: classes.dex */
public final class ckbv {
    public final ckcs a;
    private ddyq b;

    public ckbv(ckcs ckcsVar, ddyq ddyqVar, byte[] bArr) {
        this.b = ddyqVar;
        this.a = ckcsVar;
        ckcsVar.a(bArr);
    }

    public final synchronized void a(ckcx ckcxVar) {
        ddyf ca = ddyq.K.ca(this.b);
        ckcxVar.a(ca);
        ddyq bK = ca.bK();
        this.b = bK;
        this.a.a(bK.bS());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ddyq b() {
        return this.b;
    }
}
