package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: btug  reason: default package */
/* loaded from: classes4.dex */
final class btug implements ckcx {
    final /* synthetic */ btuh a;

    public btug(btuh btuhVar) {
        this.a = btuhVar;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        boolean z = this.a.a;
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        ddyq ddyqVar2 = ddyq.K;
        ddyqVar.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        ddyqVar.I = z;
    }
}
