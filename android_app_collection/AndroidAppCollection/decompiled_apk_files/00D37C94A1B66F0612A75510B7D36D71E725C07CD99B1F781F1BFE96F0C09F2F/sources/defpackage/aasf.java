package defpackage;

import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
/* compiled from: PG */
/* renamed from: aasf  reason: default package */
/* loaded from: classes.dex */
public final class aasf {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public String i;
    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint j;
    private apwe k;
    private String l;
    private aoxo m;

    public aasf() {
    }

    public aasf(apwe apweVar) {
        this.k = apweVar;
    }

    public aasf(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) {
        this.j = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
    }

    public final String a() {
        if (this.l == null) {
            b();
        }
        return this.l;
    }

    public final void b() {
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = this.j;
        if (selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint != null) {
            if (selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.b.size() != 0) {
                for (aoxp aoxpVar : this.j.b) {
                    if ((aoxpVar.b & 4) != 0) {
                        aoxr aoxrVar = aoxpVar.d;
                        if (aoxrVar == null) {
                            aoxrVar = aoxr.a;
                        }
                        this.l = aoxrVar.c;
                    }
                    if ((aoxpVar.b & 8) != 0) {
                        aoxs aoxsVar = aoxpVar.e;
                        if (aoxsVar == null) {
                            aoxsVar = aoxs.a;
                        }
                        if (!aoxsVar.b.isEmpty()) {
                            aoxs aoxsVar2 = aoxpVar.e;
                            if (aoxsVar2 == null) {
                                aoxsVar2 = aoxs.a;
                            }
                            this.b = aoxsVar2.b;
                        }
                    }
                    if ((aoxpVar.b & 1) != 0) {
                        aoxq aoxqVar = aoxpVar.c;
                        if (aoxqVar == null) {
                            aoxqVar = aoxq.a;
                        }
                        if (!aoxqVar.c.isEmpty()) {
                            aoxq aoxqVar2 = aoxpVar.c;
                            if (aoxqVar2 == null) {
                                aoxqVar2 = aoxq.a;
                            }
                            this.a = aoxqVar2.c;
                        }
                    }
                    if ((aoxpVar.b & 1024) != 0) {
                        aoxu aoxuVar = aoxpVar.h;
                        if (aoxuVar == null) {
                            aoxuVar = aoxu.a;
                        }
                        this.d = Boolean.valueOf(aoxuVar.b);
                    }
                    if ((aoxpVar.b & 2048) != 0) {
                        aqkg aqkgVar = aoxpVar.i;
                        if (aqkgVar == null) {
                            aqkgVar = aqkg.a;
                        }
                        this.c = aqkgVar.b;
                    }
                    if ((aoxpVar.b & 128) != 0 && this.m == null) {
                        aoxo aoxoVar = aoxpVar.g;
                        if (aoxoVar == null) {
                            aoxoVar = aoxo.b;
                        }
                        this.m = aoxoVar;
                        if (new aops(aoxoVar.d, aoxo.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                            this.f = true;
                        }
                        if (new aops(this.m.d, aoxo.a).contains(aoxn.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                            this.g = true;
                        }
                    }
                    if ((aoxpVar.b & 16) != 0) {
                        this.e = true;
                        aoxt aoxtVar = aoxpVar.f;
                        if (aoxtVar == null) {
                            aoxtVar = aoxt.a;
                        }
                        this.i = aoxtVar.b;
                        aoxt aoxtVar2 = aoxpVar.f;
                        if (aoxtVar2 == null) {
                            aoxtVar2 = aoxt.a;
                        }
                        this.l = aoxtVar2.b;
                        aoxt aoxtVar3 = aoxpVar.f;
                        if (aoxtVar3 == null) {
                            aoxtVar3 = aoxt.a;
                        }
                        String str = aoxtVar3.c;
                    }
                }
            }
        } else {
            apwe apweVar = this.k;
            if (apweVar == null) {
                return;
            }
            this.l = apweVar.h;
            if (new aops(apweVar.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
                this.b = this.k.d;
            }
            if (new aops(this.k.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
                this.e = true;
                apwe apweVar2 = this.k;
                String str2 = apweVar2.d;
                this.i = str2;
                this.l = str2;
                String str3 = apweVar2.e;
            }
            if (new aops(this.k.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                this.f = true;
                int c = apwt.c(this.k.f);
                if (c != 0 && c == 3) {
                    this.l = this.k.d;
                    this.h = true;
                }
            }
            if (new aops(this.k.g, apwe.a).contains(aoxn.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                this.g = true;
                int c2 = apwt.c(this.k.f);
                if (c2 != 0 && c2 == 3) {
                    this.l = this.k.d;
                    this.h = true;
                }
            }
            apwe apweVar3 = this.k;
            this.a = apweVar3.i;
            aqkg aqkgVar2 = apweVar3.j;
            if (aqkgVar2 == null) {
                aqkgVar2 = aqkg.a;
            }
            this.c = aqkgVar2.b;
        }
    }
}
