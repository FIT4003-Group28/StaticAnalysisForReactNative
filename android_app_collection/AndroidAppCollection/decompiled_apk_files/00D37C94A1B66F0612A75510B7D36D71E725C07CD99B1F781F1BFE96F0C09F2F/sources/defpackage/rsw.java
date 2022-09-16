package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: rsw  reason: default package */
/* loaded from: classes4.dex */
public final class rsw extends rsh {
    final /* synthetic */ rsa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsw(qsx qsxVar, rsa rsaVar) {
        super(qsxVar);
        this.a = rsaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return new rsv(status);
    }

    @Override // defpackage.qtt
    protected final /* bridge */ /* synthetic */ void c(qsi qsiVar) {
        ((rst) qsiVar).o(this, this.a.a);
    }
}
