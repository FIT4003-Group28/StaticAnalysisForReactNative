package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.udc.UdcSettingDisplayInfoRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bzpn  reason: default package */
/* loaded from: classes4.dex */
public final class bzpn implements bzqc {
    public static final dcqe a = dcqe.c("bzpn");
    static final int b = 8;
    private final ania c;
    private final dxio<akfa> d;
    private final bzpe e;
    private final Executor f;
    private final Map<dbsi<String, Integer>, Integer> g = Collections.synchronizedMap(new HashMap());

    public bzpn(ania aniaVar, dxio<akfa> dxioVar, bzpe bzpeVar, Executor executor) {
        this.c = aniaVar;
        this.d = dxioVar;
        this.e = bzpeVar;
        this.f = executor;
    }

    public static void d(ania aniaVar, int i) {
        if (i == 2) {
            aniaVar.c(true, 2);
        } else if (i != 3) {
        } else {
            aniaVar.c(false, 2);
        }
    }

    private static <T> dehn<T> f(cpcq<T> cpcqVar) {
        final deig d = deig.d();
        d.getClass();
        cpcqVar.s(new cpcl(d) { // from class: bzpk
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cpcl
            public final void c(Object obj) {
                this.a.j(obj);
            }
        });
        d.getClass();
        cpcqVar.r(new cpci(d) { // from class: bzpl
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.cpci
            public final void d(Exception exc) {
                this.a.k(exc);
            }
        });
        return d;
    }

    @Override // defpackage.bzqc
    public final dehn<UdcCacheResponse> a(List<bzqb> list) {
        final String o = this.d.a().o();
        dbsg<cpdv> a2 = this.e.a();
        if (!a2.a() || o == null) {
            return deha.b(new IllegalStateException("No UdcClient present (no user signed in?)"));
        }
        if (list.isEmpty()) {
            return deha.b(new IllegalArgumentException("No settings provided"));
        }
        cpdv b2 = a2.b();
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).d;
        }
        cpcq<UdcCacheResponse> a3 = b2.a(new UdcCacheRequest(iArr));
        Executor executor = this.f;
        final ania aniaVar = this.c;
        final Map<dbsi<String, Integer>, Integer> map = this.g;
        a3.p(executor, new cpcl(map, o, aniaVar) { // from class: bzpi
            private final Map a;
            private final String b;
            private final ania c;

            {
                this.a = map;
                this.b = o;
                this.c = aniaVar;
            }

            @Override // defpackage.cpcl
            public final void c(Object obj) {
                Map map2 = this.a;
                String str = this.b;
                ania aniaVar2 = this.c;
                UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
                if (udcCacheResponse.a()) {
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.a) {
                        map2.put(dbsi.a(str, Integer.valueOf(udcSetting.a)), Integer.valueOf(udcSetting.b));
                        if (udcSetting.a == bzqb.WEB_AND_APP_ACTIVITY.d) {
                            bzpn.d(aniaVar2, udcSetting.b);
                        }
                    }
                }
            }
        });
        return f(a3);
    }

    @Override // defpackage.bzqc
    public final void b(bzqb bzqbVar, dbsz<UdcCacheResponse.UdcSetting> dbszVar) {
        String o = this.d.a().o();
        if (!this.e.a().a() || o == null) {
            return;
        }
        deha.q(a(dcdc.f(bzqbVar)), new bzpm(bzqbVar, dbszVar), this.f);
    }

    @Override // defpackage.bzqc
    public final int c(bzqb bzqbVar) {
        Integer num;
        String o = this.d.a().o();
        if (o == null || (num = this.g.get(dbsi.a(o, Integer.valueOf(bzqbVar.d)))) == null) {
            return 999;
        }
        return num.intValue();
    }

    @Override // defpackage.bzqc
    public final dehn<cpfa> e(bzqb bzqbVar) {
        dbsg<cpdv> a2 = this.e.a();
        if (!a2.a()) {
            return deha.b(new IllegalStateException("No UdcClient present (no user signed in?)"));
        }
        UdcSettingDisplayInfoRequest udcSettingDisplayInfoRequest = new UdcSettingDisplayInfoRequest(bzqbVar.d, 8, "timeline", null);
        cpdv b2 = a2.b();
        cpeq cpeqVar = b2.a;
        GoogleApiClient googleApiClient = b2.i;
        cped cpedVar = new cped(googleApiClient, udcSettingDisplayInfoRequest);
        googleApiClient.enqueue(cpedVar);
        cpcq b3 = cnwb.b(cpedVar, new cpfa());
        final ania aniaVar = this.c;
        final boolean equals = bzqb.WEB_AND_APP_ACTIVITY.equals(bzqbVar);
        b3.s(new cpcl(equals, aniaVar) { // from class: bzpj
            private final boolean a;
            private final ania b;

            {
                this.a = equals;
                this.b = aniaVar;
            }

            @Override // defpackage.cpcl
            public final void c(Object obj) {
                boolean z = this.a;
                ania aniaVar2 = this.b;
                cpfa cpfaVar = (cpfa) obj;
                dcqe dcqeVar = bzpn.a;
                if (z) {
                    bzpn.d(aniaVar2, cpfaVar.a().a.b);
                }
            }
        });
        return f(b3);
    }
}
