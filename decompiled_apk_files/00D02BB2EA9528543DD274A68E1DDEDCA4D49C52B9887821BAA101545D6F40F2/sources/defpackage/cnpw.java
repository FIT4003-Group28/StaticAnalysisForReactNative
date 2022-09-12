package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: cnpw  reason: default package */
/* loaded from: classes.dex */
final class cnpw implements cnog {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ cnpy b;

    public cnpw(cnpy cnpyVar, BasePendingResult basePendingResult) {
        this.b = cnpyVar;
        this.a = basePendingResult;
    }

    @Override // defpackage.cnog
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
