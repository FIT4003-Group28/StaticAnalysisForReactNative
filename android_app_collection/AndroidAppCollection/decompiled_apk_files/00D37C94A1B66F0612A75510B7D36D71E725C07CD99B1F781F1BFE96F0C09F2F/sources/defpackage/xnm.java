package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xnm  reason: default package */
/* loaded from: classes4.dex */
public final class xnm implements View.OnClickListener, ynl {
    public final View a;
    public final ww b;
    public final acti c;
    public final xyf d;
    public xnl e;
    public Map f;
    boolean g;
    private final Context h;
    private final ajyi i;
    private final ajsm j;
    private final ajrh k;
    private final akfb l;

    public xnm(Context context, ajyi ajyiVar, ajrh ajrhVar, View view, akfb akfbVar, acti actiVar, xyf xyfVar, yni yniVar) {
        ajyiVar.getClass();
        view.getClass();
        akfbVar.getClass();
        actiVar.getClass();
        xyfVar.getClass();
        ajsm ajsmVar = new ajsm();
        ww wwVar = new ww(context);
        this.h = context;
        this.i = ajyiVar;
        this.a = view;
        this.l = akfbVar;
        this.c = actiVar;
        this.d = xyfVar;
        this.k = ajrhVar;
        this.j = ajsmVar;
        this.b = wwVar;
        view.setVisibility(8);
        if (yniVar != null) {
            yniVar.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ajsa] */
    public final void a(final auxr auxrVar) {
        String str;
        argj argjVar;
        this.b.k();
        this.j.clear();
        this.a.setTag(R.id.sort_menu_anchor_model, auxrVar);
        if (auxrVar == null || auxrVar.c.size() <= 0) {
            this.a.setVisibility(8);
            return;
        }
        if (!this.g) {
            this.g = true;
            this.b.f = (int) this.h.getResources().getDimension(R.dimen.sort_menu_width);
            this.b.z();
            this.a.setOnClickListener(this);
            this.d.a();
        }
        ajrg a = this.k.a(this.i.get());
        a.h(this.j);
        a.a.b(new ajrt() { // from class: xnk
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
                xnm xnmVar = xnm.this;
                auxr auxrVar2 = auxrVar;
                ajrsVar.f("sortFilterMenu", xnmVar.b);
                ajrsVar.f("sortFilterMenuModel", auxrVar2);
                ajrsVar.f("sortFilterContinuationHandler", xnmVar.e);
                ajrsVar.f("sortFilterEndpointArgsKey", xnmVar.f);
                ajrsVar.a(xnmVar.c);
            }
        });
        this.b.e(a);
        this.a.setVisibility(0);
        View view = this.a;
        if ((auxrVar.b & 4) != 0) {
            aovs aovsVar = auxrVar.f;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        } else {
            str = null;
        }
        view.setContentDescription(str);
        argl arglVar = auxrVar.g;
        if (arglVar == null) {
            arglVar = argl.a;
        }
        if (arglVar.b != 102716411) {
            return;
        }
        akfb akfbVar = this.l;
        argl arglVar2 = auxrVar.g;
        if (arglVar2 == null) {
            arglVar2 = argl.a;
        }
        if (arglVar2.b == 102716411) {
            argjVar = (argj) arglVar2.c;
        } else {
            argjVar = argj.a;
        }
        akfbVar.b(argjVar, this.a, auxrVar, this.c);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint = (CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint) ((xou) obj).h();
                if ((commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.b & 16) == 0 || !commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.g) {
                    return null;
                }
                xnl xnlVar = this.e;
                aqcm aqcmVar = commentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.c;
                if (aqcmVar == null) {
                    aqcmVar = aqcm.a;
                }
                aumx aumxVar = aqcmVar.c;
                if (aumxVar == null) {
                    aumxVar = aumx.a;
                }
                xnlVar.a(ajna.g(aumxVar));
                auxr auxrVar = (auxr) this.a.getTag(R.id.sort_menu_anchor_model);
                this.b.w(0);
                int i2 = 0;
                while (i2 < auxrVar.c.size()) {
                    this.d.b((auxq) auxrVar.c.get(i2), i2 == 0);
                    i2++;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{xou.class};
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.j.clear();
        auxr auxrVar = (auxr) this.a.getTag(R.id.sort_menu_anchor_model);
        if (auxrVar != null) {
            int i = -1;
            for (int i2 = 0; i2 < auxrVar.c.size(); i2++) {
                auxq auxqVar = (auxq) auxrVar.c.get(i2);
                this.j.add(auxqVar);
                if (true == auxqVar.g) {
                    i = i2;
                }
            }
            ww wwVar = this.b;
            wwVar.j = 8388661;
            wwVar.l = this.a;
            wwVar.s();
            if (i <= 0) {
                return;
            }
            this.b.w(i);
        }
    }
}
