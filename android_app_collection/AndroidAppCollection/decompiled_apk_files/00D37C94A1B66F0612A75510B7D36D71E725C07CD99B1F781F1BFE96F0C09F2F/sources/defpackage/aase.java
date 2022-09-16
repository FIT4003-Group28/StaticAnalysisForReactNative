package defpackage;

import com.google.protos.youtube.api.innertube.RequiredSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aase  reason: default package */
/* loaded from: classes.dex */
public final class aase {
    public final arkn a;
    public aarz b;
    private List c;
    private aunq d;

    public aase(arkn arknVar) {
        this.a = arknVar;
    }

    public final aarw a() {
        arkn arknVar = this.a;
        if (arknVar != null) {
            apzg apzgVar = arknVar.d;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
                apzg apzgVar2 = this.a.d;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                String a = new aasf((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) apzgVar2.qm(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)).a();
                if (a == null) {
                    return null;
                }
                for (aarw aarwVar : c()) {
                    if (aarwVar.l() && a.equals(aarwVar.i())) {
                        return aarwVar;
                    }
                }
            }
        }
        return null;
    }

    public final aunq b() {
        arkn arknVar;
        if (this.d == null && (arknVar = this.a) != null) {
            aunb aunbVar = arknVar.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(RequiredSignInRendererOuterClass.requiredSignInRenderer)) {
                aunb aunbVar2 = this.a.f;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                this.d = (aunq) aunbVar2.qm(RequiredSignInRendererOuterClass.requiredSignInRenderer);
            }
        }
        return this.d;
    }

    public final List c() {
        if (this.c == null) {
            LinkedList linkedList = new LinkedList();
            for (arko arkoVar : this.a.c) {
                if (arkoVar.b == 77108254) {
                    for (aoxe aoxeVar : ((aoxf) arkoVar.c).c) {
                        if (aoxeVar.b == 63434476) {
                            for (aoxb aoxbVar : ((aoxc) aoxeVar.c).b) {
                                if (aoxbVar.b == 62381864) {
                                    aarw aarwVar = new aarw((aowy) aoxbVar.c);
                                    aarwVar.a().getClass();
                                    if (!aarwVar.d().qn(auqo.b)) {
                                        if (aarwVar.l()) {
                                            if (aarwVar.n()) {
                                                zgh.m(aarwVar.k());
                                            } else {
                                                zgh.m(aarwVar.i());
                                            }
                                        }
                                        linkedList.add(aarwVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.c = Collections.unmodifiableList(linkedList);
        }
        return this.c;
    }
}
