package com.google.android.libraries.youtube.livecreation.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.media.MediaActionSound;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.libraries.youtube.livecreation.ui.view.ViewportOverlay;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveCreationEndpointOuterClass$LiveCreationEndpoint;
import com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveCreationActivity extends acgh implements aclk, acko, abzl, aclm, wjb, ackg, acic, acij, ackr, acin, akdz, vxo, acth, yze, aaxu, abwi, abwe, aclq, abws, afzf {
    public zsn A;
    public akys B;
    public SharedPreferences C;
    public akdr D;
    public acgf E;
    public StreamConfig F;
    public eo G;
    public ackp H;
    public acll I;

    /* renamed from: J  reason: collision with root package name */
    public acid f166J;
    public akea K;
    public ViewportOverlay L;
    public acik M;
    public String N;
    public zwn O;
    public boolean P;
    public acnf Q;
    public boolean R;
    public boolean S;
    public akdy Y;
    public abss Z;
    private boolean aB;
    private asug aC;
    private asug aD;
    public vne aa;
    private DisplayManager.DisplayListener ab;
    private yzf ac;
    private wix ad;
    private Parcel ae;
    private ackt af;
    private ackq ag;
    private acll ah;
    private aclr ai;
    private wiy aj;
    private acie ak;
    private acid al;
    private acio am;
    private acln an;
    private acke ao;
    private SurfaceView ap;
    private akdv aq;
    private String ar;
    private String as;
    private boolean at;
    private boolean au;
    private boolean av;
    private int aw;
    private boolean ax;
    private int ay;
    private String az;
    public Handler f;
    public Executor g;
    public yni h;
    public achh i;
    public achd j;
    public afvn k;
    public afwc l;
    public acti m;
    public vxc n;
    public vxk o;
    public wal p;
    public abzn q;
    public snc r;
    public Choreographer s;
    public DisplayManager t;
    public abzc u;
    public aazu v;
    public ScheduledExecutorService w;
    public acrr x;
    public axnm z;
    private static final PermissionDescriptor a = new PermissionDescriptor(0, acuo.b(43000), acuo.b(43001));
    public static final PermissionDescriptor[] c = {new PermissionDescriptor(1, acuo.b(29216), acuo.b(29218)), new PermissionDescriptor(2, acuo.b(29217), acuo.b(29219))};
    private static final long b = TimeUnit.MILLISECONDS.convert(15, TimeUnit.MINUTES);
    public static final long d = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    public static final abzk e = new acgt();
    private boolean aA = false;
    public final List T = new ArrayList();
    public final Handler U = new Handler();
    final acha V = new acha(this);
    public final Runnable W = new acgl(this, 5, null);
    final Choreographer.FrameCallback X = new acgs(this);

    private final int aP() {
        if (this.u.i()) {
            aotz a2 = this.E.a();
            if (a2 != null) {
                return a2.g;
            }
            return 0;
        }
        return this.C.getInt("SHARED_PREF_PORTRAIT_COUNT_KEY", 0);
    }

    private final abyq aQ() {
        acke ackeVar = this.ao;
        if (ackeVar != null) {
            return ackeVar.az;
        }
        return null;
    }

    private final void aR(View view) {
        String q = q();
        if (q != null) {
            zdg.c(this, view, q);
        }
    }

    private final void aS() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_in_fullscreen);
        loadAnimation.setAnimationListener(new acgu(this));
        this.L.startAnimation(loadAnimation);
    }

    private final void aT() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.lc_fade_out_fullscreen);
        loadAnimation.setAnimationListener(new acgv(this));
        this.L.startAnimation(loadAnimation);
    }

    private final void aU() {
        acll acllVar = this.I;
        if (acllVar == null || acllVar.O == null) {
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.I.O.getWindowToken(), 2);
    }

    private final void aV() {
        if (achk.b(this.I)) {
            this.I.aF();
        }
    }

    private final void aW() {
        if (this.f166J != null) {
            ex l = this.G.l();
            l.m(this.f166J);
            l.a();
            this.f166J = null;
        }
        if (this.al != null) {
            ex l2 = this.G.l();
            l2.m(this.al);
            l2.a();
            this.al = null;
        }
    }

    private final void aX() {
        startActivityForResult(((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent(), 1000);
    }

    private final void aY(String str) {
        ylx.n(this, this.E.a.b(new wdx(str, 12), anjk.a), zbx.i, zbx.m);
    }

    private final void aZ() {
        StreamConfig streamConfig = this.F;
        if (streamConfig.a || TextUtils.isEmpty(streamConfig.c)) {
            return;
        }
        final String b2 = this.F.b();
        if (TextUtils.isEmpty(b2)) {
            zep.b("Failed to save the live stream state.");
        } else if (this.u.i()) {
            aY(b2);
        } else {
            this.g.execute(new Runnable() { // from class: acgn
                @Override // java.lang.Runnable
                public final void run() {
                    LiveCreationActivity liveCreationActivity = LiveCreationActivity.this;
                    String str = b2;
                    SharedPreferences.Editor edit = liveCreationActivity.C.edit();
                    edit.putString("SHARED_PREF_STREAM_CONFIG_KEY", str);
                    edit.commit();
                }
            });
        }
    }

    public static void an(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage("com.android.chrome");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            context.startActivity(intent.setComponent(null));
        }
    }

    private final void ba(atgl atglVar) {
        this.i.e();
        aW();
        acid n = acid.n(atglVar, null, this.ay, this.aA, aP());
        this.al = n;
        aB(n, "CONFIRM_THUMBNAIL_FRAGMENT");
    }

    private final void bb(asug asugVar) {
        if (asugVar != null) {
            this.aC = asugVar;
            acie acieVar = new acie();
            aunb aunbVar = asugVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((aqft) aunbVar.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer)).toByteArray());
            acieVar.ae(bundle);
            this.ak = acieVar;
            bj(acieVar, "COOL_OFF_FRAGMENT_NAME", true);
        }
    }

    private final void bc(String str) {
        str.getClass();
        if (this.M == null) {
            this.M = new acik();
        }
        acik acikVar = this.M;
        acikVar.d = new abtc(this, this.r).b(str);
        if (achk.b(acikVar.c)) {
            acikVar.s();
        }
        akdv akdvVar = new akdv(akdu.d(this), this.m, Arrays.asList(a), R.string.lc_permission_open_settings_storage_description, R.string.lc_permissions_missing_storage, new acgl(this, 2), qvl.h, this.D);
        this.aq = akdvVar;
        akdvVar.a();
    }

    private final void bd(acim acimVar, String str) {
        t();
        acio acioVar = new acio();
        Bundle bundle = new Bundle();
        bundle.putSerializable("state", acimVar);
        bundle.putString("message", str);
        acioVar.ae(bundle);
        this.am = acioVar;
        ex l = this.G.l();
        l.u(R.id.error_fragment_container, this.am, "ERROR_STATE_FRAGMENT");
        aU();
        l.i = 4099;
        l.a();
        this.F.w = "ERROR_STATE_FRAGMENT";
    }

    private final void be(athj athjVar, String str, arag aragVar) {
        ackt acktVar = this.af;
        if (acktVar == null || !acktVar.at()) {
            acio acioVar = this.am;
            if (acioVar != null) {
                ex l = this.G.l();
                l.l(acioVar);
                l.i = 4099;
                l.a();
            }
            ackt acktVar2 = new ackt();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ERROR_MESSAGE", str);
            if (aragVar != null) {
                aphq.m(bundle, "ARG_ERROR_MESSAGE_FORMATTED_STRING", aragVar);
            }
            if (athjVar != null) {
                aphq.m(bundle, "ARG_ENDSCREEN_RENDERER", athjVar);
            }
            acktVar2.ae(bundle);
            this.af = acktVar2;
            ex l2 = this.G.l();
            acke ackeVar = this.ao;
            if (ackeVar != null) {
                l2.m(ackeVar);
            }
            l2.q(R.id.stream_fragment_container, this.af, "POST_STREAM_FRAGMENT");
            l2.i = 4099;
            l2.s();
            l2.a();
            this.ao = null;
            this.F.w = "POST_STREAM_FRAGMENT";
            aS();
            this.Q.e(true);
            if (!aH()) {
                return;
            }
            ao(this.X);
        }
    }

    private final void bf(asug asugVar) {
        if (asugVar != null) {
            this.aD = asugVar;
            acln aclnVar = new acln();
            aunb aunbVar = asugVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            Bundle bundle = new Bundle();
            bundle.putByteArray("ARG_RENDERER", ((aqft) aunbVar.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer)).toByteArray());
            aclnVar.ae(bundle);
            this.an = aclnVar;
            bj(aclnVar, "SAFEGUARD_FRAGMENT", true);
        }
    }

    private final void bg(boolean z) {
        this.al = null;
        aclr aclrVar = this.ai;
        if (aclrVar == null) {
            this.ai = new aclr();
        } else {
            aclrVar.r();
        }
        bj(this.ai, "SCHEDULED_EVENTS_FRAGMENT_NAME", z);
    }

    private final void bi() {
        if (this.ax) {
            this.Z.k();
            acnf acnfVar = this.Q;
            ylr.c();
            acnfVar.f.f();
            if (!acnfVar.a) {
                absz abszVar = acnfVar.g;
                if (abszVar != null) {
                    abszVar.e();
                }
                acnfVar.d.e(new acmy(acnfVar.j));
            }
            abtj abtjVar = acnfVar.m;
            if (abtjVar != null) {
                abtjVar.d();
            }
            this.ap.setVisibility(4);
            this.ax = false;
        }
    }

    private final void bj(dp dpVar, String str, boolean z) {
        dp f = this.G.f(this.F.w);
        dpVar.getClass();
        zgh.m(str);
        ex l = this.G.l();
        if (f != null && f.ap() && !f.equals(dpVar)) {
            if (z) {
                l.m(f);
            } else {
                l.l(f);
            }
        }
        if (!dpVar.ap()) {
            l.q(R.id.stream_fragment_container, dpVar, str);
        } else if (dpVar.G) {
            l.n(dpVar);
        }
        l.i = 4099;
        l.a();
        this.F.w = str;
    }

    private static boolean bk(Intent intent) {
        return intent.hasExtra("statusCode") && intent.hasExtra("didStream");
    }

    private static final boolean bl(StreamMetadata streamMetadata) {
        Date date;
        return (streamMetadata == null || (date = streamMetadata.j) == null || date.getTime() <= 0) ? false : true;
    }

    private final void bm(final String str, String str2, int i) {
        alcz alczVar;
        if (!this.aB) {
            return;
        }
        wgg wggVar = wgg.STARTED;
        int i2 = i - 1;
        if (i2 == 1) {
            alczVar = alcz.PUBLIC;
        } else if (i2 != 2) {
            alczVar = alcz.PRIVATE;
        } else {
            alczVar = alcz.UNLISTED;
        }
        aopa createBuilder = alda.a.createBuilder();
        String h = zgh.h(str2);
        createBuilder.copyOnWrite();
        alda aldaVar = (alda) createBuilder.instance;
        aldaVar.b = 1 | aldaVar.b;
        aldaVar.c = h;
        createBuilder.copyOnWrite();
        alda aldaVar2 = (alda) createBuilder.instance;
        aldaVar2.e = alczVar.d;
        aldaVar2.b |= 4;
        final alda aldaVar3 = (alda) createBuilder.mo39build();
        final akys akysVar = this.B;
        final afvm c2 = this.k.c();
        final String d2 = akysVar.e.d();
        anlz.A(anlz.v(new aniq() { // from class: akyo
            @Override // defpackage.aniq
            public final ankt a() {
                akys akysVar2 = akys.this;
                String str3 = str;
                afvm afvmVar = c2;
                String str4 = d2;
                alda aldaVar4 = aldaVar3;
                aqxo.q(!str3.isEmpty(), "Invalid or empty passed Video ID.");
                aqxo.q(!afvmVar.z(), "Cannot use a signed-out identity.");
                String.valueOf(str4).length();
                String.valueOf(str3).length();
                for (alcw alcwVar : akysVar2.f.c().values()) {
                    if (str3.equals(alcwVar.W)) {
                        throw new IllegalArgumentException("Attempted to add a new FeedbackOnlyUpload with a non-unique videoId.");
                    }
                }
                aopa createBuilder2 = alcw.a.createBuilder();
                createBuilder2.copyOnWrite();
                alcw alcwVar2 = (alcw) createBuilder2.instance;
                str3.getClass();
                alcwVar2.c |= 32768;
                alcwVar2.W = str3;
                createBuilder2.copyOnWrite();
                alcw alcwVar3 = (alcw) createBuilder2.instance;
                str4.getClass();
                alcwVar3.b |= 64;
                alcwVar3.k = str4;
                createBuilder2.copyOnWrite();
                alcw alcwVar4 = (alcw) createBuilder2.instance;
                aldaVar4.getClass();
                alcwVar4.i = aldaVar4;
                alcwVar4.b |= 16;
                String d3 = afvmVar.d();
                createBuilder2.copyOnWrite();
                alcw alcwVar5 = (alcw) createBuilder2.instance;
                alcwVar5.b |= 1;
                alcwVar5.e = d3;
                long c3 = akysVar2.b.c();
                createBuilder2.copyOnWrite();
                alcw alcwVar6 = (alcw) createBuilder2.instance;
                alcwVar6.b |= 8;
                alcwVar6.h = c3;
                alcu alcuVar = alcu.FEEDBACK_ONLY_UPLOAD;
                createBuilder2.copyOnWrite();
                alcw alcwVar7 = (alcw) createBuilder2.instance;
                alcwVar7.l = alcuVar.g;
                alcwVar7.b |= 128;
                alct e2 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar8 = (alcw) createBuilder2.instance;
                e2.getClass();
                alcwVar8.K = e2;
                alcwVar8.c |= 64;
                alct e3 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar9 = (alcw) createBuilder2.instance;
                e3.getClass();
                alcwVar9.w = e3;
                alcwVar9.b |= 16777216;
                alct e4 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar10 = (alcw) createBuilder2.instance;
                e4.getClass();
                alcwVar10.H = e4;
                alcwVar10.c |= 8;
                alct e5 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar11 = (alcw) createBuilder2.instance;
                e5.getClass();
                alcwVar11.aa = e5;
                alcwVar11.c |= 524288;
                alct e6 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar12 = (alcw) createBuilder2.instance;
                e6.getClass();
                alcwVar12.ab = e6;
                alcwVar12.c |= 1048576;
                alct e7 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar13 = (alcw) createBuilder2.instance;
                e7.getClass();
                alcwVar13.ak = e7;
                alcwVar13.c |= 536870912;
                alct e8 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar14 = (alcw) createBuilder2.instance;
                e8.getClass();
                alcwVar14.ai = e8;
                alcwVar14.c |= 134217728;
                alct e9 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar15 = (alcw) createBuilder2.instance;
                e9.getClass();
                alcwVar15.L = e9;
                alcwVar15.c |= 128;
                alct e10 = akysVar2.m.e();
                createBuilder2.copyOnWrite();
                alcw alcwVar16 = (alcw) createBuilder2.instance;
                e10.getClass();
                alcwVar16.ag = e10;
                alcwVar16.c |= 33554432;
                createBuilder2.copyOnWrite();
                alcw.a((alcw) createBuilder2.instance);
                createBuilder2.copyOnWrite();
                alcw alcwVar17 = (alcw) createBuilder2.instance;
                alcwVar17.b |= 1048576;
                alcwVar17.s = false;
                akys.f(str4, createBuilder2);
                List c4 = akys.c(akysVar2.a);
                createBuilder2.copyOnWrite();
                alcw alcwVar18 = (alcw) createBuilder2.instance;
                alcwVar18.r = 1;
                alcwVar18.b |= 65536;
                c4.add(avuj.UPLOAD_FEATURE_REUSE_OPEN_SOURCE_VIDEO);
                alcw alcwVar19 = (alcw) createBuilder2.mo39build();
                akysVar2.f.h(str4, alcwVar19);
                akysVar2.i.j(str4, afvmVar.d(), avuk.UPLOAD_FLOW_SOURCE_UNKNOWN, 5, false, (avuj[]) c4.toArray(new avuj[0]));
                akysVar2.j.b(str4);
                akysVar2.k.i(str4, alcwVar19);
                ((alci) akysVar2.l.get()).B(alcm.a(str4).a());
                return anlz.q(alcwVar19);
            }
        }, akysVar.c), new akyq(akysVar, d2, c2), anjk.a);
    }

    @Override // defpackage.aclm
    public final void A() {
        finish();
    }

    @Override // defpackage.aclk
    public final void B(asug asugVar) {
        bb(asugVar);
    }

    @Override // defpackage.acij
    public final void C(Bitmap bitmap) {
        acid acidVar = this.al;
        if (acidVar != null) {
            acidVar.aI(bitmap);
            this.al.aF();
            bj(this.al, "CONFIRM_THUMBNAIL_FRAGMENT", true);
            return;
        }
        acid acidVar2 = this.f166J;
        if (acidVar2 != null) {
            acidVar2.aI(bitmap);
            this.f166J.aF();
            bj(this.f166J, "CHOOSE_THUMBNAIL_FRAGMENT", true);
            return;
        }
        finish();
    }

    @Override // defpackage.acic
    public final void D(arsp arspVar) {
        if (this.al == null) {
            ax();
            return;
        }
        int i = this.ay;
        acll acllVar = new acll();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putParcelable("ARG_GET_BROADCAST_RESPONSE", new ParcelableMessageLite(arspVar));
        acllVar.ae(bundle);
        this.ah = acllVar;
        aB(acllVar, "EDIT_SETTINGS_PRE_STREAM_FRAGMENT");
    }

    @Override // defpackage.acic
    public final void E(String str) {
        bc(str);
    }

    @Override // defpackage.acin
    public final void F() {
        finish();
    }

    @Override // defpackage.aclk
    public final void G(atgl atglVar) {
        acid acidVar = this.al;
        acidVar.getClass();
        this.aA = atglVar.q != acidVar.aR();
        ba(atglVar);
    }

    @Override // defpackage.aclm
    public final void H() {
        aw();
    }

    @Override // defpackage.aclk
    public final void I(atgl atglVar) {
        this.F.i = atglVar;
        abxa.b().h = atglVar.q;
    }

    @Override // defpackage.ackg
    public final void J(int i, String str, String str2, aths athsVar) {
        StreamConfig streamConfig = this.F;
        streamConfig.x = i;
        streamConfig.u = str;
        streamConfig.v = str2;
        streamConfig.j = athsVar;
    }

    @Override // defpackage.ackg
    public final void K(int i, athj athjVar, String str, arag aragVar, boolean z) {
        avvf avvfVar;
        String.valueOf(str).length();
        setRequestedOrientation(-1);
        ViewGroup.LayoutParams layoutParams = this.ap.getLayoutParams();
        if (layoutParams.height != -1 && layoutParams.width != -1) {
            zgd.t(this.ap, zgd.s(-1, -1), ViewGroup.LayoutParams.class);
        }
        aG("off");
        if (i == 0 || i == 26 || i == 31) {
            if (z) {
                this.i.f();
                if (i != 26 || athjVar != null || str != null || aragVar != null) {
                    arhd a2 = this.u.a.a();
                    if (a2 != null) {
                        avvfVar = a2.h;
                        if (avvfVar == null) {
                            avvfVar = avvf.a;
                        }
                    } else {
                        avvfVar = avvf.a;
                    }
                    if (avvfVar.c) {
                        if (athjVar == null) {
                            aopa createBuilder = arwp.a.createBuilder();
                            String str2 = this.F.c;
                            createBuilder.copyOnWrite();
                            arwp arwpVar = (arwp) createBuilder.instance;
                            str2.getClass();
                            arwpVar.b = 2 | arwpVar.b;
                            arwpVar.d = str2;
                            this.v.a(createBuilder, this, null);
                        } else {
                            StreamConfig streamConfig = this.F;
                            String str3 = streamConfig.c;
                            String str4 = streamConfig.d.a;
                            int bX = awwc.bX(athjVar.f);
                            if (bX == 0) {
                                bX = 1;
                            }
                            bm(str3, str4, bX);
                        }
                    }
                    be(athjVar, str, aragVar);
                } else {
                    finish();
                    return;
                }
            } else {
                finish();
                if (this.F.d != null && Boolean.TRUE.equals(this.F.d.f)) {
                    startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                }
            }
        } else if (i == 33) {
            this.i.f();
            be(athjVar, str, aragVar);
        } else if (i == 21) {
            bd(acim.CUSTOM_MESSAGE, getString(R.string.lc_error_state_account_not_enabled));
        } else if (i == 22) {
            acll acllVar = this.I;
            if (acllVar != null) {
                aB(acllVar, "PRE_STREAM_FRAGMENT");
            }
            new AlertDialog.Builder(this).setTitle(R.string.lc_live_streaming_error).setMessage(R.string.lc_live_streaming_account_blocked).setPositiveButton(R.string.lc_live_streaming_account_blocked_more_info, new acgo(this)).setNegativeButton(R.string.lc_live_streaming_not_enabled_no, new acgo(this, 2)).setCancelable(false).show();
        } else {
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.lc_live_streaming_error);
            }
            if (z) {
                be(null, str, aragVar);
            } else {
                bd(acim.CUSTOM_MESSAGE, str);
            }
        }
        this.U.removeCallbacks(this.W);
        s(false);
    }

    @Override // defpackage.ackg
    public final void L() {
        this.Q.e(true);
        aS();
    }

    @Override // defpackage.ackg
    public final void M(boolean z) {
        this.F.o = z;
    }

    @Override // defpackage.ackg
    public final void N(boolean z) {
        this.Q.e(z);
        if (z) {
            aS();
        } else {
            aT();
        }
    }

    @Override // defpackage.ackg
    public final void O() {
        this.Q.e(false);
        aT();
        yzf yzfVar = this.ac;
        if (yzfVar != null) {
            yzfVar.enable();
        }
        if (achk.c(this)) {
            this.Q.f(getWindowManager().getDefaultDisplay().getRotation());
        }
    }

    @Override // defpackage.ackg
    public final void P(long j) {
        int aP;
        StreamConfig streamConfig = this.F;
        streamConfig.l = j;
        if (streamConfig.p && (aP = aP() + 1) <= this.u.b()) {
            if (this.u.i()) {
                ylx.n(this, this.E.a.b(new fgn(aP, 6), anjk.a), zbx.h, zbx.l);
            } else {
                this.g.execute(new acgm(this, aP, 1));
            }
        }
        aZ();
    }

    @Override // defpackage.ackg
    public final void Q(View view) {
        this.Q.c();
        aR(view);
    }

    @Override // defpackage.ackg
    public final void R(absi absiVar) {
        acnf acnfVar = this.Q;
        if (acnfVar.i == null) {
            absiVar.getClass();
            acnfVar.i = absiVar;
            absi absiVar2 = acnfVar.i;
            boolean z = false;
            if (!acnfVar.b && acnfVar.o) {
                z = true;
            }
            absiVar2.a = z;
            acnfVar.d.b(absiVar2);
            return;
        }
        zep.m("CameraStreamViewManager", "Pipeline render target already set.");
    }

    @Override // defpackage.ackr
    public final void S(apzg apzgVar) {
        if (apzgVar == null || apzgVar.qn(VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint)) {
            apzgVar = this.m.f(aafr.a("FEmy_videos"));
        }
        aafn.a(this.j, apzgVar);
        finish();
    }

    @Override // defpackage.acko
    public final void T() {
        finish();
    }

    @Override // defpackage.acko
    public final void U(View view) {
        this.Q.c();
        aR(view);
        ackp ackpVar = this.H;
        if (ackpVar != null) {
            ackpVar.am = q();
            if (ackpVar.al == null || TextUtils.isEmpty(ackpVar.am)) {
                return;
            }
            ackpVar.al.setContentDescription(ackpVar.am);
        }
    }

    @Override // defpackage.aclk
    public final void V() {
        acll acllVar = this.ah;
        if (acllVar == null || !acllVar.at()) {
            if (!TextUtils.isEmpty(this.F.c)) {
                if (!bl(this.F.d)) {
                    acgz acgzVar = new acgz(this);
                    new AlertDialog.Builder(this).setMessage(R.string.lc_confirm_abandon_streaming).setPositiveButton(17039370, acgzVar).setNegativeButton(17039360, acgzVar).setOnCancelListener(acgzVar).show();
                    return;
                }
                this.F.a = true;
                s(false);
                finish();
                return;
            }
            finish();
            return;
        }
        acid acidVar = this.al;
        acidVar.getClass();
        y(acidVar.aR());
        aB(this.al, "CONFIRM_THUMBNAIL_FRAGMENT");
        if (!this.al.ar()) {
            return;
        }
        this.al.Y();
    }

    @Override // defpackage.aclk
    public final void W(StreamMetadata streamMetadata) {
        StreamConfig streamConfig = this.F;
        StreamMetadata streamMetadata2 = streamConfig.d;
        if (streamMetadata2 == null) {
            streamConfig.d = streamMetadata;
        } else {
            String str = streamMetadata.a;
            if (str != null) {
                streamMetadata2.a = str;
            }
            String str2 = streamMetadata.b;
            if (str2 != null) {
                streamMetadata2.b = str2;
            }
            Boolean bool = streamMetadata.c;
            if (bool != null) {
                streamMetadata2.c = bool;
            }
            Boolean bool2 = streamMetadata.d;
            if (bool2 != null) {
                streamMetadata2.d = bool2;
            }
            Boolean bool3 = streamMetadata.e;
            if (bool3 != null) {
                streamMetadata2.e = bool3;
            }
            int i = streamMetadata.l;
            if (i != 0) {
                streamMetadata2.l = i;
            }
            Boolean bool4 = streamMetadata.f;
            if (bool4 != null) {
                streamMetadata2.f = bool4;
            }
            arpk arpkVar = streamMetadata.g;
            if (arpkVar != null) {
                streamMetadata2.g = arpkVar;
            }
            arpl arplVar = streamMetadata.h;
            if (arplVar != null) {
                streamMetadata2.h = arplVar;
            }
            int i2 = streamMetadata.m;
            if (i2 != 0) {
                streamMetadata2.m = i2;
            }
            Place place = streamMetadata.i;
            if (place != null) {
                streamMetadata2.i = place;
            }
            Date date = streamMetadata.j;
            if (date != null) {
                streamMetadata2.j = date;
            }
            arbt arbtVar = streamMetadata.k;
            if (arbtVar != null) {
                streamMetadata2.k = arbtVar;
            }
        }
        this.i.e();
        if (this.f166J != null) {
            Boolean bool5 = streamMetadata.f;
            boolean z = true;
            if ((bool5 != null && bool5.booleanValue()) == this.f166J.aR()) {
                z = false;
            }
            this.aA = z;
        }
        au();
    }

    @Override // defpackage.aclk
    public final void X() {
        vxc vxcVar = this.n;
        if (!vxcVar.b.t()) {
            vxcVar.a.b();
            return;
        }
        vxk vxkVar = vxcVar.a;
        aopa createBuilder = ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) createBuilder.instance;
        channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.d = 5;
        channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.b |= 2;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint, (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint) createBuilder.mo39build());
        vxkVar.k((apzg) aopcVar.mo39build());
    }

    @Override // defpackage.aclk
    public final void Y(atwq atwqVar) {
        boolean y = zew.y(this);
        wiy a2 = wig.a(atwqVar, y);
        this.aj = a2;
        if (y) {
            ex l = this.G.l();
            l.r(this.aj, "LIVE_ENABLEMENT_FRAGMENT_NAME");
            l.i = 4099;
            l.d();
            this.F.w = "LIVE_ENABLEMENT_FRAGMENT_NAME";
        } else {
            aB(a2, "LIVE_ENABLEMENT_FRAGMENT_NAME");
        }
        if (atwqVar.g.size() > 0) {
            this.G.ab();
            aqft aqftVar = ((atwr) atwqVar.g.get(0)).b;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            ay(aqftVar);
        }
    }

    @Override // defpackage.aclk
    public final void Z() {
        bg(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aA() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.aA():void");
    }

    public final void aB(dp dpVar, String str) {
        bj(dpVar, str, false);
    }

    @Override // defpackage.acic
    public final void aC() {
        acid acidVar = this.al;
        if (acidVar == null || !acidVar.at()) {
            ax();
            return;
        }
        this.al = null;
        bg(true);
    }

    @Override // defpackage.acic
    public final void aD() {
        this.L.a(null);
        achh achhVar = this.i;
        achhVar.b = true;
        achhVar.g();
    }

    @Override // defpackage.acic
    public final void aE(View view) {
        this.Q.c();
        aR(view);
        acid acidVar = this.f166J;
        if (acidVar == null || !acidVar.at()) {
            acid acidVar2 = this.al;
            if (acidVar2 == null || !acidVar2.at()) {
                return;
            }
            this.al.aL(q());
            return;
        }
        this.f166J.aL(q());
    }

    public final void aF() {
        if (!this.P || achk.c(this)) {
            this.Q.f(getWindowManager().getDefaultDisplay().getRotation());
            if (!TextUtils.isEmpty(this.F.u) || !TextUtils.isEmpty(this.F.v)) {
                return;
            }
            int i = getResources().getConfiguration().orientation;
            StreamConfig streamConfig = this.F;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            streamConfig.p = z;
        }
    }

    @Override // defpackage.ackg
    public final boolean aG(String str) {
        acnf acnfVar = this.Q;
        ylr.c();
        return acnfVar.f.l(str);
    }

    public final boolean aH() {
        return this.i.d && this.aB;
    }

    @Override // defpackage.akdz
    public final void aI() {
        finish();
    }

    @Override // defpackage.akdz
    public final void aJ() {
        this.S = false;
        this.f.post(new acgl(this));
    }

    @Override // defpackage.ackg
    public final void aK(float f, float f2, acjx acjxVar) {
        acnf acnfVar = this.Q;
        ylr.c();
        acnfVar.f.m(f, f2, acnfVar.n.c, acjxVar);
    }

    @Override // defpackage.acic
    public final boolean aL(int i, int i2, int i3, achs achsVar) {
        int i4;
        boolean z;
        if (!this.Q.f.b) {
            ((MediaActionSound) ((znf) this.z.get()).a.get()).play(0);
        }
        acnf acnfVar = this.Q;
        acgk acgkVar = new acgk(achsVar);
        ylr.c();
        View decorView = acnfVar.c.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int i5 = acnfVar.f.d;
        int width = (rect.width() * i5) / rect.height();
        if (acnfVar.b || !acnfVar.o) {
            i4 = i;
            z = false;
        } else {
            i4 = i;
            z = true;
        }
        int width2 = (int) ((i4 * width) / rect.width());
        int height = (int) ((i2 * i5) / rect.height());
        Activity activity = acnfVar.c;
        aqxo.p(i3 > 0);
        aqxo.p(i5 > 0);
        aqxo.p(rect.height() > 0);
        int integer = activity.getResources().getInteger(R.integer.lc_aspect_ratio_width);
        int integer2 = activity.getResources().getInteger(R.integer.lc_aspect_ratio_height);
        int round = Math.round((i3 * i5) / rect.height()) / integer2;
        Point point = new Point(integer * round, integer2 * round);
        if (point.x < 4 || point.y < 4 || point.x + width2 > width || point.y + height > i5) {
            return false;
        }
        acnfVar.l.f(width, i5, new acne(acnfVar, z, width2, height, point, acgkVar));
        return true;
    }

    @Override // defpackage.ackg
    public final boolean aM() {
        acnf acnfVar = this.Q;
        ylr.c();
        return acnfVar.f.k("torch");
    }

    @Override // defpackage.ackg
    public final void aN(float f) {
        acnf acnfVar = this.Q;
        ylr.c();
        acnfVar.f.n(f);
    }

    @Override // defpackage.aclk
    public final aopa aO(StreamMetadata streamMetadata) {
        abzd abzdVar;
        abzd a2;
        arpk arpkVar;
        arpl arplVar;
        StreamConfig streamConfig = this.F;
        if (streamConfig.c == null) {
            return null;
        }
        StreamMetadata streamMetadata2 = streamConfig.d;
        String str = streamMetadata.a;
        String str2 = streamMetadata.b;
        int i = streamMetadata.m;
        Place place = streamMetadata.i;
        Boolean bool = streamMetadata.c;
        Boolean bool2 = streamMetadata.d;
        Boolean bool3 = streamMetadata.e;
        int i2 = streamMetadata.l;
        Boolean bool4 = streamMetadata.f;
        arpk arpkVar2 = streamMetadata.g;
        Date date = streamMetadata.j;
        arbt arbtVar = streamMetadata.k;
        abzd abzdVar2 = abzd.a;
        abzd abzdVar3 = abzd.a;
        boolean equals = Objects.equals(str, streamMetadata2.a);
        boolean z = !equals;
        String str3 = true != equals ? str : null;
        boolean equals2 = Objects.equals(str2, streamMetadata2.b);
        boolean z2 = (!equals2) | z;
        String str4 = true != equals2 ? str2 : null;
        int i3 = streamMetadata2.m;
        boolean z3 = (!(i == i3)) | z2;
        int i4 = i != i3 ? i : 0;
        if (!Objects.equals(place, streamMetadata2.i)) {
            abzdVar = place == null ? abzd.b : abzd.a(place);
            z3 = true;
        } else {
            abzdVar = abzdVar2;
        }
        boolean equals3 = Objects.equals(bool, streamMetadata2.c);
        boolean z4 = (!equals3) | z3;
        Boolean bool5 = true != equals3 ? bool : null;
        boolean equals4 = Objects.equals(bool2, streamMetadata2.d);
        boolean z5 = z4 | (!equals4);
        Boolean bool6 = true == equals4 ? null : bool2;
        Boolean bool7 = true != equals4 ? bool : bool5;
        int i5 = streamMetadata2.l;
        boolean z6 = z5 | (!(i2 == i5));
        int i6 = i2 != i5 ? i2 : 0;
        boolean equals5 = Objects.equals(bool3, streamMetadata2.e);
        boolean z7 = (!equals5) | z6;
        Boolean bool8 = true == equals5 ? null : bool3;
        boolean equals6 = Objects.equals(bool4, streamMetadata2.f);
        boolean z8 = !equals6;
        boolean z9 = z7 | z8;
        Boolean bool9 = true != equals6 ? bool4 : null;
        if (z8 || !Objects.equals(arbtVar, streamMetadata2.k)) {
            a2 = (!bool4.booleanValue() || arbtVar == null || (arbtVar.b & 4) == 0) ? abzd.b : abzd.a(arbtVar.e);
            z9 = true;
        } else {
            a2 = abzdVar3;
        }
        if (arpkVar2 == null || Objects.equals(arpkVar2, streamMetadata2.g)) {
            arpkVar = null;
            arplVar = null;
        } else {
            arpk arpkVar3 = streamMetadata2.g;
            aopa createBuilder = arpl.a.createBuilder();
            if (arpkVar3 == null || arpkVar2.c != arpkVar3.c) {
                createBuilder.copyOnWrite();
                arpl.a((arpl) createBuilder.instance);
            }
            if ((arpkVar2.b & 8) != 0 && (arpkVar3 == null || !TextUtils.equals(arpkVar2.f, arpkVar3.f))) {
                createBuilder.copyOnWrite();
                arpl.d((arpl) createBuilder.instance);
            } else if ((arpkVar2.b & 4) != 0 && (arpkVar3 == null || arpkVar2.e != arpkVar3.e)) {
                createBuilder.copyOnWrite();
                arpl.c((arpl) createBuilder.instance);
            }
            if ((arpkVar2.b & 16) != 0 && (arpkVar3 == null || arpkVar2.g != arpkVar3.g)) {
                createBuilder.copyOnWrite();
                arpl.e((arpl) createBuilder.instance);
            }
            if ((arpkVar2.b & 32) != 0 && (arpkVar3 == null || !TextUtils.equals(arpkVar2.h, arpkVar3.h))) {
                createBuilder.copyOnWrite();
                arpl.f((arpl) createBuilder.instance);
            }
            if (arpkVar3 == null || arpkVar2.d != arpkVar3.d) {
                createBuilder.copyOnWrite();
                arpl.b((arpl) createBuilder.instance);
            }
            arplVar = (arpl) createBuilder.mo39build();
            arpkVar = arpkVar2;
            z9 = true;
        }
        boolean equals7 = Objects.equals(date, streamMetadata2.j);
        boolean z10 = (!equals7) | z9;
        Date date2 = true != equals7 ? date : null;
        if (!z10) {
            return null;
        }
        return this.q.m(this.F.c, str3, str4, bool7, bool6, bool8, bool9, arpkVar, arplVar, i4, i6, abzdVar, date2, a2, null);
    }

    @Override // defpackage.aclk
    public final void aa(asug asugVar) {
        bf(asugVar);
    }

    @Override // defpackage.aclk
    public final void ab(View view) {
        this.Q.c();
        aR(view);
        this.I.aH(q());
    }

    @Override // defpackage.aclk
    public final void ac(aqft aqftVar) {
        ay(aqftVar);
    }

    @Override // defpackage.aclq
    public final void ad(atgl atglVar) {
        ba(atglVar);
        y(atglVar.q);
    }

    @Override // defpackage.aclq
    public final void ae() {
        ax();
    }

    @Override // defpackage.ackg
    public final void af(boolean z) {
        abtj abtjVar = this.Q.m;
        if (abtjVar != null) {
            abtjVar.h(z);
        }
    }

    @Override // defpackage.ackg
    public final void ag() {
        this.F.q = true;
    }

    @Override // defpackage.acic
    public final void ah() {
        acid acidVar = this.al;
        if (acidVar == null || !acidVar.at()) {
            this.I = null;
            this.f166J = null;
            this.F.a = true;
            s(false);
            String str = this.F.w;
            this.F = new StreamConfig();
            abxa.b().g();
            this.F.w = str;
            ax();
            return;
        }
        this.al.aH();
    }

    @Override // defpackage.acko
    public final void ai(aths athsVar, String str, String str2) {
        StreamConfig streamConfig = this.F;
        streamConfig.c = athsVar.h;
        streamConfig.v = str2;
        streamConfig.u = str;
        streamConfig.j = athsVar;
        aA();
    }

    @Override // defpackage.acic
    public final void aj(int i) {
        acid acidVar = this.f166J;
        if (acidVar == null || !acidVar.at()) {
            return;
        }
        this.F.g = i;
        aZ();
    }

    @Override // defpackage.aclk
    public final void ak() {
        bi();
    }

    @Override // defpackage.aclk
    public final void al(String str, apzg apzgVar) {
        if (isDestroyed()) {
            return;
        }
        abxa.b().e = str;
        this.aA = true;
        StreamConfig streamConfig = this.F;
        streamConfig.c = str;
        streamConfig.k = apzgVar;
        aZ();
        this.U.post(this.W);
    }

    @Override // defpackage.aclk
    public final void am(avyp avypVar) {
        this.F.y = avypVar;
    }

    public final void ao(Choreographer.FrameCallback frameCallback) {
        this.s.postFrameCallback(frameCallback);
    }

    public final void ap(int i) {
        if (achk.e(this)) {
            aX();
        } else if (i > 0) {
            new Handler().postDelayed(new acgm(this, i), 200L);
        } else {
            zag.q(this, R.string.lc_error_screen_overlay_permission_required, 1);
            finish();
        }
    }

    public final void aq(long j) {
        ylx.n(this, this.E.a.b(new fcp(j, 8), anjk.a), zbx.j, zbx.n);
    }

    public final void ar(vxk vxkVar) {
        vxkVar.i(this);
    }

    public final void as() {
        ylx.o(this, this.E.a.b(aapz.m, anjk.a), zbx.k, zbx.o);
    }

    public final void at(abxa abxaVar, StreamConfig streamConfig) {
        abxaVar.g();
        if (streamConfig == null || streamConfig.a) {
            return;
        }
        abxaVar.e = streamConfig.c;
        abxaVar.f = this.u.j();
        abxaVar.g = bl(streamConfig.d);
        if (TextUtils.isEmpty(streamConfig.u) && TextUtils.isEmpty(streamConfig.v)) {
            return;
        }
        abxaVar.k = true != streamConfig.p ? 2 : 4;
    }

    public final void au() {
        boolean z;
        StreamConfig streamConfig;
        atgl atglVar;
        atgl atglVar2;
        StreamMetadata streamMetadata;
        StreamConfig streamConfig2 = this.F;
        boolean z2 = true;
        boolean z3 = (streamConfig2 == null || (streamMetadata = streamConfig2.d) == null || TextUtils.isEmpty(streamMetadata.a)) ? false : true;
        StreamConfig streamConfig3 = this.F;
        if (streamConfig3 != null && (atglVar2 = streamConfig3.i) != null) {
            arag aragVar = atglVar2.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            if (!TextUtils.isEmpty(ajgl.b(aragVar))) {
                z = true;
                if (!z3 && !z) {
                    z2 = false;
                }
                aqxo.p(z2);
                aW();
                StreamConfig streamConfig4 = this.F;
                acid n = acid.n(streamConfig4.i, streamConfig4.c, this.ay, this.aA, aP());
                this.f166J = n;
                this.aA = false;
                aB(n, "CHOOSE_THUMBNAIL_FRAGMENT");
                this.f166J.aL(q());
                streamConfig = this.F;
                if (streamConfig != null || (atglVar = streamConfig.i) == null || (atglVar.b & 524288) == 0) {
                    return;
                }
                y(atglVar.q);
                return;
            }
        }
        z = false;
        if (!z3) {
            z2 = false;
        }
        aqxo.p(z2);
        aW();
        StreamConfig streamConfig42 = this.F;
        acid n2 = acid.n(streamConfig42.i, streamConfig42.c, this.ay, this.aA, aP());
        this.f166J = n2;
        this.aA = false;
        aB(n2, "CHOOSE_THUMBNAIL_FRAGMENT");
        this.f166J.aL(q());
        streamConfig = this.F;
        if (streamConfig != null) {
        }
    }

    public final void av() {
        int i;
        int i2;
        String str = this.N;
        ackp ackpVar = new ackp();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_SERIALIZED_PARAMS", str);
        ackpVar.ae(bundle);
        this.H = ackpVar;
        StreamConfig streamConfig = this.F;
        int i3 = streamConfig.s;
        if (i3 == 0) {
            if (streamConfig.t == 0) {
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getRealSize(point);
                StreamConfig streamConfig2 = this.F;
                i2 = point.x;
                streamConfig2.s = i2;
                StreamConfig streamConfig3 = this.F;
                i = point.y;
                streamConfig3.t = i;
                this.ap.setLayoutParams(new RelativeLayout.LayoutParams(i2, i / 2));
                this.Q = new acnf(this.u.l(), this.u.e(), this.ap, this, this.Z, new abrw(0.8888888888888888d, this.u.h()));
                bh(false);
                aB(this.H, "PARTICIPANT_PRE_JOIN_FRAGMENT");
            }
            i3 = 0;
        }
        i = streamConfig.t;
        i2 = i3;
        this.ap.setLayoutParams(new RelativeLayout.LayoutParams(i2, i / 2));
        this.Q = new acnf(this.u.l(), this.u.e(), this.ap, this, this.Z, new abrw(0.8888888888888888d, this.u.h()));
        bh(false);
        aB(this.H, "PARTICIPANT_PRE_JOIN_FRAGMENT");
    }

    public final void aw() {
        if (!TextUtils.isEmpty(this.N)) {
            av();
        } else {
            ax();
        }
    }

    public final void ax() {
        LiveCreationActivity liveCreationActivity;
        String str;
        String str2;
        String str3;
        String d2 = this.k.c().d();
        StreamConfig streamConfig = this.F;
        streamConfig.b = d2;
        if (this.I == null) {
            if (TextUtils.isEmpty(streamConfig.c)) {
                boolean z = false;
                String str4 = null;
                if (getIntent() != null) {
                    str2 = getIntent().getStringExtra("android.intent.extra.SUBJECT");
                    String stringExtra = getIntent().getStringExtra("GAME_TITLE");
                    if (stringExtra != null) {
                        str4 = getString(R.string.lc_initial_video_title, new Object[]{stringExtra});
                    }
                    str3 = getIntent().getStringExtra("GAME_PACKAGE_NAME");
                    this.au = "SCREEN".equals(getIntent().getStringExtra("CAPTURE_MODE"));
                    if (getIntent().getAction() != null) {
                        z = getIntent().getAction().equals("com.google.android.youtube.intent.action.CREATE_LIVE_STREAM");
                    }
                } else {
                    str2 = null;
                    str3 = null;
                }
                int i = this.ay;
                boolean z2 = this.au;
                acll acllVar = new acll();
                Bundle bundle = new Bundle();
                bundle.putInt("ARG_CAMERA_COUNT", i);
                if (str4 != null) {
                    bundle.putString("ARG_TITLE", str4);
                }
                if (str2 != null) {
                    bundle.putString("ARG_DESCRIPTION", str2);
                }
                if (str3 != null) {
                    bundle.putString("ARG_GAME_PACKAGE_NAME", str3);
                }
                bundle.putBoolean("ARG_IS_SCREENCAST", z2);
                bundle.putBoolean("ARG_IS_LAUNCHED_FROM_INTENT", z);
                acllVar.ae(bundle);
                this.I = acllVar;
                liveCreationActivity = this;
                str = d2;
            } else {
                StreamConfig streamConfig2 = this.F;
                StreamMetadata streamMetadata = streamConfig2.d;
                String str5 = streamMetadata.a;
                String str6 = streamMetadata.b;
                int i2 = streamMetadata.m;
                int i3 = streamMetadata.l;
                Place place = streamMetadata.i;
                Boolean bool = streamMetadata.c;
                Boolean bool2 = streamMetadata.d;
                Boolean bool3 = streamMetadata.e;
                Boolean bool4 = streamMetadata.f;
                arpk arpkVar = streamMetadata.g;
                int i4 = this.ay;
                apzg apzgVar = streamConfig2.k;
                Date date = streamMetadata.j;
                arbt arbtVar = streamMetadata.k;
                acll acllVar2 = new acll();
                Bundle bundle2 = new Bundle();
                if (str5 != null) {
                    bundle2.putString("ARG_TITLE", str5);
                }
                if (str6 != null) {
                    bundle2.putString("ARG_DESCRIPTION", str6);
                }
                if (i2 != 0) {
                    bundle2.putInt("ARG_STREAM_PRIVACY", i2 - 1);
                }
                if (i3 != 0) {
                    bundle2.putInt("ARG_AUDIENCE_TYPE", i3 - 1);
                }
                if (place != null) {
                    bundle2.putParcelable("ARG_PLACE", place);
                }
                if (bool != null) {
                    bundle2.putBoolean("ARG_ENABLE_CHAT", bool.booleanValue());
                }
                if (bool2 != null) {
                    bundle2.putBoolean("ARG_ENABLE_SPONSORS_ONLY_LIVE_CHAT_MODE", bool2.booleanValue());
                }
                if (bool3 != null) {
                    bundle2.putBoolean("ARG_ENABLE_AGE_RESTRICTION", bool3.booleanValue());
                }
                if (bool4 != null) {
                    bundle2.putBoolean("ARG_IS_SCREENCAST", bool4.booleanValue());
                }
                if (arpkVar != null) {
                    bundle2.putParcelable("ARG_MONETIZATION_METADATA", new ParcelableMessageLite(arpkVar));
                }
                bundle2.putInt("ARG_CAMERA_COUNT", i4);
                if (apzgVar != null) {
                    bundle2.putParcelable("ARG_BROADCAST_CREATED_ENDPOINT", new ParcelableMessageLite(apzgVar));
                }
                if (date != null) {
                    bundle2.putSerializable("ARG_SCHEDULED_DATE", date);
                }
                if (arbtVar != null) {
                    bundle2.putParcelable("ARG_GAME_TITLE", new ParcelableMessageLite(arbtVar));
                }
                acllVar2.ae(bundle2);
                liveCreationActivity = this;
                liveCreationActivity.I = acllVar2;
                str = d2;
            }
            liveCreationActivity.az = str;
        } else {
            liveCreationActivity = this;
            str = d2;
        }
        if (!Objects.equals(liveCreationActivity.az, str)) {
            liveCreationActivity.az = str;
            aV();
        } else if (liveCreationActivity.I.ar()) {
            liveCreationActivity.I.q();
            liveCreationActivity.y(liveCreationActivity.I.aM());
        }
        liveCreationActivity.aB(liveCreationActivity.I, "PRE_STREAM_FRAGMENT");
        liveCreationActivity.I.aH(q());
    }

    final void ay(aqft aqftVar) {
        arag aragVar;
        arag aragVar2;
        Spanned b2;
        arag aragVar3;
        Spanned b3;
        int min;
        wix wixVar = new wix(this, aqftVar, this.j, new acgy(this), this);
        this.ad = wixVar;
        AlertDialog.Builder builder = new AlertDialog.Builder(wixVar.a);
        aqft aqftVar2 = wixVar.b;
        if ((aqftVar2.b & 1) != 0) {
            aragVar = aqftVar2.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        builder.setTitle(ajgl.b(aragVar));
        apok apokVar = wixVar.b.i;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = wixVar.b.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            arag aragVar4 = apojVar.i;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            b2 = ajgl.b(aragVar4);
        } else {
            aqft aqftVar3 = wixVar.b;
            if ((aqftVar3.b & 4194304) != 0) {
                aragVar2 = aqftVar3.q;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            b2 = ajgl.b(aragVar2);
        }
        apok apokVar3 = wixVar.b.h;
        if (apokVar3 == null) {
            apokVar3 = apok.a;
        }
        if ((apokVar3.b & 1) != 0) {
            apok apokVar4 = wixVar.b.h;
            if (apokVar4 == null) {
                apokVar4 = apok.a;
            }
            apoj apojVar2 = apokVar4.c;
            if (apojVar2 == null) {
                apojVar2 = apoj.a;
            }
            arag aragVar5 = apojVar2.i;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            b3 = ajgl.b(aragVar5);
        } else {
            aqft aqftVar4 = wixVar.b;
            if ((aqftVar4.b & 2097152) != 0) {
                aragVar3 = aqftVar4.p;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            b3 = ajgl.b(aragVar3);
        }
        builder.setPositiveButton(b3, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(b2, (DialogInterface.OnClickListener) null);
        View inflate = ((LayoutInflater) wixVar.a.getSystemService("layout_inflater")).inflate(R.layout.verification_dialog_body, (ViewGroup) null);
        wixVar.f = (YouTubeTextView) inflate.findViewById(R.id.message);
        wixVar.e = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        wixVar.f.setText(ajjh.j(wixVar.b, wixVar.c));
        builder.setView(inflate);
        wixVar.f.setMovementMethod(LinkMovementMethod.getInstance());
        wixVar.d = builder.create();
        wixVar.d.setOnShowListener(new wiw(wixVar));
        int i = 0;
        wixVar.d.setCancelable(false);
        wixVar.d.setCanceledOnTouchOutside(false);
        wixVar.d.show();
        if (zew.y(wixVar.a)) {
            min = ((ack) wixVar.a).a().getDimensionPixelSize(R.dimen.av_confirmation_dialog_height);
            i = ((ack) wixVar.a).a().getDimensionPixelSize(R.dimen.av_confirmation_dialog_width);
        } else {
            int l = zew.l(wixVar.a);
            int j = zew.j(wixVar.a);
            min = (int) (Math.min(l, j) * ((ack) wixVar.a).a().getFraction(R.fraction.av_dialog_height_ratio, 1, 1));
        }
        WindowManager.LayoutParams attributes = wixVar.d.getWindow().getAttributes();
        attributes.height = min;
        if (i == 0) {
            i = attributes.width;
        }
        attributes.width = i;
        wixVar.d.getWindow().setAttributes(attributes);
        this.m.n(new acte(acuo.b(31777)));
        this.m.n(new acte(acuo.b(31778)));
    }

    @Override // defpackage.acic
    public final void az(View view) {
        bh(true);
        this.Q.e(false);
        this.L.a(view);
    }

    @Override // defpackage.vxo
    public final void b() {
        aV();
    }

    @Override // defpackage.vxo
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.vxo
    public final void d() {
        aV();
    }

    @Override // defpackage.aaxu
    public final void e(boolean z) {
        this.ad.getClass();
        String string = getResources().getString(R.string.lc_error_generic);
        Toast.makeText(this, string, 0).show();
        zep.b(String.valueOf(string).concat(", accept live streaming terms of service request failed."));
        if (z) {
            wix wixVar = this.ad;
            wixVar.d.getClass();
            wixVar.g.setEnabled(true);
            wixVar.h.setEnabled(true);
            wixVar.e.a();
            return;
        }
        this.ad.a();
    }

    protected void g(ViewStub viewStub) {
    }

    @Override // defpackage.wjb
    public final void h() {
        finish();
    }

    @Override // defpackage.wjb
    public final void i() {
        Toast.makeText(this, getResources().getString(R.string.lc_error_generic), 0).show();
        finish();
    }

    @Override // defpackage.aaxu
    public final void j() {
        wix wixVar = this.ad;
        wixVar.getClass();
        wixVar.a();
    }

    @Override // defpackage.abwe
    public final abwf k() {
        acke ackeVar = this.ao;
        if (ackeVar == null || !ackeVar.at()) {
            return null;
        }
        return this.ao;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        StreamConfig streamConfig = this.F;
        bm(streamConfig.c, streamConfig.d.a, 2);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.abwi
    public final abwj l() {
        acke ackeVar = this.ao;
        if (ackeVar == null || !ackeVar.at()) {
            return null;
        }
        return this.ao;
    }

    @Override // defpackage.yze
    public final void lE(boolean z, int i) {
        acke ackeVar = this.ao;
        if (ackeVar == null || !ackeVar.ar()) {
            return;
        }
        this.ao.aJ(z, i);
        if (achk.c(this)) {
            return;
        }
        this.Q.f(getWindowManager().getDefaultDisplay().getRotation());
    }

    @Override // defpackage.yze
    public final void lF(boolean z, int i) {
        lE(z, i);
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        arwq arwqVar = (arwq) obj;
        int i = 0;
        if (arwqVar != null) {
            Iterator it = arwqVar.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                avfj avfjVar = ((arxk) it.next()).b;
                if (avfjVar == null) {
                    avfjVar = avfj.a;
                }
                avfk avfkVar = avfjVar.b;
                if (avfkVar == null) {
                    avfkVar = avfk.a;
                }
                auqh auqhVar = avfkVar.c;
                if (auqhVar == null) {
                    auqhVar = auqh.a;
                }
                if (auqhVar.d.size() != 0) {
                    for (auqk auqkVar : auqhVar.d) {
                        atfj atfjVar = auqkVar.H;
                        if (atfjVar == null) {
                            atfjVar = atfj.a;
                        }
                        if (atfjVar.b.size() != 0) {
                            for (atfk atfkVar : atfjVar.b) {
                                if ((atfkVar.b & 256) != 0) {
                                    atay atayVar = atfkVar.c;
                                    if (atayVar == null) {
                                        atayVar = atay.a;
                                    }
                                    if (atayVar.b != 1 || (i = awwc.bX(((Integer) atayVar.c).intValue())) == 0) {
                                        i = 1;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        if (i == 0) {
            StreamConfig streamConfig = this.F;
            bm(streamConfig.c, streamConfig.d.a, 2);
            return;
        }
        StreamConfig streamConfig2 = this.F;
        bm(streamConfig2.c, streamConfig2.d.a, i);
    }

    @Override // defpackage.abws
    public final void m(String str, atgl atglVar, Boolean bool) {
        this.i.c();
        StreamConfig streamConfig = this.F;
        atglVar.getClass();
        streamConfig.i = atglVar;
        if (!TextUtils.isEmpty(str)) {
            this.F.c = str;
        }
        StreamConfig streamConfig2 = this.F;
        if (streamConfig2.d == null) {
            streamConfig2.d = new StreamMetadata();
        }
        if ((atglVar.b & 16384) != 0) {
            StreamMetadata streamMetadata = this.F.d;
            arag aragVar = atglVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            streamMetadata.a = ajgl.b(aragVar).toString();
        }
        this.F.d.f = Boolean.valueOf(atglVar.q);
        if (bool != null) {
            this.F.p = bool.booleanValue();
        }
        aD();
    }

    @Override // defpackage.vxo
    public final void mB() {
        finish();
    }

    @Override // defpackage.abzl
    public final void n(aseg asegVar) {
        aunb aunbVar = asegVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aqtb aqtbVar = (aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer);
        ackq ackqVar = new ackq();
        Bundle bundle = new Bundle();
        if (aqtbVar != null) {
            aphq.m(bundle, "ARG_ENDSCREEN_RENDERER", aqtbVar);
        }
        ackqVar.ae(bundle);
        this.ag = ackqVar;
        aB(ackqVar, "POST_COSTREAM_FRAGMENT");
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            ap(10);
        } else if (i != 1000) {
        } else {
            if (i2 != -1 || intent == null) {
                this.at = false;
                return;
            }
            StreamConfig streamConfig = this.F;
            streamConfig.e = true;
            streamConfig.w = "LIVE_STREAM_FRAGMENT";
            aZ();
            afvn afvnVar = this.k;
            StreamConfig streamConfig2 = this.F;
            String str = streamConfig2.c;
            boolean z = streamConfig2.p;
            boolean z2 = streamConfig2.q;
            String str2 = streamConfig2.u;
            String str3 = streamConfig2.v;
            aths athsVar = streamConfig2.j;
            long j = streamConfig2.l;
            long j2 = streamConfig2.m;
            boolean z3 = streamConfig2.n && streamConfig2.o;
            boolean z4 = this.u.c().c;
            boolean z5 = this.u.c().b;
            asuw c2 = this.u.c();
            startService(ScreencastHostService.p(this, afvnVar, str, z, str2, str3, athsVar, j, j2, z3, z4, z5, c2 != null && c2.m, this.u.c().l, this.F.e, this.u.c().f, intent));
            if (this.au) {
                setResult(-1);
                finish();
                return;
            }
            finishAffinity();
            startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"));
        }
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        acll acllVar = (acll) this.G.f("PRE_STREAM_FRAGMENT");
        ackp ackpVar = (ackp) this.G.f("PARTICIPANT_PRE_JOIN_FRAGMENT");
        acid acidVar = (acid) this.G.f("CHOOSE_THUMBNAIL_FRAGMENT");
        ackt acktVar = (ackt) this.G.f("POST_STREAM_FRAGMENT");
        ackq ackqVar = (ackq) this.G.f("POST_COSTREAM_FRAGMENT");
        acio acioVar = (acio) this.G.f("ERROR_STATE_FRAGMENT");
        acke ackeVar = (acke) this.G.f("LIVE_STREAM_FRAGMENT");
        wiy wiyVar = (wiy) this.G.f("LIVE_ENABLEMENT_FRAGMENT_NAME");
        akea akeaVar = (akea) this.G.f("PERMISSION_REQUEST_FRAGMENT");
        acie acieVar = (acie) this.G.f("COOL_OFF_FRAGMENT_NAME");
        acln aclnVar = (acln) this.G.f("SAFEGUARD_FRAGMENT");
        if ((acktVar == null || !acktVar.at()) && (acioVar == null || !acioVar.at())) {
            if ((ackqVar == null || !ackqVar.at()) && (acioVar == null || !acioVar.at())) {
                if (acllVar == null || !acllVar.at()) {
                    if (ackpVar == null || !ackpVar.at()) {
                        acll acllVar2 = this.ah;
                        if (acllVar2 == null || !acllVar2.at()) {
                            acik acikVar = this.M;
                            if (acikVar == null || !acikVar.at()) {
                                if (acidVar == null || !acidVar.at()) {
                                    acid acidVar2 = this.al;
                                    if (acidVar2 == null || !acidVar2.at()) {
                                        aclr aclrVar = this.ai;
                                        if (aclrVar == null || !aclrVar.at()) {
                                            if (wiyVar == null || !wiyVar.at()) {
                                                if (ackeVar != null && ackeVar.at()) {
                                                    if (!ackeVar.aF) {
                                                        return;
                                                    }
                                                    ackeVar.aI();
                                                    return;
                                                } else if (akeaVar == null || !akeaVar.at()) {
                                                    if (acieVar == null || !acieVar.at()) {
                                                        if (aclnVar == null || !aclnVar.at()) {
                                                            if (this.S) {
                                                                finish();
                                                                return;
                                                            } else {
                                                                super.onBackPressed();
                                                                return;
                                                            }
                                                        }
                                                        aclnVar.d.A();
                                                        return;
                                                    }
                                                    aafo aafoVar = acieVar.a;
                                                    apzg apzgVar = acieVar.c.p;
                                                    if (apzgVar == null) {
                                                        apzgVar = apzg.a;
                                                    }
                                                    aafoVar.a(apzgVar);
                                                    return;
                                                } else {
                                                    akeaVar.s();
                                                    return;
                                                }
                                            }
                                            wiyVar.aG();
                                            return;
                                        }
                                        this.ai.q();
                                        return;
                                    }
                                    this.al.aH();
                                    return;
                                }
                                acidVar.aH();
                                return;
                            }
                            this.M.n();
                            return;
                        }
                        this.ah.s();
                        return;
                    }
                    ackpVar.q();
                    return;
                }
                acllVar.s();
                return;
            }
            finish();
            return;
        }
        finish();
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aF();
        this.o.l();
        wiy wiyVar = this.aj;
        if (wiyVar != null && wiyVar.at()) {
            this.aj.aH(configuration);
        }
        akea akeaVar = this.K;
        if (akeaVar == null || !akeaVar.at()) {
            return;
        }
        this.K.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        apzg apzgVar;
        byte[] byteArrayExtra;
        Intent intent;
        ParcelableMessageLite parcelableMessageLite;
        super.onCreate(bundle);
        if (this.u.k()) {
            this.T.add(new PermissionDescriptor(3, acuo.b(33982), acuo.b(33983)));
        }
        Bundle bundle2 = null;
        if (bundle != null) {
            apzgVar = null;
            bundle2 = bundle.getBundle("BUNDLE_INTERACTION_BUNDLE");
        } else {
            apzgVar = (achj.b(getIntent()) || (intent = getIntent()) == null || (parcelableMessageLite = (ParcelableMessageLite) intent.getParcelableExtra("navigation_endpoint")) == null) ? null : (apzg) parcelableMessageLite.a(apzg.a);
            if (apzgVar == null) {
                Intent intent2 = getIntent();
                if (intent2 != null && (byteArrayExtra = intent2.getByteArrayExtra("navigation_endpoint")) != null) {
                    try {
                        apzgVar = (apzg) aopi.parseFrom(apzg.a, byteArrayExtra, aoos.b());
                    } catch (aopx unused) {
                    }
                }
                apzgVar = null;
            }
        }
        ((acut) this.m).K(bundle2, apzgVar);
        if (apzgVar != null && apzgVar.qn(LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint)) {
            LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = (LiveCreationEndpointOuterClass$LiveCreationEndpoint) apzgVar.qm(LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint);
            if ((liveCreationEndpointOuterClass$LiveCreationEndpoint.b & 4) != 0) {
                this.N = liveCreationEndpointOuterClass$LiveCreationEndpoint.c;
                this.av = true;
            }
        }
        if (bundle != null) {
            this.F = (StreamConfig) bundle.getParcelable("BUNDLE_STREAM_CONFIG");
        }
        if (this.F == null) {
            this.F = new StreamConfig();
        }
        abxa b2 = abxa.b();
        if (this.u.c().j) {
            ScheduledExecutorService scheduledExecutorService = this.w;
            acrr acrrVar = this.x;
            snc sncVar = this.r;
            if (!b2.c) {
                b2.c = true;
                scheduledExecutorService.getClass();
                b2.a = scheduledExecutorService;
                acrrVar.getClass();
                b2.b = acrrVar;
                sncVar.getClass();
                b2.d = sncVar;
                synchronized (b2.i) {
                    for (Map.Entry entry : b2.i.entrySet()) {
                        b2.l((Class) entry.getKey(), (abwz) entry.getValue());
                    }
                }
            }
        }
        at(b2, this.F);
        b2.j(astm.class, 0L);
        b2.j(astq.class, 0L);
        b2.j(asto.class, 0L);
        b2.j(asth.class, 0L);
        this.P = false;
        setContentView(R.layout.lc_live_creation_activity);
        this.G = getSupportFragmentManager();
        this.Q = new acnf(this.u.l(), this.u.e(), (SurfaceView) findViewById(R.id.stream_view), this, this.Z, new abrw(true != this.u.c().i ? 1.3333333333333333d : 1.7777777777777777d, this.u.h()));
        this.k.getClass();
        this.p.getClass();
        g((ViewStub) findViewById(R.id.bottom_ui_container));
        this.L = (ViewportOverlay) findViewById(R.id.viewport_overlay);
        this.ap = (SurfaceView) findViewById(R.id.stream_view);
        this.ar = getString(R.string.lc_front_camera_accessibility_string);
        this.as = getString(R.string.lc_back_camera_accessibility_string);
        if (bundle != null) {
            this.aw = 1;
            this.i.b(bundle);
        } else {
            this.aw = 0;
        }
        this.i.a();
        this.ay = this.Q.b();
        ex l = this.G.l();
        if (bundle != null) {
            String str = this.F.w;
            acll acllVar = (acll) this.G.g(bundle, "prestream_fragment");
            this.I = acllVar;
            if (acllVar != null && !TextUtils.equals(str, "PRE_STREAM_FRAGMENT")) {
                l.l(this.I);
            }
            ackp ackpVar = (ackp) this.G.g(bundle, "participant_pre_join_fragment");
            this.H = ackpVar;
            if (ackpVar != null && !TextUtils.equals(str, "PARTICIPANT_PRE_JOIN_FRAGMENT")) {
                l.l(this.H);
            }
            acll acllVar2 = (acll) this.G.g(bundle, "edit_settings_fragment");
            this.ah = acllVar2;
            if (acllVar2 != null && !TextUtils.equals(str, "EDIT_SETTINGS_PRE_STREAM_FRAGMENT")) {
                l.l(this.ah);
            }
            wiy wiyVar = (wiy) this.G.g(bundle, "live_enablement_fragment");
            this.aj = wiyVar;
            if (wiyVar != null && !TextUtils.equals(str, "LIVE_ENABLEMENT_FRAGMENT_NAME")) {
                l.l(this.aj);
            }
            acid acidVar = (acid) this.G.g(bundle, "choose_thumbnail_fragment");
            this.f166J = acidVar;
            if (acidVar != null && !TextUtils.equals(str, "CHOOSE_THUMBNAIL_FRAGMENT")) {
                l.l(this.f166J);
            }
            acie acieVar = (acie) this.G.g(bundle, "cool_off_fragment");
            this.ak = acieVar;
            if (acieVar != null && !TextUtils.equals(str, "COOL_OFF_FRAGMENT_NAME")) {
                l.l(this.ak);
            }
            acik acikVar = (acik) this.G.g(bundle, "edit_thumbnail_fragment");
            this.M = acikVar;
            if (acikVar != null && !TextUtils.equals(str, "EDIT_THUMBNAIL_FRAGMENT_NAME")) {
                l.l(this.M);
            }
            acid acidVar2 = (acid) this.G.g(bundle, "confirm_thumbnail_fragment");
            this.al = acidVar2;
            if (acidVar2 != null && !TextUtils.equals(str, "CONFIRM_THUMBNAIL_FRAGMENT")) {
                l.l(this.al);
            }
            acke ackeVar = (acke) this.G.g(bundle, "livestream_fragment");
            this.ao = ackeVar;
            if (ackeVar != null && !TextUtils.equals(str, "LIVE_STREAM_FRAGMENT")) {
                l.l(this.ao);
            }
            ackt acktVar = (ackt) this.G.g(bundle, "poststream_fragment");
            this.af = acktVar;
            if (acktVar != null && !TextUtils.equals(str, "POST_STREAM_FRAGMENT")) {
                l.l(this.af);
            }
            ackq ackqVar = (ackq) this.G.g(bundle, "post_costream_fragment");
            this.ag = ackqVar;
            if (ackqVar != null && !TextUtils.equals(str, "POST_COSTREAM_FRAGMENT")) {
                l.l(this.ag);
            }
            acio acioVar = (acio) this.G.g(bundle, "errorstate_fragment");
            this.am = acioVar;
            if (acioVar != null && !TextUtils.equals(str, "ERROR_STATE_FRAGMENT")) {
                l.l(this.am);
            }
            akea akeaVar = (akea) this.G.g(bundle, "permission_request_fragment");
            this.K = akeaVar;
            if (akeaVar != null && (!TextUtils.equals(str, "PERMISSION_REQUEST_FRAGMENT") || !akdr.f(this, c))) {
                l.l(this.K);
            }
            acln aclnVar = (acln) this.G.g(bundle, "safeguard_fragment");
            this.an = aclnVar;
            if (aclnVar != null && !TextUtils.equals(str, "SAFEGUARD_FRAGMENT")) {
                l.l(this.an);
            }
            this.i.c();
            l.a();
            this.R = bundle.getBoolean("is_resume_dialog_displayed");
            Parcel obtain = Parcel.obtain();
            ((CameraStreamViewManager$CameraModelData) bundle.getParcelable("camera_model_bundle")).writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.ae = obtain;
        }
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    protected final void onDestroy() {
        acnf acnfVar = this.Q;
        if (acnfVar != null) {
            ylr.c();
            synchronized (acnfVar.q) {
                acnfVar.p = true;
                abtj abtjVar = acnfVar.m;
                if (abtjVar != null) {
                    abtjVar.e();
                }
            }
            acnfVar.d.f();
        }
        abss abssVar = this.Z;
        if (abssVar != null) {
            abssVar.f();
            abssVar.a.getLooper().quitSafely();
            this.Z = null;
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        super.onPause();
        yzf yzfVar = this.ac;
        if (yzfVar != null) {
            yzfVar.disable();
        }
        this.P = true;
        if (isFinishing()) {
            bi();
        }
    }

    @Override // defpackage.dt, defpackage.abp, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        zwn zwnVar = this.O;
        if (zwnVar != null) {
            zwnVar.b(i, strArr, iArr);
        } else {
            zep.b("No active FragmentPermissionRequester to handle PermissionsResult");
        }
        akdv akdvVar = this.aq;
        if (akdvVar == null || !akdvVar.b(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.i.b(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.P = false;
        aF();
        this.i.f = false;
        if (achk.b(this.I)) {
            y(this.I.aM());
        } else if (achk.b(this.ah)) {
            y(this.ah.aM());
        } else if (achk.b(this.f166J)) {
            y(this.f166J.aR());
        } else if (achk.b(this.al)) {
            y(this.al.aR());
        } else if (!achk.b(this.ao)) {
        } else {
            bh(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt
    public final void onResumeFragments() {
        super.onResumeFragments();
        this.o.f();
    }

    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.P = true;
        acie acieVar = this.ak;
        if (acieVar != null) {
            this.G.M(bundle, "cool_off_fragment", acieVar);
        } else {
            acln aclnVar = this.an;
            if (aclnVar == null || !aclnVar.at()) {
                acll acllVar = this.I;
                if (acllVar != null) {
                    this.G.M(bundle, "prestream_fragment", acllVar);
                }
            } else {
                this.G.M(bundle, "safeguard_fragment", this.an);
            }
        }
        ackp ackpVar = this.H;
        if (ackpVar != null && ackpVar.ap()) {
            this.G.M(bundle, "participant_pre_join_fragment", this.H);
        }
        acll acllVar2 = this.ah;
        if (acllVar2 != null) {
            this.G.M(bundle, "edit_settings_fragment", acllVar2);
        }
        wiy wiyVar = this.aj;
        if (wiyVar != null && wiyVar.ap()) {
            this.G.M(bundle, "live_enablement_fragment", this.aj);
        }
        acid acidVar = this.f166J;
        if (acidVar != null) {
            this.G.M(bundle, "choose_thumbnail_fragment", acidVar);
        }
        acid acidVar2 = this.al;
        if (acidVar2 != null && acidVar2.ap()) {
            this.G.M(bundle, "confirm_thumbnail_fragment", this.al);
        }
        acik acikVar = this.M;
        if (acikVar != null && acikVar.ap()) {
            this.G.M(bundle, "edit_thumbnail_fragment", this.M);
        }
        acke ackeVar = this.ao;
        if (ackeVar != null) {
            this.G.M(bundle, "livestream_fragment", ackeVar);
        }
        ackt acktVar = this.af;
        if (acktVar != null) {
            this.G.M(bundle, "poststream_fragment", acktVar);
        }
        ackq ackqVar = this.ag;
        if (ackqVar != null) {
            this.G.M(bundle, "post_costream_fragment", ackqVar);
        }
        acio acioVar = this.am;
        if (acioVar != null) {
            this.G.M(bundle, "errorstate_fragment", acioVar);
        }
        akea akeaVar = this.K;
        if (akeaVar != null) {
            this.G.M(bundle, "permission_request_fragment", akeaVar);
        }
        bundle.putParcelable("BUNDLE_STREAM_CONFIG", this.F);
        achh achhVar = this.i;
        bundle.putInt("stream_control_state", achhVar.e);
        bundle.putBoolean("enablement_complete", achhVar.a);
        bundle.putBoolean("thumbnail_chosen", achhVar.b);
        bundle.putBoolean("live_stream_complete", achhVar.d);
        achhVar.f = true;
        bundle.putBoolean("is_resume_dialog_displayed", this.R);
        bundle.putParcelable("camera_model_bundle", this.Q.n);
        bundle.putBundle("BUNDLE_INTERACTION_BUNDLE", ((acut) this.m).J());
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    protected final void onStart() {
        super.onStart();
        this.P = false;
        this.h.g(this.V);
        this.h.f(new abxc());
        if (this.k.t()) {
            w();
        } else {
            this.l.c(this, null, null);
        }
        if (bk(getIntent())) {
            this.ap.setVisibility(4);
        }
        achh achhVar = this.i;
        achhVar.c = achhVar.e;
        achhVar.a();
        acgw acgwVar = new acgw(this);
        this.ab = acgwVar;
        this.t.registerDisplayListener(acgwVar, this.f);
        this.aB = true;
        if (aH()) {
            ao(this.X);
        }
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    protected final void onStop() {
        long j;
        super.onStop();
        if (aQ() != null) {
            StreamConfig streamConfig = this.F;
            abyk abykVar = (abyk) aQ();
            if (abykVar.U) {
                j = abykVar.i.d() - abykVar.K;
            } else {
                j = abykVar.L;
            }
            streamConfig.m = j;
            aZ();
        }
        this.t.unregisterDisplayListener(this.ab);
        this.h.f(new acaz());
        this.h.m(this.V);
        this.o.e();
        CameraStreamViewManager$CameraModelData cameraStreamViewManager$CameraModelData = this.Q.n;
        Parcel obtain = Parcel.obtain();
        cameraStreamViewManager$CameraModelData.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        this.ae = obtain;
        bi();
        this.aw = 2;
        this.aB = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (achk.b(this.ao)) {
            acke ackeVar = this.ao;
            if (!z) {
                return;
            }
            ackeVar.aK(true);
        }
    }

    @Override // defpackage.ackg
    public final ArrayList r() {
        if (this.A.b.isEmpty()) {
            this.A.e(this.F.y);
        }
        return this.A.b;
    }

    public final void s(boolean z) {
        StreamConfig a2;
        if (this.u.i()) {
            this.g.execute(new acgl(this, 1));
            aY("");
            aq(0L);
            if (!z || (a2 = StreamConfig.a(this.E.b())) == null || TextUtils.isEmpty(a2.c)) {
                return;
            }
            this.q.e(a2.c, e);
            return;
        }
        this.g.execute(new achb(z, this, this.q, this.r, this.C));
    }

    public final void t() {
        ex l = this.G.l();
        for (dp dpVar : this.G.m()) {
            if (dpVar != null && dpVar.ap()) {
                l.l(dpVar);
            }
        }
        l.i = 4099;
        l.a();
    }

    @Override // defpackage.wjb
    public final void u() {
        bj(this.I, "PRE_STREAM_FRAGMENT", true);
        this.i.e();
        this.I.aF();
    }

    @Override // defpackage.acic
    public final void v(boolean z) {
        this.Q.e(true);
        this.L.a(null);
        if (z) {
            bi();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity.w():void");
    }

    @Override // defpackage.ackg
    public final void x(final zuk zukVar, final String str) {
        final acnf acnfVar = this.Q;
        final zsk i = this.A.i();
        final boolean z = this.F.p;
        abtj abtjVar = acnfVar.m;
        if (abtjVar != null) {
            abtjVar.j(acnfVar.c, zukVar, i, z, str);
        } else {
            acnfVar.d.a.post(new Runnable() { // from class: acmx
                @Override // java.lang.Runnable
                public final void run() {
                    acnf acnfVar2 = acnf.this;
                    zuk zukVar2 = zukVar;
                    zsk zskVar = i;
                    boolean z2 = z;
                    String str2 = str;
                    synchronized (acnfVar2.q) {
                        if (acnfVar2.p) {
                            return;
                        }
                        acnfVar2.m.j(acnfVar2.c, zukVar2, zskVar, z2, str2);
                    }
                }
            });
        }
    }

    @Override // defpackage.aclk
    public final void y(boolean z) {
        if (z) {
            bi();
        } else {
            bh(true);
        }
    }

    @Override // defpackage.acij
    public final void z() {
        acid acidVar = this.al;
        if (acidVar != null) {
            aB(acidVar, "CONFIRM_THUMBNAIL_FRAGMENT");
        } else {
            au();
        }
    }

    private final void bh(boolean z) {
        if (!this.ax) {
            if (this.aw == 0 || this.ae == null) {
                this.Q.d(null);
            } else {
                this.Q.d((CameraStreamViewManager$CameraModelData) CameraStreamViewManager$CameraModelData.CREATOR.createFromParcel(this.ae));
            }
            final acnf acnfVar = this.Q;
            ylr.c();
            acnfVar.e.b(z);
            acnfVar.l = new absx();
            acnfVar.d.b(acnfVar.e);
            acnfVar.d.b(acnfVar.l);
            if (acnfVar.a) {
                acnfVar.f.e = new abrs() { // from class: acmv
                    @Override // defpackage.abrs
                    public final void a(boolean z2) {
                        acnf acnfVar2 = acnf.this;
                        acnfVar2.o = z2;
                        absi absiVar = acnfVar2.i;
                        if (absiVar != null) {
                            boolean z3 = false;
                            if (!acnfVar2.b && z2) {
                                z3 = true;
                            }
                            absiVar.a = z3;
                        }
                        abtj abtjVar = acnfVar2.m;
                        if (abtjVar != null) {
                            abtjVar.c();
                        }
                    }
                };
            } else {
                aqxo.y(acnfVar.g == null);
                Activity activity = acnfVar.c;
                acnfVar.g = new absz();
                acnfVar.h = new abrz(acnfVar.g);
                acnfVar.d.l(acnfVar.g);
                absi absiVar = new absi(acnfVar.h);
                acnfVar.d.b(absiVar);
                acnfVar.j = new abrx(abtp.c(acnfVar.c, R.raw.copy_texture_frag));
                acnfVar.k = new abro(new acmz(acnfVar));
                acnfVar.f.e = new acna(acnfVar, absiVar);
            }
            this.Z.j();
            this.ap.setVisibility(0);
            Parcel parcel = this.ae;
            if (parcel != null) {
                parcel.recycle();
                this.ae = null;
            }
            this.ax = true;
        }
    }

    final String q() {
        String str;
        acnf acnfVar = this.Q;
        if (acnfVar == null) {
            return null;
        }
        int i = acnfVar.n.b;
        String str2 = "";
        if (i != -1) {
            Object[] objArr = new Object[1];
            objArr[0] = i == 1 ? this.ar : this.as;
            str = getString(R.string.lc_camera_facing_accessibility_string, objArr);
        } else {
            str = str2;
        }
        if (this.Q.b() > 2) {
            str2 = getString(R.string.lc_camera_id_accessibility_string, new Object[]{Integer.valueOf(this.Q.n.a)});
        }
        return getString(R.string.lc_stream_switch_camera_accessibility_string, new Object[]{str, str2});
    }
}
