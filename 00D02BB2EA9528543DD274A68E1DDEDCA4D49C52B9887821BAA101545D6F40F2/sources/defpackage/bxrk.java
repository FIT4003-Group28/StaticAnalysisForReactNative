package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bxrk  reason: default package */
/* loaded from: classes4.dex */
public final class bxrk {
    final /* synthetic */ bxrn a;
    private boolean b = false;
    private dcdc<dpte> c = dcdc.e();

    public bxrk(bxrn bxrnVar) {
        this.a = bxrnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(dcdc<dpte> dcdcVar) {
        this.b = true;
        if (!this.c.isEmpty()) {
            dcdcVar = this.a.d.b(this.c);
        }
        this.c = dcdcVar;
        this.a.i.NU(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[Catch: all -> 0x012e, LOOP:0: B:9:0x001d->B:80:0x0119, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:83:0x011f, B:84:0x0126, B:9:0x001d, B:11:0x0023, B:13:0x003d, B:20:0x004f, B:80:0x0119, B:21:0x0055, B:23:0x005a, B:25:0x0061, B:27:0x0065, B:29:0x006c, B:31:0x0076, B:33:0x0080, B:28:0x006a, B:24:0x005f, B:36:0x008c, B:38:0x0091, B:40:0x0098, B:42:0x009c, B:44:0x00a3, B:46:0x00ad, B:48:0x00b7, B:43:0x00a1, B:39:0x0096, B:51:0x00c2, B:53:0x00c7, B:55:0x00ce, B:57:0x00d2, B:59:0x00d9, B:61:0x00e3, B:63:0x00ed, B:65:0x00f7, B:67:0x00fd, B:69:0x0101, B:70:0x0103, B:72:0x0107, B:73:0x0109, B:75:0x010f, B:58:0x00d7, B:54:0x00cc, B:82:0x011e, B:87:0x012a), top: B:95:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(defpackage.dcdc<defpackage.dpte> r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxrk.b(dcdc):void");
    }
}
