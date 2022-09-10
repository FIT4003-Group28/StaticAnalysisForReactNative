package defpackage;

import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amma  reason: default package */
/* loaded from: classes.dex */
public final class amma implements ckcx {
    final /* synthetic */ int a;

    public amma(int i) {
        this.a = i;
    }

    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        int i = this.a;
        if (ddyfVar.c) {
            ddyfVar.bF();
            ddyfVar.c = false;
        }
        ddyq ddyqVar = (ddyq) ddyfVar.b;
        ddyq ddyqVar2 = ddyq.K;
        ddyqVar.n = i - 1;
        ddyqVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }
}
