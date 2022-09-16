package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wja  reason: default package */
/* loaded from: classes4.dex */
public final class wja extends wik implements wit, wjf, wjj, wjm, wjp {
    public aafo ae;
    public wjb af;
    public acti ag;
    private eo ah;
    private boolean ai;
    private boolean aj;
    private wjg al;
    private wjk am;
    private wiu an;
    private wjq ao;
    private wjn ap;
    private atwq aq;
    private atwh ar;
    private atwc as;
    private atwe at;
    private atvt au;
    private String av;
    private String aw;
    private long ay;
    private String ak = "FRAGMENT_NAME_INTRO";
    private asbk ax = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
    private boolean az = false;

    private final void aW(acup acupVar) {
        this.ag.d(acupVar, null, null);
    }

    private final void aX(atwc atwcVar, boolean z) {
        if (this.an == null || z) {
            this.as = atwcVar;
            long j = this.ay;
            wiu wiuVar = new wiu();
            Bundle bundle = new Bundle();
            if (atwcVar != null) {
                bundle.putByteArray("ARG_RENDERER", atwcVar.toByteArray());
            }
            bundle.putLong("ARG_IDV_REQUEST_ID", j);
            wiuVar.ae(bundle);
            this.an = wiuVar;
        }
        aV(this.an, "FRAGMENT_NAME_CODE_INPUT");
        aW(acuo.a(30709));
    }

    private final void aY(atwq atwqVar) {
        if (this.al == null) {
            this.aq = atwqVar;
            wjg wjgVar = new wjg();
            Bundle bundle = new Bundle();
            if (atwqVar != null) {
                aphq.m(bundle, "ARG_RENDERER", atwqVar);
            }
            wjgVar.ae(bundle);
            this.al = wjgVar;
        }
        aV(this.al, "FRAGMENT_NAME_INTRO");
        aW(acuo.a(30707));
    }

    private final void aZ(atwh atwhVar, boolean z) {
        if (this.am == null || z) {
            this.ar = atwhVar;
            wjk wjkVar = new wjk();
            Bundle bundle = new Bundle();
            if (atwhVar != null) {
                bundle.putByteArray("ARG_RENDERER", atwhVar.toByteArray());
            }
            wjkVar.ae(bundle);
            this.am = wjkVar;
        }
        aV(this.am, "FRAGMENT_NAME_PHONE_INPUT");
        aW(acuo.a(30708));
    }

    private final void ba(atvt atvtVar, boolean z) {
        if (this.ap == null || z) {
            this.au = atvtVar;
            asbk asbkVar = this.ax;
            String str = this.aw;
            String str2 = this.av;
            Long valueOf = Long.valueOf(this.ay);
            atvtVar.getClass();
            asbkVar.getClass();
            str.getClass();
            str2.getClass();
            wjn wjnVar = new wjn();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_RENDERER", aphq.k(atvtVar));
            bundle.putInt("ARG_CODE_DELIVERY_METHOD", asbkVar.d);
            bundle.putString("ARG_COUNTRY_CODE", str);
            bundle.putString("ARG_PHONE_NUMBER", str2);
            bundle.putLong("ARG_IDV_REQUEST_ID", valueOf.longValue());
            wjnVar.ae(bundle);
            this.ap = wjnVar;
        }
        aV(this.ap, "FRAGMENT_NAME_RESULT_ERROR");
        aW(acuo.a(30711));
    }

    private final void bb(atwe atweVar) {
        if (this.ao == null) {
            this.at = atweVar;
            wjq wjqVar = new wjq();
            Bundle bundle = new Bundle();
            if (atweVar != null) {
                bundle.putByteArray("ARG_RENDERER", atweVar.toByteArray());
            }
            wjqVar.ae(bundle);
            this.ao = wjqVar;
        }
        aV(this.ao, "FRAGMENT_NAME_RESULT_SUCCESS");
        aW(acuo.a(30710));
    }

