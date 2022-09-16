package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aius  reason: default package */
/* loaded from: classes.dex */
public final class aius {
    public final Executor a;
    public final atzm b;
    public final TrackingUrlModel c;
    public final String d;
    public final int e;
    public final yrj f;
    public final afug g;
    public final aqlc h;
    public volatile boolean i;
    private final afwu j;
    private final qys k;
    private final afvn l;
    private final zgp m;
    private final zgp n;
    private boolean o;

    public aius(afwu afwuVar, Executor executor, qys qysVar, afvn afvnVar, yrj yrjVar, afug afugVar, aacz aaczVar, AttestationClient$AttestationClientState attestationClient$AttestationClientState) {
        this(afwuVar, executor, qysVar, afvnVar, yrjVar, afugVar, aaczVar, attestationClient$AttestationClientState.a, attestationClient$AttestationClientState.b, attestationClient$AttestationClientState.c, attestationClient$AttestationClientState.d);
        this.i = attestationClient$AttestationClientState.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aqlc e(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            atfw atfwVar = b.k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            if ((atfwVar.c & 262144) == 0) {
                return null;
            }
            atfw atfwVar2 = b.k;
            if (atfwVar2 == null) {
                atfwVar2 = atfw.a;
            }
            aqlc aqlcVar = atfwVar2.z;
            return aqlcVar == null ? aqlc.a : aqlcVar;
        }
        return null;
    }

    private final boolean f(String str) {
        return this.m.d(str) != null;
    }

    public final String a(String str) {
        return this.m.d(str);
    }

    public final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        final afvm c = this.l.c();
        final String g = this.l.g();
        final boolean g2 = c.g();
        this.a.execute(new Runnable() { // from class: aiur
            @Override // java.lang.Runnable
            public final void run() {
                aius aiusVar = aius.this;
                afvm afvmVar = c;
                String str = g;
                boolean z = g2;
                aqlc aqlcVar = aiusVar.h;
                if (aqlcVar == null || !aqlcVar.c || aiusVar.f.o()) {
                    aiusVar.c(afvmVar);
                    return;
                }
                String a = aiusVar.a("e");
                if (a == null) {
                    return;
                }
                aopa createBuilder = apig.a.createBuilder();
                aopa createBuilder2 = apif.a.createBuilder();
                String str2 = aiusVar.d;
                createBuilder2.copyOnWrite();
                apif apifVar = (apif) createBuilder2.instance;
                apifVar.b |= 2;
                apifVar.d = str2;
                createBuilder2.copyOnWrite();
                apif apifVar2 = (apif) createBuilder2.instance;
                apifVar2.b |= 1;
                apifVar2.c = a;
                createBuilder.copyOnWrite();
                apig apigVar = (apig) createBuilder.instance;
                apif apifVar3 = (apif) createBuilder2.mo39build();
                apifVar3.getClass();
                apigVar.c = apifVar3;
                apigVar.b = 1;
                afug afugVar = aiusVar.g;
                aopa createBuilder3 = oro.a.createBuilder();
                aoob byteString = ((apig) createBuilder.mo39build()).toByteString();
                createBuilder3.copyOnWrite();
                oro oroVar = (oro) createBuilder3.instance;
                oroVar.b |= 4;
                oroVar.e = byteString;
                createBuilder3.copyOnWrite();
                oro oroVar2 = (oro) createBuilder3.instance;
                oroVar2.b |= 2;
                oroVar2.d = "attestation";
                String d = afvmVar.d();
                createBuilder3.copyOnWrite();
                oro oroVar3 = (oro) createBuilder3.instance;
                oroVar3.b |= 16;
                oroVar3.g = d;
                if (!TextUtils.isEmpty(str)) {
                    createBuilder3.copyOnWrite();
                    oro oroVar4 = (oro) createBuilder3.instance;
                    str.getClass();
                    oroVar4.b |= 128;
                    oroVar4.j = str;
                }
                createBuilder3.copyOnWrite();
                oro oroVar5 = (oro) createBuilder3.instance;
                oroVar5.b |= 256;
                oroVar5.k = z;
                afugVar.n(((oro) createBuilder3.mo39build()).mo52toBuilder());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(final afvm afvmVar) {
        if (f("c5a")) {
            HashMap hashMap = new HashMap();
            hashMap.put("challenge", this.b.c);
            this.k.a(!amps.e(a("c5b")) ? a("c5b") : "yt_player", hashMap, new qyu() { // from class: aiup
                @Override // defpackage.qyu
                public final void a(String str) {
                    aius.this.d(str, afvmVar);
                }
            });
            return;
        }
        d(null, afvmVar);
    }

    public final void d(String str, afvm afvmVar) {
        zgp c = zgp.c(this.n);
        if (!this.d.isEmpty()) {
            c.h("cpn", this.d);
        }
        Uri a = c.a();
        afwt e = afwu.e("atr");
        e.b(a);
        HashMap hashMap = new HashMap();
        zgp c2 = zgp.c(this.m);
        if (f("c3a")) {
            c2.h("r3a", Integer.toString(this.e % Integer.parseInt(a("c3a"))));
        }
        if (str != null) {
            c2.h("r5a", str);
        }
        hashMap.put("atr", amps.d(c2.a().getEncodedQuery()));
        e.f = hashMap;
        e.d = this.o;
        e.a(new acwk(this.c, 1));
        e.g = afvmVar;
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Pinging ");
        sb.append(valueOf);
        zep.g(sb.toString());
        this.j.b(null, e, afzr.b);
    }

    public aius(afwu afwuVar, Executor executor, qys qysVar, afvn afvnVar, yrj yrjVar, afug afugVar, aacz aaczVar, atzm atzmVar, TrackingUrlModel trackingUrlModel) {
        this(afwuVar, executor, qysVar, afvnVar, yrjVar, afugVar, aaczVar, atzmVar, trackingUrlModel, "", 0);
        aqlc e = e(aaczVar);
        boolean z = false;
        if (e != null && e.f) {
            z = true;
        }
        this.o = z;
    }

    public aius(afwu afwuVar, Executor executor, qys qysVar, afvn afvnVar, yrj yrjVar, afug afugVar, aacz aaczVar, atzm atzmVar, TrackingUrlModel trackingUrlModel, String str, int i) {
        this.j = afwuVar;
        this.a = executor;
        this.k = qysVar;
        this.l = afvnVar;
        atzmVar.getClass();
        this.b = atzmVar;
        trackingUrlModel.getClass();
        this.c = trackingUrlModel;
        this.n = zgp.b(trackingUrlModel.c());
        String valueOf = String.valueOf(atzmVar.c);
        this.m = zgp.b(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
        this.f = yrjVar;
        this.g = afugVar;
        this.h = e(aaczVar);
        this.d = str;
        this.e = i;
        this.i = false;
        this.o = true;
    }
}
