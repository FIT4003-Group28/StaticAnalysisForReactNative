package defpackage;

import android.media.MediaDrm;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: per  reason: default package */
/* loaded from: classes4.dex */
public final class per implements pnp {
    public final List a;
    public int b;
    public byte[] c;
    public int d;
    public int e = -1;
    public boolean f = true;
    public long g;
    public volatile pep h;
    public volatile pen i;
    private final UUID k;
    private final HashMap l;
    private final pel m;
    private Looper n;
    private boolean o;
    private pnw p;
    private final aesn q;

    public per(UUID uuid, aesn aesnVar, HashMap hashMap, pel pelVar) {
        ptx.a(uuid);
        this.k = uuid;
        this.q = aesnVar;
        this.l = hashMap;
        this.m = pelVar;
        this.d = 3;
        this.o = false;
        this.b = 0;
        this.a = new ArrayList();
    }

    private static DrmInitData.SchemeData h(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; i++) {
            DrmInitData.SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (phk.c.equals(uuid) && a.b(phk.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (phk.d.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int F = schemeData.a() ? ja.F(schemeData.d) : -1;
                if (pxi.a < 23 && F == 0) {
                    return schemeData;
                }
                if (pxi.a >= 23 && F == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    protected final pej a(byte[] bArr, String str, pdz pdzVar, pej pejVar) {
        ptx.a(this.p);
        return new pej(this.k, this.p, bArr, str, this.b, this.c, this.l, this.q, this.h, this.n, this.m, this.g, this.d, this.e, pdzVar, pejVar, new pek(this));
    }

    @Override // defpackage.pnp
    public final pne b(Looper looper, pnj pnjVar, Format format) {
        String str;
        byte[] bArr;
        pej pejVar;
        pej a;
        pej pejVar2;
        pdz pdzVar;
        if (format.o == null) {
            return null;
        }
        if (this.f || this.a.isEmpty()) {
            Looper looper2 = this.n;
            ptx.e(looper2 == null || looper2 == looper);
            if (this.a.isEmpty()) {
                this.n = looper;
                if (this.h == null) {
                    this.h = new pep(this, looper);
                }
                if (this.i == null) {
                    this.i = new pen(this, looper);
                }
            }
            if (this.c == null) {
                DrmInitData.SchemeData h = h(format.o, this.k, false);
                if (h == null) {
                    peq peqVar = new peq(this.k);
                    if (pnjVar != null) {
                        pnjVar.f(peqVar);
                    }
                    return new pnt(new pnd(peqVar, 6003));
                }
                bArr = h.d;
                str = h.c;
            } else {
                str = null;
                bArr = null;
            }
            pdz bc = afmg.bc(bArr);
            if (bc != null) {
                this.q.d = Integer.valueOf(bc.b);
            } else {
                this.q.d = null;
            }
            Iterator it = this.a.iterator();
            pej pejVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    pejVar = null;
                    break;
                }
                pejVar = (pej) it.next();
                if (Arrays.equals(pejVar.b, bArr)) {
                    break;
                } else if (pejVar.i == 4 && bc != null && (pdzVar = pejVar.f) != null && bc.b != -1 && pdzVar.b != -1 && Arrays.equals(bc.a, pdzVar.a) && Math.abs(bc.b - pdzVar.b) <= 1) {
                    pejVar3 = pejVar;
                }
            }
            if (pejVar != null) {
                a = pejVar.b();
            } else if (pejVar3 == null || !this.o) {
                a = a(bArr, str, bc, null);
                this.a.add(a);
            } else {
                ptx.a(bc);
                pej b = pejVar3.b();
                Iterator it2 = this.a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        pejVar2 = null;
                        break;
                    }
                    pejVar2 = (pej) it2.next();
                    if (pejVar2 != b && pejVar2 != pejVar3 && pejVar2.b() == b) {
                        break;
                    }
                }
                if (pejVar2 != null) {
                    pejVar2.m(null);
                    this.a.remove(pejVar2);
                }
                pej b2 = pejVar3.b();
                pdz pdzVar2 = pejVar3.f;
                Integer valueOf = pdzVar2 == null ? null : Integer.valueOf(pdzVar2.b);
                if (valueOf == null) {
                    Log.w("YTDrmSessionMgr", "AcquireSession: No crypto period index available for overlap session!");
                }
                if (bc.b > valueOf.intValue()) {
                    pej a2 = a(bArr, str, bc, b2);
                    this.a.add(a2);
                    a2.f(null);
                }
                a = b2;
            }
            a.f(pnjVar);
            return a;
        }
        pne pneVar = (pne) this.a.get(0);
        pneVar.f(pnjVar);
        return pneVar;
    }

    @Override // defpackage.pnp
    public final Class c(Format format) {
        DrmInitData drmInitData = format.o;
        if (drmInitData == null) {
            return null;
        }
        if (this.c == null) {
            if (h(drmInitData, this.k, true) == null) {
                if (drmInitData.c == 1 && drmInitData.a(0).b(phk.b)) {
                    String valueOf = String.valueOf(this.k);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                    sb.append(valueOf);
                    Log.w("YTDrmSessionMgr", sb.toString());
                }
                return pof.class;
            }
            String str = drmInitData.b;
            if (str != null && !"cenc".equals(str) && (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && pxi.a < 24)) {
                return pof.class;
            }
        }
        return pnx.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(pej pejVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pejVar);
        for (pej pejVar2 : this.a) {
            if (pejVar2.b() == pejVar) {
                arrayList.add(pejVar2);
                pejVar2.q(null);
            }
        }
        this.a.removeAll(arrayList);
        this.a.size();
    }

    public final void e(pnw pnwVar) {
        ptx.a(pnwVar);
        this.p = pnwVar;
        int i = pxi.a;
        try {
            pnwVar.b("sessionSharing", "enable");
            this.o = true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("failed to set sessionSharing:");
            sb.append(valueOf);
            Log.w("YTDrmSessionMgr", sb.toString());
            this.o = false;
        }
        final pem pemVar = new pem(this);
        pob pobVar = (pob) pnwVar;
        pobVar.b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: pny
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i2, int i3, byte[] bArr2) {
                per perVar = pem.this.a;
                if (perVar.b == 0) {
                    perVar.h.obtainMessage(i2, bArr).sendToTarget();
                }
            }
        });
        if (pxi.a >= 23) {
            final peo peoVar = new peo(this);
            if (pxi.a < 23) {
                throw new UnsupportedOperationException();
            }
            pobVar.b.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() { // from class: pnz
                @Override // android.media.MediaDrm.OnExpirationUpdateListener
                public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                    per perVar = peo.this.a;
                    if (perVar.b == 0) {
                        perVar.i.obtainMessage(0, bArr).sendToTarget();
                    }
                }
            }, (Handler) null);
        }
    }

    public final void f(int i, byte[] bArr) {
        ptx.e(this.a.isEmpty());
        if (i == 1 || i == 3) {
            ptx.a(bArr);
        }
        this.b = i;
        this.c = bArr;
    }

    @Override // defpackage.pnp
    public final /* synthetic */ pno g() {
        return pno.b;
    }
}