    private static boolean bc(dp dpVar) {
        return dpVar != null && !dpVar.s && !dpVar.H && dpVar.ap() && dpVar.ar() && dpVar.mJ() != null;
    }

    private static boolean bd(dp dpVar) {
        return dpVar != null && bc(dpVar) && dpVar.at();
    }

    @Override // defpackage.dp
    public final void Y() {
        Dialog dialog;
        super.Y();
        if (this.ai && (dialog = this.d) != null) {
            if (dialog.getWindow() != null) {
                WindowManager.LayoutParams attributes = this.d.getWindow().getAttributes();
                zew.j(mJ());
                attributes.height = (int) rh().getDimension(R.dimen.av_flow_dialog_height);
                attributes.width = (int) rh().getDimension(R.dimen.av_flow_dialog_width);
                this.d.getWindow().setAttributes(attributes);
            }
            if (this.aj) {
                this.d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: wiz
                    @Override // android.content.DialogInterface.OnKeyListener
                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        wja wjaVar = wja.this;
                        if (i == 4 && keyEvent.getAction() == 1) {
                            wjaVar.aG();
                            return true;
                        }
                        return false;
                    }
                });
            }
        }
        if (TextUtils.equals(this.ak, "FRAGMENT_NAME_INTRO")) {
            aY(this.aq);
        } else if (TextUtils.equals(this.ak, "FRAGMENT_NAME_PHONE_INPUT")) {
            aZ(this.ar, false);
        } else if (TextUtils.equals(this.ak, "FRAGMENT_NAME_CODE_INPUT")) {
            aX(this.as, false);
        } else if (TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_SUCCESS")) {
            bb(this.at);
        } else if (!TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_ERROR")) {
        } else {
            ba(this.au, false);
        }
    }

    @Override // defpackage.wib
    public final void a() {
        aG();
    }

    @Override // defpackage.wjc
    public final void aG() {
        if (bd(this.al)) {
            this.af.h();
        } else if (bd(this.am)) {
            aY(this.aq);
        } else if (bd(this.an)) {
            aZ(this.ar, false);
        } else if (bd(this.ap)) {
            this.af.h();
        } else {
            bd(this.ao);
        }
    }

    @Override // defpackage.wjc
    public final void aH(Configuration configuration) {
        if (bc(this.al)) {
            this.al.onConfigurationChanged(configuration);
        } else if (bc(this.am)) {
            this.am.onConfigurationChanged(configuration);
        } else if (bc(this.an)) {
            this.an.onConfigurationChanged(configuration);
        } else if (bc(this.ao)) {
            this.ao.onConfigurationChanged(configuration);
        } else if (!bc(this.ap)) {
        } else {
            this.ap.onConfigurationChanged(configuration);
        }
    }

    @Override // defpackage.wjf
    public final void aI() {
        this.af.i();
    }

    @Override // defpackage.wjf
    public final void aJ(atwh atwhVar) {
        aZ(atwhVar, true);
    }

    @Override // defpackage.wjf
    public final void aK(apzg apzgVar) {
        this.ae.c(apzgVar, null);
    }

    @Override // defpackage.wjj
    public final void aL(asbk asbkVar, String str, String str2) {
        this.ax = asbkVar;
        this.aw = str;
        this.av = str2;
    }

    @Override // defpackage.wjj
    public final void aM() {
        this.af.i();
    }

    @Override // defpackage.wjj
    public final void aN(atwh atwhVar) {
        aZ(atwhVar, true);
    }

    @Override // defpackage.wjj
    public final void aO(atwc atwcVar, long j) {
        this.ay = j;
        aX(atwcVar, true);
    }

    @Override // defpackage.wjm
    public final void aP() {
        this.af.i();
    }

    @Override // defpackage.wjm
    public final void aQ(atwh atwhVar) {
        aZ(atwhVar, true);
    }

    @Override // defpackage.wjm
    public final void aR(atwc atwcVar, long j) {
        this.ay = j;
        aX(atwcVar, true);
    }

    @Override // defpackage.wjm
    public final void aS(atwe atweVar) {
        bb(atweVar);
    }

    @Override // defpackage.wjm
    public final void aT(atvt atvtVar) {
        ba(atvtVar, true);
    }

    @Override // defpackage.wjp
    public final void aU() {
        this.af.u();
    }

    protected final void aV(dp dpVar, String str) {
        if (this.ah == null) {
            this.ah = mL();
        }
        ex l = this.ah.l();
        dp f = this.ah.f(this.ak);
        if (dpVar.equals(f)) {
            l.n(dpVar);
            l.a();
            return;
        }
        dp f2 = this.ah.f(str);
        if (f2 != null && !f2.equals(dpVar)) {
            l.m(f2);
        }
        if (f != null && f.ap()) {
            l.l(f);
        }
        if (!dpVar.ap()) {
            l.q(R.id.verification_fragment_container, dpVar, str);
        } else if (dpVar.G) {
            l.n(dpVar);
        }
        l.i = 4099;
        l.a();
        this.ak = str;
    }

    @Override // defpackage.wit
    public final void b() {
        this.af.i();
    }

    @Override // defpackage.wit
    public final void c(atwe atweVar) {
        bb(atweVar);
    }

    @Override // defpackage.wit
    public final void d(atvt atvtVar) {
        ba(atvtVar, true);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            if (this.ah == null) {
                this.ah = mL();
            }
            ex l = this.ah.l();
            wjg wjgVar = (wjg) this.ah.g(bundle, "BUNDLE_INTRO_FRAGMENT");
            this.al = wjgVar;
            if (wjgVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_INTRO")) {
                l.l(this.al);
            }
            wjk wjkVar = (wjk) this.ah.g(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT");
            this.am = wjkVar;
            if (wjkVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_PHONE_INPUT")) {
                l.l(this.am);
            }
            wiu wiuVar = (wiu) this.ah.g(bundle, "BUNDLE_CODE_INPUT_FRAGMENT");
            this.an = wiuVar;
            if (wiuVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_CODE_INPUT")) {
                l.l(this.an);
            }
            wjq wjqVar = (wjq) this.ah.g(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT");
            this.ao = wjqVar;
            if (wjqVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_SUCCESS")) {
                l.l(this.ao);
            }
            wjn wjnVar = (wjn) this.ah.g(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT");
            this.ap = wjnVar;
            if (wjnVar != null && !TextUtils.equals(this.ak, "FRAGMENT_NAME_RESULT_ERROR")) {
                l.l(this.ap);
            }
            l.a();
            try {
                byte[] byteArray = bundle.getByteArray("BUNDLE_INTRO_RENDERER");
                if (byteArray != null) {
                    this.aq = (atwq) aopi.parseFrom(atwq.a, byteArray, aoos.b());
                }
                byte[] byteArray2 = bundle.getByteArray("BUNDLE_PHONE_INPUT_RENDERER");
                if (byteArray2 != null) {
                    this.ar = (atwh) aopi.parseFrom(atwh.a, byteArray2, aoos.b());
                }
                byte[] byteArray3 = bundle.getByteArray("BUNDLE_CODE_INPUT_RENDERER");
                if (byteArray3 != null) {
                    this.as = (atwc) aopi.parseFrom(atwc.a, byteArray3, aoos.b());
                }
                byte[] byteArray4 = bundle.getByteArray("BUNDLE_RESULT_SUCCESS_RENDERER");
                if (byteArray4 != null) {
                    this.at = (atwe) aopi.parseFrom(atwe.a, byteArray4, aoos.b());
                }
                byte[] byteArray5 = bundle.getByteArray("BUNDLE_RESULT_ERROR_RENDERER");
                if (byteArray5 != null) {
                    this.au = (atvt) aopi.parseFrom(atvt.a, byteArray5, aoos.b());
                }
                this.ak = bundle.getString("BUNDLE_CURRENT_FRAGMENT");
                this.av = bundle.getString("BUNDLE_CURRENT_PHONE_NUMBER");
                this.aw = bundle.getString("BUNDLE_CURRENT_COUNTRY_CODE");
                asbk b = asbk.b(bundle.getInt("BUNDLE_CURRENT_DELIVERY_METHOD"));
                this.ax = b;
                if (b == null) {
                    this.ax = asbk.CODE_DELIVERY_METHOD_UNKNOWN;
                }
                this.ay = bundle.getLong("BUNDLE_CURRENT_IDV_REQUEST_ID");
                this.az = bundle.getBoolean("BUNDLE_DID_ROUTE_ATTESTATION_COMMAND");
            } catch (aopx e) {
                throw new RuntimeException("Failed to parse a known parcelable proto", e);
            }
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        if (!this.az) {
            atwq atwqVar = this.aq;
            if ((atwqVar.b & 32) == 0) {
                return;
            }
            aafo aafoVar = this.ae;
            apzg apzgVar = atwqVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
            this.az = true;
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.m;
        this.ai = bundle2.getBoolean("ARG_SHOW_AS_DIALOG", false);
        this.aj = bundle2.getBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        if (bundle2.containsKey("ARG_INTRO_RENDERER")) {
            try {
                this.aq = (atwq) aphq.i(bundle2, "ARG_INTRO_RENDERER", atwq.a, aoos.b());
            } catch (aopx e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        return layoutInflater.inflate(R.layout.verification_fragment, viewGroup, false);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        if (this.ah == null) {
            this.ah = mL();
        }
        wjg wjgVar = this.al;
        if (wjgVar != null) {
            this.ah.M(bundle, "BUNDLE_INTRO_FRAGMENT", wjgVar);
        }
        wjk wjkVar = this.am;
        if (wjkVar != null) {
            this.ah.M(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT", wjkVar);
        }
        wiu wiuVar = this.an;
        if (wiuVar != null) {
            this.ah.M(bundle, "BUNDLE_CODE_INPUT_FRAGMENT", wiuVar);
        }
        wjq wjqVar = this.ao;
        if (wjqVar != null) {
            this.ah.M(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT", wjqVar);
        }
        wjn wjnVar = this.ap;
        if (wjnVar != null) {
            this.ah.M(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT", wjnVar);
        }
        atwq atwqVar = this.aq;
        if (atwqVar != null) {
            bundle.putByteArray("BUNDLE_INTRO_RENDERER", atwqVar.toByteArray());
        }
        atwh atwhVar = this.ar;
        if (atwhVar != null) {
            bundle.putByteArray("BUNDLE_PHONE_INPUT_RENDERER", atwhVar.toByteArray());
        }
        atwc atwcVar = this.as;
        if (atwcVar != null) {
            bundle.putByteArray("BUNDLE_CODE_INPUT_RENDERER", atwcVar.toByteArray());
        }
        atwe atweVar = this.at;
        if (atweVar != null) {
            bundle.putByteArray("BUNDLE_RESULT_SUCCESS_RENDERER", atweVar.toByteArray());
        }
        atvt atvtVar = this.au;
        if (atvtVar != null) {
            bundle.putByteArray("BUNDLE_RESULT_ERROR_RENDERER", atvtVar.toByteArray());
        }
        bundle.putString("BUNDLE_CURRENT_FRAGMENT", this.ak);
        bundle.putString("BUNDLE_CURRENT_PHONE_NUMBER", this.av);
        bundle.putString("BUNDLE_CURRENT_COUNTRY_CODE", this.aw);
        bundle.putInt("BUNDLE_CURRENT_DELIVERY_METHOD", this.ax.d);
        bundle.putLong("BUNDLE_CURRENT_IDV_REQUEST_ID", this.ay);
        bundle.putBoolean("BUNDLE_DID_ROUTE_ATTESTATION_COMMAND", this.az);
    }
}
