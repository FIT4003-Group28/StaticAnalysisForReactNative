package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zon  reason: default package */
/* loaded from: classes4.dex */
public final class zon extends aoie {
    public final zod a;
    final /* synthetic */ zou b;
    private final ask h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zon(defpackage.zou r2, int r3, int r4) {
        /*
            r1 = this;
            ask r0 = defpackage.ask.b()
            r1.b = r2
            int r2 = r0.a
            r1.<init>(r2, r3, r4)
            r1.h = r0
            r0.c(r3, r4)
            zod r2 = defpackage.zod.k(r0)
            r1.a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zon.<init>(zou, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            c();
            zou.j(this.h);
            zou.i(this.a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            zep.b(valueOf.length() != 0 ? "Thread was unexpectedly interrupted: ".concat(valueOf) : new String("Thread was unexpectedly interrupted: "));
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.aoie, com.google.mediapipe.framework.TextureFrame
    public final void release() {
        super.release();
        zou zouVar = this.b;
        int i = zou.L;
        if (zouVar.j) {
            this.b.j = false;
            this.b.k();
        }
    }
}
