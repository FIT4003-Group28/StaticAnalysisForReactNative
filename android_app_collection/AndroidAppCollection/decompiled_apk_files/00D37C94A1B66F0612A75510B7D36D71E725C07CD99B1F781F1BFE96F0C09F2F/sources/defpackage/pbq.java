package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: pbq  reason: default package */
/* loaded from: classes4.dex */
public final class pbq implements pca {
    private final pca a;
    private final pca b = new pbs(null);
    private final pca c;
    private final pca d;
    private pca e;

    public pbq(Context context, String str) {
        this.a = new pbp(str);
        this.c = new pbh(context);
        this.d = new pbk(context);
    }

    @Override // defpackage.pbl
    public final int a(byte[] bArr, int i, int i2) {
        return this.e.a(bArr, i, i2);
    }

    @Override // defpackage.pbl
    public final long b(pbn pbnVar) {
        pce.d(this.e == null);
        String scheme = pbnVar.a.getScheme();
        if (pcx.q(pbnVar.a)) {
            if (pbnVar.a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else {
            this.e = "content".equals(scheme) ? this.d : this.a;
        }
        return this.e.b(pbnVar);
    }

    @Override // defpackage.pbl
    public final void c() {
        pca pcaVar = this.e;
        if (pcaVar != null) {
            try {
                pcaVar.c();
            } finally {
                this.e = null;
            }
        }
    }
}
