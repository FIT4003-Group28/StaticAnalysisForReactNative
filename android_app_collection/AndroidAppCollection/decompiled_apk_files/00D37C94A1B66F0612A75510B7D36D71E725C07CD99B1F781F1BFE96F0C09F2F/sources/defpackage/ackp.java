package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
/* compiled from: PG */
/* renamed from: ackp  reason: default package */
/* loaded from: classes.dex */
public final class ackp extends acjg implements View.OnClickListener, achn {
    public Handler a;
    public ajhl ae;
    public aagi af;
    public afvn ag;
    public acho ah;
    public acti ai;
    public final Runnable aj = new Runnable() { // from class: ackh
        @Override // java.lang.Runnable
        public final void run() {
            ackp.this.r();
        }
    };
    public apns ak;
    public ImageButton al;
    public CharSequence am;
    public aajl an;
    public String ao;
    private ImageButton ap;
    private FrameLayout aq;
    private String ar;
    public ache b;
    public abzn c;
    public aafo d;
    public acko e;

    public final void aE(View view) {
        apns apnsVar = this.ak;
        int i = 2131231857;
        int i2 = 2131232439;
        if (apnsVar != null) {
            aunb aunbVar = apnsVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar2 = this.ak.d;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                if ((arhsVar.b & 1) != 0) {
                    ache acheVar = this.b;
                    arhs arhsVar2 = apojVar.g;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar2.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    int a = acheVar.a(b);
                    if (a != 0) {
                        i2 = a;
                    }
                }
            }
            aunb aunbVar3 = this.ak.e;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
                this.al = (ImageButton) view.findViewById(R.id.switch_camera_button);
                aunb aunbVar4 = this.ak.e;
                if (aunbVar4 == null) {
                    aunbVar4 = aunb.a;
                }
                apoj apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
                arhs arhsVar3 = apojVar2.g;
                if (arhsVar3 == null) {
                    arhsVar3 = arhs.a;
                }
                if ((arhsVar3.b & 1) != 0) {
                    ache acheVar2 = this.b;
                    arhs arhsVar4 = apojVar2.g;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar4.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    int a2 = acheVar2.a(b2);
                    if (a2 != 0) {
                        i = a2;
                    }
                }
            }
            aunb aunbVar5 = this.ak.c;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            if (aunbVar5.qn(ElementRendererOuterClass.elementRenderer)) {
                aunb aunbVar6 = this.ak.c;
                if (aunbVar6 == null) {
                    aunbVar6 = aunb.a;
                }
                ajhh a3 = ajhh.a((aqtb) aunbVar6.qm(ElementRendererOuterClass.elementRenderer));
                this.ae.oK(new ajrs(), a3);
                this.aq.addView(this.ae.a());
            }
        }
        this.ap.setImageDrawable(akf.a(rb(), i2));
        this.al.setImageDrawable(akf.a(rb(), i));
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_SERIALIZED_PARAMS")) {
            String string = bundle2.getString("ARG_SERIALIZED_PARAMS");
            this.ar = string;
            p(string, 5);
        }
        this.an = this.af.a(this.ag.c());
        this.ah.a = this;
        mJ().setRequestedOrientation(1);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_participant_pre_join_fragment, viewGroup, false);
        this.ap = (ImageButton) inflate.findViewById(R.id.close_button);
        this.al = (ImageButton) inflate.findViewById(R.id.switch_camera_button);
        this.aq = (FrameLayout) inflate.findViewById(R.id.pre_join_panel);
        inflate.setOnClickListener(this);
        this.ap.setOnClickListener(this);
        this.al.setOnClickListener(this);
        if (this.ak != null) {
            aE(inflate);
        }
        return inflate;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.a.removeCallbacks(this.aj);
    }

    public final void o(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i <= 0) {
            Toast.makeText(rb(), (int) R.string.lc_add_participant_failed, 1).show();
        }
        this.c.g(str, new ackn(this, str, i));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.O == null) {
            return;
        }
        if (view == this.ap) {
            q();
            return;
        }
        ImageButton imageButton = this.al;
        if (view != imageButton) {
            return;
        }
        this.e.U(imageButton);
    }

    public final void p(String str, int i) {
        if (i <= 0) {
            Toast.makeText(mJ(), (int) R.string.lc_join_stream_failed, 1).show();
        } else {
            this.c.b(str, new ackk(this, str, i));
        }
    }

    public final void q() {
        this.e.T();
    }

    public final void r() {
        if (TextUtils.isEmpty(this.ar)) {
            return;
        }
        this.c.b(this.ar, new ackl(this));
    }

    public final void s(aqft aqftVar) {
        ajgx.c(mJ(), aqftVar, this.d, this.ai, new acki(this), null);
    }
}
