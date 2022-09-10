package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: avce  reason: default package */
/* loaded from: classes2.dex */
public final class avce implements avca {
    private static final dcqe b = dcqe.c("avce");
    public final avby a;
    private final cvin c;
    private final awfh d;
    private final crzm<avzg> e;
    private final File f;
    private final File g;
    private final avze h;
    private final dxio<avrw> i;
    private final avcc j;

    public avce(cvin cvinVar, avpn avpnVar, awfh awfhVar, crzm<avzg> crzmVar, dxio<avrw> dxioVar, avby avbyVar, avze avzeVar) {
        avcc avccVar = new avcc(this);
        this.j = avccVar;
        this.c = cvinVar;
        this.d = awfhVar;
        this.e = crzmVar;
        this.i = dxioVar;
        this.a = avbyVar;
        this.h = avzeVar;
        this.f = avpnVar.h(avzeVar);
        this.g = avpnVar.i(avzeVar);
        cvinVar.m(avccVar);
    }

    static String c(byte[] bArr) {
        return ddae.f.i(dczd.a.c(bArr).b());
    }

    @Override // defpackage.avca
    public final void a(String str) {
        dbsk.l(!str.isEmpty());
        this.c.e(this.f, c(str.getBytes()));
    }

    @Override // defpackage.avca
    public final void b(String str, int i) {
        cvid cvidVar;
        boolean z = true;
        dbsk.l(!str.isEmpty());
        if (this.i.a().a()) {
            bvoo.h("Tried to downloadOneFile while in Incognito mode!", new Object[0]);
            return;
        }
        if (i != 2 && (i != 1 || !this.d.f())) {
            z = false;
        }
        String c = c(str.getBytes());
        File file = new File(this.f, c);
        File file2 = new File(this.g, c);
        avcd avcdVar = new avcd(this, str, file2);
        avak avakVar = new avak(file, file2, new avcb(this, str));
        avzg l = this.e.l();
        if (!dbsd.a(this.h, avze.a) && l != null && btlu.q(l.a().a()).o()) {
            this.d.b();
        }
        cvie cvieVar = new cvie(this.c, str, this.f, c, avcdVar, avakVar);
        cvieVar.j = null;
        if (z) {
            cvidVar = cvid.WIFI_ONLY;
        } else {
            cvidVar = cvid.WIFI_OR_CELLULAR;
        }
        cvieVar.f(cvidVar);
        cvieVar.d();
    }
}
