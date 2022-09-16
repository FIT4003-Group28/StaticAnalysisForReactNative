package defpackage;

import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: pej  reason: default package */
/* loaded from: classes4.dex */
public final class pej implements pne {
    public final pnw a;
    public final byte[] b;
    public final int c;
    public final pel d;
    public final int e;
    public final pdz f;
    final UUID g;
    final pei h;
    public byte[] j;
    public byte[] k;
    public final int l;
    final aesn m;
    private final String n;
    private final HashMap o;
    private final pej q;
    private int r;
    private HandlerThread s;
    private peh t;
    private ExoMediaCrypto u;
    private pnd v;
    private final pep w;
    private final long x;
    private final pek y;
    public int i = 2;
    private final pvv p = new pvv();

    public pej(UUID uuid, pnw pnwVar, byte[] bArr, String str, int i, byte[] bArr2, HashMap hashMap, aesn aesnVar, pep pepVar, Looper looper, pel pelVar, long j, int i2, int i3, pdz pdzVar, pej pejVar, pek pekVar) {
        String str2;
        this.g = uuid;
        this.a = pnwVar;
        this.c = i;
        this.k = bArr2;
        this.o = hashMap;
        this.m = aesnVar;
        this.d = pelVar;
        this.f = pdzVar;
        this.q = pejVar;
        this.y = pekVar;
        this.w = pepVar;
        this.x = j;
        this.e = i2;
        this.l = i3;
        this.h = new pei(this, looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.s = handlerThread;
        handlerThread.start();
        this.t = new peh(this, this.s.getLooper());
        if (bArr2 == null) {
            this.b = bArr;
            str2 = str;
        } else {
            str2 = null;
            this.b = null;
        }
        this.n = str2;
    }

    private final boolean u() {
        try {
            pnw pnwVar = this.a;
            ((pob) pnwVar).b.restoreKeys(this.j, this.k);
            return true;
        } catch (Exception e) {
            Log.e("YTDrmSession", "Error trying to restore Widevine keys.", e);
            i(e, 1);
            return false;
        }
    }

    @Override // defpackage.pne
    public final int a() {
        return this.i;
    }

    public final pej b() {
        pej pejVar = this.q;
        return pejVar == null ? this : pejVar;
    }

    @Override // defpackage.pne
    public final pnd c() {
        if (this.i == 1) {
            return this.v;
        }
        return null;
    }

    @Override // defpackage.pne
    public final ExoMediaCrypto d() {
        return this.u;
    }

    @Override // defpackage.pne
    public final UUID e() {
        return this.g;
    }

    @Override // defpackage.pne
    public final void f(pnj pnjVar) {
        if (pnjVar != null) {
            pvv pvvVar = this.p;
            synchronized (pvvVar.a) {
                ArrayList arrayList = new ArrayList(pvvVar.d);
                arrayList.add(pnjVar);
                pvvVar.d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) pvvVar.b.get(pnjVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(pvvVar.c);
                    hashSet.add(pnjVar);
                    pvvVar.c = Collections.unmodifiableSet(hashSet);
                }
                pvvVar.b.put(pnjVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.r + 1;
        this.r = i;
        if (i != 1) {
            if (pnjVar == null) {
                return;
            }
            pnjVar.e(this.i);
        } else if (this.i == 1 || !p(true)) {
        } else {
            if (this.q == null) {
                h(true);
                return;
            }
            pdz pdzVar = this.f;
            this.t.postDelayed(new Runnable() { // from class: pef
                @Override // java.lang.Runnable
                public final void run() {
                    pej.this.h(true);
                }
            }, new Random().nextInt(pdzVar != null ? pdzVar.c * 500 : 60000));
        }
    }

    public final void g(pvu pvuVar) {
        Set<pnj> set;
        pvv pvvVar = this.p;
        synchronized (pvvVar.a) {
            set = pvvVar.c;
        }
        for (pnj pnjVar : set) {
            pvuVar.a(pnjVar);
        }
    }

    public final void h(boolean z) {
        long min;
        int i = this.c;
        if (i != 0 && i != 1) {
            if (i != 2) {
                t(3, z);
            } else if (this.k == null) {
                t(2, z);
            } else if (!u()) {
            } else {
                t(2, z);
            }
        } else if (this.k == null) {
            t(1, z);
        } else if (this.i != 4 && !u()) {
        } else {
            if (!phk.d.equals(this.g)) {
                min = Long.MAX_VALUE;
            } else {
                Pair c = pnr.c(this);
                min = Math.min(((Long) c.first).longValue(), ((Long) c.second).longValue());
            }
            if (this.c == 0 && min <= 60) {
                t(2, z);
            } else if (min <= 0) {
                i(new poc(), 2);
            } else {
                this.i = 4;
                g(pee.c);
            }
            if (this.c != 0 || this.k == null || pxi.a >= 23) {
                return;
            }
            this.d.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(final java.lang.Exception r8, int r9) {
        /*
            r7 = this;
            pnd r0 = new pnd
            boolean r1 = r8 instanceof defpackage.peq
            r2 = 6006(0x1776, float:8.416E-42)
            r3 = 6002(0x1772, float:8.41E-42)
            r4 = 1
            r5 = 6003(0x1773, float:8.412E-42)
            if (r1 == 0) goto L10
        Ld:
            r2 = 6003(0x1773, float:8.412E-42)
            goto L57
        L10:
            int r1 = defpackage.pxi.a
            boolean r1 = defpackage.pnr.b(r8)
            if (r1 == 0) goto L1d
            int r2 = defpackage.pnr.a(r8)
            goto L57
        L1d:
            int r1 = defpackage.pxi.a
            r6 = 23
            if (r1 < r6) goto L2a
            boolean r1 = defpackage.pns.a(r8)
            if (r1 == 0) goto L2a
            goto L57
        L2a:
            boolean r1 = defpackage.pnq.b(r8)
            if (r1 == 0) goto L33
        L30:
            r2 = 6002(0x1772, float:8.41E-42)
            goto L57
        L33:
            boolean r1 = defpackage.pnq.a(r8)
            if (r1 == 0) goto L3c
            r2 = 6007(0x1777, float:8.418E-42)
            goto L57
        L3c:
            boolean r1 = r8 instanceof defpackage.poe
            if (r1 == 0) goto L43
            r2 = 6001(0x1771, float:8.409E-42)
            goto L57
        L43:
            boolean r1 = r8 instanceof defpackage.pnc
            if (r1 == 0) goto L48
            goto Ld
        L48:
            boolean r1 = r8 instanceof defpackage.poc
            if (r1 == 0) goto L4f
            r2 = 6008(0x1778, float:8.419E-42)
            goto L57
        L4f:
            if (r9 != r4) goto L52
            goto L57
        L52:
            r1 = 2
            if (r9 != r1) goto L30
            r2 = 6004(0x1774, float:8.413E-42)
        L57:
            r0.<init>(r8, r2)
            r7.v = r0
            ped r9 = new ped
            r9.<init>()
            r7.g(r9)
            int r8 = r7.i
            r9 = 4
            if (r8 == r9) goto L6b
            r7.i = r4
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pej.i(java.lang.Exception, int):void");
    }

    public final void j(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            int i = 1;
            if (true != z) {
                i = 2;
            }
            i(exc, i);
            return;
        }
        l();
    }

    public final void k(Exception exc, boolean z) {
        int i = 1;
        if (true != z) {
            i = 3;
        }
        i(exc, i);
    }

    public final void l() {
        MediaDrm.ProvisionRequest provisionRequest = ((pob) this.a).b.getProvisionRequest();
        this.t.a(0, new pnv(provisionRequest.getData(), provisionRequest.getDefaultUrl()), true).sendToTarget();
    }

    @Override // defpackage.pne
    public final void m(pnj pnjVar) {
        if (q(pnjVar)) {
            this.y.a.d(this);
        }
    }

    public final boolean n(byte[] bArr) {
        return Arrays.equals(this.j, bArr);
    }

    public final boolean o() {
        int i = this.i;
        return i == 3 || i == 4;
    }

    public final boolean p(boolean z) {
        if (o()) {
            return true;
        }
        try {
            this.d.f();
            this.j = ((pob) this.a).b.openSession();
            this.d.e();
            pnw pnwVar = this.a;
            byte[] bArr = this.j;
            int i = pxi.a;
            this.u = new pnx(pob.g(((pob) pnwVar).a), bArr);
            this.i = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                l();
                return false;
            }
            i(e, 1);
            return false;
        } catch (Exception e2) {
            i(e2, 1);
            return false;
        }
    }

    public final boolean q(pnj pnjVar) {
        g(pee.d);
        if (pnjVar != null) {
            pvv pvvVar = this.p;
            synchronized (pvvVar.a) {
                Integer num = (Integer) pvvVar.b.get(pnjVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(pvvVar.d);
                    arrayList.remove(pnjVar);
                    pvvVar.d = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        pvvVar.b.remove(pnjVar);
                        HashSet hashSet = new HashSet(pvvVar.c);
                        hashSet.remove(pnjVar);
                        pvvVar.c = Collections.unmodifiableSet(hashSet);
                    } else {
                        pvvVar.b.put(pnjVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
        }
        int i = this.r - 1;
        this.r = i;
        if (i == 0) {
            this.i = 0;
            this.h.removeCallbacksAndMessages(null);
            this.t.removeCallbacksAndMessages(null);
            this.t = null;
            this.s.quit();
            this.s = null;
            this.u = null;
            this.v = null;
            final byte[] bArr = this.j;
            if (bArr != null) {
                this.j = null;
                pep pepVar = this.w;
                if (pepVar == null || this.x <= 0) {
                    this.a.a(bArr);
                } else {
                    pepVar.postDelayed(new Runnable() { // from class: peg
                        @Override // java.lang.Runnable
                        public final void run() {
                            pej pejVar = pej.this;
                            try {
                                pejVar.a.a(bArr);
                            } catch (RuntimeException unused) {
                            }
                        }
                    }, this.x);
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pne
    public final boolean r(String str) {
        return this.a.c(this.j, str);
    }

    @Override // defpackage.pne
    public final void s() {
    }

    private final void t(int i, boolean z) {
        DrmInitData.SchemeData schemeData;
        byte[] bArr;
        String str;
        DrmInitData.SchemeData schemeData2;
        DrmInitData.SchemeData schemeData3;
        byte[] H;
        int length;
        byte[] bArr2 = i == 3 ? this.k : this.j;
        try {
            this.d.b();
            amuk r = this.k == null ? amuk.r(new DrmInitData.SchemeData(phk.d, this.n, this.b)) : null;
            pnw pnwVar = this.a;
            HashMap<String, String> hashMap = this.o;
            if (r != null) {
                if (!phk.d.equals(((pob) pnwVar).a)) {
                    schemeData2 = (DrmInitData.SchemeData) r.get(0);
                } else {
                    if (pxi.a >= 28 && ((amxx) r).c > 1) {
                        DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) r.get(0);
                        int i2 = 0;
                        for (int i3 = 0; i3 < ((amxx) r).c; i3++) {
                            DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) r.get(i3);
                            byte[] bArr3 = (byte[]) ptx.a(schemeData5.d);
                            if (pxi.M(schemeData5.c, schemeData4.c) && pxi.M(schemeData5.b, schemeData4.b) && ja.G(bArr3) != null) {
                                i2 += bArr3.length;
                            }
                        }
                        byte[] bArr4 = new byte[i2];
                        int i4 = 0;
                        for (int i5 = 0; i5 < ((amxx) r).c; i5++) {
                            byte[] bArr5 = (byte[]) ptx.a(((DrmInitData.SchemeData) r.get(i5)).d);
                            int length2 = bArr5.length;
                            System.arraycopy(bArr5, 0, bArr4, i4, length2);
                            i4 += length2;
                        }
                        schemeData2 = new DrmInitData.SchemeData(schemeData4.a, schemeData4.b, schemeData4.c, bArr4);
                    }
                    for (int i6 = 0; i6 < ((amxx) r).c; i6++) {
                        DrmInitData.SchemeData schemeData6 = (DrmInitData.SchemeData) r.get(i6);
                        int F = ja.F((byte[]) ptx.a(schemeData6.d));
                        if ((pxi.a >= 23 || F != 0) && (pxi.a < 23 || F != 1)) {
                        }
                        schemeData3 = schemeData6;
                    }
                    schemeData2 = (DrmInitData.SchemeData) r.get(0);
                }
                schemeData3 = schemeData2;
                UUID uuid = ((pob) pnwVar).a;
                byte[] bArr6 = (byte[]) ptx.a(schemeData3.d);
                if (phk.e.equals(uuid)) {
                    byte[] H2 = ja.H(bArr6, uuid);
                    if (H2 != null) {
                        bArr6 = H2;
                    }
                    UUID uuid2 = phk.e;
                    pwu pwuVar = new pwu(bArr6);
                    int e = pwuVar.e();
                    short x = pwuVar.x();
                    short x2 = pwuVar.x();
                    if (x == 1 && x2 == 1) {
                        String w = pwuVar.w(pwuVar.x(), amoz.d);
                        if (!w.contains("<LA_URL>")) {
                            int indexOf = w.indexOf("</DATA>");
                            if (indexOf == -1) {
                                Log.w("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                                indexOf = -1;
                            }
                            String substring = w.substring(0, indexOf);
                            String substring2 = w.substring(indexOf);
                            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
                            sb.append(substring);
                            sb.append("<LA_URL>https://x</LA_URL>");
                            sb.append(substring2);
                            String sb2 = sb.toString();
                            int i7 = e + 52;
                            ByteBuffer allocate = ByteBuffer.allocate(i7);
                            allocate.order(ByteOrder.LITTLE_ENDIAN);
                            allocate.putInt(i7);
                            allocate.putShort((short) 1);
                            allocate.putShort((short) 1);
                            int length3 = sb2.length();
                            allocate.putShort((short) (length3 + length3));
                            allocate.put(sb2.getBytes(amoz.d));
                            bArr6 = allocate.array();
                        }
                    }
                    int length4 = (bArr6 != null ? bArr6.length : 0) + 32;
                    ByteBuffer allocate2 = ByteBuffer.allocate(length4);
                    allocate2.putInt(length4);
                    allocate2.putInt(1886614376);
                    allocate2.putInt(0);
                    allocate2.putLong(uuid2.getMostSignificantBits());
                    allocate2.putLong(uuid2.getLeastSignificantBits());
                    if (bArr6 != null && (length = bArr6.length) != 0) {
                        allocate2.putInt(length);
                        allocate2.put(bArr6);
                    }
                    bArr6 = allocate2.array();
                }
                if (((pxi.a < 23 && phk.d.equals(uuid)) || (phk.e.equals(uuid) && "Amazon".equals(pxi.c) && ("AFTB".equals(pxi.d) || "AFTS".equals(pxi.d) || "AFTM".equals(pxi.d) || "AFTT".equals(pxi.d)))) && (H = ja.H(bArr6, uuid)) != null) {
                    bArr6 = H;
                }
                UUID uuid3 = ((pob) pnwVar).a;
                String str2 = schemeData3.c;
                if (pxi.a < 26 && phk.c.equals(uuid3) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2))) {
                    str2 = "cenc";
                }
                schemeData = schemeData3;
                byte[] bArr7 = bArr6;
                str = str2;
                bArr = bArr7;
            } else {
                schemeData = null;
                bArr = null;
                str = null;
            }
            MediaDrm.KeyRequest keyRequest = ((pob) pnwVar).b.getKeyRequest(bArr2, bArr, str, i, hashMap);
            UUID uuid4 = ((pob) pnwVar).a;
            byte[] data = keyRequest.getData();
            if (phk.c.equals(uuid4) && pxi.a < 27) {
                data = pxi.U(pxi.A(data).replace('+', '-').replace('/', '_'));
            }
            String defaultUrl = keyRequest.getDefaultUrl();
            if (true == "https://x".equals(defaultUrl)) {
                defaultUrl = "";
            }
            if (TextUtils.isEmpty(defaultUrl) && schemeData != null && !TextUtils.isEmpty(schemeData.b)) {
                defaultUrl = schemeData.b;
            }
            if (pxi.a >= 23) {
                keyRequest.getRequestType();
            }
            pnu pnuVar = new pnu(data, defaultUrl);
            this.d.a();
            this.d.d();
            this.t.a(1, pnuVar, z).sendToTarget();
        } catch (Exception e2) {
            j(e2, true);
        }
    }
}
