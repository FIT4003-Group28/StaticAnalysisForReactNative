package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ebc  reason: default package */
/* loaded from: classes3.dex */
public final class ebc implements aafl {
    public static final /* synthetic */ int d = 0;
    public final afvn a;
    public final wge b;
    public final wea c;
    private final dt e;
    private final afwc f;
    private final afvt g;
    private final Executor h;

    public ebc(dt dtVar, afwc afwcVar, afvn afvnVar, afvt afvtVar, wge wgeVar, wea weaVar, Executor executor) {
        this.e = dtVar;
        this.f = afwcVar;
        this.a = afvnVar;
        this.g = afvtVar;
        this.b = wgeVar;
        this.c = weaVar;
        this.h = executor;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar == null || !apzgVar.qn(SignInEndpointOuterClass.signInEndpoint)) {
            return;
        }
        final auvx auvxVar = (auvx) apzgVar.qm(SignInEndpointOuterClass.signInEndpoint);
        boolean z = false;
        boolean booleanValue = ((Boolean) zew.J(map, "FromTopBarMenu", false)).booleanValue();
        List list = (List) zew.K(map, "AccountItemsForDirectSignIn", List.class);
        final afwa afwaVar = (afwa) zew.K(map, "sign_in_callback", afwa.class);
        afvm c = this.a.c();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof aarw) {
                    arrayList.add((aarw) obj);
                }
            }
        }
        apzg apzgVar2 = null;
        if (!c.g() && (auvxVar.b & 32) != 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                aarw aarwVar = (aarw) arrayList.get(i);
                i++;
                if (auvxVar.d.equals(aarwVar.h())) {
                    wge wgeVar = this.b;
                    if ((auvxVar.b & 2) != 0 && (apzgVar2 = auvxVar.c) == null) {
                        apzgVar2 = apzg.a;
                    }
                    wgeVar.i(aarwVar, apzgVar2, afwaVar);
                    return;
                }
            }
        }
        int i2 = auvxVar.b;
        if ((i2 & 64) != 0) {
            apwe apweVar = auvxVar.e;
            if (apweVar == null) {
                apweVar = apwe.b;
            }
            wge wgeVar2 = this.b;
            avvv avvvVar = auvxVar.f;
            if (avvvVar == null) {
                avvvVar = avvv.a;
            }
            if ((auvxVar.b & 2) != 0 && (apzgVar2 = auvxVar.c) == null) {
                apzgVar2 = apzg.a;
            }
            wgeVar2.j(apweVar, avvvVar, apzgVar2, afwaVar);
            return;
        }
        boolean z2 = booleanValue || ((i2 & 32) != 0 && "pre-incognito-id".equals(auvxVar.d));
        if ((auvxVar.b & 32) != 0 && "pre_child_id".equals(auvxVar.d)) {
            z = true;
        }
        if (!c.g() || !z2) {
            if (z) {
                ylx.k(this.c.d(), this.h, dzl.d, new ylw() { // from class: eba
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        ebc ebcVar = ebc.this;
                        auvx auvxVar2 = auvxVar;
                        afwa afwaVar2 = afwaVar;
                        String str = (String) obj2;
                        apzg apzgVar3 = null;
                        afvm d2 = str != null ? ebcVar.a.d(str) : null;
                        if (d2 instanceof AccountIdentity) {
                            wge wgeVar3 = ebcVar.b;
                            AccountIdentity accountIdentity = (AccountIdentity) d2;
                            if ((auvxVar2.b & 2) != 0 && (apzgVar3 = auvxVar2.c) == null) {
                                apzgVar3 = apzg.a;
                            }
                            wgeVar3.h(accountIdentity, apzgVar3, afwaVar2);
                        } else {
                            ebcVar.b.l("child switch back to signed out mode", false);
                        }
                        ylx.i(ebcVar.c.a(), lgj.b);
                    }
                });
                return;
            } else {
                this.f.b(this.e, apzgVar, afwaVar);
                return;
            }
        }
        afvt afvtVar = this.g;
        afve afveVar = new afve() { // from class: ebb
            @Override // defpackage.afve
            public final void a() {
                afwa afwaVar2 = afwa.this;
                int i3 = ebc.d;
                if (afwaVar2 != null) {
                    afwaVar2.b();
                }
            }
        };
        if ((auvxVar.b & 2) != 0 && (apzgVar2 = auvxVar.c) == null) {
            apzgVar2 = apzg.a;
        }
        afvtVar.f(afveVar, apzgVar2);
    }
}
