package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ubq  reason: default package */
/* loaded from: classes4.dex */
public final class ubq implements Runnable, Delayed {
    final /* synthetic */ ubm a;
    final /* synthetic */ ubt b;

    public ubq() {
    }

    public ubq(ubt ubtVar, ubm ubmVar) {
        this.b = ubtVar;
        this.a = ubmVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c2 A[Catch: all -> 0x01ab, IOException -> 0x01af, RuntimeException -> 0x01b1, TryCatch #38 {IOException -> 0x01af, blocks: (B:38:0x008b, B:41:0x009b, B:43:0x00a9, B:45:0x00b4, B:46:0x00bd, B:44:0x00ae, B:50:0x00c5, B:51:0x00d5, B:53:0x00d8, B:58:0x00ec, B:56:0x00e4, B:59:0x00ef, B:60:0x0126, B:62:0x0129, B:64:0x0137, B:66:0x0142, B:67:0x014b, B:65:0x013c, B:69:0x014d, B:70:0x0151, B:72:0x015d, B:73:0x0160, B:75:0x0167, B:98:0x01b8, B:100:0x01c2, B:102:0x01c8, B:103:0x01cb, B:105:0x01d9, B:107:0x01e3, B:106:0x01de, B:83:0x0188, B:85:0x0196, B:87:0x01a1, B:88:0x01aa, B:86:0x019b, B:121:0x0200, B:123:0x020c, B:124:0x020f, B:145:0x0262, B:146:0x0263, B:148:0x026f, B:150:0x027a, B:149:0x0274), top: B:411:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04c6 A[Catch: all -> 0x0527, TryCatch #4 {all -> 0x0527, blocks: (B:339:0x04c0, B:341:0x04c6, B:343:0x04d2, B:344:0x04d5, B:346:0x04dd, B:348:0x04e3, B:350:0x04ef, B:352:0x04f6, B:354:0x0501, B:355:0x050a, B:359:0x0512), top: B:386:0x04c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04dd A[Catch: all -> 0x0527, TryCatch #4 {all -> 0x0527, blocks: (B:339:0x04c0, B:341:0x04c6, B:343:0x04d2, B:344:0x04d5, B:346:0x04dd, B:348:0x04e3, B:350:0x04ef, B:352:0x04f6, B:354:0x0501, B:355:0x050a, B:359:0x0512), top: B:386:0x04c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:312:0x0498 -> B:313:0x0499). Please submit an issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubq.run():void");
    }
}
