package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: vxj  reason: default package */
/* loaded from: classes4.dex */
public final class vxj extends vxw implements DialogInterface, View.OnClickListener, vyd, vxl, war {
    static final String ae;
    private TextView aA;
    private TextView aB;
    private TextView aC;
    private TextView aD;
    private Context aE;
    public apro af;
    public vyc ag;
    public aadd ah;
    public ajhl ai;
    public vxk aj;
    public aafo ak;
    public yzj al;
    public ajmr am;
    public aatp an;
    public vxz ao;
    public aaqp ap;
    public aagi aq;
    public was ar;
    public acti as;
    public apzg at;
    private RelativeLayout au;
    private View av;
    private View aw;
    private View ax;
    private View ay;
    private TextView az;

    static {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(37);
        sb.append("channel_creation_renderers");
        sb.append(myPid);
        ae = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vxj aK(byte[] bArr, int i, acti actiVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("source", i - 1);
        bundle.putByteArray("token", bArr);
        bundle.putInt("style", 0);
        bundle.putInt("account_icon", 0);
        bundle.putBoolean("hide_toast", false);
        bundle.putInt("ok_button_style", 0);
        vxj vxjVar = new vxj();
        vxjVar.ae(bundle);
        vxjVar.as = actiVar;
        return vxjVar;
    }

    private final void aN() {
        dismiss();
        this.aj.d();
        apzg apzgVar = this.at;
        if (apzgVar != null) {
            this.ak.a(apzgVar);
        }
    }

    private final void aO(atxd atxdVar, String str, Uri uri) {
        apri aE = aE();
        if (atxdVar != null) {
            aopa aopaVar = aE.a;
            aopaVar.copyOnWrite();
            aprl aprlVar = (aprl) aopaVar.instance;
            aprl aprlVar2 = aprl.a;
            aprlVar.g = atxdVar.d;
            aprlVar.c |= 8;
        }
        if (str != null) {
            aopa aopaVar2 = aE.a;
            aopaVar2.copyOnWrite();
            aprl aprlVar3 = (aprl) aopaVar2.instance;
            aprl aprlVar4 = aprl.a;
            aprlVar3.c |= 32;
            aprlVar3.i = str;
        }
        if (uri != null) {
            String uri2 = uri.toString();
            aopa aopaVar3 = aE.a;
            aopaVar3.copyOnWrite();
            aprl aprlVar5 = (aprl) aopaVar3.instance;
            aprl aprlVar6 = aprl.a;
            uri2.getClass();
            aprlVar5.c |= 16;
            aprlVar5.h = uri2;
        }
        aahb c = ((aagu) this.aq.c()).c();
        c.j(aE);
        c.b().Q();
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        apro aproVar = this.af;
        if (aproVar == null) {
            int G = almu.G(this.m.getInt("source"));
            if (G == 0) {
                G = 1;
            }
            byte[] byteArray = this.m.getByteArray("token");
            aatp aatpVar = this.an;
            boolean aJ = aJ();
            vxh vxhVar = new vxh(this, bundle);
            aatr aatrVar = new aatr(aatpVar.e, aatpVar.a.c());
            aatrVar.a = byteArray;
            aatrVar.c = G;
            aatrVar.b = aJ;
            new aato(aatpVar).i(aatrVar, vxhVar);
            return;
        }
        aG(aproVar, bundle);
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        this.ai.qZ(null);
    }

    public final apri aE() {
        String f = aakj.f(aprl.b.a(), "channel_creation_form_status");
        aprk aprkVar = (aprk) this.aq.c().f(f).g(aprk.class).W();
        if (aprkVar == null) {
            f.getClass();
            aqxo.z(!f.isEmpty(), "key cannot be empty");
            aopa createBuilder = aprl.a.createBuilder();
            createBuilder.copyOnWrite();
            aprl aprlVar = (aprl) createBuilder.instance;
            aprlVar.c |= 1;
            aprlVar.d = f;
            return new apri(createBuilder);
        }
        return new apri(aprkVar.b.mo52toBuilder());
    }

    @Override // defpackage.vxl
    public final void aF(apzg apzgVar) {
        aatq a = this.an.a();
        a.a = ((ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint) apzgVar.qm(ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint)).c;
        vyc vycVar = this.ag;
        if (vycVar != null) {
            a.b = vycVar.e.getText().toString();
            a.c = vycVar.f.getText().toString();
            if (!vycVar.k) {
                if (!TextUtils.isEmpty(vycVar.i.d)) {
                    a.u = vycVar.i.d;
                }
                a.d = vycVar.b.get(5);
                a.s = vycVar.b.get(2) + 1;
                if (!vycVar.j) {
                    a.t = vycVar.b.get(1);
                }
            }
        }
        this.aj.c();
        this.an.b(a, new vxi(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aG(apro aproVar, Bundle bundle) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        final apoj apojVar;
        arag aragVar4;
        arag aragVar5;
        apoj apojVar2;
        CharSequence charSequence;
        arag aragVar6;
        if (!ap()) {
            return;
        }
        aI(false);
        if (aJ()) {
            if ((aproVar.b & 8) == 0) {
                aN();
                return;
            }
            aqtb aqtbVar = aproVar.e;
            if (aqtbVar == null) {
                aqtbVar = aqtb.a;
            }
            ajrs ajrsVar = new ajrs();
            acti actiVar = this.as;
            if (actiVar != null) {
                ajrsVar.a(actiVar);
            }
            this.ai.oK(ajrsVar, ajhh.a(aqtbVar));
            this.au.addView(this.ai.a());
            return;
        }
        int i = aproVar.b;
        arag aragVar7 = null;
        arag aragVar8 = null;
        String str = null;
        if ((i & 1) == 0) {
            if ((i & 2) == 0) {
                aN();
                return;
            }
            final aqft aqftVar = aproVar.d;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            TextView textView = this.az;
            if ((aqftVar.b & 1) != 0) {
                aragVar = aqftVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = this.aC;
            if ((aqftVar.b & 2097152) != 0) {
                aragVar2 = aqftVar.p;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            this.aC.setOnClickListener(new View.OnClickListener() { // from class: vxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vxj vxjVar = vxj.this;
                    aqft aqftVar2 = aqftVar;
                    if ((aqftVar2.b & 33554432) != 0) {
                        aafo aafoVar = vxjVar.ak;
                        apzg apzgVar = aqftVar2.t;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.a(apzgVar);
                    }
                    vxjVar.aj.mB();
                    vxjVar.dismiss();
                }
            });
            if ((aqftVar.b & 4194304) != 0) {
                aragVar3 = aqftVar.q;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            if (!TextUtils.isEmpty(ajgl.b(aragVar3))) {
                this.aD.setVisibility(0);
                TextView textView3 = this.aD;
                if ((aqftVar.b & 4194304) != 0 && (aragVar7 = aqftVar.q) == null) {
                    aragVar7 = arag.a;
                }
                textView3.setText(ajgl.b(aragVar7));
            }
            this.aA.setText(ajjh.j(aqftVar, this.ak));
            return;
        }
        aprn aprnVar = aproVar.c;
        if (aprnVar == null) {
            aprnVar = aprn.a;
        }
        aatl aatlVar = new aatl(aprnVar);
        if (aatlVar.a.e.size() <= 0 || (((apok) aatlVar.a.e.get(0)).b & 1) == 0) {
            apojVar = null;
        } else {
            apojVar = ((apok) aatlVar.a.e.get(0)).c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        }
        apojVar.getClass();
        TextView textView4 = this.az;
        aprn aprnVar2 = aatlVar.a;
        if ((aprnVar2.b & 1) != 0) {
            aragVar4 = aprnVar2.c;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        textView4.setText(ajgl.b(aragVar4));
        TextView textView5 = this.aC;
        if ((apojVar.b & 256) != 0) {
            aragVar5 = apojVar.i;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        textView5.setText(ajgl.b(aragVar5));
        this.aC.setOnClickListener(new View.OnClickListener() { // from class: vxf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vxj vxjVar = vxj.this;
                apoj apojVar3 = apojVar;
                vyc vycVar = vxjVar.ag;
                boolean z = false;
                if (vycVar == null || (vycVar.d() && (vycVar.k || vycVar.c()))) {
                    vxjVar.aI(true);
                    if ((apojVar3.b & 8192) != 0) {
                        aafo aafoVar = vxjVar.ak;
                        apzg apzgVar = apojVar3.n;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.a(apzgVar);
                        z = true;
                    }
                    if ((apojVar3.b & 16384) == 0) {
                        if (z) {
                            return;
                        }
                        vxjVar.dismiss();
                        return;
                    }
                    aafo aafoVar2 = vxjVar.ak;
                    apzg apzgVar2 = apojVar3.o;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.a(apzgVar2);
                    return;
                }
                vyc vycVar2 = vxjVar.ag;
                CharSequence charSequence2 = (vycVar2.k || vycVar2.d() || vycVar2.c()) ? !vycVar2.d() ? vycVar2.m : vycVar2.n : vycVar2.l;
                if (!TextUtils.isEmpty(charSequence2)) {
                    vycVar2.d.setText(charSequence2);
                    vycVar2.d.setVisibility(0);
                }
                if (TextUtils.isEmpty(vycVar2.g.getText())) {
                    EditText editText = vycVar2.g;
                    editText.setError(editText.getHint());
                }
                if (TextUtils.isEmpty(vycVar2.f.getText())) {
                    EditText editText2 = vycVar2.f;
                    editText2.setError(editText2.getHint());
                }
                if (!TextUtils.isEmpty(vycVar2.e.getText())) {
                    return;
                }
                EditText editText3 = vycVar2.e;
                editText3.setError(editText3.getHint());
            }
        });
        if (aatlVar.a.e.size() <= 1 || (((apok) aatlVar.a.e.get(1)).b & 1) == 0) {
            apojVar2 = null;
        } else {
            apojVar2 = ((apok) aatlVar.a.e.get(1)).c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
        }
        TextView textView6 = this.aD;
        if (apojVar2 != null) {
            if ((apojVar2.b & 256) != 0) {
                aragVar6 = apojVar2.i;
                if (aragVar6 == null) {
                    aragVar6 = arag.a;
                }
            } else {
                aragVar6 = null;
            }
            charSequence = ajgl.b(aragVar6);
        } else {
            charSequence = "";
        }
        textView6.setText(charSequence);
        if (apojVar2 != null) {
            this.aD.setVisibility(0);
        }
        if (aatlVar.b() != null) {
            aprs b = aatlVar.b();
            this.ax.setVisibility(0);
            ajnj ajnjVar = new ajnj(this.am, (ImageView) this.ax.findViewById(R.id.profile_picture));
            avhn avhnVar = b.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajnjVar.k(avhnVar);
            TextView textView7 = (TextView) this.ax.findViewById(R.id.profile_description);
            arag aragVar9 = b.e;
            if (aragVar9 == null) {
                aragVar9 = arag.a;
            }
            textView7.setText(ajgl.b(aragVar9));
            TextView textView8 = (TextView) this.ax.findViewById(R.id.profile_name);
            arag aragVar10 = b.d;
            if (aragVar10 == null) {
                aragVar10 = arag.a;
            }
            textView8.setText(ajgl.b(aragVar10));
            TextView textView9 = this.aA;
            if ((b.b & 8) != 0 && (aragVar8 = b.f) == null) {
                aragVar8 = arag.a;
            }
            textView9.setText(aafv.a(aragVar8, this.ak, false));
            return;
        }
        this.ay.setVisibility(0);
        vxz vxzVar = this.ao;
        this.ag = new vyc(vxzVar.a, vxzVar.b, vxzVar.c, this.ay, this.aA, this.aB);
        if (aatlVar.a() == null) {
            vyc vycVar = this.ag;
            if (aatlVar.b == null) {
                aprm aprmVar = aatlVar.a.d;
                if (aprmVar == null) {
                    aprmVar = aprm.a;
                }
                if ((aprmVar.b & 4) != 0) {
                    aprm aprmVar2 = aatlVar.a.d;
                    if (aprmVar2 == null) {
                        aprmVar2 = aprm.a;
                    }
                    aprq aprqVar = aprmVar2.e;
                    if (aprqVar == null) {
                        aprqVar = aprq.a;
                    }
                    aatlVar.b = new aatk(aprqVar);
                }
            }
            vycVar.a(aatlVar.b, bundle);
            return;
        }
        final vyc vycVar2 = this.ag;
        final aatm a = aatlVar.a();
        vycVar2.a(a, bundle);
        vycVar2.k = false;
        vycVar2.c.setVisibility(0);
        vycVar2.j = a.l();
        vycVar2.g.setHint(a.j());
        vycVar2.g.setOnClickListener(new View.OnClickListener() { // from class: vxx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vyc vycVar3 = vyc.this;
                vycVar3.a.j(a.j(), vycVar3.b.get(1), vycVar3.b.get(2), vycVar3.b.get(5), vycVar3.j);
            }
        });
        vycVar2.h = a.l() ? new SimpleDateFormat("MMM d", Locale.getDefault()) : DateFormat.getDateInstance();
        if (bundle == null || bundle.getLong("birthday") == 0) {
            GregorianCalendar gregorianCalendar = vycVar2.b;
            int i2 = 1940;
            if (!a.l() && a.k()) {
                i2 = a.a.m;
            }
            gregorianCalendar.set(i2, (!a.k() ? 1 : a.a.l) - 1, !a.k() ? 1 : a.a.k);
            if (a.k()) {
                vycVar2.b();
            }
        } else {
            vycVar2.b.setTimeInMillis(bundle.getLong("birthday"));
        }
        vxu vxuVar = vycVar2.i;
        a.getClass();
        aqrd i3 = a.i();
        i3.getClass();
        aopu aopuVar = i3.c;
        aqxo.p(!aopuVar.isEmpty());
        EditText editText = vxuVar.b;
        if ((a.i().b & 1) != 0) {
            str = a.i().d;
        }
        editText.setHint(str);
        vxuVar.a.addAll(aopuVar);
        if (bundle != null) {
            return;
        }
        for (int i4 = 0; i4 < aopuVar.size(); i4++) {
            aqrc aqrcVar = ((aqra) aopuVar.get(i4)).c;
            if (aqrcVar == null) {
                aqrcVar = aqrc.a;
            }
            if (aqrcVar.h) {
                vxuVar.c.setSelection(i4 + 1);
                return;
            }
        }
    }

    @Override // defpackage.vyd
    public final void aH(int i, int i2, int i3) {
        vyc vycVar = this.ag;
        if (vycVar != null) {
            vycVar.aH(i, i2, i3);
        }
    }

    public final void aI(boolean z) {
        if (z) {
            this.av.setVisibility(0);
            RelativeLayout relativeLayout = this.au;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            View view = this.aw;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        this.av.setVisibility(8);
        RelativeLayout relativeLayout2 = this.au;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        View view2 = this.aw;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    public final boolean aJ() {
        aowa aowaVar = this.ah.a().x;
        if (aowaVar == null) {
            aowaVar = aowa.a;
        }
        return aowaVar.b;
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        onCancel(null);
        dismiss();
    }

    @Override // defpackage.vxw, defpackage.dh, defpackage.dp
    public final void kt(Context context) {
        super.kt(context);
        this.aE = context;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle != null) {
            byte[] byteArray = bundle.getByteArray(ae);
            if (byteArray != null) {
                this.af = (apro) this.ap.a(byteArray, apro.a);
            }
            byte[] byteArray2 = bundle.getByteArray("next_endpoint");
            if (byteArray2 != null) {
                try {
                    this.at = (apzg) aopi.parseFrom(apzg.a, byteArray2, aoos.b());
                } catch (aopx e) {
                    Log.e("ChannelCreation", "Failed to deserialize nextEndpoint command.", e);
                }
            }
        }
        int i = 0;
        if (!aJ()) {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                i = bundle2.getInt("style", 0);
            }
            mN(1, i);
            return;
        }
        mN(0, 2132083106);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        this.ar.j(this);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        if (aJ()) {
            View inflate = layoutInflater.inflate(R.layout.channel_creation_element_container, viewGroup, false);
            this.au = (RelativeLayout) inflate.findViewById(R.id.element_layout);
            Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
            toolbar.q(new yzh(this.aE).b(toolbar.e(), zhn.j(this.aE, R.attr.ytIconActiveOther).orElse(0)));
            toolbar.r(this);
            toolbar.w(N(R.string.channel_creation_title2));
            this.av = inflate.findViewById(R.id.progress_bar);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(R.layout.channel_creation_container, viewGroup, false);
        this.av = inflate2.findViewById(R.id.progress_bar);
        View findViewById = inflate2.findViewById(R.id.channel_creation_form);
        this.aw = findViewById;
        this.ax = findViewById.findViewById(R.id.channel_creation_with_google_plus);
        this.ay = this.aw.findViewById(R.id.channel_creation_no_identity);
        Bundle bundle2 = this.m;
        int i2 = bundle2 == null ? 0 : bundle2.getInt("account_icon", 0);
        if (i2 != 0) {
            ((ImageView) this.ay.findViewById(R.id.account_icon)).setImageResource(i2);
        }
        this.az = (TextView) this.aw.findViewById(R.id.title);
        this.aA = (TextView) this.aw.findViewById(R.id.info);
        this.aB = (TextView) this.aw.findViewById(R.id.error_message);
        this.aC = (TextView) this.aw.findViewById(R.id.ok_button);
        Bundle bundle3 = this.m;
        if (bundle3 != null) {
            i = bundle3.getInt("ok_button_style", 0);
        }
        if (i != 0) {
            kz.s(this.aC, i);
        }
        TextView textView = (TextView) this.aw.findViewById(R.id.cancel_button);
        this.aD = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: vxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vxj.this.cancel();
            }
        });
        return inflate2;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.aj.mB();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cancel();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.aj.h();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        apro aproVar = this.af;
        if (aproVar != null) {
            bundle.putByteArray(ae, aproVar.toByteArray());
        }
        apzg apzgVar = this.at;
        if (apzgVar != null) {
            bundle.putByteArray("next_endpoint", apzgVar.toByteArray());
        }
        vyc vycVar = this.ag;
        if (vycVar == null || TextUtils.isEmpty(vycVar.g.getText())) {
            return;
        }
        bundle.putLong("birthday", vycVar.b.getTimeInMillis());
    }

    @Override // defpackage.war
    public final /* synthetic */ void q(int i) {
        wzz.c(this, i);
    }

    @Override // defpackage.war
    public final void r(int i, String str, Uri uri) {
        if (!aJ()) {
            return;
        }
        if (i == 1) {
            aO(atxd.PHOTO_UPLOAD_STATUS_UPLOADING, null, null);
        } else if (i == 2) {
            aO(atxd.PHOTO_UPLOAD_STATUS_UNSPECIFIED, str, uri);
        } else {
            this.al.d(N(R.string.image_upload_error));
            aO(atxd.PHOTO_UPLOAD_STATUS_FAILED, null, null);
        }
    }
}
