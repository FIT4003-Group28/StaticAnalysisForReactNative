package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;
/* compiled from: PG */
/* renamed from: yhw  reason: default package */
/* loaded from: classes4.dex */
public final class yhw extends yhp implements akgj, ybm {
    private ajnj aA;
    public Activity ae;
    public aafo af;
    public afvn ag;
    public ajmr ah;
    public abff ai;
    public yzj aj;
    public afwc ak;
    public ajxz al;
    public yni am;
    public acth an;
    public ybo ao;
    public apzg ap;
    public LoadingFrameLayout aq;
    public yib ar;
    public boolean as;
    private yfh at;
    private LoadingFrameLayout au;
    private AlertDialog av;
    private TextView aw;
    private TextView ax;
    private TextView ay;
    private TextView az;

    public static awja aG(asht ashtVar) {
        ashg ashgVar = ashtVar.c;
        if (ashgVar == null) {
            ashgVar = ashg.a;
        }
        if (ashgVar.b == 65500215) {
            ashg ashgVar2 = ashtVar.c;
            if (ashgVar2 == null) {
                ashgVar2 = ashg.a;
            }
            if (ashgVar2.b == 65500215) {
                return (awja) ashgVar2.c;
            }
            return awja.a;
        }
        return null;
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.am.d(new yhq());
    }

    @Override // defpackage.ybm
    public final void a() {
    }

    public final void aH() {
        this.aq.a();
        this.aq.c();
        apzg apzgVar = this.ap;
        if (apzgVar == null || !apzgVar.qn(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint)) {
            zep.b("Invalid navigation endpoint provided.");
            dismiss();
            return;
        }
        abff abffVar = this.ai;
        abfc abfcVar = new abfc(abffVar.e, abffVar.c.c());
        YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint = (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint) this.ap.qm(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint);
        ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.getClass();
        abfcVar.a = abfc.g(ypcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.b);
        apzg apzgVar2 = this.ap;
        if ((apzgVar2.b & 1) == 0) {
            abfcVar.i();
        } else {
            abfcVar.j(apzgVar2.c);
        }
        abff abffVar2 = this.ai;
        abffVar2.h.e(abfcVar, new yhu(this));
    }

    public final void aI(boolean z) {
        this.as = z;
        yib yibVar = this.ar;
        if (!z) {
            yibVar.b();
        }
        yibVar.o = z;
        if (z) {
            this.au.c();
        } else {
            this.au.a();
        }
    }

    public final void aJ(CharSequence charSequence) {
        if (this.at == null) {
            this.at = new yfh(this.ae, this.aj);
        }
        this.at.a(charSequence);
    }

    @Override // defpackage.ybm
    public final void b() {
        aI(false);
    }

    @Override // defpackage.ybm
    public final void c(CharSequence charSequence) {
        aI(false);
        aJ(charSequence);
    }

    @Override // defpackage.ybm
    public final void d(abez abezVar) {
        String str;
        awix a = this.ar.a();
        if ((a.b & 128) == 0 || !a.qn(awiy.d)) {
            return;
        }
        if ((a.b & 128) != 0) {
            awis awisVar = a.j;
            if (awisVar == null) {
                awisVar = awis.a;
            }
            if ((awisVar.b & 1) != 0) {
                awis awisVar2 = a.j;
                if (awisVar2 == null) {
                    awisVar2 = awis.a;
                }
                str = awisVar2.c;
                abezVar.s = abez.g(str);
                abezVar.t = abez.g((String) a.qm(awiy.d));
            }
        }
        str = "";
        abezVar.s = abez.g(str);
        abezVar.t = abez.g((String) a.qm(awiy.d));
    }

