package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: bvf  reason: default package */
/* loaded from: classes2.dex */
public final class bvf implements Runnable {
    private static final String b = bqf.b("EnqueueRunnable");
    public final bqw a = new bqw();
    private final brb c;

    public bvf(brb brbVar) {
        this.c = brbVar;
    }

    private static void a(bum bumVar) {
        bpu bpuVar = bumVar.k;
        String str = bumVar.d;
        if (!str.equals(ConstraintTrackingWorker.class.getName())) {
            if (!bpuVar.d && !bpuVar.e) {
                return;
            }
            HashMap hashMap = new HashMap();
            bpd.b(bumVar.f.b, hashMap);
            bpd.d("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str, hashMap);
            bumVar.d = ConstraintTrackingWorker.class.getName();
            bumVar.f = bpd.a(hashMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff A[Catch: all -> 0x038f, TryCatch #10 {all -> 0x038f, blocks: (B:183:0x035d, B:116:0x01f5, B:117:0x01f9, B:119:0x01ff, B:123:0x020d, B:132:0x022c, B:134:0x0232, B:136:0x0238, B:146:0x0267, B:150:0x0271, B:152:0x0298, B:154:0x02a1, B:156:0x02a5, B:158:0x02ca, B:162:0x02db, B:163:0x02e3, B:165:0x02e9, B:167:0x0310, B:172:0x031f, B:174:0x0340, B:137:0x023c, B:140:0x0244, B:141:0x024e, B:143:0x0254, B:145:0x0264, B:126:0x0214, B:127:0x0218, B:128:0x021d, B:130:0x0225, B:131:0x0228, B:69:0x014c, B:71:0x0152, B:73:0x0159, B:80:0x0176, B:82:0x017e, B:86:0x0188, B:92:0x0195, B:72:0x0156, B:103:0x01bb, B:104:0x01c7, B:106:0x01cd, B:107:0x01d9, B:108:0x01de, B:151:0x0288, B:74:0x0165, B:76:0x016b, B:157:0x02c0, B:173:0x0336, B:166:0x0306), top: B:211:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0381  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvf.run():void");
    }
}
