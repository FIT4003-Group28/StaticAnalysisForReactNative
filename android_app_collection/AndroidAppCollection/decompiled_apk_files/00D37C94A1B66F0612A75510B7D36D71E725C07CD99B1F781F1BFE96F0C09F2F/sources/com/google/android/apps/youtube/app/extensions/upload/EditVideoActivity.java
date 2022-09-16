package com.google.android.apps.youtube.app.extensions.upload;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.libraries.youtube.edit.ui.ViewAnimatorHelper;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EditVideoActivity extends ijm implements ynl {
    private ViewAnimatorHelper S;
    private LoadingFrameLayout T;
    private afrm U;
    private byte[] V;
    public fud g;
    public aafo h;
    public afvn i;
    public aaqp j;
    public afre k;
    public aazu l;
    public fvf m;
    public akbn n;
    public akys o;
    public ijc p;
    public iix q;
    public akge r;
    public String s;
    public arwq t;
    public boolean u;
    public fvl v;
    public ijj w;

    private final void C() {
        fvl fvlVar = this.v;
        if (fvlVar != null) {
            this.m.f(fvlVar);
            this.g.c(true);
        }
    }

    private final void D() {
        ex l = getSupportFragmentManager().l();
        l.m(this.U);
        l.a();
        getSupportFragmentManager().ab();
        E();
    }

    private final void E() {
        setSupportActionBar(this.q.c);
        this.w = new ijj(this);
        mC().c(amuk.r(this.w));
        nj supportActionBar = getSupportActionBar();
        supportActionBar.o(R.string.edit_video_form_title);
        supportActionBar.j(true);
        supportActionBar.m(akf.a(this, 2131233316));
        supportActionBar.A();
        this.N.d(this.q.c, findViewById(R.id.recycler_view), findViewById(R.id.element_fragment));
        this.w.b(this.O);
    }

    @Override // defpackage.iiy
    public final void g(aqsi aqsiVar) {
        arag aragVar;
        ijc ijcVar = this.p;
        eo supportFragmentManager = getSupportFragmentManager();
        nj supportActionBar = getSupportActionBar();
        frw mC = mC();
        akbn akbnVar = this.n;
        aafo aafoVar = this.h;
        ijcVar.c = supportFragmentManager;
        ijcVar.d = akbnVar;
        aunb aunbVar = aqsiVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ijcVar.b = (atat) aunbVar.qm(atau.a);
        atat atatVar = ijcVar.b;
        if ((atatVar.b & 256) != 0) {
            aragVar = atatVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        supportActionBar.p(ajgl.b(aragVar));
        mC.c(amuk.r(new ijb(ijcVar)));
        ajmy ajmyVar = ijcVar.a;
        afrm afrmVar = new afrm();
        afrmVar.b = aqsiVar;
        afrmVar.c = ajmyVar;
        afrmVar.e = aafoVar;
        afrmVar.d = supportActionBar;
        ex l = supportFragmentManager.l();
        l.u(R.id.edit_thumbnails_fragment, afrmVar, "edit_thumbnails_fragment");
        l.x();
        l.a();
        supportFragmentManager.ab();
        this.U = afrmVar;
    }

    @Override // defpackage.ems
    protected final void h(gfs gfsVar) {
        if (gfsVar == gfs.DARK) {
            setTheme(2132083895);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                finish();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.ike
    public final int l() {
        return R.id.recycler_view;
    }

    @Override // defpackage.ike
    public final View m() {
        return this.q.c;
    }

    @Override // defpackage.ike
    public final ViewAnimatorHelper n() {
        return this.S;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.edit_activity);
        this.q.a(this);
        E();
        if (bundle != null && bundle.getByteArray("get_metadata_editor_response_key") != null) {
            arwq arwqVar = (arwq) this.j.a(bundle.getByteArray("get_metadata_editor_response_key"), arwq.a);
            this.t = arwqVar;
            if (arwqVar == null) {
                throw new RuntimeException("Failed to parse a known parcelable proto");
            }
        }
        this.r.g(findViewById(16908290));
        this.S = (ViewAnimatorHelper) findViewById(R.id.view_animator);
        this.T = (LoadingFrameLayout) findViewById(R.id.edit_activity_layout);
        this.g.d((BottomUiContainer) findViewById(R.id.bottom_ui_container));
        oi().d(acuo.a(49953), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ike, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.u = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ike, defpackage.dt, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.A.m(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.i.t()) {
            finish();
        } else {
            this.A.g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abp, defpackage.gb, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        arwq arwqVar = this.t;
        if (arwqVar != null) {
            bundle.putByteArray("get_metadata_editor_response_key", arwqVar.toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.i.t()) {
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!"android.intent.action.EDIT".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            zep.b(valueOf.length() != 0 ? "Unsupported action: ".concat(valueOf) : new String("Unsupported action: "));
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("video_id");
        this.s = stringExtra;
        if (stringExtra == null) {
            zep.b("VideoId not provided.");
            finish();
            return;
        }
        this.V = intent.getByteArrayExtra("click_tracking_params");
        if (this.t == null) {
            zgh.m(this.s);
            this.T.a();
            this.T.c();
            if (!A() || !akdr.g(this)) {
                r(null);
                return;
            } else {
                this.k.b(new afrd() { // from class: ije
                    @Override // defpackage.afrd
                    public final void a(asvk asvkVar) {
                        EditVideoActivity.this.r(asvkVar);
                    }
                });
                return;
            }
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        C();
    }

    @Override // defpackage.ike
    public final ampq p() {
        return amon.a;
    }

    public final void q() {
        if (this.u) {
            return;
        }
        zag.q(this, R.string.edit_video_done, 0);
        Intent intent = new Intent();
        intent.putExtra("refresh_my_videos", true);
        setResult(-1, intent);
        finish();
    }

    public final void r(asvk asvkVar) {
        aopa createBuilder = arwp.a.createBuilder();
        String str = this.s;
        createBuilder.copyOnWrite();
        arwp arwpVar = (arwp) createBuilder.instance;
        str.getClass();
        arwpVar.b |= 2;
        arwpVar.d = str;
        if (asvkVar != null) {
            createBuilder.copyOnWrite();
            arwp arwpVar2 = (arwp) createBuilder.instance;
            arwpVar2.e = asvkVar;
            arwpVar2.b |= 4;
        }
        this.l.a(createBuilder, new ijg(this), this.V);
    }

    @Override // defpackage.ike
    public final void s() {
        ijj ijjVar = this.w;
        if (ijjVar != null) {
            boolean z = false;
            if (this.O && !this.P) {
                z = true;
            }
            ijjVar.b(z);
        }
    }

    public final void t() {
        ylr.c();
        arwq arwqVar = this.t;
        arwqVar.getClass();
        if ((arwqVar.b & 512) != 0) {
            ((acsx) oi()).D(new acte(this.t.g));
        }
        arwq arwqVar2 = this.t;
        ylr.c();
        Iterator it = arwqVar2.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arxk arxkVar = (arxk) it.next();
            avfj avfjVar = arxkVar.b;
            if (avfjVar == null) {
                avfjVar = avfj.a;
            }
            avfk avfkVar = avfjVar.b;
            if (avfkVar == null) {
                avfkVar = avfk.a;
            }
            if ((avfkVar.b & 1) != 0) {
                avfj avfjVar2 = arxkVar.b;
                if (avfjVar2 == null) {
                    avfjVar2 = avfj.a;
                }
                avfk avfkVar2 = avfjVar2.b;
                if (avfkVar2 == null) {
                    avfkVar2 = avfk.a;
                }
                auqh auqhVar = avfkVar2.c;
                if (auqhVar == null) {
                    auqhVar = auqh.a;
                }
                aakw aakwVar = new aakw(auqhVar);
                arxj arxjVar = arwqVar2.e;
                if (arxjVar == null) {
                    arxjVar = arxj.a;
                }
                y(aakwVar, arxjVar);
                this.S.b(R.id.recycler_view);
            }
        }
        this.T.a();
    }

    @Override // defpackage.ike
    public final void u(aopa aopaVar) {
        this.w.b(false);
        C();
        this.l.b(aopaVar, new ijh(this, aopaVar), null);
    }

    @Override // defpackage.ems
    public final void j() {
        afrm afrmVar = this.U;
        if (afrmVar == null || !afrmVar.ap()) {
            super.onBackPressed();
        } else {
            D();
        }
    }

    @Override // defpackage.ike, defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        afrm afrmVar = this.U;
        if (afrmVar == null || !afrmVar.ap()) {
            super.onBackPressed();
        } else {
            D();
        }
    }
}
