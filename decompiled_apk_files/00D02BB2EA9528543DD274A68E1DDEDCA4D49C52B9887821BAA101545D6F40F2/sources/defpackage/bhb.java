package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;
/* compiled from: PG */
/* renamed from: bhb  reason: default package */
/* loaded from: classes3.dex */
public final class bhb implements Runnable {
    public final bcu a = new bcu();
    private final bcz b;

    static {
        bbz.f("EnqueueRunnable");
    }

    public bhb(bcz bczVar) {
        this.b = bczVar;
    }

    private static void a(bgh bghVar) {
        bbl bblVar = bghVar.i;
        if (bblVar.d || bblVar.e) {
            String str = bghVar.b;
            bbo bboVar = new bbo();
            bboVar.b(bghVar.d.b);
            bboVar.e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            bghVar.b = ConstraintTrackingWorker.class.getName();
            bghVar.d = bboVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01e3 A[Catch: all -> 0x027a, TRY_LEAVE, TryCatch #3 {all -> 0x027f, blocks: (B:3:0x0002, B:4:0x0016, B:6:0x001e, B:9:0x002b, B:10:0x003c, B:11:0x003d, B:122:0x0254, B:124:0x0259, B:125:0x0272, B:12:0x004b, B:14:0x0069, B:19:0x0071, B:21:0x007b, B:23:0x0087, B:121:0x024f, B:25:0x0095, B:29:0x009d, B:35:0x00aa, B:37:0x00b4, B:40:0x00be, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:52:0x00ec, B:53:0x00fc, B:55:0x0102, B:58:0x0112, B:59:0x0116, B:61:0x011c, B:65:0x012a, B:75:0x014a, B:77:0x0150, B:79:0x0156, B:89:0x0185, B:93:0x018f, B:95:0x019b, B:97:0x019f, B:99:0x01c4, B:103:0x01d5, B:104:0x01dd, B:106:0x01e3, B:108:0x020a, B:113:0x0219, B:115:0x023a, B:80:0x015a, B:83:0x0162, B:84:0x016c, B:86:0x0172, B:88:0x0182, B:69:0x0133, B:70:0x0137, B:71:0x013b, B:73:0x0141, B:74:0x0144, B:114:0x0230, B:107:0x0200, B:98:0x01ba), top: B:136:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0219 A[Catch: all -> 0x027a, TRY_LEAVE, TryCatch #3 {all -> 0x027f, blocks: (B:3:0x0002, B:4:0x0016, B:6:0x001e, B:9:0x002b, B:10:0x003c, B:11:0x003d, B:122:0x0254, B:124:0x0259, B:125:0x0272, B:12:0x004b, B:14:0x0069, B:19:0x0071, B:21:0x007b, B:23:0x0087, B:121:0x024f, B:25:0x0095, B:29:0x009d, B:35:0x00aa, B:37:0x00b4, B:40:0x00be, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:52:0x00ec, B:53:0x00fc, B:55:0x0102, B:58:0x0112, B:59:0x0116, B:61:0x011c, B:65:0x012a, B:75:0x014a, B:77:0x0150, B:79:0x0156, B:89:0x0185, B:93:0x018f, B:95:0x019b, B:97:0x019f, B:99:0x01c4, B:103:0x01d5, B:104:0x01dd, B:106:0x01e3, B:108:0x020a, B:113:0x0219, B:115:0x023a, B:80:0x015a, B:83:0x0162, B:84:0x016c, B:86:0x0172, B:88:0x0182, B:69:0x0133, B:70:0x0137, B:71:0x013b, B:73:0x0141, B:74:0x0144, B:114:0x0230, B:107:0x0200, B:98:0x01ba), top: B:136:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0259 A[Catch: all -> 0x027f, TryCatch #3 {all -> 0x027f, blocks: (B:3:0x0002, B:4:0x0016, B:6:0x001e, B:9:0x002b, B:10:0x003c, B:11:0x003d, B:122:0x0254, B:124:0x0259, B:125:0x0272, B:12:0x004b, B:14:0x0069, B:19:0x0071, B:21:0x007b, B:23:0x0087, B:121:0x024f, B:25:0x0095, B:29:0x009d, B:35:0x00aa, B:37:0x00b4, B:40:0x00be, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:52:0x00ec, B:53:0x00fc, B:55:0x0102, B:58:0x0112, B:59:0x0116, B:61:0x011c, B:65:0x012a, B:75:0x014a, B:77:0x0150, B:79:0x0156, B:89:0x0185, B:93:0x018f, B:95:0x019b, B:97:0x019f, B:99:0x01c4, B:103:0x01d5, B:104:0x01dd, B:106:0x01e3, B:108:0x020a, B:113:0x0219, B:115:0x023a, B:80:0x015a, B:83:0x0162, B:84:0x016c, B:86:0x0172, B:88:0x0182, B:69:0x0133, B:70:0x0137, B:71:0x013b, B:73:0x0141, B:74:0x0144, B:114:0x0230, B:107:0x0200, B:98:0x01ba), top: B:136:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c A[Catch: all -> 0x027a, TryCatch #3 {all -> 0x027f, blocks: (B:3:0x0002, B:4:0x0016, B:6:0x001e, B:9:0x002b, B:10:0x003c, B:11:0x003d, B:122:0x0254, B:124:0x0259, B:125:0x0272, B:12:0x004b, B:14:0x0069, B:19:0x0071, B:21:0x007b, B:23:0x0087, B:121:0x024f, B:25:0x0095, B:29:0x009d, B:35:0x00aa, B:37:0x00b4, B:40:0x00be, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:52:0x00ec, B:53:0x00fc, B:55:0x0102, B:58:0x0112, B:59:0x0116, B:61:0x011c, B:65:0x012a, B:75:0x014a, B:77:0x0150, B:79:0x0156, B:89:0x0185, B:93:0x018f, B:95:0x019b, B:97:0x019f, B:99:0x01c4, B:103:0x01d5, B:104:0x01dd, B:106:0x01e3, B:108:0x020a, B:113:0x0219, B:115:0x023a, B:80:0x015a, B:83:0x0162, B:84:0x016c, B:86:0x0172, B:88:0x0182, B:69:0x0133, B:70:0x0137, B:71:0x013b, B:73:0x0141, B:74:0x0144, B:114:0x0230, B:107:0x0200, B:98:0x01ba), top: B:136:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b A[Catch: all -> 0x027a, TryCatch #3 {all -> 0x027f, blocks: (B:3:0x0002, B:4:0x0016, B:6:0x001e, B:9:0x002b, B:10:0x003c, B:11:0x003d, B:122:0x0254, B:124:0x0259, B:125:0x0272, B:12:0x004b, B:14:0x0069, B:19:0x0071, B:21:0x007b, B:23:0x0087, B:121:0x024f, B:25:0x0095, B:29:0x009d, B:35:0x00aa, B:37:0x00b4, B:40:0x00be, B:44:0x00cf, B:45:0x00d3, B:47:0x00d9, B:52:0x00ec, B:53:0x00fc, B:55:0x0102, B:58:0x0112, B:59:0x0116, B:61:0x011c, B:65:0x012a, B:75:0x014a, B:77:0x0150, B:79:0x0156, B:89:0x0185, B:93:0x018f, B:95:0x019b, B:97:0x019f, B:99:0x01c4, B:103:0x01d5, B:104:0x01dd, B:106:0x01e3, B:108:0x020a, B:113:0x0219, B:115:0x023a, B:80:0x015a, B:83:0x0162, B:84:0x016c, B:86:0x0172, B:88:0x0182, B:69:0x0133, B:70:0x0137, B:71:0x013b, B:73:0x0141, B:74:0x0144, B:114:0x0230, B:107:0x0200, B:98:0x01ba), top: B:136:0x0002 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhb.run():void");
    }
}