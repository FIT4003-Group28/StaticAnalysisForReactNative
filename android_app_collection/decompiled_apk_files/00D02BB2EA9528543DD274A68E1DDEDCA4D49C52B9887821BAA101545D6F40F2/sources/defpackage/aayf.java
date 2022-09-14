package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aayf  reason: default package */
/* loaded from: classes2.dex */
public class aayf implements aawy {
    public final Activity a;
    public final aaht b;
    public final dxio<afha> c;
    public long i;
    public long j;
    private final aahf k;
    private final aahs l;
    private final aahu m;
    private final aaxx n;
    private boolean o;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    private boolean p = false;
    @dzsi
    private aaww r = null;
    @dzsi
    private aaja s = null;
    private dccx<jbi> q = dcdc.F();

    public aayf(Activity activity, aahf aahfVar, aahs aahsVar, aaht aahtVar, aahu aahuVar, dxio<afha> dxioVar, aaxx aaxxVar) {
        this.a = activity;
        this.k = aahfVar;
        this.l = aahsVar;
        this.b = aahtVar;
        this.m = aahuVar;
        this.c = dxioVar;
        this.n = aaxxVar;
    }

    private static void h(final aahd aahdVar, cqtd cqtdVar, String str, boolean z, @dzsi String str2, ddho ddhoVar, dccx<aajb> dccxVar) {
        if (aahdVar.a().booleanValue()) {
            String str3 = true != z ? str : "";
            cjta b = cjtd.b();
            b.d = ddhoVar;
            b.g(str2);
            dccxVar.g(new aajc(cqtdVar, str3, str, false, b.a(), new Runnable(aahdVar) { // from class: aayb
                private final aahd a;

                {
                    this.a = aahdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, aahdVar.c()));
        }
    }

    @Override // defpackage.aawy
    public String a() {
        if (this.p) {
            String str = this.d;
            dbsk.s(str);
            return str;
        }
        return "";
    }

    @Override // defpackage.aawy
    public dcdc<jbi> b() {
        return this.q.f();
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.aawy
    @dzsi
    public aaja d() {
        return this.s;
    }

    @Override // defpackage.aawy
    public Boolean e() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.aawy
    @dzsi
    public aaww f() {
        return this.r;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[LOOP:0: B:21:0x004e->B:23:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(defpackage.diwb r12) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aayf.g(diwb):void");
    }
}
