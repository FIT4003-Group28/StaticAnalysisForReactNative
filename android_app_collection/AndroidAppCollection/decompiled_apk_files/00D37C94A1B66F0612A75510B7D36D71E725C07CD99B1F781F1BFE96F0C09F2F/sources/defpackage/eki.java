package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eki  reason: default package */
/* loaded from: classes3.dex */
public final class eki extends ekj implements war, ynl {
    private ImageView aA;
    private TextView aB;
    private ImageView aC;
    private TextView aD;
    private TextView aE;
    private ImageView aF;
    private ImageView aG;
    private ImageView aH;
    private View aI;
    private View aJ;
    private View aK;
    private View aL;
    private View aM;
    private boolean aN;
    private boolean aO;
    public ajmy ae;
    public was af;
    public eis ag;
    public aafo ah;
    public akjm ai;
    public Executor aj;
    public azqb ak;
    public LoadingFrameLayout al;
    public TextView am;
    public jo an;
    public int ao;
    private View aw;
    private ImageView ax;
    private TextView ay;
    private TextView az;
    public afvn b;
    public yni c;
    public yzj d;
    public aaub e;
    public ampq a = amon.a;
    private final ekc aP = new ekc(this);

    private static ampq bd(ampq ampqVar, final ampt amptVar) {
        amptVar.getClass();
        return ((Boolean) ampqVar.b(new ampg() { // from class: eju
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return Boolean.valueOf(ampt.this.a(obj));
            }
        }).e(false)).booleanValue() ? ampqVar : amon.a;
    }

    private static ampq be(ampq ampqVar) {
        return bd(ampqVar, ejw.d).b(egf.e);
    }

    private static ampq bf(ampq ampqVar) {
        return bd(ampqVar, ejw.e).b(egf.f);
    }

    private static ampq bg(ampq ampqVar) {
        return bd(ampqVar, ejw.f).b(egf.g);
    }

    private final void bh(ampq ampqVar, ImageView imageView, View view, final int i) {
        final ampq b = bd(ampqVar, ejw.i).b(egf.j);
        if (b.h()) {
            view.setVisibility(0);
            view.setOnClickListener(new View.OnClickListener() { // from class: ejx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    eki ekiVar = eki.this;
                    int i2 = i;
                    ampq ampqVar2 = b;
                    ekiVar.ao = i2;
                    ekiVar.ah.a((apzg) ampqVar2.c());
                }
            });
        } else {
            view.setVisibility(4);
        }
        ampq b2 = bd(ampqVar, ejw.j).b(egf.k);
        if (b2.h()) {
            bi(i);
            ajmt a = ajmu.a();
            a.c = new ekf(this, i);
            this.ae.k(imageView, (avhn) b2.c(), a.a());
            return;
        }
        p(i);
        aG(imageView, i);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        zag.i(this.O.findFocus());
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void Y() {
        super.Y();
        if (!this.b.t()) {
            this.at.c(false);
        }
    }

    public final void aE(final aptn aptnVar) {
        arag aragVar;
        this.aD.setText(aptnVar.c);
        TextView textView = this.aE;
        if ((aptnVar.b & 4) != 0) {
            aragVar = aptnVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        this.aF.setOnClickListener(new View.OnClickListener() { // from class: ekb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eki ekiVar = eki.this;
                aptn aptnVar2 = aptnVar;
                aafo aafoVar = ekiVar.ah;
                apzg apzgVar = aptnVar2.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
    }

    public final void aF(AlertDialog alertDialog) {
        alertDialog.show();
        alertDialog.getWindow().setLayout((int) this.ap.getResources().getDimension(R.dimen.channel_edit_dialog_width), -2);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                this.at.c(false);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        if (this.aq == null) {
            final amvl i = amvn.i();
            amzs it = this.as.a.c.iterator();
            while (it.hasNext()) {
                fry fryVar = (fry) it.next();
                if (fryVar.g() != R.id.menu_watch_on_tv) {
                    i.c(fryVar);
                }
            }
            fsw a = this.as.a();
            a.m(new ampg() { // from class: ejt
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    eki ekiVar = eki.this;
                    amvl amvlVar = i;
                    frz frzVar = (frz) obj;
                    frzVar.a = ekiVar.rh().getString(R.string.channel_settings);
                    frzVar.d(amvlVar.g());
                    return frzVar;
                }
            });
            this.aq = a.a();
        }
        return this.aq;
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.an = new ekd();
        this.ao = 0;
        if (bundle != null) {
            this.ao = bundle.getInt("arg_image_type_update", 0);
            this.aN = bundle.getBoolean("arg_has_profile_picture_endpoint");
            this.aO = bundle.getBoolean("arg_has_channel_banner_endpoint");
            if (!bundle.containsKey("arg_channel_profile_editor_renderer")) {
                return;
            }
            try {
                this.a = ampq.j((aptk) aopi.parseFrom(aptk.a, bundle.getByteArray("arg_channel_profile_editor_renderer"), aoos.b()));
            } catch (aopx unused) {
            }
        }
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mS() {
        super.mS();
        if (!this.b.t()) {
            this.at.c(false);
            return;
        }
        this.c.g(this);
        this.af.j(this);
        this.ag.b(this.aP);
        wzz.c(this, this.af.a());
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.channel_profile_editor_fragment, viewGroup, false);
        this.al = loadingFrameLayout;
        this.aw = loadingFrameLayout.findViewById(R.id.add_description);
        this.ax = (ImageView) this.al.findViewById(R.id.add_description_button);
        this.ay = (TextView) this.al.findViewById(R.id.description_preview_title);
        this.az = (TextView) this.al.findViewById(R.id.description_preview_text);
        this.aA = (ImageView) this.al.findViewById(R.id.description_edit_button);
        this.aB = (TextView) this.al.findViewById(R.id.name_preview_title);
        this.am = (TextView) this.al.findViewById(R.id.name_preview_text);
        this.aC = (ImageView) this.al.findViewById(R.id.name_edit_button);
        this.aD = (TextView) this.al.findViewById(R.id.handle_preview_title);
        this.aE = (TextView) this.al.findViewById(R.id.handle_preview_text);
        this.aF = (ImageView) this.al.findViewById(R.id.handle_edit_button);
        this.aG = (ImageView) this.al.findViewById(R.id.profile_picture);
        this.aI = this.al.findViewById(R.id.profile_picture_camera_icon);
        this.aK = this.al.findViewById(R.id.profile_picture_progress_bar);
        this.aH = (ImageView) this.al.findViewById(R.id.channel_banner_image);
        this.aJ = this.al.findViewById(R.id.channel_banner_camera_icon);
        this.aL = this.al.findViewById(R.id.channel_banner_progress_bar);
        this.aM = this.al.findViewById(R.id.separator);
        this.al.f(new akgj() { // from class: ejs
            @Override // defpackage.akgj
            public final void qX() {
                eki ekiVar = eki.this;
                ekiVar.al.c();
                ekiVar.n();
            }
        });
        if (this.a.h()) {
            s();
            this.al.a();
        } else {
            this.al.c();
            n();
        }
        return this.al;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.c.m(this);
        this.af.k(this);
        this.ag.c(this.aP);
    }

    public final void n() {
        aaub aaubVar = this.e;
        aatz aatzVar = new aatz(aaubVar.e, aaubVar.a);
        aaub aaubVar2 = this.e;
        Executor executor = this.aj;
        if (aaubVar2.g == null) {
            aaubVar2.g = new aaua(aaubVar2.b, aaubVar2.f);
        }
        ylx.n(this, aaubVar2.g.g(aatzVar, executor), new ejq(this), new ejq(this, 1));
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        if (this.a.h()) {
            bundle.putByteArray("arg_channel_profile_editor_renderer", ((aptk) this.a.c()).toByteArray());
        }
        bundle.putInt("arg_image_type_update", this.ao);
        bundle.putBoolean("arg_has_profile_picture_endpoint", this.aN);
        bundle.putBoolean("arg_has_channel_banner_endpoint", this.aO);
    }

    @Override // defpackage.war
    public final /* synthetic */ void q(int i) {
        wzz.c(this, i);
    }

    @Override // defpackage.war
    public final void r(int i, String str, Uri uri) {
        if (i == 1) {
            this.aI.setVisibility(4);
            this.aK.setVisibility(4);
            this.aJ.setVisibility(4);
            this.aL.setVisibility(4);
            bi(this.ao);
        } else if (i == 2) {
            n();
        } else {
            p(1);
            p(2);
        }
    }

    public final void s() {
        arag aragVar;
        aptw aptwVar;
        ampq b = bd(this.a, ejw.g).b(egf.h);
        ampq b2 = bd(this.a, ejw.h).b(egf.i);
        if (b.h() || b2.h()) {
            this.aN = ((Boolean) b.b(egf.l).e(false)).booleanValue();
            bh(b, this.aG, this.aI, 1);
            this.aO = (((aptl) b2.e(aptl.a)).b & 2) != 0;
            bh(b2, this.aH, this.aJ, 2);
        } else {
            this.al.findViewById(R.id.channel_image_view).setVisibility(8);
        }
        if (bg(this.a).h()) {
            this.aB.setVisibility(0);
            this.am.setVisibility(0);
            this.aC.setVisibility(0);
            aptn aptnVar = (aptn) bg(this.a).c();
            this.aB.setText(aptnVar.c);
            TextView textView = this.am;
            if ((aptnVar.b & 4) != 0) {
                aragVar = aptnVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            apzg apzgVar = aptnVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aptu aptuVar = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apzgVar.qm(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
            if (aptuVar == null) {
                aptuVar = aptu.a;
            }
            if (aptuVar.b != 105915641) {
                this.aC.setVisibility(8);
            } else {
                this.aC.setVisibility(0);
                final View inflate = LayoutInflater.from(this.ap).inflate(R.layout.channel_profile_name_editor, (ViewGroup) null);
                AlertDialog create = new AlertDialog.Builder(this.ap).setView(inflate).setPositiveButton(this.ap.getString(17039370), (DialogInterface.OnClickListener) null).setNegativeButton(this.ap.getString(17039360), (DialogInterface.OnClickListener) null).create();
                this.aC.setOnClickListener(new ejy(this, create, 2));
                apzg apzgVar2 = aptnVar.e;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aptu aptuVar2 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apzgVar2.qm(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
                if (aptuVar2 == null) {
                    aptuVar2 = aptu.a;
                }
                if (aptuVar2.b == 105915641) {
                    aptwVar = (aptw) aptuVar2.c;
                } else {
                    aptwVar = aptw.a;
                }
                final aopa mo52toBuilder = aptwVar.mo52toBuilder();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ejn
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        aqzs aqzsVar;
                        final aopa aopaVar;
                        TextView textView2;
                        arag aragVar2;
                        aqzs aqzsVar2;
                        final eki ekiVar = eki.this;
                        View view = inflate;
                        final aopa aopaVar2 = mo52toBuilder;
                        final AlertDialog alertDialog = (AlertDialog) dialogInterface;
                        final TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.given_name_edit_layout);
                        aptt apttVar = ((aptw) aopaVar2.instance).c;
                        if (apttVar == null) {
                            apttVar = aptt.a;
                        }
                        if (apttVar.b == 91739437) {
                            aqzsVar = (aqzs) apttVar.c;
                        } else {
                            aqzsVar = aqzs.a;
                        }
                        final aopa mo52toBuilder2 = aqzsVar.mo52toBuilder();
                        arag aragVar3 = ((aqzs) mo52toBuilder2.instance).c;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                        textInputLayout.B(ajgl.b(aragVar3));
                        textInputLayout.w(false);
                        lj.M(textInputLayout, ekiVar.an);
                        final EditText editText = (EditText) view.findViewById(R.id.given_name_edit);
                        editText.setText(((aqzs) mo52toBuilder2.instance).d);
                        editText.setSelection(0, ((aqzs) mo52toBuilder2.instance).d.length());
                        if ((((aptw) aopaVar2.instance).b & 2) == 0 && (((aqzs) mo52toBuilder2.instance).b & 8) != 0) {
                            textInputLayout.k(true);
                            textInputLayout.l(((aqzs) mo52toBuilder2.instance).e);
                        }
                        zag.p(editText);
                        final TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(R.id.family_name_edit_layout);
                        final EditText editText2 = (EditText) view.findViewById(R.id.family_name_edit);
                        aptw aptwVar2 = (aptw) aopaVar2.instance;
                        arag aragVar4 = null;
                        if ((aptwVar2.b & 2) != 0) {
                            aptt apttVar2 = aptwVar2.d;
                            if (apttVar2 == null) {
                                apttVar2 = aptt.a;
                            }
                            if (apttVar2.b == 91739437) {
                                aqzsVar2 = (aqzs) apttVar2.c;
                            } else {
                                aqzsVar2 = aqzs.a;
                            }
                            aopaVar = aqzsVar2.mo52toBuilder();
                        } else {
                            aopaVar = null;
                        }
                        if (aopaVar != null) {
                            arag aragVar5 = ((aqzs) aopaVar.instance).c;
                            if (aragVar5 == null) {
                                aragVar5 = arag.a;
                            }
                            textInputLayout2.B(ajgl.b(aragVar5));
                            textInputLayout2.w(false);
                            lj.M(textInputLayout2, ekiVar.an);
                            editText2.setText(((aqzs) aopaVar.instance).d);
                            textInputLayout2.setVisibility(0);
                        } else {
                            textInputLayout2.setVisibility(8);
                        }
                        if ((8 & ((aptw) aopaVar2.instance).b) != 0 && (textView2 = (TextView) view.findViewById(R.id.name_edit_limit_hint)) != null) {
                            aptr aptrVar = ((aptw) aopaVar2.instance).e;
                            if (aptrVar == null) {
                                aptrVar = aptr.a;
                            }
                            int i = aptrVar.b;
                            if (i == 141083272) {
                                aptq aptqVar = (aptq) aptrVar.c;
                                if ((aptqVar.b & 1) != 0) {
                                    aragVar2 = aptqVar.c;
                                    if (aragVar2 == null) {
                                        aragVar4 = arag.a;
                                    }
                                    textView2.setText(aafv.a(aragVar2, ekiVar.ah, false));
                                    textView2.setVisibility(0);
                                }
                                aragVar2 = aragVar4;
                                textView2.setText(aafv.a(aragVar2, ekiVar.ah, false));
                                textView2.setVisibility(0);
                            } else if (i == 356957023) {
                                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.name_edit_info_box);
                                linearLayout.removeAllViews();
                                for (aptx aptxVar : ((aptp) aptrVar.c).b) {
                                    if ((aptxVar.b & 2) != 0) {
                                        eme emeVar = (eme) ekiVar.ak.get();
                                        new ajrs();
                                        emeVar.d(aptxVar);
                                        linearLayout.addView(emeVar.a);
                                    }
                                }
                                linearLayout.setVisibility(0);
                            }
                        }
                        alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: eka
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                eki ekiVar2 = eki.this;
                                TextInputLayout textInputLayout3 = textInputLayout;
                                EditText editText3 = editText;
                                TextInputLayout textInputLayout4 = textInputLayout2;
                                aopa aopaVar3 = aopaVar;
                                EditText editText4 = editText2;
                                aopa aopaVar4 = mo52toBuilder2;
                                aopa aopaVar5 = aopaVar2;
                                AlertDialog alertDialog2 = alertDialog;
                                String str = null;
                                textInputLayout3.v(null);
                                textInputLayout3.w(false);
                                String obj = editText3.getText().toString();
                                textInputLayout4.v(null);
                                textInputLayout4.w(false);
                                if (aopaVar3 != null) {
                                    str = editText4.getText().toString();
                                }
                                String str2 = str;
                                final eke ekeVar = new eke(ekiVar2, aopaVar4, obj, aopaVar5, aopaVar3, str2, alertDialog2, textInputLayout3, textInputLayout4);
                                aaub aaubVar = ekiVar2.e;
                                aatx aatxVar = new aatx(aaubVar.e, aaubVar.a);
                                aatxVar.a = obj;
                                if (str2 != null) {
                                    aatxVar.b = str2;
                                }
                                aaub aaubVar2 = ekiVar2.e;
                                Executor executor = ekiVar2.aj;
                                if (aaubVar2.h == null) {
                                    aaubVar2.h = new aaty(aaubVar2.b, aaubVar2.f);
                                }
                                ylx.n(ekiVar2, aaubVar2.h.b(aatxVar, executor), new zdt() { // from class: ejp
                                    @Override // defpackage.zdt
                                    public final void a(Object obj2) {
                                        eke.this.a(1, ((Throwable) obj2).toString());
                                    }
                                }, new zdt() { // from class: ejo
                                    @Override // defpackage.zdt
                                    public final void a(Object obj2) {
                                        aviv avivVar;
                                        aqzq aqzqVar;
                                        eke ekeVar2 = eke.this;
                                        armm armmVar = (armm) obj2;
                                        String str3 = null;
                                        if ((armmVar.b & 2) != 0) {
                                            armi armiVar = armmVar.d;
                                            if (armiVar == null) {
                                                armiVar = armi.a;
                                            }
                                            if (armiVar.b == 85492347) {
                                                armi armiVar2 = armmVar.d;
                                                if (armiVar2 == null) {
                                                    armiVar2 = armi.a;
                                                }
                                                if (armiVar2.b == 85492347) {
                                                    aqzqVar = (aqzq) armiVar2.c;
                                                } else {
                                                    aqzqVar = aqzq.a;
                                                }
                                                arag aragVar6 = aqzqVar.b;
                                                if (aragVar6 == null) {
                                                    aragVar6 = arag.a;
                                                }
                                                str3 = ajgl.b(aragVar6).toString();
                                            } else {
                                                armi armiVar3 = armmVar.d;
                                                if (armiVar3 == null) {
                                                    armiVar3 = armi.a;
                                                }
                                                if (armiVar3.b == 91854672) {
                                                    armi armiVar4 = armmVar.d;
                                                    if (armiVar4 == null) {
                                                        armiVar4 = armi.a;
                                                    }
                                                    if (armiVar4.b == 91854672) {
                                                        avivVar = (aviv) armiVar4.c;
                                                    } else {
                                                        avivVar = aviv.a;
                                                    }
                                                    str3 = avivVar.b;
                                                }
                                            }
                                        }
                                        int i2 = 1;
                                        if (str3 == null) {
                                            ekeVar2.f.am.setText(armmVar.f);
                                            aopa aopaVar6 = ekeVar2.g;
                                            String str4 = ekeVar2.a;
                                            aopaVar6.copyOnWrite();
                                            aqzs aqzsVar3 = (aqzs) aopaVar6.instance;
                                            aqzs aqzsVar4 = aqzs.a;
                                            str4.getClass();
                                            aqzsVar3.b |= 2;
                                            aqzsVar3.d = str4;
                                            aopa aopaVar7 = ekeVar2.h;
                                            aopa createBuilder = aptt.a.createBuilder();
                                            aqzs aqzsVar5 = (aqzs) ekeVar2.g.mo39build();
                                            createBuilder.copyOnWrite();
                                            aptt apttVar3 = (aptt) createBuilder.instance;
                                            aqzsVar5.getClass();
                                            apttVar3.c = aqzsVar5;
                                            apttVar3.b = 91739437;
                                            aopaVar7.copyOnWrite();
                                            aptw aptwVar3 = (aptw) aopaVar7.instance;
                                            aptt apttVar4 = (aptt) createBuilder.mo39build();
                                            aptw aptwVar4 = aptw.a;
                                            apttVar4.getClass();
                                            aptwVar3.c = apttVar4;
                                            aptwVar3.b = 1 | aptwVar3.b;
                                            aopa aopaVar8 = ekeVar2.i;
                                            if (aopaVar8 != null) {
                                                String str5 = ekeVar2.b;
                                                aopaVar8.copyOnWrite();
                                                aqzs aqzsVar6 = (aqzs) aopaVar8.instance;
                                                str5.getClass();
                                                aqzsVar6.b |= 2;
                                                aqzsVar6.d = str5;
                                                aopa aopaVar9 = ekeVar2.h;
                                                aopa createBuilder2 = aptt.a.createBuilder();
                                                aqzs aqzsVar7 = (aqzs) ekeVar2.i.mo39build();
                                                createBuilder2.copyOnWrite();
                                                aptt apttVar5 = (aptt) createBuilder2.instance;
                                                aqzsVar7.getClass();
                                                apttVar5.c = aqzsVar7;
                                                apttVar5.b = 91739437;
                                                aopaVar9.copyOnWrite();
                                                aptw aptwVar5 = (aptw) aopaVar9.instance;
                                                aptt apttVar6 = (aptt) createBuilder2.mo39build();
                                                apttVar6.getClass();
                                                aptwVar5.d = apttVar6;
                                                aptwVar5.b |= 2;
                                            }
                                            aopa aopaVar10 = ekeVar2.h;
                                            aptr aptrVar2 = armmVar.g;
                                            if (aptrVar2 == null) {
                                                aptrVar2 = aptr.a;
                                            }
                                            aopaVar10.copyOnWrite();
                                            aptw aptwVar6 = (aptw) aopaVar10.instance;
                                            aptrVar2.getClass();
                                            aptwVar6.e = aptrVar2;
                                            aptwVar6.b |= 8;
                                            ekeVar2.c.dismiss();
                                            return;
                                        }
                                        int O = akel.O(armmVar.e);
                                        if (O != 0) {
                                            i2 = O;
                                        }
                                        ekeVar2.a(i2, str3);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        } else {
            this.aB.setVisibility(8);
            this.am.setVisibility(8);
            this.aC.setVisibility(8);
        }
        if (bf(this.a).h()) {
            this.aD.setVisibility(0);
            this.aE.setVisibility(0);
            this.aF.setVisibility(0);
            aE((aptn) bf(this.a).c());
        } else {
            this.aD.setVisibility(8);
            this.aE.setVisibility(8);
            this.aF.setVisibility(8);
        }
        if (be(this.a).h()) {
            final aptn aptnVar2 = (aptn) be(this.a).c();
            apzg apzgVar3 = aptnVar2.e;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aptu aptuVar3 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apzgVar3.qm(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
            if (aptuVar3 == null) {
                aptuVar3 = aptu.a;
            }
            int i = aptuVar3.b;
            if ((aptnVar2.b & 4) == 0) {
                this.ay.setVisibility(8);
                this.az.setVisibility(8);
                this.aA.setVisibility(8);
                this.aw.setVisibility(i != 105915776 ? 8 : 0);
            } else {
                this.aw.setVisibility(8);
                this.ay.setText(aptnVar2.c);
                this.ay.setVisibility(0);
                TextView textView2 = this.az;
                arag aragVar2 = aptnVar2.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                this.az.setVisibility(0);
                this.aA.setVisibility(i != 105915776 ? 8 : 0);
            }
            final View inflate2 = LayoutInflater.from(this.ap).inflate(R.layout.channel_profile_description_editor, (ViewGroup) null);
            AlertDialog create2 = new AlertDialog.Builder(this.ap).setView(inflate2).setPositiveButton(this.ap.getString(17039370), (DialogInterface.OnClickListener) null).setNegativeButton(this.ap.getString(17039360), (DialogInterface.OnClickListener) null).create();
            this.ax.setOnClickListener(new ejy(this, create2, 1));
            this.aA.setOnClickListener(new ejy(this, create2));
            create2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ejv
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    apts aptsVar;
                    aqzs aqzsVar;
                    final eki ekiVar = eki.this;
                    aptn aptnVar3 = aptnVar2;
                    View view = inflate2;
                    apzg apzgVar4 = aptnVar3.e;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    aptu aptuVar4 = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) apzgVar4.qm(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint)).c;
                    if (aptuVar4 == null) {
                        aptuVar4 = aptu.a;
                    }
                    if (aptuVar4.b == 105915776) {
                        aptsVar = (apts) aptuVar4.c;
                    } else {
                        aptsVar = apts.a;
                    }
                    aptt apttVar = aptsVar.b;
                    if (apttVar == null) {
                        apttVar = aptt.a;
                    }
                    if (apttVar.b == 91739437) {
                        aqzsVar = (aqzs) apttVar.c;
                    } else {
                        aqzsVar = aqzs.a;
                    }
                    TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.description_edit_layout);
                    arag aragVar3 = aqzsVar.c;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    textInputLayout.B(ajgl.b(aragVar3));
                    textInputLayout.k(true);
                    textInputLayout.l(aqzsVar.e);
                    lj.M(textInputLayout, ekiVar.an);
                    final EditText editText = (EditText) view.findViewById(R.id.description_edit);
                    editText.setText(aqzsVar.d);
                    editText.setSelection(0, aqzsVar.d.length());
                    zag.p(editText);
                    final AlertDialog alertDialog = (AlertDialog) dialogInterface;
                    alertDialog.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: ejz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            final eki ekiVar2 = eki.this;
                            EditText editText2 = editText;
                            final AlertDialog alertDialog2 = alertDialog;
                            aaub aaubVar = ekiVar2.e;
                            aatv aatvVar = new aatv(aaubVar.e, aaubVar.a);
                            aatvVar.a = editText2.getText().toString();
                            aaub aaubVar2 = ekiVar2.e;
                            Executor executor = ekiVar2.aj;
                            if (aaubVar2.i == null) {
                                aaubVar2.i = new aatw(aaubVar2.b, aaubVar2.f);
                            }
                            ylx.n(ekiVar2, aaubVar2.i.b(aatvVar, executor), new ejq(ekiVar2, 2), new zdt() { // from class: ejr
                                @Override // defpackage.zdt
                                public final void a(Object obj) {
                                    aqzq aqzqVar;
                                    eki ekiVar3 = eki.this;
                                    AlertDialog alertDialog3 = alertDialog2;
                                    armg armgVar = (armg) obj;
                                    armh armhVar = armgVar.c;
                                    if (armhVar == null) {
                                        armhVar = armh.a;
                                    }
                                    if (armhVar.b != 85492347) {
                                        ekiVar3.n();
                                        alertDialog3.dismiss();
                                        return;
                                    }
                                    yzj yzjVar = ekiVar3.d;
                                    armh armhVar2 = armgVar.c;
                                    if (armhVar2 == null) {
                                        armhVar2 = armh.a;
                                    }
                                    if (armhVar2.b == 85492347) {
                                        aqzqVar = (aqzq) armhVar2.c;
                                    } else {
                                        aqzqVar = aqzq.a;
                                    }
                                    arag aragVar4 = aqzqVar.b;
                                    if (aragVar4 == null) {
                                        aragVar4 = arag.a;
                                    }
                                    yzjVar.d(ajgl.b(aragVar4).toString());
                                }
                            });
                        }
                    });
                }
            });
        } else {
            this.ay.setVisibility(8);
            this.az.setVisibility(8);
            this.aA.setVisibility(8);
            this.aw.setVisibility(8);
        }
        if (bg(this.a).h() || bf(this.a).h() || be(this.a).h()) {
            this.aM.setVisibility(0);
        } else {
            this.aM.setVisibility(8);
        }
        ((TextView) this.al.findViewById(R.id.privacy_settings_title)).setText(ajgl.b((arag) bd(this.a, ejw.c).b(egf.d).f()));
        LinearLayout linearLayout = (LinearLayout) this.al.findViewById(R.id.privacy_settings);
        linearLayout.removeAllViews();
        ekh ekhVar = new ekh(this.ap, this.ah, ((aptk) this.a.e(aptk.a)).i, this.ai);
        int count = ekhVar.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            linearLayout.addView(ekhVar.getView(i2, null, linearLayout));
        }
        zag.m((TextView) this.al.findViewById(R.id.disclaimer_text), aafv.a((arag) bd(this.a, ejw.a).b(egf.c).f(), this.ah, false));
    }

    public static final void aG(ImageView imageView, int i) {
        if (i == 1) {
            imageView.setBackground(null);
            imageView.setImageResource(2131232143);
            return;
        }
        imageView.setImageDrawable(null);
        imageView.setBackgroundResource(R.drawable.ic_default_channel_placeholder);
    }

    private final void bi(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i == 1) {
            view = this.aI;
            view2 = this.aK;
            imageView = this.aG;
            z = this.aN;
        } else {
            view = this.aJ;
            view2 = this.aL;
            imageView = this.aH;
            z = this.aO;
        }
        view.setVisibility(4);
        view2.setVisibility(0);
        if (z) {
            imageView.setColorFilter(-1291845632, PorterDuff.Mode.DARKEN);
        } else {
            imageView.setColorFilter((ColorFilter) null);
        }
    }

    public final void p(int i) {
        View view;
        View view2;
        ImageView imageView;
        boolean z;
        if (i == 1) {
            view = this.aI;
            view2 = this.aK;
            imageView = this.aG;
            z = this.aN;
        } else {
            view = this.aJ;
            view2 = this.aL;
            imageView = this.aH;
            z = this.aO;
        }
        view2.setVisibility(4);
        if (this.af.a() == 1) {
            view.setVisibility(4);
        } else if (z) {
            imageView.setColorFilter(1291845632, PorterDuff.Mode.DARKEN);
            view.setVisibility(0);
        } else {
            imageView.setColorFilter((ColorFilter) null);
            view.setVisibility(4);
        }
    }
}
