package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgdu  reason: default package */
/* loaded from: classes3.dex */
public final class bgdu implements btzi<dwcw, dwcy> {
    final /* synthetic */ bgdy a;

    public bgdu(bgdy bgdyVar) {
        this.a = bgdyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwcw> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgdy bgdyVar = this.a;
            if (!bgdyVar.d) {
                bgdyVar.f = btzyVar;
                if (bgdyVar.g != null || bgdyVar.h != null) {
                    bgdyVar.c();
                }
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
            bgdyVar.e = dwcyVar2;
            bgdyVar.c();
        }
    }
}
