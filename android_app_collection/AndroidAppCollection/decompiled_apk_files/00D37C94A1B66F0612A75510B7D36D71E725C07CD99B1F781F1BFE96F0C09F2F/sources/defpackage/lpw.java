package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LugashFooterRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lpw  reason: default package */
/* loaded from: classes3.dex */
public final class lpw extends lom implements View.OnClickListener, ynl {
    private Spanned aA;
    private Spanned aB;
    private Spanned aC;
    private Spanned aD;
    private View aE;
    private RecyclerView aF;
    private boolean aG;
    private aypg aH;
    public ems ae;
    public azqb af;
    public azqb ag;
    public azqb ah;
    public azqb ai;
    public yni aj;
    public fsx ak;
    public advc al;
    public ajsg am;
    public afvn an;
    public fyy ao;
    public aafo ap;
    public gfu aq;
    public aadd ar;
    public ayor as;
    public apzg at;
    public apzg au;
    protected ajsi av;
    protected Toolbar aw;
    private atix ax;
    private ajsf ay;
    private ajrj az;

    public static final int aG(Context context, boolean z) {
        return zew.i(context.getResources().getDisplayMetrics(), true != z ? 4 : 0);
    }

    private final void aH() {
        Context rb = rb();
        Dialog dialog = this.d;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window == null || !zew.y(rb)) {
            return;
        }
        window.setLayout((int) (zew.l(rb) * 0.7f), (int) (zew.j(rb) * 0.7f));
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.aj.m(this);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        dismiss();
    }

    @Override // defpackage.lom, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.aH = this.ar.a.V(ktg.l).V(new ageg(context, 1)).X(this.as).as(new ayqb() { // from class: lpv
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Integer num = (Integer) obj;
                Toolbar toolbar = lpw.this.aw;
                if (toolbar != null) {
                    toolbar.setElevation(num.intValue());
                }
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                gno gnoVar = (gno) obj;
                dismiss();
                return null;
            } else if (i == 1) {
                if (!((wgh) obj).c()) {
                    return null;
                }
                dismiss();
                return null;
            } else if (i == 2) {
                adva advaVar = (adva) obj;
                dismiss();
                this.al.k();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{gno.class, wgh.class, adva.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void lU() {
        super.lU();
        aypg aypgVar = this.aH;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        augv augvVar;
        Spanned spannedString;
        atjd atjdVar;
        arag aragVar;
        atjd atjdVar2;
        atiz atizVar;
        aoxh aoxhVar;
        atjb atjbVar;
        atix atixVar;
        super.mQ(bundle);
        this.aj.g(this);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MenuButtonRendererKey")) {
            this.ax = atix.a;
        } else {
            byte[] byteArray = bundle2.getByteArray("MenuButtonRendererKey");
            if (byteArray != null) {
                try {
                    atjf atjfVar = (atjf) aopi.parseFrom(atjf.a, byteArray, aoos.b());
                    if (atjfVar.e == 3) {
                        atjbVar = (atjb) atjfVar.f;
                    } else {
                        atjbVar = atjb.a;
                    }
                    if (atjbVar.b == 120770929) {
                        atixVar = (atix) atjbVar.c;
                    } else {
                        atixVar = atix.a;
                    }
                    this.ax = atixVar;
                } catch (aopx e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                    sb.append("Unable to decode menu items: ");
                    sb.append(valueOf);
                    zep.b(sb.toString());
                }
            }
        }
        ajsm ajsmVar = new ajsm();
        this.az = new ajrj();
        ativ ativVar = this.ax.d;
        if (ativVar == null) {
            ativVar = ativ.a;
        }
        if (ativVar.b == 77195710) {
            ativ ativVar2 = this.ax.d;
            if (ativVar2 == null) {
                ativVar2 = ativ.a;
            }
            if (ativVar2.b == 77195710) {
                aoxhVar = (aoxh) ativVar2.c;
            } else {
                aoxhVar = aoxh.a;
            }
            ajsmVar.add(aoxhVar);
        }
        this.az.m(ajsmVar);
        int size = this.ax.e.size();
        for (int i = 0; i < size; i++) {
            atja atjaVar = (atja) this.ax.e.get(i);
            ajsm ajsmVar2 = new ajsm();
            if (atjaVar.b == 122175950) {
                atizVar = (atiz) atjaVar.c;
            } else {
                atizVar = atiz.a;
            }
            for (atiy atiyVar : atizVar.b) {
                if (atiyVar.b == 94317419) {
                    ajsmVar2.add((apke) atiyVar.c);
                }
                if (atiyVar.b == 79129962) {
                    ajsmVar2.add((aqdr) atiyVar.c);
                }
            }
            if (i < size - 1) {
                ajsmVar2.add(new mpe());
            }
            this.az.m(ajsmVar2);
        }
        ajsi ajsiVar = new ajsi();
        this.av = ajsiVar;
        ajsiVar.f(aoxh.class, new ajsc(this.af));
        this.av.f(aqdr.class, new ajsc(this.ag));
        this.av.f(apke.class, new ajsc(this.ah));
        this.av.f(mpe.class, new ajsc(this.ai));
        ajsf a = this.am.a(this.av);
        this.ay = a;
        a.h(this.az);
        atix atixVar2 = this.ax;
        if (atixVar2 != null) {
            atjc atjcVar = atixVar2.c;
            if (atjcVar == null) {
                atjcVar = atjc.a;
            }
            if (atjcVar.b == 123890900) {
                atjc atjcVar2 = this.ax.c;
                if (atjcVar2 == null) {
                    atjcVar2 = atjc.a;
                }
                if (atjcVar2.b == 123890900) {
                    atjdVar = (atjd) atjcVar2.c;
                } else {
                    atjdVar = atjd.a;
                }
                if ((atjdVar.b & 2) != 0) {
                    atjc atjcVar3 = this.ax.c;
                    if (atjcVar3 == null) {
                        atjcVar3 = atjc.a;
                    }
                    if (atjcVar3.b == 123890900) {
                        atjdVar2 = (atjd) atjcVar3.c;
                    } else {
                        atjdVar2 = atjd.a;
                    }
                    aragVar = atjdVar2.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                this.aA = ajgl.b(aragVar);
            }
            atix atixVar3 = this.ax;
            if ((atixVar3.b & 4) != 0) {
                atiu atiuVar = atixVar3.f;
                if (atiuVar == null) {
                    atiuVar = atiu.a;
                }
                if (atiuVar.b == 88571644) {
                    arag aragVar2 = ((aswu) atiuVar.c).b;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    this.aB = ajgl.b(aragVar2);
                }
                if (atiuVar.b == 242554289) {
                    augvVar = (augv) atiuVar.c;
                } else {
                    augvVar = augv.a;
                }
                if (atiuVar.b == 242554289) {
                    if ((augvVar.b & 4) != 0) {
                        aunb aunbVar = augvVar.e;
                        if (aunbVar == null) {
                            aunbVar = aunb.a;
                        }
                        aswu aswuVar = (aswu) ajjh.l(aunbVar, LugashFooterRendererOuterClass.lugashFooterRenderer);
                        if (aswuVar != null) {
                            arag aragVar3 = aswuVar.b;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                            spannedString = ajgl.b(aragVar3);
                        } else {
                            spannedString = new SpannedString("");
                        }
                        this.aB = spannedString;
                    }
                    arag aragVar4 = augvVar.c;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    this.aC = ajgl.b(aragVar4);
                    arag aragVar5 = augvVar.d;
                    if (aragVar5 == null) {
                        aragVar5 = arag.a;
                    }
                    this.aD = ajgl.b(aragVar5);
                    apzg apzgVar = augvVar.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    this.au = apzgVar;
                    apzg apzgVar2 = augvVar.g;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    this.at = apzgVar2;
                }
            }
        }
        this.aG = this.an.c().g();
        boolean X = eog.X(this.ar.a());
        if (!this.aG) {
            boolean y = zew.y(rb());
            gfs gfsVar = gfs.LIGHT;
            int ordinal = this.aq.a().ordinal();
            if (ordinal == 0) {
                if (y) {
                    mN(0, true != X ? 2132083912 : 2132083913);
                } else {
                    mN(0, true != X ? 2132083911 : 2132083914);
                }
            } else if (ordinal == 1) {
                if (y) {
                    mN(0, true != X ? 2132083884 : 2132083885);
                } else {
                    mN(0, true != X ? 2132083883 : 2132083886);
                }
            }
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        Window window;
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            aH();
            window.setWindowAnimations(R.style.SlideUpDownAnimation);
        }
        this.ao.h(1);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.multi_page_menu_dialog_fragment, viewGroup, false);
        this.aE = inflate;
        this.aF = (RecyclerView) inflate.findViewById(R.id.list);
        this.aw = (Toolbar) this.aE.findViewById(R.id.toolbar);
        this.aF.ad(this.ay);
        this.aF.ag(new LinearLayoutManager());
        this.aF.setOnClickListener(this);
        if ((this.ax.b & 2) == 0) {
            this.aF.setPaddingRelative(0, rb().getResources().getDimensionPixelSize(R.dimen.list_item_vpadding), 0, 0);
        }
        this.aw.y(this.ak.m.la(mJ()));
        this.aw.setBackgroundColor(this.ak.j.la(mJ()));
        this.aw.r(this);
        this.aw.w(this.aA);
        this.aw.q(zag.f(rb(), 2131233493, R.attr.ytTextPrimary));
        this.aw.setElevation(aG(layoutInflater.getContext(), eog.W(this.ar.a())));
        if (this.aG) {
            this.aw.setVisibility(8);
        }
        TextView textView = (TextView) this.aE.findViewById(R.id.lugash_footer);
        Spanned spanned = this.aB;
        if (spanned != null) {
            textView.setText(spanned);
            textView.setVisibility(0);
        }
        if (this.aC != null && this.au != null && this.aD != null && this.at != null) {
            ((LinearLayout) this.aE.findViewById(R.id.privacy_tos_footer)).setVisibility(0);
            TextView textView2 = (TextView) this.aE.findViewById(R.id.privacy_footer);
            TextView textView3 = (TextView) this.aE.findViewById(R.id.tos_footer);
            textView2.setText(this.aC);
            textView2.setOnClickListener(new lpu(this, 1));
            textView3.setText(this.aD);
            textView3.setOnClickListener(new lpu(this));
        }
        this.ae.oi().u(new acte(this.ax.g), null);
        return this.aE;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        this.ao.m(1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aH();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        if (this.aG) {
            return new aljo(rg(), this.b);
        }
        return super.oy(bundle);
    }
}
