package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: slp  reason: default package */
/* loaded from: classes4.dex */
public final class slp implements slv {
    static final int[] e;
    public final Context a;
    public final ampq b;
    public final sll c;
    public final sma d;
    public aopa f;
    private final List g;
    private final List h;

    static {
        new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("morris_provider").appendPath("com.google.android.googlequicksearchbox.MorrisProvider").build();
        e = new int[]{2, 3};
    }

    public slp(final Context context) {
        final qsf b = qsf.b(context);
        this.g = amxp.o();
        this.b = amon.a;
        this.a = context;
        new slo(this, Looper.getMainLooper());
        this.h = new ArrayList();
        anlz.e(Executors.newSingleThreadExecutor());
        sma smaVar = new sma(null);
        this.d = smaVar;
        smaVar.a = this;
        this.c = new sll(context, new amqo() { // from class: sln
            @Override // defpackage.amqo
            public final Object get() {
                slp slpVar = slp.this;
                return new sls(context, slpVar.d, slpVar, b);
            }
        }, new amqo() { // from class: slm
            @Override // defpackage.amqo
            public final Object get() {
                return new dwj(context, slp.this.d);
            }
        });
    }

    public static void b(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException(str.concat(" should be called in main thread"));
    }

    public final int a() {
        int a = this.c.a();
        String.format("#getConnectionState() - connectionState = %d", Integer.valueOf(a));
        return a;
    }

    public final void c(dwg dwgVar) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String.format(Locale.US, "#recordAppFlowEvent: %s, timeStampNs: %d", dwgVar, Long.valueOf(elapsedRealtimeNanos));
        List list = this.h;
        smg a = smh.a();
        a.copyOnWrite();
        ((smh) a.instance).e(dwgVar);
        a.copyOnWrite();
        ((smh) a.instance).f(elapsedRealtimeNanos);
        list.add((smh) a.mo39build());
    }

    public final void d() {
        if (!this.c.c() || this.f == null) {
            return;
        }
        aopa createBuilder = smr.a.createBuilder();
        aopa aopaVar = this.f;
        createBuilder.copyOnWrite();
        smr smrVar = (smr) createBuilder.instance;
        smq smqVar = (smq) aopaVar.mo39build();
        smqVar.getClass();
        smrVar.d = smqVar;
        smrVar.b |= 2;
        try {
            g(createBuilder);
            this.f = null;
        } catch (RemoteException unused) {
            Log.w("AssistantIntegClient", "#sendPendingVoicePlateParams(): failed to send VoicePlateParams");
        }
    }

    public final aopa e(aopa aopaVar) {
        int c = smx.c(0);
        aopaVar.copyOnWrite();
        smq smqVar = (smq) aopaVar.instance;
        int i = c - 1;
        smq smqVar2 = smq.a;
        if (c != 0) {
            smqVar.c = i;
            smqVar.b |= 1;
            if (!TextUtils.isEmpty(null)) {
                aopaVar.copyOnWrite();
                smq smqVar3 = (smq) aopaVar.instance;
                throw null;
            }
            aopaVar.copyOnWrite();
            smq smqVar4 = (smq) aopaVar.instance;
            smqVar4.b &= -3;
            smqVar4.d = smq.a.d;
            aopa createBuilder = smp.a.createBuilder();
            ArrayList o = amxp.o();
            createBuilder.copyOnWrite();
            smp smpVar = (smp) createBuilder.instance;
            aopu aopuVar = smpVar.b;
            if (!aopuVar.c()) {
                smpVar.b = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) o, (List) smpVar.b);
            aopaVar.copyOnWrite();
            smq smqVar5 = (smq) aopaVar.instance;
            smp smpVar2 = (smp) createBuilder.mo39build();
            smpVar2.getClass();
            smqVar5.e = smpVar2;
            smqVar5.b |= 4;
            aopaVar.copyOnWrite();
            smq smqVar6 = (smq) aopaVar.instance;
            smqVar6.b |= 32;
            smqVar6.g = 0;
            if (!TextUtils.isEmpty(null)) {
                aopaVar.copyOnWrite();
                smq smqVar7 = (smq) aopaVar.instance;
                throw null;
            }
            aopaVar.copyOnWrite();
            smq smqVar8 = (smq) aopaVar.instance;
            smqVar8.b |= 16;
            smqVar8.f = "";
            aopa createBuilder2 = smo.a.createBuilder();
            List list = this.g;
            createBuilder2.copyOnWrite();
            smo smoVar = (smo) createBuilder2.instance;
            aopu aopuVar2 = smoVar.b;
            if (!aopuVar2.c()) {
                smoVar.b = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) list, (List) smoVar.b);
            aopaVar.copyOnWrite();
            smq smqVar9 = (smq) aopaVar.instance;
            smo smoVar2 = (smo) createBuilder2.mo39build();
            smoVar2.getClass();
            smqVar9.h = smoVar2;
            smqVar9.b |= 64;
            aopa createBuilder3 = smr.a.createBuilder();
            createBuilder3.copyOnWrite();
            smr smrVar = (smr) createBuilder3.instance;
            smq smqVar10 = (smq) aopaVar.mo39build();
            smqVar10.getClass();
            smrVar.d = smqVar10;
            smrVar.b |= 2;
            int[] iArr = e;
            int length = iArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                int i3 = iArr[i2];
                createBuilder3.copyOnWrite();
                smr smrVar2 = (smr) createBuilder3.instance;
                if (i3 != 0) {
                    aopq aopqVar = smrVar2.g;
                    if (!aopqVar.c()) {
                        smrVar2.g = aopi.mutableCopy(aopqVar);
                    }
                    smrVar2.g.g(i3 - 1);
                } else {
                    throw null;
                }
            }
            return createBuilder3;
        }
        throw null;
    }

    public final aopa f() {
        if (this.f == null) {
            this.f = smq.a.createBuilder();
        }
        return this.f;
    }

    public final void g(aopa aopaVar) {
        List list = this.h;
        aopaVar.copyOnWrite();
        smr smrVar = (smr) aopaVar.instance;
        smr smrVar2 = smr.a;
        aopu aopuVar = smrVar.e;
        if (!aopuVar.c()) {
            smrVar.e = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) list, (List) smrVar.e);
        sll.b("sendData", anii.h(this.c.c, new sli((smr) aopaVar.mo39build()), anjk.a));
        this.h.clear();
    }
}
