package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qpy  reason: default package */
/* loaded from: classes4.dex */
public final class qpy extends qpc {
    public static final String e = qpl.c("com.google.cast.media");
    final qqb A;
    final qqb B;
    public final qqb C;
    public rvh D;
    public qog E;
    public long f;
    public MediaStatus g;
    public Long h;
    public int i;
    public final qqb j;
    public final qqb k;
    public final qqb l;
    final qqb m;
    public final qqb n;
    public final qqb o;
    public final qqb p;
    public final qqb q;
    final qqb r;
    final qqb s;
    final qqb t;
    final qqb u;
    final qqb v;
    final qqb w;
    public final qqb x;
    public final qqb y;
    public final qqb z;

    public qpy() {
        super(e);
        this.i = -1;
        qqb qqbVar = new qqb(86400000L);
        this.j = qqbVar;
        qqb qqbVar2 = new qqb(86400000L);
        this.k = qqbVar2;
        qqb qqbVar3 = new qqb(86400000L);
        this.l = qqbVar3;
        qqb qqbVar4 = new qqb(86400000L);
        this.m = qqbVar4;
        qqb qqbVar5 = new qqb(10000L);
        this.n = qqbVar5;
        qqb qqbVar6 = new qqb(86400000L);
        this.o = qqbVar6;
        qqb qqbVar7 = new qqb(86400000L);
        this.p = qqbVar7;
        qqb qqbVar8 = new qqb(86400000L);
        this.q = qqbVar8;
        qqb qqbVar9 = new qqb(86400000L);
        this.r = qqbVar9;
        qqb qqbVar10 = new qqb(86400000L);
        this.s = qqbVar10;
        qqb qqbVar11 = new qqb(86400000L);
        this.t = qqbVar11;
        qqb qqbVar12 = new qqb(86400000L);
        this.u = qqbVar12;
        qqb qqbVar13 = new qqb(86400000L);
        this.v = qqbVar13;
        qqb qqbVar14 = new qqb(86400000L);
        this.w = qqbVar14;
        qqb qqbVar15 = new qqb(86400000L);
        this.x = qqbVar15;
        qqb qqbVar16 = new qqb(86400000L);
        this.z = qqbVar16;
        this.y = new qqb(86400000L);
        qqb qqbVar17 = new qqb(86400000L);
        this.A = qqbVar17;
        qqb qqbVar18 = new qqb(86400000L);
        this.B = qqbVar18;
        qqb qqbVar19 = new qqb(86400000L);
        this.C = qqbVar19;
        d(qqbVar);
        d(qqbVar2);
        d(qqbVar3);
        d(qqbVar4);
        d(qqbVar5);
        d(qqbVar6);
        d(qqbVar7);
        d(qqbVar8);
        d(qqbVar9);
        d(qqbVar10);
        d(qqbVar11);
        d(qqbVar12);
        d(qqbVar13);
        d(qqbVar14);
        d(qqbVar15);
        d(qqbVar16);
        d(qqbVar16);
        d(qqbVar17);
        d(qqbVar18);
        d(qqbVar19);
        q();
    }

    public static int[] n(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    public static tqn p(JSONObject jSONObject) {
        MediaError.a(jSONObject);
        tqn tqnVar = new tqn();
        qpl.h(jSONObject, "customData");
        return tqnVar;
    }

    private final void q() {
        this.f = 0L;
        this.g = null;
        for (qqb qqbVar : this.d) {
            qqbVar.d(2002);
        }
    }

    @Override // defpackage.qpc
    public final void b() {
        synchronized (this.d) {
            for (qqb qqbVar : this.d) {
                qqbVar.d(2002);
            }
        }
        q();
    }

    public final long e(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        double d2 = elapsedRealtime;
        Double.isNaN(d2);
        long j3 = j + ((long) (d2 * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 < 0) {
            return 0L;
        }
        return j3;
    }

    public final long f() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus != null) {
            return mediaStatus.b;
        }
        throw new qpx();
    }

    public final long g() {
        MediaInfo h = h();
        if (h != null) {
            return h.e;
        }
        return 0L;
    }

    public final MediaInfo h() {
        MediaStatus mediaStatus = this.g;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.a;
    }

    public final void i(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.a.d(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    public final void j() {
        qog qogVar = this.E;
        if (qogVar != null) {
            for (qoa qoaVar : qogVar.a.c) {
                qoaVar.b();
            }
            for (tqj tqjVar : qogVar.a.d) {
            }
        }
    }

    public final void k() {
        qog qogVar = this.E;
        if (qogVar != null) {
            for (qoa qoaVar : qogVar.a.c) {
                qoaVar.c();
            }
            for (tqj tqjVar : qogVar.a.d) {
            }
        }
    }

    public final void l() {
        qog qogVar = this.E;
        if (qogVar != null) {
            for (qoa qoaVar : qogVar.a.c) {
                qoaVar.d();
            }
            for (tqj tqjVar : qogVar.a.d) {
            }
        }
    }

    public final void m() {
        qog qogVar = this.E;
        if (qogVar != null) {
            qoh qohVar = qogVar.a;
            Iterator it = qohVar.e.values().iterator();
            if (!it.hasNext()) {
                for (qoa qoaVar : qogVar.a.c) {
                    qoaVar.f();
                }
                for (tqj tqjVar : qogVar.a.d) {
                    tqjVar.h();
                }
                return;
            }
            tqn tqnVar = (tqn) it.next();
            if (qohVar.m()) {
                throw null;
            }
            if (qohVar.m()) {
                throw null;
            }
            throw null;
        }
    }

    public final void o(qpz qpzVar, int i) {
        JSONObject jSONObject = new JSONObject();
        long a = a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", f());
            if (i != 0) {
                jSONObject.put("jump", i);
            }
            int i2 = this.i;
            if (i2 != -1) {
                jSONObject.put("sequenceNumber", i2);
            }
        } catch (JSONException unused) {
        }
        c(jSONObject.toString(), a);
        this.u.a(a, new qpw(this, qpzVar));
    }
}
