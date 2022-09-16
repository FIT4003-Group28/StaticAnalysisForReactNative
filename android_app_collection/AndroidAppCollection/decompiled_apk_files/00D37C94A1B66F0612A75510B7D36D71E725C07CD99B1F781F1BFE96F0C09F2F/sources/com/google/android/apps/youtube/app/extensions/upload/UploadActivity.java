package com.google.android.apps.youtube.app.extensions.upload;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadActivity extends ijo implements ilf, vxo, acth, ynl {
    public akze S;
    public akrh T;
    public fqd U;
    public iix V;
    String W;
    public asfp X;
    public arxl Y;
    public LoadingFrameLayout Z;
    private View aA;
    private avtp aB;
    private FrameLayout aC;
    private YouTubeTextView aD;
    public iln aa;
    View ab;
    public ghi ad;
    public ImageView ae;
    public boolean af;
    public boolean ag;
    public String ai;
    public String aj;
    public ohp ak;
    public vne al;
    public aqxo am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private asfp as;
    private LinearLayout au;
    private ViewGroup av;
    private ajmu aw;
    private YouTubeTextView ax;
    private YouTubeTextView ay;
    private ImageView az;
    public ankw h;
    public aafo i;
    public ajve j;
    public afvn k;
    public ajmy l;
    public aaqp m;
    public zsn n;
    public afre o;
    public afwc p;
    public acut q;
    public vxk r;
    public ilh s;
    public albc t;
    public SharedPreferences u;
    public vyh v;
    public akge w;
    public albf x;
    public boolean ac = false;
    private boolean at = false;
    public ampq ah = amon.a;

    private final String I() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id");
        }
        return null;
    }

    private final void J() {
        F();
        asuw asuwVar = this.C.a().c;
        if (asuwVar == null) {
            asuwVar = asuw.a;
        }
        if (!asuwVar.k || !akdr.g(this)) {
            E(null);
        } else {
            ylx.n(this, this.o.a(), new iki(this, 2), new iki(this));
        }
    }

    private final void K() {
        avuk avukVar;
        boolean z;
        boolean z2;
        avtp avtpVar;
        this.aj = "";
        avvf avvfVar = this.C.a().h;
        if (avvfVar == null) {
            avvfVar = avvf.a;
        }
        int i = 8;
        if (avvfVar.y) {
            Intent intent = getIntent();
            avuk avukVar2 = avuk.UPLOAD_FLOW_SOURCE_UNKNOWN;
            if (intent != null) {
                z = akyc.g(intent);
                avukVar = akyc.c(intent);
            } else {
                avukVar = avukVar2;
                z = false;
            }
            if (!z || !akyc.i(avukVar)) {
                return;
            }
            if (this.af) {
                this.am.M();
                z2 = false;
            } else {
                z2 = true;
            }
            FrameLayout frameLayout = this.aC;
            if (true == z2) {
                i = 0;
            }
            frameLayout.setVisibility(i);
            this.ag = z2;
            return;
        }
        this.am.M();
        avvf avvfVar2 = this.C.a().h;
        if (avvfVar2 == null) {
            avvfVar2 = avvf.a;
        }
        if (!avvfVar2.z || (avtpVar = this.aB) == null) {
            this.aC.setVisibility(8);
            return;
        }
        if ((avtpVar.b & 2) != 0) {
            YouTubeTextView youTubeTextView = this.aD;
            arag aragVar = avtpVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            youTubeTextView.setText(ajgl.c(aragVar, this.j));
            this.aD.d(true);
            this.aC.setVisibility(0);
        }
        avtp avtpVar2 = this.aB;
        if ((avtpVar2.b & 1) == 0) {
            return;
        }
        this.aj = avtpVar2.c;
    }

    @Override // defpackage.ike
    protected final boolean B() {
        if (!this.O) {
            zxb zxbVar = this.s.A;
            vqr br = zxbVar != null ? zxbVar.br() : null;
            return br != null && !br.J();
        }
        return true;
    }

    @Override // defpackage.ilf
    public final void C(String[] strArr) {
        aopa mo52toBuilder;
        if (this.aC.getVisibility() == 0 || !TextUtils.isEmpty(this.aj)) {
            ylx.n(this, this.al.b(new ampg() { // from class: ikj
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    UploadActivity uploadActivity = UploadActivity.this;
                    aldy aldyVar = (aldy) obj;
                    aopa createBuilder = aldw.a.createBuilder();
                    if (uploadActivity.ag) {
                        createBuilder.copyOnWrite();
                        aldw aldwVar = (aldw) createBuilder.instance;
                        aldwVar.b |= 1;
                        aldwVar.c = true;
                    }
                    if (!TextUtils.isEmpty(uploadActivity.aj)) {
                        String str = uploadActivity.aj;
                        createBuilder.copyOnWrite();
                        aldw aldwVar2 = (aldw) createBuilder.instance;
                        str.getClass();
                        aldwVar2.b |= 2;
                        aldwVar2.d = str;
                    }
                    aopa mo52toBuilder2 = aldyVar.mo52toBuilder();
                    String b = uploadActivity.k.c().b();
                    aldw aldwVar3 = (aldw) createBuilder.mo39build();
                    aldwVar3.getClass();
                    mo52toBuilder2.copyOnWrite();
                    aldy aldyVar2 = (aldy) mo52toBuilder2.instance;
                    aoqp aoqpVar = aldyVar2.b;
                    if (!aoqpVar.b) {
                        aldyVar2.b = aoqpVar.a();
                    }
                    aldyVar2.b.put(b, aldwVar3);
                    return (aldy) mo52toBuilder2.mo39build();
                }
            }, anjk.a), hmv.l, hmv.m);
        }
        zag.i(getCurrentFocus());
        Intent intent = getIntent();
        Intent intent2 = new Intent();
        boolean z = true;
        if (intent != null && !intent.getBooleanExtra("navigate_to_my_uploads", true)) {
            z = false;
        }
        intent2.putExtra("frontend_ids", strArr);
        intent2.putExtra("close_gallery_on_successful_upload", !z);
        setResult(-1, intent2);
        finish();
        if (z) {
            apzg apzgVar = (apzg) ((aopc) aafr.a("FEmy_videos").mo52toBuilder()).mo39build();
            if (!apzgVar.qn(atno.b)) {
                mo52toBuilder = atnp.a.createBuilder();
            } else {
                mo52toBuilder = ((atnp) apzgVar.qm(atno.b)).mo52toBuilder();
            }
            mo52toBuilder.copyOnWrite();
            atnp atnpVar = (atnp) mo52toBuilder.instance;
            atnpVar.b |= 2;
            atnpVar.d = 9701;
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(atno.b, (atnp) mo52toBuilder.mo39build());
            acut acutVar = this.q;
            Intent a = this.ak.a();
            a.setFlags(67108864);
            a.putExtra("navigation_endpoint", ((apzg) ((aopc) acutVar.f((apzg) aopcVar.mo39build()).mo52toBuilder()).mo39build()).toByteArray());
            startActivity(a);
        }
    }

    public final void D(asfp asfpVar) {
        avyp avypVar;
        boolean z;
        ylr.c();
        if (!this.aq) {
            return;
        }
        this.X = asfpVar;
        if (this.as == asfpVar) {
            return;
        }
        this.as = asfpVar;
        this.N.a();
        this.aC.setVisibility(8);
        this.au.setVisibility(8);
        this.aA.setVisibility(8);
        this.W = this.k.c().d();
        asfp asfpVar2 = this.X;
        if ((asfpVar2.b & 16384) != 0) {
            this.q.D(new acte(asfpVar2.p));
        }
        asfp asfpVar3 = this.X;
        if ((asfpVar3.b & 64) != 0) {
            iln ilnVar = this.aa;
            ilnVar.e = asfpVar3.j;
            ilnVar.c();
        }
        Iterator it = this.X.d.iterator();
        while (true) {
            avypVar = null;
            z = false;
            if (!it.hasNext()) {
                break;
            }
            asfq asfqVar = (asfq) it.next();
            int i = asfqVar.b;
            if (i == 96626565) {
                avtm avtmVar = (avtm) asfqVar.c;
                avtmVar.getClass();
                this.ae.setBackgroundResource(R.color.upload_activity_account_header_thumbnail_background);
                avhn avhnVar = avtmVar.d;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                if (akel.A(avhnVar)) {
                    ajmy ajmyVar = this.l;
                    ImageView imageView = this.ae;
                    avhn avhnVar2 = avtmVar.d;
                    if (avhnVar2 == null) {
                        avhnVar2 = avhn.a;
                    }
                    ajmyVar.k(imageView, avhnVar2, this.aw);
                }
                YouTubeTextView youTubeTextView = this.ax;
                arag aragVar = avtmVar.b;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                youTubeTextView.setText(ajgl.b(aragVar));
                YouTubeTextView youTubeTextView2 = this.ay;
                arag aragVar2 = avtmVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                youTubeTextView2.setText(ajgl.b(aragVar2));
                boolean z2 = avtmVar.e;
                this.av.setClickable(z2);
                if (z2) {
                    this.az.setVisibility(0);
                    this.av.setOnClickListener(new View.OnClickListener() { // from class: ikg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UploadActivity uploadActivity = UploadActivity.this;
                            uploadActivity.p.c(uploadActivity, null, null);
                        }
                    });
                    ViewGroup viewGroup = this.av;
                    zag.k(viewGroup, viewGroup.getBackground());
                    arag aragVar3 = avtmVar.b;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    Spanned b = ajgl.b(aragVar3);
                    arag aragVar4 = avtmVar.c;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    Spanned b2 = ajgl.b(aragVar4);
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    if (b == null) {
                        b = "";
                    }
                    charSequenceArr[0] = b;
                    if (b2 == null) {
                        b2 = "";
                    }
                    charSequenceArr[1] = b2;
                    this.av.setContentDescription(getString(R.string.account_switcher_accessibility_label, new Object[]{TextUtils.join(" ", Arrays.asList(charSequenceArr))}));
                } else {
                    this.az.setVisibility(8);
                    this.av.setOnClickListener(null);
                    this.av.setBackgroundResource(0);
                    this.av.setContentDescription(null);
                }
                this.au.setVisibility(0);
            } else if (i == 334359378) {
                this.aB = (avtp) asfqVar.c;
            }
        }
        aunb aunbVar = this.X.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(SectionListRendererOuterClass.sectionListRenderer)) {
            aunb aunbVar2 = this.X.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aakw aakwVar = new aakw((auqh) aunbVar2.qm(SectionListRendererOuterClass.sectionListRenderer));
            arxj arxjVar = this.X.l;
            if (arxjVar == null) {
                arxjVar = arxj.a;
            }
            y(aakwVar, arxjVar);
            this.aA.setVisibility(0);
        }
        K();
        ilh ilhVar = this.s;
        asfp asfpVar4 = this.X;
        if ((asfpVar4.b & 4) != 0 && (avypVar = asfpVar4.f) == null) {
            avypVar = avyp.a;
        }
        if (ilhVar.q && !ilhVar.A.bH()) {
            ilhVar.g.e(avypVar);
            ilhVar.A.bB(ilhVar.g);
            ilhVar.A.bA(ilhVar.g);
            ilhVar.A.bI(ilhVar.g.i(), ilhVar.g.b);
        }
        ilh ilhVar2 = this.s;
        if (this.X.g) {
            this.am.P();
            z = true;
        }
        asfp asfpVar5 = this.X;
        int i2 = asfpVar5.h;
        ilhVar2.n = z;
        if (z) {
            ilhVar2.p = i2;
        }
        if ((asfpVar5.b & 128) != 0) {
            asfo asfoVar = asfpVar5.k;
            if (asfoVar == null) {
                asfoVar = asfo.a;
            }
            if ((asfoVar.b & 1) != 0) {
                iln ilnVar2 = this.aa;
                asfo asfoVar2 = this.X.k;
                if (asfoVar2 == null) {
                    asfoVar2 = asfo.a;
                }
                int F = akzj.F(asfoVar2.c);
                if (F == 0) {
                    F = 1;
                }
                ilnVar2.e(F);
                this.at = !this.X.n;
                t();
                this.Z.a();
            }
        }
        this.aa.e(2);
        this.at = !this.X.n;
        t();
        this.Z.a();
    }

    public final void E(final asvk asvkVar) {
        this.h.execute(new Runnable() { // from class: ikh
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                boolean z;
                int i2;
                UploadActivity uploadActivity = UploadActivity.this;
                asvk asvkVar2 = asvkVar;
                avxr b = uploadActivity.s.r ? uploadActivity.n.b() : null;
                aopa mo52toBuilder = avtq.a.mo52toBuilder();
                ArrayList arrayList = new ArrayList();
                Intent intent = uploadActivity.getIntent();
                if (intent != null) {
                    Bundle extras = uploadActivity.getIntent().getExtras();
                    if (extras != null) {
                        String string = extras.getString("android.intent.extra.TITLE");
                        String string2 = extras.getString("android.intent.extra.SUBJECT");
                        String string3 = extras.getString("android.intent.extra.TEXT");
                        if (string != null) {
                            aopa createBuilder = asmc.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asmc asmcVar = (asmc) createBuilder.instance;
                            asmcVar.b |= 1;
                            asmcVar.e = "android.intent.extra.TITLE";
                            createBuilder.copyOnWrite();
                            asmc asmcVar2 = (asmc) createBuilder.instance;
                            asmcVar2.c = 2;
                            asmcVar2.d = string;
                            arrayList.add((asmc) createBuilder.mo39build());
                        }
                        if (string2 != null) {
                            aopa createBuilder2 = asmc.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asmc asmcVar3 = (asmc) createBuilder2.instance;
                            asmcVar3.b |= 1;
                            asmcVar3.e = "android.intent.extra.SUBJECT";
                            createBuilder2.copyOnWrite();
                            asmc asmcVar4 = (asmc) createBuilder2.instance;
                            asmcVar4.c = 2;
                            asmcVar4.d = string2;
                            arrayList.add((asmc) createBuilder2.mo39build());
                        }
                        if (string3 != null) {
                            aopa createBuilder3 = asmc.a.createBuilder();
                            createBuilder3.copyOnWrite();
                            asmc asmcVar5 = (asmc) createBuilder3.instance;
                            asmcVar5.b |= 1;
                            asmcVar5.e = "android.intent.extra.TEXT";
                            createBuilder3.copyOnWrite();
                            asmc asmcVar6 = (asmc) createBuilder3.instance;
                            asmcVar6.c = 2;
                            asmcVar6.d = string3;
                            arrayList.add((asmc) createBuilder3.mo39build());
                        }
                        i = 0;
                        z = extras.getBoolean("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false);
                    } else {
                        i = 0;
                        z = false;
                    }
                    i2 = akyc.l(intent) == 7 ? 4 : 2;
                    if (akyc.g(intent)) {
                        mo52toBuilder.copyOnWrite();
                        avtq avtqVar = (avtq) mo52toBuilder.instance;
                        avtqVar.b |= 2;
                        avtqVar.d = true;
                    }
                    if (!TextUtils.isEmpty(uploadActivity.ai)) {
                        String str = uploadActivity.ai;
                        mo52toBuilder.copyOnWrite();
                        avtq avtqVar2 = (avtq) mo52toBuilder.instance;
                        str.getClass();
                        avtqVar2.b |= 1;
                        avtqVar2.c = str;
                    }
                } else {
                    i = 0;
                    z = false;
                    i2 = 2;
                }
                ghi ghiVar = uploadActivity.ad;
                ghi ghiVar2 = ghi.PUBLIC;
                wgg wggVar = wgg.STARTED;
                int ordinal = ghiVar.ordinal();
                if (ordinal == 0) {
                    i = 2;
                } else if (ordinal == 1) {
                    i = 3;
                } else if (ordinal == 2) {
                    i = 1;
                }
                albc albcVar = uploadActivity.t;
                ikn iknVar = new ikn(uploadActivity);
                avtq avtqVar3 = (avtq) mo52toBuilder.mo39build();
                ampq ampqVar = uploadActivity.ah;
                aarl aarlVar = albcVar.g;
                aopa createBuilder4 = asfn.a.createBuilder();
                if (b != null) {
                    createBuilder4.copyOnWrite();
                    asfn asfnVar = (asfn) createBuilder4.instance;
                    asfnVar.d = b;
                    asfnVar.b |= 2;
                }
                if (asvkVar2 != null) {
                    createBuilder4.copyOnWrite();
                    asfn asfnVar2 = (asfn) createBuilder4.instance;
                    asfnVar2.e = asvkVar2;
                    asfnVar2.b |= 8;
                }
                createBuilder4.copyOnWrite();
                asfn asfnVar3 = (asfn) createBuilder4.instance;
                aopu aopuVar = asfnVar3.f;
                if (!aopuVar.c()) {
                    asfnVar3.f = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) arrayList, (List) asfnVar3.f);
                if (i != 0) {
                    createBuilder4.copyOnWrite();
                    asfn asfnVar4 = (asfn) createBuilder4.instance;
                    asfnVar4.g = i - 1;
                    asfnVar4.b |= 16;
                }
                if (avtqVar3 != null) {
                    createBuilder4.copyOnWrite();
                    asfn asfnVar5 = (asfn) createBuilder4.instance;
                    asfnVar5.j = avtqVar3;
                    asfnVar5.b |= 128;
                }
                if (ampqVar.h()) {
                    aopa createBuilder5 = asfm.a.createBuilder();
                    boolean z2 = ((aldv) ampqVar.c()).b;
                    createBuilder5.copyOnWrite();
                    asfm asfmVar = (asfm) createBuilder5.instance;
                    asfmVar.b |= 1;
                    asfmVar.c = z2;
                    asfm asfmVar2 = (asfm) createBuilder5.mo39build();
                    createBuilder4.copyOnWrite();
                    asfn asfnVar6 = (asfn) createBuilder4.instance;
                    asfmVar2.getClass();
                    asfnVar6.l = asfmVar2;
                    asfnVar6.b |= 512;
                }
                createBuilder4.copyOnWrite();
                asfn asfnVar7 = (asfn) createBuilder4.instance;
                asfnVar7.h = i2 - 1;
                asfnVar7.b |= 32;
                createBuilder4.copyOnWrite();
                asfn asfnVar8 = (asfn) createBuilder4.instance;
                asfnVar8.b |= 64;
                asfnVar8.i = z;
                createBuilder4.copyOnWrite();
                asfn asfnVar9 = (asfn) createBuilder4.instance;
                asfnVar9.b |= 256;
                asfnVar9.k = true;
                alao alaoVar = new alao(albcVar.e, albcVar.a.c(), (asfn) createBuilder4.mo39build());
                alaoVar.k(aadi.b);
                aarlVar.e(alaoVar, iknVar);
            }
        });
    }

    public final void F() {
        this.Z.a();
        this.Z.c();
    }

    public final void G() {
        avtp avtpVar;
        asfp asfpVar = this.X;
        if (asfpVar != null) {
            aopa mo52toBuilder = asfpVar.mo52toBuilder();
            int size = ((asfp) mo52toBuilder.instance).d.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((asfq) ((asfp) mo52toBuilder.instance).d.get(size)).b == 334359378) {
                    mo52toBuilder.copyOnWrite();
                    asfp asfpVar2 = (asfp) mo52toBuilder.instance;
                    asfpVar2.a();
                    asfpVar2.d.remove(size);
                }
            }
            mo52toBuilder.copyOnWrite();
            asfp asfpVar3 = (asfp) mo52toBuilder.instance;
            asfpVar3.m = null;
            int i = asfpVar3.b & (-513);
            asfpVar3.b = i;
            if ((i & 2048) != 0) {
                asfq asfqVar = asfpVar3.o;
                if (asfqVar == null) {
                    asfqVar = asfq.a;
                }
                if (asfqVar.b == 334359378) {
                    asfq asfqVar2 = ((asfp) mo52toBuilder.instance).o;
                    if (asfqVar2 == null) {
                        asfqVar2 = asfq.a;
                    }
                    if (asfqVar2.b == 334359378) {
                        avtpVar = (avtp) asfqVar2.c;
                    } else {
                        avtpVar = avtp.a;
                    }
                    this.aB = avtpVar;
                    asfq asfqVar3 = ((asfp) mo52toBuilder.instance).o;
                    if (asfqVar3 == null) {
                        asfqVar3 = asfq.a;
                    }
                    mo52toBuilder.copyOnWrite();
                    asfp asfpVar4 = (asfp) mo52toBuilder.instance;
                    asfqVar3.getClass();
                    asfpVar4.a();
                    asfpVar4.d.add(asfqVar3);
                    K();
                    mo52toBuilder.copyOnWrite();
                    asfp asfpVar5 = (asfp) mo52toBuilder.instance;
                    asfpVar5.o = null;
                    asfpVar5.b &= -2049;
                    this.X = (asfp) mo52toBuilder.mo39build();
                }
            }
            this.aB = null;
            K();
            mo52toBuilder.copyOnWrite();
            asfp asfpVar52 = (asfp) mo52toBuilder.instance;
            asfpVar52.o = null;
            asfpVar52.b &= -2049;
            this.X = (asfp) mo52toBuilder.mo39build();
        }
    }

    final void H() {
        if (this.X == null) {
            J();
        } else if (!this.k.c().d().equals(this.W)) {
            J();
        } else {
            runOnUiThread(new ikk(this));
        }
    }

    @Override // defpackage.ems
    protected final Dialog a(int i) {
        nx nxVar = i != 1021 ? null : this.s.f.d;
        if (nxVar == null) {
            return null;
        }
        return nxVar;
    }

    @Override // defpackage.vxo
    public final void b() {
        if (this.ar) {
            Intent intent = getIntent();
            String I = I();
            this.x.i(zgh.h(I), avul.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_FAILED, akyc.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
        }
    }

    @Override // defpackage.vxo
    public final void c() {
        this.ar = true;
        Intent intent = getIntent();
        String I = I();
        this.x.i(zgh.h(I), avul.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_INITIATED, akyc.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
    }

    @Override // defpackage.vxo
    public final void d() {
        if (this.ar) {
            Intent intent = getIntent();
            String I = I();
            this.x.i(zgh.h(I), avul.UPLOAD_FRONTEND_EVENT_TYPE_PRE_MDE_CHANNEL_CREATION_COMPLETED, akyc.l(intent), intent.getBooleanExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", false));
            G();
        }
    }

    @Override // defpackage.iiy
    public final void g(aqsi aqsiVar) {
    }

    @Override // defpackage.ems
    protected final void h(gfs gfsVar) {
        boolean X = eog.X(((iko) antz.u(this, iko.class)).bY().a());
        if (gfsVar != gfs.DARK) {
            if (!X) {
                return;
            }
            setTheme(2132083939);
        } else if (X) {
            setTheme(2132083937);
        } else {
            setTheme(2132083936);
        }
    }

    @Override // defpackage.ems
    public final void j() {
        zag.h(this);
        onBackPressed();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ghi ghiVar = ghi.PUBLIC;
                wgg wggVar = wgg.STARTED;
                int ordinal = ((wgh) obj).a().ordinal();
                if (ordinal != 1 && ordinal != 2) {
                    return null;
                }
                if (this.k.t()) {
                    r();
                    return null;
                }
                finish();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{wgh.class};
    }

    @Override // defpackage.ike
    public final int l() {
        return R.id.shared_mde_view;
    }

    @Override // defpackage.ike
    public final View m() {
        return this.V.c;
    }

    @Override // defpackage.vxo
    public final void mB() {
        finish();
    }

    @Override // defpackage.ike
    public final ViewAnimatorHelper n() {
        return (ViewAnimatorHelper) findViewById(R.id.view_animator);
    }

    @Override // defpackage.ike, defpackage.ems, defpackage.acth
    public final acti oi() {
        return this.q;
    }

    @Override // defpackage.ike, defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        ilh ilhVar = this.s;
        ilhVar.m = (wiy) ilhVar.a.getSupportFragmentManager().f("verificationFragmentTag");
        wiy wiyVar = ilhVar.m;
        if (wiyVar == null || !wiyVar.at()) {
            super.onBackPressed();
        } else {
            ilhVar.m.aG();
        }
    }

    @Override // defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        boolean z;
        Bundle extras;
        byte[] byteArray;
        super.onCreate(bundle);
        this.U.a();
        setContentView(R.layout.upload_activity);
        this.V.a(this);
        setSupportActionBar(this.V.c);
        Intent intent = getIntent();
        this.Z = (LoadingFrameLayout) findViewById(R.id.loading_frame_layout);
        F();
        this.ab = findViewById(R.id.upload_thumbnail_container);
        this.ad = ghi.a(this.u.getString(etk.UPLOAD_PRIVACY, ghi.PUBLIC.name()));
        this.au = (LinearLayout) findViewById(R.id.account_container);
        this.av = (ViewGroup) findViewById(R.id.account_switcher_container);
        this.ae = (ImageView) findViewById(R.id.account_thumbnail);
        ajmt a = ajmu.a();
        a.c = new ikl(this);
        this.aw = a.a();
        this.ax = (YouTubeTextView) findViewById(R.id.account_name);
        this.ay = (YouTubeTextView) findViewById(R.id.account_name_secondary);
        this.az = (ImageView) findViewById(R.id.account_switcher_icon);
        this.aC = (FrameLayout) findViewById(R.id.music_disclaimer_container);
        this.aD = (YouTubeTextView) findViewById(R.id.music_disclaimer_banner_notice_message);
        this.aA = findViewById(R.id.recycler_view);
        if (bundle != null) {
            this.W = bundle.getString("helper_active_account_identity");
            if (bundle.getByteArray("helper_get_upload_video_form_response") != null) {
                this.X = (asfp) this.m.a(bundle.getByteArray("helper_get_upload_video_form_response"), asfp.a);
            }
            bundle2 = bundle.getBundle("interaction_bundle");
            if (bundle.containsKey("verification_triggered_metadata_update_request")) {
                try {
                    byte[] byteArray2 = bundle.getByteArray("verification_triggered_metadata_update_request");
                    if (byteArray2 != null) {
                        this.Y = (arxl) aopi.parseFrom(arxl.a, byteArray2, aoos.b());
                    }
                } catch (aopx e) {
                    this.S.b("Cannot restore metadata update after verification flow rotation.", e);
                }
            }
        } else {
            bundle2 = null;
        }
        this.q.K(bundle2, (bundle2 != null || intent == null || (extras = intent.getExtras()) == null || (byteArray = extras.getByteArray("navigation_endpoint")) == null) ? null : aafr.c(byteArray));
        if (intent != null) {
            this.s.K = TimeUnit.SECONDS.toMicros(intent.getIntExtra("video_time_limit_seconds", 0));
        }
        ilh ilhVar = this.s;
        if (bundle != null) {
            ilhVar.l = bundle.getBoolean("helper_was_cellular_dialog_dismissed_by_user");
            ilhVar.m = (wiy) ilhVar.a.getSupportFragmentManager().g(bundle, "verification_fragment_key");
            ilhVar.o = bundle.getLong("max_known_video_length_key");
            ilhVar.p = bundle.getLong("required_length_for_verification_key");
            ilhVar.n = bundle.getBoolean("user_verification_eligible_key");
            ilhVar.C = (UploadFrontendIdMapHelper) bundle.getParcelable("fid_map_helper_key");
        }
        final ilh ilhVar2 = this.s;
        acut acutVar = this.q;
        acutVar.getClass();
        ilhVar2.h = acutVar;
        View findViewById = findViewById(16908290);
        if (!ilhVar2.U) {
            ilhVar2.U = true;
            ilhVar2.z = (TextView) findViewById.findViewById(R.id.upload_duration);
            ilhVar2.v = (ViewAnimatorHelper) findViewById.findViewById(R.id.view_animator);
            ilhVar2.x = (ImageView) findViewById.findViewById(R.id.upload_thumbnail);
            ilhVar2.y = (ImageView) findViewById.findViewById(R.id.upload_thumbnail_background);
            ilhVar2.w = (ScrollView) findViewById.findViewById(R.id.scroll_container);
            ilhVar2.a.findViewById(R.id.video_edit_fragment_container).setVisibility(8);
            if (ilhVar2.q) {
                eo supportFragmentManager = ilhVar2.a.getSupportFragmentManager();
                ilhVar2.A = (zxb) supportFragmentManager.f("videoEditFragment");
                if (ilhVar2.A == null) {
                    ilhVar2.A = new zxb();
                    avvf avvfVar = ilhVar2.e.a().h;
                    if (avvfVar == null) {
                        avvfVar = avvf.a;
                    }
                    if (!avvfVar.t) {
                        ilhVar2.ac.O();
                        z = false;
                    } else {
                        z = true;
                    }
                    zxb zxbVar = ilhVar2.A;
                    zxbVar.aN = z;
                    zxbVar.aM = false;
                    boolean z2 = ilhVar2.r;
                    zxbVar.bC(ilhVar2.K);
                    zxb zxbVar2 = ilhVar2.A;
                    zxbVar2.aP = z2 ? 1 : 0;
                    zxbVar2.aQ = ilhVar2.s;
                    zxbVar2.aR = ilhVar2.d.o;
                    ex l = supportFragmentManager.l();
                    l.q(R.id.video_edit_fragment_container, ilhVar2.A, "videoEditFragment");
                    l.a();
                    supportFragmentManager.ab();
                    ilhVar2.i.a(zdg.e(ilhVar2.a.getApplicationContext()), "UPLOADS");
                }
                ilhVar2.A.bz(ilhVar2.h);
            }
            ScrollView scrollView = ilhVar2.w;
            avvf avvfVar2 = ilhVar2.e.a().h;
            if (avvfVar2 == null) {
                avvfVar2 = avvf.a;
            }
            if (avvfVar2.r) {
                scrollView.findViewById(R.id.coppa_container).setVisibility(0);
                aopa createBuilder = aphv.a.createBuilder();
                createBuilder.copyOnWrite();
                aphv aphvVar = (aphv) createBuilder.instance;
                aphvVar.b |= 2;
                aphvVar.c = "yt_android_mfk_upload_LML";
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint, (aphv) createBuilder.mo39build());
                final apzg apzgVar = (apzg) aopcVar.mo39build();
                ((TextView) scrollView.findViewById(R.id.learn_more)).setOnClickListener(new View.OnClickListener() { // from class: ikz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ilh ilhVar3 = ilh.this;
                        apzg apzgVar2 = apzgVar;
                        ilhVar3.h.H(3, new acte(acuo.b(85682)), ilhVar3.c());
                        ilhVar3.c.c(apzgVar2, null);
                    }
                });
            }
            ilhVar2.v.c(R.id.shared_mde_view, new ila(ilhVar2, 1));
            ilhVar2.v.c(R.id.verification_fragment_upload_container, new ila(ilhVar2));
            ilhVar2.j.d((BottomUiContainer) findViewById.findViewById(R.id.bottom_ui_container));
            this.s.t = this;
            iln ilnVar = this.aa;
            frw mC = mC();
            ilnVar.d = this;
            mC.a(ilnVar.b);
            mC.d(zhn.d(this, R.attr.ytThemedBlue));
            ilnVar.c.a = findViewById(R.id.upload_bottom_button_container);
            ili iliVar = ilnVar.c;
            YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.upload_bottom_button);
            iliVar.c = youTubeTextView;
            iliVar.d = iliVar.b.a.a(youTubeTextView);
            ylx.n(this, this.al.a(), hmv.k, new iki(this, 1));
            nj supportActionBar = getSupportActionBar();
            supportActionBar.j(true);
            supportActionBar.m(akf.a(this, 2131233316));
            supportActionBar.A();
            this.w.g(findViewById(16908290));
            this.q.d(acuo.a(9729), null, this.s.c());
            this.N.d(this.V.c, findViewById(R.id.view_animator), findViewById(R.id.element_fragment));
            int[] iArr = this.T.a;
            return;
        }
        throw new IllegalStateException("Helper UI has already been initialized");
    }

    @Override // defpackage.ike, defpackage.oa, defpackage.dt, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            ilh ilhVar = this.s;
            for (alfc alfcVar : ilhVar.D) {
                UploadFrontendIdMapHelper uploadFrontendIdMapHelper = ilhVar.C;
                String e = alfcVar.e();
                akyh akyhVar = ilhVar.F;
                if (uploadFrontendIdMapHelper.f(e) && !uploadFrontendIdMapHelper.e(e) && akzg.f(e)) {
                    akyhVar.c(e, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
                    uploadFrontendIdMapHelper.b.add(e);
                }
            }
            ilhVar.F.B(ilhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
        startActivity(intent);
    }

    @Override // defpackage.ike, defpackage.dt, android.app.Activity
    protected final void onPause() {
        super.onPause();
        this.U.b();
        this.A.f(new aais());
        this.A.m(this);
        this.r.e();
        this.aq = false;
        this.s.V = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.aq = true;
        if (this.ao) {
            this.ao = false;
            if (!this.k.t()) {
                this.p.c(this, null, null);
            } else {
                r();
            }
        }
    }

    @Override // defpackage.ike, defpackage.dt, defpackage.abp, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        final ilh ilhVar = this.s;
        if (i != 0) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (!ilhVar.Z) {
        } else {
            ilhVar.Z = false;
            fvg d = fvl.d();
            d.i(0);
            d.k(ilhVar.a.getString(R.string.upload_external_permission_snackbar_description));
            d.m(ilhVar.a.getString(R.string.upload_external_permission_allow_access_button), new View.OnClickListener() { // from class: iky
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ilh.this.n();
                }
            });
            ilhVar.k.i(d.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.U.e();
        this.A.g(this);
        this.A.f(new aahp());
        this.s.V = true;
        this.ao = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.r.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        arxl arxlVar;
        super.onSaveInstanceState(bundle);
        bundle.putBundle("interaction_bundle", this.q.J());
        bundle.putString("helper_active_account_identity", this.W);
        asfp asfpVar = this.X;
        if (asfpVar != null) {
            bundle.putByteArray("helper_get_upload_video_form_response", asfpVar.toByteArray());
        }
        ilh ilhVar = this.s;
        bundle.putLong("max_known_video_length_key", ilhVar.o);
        bundle.putLong("required_length_for_verification_key", ilhVar.p);
        bundle.putBoolean("user_verification_eligible_key", ilhVar.n);
        bundle.putBoolean("helper_was_cellular_dialog_dismissed_by_user", ilhVar.l);
        eo supportFragmentManager = ilhVar.a.getSupportFragmentManager();
        if (ilhVar.q()) {
            supportFragmentManager.M(bundle, "verification_fragment_key", ilhVar.m);
        }
        bundle.putParcelable("fid_map_helper_key", ilhVar.C);
        if (!this.s.q() || (arxlVar = this.Y) == null) {
            return;
        }
        bundle.putByteArray("verification_triggered_metadata_update_request", arxlVar.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.an = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.an = false;
        if (this.ap) {
            this.s.j();
            this.ap = false;
        }
    }

    @Override // defpackage.ike
    public final ampq p() {
        String stringExtra = getIntent().getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path");
        Long e = akyc.e(getIntent());
        ikd ikdVar = null;
        if (TextUtils.isEmpty(stringExtra) || e == null) {
            this.S.a("Invalid model for the requested Thumbnail configuration.");
        } else {
            try {
                ikdVar = new ikd(Uri.fromFile(new File(stringExtra)), zgh.i((int) TimeUnit.MILLISECONDS.toSeconds(e.longValue())));
            } catch (RuntimeException e2) {
                this.S.b("Error while parsing Thumbnail data.", e2);
            }
        }
        return ampq.i(ikdVar);
    }

    public final void r() {
        String stringExtra;
        if (!this.an || !this.k.t()) {
            return;
        }
        if (this.ap) {
            H();
            return;
        }
        ilh ilhVar = this.s;
        Intent intent = getIntent();
        this.p.getClass();
        intent.getClass();
        asjj q = aqvb.q(ilhVar.D, ilhVar.W);
        ilhVar.h.n(new acte(acuo.b(9701)));
        ilhVar.h.w(new acte(acuo.b(9701)), q);
        ilhVar.h.n(new acte(acuo.b(9702)));
        ilhVar.h.w(new acte(acuo.b(9702)), q);
        if (ilhVar.a.findViewById(R.id.coppa_container).getVisibility() == 0) {
            ilhVar.h.n(new acte(acuo.b(85682)));
        }
        ilhVar.g(13618, q);
        ilhVar.g(13617, q);
        ilhVar.g(13616, q);
        ilhVar.g(13619, q);
        ilhVar.g(13620, q);
        ilhVar.g(13621, q);
        ilhVar.X = akyc.c(intent);
        akyc akycVar = ilhVar.H;
        acti actiVar = ilhVar.h;
        String str = ilhVar.W;
        alhu alhuVar = ilhVar.u;
        ArrayList arrayList = new ArrayList();
        String action = intent.getAction();
        if (action != null) {
            if (action.equals("com.google.android.youtube.intent.action.UPLOAD") || action.equals("com.google.android.youtube.intent.action.INTERNAL_UPLOAD")) {
                actiVar.H(3, new acte(actj.UPLOAD_VIDEO_ACTION_UPLOAD_INTENT), aqvb.p(str, null));
                Uri data = intent.getData();
                if (data != null) {
                    akya a = akyb.a(data);
                    a.c = ampq.i(intent.getStringExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path"));
                    if (!TextUtils.isEmpty(str)) {
                        a.b = ampq.j(str);
                    }
                    arrayList.add(a.a());
                }
            } else if (action.equals("android.intent.action.SEND_MULTIPLE") && intent.hasExtra("android.intent.extra.STREAM")) {
                actiVar.H(3, new acte(actj.UPLOAD_VIDEO_ACTION_SEND_MULTIPLE_INTENT), asjj.a);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Object obj = extras.get("android.intent.extra.STREAM");
                    if (obj instanceof ArrayList) {
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                        if (parcelableArrayListExtra != null) {
                            int size = parcelableArrayListExtra.size();
                            for (int i = 0; i < size; i++) {
                                Parcelable parcelable = (Parcelable) parcelableArrayListExtra.get(i);
                                if (parcelable instanceof Uri) {
                                    arrayList.add(akyb.a((Uri) parcelable).a());
                                }
                            }
                        }
                    } else if ((obj instanceof String) && (stringExtra = intent.getStringExtra("android.intent.extra.STREAM")) != null) {
                        for (String str2 : amqf.b(',').f(stringExtra)) {
                            arrayList.add(akyb.a(Uri.parse(str2)).a());
                        }
                    }
                }
            } else if (action.equals("android.intent.action.SEND")) {
                actiVar.H(3, new acte(actj.UPLOAD_VIDEO_ACTION_SEND_INTENT), asjj.a);
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    Parcelable parcelable2 = extras2.getParcelable("android.intent.extra.STREAM");
                    if (parcelable2 instanceof Uri) {
                        arrayList.add(akyb.a((Uri) parcelable2).a());
                    }
                }
            }
        }
        ilhVar.T = arrayList;
        Iterator it = ilhVar.T.iterator();
        while (it.hasNext()) {
            akyb akybVar = (akyb) it.next();
            if (akybVar == null || Uri.EMPTY.equals(akybVar.a)) {
                it.remove();
            }
        }
        if (ilhVar.T.isEmpty()) {
            zep.l("no media content uri(s)");
            ilhVar.h.H(3, new acte(acuo.b(13619)), ilhVar.c());
            zag.q(ilhVar.a, R.string.error_generic, 1);
            ilhVar.d();
        } else {
            if (ilhVar.C == null) {
                ilhVar.C = new UploadFrontendIdMapHelper(ilhVar.T.size());
            }
            ilhVar.M = true;
            ilhVar.k();
        }
        this.ap = true;
        H();
    }

    @Override // defpackage.ike
    public final void s() {
        iln ilnVar = this.aa;
        ilnVar.f = !this.P;
        ilnVar.c();
    }

    @Override // defpackage.ike
    public final void u(aopa aopaVar) {
        this.Y = (arxl) aopaVar.mo39build();
        this.s.f();
    }

    @Override // defpackage.ike
    protected final void x() {
        ilh ilhVar = this.s;
        ilhVar.h.H(3, new acte(acuo.b(9702)), aqvb.q(ilhVar.D, ilhVar.W));
        super.x();
        Intent intent = getIntent();
        if (intent == null || "com.google.android.youtube.intent.action.INTERNAL_UPLOAD".equals(intent.getAction()) || isTaskRoot()) {
            return;
        }
        Intent a = this.ak.a();
        a.setFlags(67108864);
        startActivity(a);
    }

    public final void t() {
        if (!this.ac || !this.at) {
            this.ab.setVisibility(8);
        } else {
            this.ab.setVisibility(0);
        }
    }

    public final void v() {
        asfp asfpVar = this.X;
        if (asfpVar == null || (asfpVar.b & 32) == 0) {
            this.s.f();
            return;
        }
        aafo aafoVar = this.i;
        apzg apzgVar = asfpVar.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }
}