    @Override // defpackage.ybm
    public final void e(ashn ashnVar) {
        awin awinVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        if ((ashnVar.b & 16) != 0) {
            this.an.oi().D(new acte(ashnVar.g.I()));
        }
        aI(false);
        ashf ashfVar = ashnVar.d;
        if (ashfVar == null) {
            ashfVar = ashf.a;
        }
        arag aragVar5 = null;
        if (ashfVar.b == 65097874) {
            ashf ashfVar2 = ashnVar.d;
            if (ashfVar2 == null) {
                ashfVar2 = ashf.a;
            }
            if (ashfVar2.b == 65097874) {
                awinVar = (awin) ashfVar2.c;
            } else {
                awinVar = awin.a;
            }
        } else {
            awinVar = null;
        }
        if (awinVar != null) {
            awio awioVar = awinVar.c;
            if (awioVar == null) {
                awioVar = awio.a;
            }
            if ((awioVar.b & 1) != 0) {
                awii awiiVar = awioVar.c;
                if (awiiVar == null) {
                    awiiVar = awii.a;
                }
                if (this.av == null) {
                    View inflate = View.inflate(this.ae, R.layout.ypc_post_tip_text_screen, null);
                    this.aA = new ajnj(this.ah, (ImageView) inflate.findViewById(R.id.viewer_thumbnail));
                    this.aw = (TextView) inflate.findViewById(R.id.thank_you_message_header);
                    this.ax = (TextView) inflate.findViewById(R.id.thank_you_message);
                    this.ay = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
                    this.az = (TextView) inflate.findViewById(R.id.confirmation_msg);
                    AlertDialog.Builder cancelable = new AlertDialog.Builder(this.ae).setCancelable(false);
                    if ((awiiVar.b & 32) != 0) {
                        aragVar4 = awiiVar.h;
                        if (aragVar4 == null) {
                            aragVar4 = arag.a;
                        }
                    } else {
                        aragVar4 = null;
                    }
                    this.av = cancelable.setPositiveButton(ajgl.b(aragVar4), new yhv(this)).setView(inflate).create();
                }
                if (awiiVar != null) {
                    avhn avhnVar = awiiVar.e;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    if (akel.A(avhnVar)) {
                        ajnj ajnjVar = this.aA;
                        avhn avhnVar2 = awiiVar.e;
                        if (avhnVar2 == null) {
                            avhnVar2 = avhn.a;
                        }
                        ajnjVar.k(avhnVar2);
                    }
                    TextView textView = this.aw;
                    if ((awiiVar.b & 1) != 0) {
                        aragVar = awiiVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    textView.setText(ajgl.b(aragVar));
                    TextView textView2 = this.ax;
                    if ((awiiVar.b & 2) != 0) {
                        aragVar2 = awiiVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    textView2.setText(ajgl.b(aragVar2));
                    TextView textView3 = this.ay;
                    if ((awiiVar.b & 8) != 0) {
                        aragVar3 = awiiVar.f;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                    } else {
                        aragVar3 = null;
                    }
                    textView3.setText(ajgl.b(aragVar3));
                    TextView textView4 = this.az;
                    if ((awiiVar.b & 16) != 0 && (aragVar5 = awiiVar.g) == null) {
                        aragVar5 = arag.a;
                    }
                    textView4.setText(ajgl.b(aragVar5));
                    this.av.show();
                }
            } else {
                awij awijVar = awioVar.d;
                if (awijVar == null) {
                    awijVar = awij.a;
                }
                if ((awijVar.b & 1) != 0) {
                    aafo aafoVar = this.af;
                    awij awijVar2 = awioVar.d;
                    if (awijVar2 == null) {
                        awijVar2 = awij.a;
                    }
                    apzg apzgVar = awijVar2.c;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, null);
                }
            }
            arag aragVar6 = awinVar.b;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            Spanned b = ajgl.b(aragVar6);
            if (!TextUtils.isEmpty(b)) {
                this.aj.d(b.toString());
            }
        }
        dismiss();
    }

    @Override // defpackage.ybm
    public final void f() {
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, 2132083945);
        this.am.d(new yhr());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        if (!this.ag.t()) {
            this.d.hide();
            this.ak.c(this.ae, null, new yht(this));
        } else {
            aH();
        }
        this.an.oi().d(acuo.a(8197), this.ap, null);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        if (this.ap == null) {
            if (bundle == null) {
                bundle = this.m;
            }
            this.ap = aafr.b(bundle.getByteArray("navigation_endpoint"));
        }
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.ypc_tip_jar_dialog, (ViewGroup) null);
        this.aq = loadingFrameLayout;
        loadingFrameLayout.f(this);
        Activity activity = this.ae;
        this.ar = new yib(activity, this.ah, this.al, (InputMethodManager) activity.getSystemService("input_method"), this.aq.findViewById(R.id.ypc_tip_screen));
        LoadingFrameLayout loadingFrameLayout2 = (LoadingFrameLayout) this.aq.findViewById(R.id.next);
        this.au = loadingFrameLayout2;
        loadingFrameLayout2.setOnClickListener(new yhs(this));
        this.ao.k = this;
        return this.aq;
    }

    @Override // defpackage.akgj
    public final void qX() {
        aH();
    }
}
