package c.e.a.b.d.g;

import android.content.Context;
import android.os.Bundle;
import c.e.a.b.d.g.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k extends h.a {

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4245f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4246g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Context f4247h;
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ h j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, String str, String str2, Context context, Bundle bundle) {
        super(hVar);
        this.j = hVar;
        this.f4245f = str;
        this.f4246g = str2;
        this.f4247h = context;
        this.i = bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r4 < r3) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054 A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:29:0x0081), top: B:34:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x009e, TryCatch #0 {Exception -> 0x009e, blocks: (B:3:0x0002, B:5:0x0019, B:7:0x002a, B:13:0x003f, B:15:0x0054, B:17:0x0060, B:19:0x006e, B:29:0x0081), top: B:34:0x0002 }] */
    @Override // c.e.a.b.d.g.h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            c.e.a.b.d.g.h r2 = r14.j     // Catch: java.lang.Exception -> L9e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L9e
            r3.<init>()     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h.a(r2, r3)     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h r2 = r14.j     // Catch: java.lang.Exception -> L9e
            java.lang.String r3 = r14.f4245f     // Catch: java.lang.Exception -> L9e
            java.lang.String r4 = r14.f4246g     // Catch: java.lang.Exception -> L9e
            boolean r2 = c.e.a.b.d.g.h.a(r2, r3, r4)     // Catch: java.lang.Exception -> L9e
            r3 = 0
            if (r2 == 0) goto L27
            java.lang.String r3 = r14.f4246g     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = r14.f4245f     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h r4 = r14.j     // Catch: java.lang.Exception -> L9e
            java.lang.String r4 = c.e.a.b.d.g.h.b(r4)     // Catch: java.lang.Exception -> L9e
            r10 = r2
            r11 = r3
            r9 = r4
            goto L2a
        L27:
            r9 = r3
            r10 = r9
            r11 = r10
        L2a:
            android.content.Context r2 = r14.f4247h     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h.b(r2)     // Catch: java.lang.Exception -> L9e
            java.lang.Boolean r2 = c.e.a.b.d.g.h.h()     // Catch: java.lang.Exception -> L9e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L9e
            if (r2 != 0) goto L3e
            if (r10 == 0) goto L3c
            goto L3e
        L3c:
            r2 = 0
            goto L3f
        L3e:
            r2 = 1
        L3f:
            c.e.a.b.d.g.h r3 = r14.j     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h r4 = r14.j     // Catch: java.lang.Exception -> L9e
            android.content.Context r5 = r14.f4247h     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.md r4 = r4.a(r5, r2)     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h.a(r3, r4)     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h r3 = r14.j     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.md r3 = c.e.a.b.d.g.h.c(r3)     // Catch: java.lang.Exception -> L9e
            if (r3 != 0) goto L60
            c.e.a.b.d.g.h r2 = r14.j     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = c.e.a.b.d.g.h.b(r2)     // Catch: java.lang.Exception -> L9e
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch: java.lang.Exception -> L9e
            return
        L60:
            android.content.Context r3 = r14.f4247h     // Catch: java.lang.Exception -> L9e
            int r3 = c.e.a.b.d.g.h.c(r3)     // Catch: java.lang.Exception -> L9e
            android.content.Context r4 = r14.f4247h     // Catch: java.lang.Exception -> L9e
            int r4 = c.e.a.b.d.g.h.d(r4)     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L79
            int r2 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> L9e
            if (r4 >= r3) goto L76
        L74:
            r3 = 1
            goto L77
        L76:
            r3 = 0
        L77:
            r8 = r3
            goto L81
        L79:
            if (r3 <= 0) goto L7d
            r2 = r3
            goto L7e
        L7d:
            r2 = r4
        L7e:
            if (r3 <= 0) goto L76
            goto L74
        L81:
            c.e.a.b.d.g.f r13 = new c.e.a.b.d.g.f     // Catch: java.lang.Exception -> L9e
            r4 = 29000(0x7148, double:1.4328E-319)
            long r6 = (long) r2     // Catch: java.lang.Exception -> L9e
            android.os.Bundle r12 = r14.i     // Catch: java.lang.Exception -> L9e
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.h r2 = r14.j     // Catch: java.lang.Exception -> L9e
            c.e.a.b.d.g.md r2 = c.e.a.b.d.g.h.c(r2)     // Catch: java.lang.Exception -> L9e
            android.content.Context r3 = r14.f4247h     // Catch: java.lang.Exception -> L9e
            c.e.a.b.c.a r3 = c.e.a.b.c.b.a(r3)     // Catch: java.lang.Exception -> L9e
            long r4 = r14.f4181b     // Catch: java.lang.Exception -> L9e
            r2.initialize(r3, r13, r4)     // Catch: java.lang.Exception -> L9e
            return
        L9e:
            r2 = move-exception
            c.e.a.b.d.g.h r3 = r14.j
            c.e.a.b.d.g.h.a(r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.k.a():void");
    }
}
