package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: quc  reason: default package */
/* loaded from: classes4.dex */
final class quc implements qsz {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ que b;

    public quc(que queVar, BasePendingResult basePendingResult) {
        this.b = queVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.qsz
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
