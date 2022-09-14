package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgdw  reason: default package */
/* loaded from: classes3.dex */
public final class bgdw implements btzi<dwcw, dwcy> {
    final /* synthetic */ bgdy a;

    public bgdw(bgdy bgdyVar) {
        this.a = bgdyVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwcw> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgdy bgdyVar = this.a;
            if (!bgdyVar.d) {
                bgdyVar.h = btzyVar;
                if (bgdyVar.e != null || bgdyVar.f != null) {
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
            bgdyVar.g = dwcyVar2;
            if (bgdyVar.e == null && bgdyVar.f == null) {
                if (!bgdy.d(bgdyVar.g)) {
                    bgdy bgdyVar2 = this.a;
                    long max = Math.max(bgdyVar2.c - bgdyVar2.a.e(), 0L);
                    this.a.k = bvpk.a(new bgdv(this));
                    bgdy bgdyVar3 = this.a;
                    bvrb bvrbVar = bgdyVar3.b;
                    bvpk bvpkVar = bgdyVar3.k;
                    dbsk.s(bvpkVar);
                    bvrbVar.a(bvpkVar, this.a.j, max);
                }
                return;
            }
            bgdyVar.c();
        }
    }
}
