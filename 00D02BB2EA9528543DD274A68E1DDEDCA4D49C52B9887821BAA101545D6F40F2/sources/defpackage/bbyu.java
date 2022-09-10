package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbyu  reason: default package */
/* loaded from: classes3.dex */
public final class bbyu implements bbvx {
    public int a = 0;
    public int b = 0;
    @dzsi
    public akqq c = null;
    final /* synthetic */ long d;
    final /* synthetic */ bbyy e;

    public bbyu(bbyy bbyyVar, long j) {
        this.e = bbyyVar;
        this.d = j;
    }

    @Override // defpackage.bbvx
    public final void a(Uri uri) {
        int i = bbyy.r;
        this.e.K(false);
        this.e.y();
        bbtj A = this.e.A(uri, this.a, this.b, this.d, this.c, dddn.GMM_LIVE_CAMERA);
        if (!this.e.u().booleanValue() || A == null) {
            return;
        }
        this.e.G(A);
    }
}
