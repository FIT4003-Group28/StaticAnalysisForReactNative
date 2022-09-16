package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fld  reason: default package */
/* loaded from: classes3.dex */
public final class fld extends ajsl implements frp {
    private aqnb a;
    private final akfb b;
    private final View c;
    private final Button d;
    private final akbj e;
    private final View f;
    private final YouTubeTextView g;
    private final akbj h;
    private final flh i;
    private final frr j;
    private final fle k;

    public fld(Context context, aafo aafoVar, ajsk ajskVar, ajmy ajmyVar, akfb akfbVar, frr frrVar) {
        this.b = akfbVar;
        this.j = frrVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.donation_companion, (ViewGroup) null, false);
        this.c = inflate;
        this.k = new fle((ViewGroup) inflate.findViewById(R.id.campaign_group), true, ajmyVar);
        Button button = (Button) inflate.findViewById(R.id.donation_button);
        this.d = button;
        zag.k(button, button.getBackground());
        this.e = new akbj(aafoVar, ajskVar, button);
        this.i = new flh(context, (ViewGroup) inflate.findViewById(R.id.progress_group), aafoVar);
        this.f = inflate.findViewById(R.id.divider);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.expand_button);
        this.g = youTubeTextView;
        zag.k(youTubeTextView, youTubeTextView.getBackground());
        this.h = new akbj(aafoVar, ajskVar, youTubeTextView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apoj apojVar;
        apoj apojVar2;
        arag aragVar;
        arag aragVar2;
        aqnb aqnbVar = (aqnb) obj;
        acti actiVar = ajrsVar.a;
        this.a = aqnbVar;
        this.k.a(aqnbVar);
        argj argjVar = null;
        if ((aqnbVar.b & 256) != 0) {
            apok apokVar = aqnbVar.f;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        this.e.b(apojVar, actiVar);
        if (apojVar != null) {
            Button button = this.d;
            if ((apojVar.b & 256) != 0) {
                aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            zag.m(button, ajgl.b(aragVar2));
        }
        this.i.a(aqnbVar);
        if ((aqnbVar.b & 16384) != 0) {
            apok apokVar2 = aqnbVar.l;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar2 = apokVar2.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        } else {
            apojVar2 = null;
        }
        this.h.b(apojVar2, actiVar);
        if (apojVar2 != null) {
            YouTubeTextView youTubeTextView = this.g;
            if ((apojVar2.b & 256) != 0) {
                aragVar = apojVar2.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(youTubeTextView, ajgl.b(aragVar));
            this.f.setVisibility(0);
            if ((apojVar2.b & 4096) != 0) {
                argl arglVar = apojVar2.m;
                if (arglVar == null) {
                    arglVar = argl.a;
                }
                if (arglVar.b == 102716411) {
                    argjVar = (argj) arglVar.c;
                } else {
                    argjVar = argj.a;
                }
            }
            if (argjVar != null) {
                this.b.b(argjVar, this.g, apojVar2, actiVar);
            }
        } else {
            this.f.setVisibility(8);
        }
        this.j.c(aqnbVar.y, this);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqnb) obj).z.I();
    }

    @Override // defpackage.frp
    public final void f(String str, aqnb aqnbVar) {
        aqnb aqnbVar2 = this.a;
        if (aqnbVar2 == null || !aqnbVar2.y.equals(str)) {
            return;
        }
        this.i.a(aqnbVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
