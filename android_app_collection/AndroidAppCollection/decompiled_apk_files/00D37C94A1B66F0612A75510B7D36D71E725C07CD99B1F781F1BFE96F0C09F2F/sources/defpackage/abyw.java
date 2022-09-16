package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconMessageRendererOuterClass;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abyw  reason: default package */
/* loaded from: classes.dex */
public final class abyw extends abyr {
    public akbn ae;
    public ajxz af;
    public acth ag;
    public atit ah;
    public Map ai;
    private View aj;
    private TextView ak;
    private RecyclerView al;
    private abyv am;
    private akbm an;
    private akbm ao;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
        LayoutInflater from = LayoutInflater.from(rb());
        View inflate = from.inflate(R.layout.multi_message_confirm_dialog_layout, new ScrollView(rb()));
        this.aj = inflate;
        this.ak = (TextView) inflate.findViewById(R.id.title);
        this.al = (RecyclerView) this.aj.findViewById(R.id.recycler_view);
        rb();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        this.al.ag(linearLayoutManager);
        abyv abyvVar = new abyv(from);
        this.am = abyvVar;
        this.al.ad(abyvVar);
        this.an = this.ae.a((TextView) this.aj.findViewById(R.id.cancel_button));
        this.ao = this.ae.a((TextView) this.aj.findViewById(R.id.confirm_button));
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (ap()) {
            dismiss();
            qv(this.z, "MultiMessageConfirmDialogFragment");
        }
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        apoj apojVar;
        apoj apojVar2;
        Spanned spanned;
        atit atitVar = this.ah;
        atitVar.getClass();
        TextView textView = this.ak;
        arag aragVar = atitVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        this.am.d.clear();
        if (this.ah.f.size() != 0) {
            Iterator it = this.ah.f.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                arhp arhpVar = (arhp) ((aunb) it.next()).qm(IconMessageRendererOuterClass.iconMessageRenderer);
                abyv abyvVar = this.am;
                if ((arhpVar.b & 1) != 0) {
                    ajxz ajxzVar = this.af;
                    arhs arhsVar = arhpVar.c;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    i = ajxzVar.a(b);
                }
                if ((arhpVar.b & 2) != 0) {
                    arag aragVar2 = arhpVar.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    spanned = ajgl.b(aragVar2);
                } else {
                    spanned = null;
                }
                abyvVar.d.add(new abyu(i, spanned));
            }
            this.al.setVisibility(0);
        } else {
            this.al.setVisibility(8);
        }
        this.am.mr();
        akbm akbmVar = this.an;
        aunb aunbVar = this.ah.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = this.ah.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        akbmVar.a(apojVar, this.ag.oi(), this.ai);
        this.an.d = new abys(this, 1);
        akbm akbmVar2 = this.ao;
        aunb aunbVar3 = this.ah.d;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = this.ah.d;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar2 = null;
        }
        akbmVar2.a(apojVar2, this.ag.oi(), this.ai);
        this.ao.d = new abys(this);
        this.ag.oi().u(new acte(this.ah.g), null);
        return new AlertDialog.Builder(rb()).setView(this.aj).create();
    }
}
