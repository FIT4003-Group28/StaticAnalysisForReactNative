package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deu  reason: default package */
/* loaded from: classes3.dex */
public final class deu {
    private static final Rect d = new Rect();
    public final dbd a;
    public List c;
    public final Rect b = new Rect();
    private final Map e = new HashMap();

    public deu(dbd dbdVar) {
        this.a = dbdVar;
    }

    private static int c(Rect rect) {
        if (rect.isEmpty()) {
            return 0;
        }
        return rect.width() * rect.height();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.e.keySet()) {
            des desVar = (des) this.e.get(str);
            if (desVar.d) {
                desVar.d = false;
            } else {
                arrayList.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            des desVar2 = (des) this.e.get(str2);
            daq daqVar = desVar2.a;
            daq daqVar2 = desVar2.b;
            daq daqVar3 = desVar2.c;
            if (daqVar != null) {
                czu.j(daqVar, this.a);
            }
            if (desVar2.c()) {
                desVar2.a(false);
                if (daqVar2 != null) {
                    czu.k(daqVar2);
                }
            }
            if (daqVar3 != null) {
                czu.l(daqVar3, 0, 0, 0.0f, 0.0f);
            }
            desVar2.e = false;
            this.e.remove(str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        if (r9.equals(r0) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0019, B:11:0x002f, B:19:0x0042, B:21:0x0050, B:22:0x0052, B:24:0x0064, B:26:0x006a, B:28:0x006e, B:31:0x007a, B:33:0x0081, B:35:0x0087, B:37:0x008e, B:38:0x0091, B:43:0x00a3, B:45:0x00b5, B:71:0x0118, B:73:0x011e, B:75:0x0129, B:77:0x012e, B:79:0x0154, B:51:0x00ca, B:65:0x0107, B:67:0x010d, B:69:0x0113, B:54:0x00d8, B:60:0x00f7, B:62:0x00fd, B:64:0x0103, B:58:0x00f1, B:39:0x0098, B:15:0x0037, B:10:0x0029, B:81:0x0161), top: B:90:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129 A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0019, B:11:0x002f, B:19:0x0042, B:21:0x0050, B:22:0x0052, B:24:0x0064, B:26:0x006a, B:28:0x006e, B:31:0x007a, B:33:0x0081, B:35:0x0087, B:37:0x008e, B:38:0x0091, B:43:0x00a3, B:45:0x00b5, B:71:0x0118, B:73:0x011e, B:75:0x0129, B:77:0x012e, B:79:0x0154, B:51:0x00ca, B:65:0x0107, B:67:0x010d, B:69:0x0113, B:54:0x00d8, B:60:0x00f7, B:62:0x00fd, B:64:0x0103, B:58:0x00f1, B:39:0x0098, B:15:0x0037, B:10:0x0029, B:81:0x0161), top: B:90:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e A[Catch: all -> 0x016e, TryCatch #0 {, blocks: (B:5:0x000a, B:7:0x0019, B:11:0x002f, B:19:0x0042, B:21:0x0050, B:22:0x0052, B:24:0x0064, B:26:0x006a, B:28:0x006e, B:31:0x007a, B:33:0x0081, B:35:0x0087, B:37:0x008e, B:38:0x0091, B:43:0x00a3, B:45:0x00b5, B:71:0x0118, B:73:0x011e, B:75:0x0129, B:77:0x012e, B:79:0x0154, B:51:0x00ca, B:65:0x0107, B:67:0x010d, B:69:0x0113, B:54:0x00d8, B:60:0x00f7, B:62:0x00fd, B:64:0x0103, B:58:0x00f1, B:39:0x0098, B:15:0x0037, B:10:0x0029, B:81:0x0161), top: B:90:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Rect r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.b(android.graphics.Rect, boolean):void");
    }
}
