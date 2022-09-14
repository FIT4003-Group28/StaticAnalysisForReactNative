package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ambi  reason: default package */
/* loaded from: classes.dex */
final class ambi implements ckcx {
    final /* synthetic */ int a;

    public ambi(int i) {
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
        int i2 = i - 1;
        ddyq ddyqVar2 = ddyq.K;
        if (i != 0) {
            ddyqVar.q = i2;
            ddyqVar.a |= ImageMetadata.LENS_APERTURE;
            return;
        }
        throw null;
    }
}
