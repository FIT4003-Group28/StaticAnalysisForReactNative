package defpackage;
/* compiled from: PG */
/* renamed from: cdhj  reason: default package */
/* loaded from: classes4.dex */
public final class cdhj extends cdhf {
    private final aese a;
    private final dvlr b;
    private final btvo c;
    private final cdir d;

    public cdhj(aese aeseVar, dvlr dvlrVar, cdir cdirVar, btvo btvoVar) {
        this.a = aeseVar;
        this.b = dvlrVar;
        this.d = cdirVar;
        this.c = btvoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ea, code lost:
        if (new defpackage.dsrh(r0.a, defpackage.dvyf.b).contains(defpackage.dvye.PHOTO_TAKEN_NOTIFICATION) == false) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5 A[Catch: all -> 0x0204, TimeoutException -> 0x0206, ExecutionException -> 0x0210, InterruptedException -> 0x0212, TryCatch #3 {InterruptedException -> 0x0212, ExecutionException -> 0x0210, TimeoutException -> 0x0206, blocks: (B:3:0x0010, B:4:0x0029, B:6:0x002f, B:8:0x004a, B:13:0x0062, B:9:0x004f, B:11:0x0057, B:12:0x005c, B:14:0x0090, B:18:0x009d, B:22:0x00a9, B:24:0x00b5, B:25:0x00ba, B:27:0x00c0, B:29:0x00cc, B:30:0x00d5, B:32:0x00db, B:33:0x00dd, B:38:0x00ec, B:39:0x00f4, B:42:0x0105, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:50:0x012a, B:52:0x0132, B:53:0x0137, B:55:0x013f, B:57:0x015e, B:58:0x0160, B:62:0x016a, B:66:0x0171, B:70:0x0178, B:83:0x019a, B:87:0x01a9, B:89:0x01b3, B:91:0x01be, B:90:0x01b8, B:86:0x01a5, B:92:0x01c1, B:94:0x01c7, B:96:0x01d1, B:98:0x01d9, B:99:0x01db, B:101:0x01ec, B:74:0x0183, B:78:0x018e, B:102:0x01f2, B:103:0x01f3, B:104:0x01f4, B:17:0x0099), top: B:120:0x0010, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3 A[Catch: all -> 0x0204, TimeoutException -> 0x0206, ExecutionException -> 0x0210, InterruptedException -> 0x0212, TryCatch #3 {InterruptedException -> 0x0212, ExecutionException -> 0x0210, TimeoutException -> 0x0206, blocks: (B:3:0x0010, B:4:0x0029, B:6:0x002f, B:8:0x004a, B:13:0x0062, B:9:0x004f, B:11:0x0057, B:12:0x005c, B:14:0x0090, B:18:0x009d, B:22:0x00a9, B:24:0x00b5, B:25:0x00ba, B:27:0x00c0, B:29:0x00cc, B:30:0x00d5, B:32:0x00db, B:33:0x00dd, B:38:0x00ec, B:39:0x00f4, B:42:0x0105, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:50:0x012a, B:52:0x0132, B:53:0x0137, B:55:0x013f, B:57:0x015e, B:58:0x0160, B:62:0x016a, B:66:0x0171, B:70:0x0178, B:83:0x019a, B:87:0x01a9, B:89:0x01b3, B:91:0x01be, B:90:0x01b8, B:86:0x01a5, B:92:0x01c1, B:94:0x01c7, B:96:0x01d1, B:98:0x01d9, B:99:0x01db, B:101:0x01ec, B:74:0x0183, B:78:0x018e, B:102:0x01f2, B:103:0x01f3, B:104:0x01f4, B:17:0x0099), top: B:120:0x0010, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8 A[Catch: all -> 0x0204, TimeoutException -> 0x0206, ExecutionException -> 0x0210, InterruptedException -> 0x0212, TryCatch #3 {InterruptedException -> 0x0212, ExecutionException -> 0x0210, TimeoutException -> 0x0206, blocks: (B:3:0x0010, B:4:0x0029, B:6:0x002f, B:8:0x004a, B:13:0x0062, B:9:0x004f, B:11:0x0057, B:12:0x005c, B:14:0x0090, B:18:0x009d, B:22:0x00a9, B:24:0x00b5, B:25:0x00ba, B:27:0x00c0, B:29:0x00cc, B:30:0x00d5, B:32:0x00db, B:33:0x00dd, B:38:0x00ec, B:39:0x00f4, B:42:0x0105, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:50:0x012a, B:52:0x0132, B:53:0x0137, B:55:0x013f, B:57:0x015e, B:58:0x0160, B:62:0x016a, B:66:0x0171, B:70:0x0178, B:83:0x019a, B:87:0x01a9, B:89:0x01b3, B:91:0x01be, B:90:0x01b8, B:86:0x01a5, B:92:0x01c1, B:94:0x01c7, B:96:0x01d1, B:98:0x01d9, B:99:0x01db, B:101:0x01ec, B:74:0x0183, B:78:0x018e, B:102:0x01f2, B:103:0x01f3, B:104:0x01f4, B:17:0x0099), top: B:120:0x0010, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c7 A[Catch: all -> 0x0204, TimeoutException -> 0x0206, ExecutionException -> 0x0210, InterruptedException -> 0x0212, TryCatch #3 {InterruptedException -> 0x0212, ExecutionException -> 0x0210, TimeoutException -> 0x0206, blocks: (B:3:0x0010, B:4:0x0029, B:6:0x002f, B:8:0x004a, B:13:0x0062, B:9:0x004f, B:11:0x0057, B:12:0x005c, B:14:0x0090, B:18:0x009d, B:22:0x00a9, B:24:0x00b5, B:25:0x00ba, B:27:0x00c0, B:29:0x00cc, B:30:0x00d5, B:32:0x00db, B:33:0x00dd, B:38:0x00ec, B:39:0x00f4, B:42:0x0105, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:50:0x012a, B:52:0x0132, B:53:0x0137, B:55:0x013f, B:57:0x015e, B:58:0x0160, B:62:0x016a, B:66:0x0171, B:70:0x0178, B:83:0x019a, B:87:0x01a9, B:89:0x01b3, B:91:0x01be, B:90:0x01b8, B:86:0x01a5, B:92:0x01c1, B:94:0x01c7, B:96:0x01d1, B:98:0x01d9, B:99:0x01db, B:101:0x01ec, B:74:0x0183, B:78:0x018e, B:102:0x01f2, B:103:0x01f3, B:104:0x01f4, B:17:0x0099), top: B:120:0x0010, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(defpackage.cdhe r14) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdhj.d(cdhe):void");
    }

    @Override // defpackage.cdhf
    public final void b(cdhe cdheVar) {
        if (!this.b.a) {
            cdheVar.d("Disabled");
            c(cdheVar);
            return;
        }
        d(cdheVar);
    }
}
