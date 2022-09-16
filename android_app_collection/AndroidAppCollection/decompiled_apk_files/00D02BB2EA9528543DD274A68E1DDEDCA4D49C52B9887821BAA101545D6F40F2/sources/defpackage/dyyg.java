package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyyg  reason: default package */
/* loaded from: classes6.dex */
final class dyyg implements dyxy {
    final dyyb a;
    private final eajb b;
    private final dyye c;

    public dyyg(eajb eajbVar) {
        this.b = eajbVar;
        dyye dyyeVar = new dyye(eajbVar);
        this.c = dyyeVar;
        this.a = new dyyb(dyyeVar);
    }

    private final List<dyya> b(int i, short s, byte b, int i2) {
        dyye dyyeVar = this.c;
        dyyeVar.d = i;
        dyyeVar.a = i;
        dyyeVar.e = s;
        dyyeVar.b = b;
        dyyeVar.c = i2;
        dyyb dyybVar = this.a;
        while (!dyybVar.b.c()) {
            int h = dyybVar.b.h() & 255;
            if (h == 128) {
                throw new IOException("index == 0");
            }
            if ((h & 128) == 128) {
                int d = dyybVar.d(h, 127) - 1;
                if (dyyb.g(d)) {
                    dyybVar.a.add(dyyd.b[d]);
                } else {
                    int length = dyyd.b.length;
                    int b2 = dyybVar.b(d - 61);
                    if (b2 >= 0) {
                        dyya[] dyyaVarArr = dyybVar.e;
                        if (b2 <= dyyaVarArr.length - 1) {
                            dyybVar.a.add(dyyaVarArr[b2]);
                        }
                    }
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Header index too large ");
                    sb.append(d + 1);
                    throw new IOException(sb.toString());
                }
            } else if (h == 64) {
                eajc e = dyybVar.e();
                dyyd.a(e);
                dyybVar.f(new dyya(e, dyybVar.e()));
            } else if ((h & 64) == 64) {
                dyybVar.f(new dyya(dyybVar.c(dyybVar.d(h, 63) - 1), dyybVar.e()));
            } else if ((h & 32) == 32) {
                int d2 = dyybVar.d(h, 31);
                dyybVar.d = d2;
                if (d2 >= 0 && d2 <= dyybVar.c) {
                    dyybVar.a();
                } else {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Invalid dynamic table size update ");
                    sb2.append(d2);
                    throw new IOException(sb2.toString());
                }
            } else if (h == 16 || h == 0) {
                eajc e2 = dyybVar.e();
                dyyd.a(e2);
                dyybVar.a.add(new dyya(e2, dyybVar.e()));
            } else {
                dyybVar.a.add(new dyya(dyybVar.c(dyybVar.d(h, 15) - 1), dyybVar.e()));
            }
        }
        dyyb dyybVar2 = this.a;
        ArrayList arrayList = new ArrayList(dyybVar2.a);
        dyybVar2.a.clear();
        return arrayList;
    }

    private final void c() {
        this.b.k();
        this.b.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(15:186|187|(1:189)|190|(2:192|(4:194|(3:196|(2:198|199)(2:201|202)|200)|203|(10:205|206|(1:208)|209|(1:211)|212|213|(1:215)|216|217))(2:224|225))|226|206|(0)|209|(0)|212|213|(0)|216|217) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03bc, code lost:
        throw defpackage.dyyi.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04af, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04b0, code lost:
        r3.a.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0462 A[Catch: all -> 0x04e1, TryCatch #2 {, blocks: (B:173:0x03ee, B:175:0x03f4, B:176:0x0400, B:178:0x0406, B:180:0x0414, B:182:0x0424, B:184:0x042a, B:186:0x0439, B:185:0x0434, B:192:0x045a, B:194:0x0462, B:195:0x0473, B:197:0x0483, B:198:0x04a9, B:201:0x04b0, B:203:0x04b7, B:204:0x04c2, B:205:0x04cb, B:189:0x0440, B:190:0x0458), top: B:358:0x03ee, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0483 A[Catch: all -> 0x04e1, TRY_LEAVE, TryCatch #2 {, blocks: (B:173:0x03ee, B:175:0x03f4, B:176:0x0400, B:178:0x0406, B:180:0x0414, B:182:0x0424, B:184:0x042a, B:186:0x0439, B:185:0x0434, B:192:0x045a, B:194:0x0462, B:195:0x0473, B:197:0x0483, B:198:0x04a9, B:201:0x04b0, B:203:0x04b7, B:204:0x04c2, B:205:0x04cb, B:189:0x0440, B:190:0x0458), top: B:358:0x03ee, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04b7 A[Catch: all -> 0x04e1, TryCatch #2 {, blocks: (B:173:0x03ee, B:175:0x03f4, B:176:0x0400, B:178:0x0406, B:180:0x0414, B:182:0x0424, B:184:0x042a, B:186:0x0439, B:185:0x0434, B:192:0x045a, B:194:0x0462, B:195:0x0473, B:197:0x0483, B:198:0x04a9, B:201:0x04b0, B:203:0x04b7, B:204:0x04c2, B:205:0x04cb, B:189:0x0440, B:190:0x0458), top: B:358:0x03ee, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0691 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.dyxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.dyxx r18) {
        /*
            Method dump skipped, instructions count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyyg.a(dyxx):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
