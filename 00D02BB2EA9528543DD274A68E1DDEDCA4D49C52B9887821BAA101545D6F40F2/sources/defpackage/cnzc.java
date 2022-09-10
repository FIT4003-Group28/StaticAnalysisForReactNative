package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnzc  reason: default package */
/* loaded from: classes5.dex */
final class cnzc implements cnom {
    final /* synthetic */ Status a;
    final /* synthetic */ WriteBatchImpl b;

    public cnzc(Status status, WriteBatchImpl writeBatchImpl) {
        this.a = status;
        this.b = writeBatchImpl;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }
}
