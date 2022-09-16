package defpackage;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rbg  reason: default package */
/* loaded from: classes4.dex */
public abstract class rbg extends qtt {
    public rbg(qsx qsxVar) {
        super(rbh.b, qsxVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qte a(Status status) {
        return status == null ? Status.c : status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qtt, defpackage.qtu
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        super.n(obj);
    }
}
