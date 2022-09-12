package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgdx  reason: default package */
/* loaded from: classes3.dex */
public final class bgdx implements btzi<dwcw, dwcy> {
    final /* synthetic */ bgdy a;

    public bgdx(bgdy bgdyVar) {
        this.a = bgdyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwcw> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgdy bgdyVar = this.a;
            if (!bgdyVar.d) {
                bgdyVar.d = true;
                this.a.i.a(btzyVar.p);
                this.a.l.a(null, btzyVar.p);
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwcw> btzrVar, dwcy dwcyVar) {
        dwcy dwcyVar2 = dwcyVar;
        synchronized (this.a) {
            bgdy bgdyVar = this.a;
            if (bgdyVar.d) {
                return;
            }
            bgdyVar.d = true;
            this.a.l.a(dwcyVar2, null);
        }
    }
}
