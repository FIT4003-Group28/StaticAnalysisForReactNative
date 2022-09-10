package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: audm  reason: default package */
/* loaded from: classes2.dex */
public final class audm implements cqfd {
    public static final cqrp a = cqrp.d(55.0d);
    public static final cqrp b = cqrp.d(98.0d);
    public static final cqrp c = cqrp.d(107.0d);
    public static final cqrp d = cqrp.d(100.0d);
    public static final cqrp e = cqrp.d(103.0d);
    public boolean f;
    private final cqrp g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int l;

    public audm(int i, audp audpVar) {
        this.l = i;
        boolean z = true;
        this.h = !audpVar.j().a().equals("--");
        this.i = audpVar.s().booleanValue();
        this.j = audpVar.t().booleanValue();
        this.k = audpVar.u().booleanValue();
        this.f = i != 4 ? false : z;
        if (audpVar.p().booleanValue()) {
            this.g = audpVar.k().booleanValue() ? c : e;
        } else {
            this.g = audpVar.k().booleanValue() ? b : d;
        }
    }

    private final synchronized void b(View view) {
        ValueAnimator duration = ValueAnimator.ofInt(view.getMeasuredWidth(), this.g.e(view.getContext())).setDuration(200L);
        duration.addUpdateListener(new audk(view));
        duration.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[Catch: all -> 0x011f, TryCatch #0 {, blocks: (B:4:0x0004, B:9:0x0019, B:21:0x002f, B:29:0x003e, B:32:0x0045, B:24:0x0035, B:36:0x004c, B:38:0x0061, B:42:0x0083, B:45:0x0090, B:47:0x0094, B:48:0x0097, B:52:0x009f, B:54:0x00af, B:55:0x00b2, B:59:0x00c2, B:63:0x00f8, B:37:0x0057, B:15:0x0024), top: B:71:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c A[Catch: all -> 0x011f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0004, B:9:0x0019, B:21:0x002f, B:29:0x003e, B:32:0x0045, B:24:0x0035, B:36:0x004c, B:38:0x0061, B:42:0x0083, B:45:0x0090, B:47:0x0094, B:48:0x0097, B:52:0x009f, B:54:0x00af, B:55:0x00b2, B:59:0x00c2, B:63:0x00f8, B:37:0x0057, B:15:0x0024), top: B:71:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[Catch: all -> 0x011f, TryCatch #0 {, blocks: (B:4:0x0004, B:9:0x0019, B:21:0x002f, B:29:0x003e, B:32:0x0045, B:24:0x0035, B:36:0x004c, B:38:0x0061, B:42:0x0083, B:45:0x0090, B:47:0x0094, B:48:0x0097, B:52:0x009f, B:54:0x00af, B:55:0x00b2, B:59:0x00c2, B:63:0x00f8, B:37:0x0057, B:15:0x0024), top: B:71:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af A[Catch: all -> 0x011f, TryCatch #0 {, blocks: (B:4:0x0004, B:9:0x0019, B:21:0x002f, B:29:0x003e, B:32:0x0045, B:24:0x0035, B:36:0x004c, B:38:0x0061, B:42:0x0083, B:45:0x0090, B:47:0x0094, B:48:0x0097, B:52:0x009f, B:54:0x00af, B:55:0x00b2, B:59:0x00c2, B:63:0x00f8, B:37:0x0057, B:15:0x0024), top: B:71:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void c(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.audm.c(android.view.View):void");
    }

    @Override // defpackage.cqfd
    public final boolean a(View view) {
        if (this.k && !this.f) {
            this.f = true;
            int i = this.l;
            if (i == 3) {
                b(view);
            } else if (i != 4) {
                c(view);
            }
        }
        return true;
    }
}
