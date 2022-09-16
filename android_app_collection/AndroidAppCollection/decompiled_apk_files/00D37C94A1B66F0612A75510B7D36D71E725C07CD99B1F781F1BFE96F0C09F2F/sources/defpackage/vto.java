package defpackage;

import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: vto  reason: default package */
/* loaded from: classes4.dex */
public final class vto extends ouo {
    final /* synthetic */ vtq a;

    public vto(vtq vtqVar) {
        this.a = vtqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final long b() {
        return -3L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final long c() {
        return -2L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final MediaFormat d(int i) {
        return MediaFormat.i(null, "application/octet-stream", -2L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void e(long j, long j2) {
        vtq vtqVar = this.a;
        vtqVar.b = j;
        if (vtqVar.c != null) {
            if (this.h == 3 && j >= vtqVar.d() * 1000) {
                this.a.c.l(false);
            }
            if (!this.a.c.o()) {
                return;
            }
            vtq vtqVar2 = this.a;
            vtqVar2.post(vtqVar2.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void g(long j) {
        vtq vtqVar = this.a;
        vtqVar.b = j;
        vtqVar.post(vtqVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean h() {
        vtq vtqVar = this.a;
        return vtqVar.b >= vtqVar.d() * 1000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean i() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final int pN() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void pO(int i, long j, boolean z) {
        this.a.b = j;
    }
}
