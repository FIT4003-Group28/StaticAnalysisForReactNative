package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ari  reason: default package */
/* loaded from: classes2.dex */
public final class ari extends Handler {
    final /* synthetic */ arm a;
    private final ArrayList<are> b = new ArrayList<>();
    private final List<arq> c = new ArrayList();

    public ari(arm armVar) {
        this.a = armVar;
    }

    public final void a(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    public final void b(int i, Object obj, int i2) {
        Message obtainMessage = obtainMessage(i, obj);
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:35:0x00d6, B:36:0x00de, B:38:0x00e2, B:40:0x00f4, B:41:0x00fc, B:42:0x0104, B:44:0x010d, B:49:0x0127, B:53:0x0131, B:59:0x0149, B:61:0x014f, B:63:0x0153, B:65:0x0163, B:67:0x016a, B:71:0x0175, B:74:0x0184, B:75:0x0189, B:76:0x018e, B:77:0x0195, B:82:0x019d, B:83:0x01a1, B:57:0x0140, B:54:0x0135), top: B:91:0x00d6 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.handleMessage(android.os.Message):void");
    }
}
