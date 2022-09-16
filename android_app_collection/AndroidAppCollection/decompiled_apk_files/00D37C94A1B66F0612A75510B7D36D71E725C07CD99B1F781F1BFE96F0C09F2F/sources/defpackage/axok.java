package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
/* compiled from: PG */
/* renamed from: axok  reason: default package */
/* loaded from: classes2.dex */
public final class axok implements axon {
    private volatile Object a;
    private final Object b = new Object();
    private final boolean c;
    private final View d;

    public axok(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private final Context a(Class cls) {
        Context context = this.d.getContext();
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context == awwc.t(context.getApplicationContext())) {
            awwc.n(false, "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.d.getClass());
            return null;
        }
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0011, B:12:0x001b, B:17:0x0072, B:19:0x0076, B:21:0x00b7, B:20:0x0097, B:13:0x0042, B:22:0x00ba, B:23:0x00cf, B:14:0x0066, B:16:0x0070, B:24:0x00d0), top: B:31:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0011, B:12:0x001b, B:17:0x0072, B:19:0x0076, B:21:0x00b7, B:20:0x0097, B:13:0x0042, B:22:0x00ba, B:23:0x00cf, B:14:0x0066, B:16:0x0070, B:24:0x00d0), top: B:31:0x0007 }] */
    @Override // defpackage.axon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lI() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            if (r0 != 0) goto Ld5
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            java.lang.Object r1 = r7.a     // Catch: java.lang.Throwable -> Ld2
            if (r1 != 0) goto Ld0
            boolean r1 = r7.c     // Catch: java.lang.Throwable -> Ld2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L66
            java.lang.Class<axoh> r1 = defpackage.axoh.class
            android.content.Context r1 = r7.a(r1)     // Catch: java.lang.Throwable -> Ld2
            boolean r4 = r1 instanceof defpackage.axoh     // Catch: java.lang.Throwable -> Ld2
            if (r4 == 0) goto L42
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class<axoh> r5 = defpackage.axoh.class
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld2
            android.view.View r5 = r7.d     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> Ld2
            r3[r2] = r5     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "%s, Only account views can attach to account fragments."
            defpackage.awwc.n(r4, r2, r3)     // Catch: java.lang.Throwable -> Ld2
            axoh r1 = (defpackage.axoh) r1     // Catch: java.lang.Throwable -> Ld2
            dp r2 = r1.a     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r3 = "The fragment has already been destroyed."
            defpackage.awwc.p(r2, r3)     // Catch: java.lang.Throwable -> Ld2
            dp r1 = r1.a     // Catch: java.lang.Throwable -> Ld2
            axon r1 = (defpackage.axon) r1     // Catch: java.lang.Throwable -> Ld2
            goto L72
        L42:
            java.lang.Class<axon> r1 = defpackage.axon.class
            android.content.Context r1 = r7.a(r1)     // Catch: java.lang.Throwable -> Ld2
            boolean r4 = r1 instanceof defpackage.axon     // Catch: java.lang.Throwable -> Ld2
            r4 = r4 ^ r3
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Ld2
            android.view.View r6 = r7.d     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> Ld2
            r5[r2] = r6     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Ld2
            r5[r3] = r1     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r1 = "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context %s"
            defpackage.awwc.n(r4, r1, r5)     // Catch: java.lang.Throwable -> Ld2
            goto Lba
        L66:
            java.lang.Class<axon> r1 = defpackage.axon.class
            android.content.Context r1 = r7.a(r1)     // Catch: java.lang.Throwable -> Ld2
            boolean r4 = r1 instanceof defpackage.axon     // Catch: java.lang.Throwable -> Ld2
            if (r4 == 0) goto Lba
            axon r1 = (defpackage.axon) r1     // Catch: java.lang.Throwable -> Ld2
        L72:
            boolean r2 = r7.c     // Catch: java.lang.Throwable -> Ld2
            if (r2 == 0) goto L97
            java.lang.Class<axoj> r2 = defpackage.axoj.class
            java.lang.Object r1 = defpackage.awwc.u(r1, r2)     // Catch: java.lang.Throwable -> Ld2
            axoj r1 = (defpackage.axoj) r1     // Catch: java.lang.Throwable -> Ld2
            dye r1 = r1.aT()     // Catch: java.lang.Throwable -> Ld2
            android.view.View r2 = r7.d     // Catch: java.lang.Throwable -> Ld2
            r1.b = r2     // Catch: java.lang.Throwable -> Ld2
            android.view.View r2 = r1.b     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class<android.view.View> r3 = android.view.View.class
            defpackage.axzl.n(r2, r3)     // Catch: java.lang.Throwable -> Ld2
            eav r2 = new eav     // Catch: java.lang.Throwable -> Ld2
            dyo r3 = r1.a     // Catch: java.lang.Throwable -> Ld2
            eao r1 = r1.c     // Catch: java.lang.Throwable -> Ld2
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ld2
            goto Lb7
        L97:
            java.lang.Class<axoi> r2 = defpackage.axoi.class
            java.lang.Object r1 = defpackage.awwc.u(r1, r2)     // Catch: java.lang.Throwable -> Ld2
            axoi r1 = (defpackage.axoi) r1     // Catch: java.lang.Throwable -> Ld2
            dyb r1 = r1.kv()     // Catch: java.lang.Throwable -> Ld2
            android.view.View r2 = r7.d     // Catch: java.lang.Throwable -> Ld2
            r1.c = r2     // Catch: java.lang.Throwable -> Ld2
            android.view.View r2 = r1.c     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class<android.view.View> r3 = android.view.View.class
            defpackage.axzl.n(r2, r3)     // Catch: java.lang.Throwable -> Ld2
            eas r2 = new eas     // Catch: java.lang.Throwable -> Ld2
            dyo r3 = r1.a     // Catch: java.lang.Throwable -> Ld2
            dwq r1 = r1.b     // Catch: java.lang.Throwable -> Ld2
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Ld2
        Lb7:
            r7.a = r2     // Catch: java.lang.Throwable -> Ld2
            goto Ld0
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld2
            android.view.View r4 = r7.d     // Catch: java.lang.Throwable -> Ld2
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> Ld2
            r3[r2] = r4     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = "%s, Sting view must be attached to an @Sting Fragment or Activity."
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.Throwable -> Ld2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Ld2
            throw r1     // Catch: java.lang.Throwable -> Ld2
        Ld0:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld2
            goto Ld5
        Ld2:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld2
            throw r1
        Ld5:
            java.lang.Object r0 = r7.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axok.lI():java.lang.Object");
    }
}
