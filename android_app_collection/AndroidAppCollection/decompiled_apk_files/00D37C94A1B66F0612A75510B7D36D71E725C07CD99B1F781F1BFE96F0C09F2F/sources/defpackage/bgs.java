package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgs  reason: default package */
/* loaded from: classes2.dex */
public final class bgs extends Handler {
    final /* synthetic */ bgw a;
    private final ArrayList b = new ArrayList();
    private final List c = new ArrayList();

    public bgs(bgw bgwVar) {
        this.a = bgwVar;
    }

    public final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void b(int i, Object obj, int i2) {
        Message obtainMessage = obtainMessage(i, obj);
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183 A[Catch: all -> 0x0194, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187 A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #0 {all -> 0x0194, blocks: (B:26:0x00a7, B:27:0x00af, B:29:0x00b3, B:31:0x00c5, B:32:0x00cd, B:33:0x00d5, B:35:0x00de, B:45:0x0102, B:46:0x010a, B:47:0x010d, B:49:0x0112, B:50:0x0117, B:51:0x011c, B:55:0x0126, B:63:0x0141, B:65:0x0148, B:68:0x0151, B:70:0x0157, B:75:0x0163, B:79:0x016b, B:81:0x016f, B:82:0x0173, B:83:0x0177, B:84:0x017b, B:85:0x017f, B:86:0x0183, B:87:0x0187, B:61:0x0138, B:56:0x012a), top: B:95:0x00a7 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgs.handleMessage(android.os.Message):void");
    }
}
