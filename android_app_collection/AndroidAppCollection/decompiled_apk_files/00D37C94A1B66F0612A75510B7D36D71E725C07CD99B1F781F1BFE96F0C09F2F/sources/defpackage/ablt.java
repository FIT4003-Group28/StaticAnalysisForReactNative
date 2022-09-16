package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ablt  reason: default package */
/* loaded from: classes.dex */
public final class ablt extends able implements abri {
    public Executor ae;
    public yzj af;
    public abiq ag;
    public ajic ah;
    public ViewGroup ai;
    public View aj;
    public View ak;
    public TextView al;
    public byte[] am;
    private ImageView an;
    public aaza b;
    public ajyi c;
    public abks d;
    public abkw e;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        View view = this.O;
        if (this.d.c) {
            view.setBackgroundColor(0);
        }
        this.ai = (ViewGroup) view.findViewById(R.id.purchase_flow_container);
        this.aj = view.findViewById(R.id.loading_container);
        this.ak = view.findViewById(R.id.error_container);
        this.an = (ImageView) view.findViewById(R.id.error_image);
        this.al = (TextView) view.findViewById(R.id.error_message);
        view.findViewById(R.id.retry).setOnClickListener(new abls(this));
        Context rb = rb();
        this.an.setImageDrawable(akf.a(rb, this.e.a(0)));
        this.al.setTextColor(ake.d(rb, this.e.a(1)));
        q();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        ViewGroup viewGroup = this.ai;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.ai.getChildAt(i);
            if (childAt != null) {
                ajru g = akel.g(childAt);
                if (g instanceof abrf) {
                    ((abrf) g).k();
                }
            }
        }
    }

    @Override // defpackage.abri
    public final void aE() {
        Activity activity = this.a;
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.c.a(asrm.class);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.live_chat_purchase_flow, viewGroup, false);
    }

    @Override // defpackage.abri
    public final void p() {
        o();
    }

    public final void q() {
        this.aj.setVisibility(0);
        this.ai.setVisibility(8);
        this.ak.setVisibility(8);
        Bundle bundle = this.m;
        apzg c = aafr.c(bundle.getByteArray("navigation_endpoint"));
        this.am = c.c.I();
        aaza aazaVar = this.b;
        aayp aaypVar = new aayp(aazaVar.e, aazaVar.a.c());
        aaypVar.a = ((LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint) c.qm(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint)).b;
        if ((c.b & 1) == 0) {
            aaypVar.i();
        } else {
            aaypVar.j(c.c);
        }
        byte[] byteArray = bundle.getByteArray("ARG_CHAT_MESSAGE");
        assu assuVar = null;
        if (byteArray != null) {
            try {
                assuVar = (assu) aopi.parseFrom(assu.a, byteArray, aoos.b());
            } catch (aopx unused) {
            }
        }
        if (assuVar != null) {
            aaypVar.b = assuVar;
        }
        aaza aazaVar2 = this.b;
        ylx.k(aazaVar2.k.b(aaypVar, anjk.a), this.ae, new ylv() { // from class: ablq
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                ablt abltVar = ablt.this;
                abltVar.aj.setVisibility(8);
                abltVar.ak.setVisibility(0);
                abltVar.al.setText(abltVar.af.b(th));
            }
        }, new ylw() { // from class: ablr
            /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ajsa] */
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                arvz arvzVar;
                arvz arvzVar2;
                arvz arvzVar3;
                apzg apzgVar;
                ablt abltVar = ablt.this;
                arvy arvyVar = (arvy) obj;
                abltVar.aj.setVisibility(8);
                abltVar.ai.removeAllViews();
                ((acsx) abltVar.ag.p).E(new acte(arvyVar.e.I()), new acte(abltVar.am));
                abltVar.ag.p.u(new acte(arvyVar.e.I()), null);
                int i = arvyVar.b;
                if (i != 6) {
                    if (i == 3) {
                        arvzVar = (arvz) arvyVar.c;
                    } else {
                        arvzVar = arvz.a;
                    }
                    if ((arvzVar.b & 1) == 0) {
                        abltVar.ak.setVisibility(0);
                        return;
                    }
                    if (arvyVar.b == 3) {
                        arvzVar2 = (arvz) arvyVar.c;
                    } else {
                        arvzVar2 = arvz.a;
                    }
                    asrm asrmVar = arvzVar2.c;
                    if (asrmVar == null) {
                        asrmVar = asrm.a;
                    }
                    ajru h = akel.h(abltVar.c.get(), asrmVar, abltVar.ai);
                    if (h != null) {
                        ajrs ajrsVar = new ajrs();
                        ajrsVar.f("listenerKey", abltVar);
                        View a = h.a();
                        abltVar.ai.addView(a);
                        abltVar.ai.setVisibility(0);
                        if (arvyVar.b == 3) {
                            arvzVar3 = (arvz) arvyVar.c;
                        } else {
                            arvzVar3 = arvz.a;
                        }
                        asrm asrmVar2 = arvzVar3.c;
                        if (asrmVar2 == null) {
                            asrmVar2 = asrm.a;
                        }
                        h.oK(ajrsVar, asrmVar2);
                        a.requestFocus();
                        return;
                    }
                    abltVar.aj.setVisibility(8);
                    abltVar.ak.setVisibility(0);
                } else if (((apzg) arvyVar.c).qn(aqtg.a)) {
                    abltVar.o();
                    try {
                        amup k = amup.k("com.google.android.libraries.youtube.logging.interaction_logger", abltVar.ag.p);
                        ajic ajicVar = abltVar.ah;
                        if (arvyVar.b == 6) {
                            apzgVar = (apzg) arvyVar.c;
                        } else {
                            apzgVar = apzg.a;
                        }
                        ajicVar.kD(apzgVar, k);
                    } catch (aafy unused2) {
                    }
                } else {
                    Log.e("LiveChatPurchaseFlow", "No usable Command provided!");
                    abltVar.aj.setVisibility(8);
                    abltVar.ak.setVisibility(0);
                }
            }
        });
    }

    @Override // defpackage.abri
    public final void r() {
        o();
    }

    @Override // defpackage.abri
    public final void s() {
        dp dpVar = this.C;
        if (dpVar != null) {
            eo mL = dpVar.mL();
            if (mL.a() > 0) {
                mL.L();
            } else {
                o();
            }
        }
    }
}
