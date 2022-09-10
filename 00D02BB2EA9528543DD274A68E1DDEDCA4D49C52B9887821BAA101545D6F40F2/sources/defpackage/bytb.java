package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bytb  reason: default package */
/* loaded from: classes4.dex */
public final class bytb {
    private final bwqv a;
    private final btvo b;
    private final bwrj c;
    private bzjo d;

    public bytb(bwqv bwqvVar, btvo btvoVar, bwrj bwrjVar) {
        this.a = bwqvVar;
        this.b = btvoVar;
        this.c = bwrjVar;
    }

    private final synchronized void j() {
        bvrj.UI_THREAD.d();
        if (this.d == null) {
            bzjo bzjoVar = (bzjo) this.a.k(this.c, "2", (dssr) bzjo.e.cu(7));
            if (bzjoVar == null) {
                bzjm bZ = bzjo.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bzjo bzjoVar2 = (bzjo) bZ.b;
                bzjoVar2.a |= 1;
                bzjoVar2.c = 0;
                bzjoVar = bZ.bK();
            }
            dbsk.s(bzjoVar);
            this.d = bzjoVar;
        }
    }

    private final synchronized void k(long j) {
        j();
        Map unmodifiableMap = Collections.unmodifiableMap(this.d.b);
        String str = "";
        for (String str2 : unmodifiableMap.keySet()) {
            long j2 = ((bzip) unmodifiableMap.get(str2)).d;
            long j3 = j2 < j ? j2 : j;
            if (j2 < j) {
                str = str2;
            }
            j = j3;
        }
        bzjo bzjoVar = this.d;
        dsqp dsqpVar = (dsqp) bzjoVar.cu(5);
        dsqpVar.bC(bzjoVar);
        bzjm bzjmVar = (bzjm) dsqpVar;
        bzjo bzjoVar2 = this.d;
        int i = bzjoVar2.c;
        str.getClass();
        dssd<String, bzip> dssdVar = bzjoVar2.b;
        if (!dssdVar.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        int size = i - dssdVar.get(str).b.size();
        if (bzjmVar.c) {
            bzjmVar.bF();
            bzjmVar.c = false;
        }
        bzjo bzjoVar3 = (bzjo) bzjmVar.b;
        bzjoVar3.a |= 1;
        bzjoVar3.c = size;
        bzjmVar.b(str);
        this.d = bzjmVar.bK();
    }

    private final synchronized void l(Long l) {
        j();
        Map unmodifiableMap = Collections.unmodifiableMap(this.d.b);
        bzjo bzjoVar = this.d;
        dsqp dsqpVar = (dsqp) bzjoVar.cu(5);
        dsqpVar.bC(bzjoVar);
        bzjm bzjmVar = (bzjm) dsqpVar;
        int i = 0;
        for (String str : unmodifiableMap.keySet()) {
            bzip bzipVar = (bzip) unmodifiableMap.get(str);
            int a = bzio.a(bzipVar.c);
            if (a != 0 && a == 4) {
                bzim bZ = bzip.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bzip bzipVar2 = (bzip) bZ.b;
                bzipVar2.c = 3;
                bzipVar2.a |= 1;
                Iterator<Long> it = bzipVar.b.iterator();
                while (it.hasNext()) {
                    Long next = it.next();
                    Iterator<Long> it2 = it;
                    if (l.longValue() - next.longValue() >= TimeUnit.DAYS.toMillis(m().j)) {
                        i++;
                    } else {
                        bZ.a(next.longValue());
                    }
                    it = it2;
                }
                int i2 = bzipVar.e;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bzip bzipVar3 = (bzip) bZ.b;
                bzipVar3.a |= 4;
                bzipVar3.e = i2;
                bzip bK = bZ.bK();
                if (bK.b.size() == 0) {
                    bzjmVar.b(str);
                } else {
                    bzjmVar.a(str, bK);
                }
            }
        }
        int i3 = this.d.c - i;
        if (bzjmVar.c) {
            bzjmVar.bF();
            bzjmVar.c = false;
        }
        bzjo bzjoVar2 = (bzjo) bzjmVar.b;
        bzjoVar2.a |= 1;
        bzjoVar2.c = i3;
        this.d = bzjmVar.bK();
    }

    private final dkqz m() {
        dkqz dkqzVar = this.b.getNotificationsParameters().m;
        return dkqzVar == null ? dkqz.ap : dkqzVar;
    }

    public final synchronized boolean a(String str, long j) {
        j();
        if (!this.d.c(str)) {
            return false;
        }
        bzjo bzjoVar = this.d;
        str.getClass();
        dssd<String, bzip> dssdVar = bzjoVar.b;
        if (!dssdVar.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        bzip bzipVar = dssdVar.get(str);
        dsqp dsqpVar = (dsqp) bzipVar.cu(5);
        dsqpVar.bC(bzipVar);
        bzim bzimVar = (bzim) dsqpVar;
        if (bzimVar.c) {
            bzimVar.bF();
            bzimVar.c = false;
        }
        bzip bzipVar2 = (bzip) bzimVar.b;
        bzip bzipVar3 = bzip.f;
        bzipVar2.a |= 2;
        bzipVar2.d = j;
        bzjo bzjoVar2 = this.d;
        dsqp dsqpVar2 = (dsqp) bzjoVar2.cu(5);
        dsqpVar2.bC(bzjoVar2);
        bzjm bzjmVar = (bzjm) dsqpVar2;
        bzjmVar.a(str, bzimVar.bK());
        bzjo bK = bzjmVar.bK();
        this.d = bK;
        this.a.h(this.c, "2", bK);
        bzjo bzjoVar3 = this.d;
        str.getClass();
        dssd<String, bzip> dssdVar2 = bzjoVar3.b;
        if (!dssdVar2.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        int a = bzio.a(dssdVar2.get(str).c);
        return a != 0 && a == 3;
    }

    public final synchronized boolean b(String str) {
        boolean z;
        j();
        if (this.d.c(str)) {
            bzjo bzjoVar = this.d;
            str.getClass();
            dssd<String, bzip> dssdVar = bzjoVar.b;
            if (!dssdVar.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            int a = bzio.a(dssdVar.get(str).c);
            if (a != 0 && a == 2) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[Catch: all -> 0x01f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x001b, B:9:0x0027, B:13:0x0039, B:15:0x0042, B:17:0x004f, B:19:0x0063, B:21:0x0070, B:23:0x0085, B:25:0x009a, B:26:0x009f, B:28:0x00b5, B:29:0x00ba, B:31:0x00d1, B:32:0x00d6, B:60:0x01b0, B:62:0x01c9, B:63:0x01ce, B:33:0x00eb, B:34:0x00f0, B:35:0x00f1, B:36:0x00f6, B:37:0x00f7, B:38:0x00fc, B:39:0x00fd, B:41:0x0105, B:43:0x0112, B:45:0x012e, B:46:0x0133, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:52:0x015f, B:53:0x0166, B:55:0x0179, B:56:0x017e, B:58:0x0192, B:59:0x0197, B:10:0x0032, B:11:0x0037), top: B:71:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105 A[Catch: all -> 0x01f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x001b, B:9:0x0027, B:13:0x0039, B:15:0x0042, B:17:0x004f, B:19:0x0063, B:21:0x0070, B:23:0x0085, B:25:0x009a, B:26:0x009f, B:28:0x00b5, B:29:0x00ba, B:31:0x00d1, B:32:0x00d6, B:60:0x01b0, B:62:0x01c9, B:63:0x01ce, B:33:0x00eb, B:34:0x00f0, B:35:0x00f1, B:36:0x00f6, B:37:0x00f7, B:38:0x00fc, B:39:0x00fd, B:41:0x0105, B:43:0x0112, B:45:0x012e, B:46:0x0133, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:52:0x015f, B:53:0x0166, B:55:0x0179, B:56:0x017e, B:58:0x0192, B:59:0x0197, B:10:0x0032, B:11:0x0037), top: B:71:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f A[Catch: all -> 0x01f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x001b, B:9:0x0027, B:13:0x0039, B:15:0x0042, B:17:0x004f, B:19:0x0063, B:21:0x0070, B:23:0x0085, B:25:0x009a, B:26:0x009f, B:28:0x00b5, B:29:0x00ba, B:31:0x00d1, B:32:0x00d6, B:60:0x01b0, B:62:0x01c9, B:63:0x01ce, B:33:0x00eb, B:34:0x00f0, B:35:0x00f1, B:36:0x00f6, B:37:0x00f7, B:38:0x00fc, B:39:0x00fd, B:41:0x0105, B:43:0x0112, B:45:0x012e, B:46:0x0133, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:52:0x015f, B:53:0x0166, B:55:0x0179, B:56:0x017e, B:58:0x0192, B:59:0x0197, B:10:0x0032, B:11:0x0037), top: B:71:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9 A[Catch: all -> 0x01f1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x001b, B:9:0x0027, B:13:0x0039, B:15:0x0042, B:17:0x004f, B:19:0x0063, B:21:0x0070, B:23:0x0085, B:25:0x009a, B:26:0x009f, B:28:0x00b5, B:29:0x00ba, B:31:0x00d1, B:32:0x00d6, B:60:0x01b0, B:62:0x01c9, B:63:0x01ce, B:33:0x00eb, B:34:0x00f0, B:35:0x00f1, B:36:0x00f6, B:37:0x00f7, B:38:0x00fc, B:39:0x00fd, B:41:0x0105, B:43:0x0112, B:45:0x012e, B:46:0x0133, B:48:0x0149, B:49:0x014e, B:50:0x014f, B:52:0x015f, B:53:0x0166, B:55:0x0179, B:56:0x017e, B:58:0x0192, B:59:0x0197, B:10:0x0032, B:11:0x0037), top: B:71:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(java.lang.String r10, java.lang.Long r11) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bytb.c(java.lang.String, java.lang.Long):void");
    }

    public final synchronized boolean d(String str) {
        boolean z;
        j();
        bzjo bzjoVar = this.d;
        if (bzjoVar.d && bzjoVar.c(str)) {
            bzjo bzjoVar2 = this.d;
            str.getClass();
            dssd<String, bzip> dssdVar = bzjoVar2.b;
            if (!dssdVar.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            if (dssdVar.get(str).e == 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean e() {
        j();
        bzjo bzjoVar = this.d;
        if (bzjoVar.d) {
            if (bzjoVar.c % m().Y == 1) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void f() {
        j();
        bzjo bzjoVar = this.d;
        dsqp dsqpVar = (dsqp) bzjoVar.cu(5);
        dsqpVar.bC(bzjoVar);
        bzjm bzjmVar = (bzjm) dsqpVar;
        if (bzjmVar.c) {
            bzjmVar.bF();
            bzjmVar.c = false;
        }
        bzjo bzjoVar2 = (bzjo) bzjmVar.b;
        bzjo bzjoVar3 = bzjo.e;
        bzjoVar2.a |= 2;
        bzjoVar2.d = false;
        bzjo bK = bzjmVar.bK();
        this.d = bK;
        this.a.h(this.c, "2", bK);
    }

    public final synchronized void g(String str) {
        j();
        bzjo bzjoVar = this.d;
        str.getClass();
        dssd<String, bzip> dssdVar = bzjoVar.b;
        if (!dssdVar.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        bzip bzipVar = dssdVar.get(str);
        bzjo bzjoVar2 = this.d;
        dsqp dsqpVar = (dsqp) bzjoVar2.cu(5);
        dsqpVar.bC(bzjoVar2);
        bzjm bzjmVar = (bzjm) dsqpVar;
        int size = this.d.c - bzipVar.b.size();
        if (bzjmVar.c) {
            bzjmVar.bF();
            bzjmVar.c = false;
        }
        bzjo bzjoVar3 = (bzjo) bzjmVar.b;
        bzjoVar3.a |= 1;
        bzjoVar3.c = size;
        dsqp dsqpVar2 = (dsqp) bzipVar.cu(5);
        dsqpVar2.bC(bzipVar);
        bzim bzimVar = (bzim) dsqpVar2;
        if (bzimVar.c) {
            bzimVar.bF();
            bzimVar.c = false;
        }
        bzip bzipVar2 = (bzip) bzimVar.b;
        bzipVar2.c = 2;
        bzipVar2.a |= 1;
        bzjmVar.a(str, bzimVar.bK());
        bzjo bK = bzjmVar.bK();
        this.d = bK;
        this.a.h(this.c, "2", bK);
    }

    public final synchronized void h(String str) {
        j();
        bzjo bzjoVar = this.d;
        str.getClass();
        dssd<String, bzip> dssdVar = bzjoVar.b;
        if (!dssdVar.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        bzip bzipVar = dssdVar.get(str);
        bzjo bzjoVar2 = this.d;
        dsqp dsqpVar = (dsqp) bzjoVar2.cu(5);
        dsqpVar.bC(bzjoVar2);
        bzjm bzjmVar = (bzjm) dsqpVar;
        int size = this.d.c - bzipVar.b.size();
        if (bzjmVar.c) {
            bzjmVar.bF();
            bzjmVar.c = false;
        }
        bzjo bzjoVar3 = (bzjo) bzjmVar.b;
        bzjoVar3.a |= 1;
        bzjoVar3.c = size;
        dsqp dsqpVar2 = (dsqp) bzipVar.cu(5);
        dsqpVar2.bC(bzipVar);
        bzim bzimVar = (bzim) dsqpVar2;
        if (bzimVar.c) {
            bzimVar.bF();
            bzimVar.c = false;
        }
        bzip bzipVar2 = (bzip) bzimVar.b;
        bzipVar2.c = 1;
        bzipVar2.a |= 1;
        bzjmVar.a(str, bzimVar.bK());
        bzjo bK = bzjmVar.bK();
        this.d = bK;
        this.a.h(this.c, "2", bK);
    }

    public final synchronized void i() {
        j();
        bzjm bZ = bzjo.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bzjo bzjoVar = (bzjo) bZ.b;
        bzjoVar.a |= 1;
        bzjoVar.c = 0;
        bzjo bK = bZ.bK();
        this.d = bK;
        this.a.h(this.c, "2", bK);
    }
}
