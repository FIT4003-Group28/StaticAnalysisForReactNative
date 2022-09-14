package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsnj  reason: default package */
/* loaded from: classes.dex */
public final class dsnj {
    public String a;
    public Map<dsne, dsnf> b;
    public Map<dsne, dsnk> c;

    public dsnj() {
        b("", new EnumMap<>(dsne.class));
    }

    public final void a(dsne dsneVar) {
        this.c.put(dsneVar, new dsnk(null));
    }

    public final void b(String str, EnumMap<dsne, dsnf> enumMap) {
        this.a = str;
        this.b = enumMap;
        this.c = new EnumMap(dsne.class);
    }

    public final void c(dsne dsneVar) {
        dbsg dbsgVar;
        boolean valueOf;
        Map<dsne, dsnf> map = this.b;
        Map<dsne, dsnk> map2 = this.c;
        if (map2.containsKey(dsneVar)) {
            Object obj = map2.get(dsneVar).a;
        } else {
            map.containsKey(dsneVar);
        }
        Map<dsne, dsnf> map3 = this.b;
        Map<dsne, dsnk> map4 = this.c;
        if (map4.containsKey(dsneVar)) {
            if (map4.get(dsneVar).a == null) {
                return;
            }
            boolean z = map4.get(dsneVar).b;
        } else if (!map3.containsKey(dsneVar) || !map3.get(dsneVar).e) {
        } else {
            if (this.c.containsKey(dsneVar)) {
                Map<dsne, dsnk> map5 = this.c;
                map5.put(dsneVar, new dsnk(map5.get(dsneVar).a));
                return;
            }
            Map<dsne, dsnk> map6 = this.c;
            String str = this.a;
            Map<dsne, dsnf> map7 = this.b;
            if (map6.containsKey(dsneVar)) {
                Object obj2 = map6.get(dsneVar).a;
                dbsgVar = obj2 == null ? dbpy.a : dbsg.i(obj2);
            } else if (map7.containsKey(dsneVar)) {
                dsnf dsnfVar = map7.get(dsneVar);
                try {
                    dsnd dsndVar = dsnd.FIXED_LENGTH_BASE_64;
                    switch (dsneVar.aQ.ordinal()) {
                        case 0:
                            if (dsng.b(dsnfVar) != 0) {
                                valueOf = Long.valueOf(decn.f(ddae.e.h().j(dsng.c(str, dsnfVar))));
                                dbsgVar = dbsg.i(valueOf);
                                break;
                            } else {
                                throw new dsni("A FixedLengthBase64 option must have an non-empty value.");
                            }
                        case 1:
                            if (dsng.b(dsnfVar) <= 0) {
                                valueOf = true;
                                dbsgVar = dbsg.i(valueOf);
                                break;
                            } else {
                                throw new dsni("A Boolean option must have an empty value.");
                            }
                        case 2:
                            if (dsng.b(dsnfVar) == 0) {
                                throw new dsni("A Float option must have an non-empty value.");
                            }
                            valueOf = dsng.c(str, dsnfVar);
                            dbsgVar = dbsg.i(valueOf);
                            break;
                        case 3:
                            if (dsng.b(dsnfVar) == 0) {
                                throw new dsni("An Integer option must have an non-empty value.");
                            }
                            try {
                                valueOf = Integer.valueOf(Integer.parseInt(dsng.c(str, dsnfVar)));
                                dbsgVar = dbsg.i(valueOf);
                                break;
                            } catch (NumberFormatException e) {
                                throw new dsni(e);
                            }
                        case 4:
                            if (dsng.b(dsnfVar) == 0) {
                                throw new dsni("A Long option must have an non-empty value.");
                            }
                            try {
                                valueOf = Long.valueOf(Long.parseLong(dsng.c(str, dsnfVar)));
                                dbsgVar = dbsg.i(valueOf);
                                break;
                            } catch (NumberFormatException e2) {
                                throw new dsni(e2);
                            }
                        case 5:
                            if (dsng.b(dsnfVar) == 0) {
                                throw new dsni("A Float option must have an non-empty value.");
                            }
                            try {
                                valueOf = Float.valueOf(Float.parseFloat(dsng.c(str, dsnfVar)));
                                dbsgVar = dbsg.i(valueOf);
                                break;
                            } catch (NumberFormatException e3) {
                                throw new dsni(e3);
                            }
                        case 6:
                            if (dsng.b(dsnfVar) <= 2) {
                                throw new dsni("A PrefixHex option must have a value of at least 2 chars.");
                            }
                            String c = dsng.c(str, dsnfVar);
                            if ("0x".equals(c.substring(0, 2))) {
                                try {
                                    String substring = c.substring(2);
                                    dbsk.s(substring);
                                    long parseLong = Long.parseLong(substring, 16);
                                    if ((4294967295L & parseLong) == parseLong) {
                                        valueOf = Integer.valueOf((int) parseLong);
                                        dbsgVar = dbsg.i(valueOf);
                                        break;
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 69);
                                        sb.append("Input ");
                                        sb.append(substring);
                                        sb.append(" in base ");
                                        sb.append(16);
                                        sb.append(" is not in the range of an unsigned integer");
                                        throw new NumberFormatException(sb.toString());
                                    }
                                } catch (NumberFormatException e4) {
                                    throw new dsni(e4);
                                }
                            } else {
                                throw new dsni("A PrefixHex option must begin with '0x'.");
                            }
                        default:
                            String valueOf2 = String.valueOf(dsneVar.aQ);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                            sb2.append("OptionType ");
                            sb2.append(valueOf2);
                            sb2.append(" not handled.");
                            throw new IllegalStateException(sb2.toString());
                    }
                } catch (dsni e5) {
                    throw new dsnl(e5);
                }
            } else {
                dbsgVar = dbpy.a;
            }
            map6.put(dsneVar, new dsnk(dbsgVar.b()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if (((java.lang.Long) r9).longValue() >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (((java.lang.Integer) r9).intValue() >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r0.isInfinite() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dsne r8, java.lang.Object r9) {
        /*
            r7 = this;
            dsnd r0 = defpackage.dsnd.FIXED_LENGTH_BASE_64
            dsnd r0 = r8.aQ
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L74;
                case 1: goto L67;
                case 2: goto L5d;
                case 3: goto L52;
                case 4: goto L44;
                case 5: goto L34;
                case 6: goto L74;
                default: goto Ld;
            }
        Ld:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            dsnd r8 = r8.aQ
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 24
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected option type: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r9.<init>(r8)
            throw r9
        L34:
            r0 = r9
            java.lang.Float r0 = (java.lang.Float) r0
            boolean r3 = r0.isNaN()
            if (r3 != 0) goto L6e
            boolean r0 = r0.isInfinite()
            if (r0 != 0) goto L6e
            goto L5b
        L44:
            r0 = r9
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L6e
            goto L5b
        L52:
            r0 = r9
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L6e
        L5b:
            r1 = 1
            goto L6e
        L5d:
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            goto L6e
        L67:
            r0 = r9
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
        L6e:
            if (r1 != 0) goto L74
            r7.a(r8)
            return
        L74:
            dsnk r0 = new dsnk
            r0.<init>(r9)
            java.util.Map<dsne, dsnk> r9 = r7.c
            r9.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsnj.d(dsne, java.lang.Object):void");
    }

    public dsnj(dsnm dsnmVar) {
        this.a = dsnmVar.a;
        this.b = new EnumMap(dsnmVar.b);
        this.c = new EnumMap(dsnmVar.c);
    }
}
