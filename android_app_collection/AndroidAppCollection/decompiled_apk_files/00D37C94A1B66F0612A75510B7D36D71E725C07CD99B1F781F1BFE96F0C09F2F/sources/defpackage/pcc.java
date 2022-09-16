package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pcc  reason: default package */
/* loaded from: classes4.dex */
public final class pcc implements pbx {
    public volatile Object a;
    private final pbn b;
    private final pca c;
    private final pcb d;
    private volatile boolean e;

    public pcc(String str, pca pcaVar, pcb pcbVar) {
        this.c = pcaVar;
        this.d = pcbVar;
        this.b = new pbn(Uri.parse(str), 1);
    }

    @Override // defpackage.pbx
    public final void i() {
        this.e = true;
    }

    @Override // defpackage.pbx
    public final void k() {
        pbm pbmVar = new pbm(this.c, this.b);
        try {
            pbmVar.a();
            this.a = ((owh) this.d).j(((afln) this.c).a.i().toString(), pbmVar);
        } finally {
            pcx.o(pbmVar);
        }
    }

    @Override // defpackage.pbx
    public final boolean l() {
        return this.e;
    }
}
