package defpackage;

import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pqs  reason: default package */
/* loaded from: classes4.dex */
public final class pqs implements axv, ppp {
    public final ayf b;
    public long c;
    public bab f;
    public boolean g;
    final /* synthetic */ pqx h;
    private final Uri i;
    private final pqp j;
    private final azh k;
    private final pvt l;
    private volatile boolean n;
    private final azv m = new azv();
    private boolean o = true;
    public long e = -1;
    public final long a = ppr.a();
    public asy d = d(0);

    public pqs(pqx pqxVar, Uri uri, asv asvVar, pqp pqpVar, azh azhVar, pvt pvtVar) {
        this.h = pqxVar;
        this.i = uri;
        this.b = new ayf(asvVar);
        this.j = pqpVar;
        this.k = azhVar;
        this.l = pvtVar;
    }

    private final asy d(long j) {
        asx asxVar = new asx();
        asxVar.a = this.i;
        asxVar.f = j;
        asxVar.h = null;
        asxVar.i = 6;
        asxVar.e = pqx.b;
        return asxVar.a();
    }

    @Override // defpackage.axv
    public final void a() {
        this.n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3 A[EDGE_INSN: B:132:0x01f3->B:96:0x01f3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3 A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195 A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:13:0x0040, B:31:0x008a, B:33:0x0095, B:35:0x00a1, B:37:0x00ab, B:39:0x00b7, B:41:0x00c1, B:43:0x00cd, B:45:0x00d7, B:47:0x00e9, B:49:0x00f3, B:50:0x00f9, B:68:0x0139, B:69:0x013f, B:71:0x0149, B:73:0x014d, B:75:0x0166, B:77:0x0183, B:79:0x018d, B:80:0x0191, B:82:0x0195, B:53:0x0101, B:55:0x010b, B:57:0x0115, B:56:0x0110, B:61:0x011d, B:63:0x0127, B:65:0x0131, B:64:0x012c, B:17:0x004a, B:19:0x0056, B:21:0x0061, B:20:0x005b, B:25:0x006a, B:27:0x0076, B:29:0x0080, B:28:0x007b), top: B:117:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f6  */
    @Override // defpackage.axv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqs.b():void");
    }

    public final void c(long j, long j2) {
        this.m.a = j;
        this.c = j2;
        this.o = true;
        this.g = false;
    }
}
