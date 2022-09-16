package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
import com.google.protos.youtube.api.innertube.MultiReelDismissalRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gkk  reason: default package */
/* loaded from: classes3.dex */
public final class gkk implements aafl {
    private final lqb a;

    public gkk(lqb lqbVar) {
        this.a = lqbVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        aqxo.p(apzgVar.qn(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand));
        aunb aunbVar = ((MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand) apzgVar.qm(MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand)).b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        final atjg atjgVar = (atjg) ajjh.l(aunbVar, MultiReelDismissalRendererOuterClass.multiReelDismissalRenderer);
        Map map2 = (Map) zew.K(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", Map.class);
        if (map2 != null) {
            final mow mowVar = (mow) zew.K(map2, "multiReelDismissalCallback", mow.class);
            aunb[] aunbVarArr = (aunb[]) zew.K(map2, "reelItemRenderers", aunb[].class);
            List list = (List) zew.K(map2, "reelDismissalInfo", List.class);
            if (aunbVarArr == null || mowVar == null || list == null) {
                return;
            }
            final lqb lqbVar = this.a;
            nx nxVar = lqbVar.g;
            if (nxVar != null && nxVar.isShowing()) {
                return;
            }
            lqbVar.d.oi().d(acuo.a(57929), apzgVar, null);
            lqbVar.i = list;
            lqbVar.h.clear();
            lqbVar.f.clear();
            View inflate = LayoutInflater.from(lqbVar.a).inflate(R.layout.multi_reel_dismissal, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_title);
            TextView textView2 = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_sub_title);
            Button button = (Button) inflate.findViewById(R.id.multi_reel_dismissal_done_button);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.multi_reel_dismissal_items);
            recyclerView.ag(new LinearLayoutManager(1));
            if ((atjgVar.b & 1) != 0) {
                aragVar = atjgVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            if ((atjgVar.b & 2) != 0) {
                aragVar2 = atjgVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            ArrayList arrayList = new ArrayList();
            for (aunb aunbVar2 : aunbVarArr) {
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) aunbVar2.qm(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                if (aunbVar2.qn(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) && (reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
                    List list2 = lqbVar.i;
                    aule auleVar = reelItemRendererOuterClass$ReelItemRenderer.s;
                    if (auleVar == null) {
                        auleVar = aule.a;
                    }
                    if (!list2.contains(auleVar)) {
                        arrayList.add(reelItemRendererOuterClass$ReelItemRenderer);
                    }
                }
            }
            recyclerView.ad(new lqa(lqbVar, arrayList, atjgVar));
            aunb aunbVar3 = atjgVar.g;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            final apoj apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar.b & 256) != 0) {
                aragVar3 = apojVar.i;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            button.setText(ajgl.b(aragVar3));
            lqbVar.d.oi().D(new acte(apojVar.t));
            lqbVar.d.oi().u(new acte(apojVar.t), null);
            button.setOnClickListener(new View.OnClickListener() { // from class: lpx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HashMap hashMap;
                    lqb lqbVar2 = lqb.this;
                    mow mowVar2 = mowVar;
                    atjg atjgVar2 = atjgVar;
                    apoj apojVar2 = apojVar;
                    lqbVar2.g.dismiss();
                    if (lqbVar2.h.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (aule auleVar2 : lqbVar2.h) {
                            if (auleVar2 != null) {
                                arrayList2.add(auleVar2.b);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            hashMap = new HashMap();
                            hashMap.put("feedback_token", arrayList2);
                        } else {
                            hashMap = null;
                        }
                        if (hashMap != null) {
                            mowVar2.a(lqbVar2.h);
                            aafo aafoVar = lqbVar2.c;
                            aopc aopcVar = (aopc) apzg.a.createBuilder();
                            aopa createBuilder = aqyh.a.createBuilder();
                            if ((atjgVar2.b & 32) != 0) {
                                apzg apzgVar2 = atjgVar2.h;
                                if (apzgVar2 == null) {
                                    apzgVar2 = apzg.a;
                                }
                                createBuilder.copyOnWrite();
                                aqyh aqyhVar = (aqyh) createBuilder.instance;
                                apzgVar2.getClass();
                                aopu aopuVar = aqyhVar.f;
                                if (!aopuVar.c()) {
                                    aqyhVar.f = aopi.mutableCopy(aopuVar);
                                }
                                aqyhVar.f.add(apzgVar2);
                            }
                            aopcVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, (aqyh) createBuilder.mo39build());
                            aafoVar.c((apzg) aopcVar.mo39build(), hashMap);
                        }
                        aopa createBuilder2 = asjr.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asjr asjrVar = (asjr) createBuilder2.instance;
                        asjrVar.b |= 1;
                        asjrVar.c = true;
                        asjr asjrVar2 = (asjr) createBuilder2.mo39build();
                        aopa createBuilder3 = asjj.a.createBuilder();
                        createBuilder3.copyOnWrite();
                        asjj asjjVar = (asjj) createBuilder3.instance;
                        asjrVar2.getClass();
                        asjjVar.q = asjrVar2;
                        asjjVar.c |= 1;
                        asjj asjjVar2 = (asjj) createBuilder3.mo39build();
                        for (byte[] bArr : lqbVar2.f.values()) {
                            if (bArr != null) {
                                lqbVar2.d.oi().w(new acte(bArr), asjjVar2);
                            }
                        }
                        if ((apojVar2.b & 1048576) == 0) {
                            return;
                        }
                        lqbVar2.d.oi().H(3, new acte(apojVar2.t), null);
                    }
                }
            });
            nw nwVar = new nw(lqbVar.a, R.style.MultiReelDismissalDialog);
            nwVar.p(inflate);
            lqbVar.g = nwVar.b();
            lqbVar.g.show();
            Window window = lqbVar.g.getWindow();
            window.setLayout(-1, -2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            window.setAttributes(attributes);
        }
    }
}
