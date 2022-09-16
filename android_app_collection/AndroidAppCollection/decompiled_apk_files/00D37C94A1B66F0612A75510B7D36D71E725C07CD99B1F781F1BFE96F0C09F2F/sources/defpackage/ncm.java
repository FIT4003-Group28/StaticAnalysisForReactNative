package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ncm  reason: default package */
/* loaded from: classes3.dex */
public final class ncm implements ajru, fzq, geq {
    public final aafo a;
    private final ajru b;
    private final mww c;
    private Object d;
    private ggz e;

    public ncm(mkm mkmVar, aafo aafoVar, tjv tjvVar, enm enmVar) {
        this.b = mkmVar.a(true);
        aafoVar.getClass();
        this.a = aafoVar;
        this.c = new mww(aafoVar, tjvVar, enmVar, a());
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((mkl) this.b).b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajru, fzq] */
    @Override // defpackage.fzq
    public final View g() {
        return this.b.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajru, fzq] */
    @Override // defpackage.fzq
    public final void i(boolean z) {
        this.b.i(z);
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajru, geq] */
    @Override // defpackage.geq
    public final aynr oI(int i) {
        return this.b.oI(i);
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof ncm) && ((ncm) geqVar).d == this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aozy aozyVar;
        arjw arjwVar;
        final aujn aujnVar;
        aujj aujjVar = (aujj) obj;
        this.d = aujjVar;
        mww mwwVar = this.c;
        acti actiVar = ajrsVar.a;
        String str = aujjVar.g;
        aopu aopuVar = aujjVar.d;
        TextView textView = null;
        if ((aujjVar.b & 2) != 0) {
            aozy aozyVar2 = aujjVar.e;
            if (aozyVar2 == null) {
                aozyVar2 = aozy.a;
            }
            aozyVar = aozyVar2;
        } else {
            aozyVar = null;
        }
        mwwVar.d(actiVar, aujjVar, str, aopuVar, aozyVar, aujjVar.f.I());
        aunb aunbVar = aujjVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aunb aunbVar2 = aujjVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            arjwVar = (arjw) aunbVar2.qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        } else {
            arjwVar = null;
        }
        ggz bm = eog.bm(aujjVar);
        this.e = bm;
        this.b.oK(ajrsVar, bm);
        arju arjuVar = arjwVar.g;
        if (arjuVar == null) {
            arjuVar = arju.a;
        }
        arjt arjtVar = arjuVar.c;
        if (arjtVar == null) {
            arjtVar = arjt.a;
        }
        arjr arjrVar = arjtVar.o;
        if (arjrVar == null) {
            arjrVar = arjr.a;
        }
        if ((arjrVar.b & 1) != 0) {
            arjr arjrVar2 = arjtVar.o;
            if (arjrVar2 == null) {
                arjrVar2 = arjr.a;
            }
            aujnVar = arjrVar2.c;
            if (aujnVar == null) {
                aujnVar = aujn.a;
            }
        } else {
            aujnVar = null;
        }
        View findViewById = a().findViewById(R.id.call_to_action);
        if (findViewById != null) {
            if (findViewById instanceof ViewStub) {
                textView = (TextView) ((ViewStub) findViewById).inflate();
            } else {
                textView = (TextView) findViewById;
            }
        }
        if (textView == null) {
            return;
        }
        if (aujnVar != null) {
            int i = aujnVar.b;
            if ((i & 1) != 0 && (i & 4) != 0) {
                arag aragVar = aujnVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
                final HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aujnVar);
                textView.setOnClickListener(new View.OnClickListener() { // from class: ncl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ncm ncmVar = ncm.this;
                        aujn aujnVar2 = aujnVar;
                        Map map = hashMap;
                        aafo aafoVar = ncmVar.a;
                        apzg apzgVar = aujnVar2.d;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.c(apzgVar, map);
                    }
                });
                textView.setVisibility(0);
                return;
            }
        }
        textView.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.qZ(ajsaVar);
        this.c.c();
        this.e = null;
        this.d = null;
    }
}
