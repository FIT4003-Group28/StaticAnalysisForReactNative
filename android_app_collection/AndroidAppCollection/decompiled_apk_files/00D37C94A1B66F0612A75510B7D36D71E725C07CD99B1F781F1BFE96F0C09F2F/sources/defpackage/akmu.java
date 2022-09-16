package defpackage;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akmu  reason: default package */
/* loaded from: classes.dex */
public final class akmu extends akmy implements View.OnClickListener, ynl {
    public static final long ae = TimeUnit.SECONDS.toMillis(10);
    public acti af;
    public ajyi ag;
    public ajsg ah;
    public yni ai;
    public aafo aj;
    public snc ak;
    public zhf al;
    private apzg am;
    private View an;
    private RecyclerView ao;
    private ajsm ap;
    private Toolbar aq;
    private Snackbar ar;

    public static akmu aE(apzg apzgVar) {
        aqxo.p(apzgVar.qn(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint));
        akmu akmuVar = new akmu();
        Bundle bundle = new Bundle();
        aphq.m(bundle, "add_contacts_endpoint", apzgVar);
        akmuVar.ae(bundle);
        return akmuVar;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.ai.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                alwb.f(this.ak, this.ar, (aabj) obj, ae, this.aj, Integer.valueOf(zhn.j(rb(), R.attr.ytStaticBlue).orElse(0)));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabj.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, this.al.a);
        this.ai.g(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apbr apbrVar;
        byte[] I;
        apbn apbnVar;
        View inflate = layoutInflater.inflate(R.layout.add_contacts, viewGroup, false);
        this.an = inflate;
        this.ao = (RecyclerView) inflate.findViewById(R.id.add_contacts_choice_list);
        this.aq = (Toolbar) this.an.findViewById(R.id.toolbar);
        this.ar = (Snackbar) this.an.findViewById(R.id.snackbar);
        this.ag.a(apbp.class);
        this.ao.ag(new LinearLayoutManager());
        this.ap = new ajsm();
        ajsf a = this.ah.a(this.ag.get());
        a.h(this.ap);
        a.rZ(new ajrc(this.af));
        this.ao.ad(a);
        this.aq.r(this);
        this.aq.o(R.string.accessibility_back);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("add_contacts_endpoint")) {
            this.am = apzg.a;
        } else {
            try {
                this.am = (apzg) aphq.i(bundle2, "add_contacts_endpoint", apzg.a, aoos.b());
            } catch (aopx unused) {
                this.am = apzg.a;
            }
        }
        String str = this.am.qn(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint) ? ((AddContactsEndpointOuterClass$AddContactsEndpoint) this.am.qm(AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint)).b : null;
        arkv arkvVar = TextUtils.isEmpty(str) ? null : (arkv) abgb.e(str, arkv.a.getParserForType());
        if (arkvVar != null) {
            if ((arkvVar.b & 8) != 0) {
                ((acsx) this.af).D(new acte(arkvVar.d));
            }
            this.af.d(acuo.a(26926), this.am, null);
            if ((arkvVar.b & 8) != 0) {
                this.af.u(new acte(arkvVar.d), null);
            }
            arku arkuVar = arkvVar.c;
            if (arkuVar == null) {
                arkuVar = arku.a;
            }
            if ((arkuVar.b & 1) != 0) {
                arku arkuVar2 = arkvVar.c;
                if (arkuVar2 == null) {
                    arkuVar2 = arku.a;
                }
                auqh auqhVar = arkuVar2.c;
                if (auqhVar == null) {
                    auqhVar = auqh.a;
                }
                if (auqhVar.d.size() > 0 && (((auqk) auqhVar.d.get(0)).c & 1) != 0) {
                    apbp apbpVar = ((auqk) auqhVar.d.get(0)).L;
                    if (apbpVar == null) {
                        apbpVar = apbp.a;
                    }
                    if (apbpVar.b.size() != 0) {
                        for (apbq apbqVar : apbpVar.b) {
                            int i = apbqVar.b;
                            if (i == 105876287) {
                                apbn apbnVar2 = (apbn) apbqVar.c;
                                I = apbnVar2.b.I();
                                apbnVar = apbnVar2;
                            } else if (i == 79129962) {
                                aqdr aqdrVar = (aqdr) apbqVar.c;
                                I = aqdrVar.n.I();
                                apbnVar = aqdrVar;
                            } else if (i == 154581033) {
                                apbm apbmVar = (apbm) apbqVar.c;
                                I = apbmVar.b.I();
                                apbnVar = apbmVar;
                            }
                            this.ap.add(apbnVar);
                            ((acsx) this.af).D(new acte(I));
                        }
                    }
                }
                auqg auqgVar = auqhVar.g;
                if (auqgVar == null) {
                    auqgVar = auqg.a;
                }
                if (auqgVar.b == 128619045) {
                    Toolbar toolbar = this.aq;
                    auqg auqgVar2 = auqhVar.g;
                    if (auqgVar2 == null) {
                        auqgVar2 = auqg.a;
                    }
                    if (auqgVar2.b == 128619045) {
                        apbrVar = (apbr) auqgVar2.c;
                    } else {
                        apbrVar = apbr.a;
                    }
                    arag aragVar = apbrVar.b;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    toolbar.w(ajgl.b(aragVar));
                }
            }
        }
        return this.an;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }
}
