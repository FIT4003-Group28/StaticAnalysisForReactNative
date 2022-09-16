package defpackage;
/* compiled from: PG */
/* renamed from: dyoa  reason: default package */
/* loaded from: classes6.dex */
final class dyoa implements Runnable {
    final /* synthetic */ dyod a;
    private final dyig b;

    public dyoa(dyod dyodVar, dyig dyigVar) {
        this.a = dyodVar;
        dbsk.t(dyigVar, "savedListener");
        this.b = dyigVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:15|(1:17)|18|19)(14:55|56|57|58|59|60|(3:63|64|61)|93|94|95|(7:97|(6:236|(3:(1:239)|240|(1:244))(2:245|(1:247)(3:248|(5:251|252|(1:263)(4:254|(1:262)(1:258)|259|260)|261|249)|264))|(4:227|228|(1:230)|231)|101|(12:125|126|127|128|(4:131|(3:143|144|145)(3:133|134|(2:136|137)(3:139|140|141))|138|129)|146|147|(12:150|151|152|(2:155|153)|156|157|(5:161|(3:164|(2:166|167)|162)|168|169|(2:172|173)(1:171))|185|(5:187|188|(1:195)(1:191)|192|(3:194|169|(0)(0)))|196|(2:207|(2:209|(0)(0))(3:210|211|212))(5:200|(3:203|(3:205|207|(0)(0))|201)|206|169|(0)(0))|148)|217|(1:175)(1:184)|(3:177|(1:179)(1:182)|180)(1:183)|181)(7:103|104|105|106|107|108|109)|110)|99|(0)|101|(0)(0)|110)(1:266)|72|73|(6:75|76|(1:78)(1:80)|79|27|28)(5:81|(1:83)|84|(1:86)|87))|20|21|(1:30)(1:25)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03c5, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03ec, code lost:
        r3 = "Unable to resolve host ".concat(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03f1, code lost:
        r3 = new java.lang.String("Unable to resolve host ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0408, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r12 != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0292 A[LOOP:2: B:93:0x01e9->B:136:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dd A[Catch: all -> 0x02f7, IOException -> 0x02fd, TryCatch #23 {IOException -> 0x02fd, all -> 0x02f7, blocks: (B:119:0x0258, B:122:0x0264, B:124:0x026c, B:126:0x0272, B:127:0x0276, B:129:0x027c, B:131:0x0288, B:137:0x0296, B:138:0x02aa, B:141:0x02ad, B:150:0x02dd, B:152:0x02e1, B:154:0x02e8, B:144:0x02c2, B:148:0x02ca, B:96:0x01f5, B:97:0x01fd, B:99:0x0203, B:100:0x021a, B:102:0x0222, B:104:0x0228, B:105:0x022c, B:107:0x0232, B:111:0x0243, B:113:0x024b), top: B:288:0x0171, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0367 A[Catch: all -> 0x0354, IOException -> 0x03cf, TryCatch #16 {IOException -> 0x03cf, blocks: (B:167:0x0319, B:166:0x030d, B:197:0x0359, B:199:0x0367, B:201:0x0371, B:200:0x036c), top: B:279:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x036c A[Catch: all -> 0x0354, IOException -> 0x03cf, TryCatch #16 {IOException -> 0x03cf, blocks: (B:167:0x0319, B:166:0x030d, B:197:0x0359, B:199:0x0367, B:201:0x0371, B:200:0x036c), top: B:279:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x037f A[Catch: all -> 0x03c7, IOException -> 0x03cb, TRY_LEAVE, TryCatch #22 {IOException -> 0x03cb, all -> 0x03c7, blocks: (B:202:0x037b, B:204:0x037f, B:212:0x0398, B:214:0x039c, B:215:0x039e, B:217:0x03a2), top: B:289:0x037b }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0398 A[Catch: all -> 0x03c7, IOException -> 0x03cb, TRY_ENTER, TryCatch #22 {IOException -> 0x03cb, all -> 0x03c7, blocks: (B:202:0x037b, B:204:0x037f, B:212:0x0398, B:214:0x039c, B:215:0x039e, B:217:0x03a2), top: B:289:0x037b }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ec A[Catch: all -> 0x03c1, TryCatch #11 {all -> 0x03c1, blocks: (B:219:0x03a5, B:244:0x03da, B:246:0x03ec, B:248:0x03f7, B:247:0x03f1), top: B:269:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03f1 A[Catch: all -> 0x03c1, TryCatch #11 {all -> 0x03c1, blocks: (B:219:0x03a5, B:244:0x03da, B:246:0x03ec, B:248:0x03f7, B:247:0x03f1), top: B:269:0x03a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0291 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyoa.run():void");
    }
}
