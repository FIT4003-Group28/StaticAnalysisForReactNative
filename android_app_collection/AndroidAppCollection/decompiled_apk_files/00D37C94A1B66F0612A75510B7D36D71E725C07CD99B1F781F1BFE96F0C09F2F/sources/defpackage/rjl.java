package defpackage;

import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rjl  reason: default package */
/* loaded from: classes4.dex */
public final class rjl extends rpf {
    private String a;
    private Set b;
    private Map c;
    private Long d;
    private Long e;

    public rjl(rpn rpnVar) {
        super(rpnVar);
    }

    private final rjg c(Integer num) {
        if (this.c.containsKey(num)) {
            return (rjg) this.c.get(num);
        }
        rjg rjgVar = new rjg(this, this.a);
        this.c.put(num, rjgVar);
        return rjgVar;
    }

    private final boolean d(int i, int i2) {
        rjg rjgVar = (rjg) this.c.get(Integer.valueOf(i));
        if (rjgVar == null) {
            return false;
        }
        return rjgVar.a.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(2:2|(2:4|(2:6|7))(2:525|526))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(3:30|(1:32)(1:34)|33)|35|(1:38)(1:37))|(1:40)|41|42|43|44|45|46|(3:48|(1:50)|51)(4:470|(6:471|472|473|474|475|(1:478)(1:477))|(1:480)|481)|52|(1:54)(6:301|(4:303|(6:400|401|402|403|404|(2:(3:406|(1:408)|409)|411)(1:455))|305|306)(1:469)|307|(10:310|(3:314|(4:317|(5:323|324|(1:326)(1:329)|327|328)(3:319|320|321)|322|315)|330)|331|(3:335|(4:338|(3:343|344|345)|346|336)|349)|350|(3:352|(6:355|(2:357|(3:359|360|361))(1:364)|362|363|361|353)|365)|366|(3:375|(8:378|(1:380)|381|(1:383)|384|(3:386|387|388)(1:390)|389|376)|391)|392|308)|398|399)|55|56|(3:194|(4:197|(10:199|200|(1:202)(1:298)|203|(14:205|206|207|208|209|210|211|212|213|214|215|(3:(9:217|218|219|220|221|(3:223|224|225)(1:269)|226|227|(1:230)(1:229))|(1:232)|233)(3:273|274|(1:276))|234|235)(1:297)|236|(4:239|(3:257|258|259)(6:241|242|(2:243|(2:245|(1:247)(2:248|249))(2:255|256))|(1:251)|252|253)|254|237)|260|261|262)(1:299)|263|195)|300)|58|59|(3:61|(6:64|(7:66|67|68|69|70|(4:(8:72|73|74|75|76|(1:78)|79|80)|82|(1:84)|85)(1:90)|86)|108|(2:109|(2:111|(3:162|163|164)(6:113|(2:114|(4:116|(5:118|(1:120)(1:158)|121|(1:123)(7:146|(1:148)(1:157)|149|(1:151)(1:156)|152|(1:154)|155)|124)(1:159)|125|(1:1)(2:129|(1:131)(2:132|133)))(2:160|161))|(2:138|137)|135|136|137))(0))|165|62)|167)|168|(11:171|(1:173)|174|175|176|177|178|179|(2:181|182)(1:184)|183|169)|192|193)(1:509))|524|42|43|44|45|46|(0)(0)|52|(0)(0)|55|56|(0)|58|59|(0)|168|(1:169)|192|193|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bd, code lost:
        if (r5 != null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02bf, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c7, code lost:
        if (r5 != null) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02e8, code lost:
        if (r5 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02eb, code lost:
        r1 = r12.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02f7, code lost:
        if (r1.hasNext() == false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02f9, code lost:
        r4 = ((java.lang.Integer) r1.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (defpackage.rqm) r12.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0313, code lost:
        if (r7 == null) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0319, code lost:
        if (r7.isEmpty() == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x031d, code lost:
        r17 = r0;
        r0 = U().k(r6.c, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x032d, code lost:
        if (r0.isEmpty() != false) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x032f, code lost:
        r5 = r6.mo52toBuilder();
        r5.copyOnWrite();
        r19 = r1;
        r21 = r8;
        ((defpackage.rqm) r5.instance).c = defpackage.rqm.emptyLongList();
        r5.v(r0);
        r0 = U().k(r6.b, r7);
        r5.copyOnWrite();
        ((defpackage.rqm) r5.instance).b = defpackage.rqm.emptyLongList();
        r5.w(r0);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0368, code lost:
        if (r0 >= r6.d.size()) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x037c, code lost:
        if (r7.contains(java.lang.Integer.valueOf(((defpackage.rqe) r6.d.get(r0)).c)) == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x037e, code lost:
        r5.copyOnWrite();
        r1 = (defpackage.rqm) r5.instance;
        r1.a();
        r1.d.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x038d, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0390, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0397, code lost:
        if (r0 >= r6.e.size()) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03ab, code lost:
        if (r7.contains(java.lang.Integer.valueOf(((defpackage.rqn) r6.e.get(r0)).c)) == false) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03ad, code lost:
        r5.copyOnWrite();
        r1 = (defpackage.rqm) r5.instance;
        r1.b();
        r1.e.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03bc, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03bf, code lost:
        r3.put(java.lang.Integer.valueOf(r4), (defpackage.rqm) r5.mo39build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03cd, code lost:
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03d1, code lost:
        r17 = r0;
        r19 = r1;
        r21 = r8;
        r3.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03da, code lost:
        r0 = r17;
        r1 = r19;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x08a0, code lost:
        if (r10 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x08a2, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x08be, code lost:
        if (r10 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x09fb, code lost:
        r1 = aG().f;
        r7 = defpackage.rks.a(r64.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0a0b, code lost:
        if ((r8.b & 1) == 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0a0d, code lost:
        r8 = java.lang.Integer.valueOf(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a14, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0a15, code lost:
        r1.c("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0147, code lost:
        if (r5 != null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0149, code lost:
        r5.close();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
        if (r5 == null) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0211, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0212, code lost:
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0215, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0216, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0219, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021a, code lost:
        r20 = r7;
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0adc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a8 A[Catch: SQLiteException -> 0x0211, all -> 0x0ad8, TRY_LEAVE, TryCatch #26 {all -> 0x0ad8, blocks: (B:60:0x01a2, B:62:0x01a8, B:66:0x01b6, B:67:0x01bb, B:68:0x01c5, B:69:0x01d7, B:74:0x01fb, B:71:0x01e4, B:73:0x01f4, B:88:0x021d), top: B:463:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6 A[Catch: SQLiteException -> 0x0211, all -> 0x0ad8, TRY_ENTER, TryCatch #26 {all -> 0x0ad8, blocks: (B:60:0x01a2, B:62:0x01a8, B:66:0x01b6, B:67:0x01bb, B:68:0x01c5, B:69:0x01d7, B:74:0x01fb, B:71:0x01e4, B:73:0x01f4, B:88:0x021d), top: B:463:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /* JADX WARN: Type inference failed for: r2v56, types: [rkq] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rjl.a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // defpackage.rpf
    protected final void b() {
    }
}
