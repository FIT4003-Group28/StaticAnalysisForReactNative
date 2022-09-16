package defpackage;
/* compiled from: PG */
/* renamed from: aygn  reason: default package */
/* loaded from: classes2.dex */
final class aygn implements Runnable {
    final /* synthetic */ aygq a;
    private final aybc b;

    public aygn(aygq aygqVar, aybc aybcVar) {
        this.a = aygqVar;
        aybcVar.getClass();
        this.b = aybcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(4:17|(1:19)|20|21)(14:57|58|59|60|61|62|(3:65|66|63)|95|96|97|(7:99|(6:356|(3:(1:359)|360|(1:364))(2:365|(1:367)(3:368|(5:371|372|(1:383)(4:374|(1:382)(1:378)|379|380)|381|369)|384))|(4:347|348|(1:350)|351)|103|(12:105|106|107|108|(4:111|(3:123|124|125)(3:113|114|(2:116|117)(3:119|120|121))|118|109)|126|127|(12:130|131|132|(2:135|133)|136|137|(5:141|(3:144|(2:146|147)|142)|148|149|(2:152|153)(1:151))|284|(5:286|287|(1:294)(1:290)|291|(3:293|149|(0)(0)))|295|(2:306|(2:308|(0)(0))(3:309|310|311))(5:299|(3:302|(3:304|306|(0)(0))|300)|305|149|(0)(0))|128)|316|(1:155)(1:283)|(3:157|(1:159)(16:163|164|165|(7:253|254|(1:256)|257|(1:261)|262|(1:264)(14:265|(3:268|(1:270)(3:271|272|273)|266)|274|275|(1:252)(2:171|(2:172|(2:174|(1:176)(5:177|178|(1:180)(1:249)|181|(1:183)(0)))(2:250|251)))|(1:185)(2:245|(1:247)(1:248))|186|(10:193|(1:195)(1:243)|196|(1:198)(1:242)|199|200|(1:202)(1:241)|203|(1:205)(4:207|(4:210|(2:215|216)(4:218|219|(4:222|(4:224|(1:226)(1:230)|227|228)(2:231|(2:233|234)(2:235|236))|229|220)|237)|217|208)|239|240)|206)|244|200|(0)(0)|203|(0)(0)|206))|167|(1:169)|252|(0)(0)|186|(11:190|193|(0)(0)|196|(0)(0)|199|200|(0)(0)|203|(0)(0)|206)|244|200|(0)(0)|203|(0)(0)|206)|160)(1:282)|161)(7:327|328|329|330|331|332|333)|162)|101|(0)|103|(0)(0)|162)(1:386)|74|75|(6:77|78|(1:80)(1:82)|81|29|30)(5:83|(1:85)|86|(1:88)|89))|22|23|(1:32)(1:27)|28|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0676, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0677, code lost:
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x069e, code lost:
        r3 = "Unable to resolve host ".concat(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06a3, code lost:
        r3 = new java.lang.String("Unable to resolve host ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06ba, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
        if (r12 != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b0 A[LOOP:2: B:100:0x0207->B:143:0x02b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fb A[Catch: all -> 0x05a9, IOException -> 0x05af, TryCatch #27 {IOException -> 0x05af, all -> 0x05a9, blocks: (B:126:0x0276, B:129:0x0282, B:131:0x028a, B:133:0x0290, B:134:0x0294, B:136:0x029a, B:138:0x02a6, B:144:0x02b4, B:145:0x02c8, B:148:0x02cb, B:157:0x02fb, B:159:0x02ff, B:161:0x0307, B:162:0x030d, B:164:0x0311, B:166:0x031e, B:167:0x0325, B:169:0x032b, B:171:0x0333, B:172:0x0344, B:175:0x034c, B:176:0x0355, B:178:0x035b, B:180:0x0368, B:181:0x0389, B:182:0x03b9, B:183:0x03ba, B:188:0x03c6, B:190:0x03cc, B:191:0x03d7, B:193:0x03dd, B:195:0x03eb, B:196:0x03ef, B:198:0x03f5, B:200:0x040e, B:202:0x0418, B:213:0x0478, B:217:0x0483, B:220:0x048c, B:224:0x04a8, B:228:0x04b4, B:230:0x04c3, B:234:0x04da, B:236:0x04e2, B:261:0x058b, B:237:0x04f1, B:238:0x04f7, B:240:0x04fd, B:242:0x0510, B:244:0x0516, B:245:0x051a, B:247:0x0520, B:249:0x053a, B:253:0x0548, B:254:0x0550, B:256:0x0556, B:257:0x0565, B:260:0x0580, B:233:0x04d2, B:209:0x046a, B:211:0x046e, B:212:0x0474, B:203:0x0424, B:205:0x0453, B:265:0x0593, B:151:0x02e0, B:155:0x02e8, B:103:0x0213, B:104:0x021b, B:106:0x0221, B:107:0x0238, B:109:0x0240, B:111:0x0246, B:112:0x024a, B:114:0x0250, B:118:0x0261, B:120:0x0269), top: B:397:0x018f, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x046a A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:162:0x030d, B:213:0x0478, B:217:0x0483, B:220:0x048c, B:224:0x04a8, B:228:0x04b4, B:230:0x04c3, B:234:0x04da, B:236:0x04e2, B:261:0x058b, B:237:0x04f1, B:238:0x04f7, B:240:0x04fd, B:242:0x0510, B:244:0x0516, B:245:0x051a, B:247:0x0520, B:249:0x053a, B:253:0x0548, B:254:0x0550, B:256:0x0556, B:257:0x0565, B:260:0x0580, B:233:0x04d2, B:209:0x046a, B:211:0x046e, B:212:0x0474, B:205:0x0453), top: B:374:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d2 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:162:0x030d, B:213:0x0478, B:217:0x0483, B:220:0x048c, B:224:0x04a8, B:228:0x04b4, B:230:0x04c3, B:234:0x04da, B:236:0x04e2, B:261:0x058b, B:237:0x04f1, B:238:0x04f7, B:240:0x04fd, B:242:0x0510, B:244:0x0516, B:245:0x051a, B:247:0x0520, B:249:0x053a, B:253:0x0548, B:254:0x0550, B:256:0x0556, B:257:0x0565, B:260:0x0580, B:233:0x04d2, B:209:0x046a, B:211:0x046e, B:212:0x0474, B:205:0x0453), top: B:374:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04e2 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:162:0x030d, B:213:0x0478, B:217:0x0483, B:220:0x048c, B:224:0x04a8, B:228:0x04b4, B:230:0x04c3, B:234:0x04da, B:236:0x04e2, B:261:0x058b, B:237:0x04f1, B:238:0x04f7, B:240:0x04fd, B:242:0x0510, B:244:0x0516, B:245:0x051a, B:247:0x0520, B:249:0x053a, B:253:0x0548, B:254:0x0550, B:256:0x0556, B:257:0x0565, B:260:0x0580, B:233:0x04d2, B:209:0x046a, B:211:0x046e, B:212:0x0474, B:205:0x0453), top: B:374:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f1 A[Catch: RuntimeException -> 0x0591, all -> 0x05a9, IOException -> 0x05af, TryCatch #1 {RuntimeException -> 0x0591, blocks: (B:162:0x030d, B:213:0x0478, B:217:0x0483, B:220:0x048c, B:224:0x04a8, B:228:0x04b4, B:230:0x04c3, B:234:0x04da, B:236:0x04e2, B:261:0x058b, B:237:0x04f1, B:238:0x04f7, B:240:0x04fd, B:242:0x0510, B:244:0x0516, B:245:0x051a, B:247:0x0520, B:249:0x053a, B:253:0x0548, B:254:0x0550, B:256:0x0556, B:257:0x0565, B:260:0x0580, B:233:0x04d2, B:209:0x046a, B:211:0x046e, B:212:0x0474, B:205:0x0453), top: B:374:0x030d, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0619 A[Catch: all -> 0x0606, IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:278:0x05cb, B:277:0x05bf, B:308:0x060b, B:310:0x0619, B:312:0x0623, B:311:0x061e), top: B:387:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x061e A[Catch: all -> 0x0606, IOException -> 0x0681, TryCatch #13 {IOException -> 0x0681, blocks: (B:278:0x05cb, B:277:0x05bf, B:308:0x060b, B:310:0x0619, B:312:0x0623, B:311:0x061e), top: B:387:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0631 A[Catch: all -> 0x0679, IOException -> 0x067d, TRY_LEAVE, TryCatch #25 {IOException -> 0x067d, all -> 0x0679, blocks: (B:313:0x062d, B:315:0x0631, B:323:0x064a, B:325:0x064e, B:326:0x0650, B:328:0x0654), top: B:400:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x064a A[Catch: all -> 0x0679, IOException -> 0x067d, TRY_ENTER, TryCatch #25 {IOException -> 0x067d, all -> 0x0679, blocks: (B:313:0x062d, B:315:0x0631, B:323:0x064a, B:325:0x064e, B:326:0x0650, B:328:0x0654), top: B:400:0x062d }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x069e A[Catch: all -> 0x0673, TryCatch #11 {all -> 0x0673, blocks: (B:330:0x0657, B:355:0x068c, B:357:0x069e, B:359:0x06a9, B:358:0x06a3), top: B:375:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x06a3 A[Catch: all -> 0x0673, TryCatch #11 {all -> 0x0673, blocks: (B:330:0x0657, B:355:0x068c, B:357:0x069e, B:359:0x06a9, B:358:0x06a3), top: B:375:0x0657 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02af A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aygn.run():void");
    }
}
