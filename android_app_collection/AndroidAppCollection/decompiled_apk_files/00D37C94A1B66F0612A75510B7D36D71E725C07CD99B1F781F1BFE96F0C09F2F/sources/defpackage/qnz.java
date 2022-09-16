package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qnz  reason: default package */
/* loaded from: classes4.dex */
public final class qnz extends BasePendingResult {
    public qnz() {
        super((qsx) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final qoe b(Status status) {
        return new qoc(status, 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return b(status);
    }
}
