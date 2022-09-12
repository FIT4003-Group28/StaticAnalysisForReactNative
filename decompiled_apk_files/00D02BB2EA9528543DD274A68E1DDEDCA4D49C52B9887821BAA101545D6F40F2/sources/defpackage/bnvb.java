package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnvb  reason: default package */
/* loaded from: classes.dex */
public final class bnvb {
    private final bnvd a;
    private final SparseArray<bnve> b;
    private final ArrayList<bnve> c;

    public bnvb(String str, int i, int i2, int i3, int i4) {
        bnvd bnvdVar = new bnvd(str, i, i2, i3, i4);
        this.b = new SparseArray<>();
        this.c = new ArrayList<>();
        this.a = bnvdVar;
    }

    public final synchronized bntc a() {
        return this.a.g;
    }

    public final synchronized int b() {
        bnvd bnvdVar;
        bnvdVar = this.a;
        return bnvdVar.f.a * bnvdVar.d;
    }

    public final synchronized int c() {
        return this.a.a();
    }

    public final synchronized int d() {
        return this.a.h;
    }

    public final synchronized int e() {
        return this.a.i;
    }

    @dzsi
    public final synchronized bnve f(int i) {
        bnve bnveVar;
        bnveVar = this.b.get(i);
        if (bnveVar != null) {
            bnvc h = this.a.h(Integer.valueOf(bnveVar.a));
            dbsk.s(h);
            boolean z = false;
            dbsk.l(h.a != -1);
            if (h.c > 0) {
                z = true;
            }
            dbsk.l(z);
            h.c++;
        }
        return bnveVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0142 A[Catch: all -> 0x0188, TryCatch #0 {, blocks: (B:3:0x0001, B:64:0x016b, B:68:0x0171, B:70:0x0178, B:6:0x0020, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:14:0x0051, B:16:0x005b, B:17:0x0065, B:18:0x0092, B:22:0x00a0, B:26:0x00af, B:30:0x00e1, B:34:0x00ed, B:39:0x0116, B:43:0x0122, B:45:0x012b, B:50:0x0133, B:52:0x0142, B:54:0x0146, B:56:0x014b, B:57:0x014e, B:59:0x0156, B:63:0x0166, B:60:0x015a, B:62:0x0160), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146 A[Catch: all -> 0x0188, TryCatch #0 {, blocks: (B:3:0x0001, B:64:0x016b, B:68:0x0171, B:70:0x0178, B:6:0x0020, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:14:0x0051, B:16:0x005b, B:17:0x0065, B:18:0x0092, B:22:0x00a0, B:26:0x00af, B:30:0x00e1, B:34:0x00ed, B:39:0x0116, B:43:0x0122, B:45:0x012b, B:50:0x0133, B:52:0x0142, B:54:0x0146, B:56:0x014b, B:57:0x014e, B:59:0x0156, B:63:0x0166, B:60:0x015a, B:62:0x0160), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b A[Catch: all -> 0x0188, TryCatch #0 {, blocks: (B:3:0x0001, B:64:0x016b, B:68:0x0171, B:70:0x0178, B:6:0x0020, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:14:0x0051, B:16:0x005b, B:17:0x0065, B:18:0x0092, B:22:0x00a0, B:26:0x00af, B:30:0x00e1, B:34:0x00ed, B:39:0x0116, B:43:0x0122, B:45:0x012b, B:50:0x0133, B:52:0x0142, B:54:0x0146, B:56:0x014b, B:57:0x014e, B:59:0x0156, B:63:0x0166, B:60:0x015a, B:62:0x0160), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156 A[Catch: all -> 0x0188, TryCatch #0 {, blocks: (B:3:0x0001, B:64:0x016b, B:68:0x0171, B:70:0x0178, B:6:0x0020, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:14:0x0051, B:16:0x005b, B:17:0x0065, B:18:0x0092, B:22:0x00a0, B:26:0x00af, B:30:0x00e1, B:34:0x00ed, B:39:0x0116, B:43:0x0122, B:45:0x012b, B:50:0x0133, B:52:0x0142, B:54:0x0146, B:56:0x014b, B:57:0x014e, B:59:0x0156, B:63:0x0166, B:60:0x015a, B:62:0x0160), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a A[Catch: all -> 0x0188, TryCatch #0 {, blocks: (B:3:0x0001, B:64:0x016b, B:68:0x0171, B:70:0x0178, B:6:0x0020, B:8:0x002e, B:10:0x0032, B:12:0x003a, B:14:0x0051, B:16:0x005b, B:17:0x0065, B:18:0x0092, B:22:0x00a0, B:26:0x00af, B:30:0x00e1, B:34:0x00ed, B:39:0x0116, B:43:0x0122, B:45:0x012b, B:50:0x0133, B:52:0x0142, B:54:0x0146, B:56:0x014b, B:57:0x014e, B:59:0x0156, B:63:0x0166, B:60:0x015a, B:62:0x0160), top: B:78:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(defpackage.bnve r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnvb.g(bnve):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r2 > r3) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h() {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnvb.h():void");
    }

    public final synchronized void i(bntb bntbVar) {
        bnvd bnvdVar = this.a;
        bnvdVar.b = null;
        bnvdVar.g = bntc.a;
        for (int i = 0; i < bnvdVar.k.size(); i++) {
            bnvc valueAt = bnvdVar.k.valueAt(i);
            valueAt.b = null;
            int i2 = valueAt.a;
            if (i2 >= 0) {
                bnvdVar.f.C(i2, false);
            }
        }
        bnvdVar.m = 0;
        bnvd bnvdVar2 = this.a;
        bnvdVar2.b = bntbVar;
        bnvdVar2.c = bnta.a().b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
        if (r7 == (-1)) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[Catch: all -> 0x0150, TryCatch #0 {, blocks: (B:4:0x0004, B:8:0x0011, B:10:0x002d, B:14:0x0034, B:18:0x003e, B:22:0x004c, B:25:0x0058, B:61:0x0128, B:26:0x0065, B:28:0x006f, B:33:0x0079, B:35:0x0084, B:37:0x0094, B:39:0x00a1, B:42:0x00ac, B:44:0x00b7, B:48:0x00c6, B:52:0x0102, B:55:0x011f), top: B:67:0x0004 }] */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.bnve j(android.graphics.Bitmap r15, int r16, int r17, int r18, float r19) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnvb.j(android.graphics.Bitmap, int, int, int, float):bnve");
    }
}
