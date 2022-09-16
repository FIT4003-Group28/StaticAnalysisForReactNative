package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aezr  reason: default package */
/* loaded from: classes.dex */
final class aezr implements pry, aeyu {
    private final PlayerConfigModel a;
    private final String b;
    private final FormatStreamModel[] c;
    private final asv e;
    private final pvf f;
    private final aezc g;
    private psb i;
    private final yrj j;
    private final aexg[] k;
    private final afjz l;
    private final Map d = new HashMap();
    private final Map h = new HashMap();

    public aezr(PlayerConfigModel playerConfigModel, FormatStreamModel[] formatStreamModelArr, afjm afjmVar, atk atkVar, pvf pvfVar, String str, int i, aexg[] aexgVarArr, yrj yrjVar, afjz afjzVar) {
        afms.b(formatStreamModelArr.length > 0);
        for (int i2 = 0; i2 < pvfVar.m(); i2++) {
            FormatStreamModel formatStreamModel = formatStreamModelArr[pvfVar.j(i2)];
            boolean L = formatStreamModel.L();
            String str2 = formatStreamModel.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 19);
            sb.append("Format ");
            sb.append(str2);
            sb.append(" is not OTF.");
            afms.c(L, sb.toString());
        }
        this.a = playerConfigModel;
        this.b = str;
        asv c = afjmVar.c(afjp.m, str, ampq.i(formatStreamModelArr[0].b));
        this.e = c;
        if (atkVar != null) {
            c.b(atkVar);
        }
        this.f = pvfVar;
        this.g = new aezc();
        this.c = formatStreamModelArr;
        this.k = aexgVarArr;
        this.j = yrjVar;
        this.l = afjzVar;
        for (FormatStreamModel formatStreamModel2 : formatStreamModelArr) {
            Format m = formatStreamModel2.m();
            this.d.put(m, new prt(agel.q(formatStreamModel2.v(), amvn.r("http://youtube.com/streaming/otf/durations/112015"), this), i, m));
        }
    }

    @Override // defpackage.pry
    public final int a(long j, List list) {
        return this.f.a(j, list);
    }

    @Override // defpackage.pry
    public final long b(long j, pkh pkhVar) {
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:9:0x0033, B:11:0x0048, B:13:0x0058, B:15:0x0062, B:16:0x0065, B:14:0x005d, B:17:0x0066, B:19:0x0072, B:21:0x0082, B:23:0x008c, B:24:0x008f, B:22:0x0087, B:25:0x0090, B:29:0x009e, B:68:0x0157, B:70:0x017e, B:72:0x0223, B:71:0x01c6, B:33:0x00bc, B:35:0x00c2, B:38:0x00c8, B:40:0x00d0, B:42:0x00de, B:48:0x00ee, B:51:0x00f8, B:52:0x011a, B:54:0x0122, B:57:0x012d, B:59:0x0134, B:60:0x0137), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8 A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:9:0x0033, B:11:0x0048, B:13:0x0058, B:15:0x0062, B:16:0x0065, B:14:0x005d, B:17:0x0066, B:19:0x0072, B:21:0x0082, B:23:0x008c, B:24:0x008f, B:22:0x0087, B:25:0x0090, B:29:0x009e, B:68:0x0157, B:70:0x017e, B:72:0x0223, B:71:0x01c6, B:33:0x00bc, B:35:0x00c2, B:38:0x00c8, B:40:0x00d0, B:42:0x00de, B:48:0x00ee, B:51:0x00f8, B:52:0x011a, B:54:0x0122, B:57:0x012d, B:59:0x0134, B:60:0x0137), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:9:0x0033, B:11:0x0048, B:13:0x0058, B:15:0x0062, B:16:0x0065, B:14:0x005d, B:17:0x0066, B:19:0x0072, B:21:0x0082, B:23:0x008c, B:24:0x008f, B:22:0x0087, B:25:0x0090, B:29:0x009e, B:68:0x0157, B:70:0x017e, B:72:0x0223, B:71:0x01c6, B:33:0x00bc, B:35:0x00c2, B:38:0x00c8, B:40:0x00d0, B:42:0x00de, B:48:0x00ee, B:51:0x00f8, B:52:0x011a, B:54:0x0122, B:57:0x012d, B:59:0x0134, B:60:0x0137), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:9:0x0033, B:11:0x0048, B:13:0x0058, B:15:0x0062, B:16:0x0065, B:14:0x005d, B:17:0x0066, B:19:0x0072, B:21:0x0082, B:23:0x008c, B:24:0x008f, B:22:0x0087, B:25:0x0090, B:29:0x009e, B:68:0x0157, B:70:0x017e, B:72:0x0223, B:71:0x01c6, B:33:0x00bc, B:35:0x00c2, B:38:0x00c8, B:40:0x00d0, B:42:0x00de, B:48:0x00ee, B:51:0x00f8, B:52:0x011a, B:54:0x0122, B:57:0x012d, B:59:0x0134, B:60:0x0137), top: B:80:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6 A[Catch: all -> 0x0229, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x002f, B:9:0x0033, B:11:0x0048, B:13:0x0058, B:15:0x0062, B:16:0x0065, B:14:0x005d, B:17:0x0066, B:19:0x0072, B:21:0x0082, B:23:0x008c, B:24:0x008f, B:22:0x0087, B:25:0x0090, B:29:0x009e, B:68:0x0157, B:70:0x017e, B:72:0x0223, B:71:0x01c6, B:33:0x00bc, B:35:0x00c2, B:38:0x00c8, B:40:0x00d0, B:42:0x00de, B:48:0x00ee, B:51:0x00f8, B:52:0x011a, B:54:0x0122, B:57:0x012d, B:59:0x0134, B:60:0x0137), top: B:80:0x0009 }] */
    @Override // defpackage.pry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(long r26, long r28, java.util.List r30, defpackage.prw r31) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aezr.c(long, long, java.util.List, prw):void");
    }

    @Override // defpackage.pry
    public final void d() {
    }

    @Override // defpackage.pry
    public final void e(pru pruVar) {
    }

    @Override // defpackage.pry
    public final void f() {
        for (prt prtVar : this.d.values()) {
            prtVar.f();
        }
    }

    @Override // defpackage.pry
    public final synchronized boolean g(pru pruVar, boolean z, axr axrVar, axs axsVar) {
        if (!z) {
            return false;
        }
        axq b = axsVar.b(afbx.d(this.f), axrVar);
        if (this.l.Q() && b != null) {
            pvf pvfVar = this.f;
            if (pvfVar.q(pvfVar.l(pruVar.h), b.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pry
    public final void h() {
    }

    @Override // defpackage.aeyu
    public final synchronized void i(aeui aeuiVar) {
        if (this.i instanceof aezt) {
            this.h.put(this.i.h, aezu.b(aeuiVar));
        }
    }

    @Override // defpackage.aeyu
    public final synchronized void j(IOException iOException) {
        this.g.c = iOException;
    }
}
