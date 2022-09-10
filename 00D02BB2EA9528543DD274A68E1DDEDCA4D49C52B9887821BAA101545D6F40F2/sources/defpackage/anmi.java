package defpackage;
/* compiled from: PG */
/* renamed from: anmi  reason: default package */
/* loaded from: classes2.dex */
public final class anmi implements ango, anmo {
    private final anmh a;

    public anmi(btrm btrmVar, angp angpVar, anmp anmpVar, btvo btvoVar, anmf anmfVar, angv angvVar) {
        this.a = new anmh(btrmVar, angvVar, btvoVar, anmfVar);
        angpVar.a(this);
        anmpVar.c.add(this);
    }

    @Override // defpackage.anmo
    public final void a(aogb aogbVar) {
        anme a = this.a.a();
        try {
            if (a.a()) {
                a.c.b(aogbVar);
            }
        } finally {
            this.a.b();
        }
    }

    @Override // defpackage.anmo
    public final void b(aogb aogbVar) {
        anme a = this.a.a();
        try {
            if (a.a()) {
                a.c.c(aogbVar);
            }
        } finally {
            this.a.b();
        }
    }

    @Override // defpackage.ango
    public final void c(dcdc<anhm> dcdcVar) {
        this.a.a();
        try {
            dcpe<anhm> listIterator = dcdcVar.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next();
            }
        } finally {
            this.a.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0444 A[Catch: all -> 0x04e0, TryCatch #0 {all -> 0x04e0, blocks: (B:6:0x0012, B:8:0x001e, B:226:0x043d, B:254:0x048e, B:256:0x04a0, B:258:0x04b0, B:259:0x04b9, B:260:0x04bc, B:229:0x0444, B:231:0x0451, B:233:0x045d, B:235:0x0461, B:237:0x0465, B:239:0x0469, B:241:0x046d, B:242:0x0470, B:244:0x0474, B:246:0x047a, B:247:0x047d, B:249:0x0483, B:251:0x0487, B:252:0x048a, B:59:0x0128, B:63:0x0131, B:66:0x0145, B:71:0x0150, B:76:0x015b, B:79:0x0167, B:82:0x016d, B:85:0x0173, B:88:0x0179, B:91:0x017f, B:93:0x0184, B:96:0x018a, B:98:0x018f, B:101:0x0195, B:103:0x019a, B:106:0x01a0, B:108:0x01a5, B:111:0x01ab, B:114:0x01b3, B:117:0x01bb, B:121:0x01c5, B:126:0x01d0, B:129:0x01da, B:131:0x01ea, B:134:0x01f1, B:136:0x01f7, B:137:0x01f9, B:139:0x01fe, B:141:0x0205, B:143:0x020d, B:144:0x020f, B:140:0x0203, B:145:0x023b, B:128:0x01d6, B:146:0x023f, B:75:0x0159, B:147:0x0245, B:149:0x024b, B:151:0x0252, B:153:0x025c, B:154:0x025e, B:156:0x026b, B:157:0x026d, B:159:0x027c, B:160:0x0280, B:162:0x02a0, B:163:0x02a2, B:167:0x02cc, B:172:0x0301, B:170:0x02d4, B:175:0x031f, B:177:0x0323, B:178:0x033f, B:150:0x0250, B:181:0x0350, B:187:0x035c, B:189:0x0362, B:190:0x036e, B:192:0x0373, B:194:0x037a, B:196:0x038c, B:199:0x0393, B:201:0x03a0, B:202:0x03a2, B:204:0x03b2, B:203:0x03b0, B:193:0x0378, B:207:0x03bd, B:209:0x03c3, B:212:0x03cb, B:214:0x03cf, B:216:0x03d6, B:218:0x03e6, B:219:0x03e8, B:221:0x03fb, B:223:0x0433, B:222:0x03fe, B:215:0x03d4, B:224:0x0438, B:225:0x043b), top: B:271:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04a0 A[Catch: all -> 0x04e0, TryCatch #0 {all -> 0x04e0, blocks: (B:6:0x0012, B:8:0x001e, B:226:0x043d, B:254:0x048e, B:256:0x04a0, B:258:0x04b0, B:259:0x04b9, B:260:0x04bc, B:229:0x0444, B:231:0x0451, B:233:0x045d, B:235:0x0461, B:237:0x0465, B:239:0x0469, B:241:0x046d, B:242:0x0470, B:244:0x0474, B:246:0x047a, B:247:0x047d, B:249:0x0483, B:251:0x0487, B:252:0x048a, B:59:0x0128, B:63:0x0131, B:66:0x0145, B:71:0x0150, B:76:0x015b, B:79:0x0167, B:82:0x016d, B:85:0x0173, B:88:0x0179, B:91:0x017f, B:93:0x0184, B:96:0x018a, B:98:0x018f, B:101:0x0195, B:103:0x019a, B:106:0x01a0, B:108:0x01a5, B:111:0x01ab, B:114:0x01b3, B:117:0x01bb, B:121:0x01c5, B:126:0x01d0, B:129:0x01da, B:131:0x01ea, B:134:0x01f1, B:136:0x01f7, B:137:0x01f9, B:139:0x01fe, B:141:0x0205, B:143:0x020d, B:144:0x020f, B:140:0x0203, B:145:0x023b, B:128:0x01d6, B:146:0x023f, B:75:0x0159, B:147:0x0245, B:149:0x024b, B:151:0x0252, B:153:0x025c, B:154:0x025e, B:156:0x026b, B:157:0x026d, B:159:0x027c, B:160:0x0280, B:162:0x02a0, B:163:0x02a2, B:167:0x02cc, B:172:0x0301, B:170:0x02d4, B:175:0x031f, B:177:0x0323, B:178:0x033f, B:150:0x0250, B:181:0x0350, B:187:0x035c, B:189:0x0362, B:190:0x036e, B:192:0x0373, B:194:0x037a, B:196:0x038c, B:199:0x0393, B:201:0x03a0, B:202:0x03a2, B:204:0x03b2, B:203:0x03b0, B:193:0x0378, B:207:0x03bd, B:209:0x03c3, B:212:0x03cb, B:214:0x03cf, B:216:0x03d6, B:218:0x03e6, B:219:0x03e8, B:221:0x03fb, B:223:0x0433, B:222:0x03fe, B:215:0x03d4, B:224:0x0438, B:225:0x043b), top: B:271:0x0012 }] */
    @Override // defpackage.ango
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dcdc<defpackage.anhm> r39) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anmi.d(dcdc):void");
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        anme a = this.a.a();
        try {
            if (!a.a()) {
                a.a.e();
            } else {
                anmd anmdVar = new anmd(a);
                for (dnrw dnrwVar : duycVar.b) {
                    a.c.e(dnrwVar, anmdVar);
                }
                anmdVar.a();
            }
        } finally {
            this.a.b();
        }
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
        anme a = this.a.a();
        try {
            if (a.a()) {
                dcdc<angu<aogb, aoge>> f = a.a.f();
                dcep<aogb> a2 = a.c.a();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    aogb a3 = f.get(i).a();
                    if (a2.contains(a3)) {
                        a.a.h(a3);
                    }
                }
                anmd anmdVar = new anmd(a);
                for (dnrw dnrwVar : duycVar.b) {
                    a.c.f(dnrwVar, anmdVar);
                }
                anmdVar.a();
            }
        } finally {
            this.a.b();
        }
    }

    @Override // defpackage.anmo
    public final void g(aogb aogbVar, int i) {
        anme a = this.a.a();
        try {
            if (a.a()) {
                angs<aoge> b = ((aouz) a.a).a(aogbVar).b();
                dbsg<aoge> dbsgVar = dbpy.a;
                if (b.e()) {
                    dbsgVar = dbsg.i(b.f());
                }
                anmd anmdVar = new anmd(a);
                a.c.h(aogbVar, i, dbsgVar, anmdVar);
                anmdVar.a();
            }
        } finally {
            this.a.b();
        }
    }
}
