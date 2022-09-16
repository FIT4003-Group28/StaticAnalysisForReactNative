package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: rlp  reason: default package */
/* loaded from: classes4.dex */
public final class rlp extends rpf implements rjo {
    public final Map a;
    public final Map b;
    public final Map c;
    final agc d;
    public final Map e;
    final rln f;
    private final Map g;
    private final Map h;

    public rlp(rpn rpnVar) {
        super(rpnVar);
        this.a = new afw();
        this.g = new afw();
        this.h = new afw();
        this.b = new afw();
        this.e = new afw();
        this.c = new afw();
        this.d = new rlm(this);
        this.f = new rln(this);
    }

    private final rqb m(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                rqb rqbVar = (rqb) ((aopa) rpp.h(rqb.a.createBuilder(), bArr)).mo39build();
                rkq rkqVar = aG().k;
                String str2 = null;
                Long valueOf = (rqbVar.b & 1) != 0 ? Long.valueOf(rqbVar.c) : null;
                if ((rqbVar.b & 2) != 0) {
                    str2 = rqbVar.d;
                }
                rkqVar.c("Parsed config. version, gmp_app_id", valueOf, str2);
                return rqbVar;
            } catch (aopx e) {
                aG().f.c("Unable to merge remote config. appId", rks.a(str), e);
                return rqb.a;
            } catch (RuntimeException e2) {
                aG().f.c("Unable to merge remote config. appId", rks.a(str), e2);
                return rqb.a;
            }
        }
        return rqb.a;
    }

    private static final Map o(rqb rqbVar) {
        afw afwVar = new afw();
        if (rqbVar != null) {
            for (rqc rqcVar : rqbVar.e) {
                afwVar.put(rqcVar.b, rqcVar.c);
            }
        }
        return afwVar;
    }

    private final void p(String str, aopa aopaVar) {
        afw afwVar = new afw();
        afw afwVar2 = new afw();
        afw afwVar3 = new afw();
        if (aopaVar != null) {
            for (int i = 0; i < ((rqb) aopaVar.instance).f.size(); i++) {
                aopa mo52toBuilder = ((rqa) ((rqb) aopaVar.instance).f.get(i)).mo52toBuilder();
                if (!TextUtils.isEmpty(((rqa) mo52toBuilder.instance).c)) {
                    String str2 = ((rqa) mo52toBuilder.instance).c;
                    String b = rmm.b(str2);
                    if (!TextUtils.isEmpty(b)) {
                        mo52toBuilder.copyOnWrite();
                        rqa rqaVar = (rqa) mo52toBuilder.instance;
                        b.getClass();
                        rqaVar.b |= 1;
                        rqaVar.c = b;
                        aopaVar.copyOnWrite();
                        rqb rqbVar = (rqb) aopaVar.instance;
                        rqa rqaVar2 = (rqa) mo52toBuilder.mo39build();
                        rqaVar2.getClass();
                        aopu aopuVar = rqbVar.f;
                        if (!aopuVar.c()) {
                            rqbVar.f = aopi.mutableCopy(aopuVar);
                        }
                        rqbVar.f.set(i, rqaVar2);
                    }
                    afwVar.put(str2, Boolean.valueOf(((rqa) mo52toBuilder.instance).d));
                    rqa rqaVar3 = (rqa) mo52toBuilder.instance;
                    afwVar2.put(rqaVar3.c, Boolean.valueOf(rqaVar3.e));
                    rqa rqaVar4 = (rqa) mo52toBuilder.instance;
                    if ((rqaVar4.b & 8) != 0) {
                        int i2 = rqaVar4.f;
                        if (i2 < 2 || i2 > 65535) {
                            rkq rkqVar = aG().f;
                            rqa rqaVar5 = (rqa) mo52toBuilder.instance;
                            rkqVar.c("Invalid sampling rate. Event name, sample rate", rqaVar5.c, Integer.valueOf(rqaVar5.f));
                        } else {
                            afwVar3.put(rqaVar4.c, Integer.valueOf(i2));
                        }
                    }
                } else {
                    aG().f.a("EventConfig contained null event name");
                }
            }
        }
        this.g.put(str, afwVar);
        this.h.put(str, afwVar2);
        this.c.put(str, afwVar3);
    }

    @Override // defpackage.rjo
    public final String a(String str, String str2) {
        n();
        d(str);
        Map map = (Map) this.a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.rpf
    protected final void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rqb c(String str) {
        V();
        n();
        qnm.l(str);
        d(str);
        return (rqb) this.b.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0114: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x0114 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlp.d(java.lang.String):void");
    }

    public final void e(String str, rqb rqbVar) {
        dqs dqsVar;
        if (rqbVar.i.size() == 0) {
            this.d.i(str);
            return;
        }
        aG().k.b("EES programs found", Integer.valueOf(rqbVar.i.size()));
        rqr rqrVar = (rqr) rqbVar.i.get(0);
        try {
            dpr dprVar = new dpr();
            dprVar.a("internal.remoteConfig", new rll(this, str, 1));
            dprVar.a("internal.appMetadata", new rll(this, str, 2));
            dprVar.a("internal.logger", new Callable() { // from class: rlk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new dqd(rlp.this.f);
                }
            });
            dprVar.b = dprVar.a.a();
            if (!(dprVar.a.b(dprVar.b, (rqs[]) rqrVar.b.toArray(new rqs[0])) instanceof dqq)) {
                rqp rqpVar = rqrVar.c;
                if (rqpVar == null) {
                    rqpVar = rqp.a;
                }
                for (rqq rqqVar : rqpVar.b) {
                    aopu aopuVar = rqqVar.c;
                    String str2 = rqqVar.b;
                    Iterator it = aopuVar.iterator();
                    while (it.hasNext()) {
                        dqz b = dprVar.a.b(dprVar.b, (rqs) it.next());
                        if (b instanceof dqw) {
                            dpu dpuVar = dprVar.b;
                            if (!dpuVar.h(str2)) {
                                dqsVar = null;
                            } else {
                                dqz d = dpuVar.d(str2);
                                if (d instanceof dqs) {
                                    dqsVar = (dqs) d;
                                } else {
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                            }
                            if (dqsVar != null) {
                                dqsVar.a(dprVar.b, Collections.singletonList(b));
                            } else {
                                String valueOf2 = String.valueOf(str2);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                this.d.d(str, dprVar);
                rkq rkqVar = aG().k;
                rqp rqpVar2 = rqrVar.c;
                if (rqpVar2 == null) {
                    rqpVar2 = rqp.a;
                }
                rkqVar.c("EES program loaded for appId, activities", str, Integer.valueOf(rqpVar2.b.size()));
                rqp rqpVar3 = rqrVar.c;
                if (rqpVar3 == null) {
                    rqpVar3 = rqp.a;
                }
                for (rqq rqqVar2 : rqpVar3.b) {
                    aG().k.b("EES program activity", rqqVar2.b);
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (dps unused) {
            aG().c.b("Failed to load EES program. appId", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        n();
        rqb c = c(str);
        if (c == null) {
            return false;
        }
        return c.h;
    }

    public final boolean g(String str) {
        rqb rqbVar;
        axua.b();
        return J().o(rkg.au) && !TextUtils.isEmpty(str) && (rqbVar = (rqb) this.b.get(str)) != null && rqbVar.i.size() != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(String str, String str2) {
        Boolean bool;
        n();
        d(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.h.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(String str, String str2) {
        Boolean bool;
        n();
        d(str);
        if (!h(str) || !rps.an(str2)) {
            if (k(str) && rps.ao(str2)) {
                return true;
            }
            Map map = (Map) this.g.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x03bc, code lost:
        if (android.text.TextUtils.isEmpty(r3.d) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03be, code lost:
        r0 = r9.aG().f;
        r8 = defpackage.rks.a(r29);
        r11 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03d2, code lost:
        if ((r3.b & 1) == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x03d4, code lost:
        r3 = java.lang.Integer.valueOf(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x03db, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03dc, code lost:
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x03e5, code lost:
        r8 = r3.toByteArray();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r29);
        r24 = r0;
        r11.put(r5, java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0400, code lost:
        if ((r3.b & 1) == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0402, code lost:
        r0 = java.lang.Integer.valueOf(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0409, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x040a, code lost:
        r11.put("filter_id", r0);
        r25 = r5;
        r11.put("property_name", r3.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x041a, code lost:
        if ((r3.b & 32) == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x041c, code lost:
        r0 = java.lang.Boolean.valueOf(r3.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0423, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0424, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0438, code lost:
        if (r9.d().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x043a, code lost:
        r9.aG().c.b("Failed to insert property filter (got -1). appId", defpackage.rks.a(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x044a, code lost:
        r0 = r24;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0450, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0451, code lost:
        r9.aG().c.c("Error storing property filter. appId", defpackage.rks.a(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0460, code lost:
        r9.V();
        r9.n();
        defpackage.qnm.l(r29);
        r0 = r9.d();
        r3 = r20;
        r0.delete("property_filters", r3, new java.lang.String[]{r29, java.lang.String.valueOf(r7)});
        r0.delete(r21, r3, new java.lang.String[]{r29, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0296, code lost:
        r8 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a0, code lost:
        if (r8.hasNext() == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02ac, code lost:
        if ((((defpackage.rpx) r8.next()).b & 1) != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ae, code lost:
        r9.aG().f.c("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.rks.a(r29), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c2, code lost:
        r8 = r0.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02cc, code lost:
        r5 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02d6, code lost:
        if (r8.hasNext() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d8, code lost:
        r11 = (defpackage.rpu) r8.next();
        r9.V();
        r9.n();
        defpackage.qnm.l(r29);
        defpackage.qnm.b(r11);
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02f2, code lost:
        if (android.text.TextUtils.isEmpty(r11.d) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02f4, code lost:
        r0 = r9.aG().f;
        r5 = defpackage.rks.a(r29);
        r8 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0308, code lost:
        if ((r11.b & 1) == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x030a, code lost:
        r19 = java.lang.Integer.valueOf(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0313, code lost:
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0315, code lost:
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r5, r8, java.lang.String.valueOf(r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x031e, code lost:
        r3 = r11.toByteArray();
        r24 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r29);
        r8.put(r5, java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0337, code lost:
        if ((r11.b & 1) == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0339, code lost:
        r5 = java.lang.Integer.valueOf(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0340, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0341, code lost:
        r8.put("filter_id", r5);
        r8.put("event_name", r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x034f, code lost:
        if ((r11.b & 64) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0351, code lost:
        r5 = java.lang.Boolean.valueOf(r11.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0358, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0359, code lost:
        r8.put("session_scoped", r5);
        r8.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x036d, code lost:
        if (r9.d().insertWithOnConflict(r21, null, r8, 5) != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x036f, code lost:
        r9.aG().c.b("Failed to insert event filter (got -1). appId", defpackage.rks.a(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x037e, code lost:
        r3 = r23;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0384, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0385, code lost:
        r9.aG().c.c("Error storing event filter. appId", defpackage.rks.a(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0396, code lost:
        r23 = r3;
        r0 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a2, code lost:
        if (r0.hasNext() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a4, code lost:
        r3 = (defpackage.rpx) r0.next();
        r9.V();
        r9.n();
        defpackage.qnm.l(r29);
        defpackage.qnm.b(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.String r29, byte[] r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlp.l(java.lang.String, byte[], java.lang.String):boolean");
    }
}
