package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ovx  reason: default package */
/* loaded from: classes4.dex */
public class ovx implements ovk, ovz {
    public final ovt a;
    public final int b;
    private final Handler c;
    private final pbl d;
    private final ovo e;
    private final pco g;
    private final owa h;
    private final long k;
    private final boolean m;
    private owf n;
    private owf o;
    private ovu p;
    private int q;
    private oun r;
    private boolean s;
    private boolean t;
    private boolean u;
    private IOException v;
    private final ovn f = new ovn();
    private final long[] l = new long[2];
    private final SparseArray j = new SparseArray();
    private final ArrayList i = new ArrayList();

    public ovx(pco pcoVar, owf owfVar, owa owaVar, pbl pblVar, ovo ovoVar, long j, boolean z, Handler handler, ovt ovtVar, int i) {
        this.g = pcoVar;
        this.n = owfVar;
        this.h = owaVar;
        this.d = pblVar;
        this.e = ovoVar;
        this.k = j;
        this.t = z;
        this.c = handler;
        this.a = ovtVar;
        this.b = i;
        this.m = owfVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str) {
        return "text/vtt".equals(str) || "application/ttml+xml".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean p(String str) {
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
    }

    private static MediaFormat q(int i, ovm ovmVar, String str, long j) {
        if (i != 0) {
            if (i == 1) {
                return MediaFormat.b(ovmVar.a, str, ovmVar.c, -1, j, ovmVar.g, ovmVar.h, null, ovmVar.j);
            }
            if (i == 2) {
                return MediaFormat.e(ovmVar.a, str, ovmVar.c, j, ovmVar.j);
            }
            return null;
        }
        return MediaFormat.j(ovmVar.a, str, ovmVar.c, j, ovmVar.d, ovmVar.e);
    }

    private static String r(ovm ovmVar) {
        String str = ovmVar.b;
        int i = 0;
        if (pcu.e(str)) {
            String str2 = ovmVar.i;
            if (str2 == null) {
                return "audio/x-unknown";
            }
            String[] split = str2.split(",");
            int length = split.length;
            while (i < length) {
                String trim = split[i].trim();
                if (trim.startsWith("mp4a")) {
                    return "audio/mp4a-latm";
                }
                if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
                    return "audio/ac3";
                }
                if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
                    return "audio/eac3";
                }
                if (trim.startsWith("dtsc")) {
                    return "audio/vnd.dts";
                }
                if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
                    return "audio/vnd.dts.hd";
                }
                if (trim.startsWith("dtse")) {
                    return "audio/vnd.dts.hd;profile=lbr";
                }
                if (trim.startsWith("opus")) {
                    return "audio/opus";
                }
                if (trim.startsWith("vorbis")) {
                    return "audio/vorbis";
                }
                i++;
            }
            return "audio/x-unknown";
        } else if (pcu.f(str)) {
            String str3 = ovmVar.i;
            if (str3 == null) {
                return "video/x-unknown";
            }
            String[] split2 = str3.split(",");
            int length2 = split2.length;
            while (i < length2) {
                String trim2 = split2[i].trim();
                if (trim2.startsWith("avc1") || trim2.startsWith("avc3")) {
                    return "video/avc";
                }
                if (trim2.startsWith("hev1") || trim2.startsWith("hvc1")) {
                    return "video/hevc";
                }
                if (trim2.startsWith("vp9")) {
                    return "video/x-vnd.on2.vp9";
                }
                if (trim2.startsWith("vp8")) {
                    return "video/x-vnd.on2.vp8";
                }
                i++;
            }
            return "video/x-unknown";
        } else if (m(str)) {
            return str;
        } else {
            if (!"application/mp4".equals(str)) {
                return null;
            }
            if ("stpp".equals(ovmVar.i)) {
                return "application/ttml+xml";
            }
            if (!"wvtt".equals(ovmVar.i)) {
                return null;
            }
            return "application/x-mp4vtt";
        }
    }

    private final void s(owf owfVar) {
        SparseArray sparseArray;
        oun oumVar;
        owi b = owfVar.b(0);
        while (this.j.size() > 0 && ((ovv) this.j.valueAt(0)).b < b.a * 1000) {
            this.j.remove(((ovv) this.j.valueAt(0)).a);
        }
        if (this.j.size() > owfVar.a()) {
            return;
        }
        try {
            int size = this.j.size();
            if (size > 0) {
                ((ovv) this.j.valueAt(0)).b(owfVar, 0, this.p);
                if (size > 1) {
                    int i = size - 1;
                    ((ovv) this.j.valueAt(i)).b(owfVar, i, this.p);
                }
            }
            for (int size2 = this.j.size(); size2 < owfVar.a(); size2++) {
                this.j.put(this.q, new ovv(this, this.q, owfVar, size2, this.p));
                this.q++;
            }
            long currentTimeMillis = System.currentTimeMillis() * 1000;
            ovv ovvVar = (ovv) this.j.valueAt(0);
            ovv ovvVar2 = (ovv) this.j.valueAt(sparseArray.size() - 1);
            if (!this.n.c || ovvVar2.f) {
                oumVar = new oum(ovvVar.g, ovvVar2.a());
            } else {
                long j = ovvVar.g;
                long a = ovvVar2.e ? Long.MAX_VALUE : ovvVar2.a();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                owf owfVar2 = this.n;
                long j2 = (elapsedRealtime * 1000) - (currentTimeMillis - (owfVar2.a * 1000));
                long j3 = owfVar2.e;
                oumVar = new oul(j, a, j2, j3 == -1 ? -1L : j3 * 1000);
            }
            oun ounVar = this.r;
            if (ounVar == null || !ounVar.equals(oumVar)) {
                this.r = oumVar;
                Handler handler = this.c;
                if (handler != null && this.a != null) {
                    handler.post(new ovs(this, oumVar));
                }
            }
            this.n = owfVar;
        } catch (osr e) {
            this.v = e;
        }
    }

    @Override // defpackage.ovk
    public final int a() {
        return this.i.size();
    }

    @Override // defpackage.ovk
    public final MediaFormat b(int i) {
        return ((ovu) this.i.get(i)).a;
    }

    @Override // defpackage.ovk
    public final void c(long j) {
        pco pcoVar = this.g;
        if (pcoVar == null || !this.n.c || this.v != null) {
            return;
        }
        Object obj = pcoVar.l;
        if (obj != null && obj != this.o) {
            owf owfVar = (owf) obj;
            s(owfVar);
            this.o = owfVar;
        }
        long j2 = this.n.d;
        if (j2 == 0) {
            j2 = 5000;
        }
        if (SystemClock.elapsedRealtime() <= this.g.m + j2) {
            return;
        }
        pco pcoVar2 = this.g;
        if (pcoVar2.k != null && SystemClock.elapsedRealtime() < pcoVar2.j + Math.min((pcoVar2.i - 1) * 1000, 5000L)) {
            return;
        }
        if (pcoVar2.f == null) {
            pcoVar2.f = new pbz("manifestLoader");
        }
        if (pcoVar2.f.b) {
            return;
        }
        pcoVar2.g = new pcc(pcoVar2.d, pcoVar2.b, pcoVar2.a);
        pcoVar2.h = SystemClock.elapsedRealtime();
        pcoVar2.f.d(pcoVar2.g, pcoVar2);
    }

    @Override // defpackage.ovk
    public final void d(List list) {
        pbz pbzVar;
        this.p.a();
        pco pcoVar = this.g;
        if (pcoVar != null) {
            int i = pcoVar.e - 1;
            pcoVar.e = i;
            if (i == 0 && (pbzVar = pcoVar.f) != null) {
                pbzVar.b();
                pcoVar.f = null;
            }
        }
        this.j.clear();
        this.f.c = null;
        this.r = null;
        this.v = null;
        this.p = null;
    }

    @Override // defpackage.ovk
    public final void e(int i) {
        ovu ovuVar = (ovu) this.i.get(i);
        this.p = ovuVar;
        ovuVar.a();
        pco pcoVar = this.g;
        if (pcoVar != null) {
            int i2 = pcoVar.e;
            pcoVar.e = i2 + 1;
            if (i2 == 0) {
                pcoVar.i = 0;
                pcoVar.k = null;
            }
            s((owf) pcoVar.l);
            return;
        }
        s(this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    @Override // defpackage.ovk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r24, long r25, defpackage.ove r27) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovx.f(java.util.List, long, ove):void");
    }

    @Override // defpackage.ovk
    public final void g() {
        pcm pcmVar;
        IOException iOException = this.v;
        if (iOException == null) {
            pco pcoVar = this.g;
            if (pcoVar != null && (pcmVar = pcoVar.k) != null && pcoVar.i > pcoVar.c) {
                throw pcmVar;
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.ovk
    public void h(ovb ovbVar) {
        owx owxVar;
        oye oyeVar;
        if (ovbVar instanceof ovp) {
            ovp ovpVar = (ovp) ovbVar;
            String str = ovpVar.c.a;
            ovv ovvVar = (ovv) this.j.get(ovpVar.e);
            if (ovvVar == null) {
                return;
            }
            ovw ovwVar = (ovw) ovvVar.c.get(str);
            MediaFormat mediaFormat = ovpVar.g;
            if (mediaFormat != null) {
                ovwVar.e = mediaFormat;
            }
            if (ovwVar.d == null && (oyeVar = ovpVar.i) != null) {
                ovpVar.d.a.toString();
                ovwVar.d = new owb((oxm) oyeVar);
            }
            if (ovvVar.d != null || (owxVar = ovpVar.h) == null) {
                return;
            }
            ovvVar.d = owxVar;
        }
    }

    @Override // defpackage.ovk
    public final void i(ovb ovbVar, Exception exc) {
    }

    @Override // defpackage.ovk
    public final boolean j() {
        if (!this.s) {
            this.s = true;
            try {
                this.h.a(this.n, this);
            } catch (IOException e) {
                this.v = e;
            }
        }
        return this.v == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ovb k(ovv ovvVar, ovw ovwVar, pbl pblVar, MediaFormat mediaFormat, ovu ovuVar, int i, int i2, boolean z) {
        owm owmVar = ovwVar.c;
        ovm ovmVar = owmVar.e;
        long c = ovwVar.c(i);
        long b = ovwVar.b(i);
        owj d = ovwVar.d(i);
        pbn pbnVar = new pbn(d.a(owmVar.g), d.a, d.b, owmVar.h);
        long j = ovvVar.b - owmVar.f;
        if (m(ovmVar.b)) {
            return new ovr(pblVar, pbnVar, ovmVar, c, b, i, ovuVar.a, ovvVar.a);
        }
        return new ovl(pblVar, pbnVar, i2, ovmVar, c, b, i, j, ovwVar.b, mediaFormat, ovuVar.b, ovuVar.c, ovvVar.d, z, ovvVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public oxq l(String str) {
        return p(str) ? new pbe(1) : new ozd();
    }

    @Override // defpackage.ovz
    public final void n(owf owfVar, int i, int[] iArr) {
        if (this.e == null) {
            Log.w("DashChunkSource", "Skipping adaptive track (missing format evaluator)");
            return;
        }
        owc owcVar = (owc) owfVar.b(0).b.get(i);
        int length = iArr.length;
        ovm[] ovmVarArr = new ovm[length];
        ovm ovmVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            ovm ovmVar2 = ((owm) owcVar.b.get(iArr[i4])).e;
            if (ovmVar == null || ovmVar2.e > i3) {
                ovmVar = ovmVar2;
            }
            i2 = Math.max(i2, ovmVar2.d);
            i3 = Math.max(i3, ovmVar2.e);
            ovmVarArr[i4] = ovmVar2;
        }
        Arrays.sort(ovmVarArr, new wd(11));
        long j = this.m ? -1L : owfVar.b * 1000;
        String r = r(ovmVar);
        if (r == null) {
            Log.w("DashChunkSource", "Skipped adaptive track (unknown media mime type)");
            return;
        }
        MediaFormat q = q(owcVar.a, ovmVar, r, j);
        if (q == null) {
            Log.w("DashChunkSource", "Skipped adaptive track (unknown media format)");
        } else {
            this.i.add(new ovu(new MediaFormat(null, q.b, -1, -1, q.e, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, true, q.j, q.k, -1, -1, -1, null, q.n, q.p), i, ovmVarArr, i2, i3));
        }
    }

    @Override // defpackage.ovz
    public final void o(owf owfVar, int i, int i2) {
        owc owcVar = (owc) owfVar.b(0).b.get(i);
        ovm ovmVar = ((owm) owcVar.b.get(i2)).e;
        String r = r(ovmVar);
        if (r == null) {
            String str = ovmVar.a;
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append("Skipped track ");
            sb.append(str);
            sb.append(" (unknown media mime type)");
            Log.w("DashChunkSource", sb.toString());
            return;
        }
        MediaFormat q = q(owcVar.a, ovmVar, r, owfVar.c ? -1L : owfVar.b * 1000);
        if (q == null) {
            String str2 = ovmVar.a;
            StringBuilder sb2 = new StringBuilder(str2.length() + 37);
            sb2.append("Skipped track ");
            sb2.append(str2);
            sb2.append(" (unknown media format)");
            Log.w("DashChunkSource", sb2.toString());
            return;
        }
        this.i.add(new ovu(q, i, ovmVar));
    }
}
