package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: qua  reason: default package */
/* loaded from: classes4.dex */
public final class qua {
    final /* synthetic */ BasePendingResult a;

    public qua(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        BasePendingResult basePendingResult = this.a;
        ThreadLocal threadLocal = BasePendingResult.e;
        BasePendingResult.m(basePendingResult.h);
        super.finalize();
    }
}
