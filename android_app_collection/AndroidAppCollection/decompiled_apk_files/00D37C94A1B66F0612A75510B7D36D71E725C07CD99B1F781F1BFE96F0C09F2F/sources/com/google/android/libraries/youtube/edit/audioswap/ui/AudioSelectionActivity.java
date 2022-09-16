package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSwapTabsBar;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioSelectionActivity extends zkj implements zko, zke, zjm, zjx, zkb {
    public eo a;
    public zjs b;
    public ViewPager c;
    public AudioSwapTabsBar d;
    public View e;
    public ProgressBar f;
    public View g;
    public acti h;
    public aath i;
    public aafo j;
    vrk k;
    public boolean l = false;
    private nj n;
    private Button o;
    private zjy p;
    private zjn q;

    private final void l(boolean z) {
        if (z) {
            this.n.o(R.string.upload_edit_audio_swap_audio_selection_title_loading);
        } else {
            this.n.o(R.string.upload_edit_audio_swap_audio_selection_title);
        }
    }

    @Override // defpackage.zjm
    public final zjn a() {
        if (this.q == null) {
            dp f = this.a.f("audio_library_service_audio_selection");
            if (!(f instanceof zjn)) {
                f = new zjn();
                ex l = this.a.l();
                l.r(f, "audio_library_service_audio_selection");
                l.i = 4097;
                l.a();
            }
            zjn zjnVar = (zjn) f;
            this.q = zjnVar;
            zjnVar.a = new zjl(this.i);
        }
        return this.q;
    }

    @Override // defpackage.zjx
    public final zjy b() {
        return this.p;
    }

    public final void c() {
        zjl zjlVar = a().a;
        final zjq zjqVar = new zjq(this);
        aatf f = zjlVar.a.f();
        f.i();
        f.t("FEaudio_tracks");
        ylx.n(this, zjlVar.a.h(f, anjk.a), new zdt() { // from class: zjj
            @Override // defpackage.zdt
            public final void a(Object obj) {
                Throwable th = (Throwable) obj;
                zjq.this.a();
            }
        }, new zdt() { // from class: zjg
            @Override // defpackage.zdt
            public final void a(Object obj) {
                zjk zjkVar;
                FeaturedTrackSelection featuredTrackSelection;
                Context context = this;
                zjq zjqVar2 = zjqVar;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (browseResponseModel == null || browseResponseModel.j()) {
                    zep.b("Browse response is empty!");
                    zjkVar = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    amuk g = browseResponseModel.g();
                    int size = g.size();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int i = 0; i < size; i++) {
                        aaky aakyVar = (aaky) g.get(i);
                        aakw a = aakyVar.a();
                        if (a != null) {
                            amuk a2 = a.a();
                            int size2 = a2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                Object obj2 = a2.get(i2);
                                if (obj2 instanceof aakq) {
                                    Iterator it = ((aakq) obj2).b().iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        Iterator it2 = it;
                                        if (next instanceof apiu) {
                                            avfo avfoVar = aakyVar.a;
                                            str2 = (avfoVar.b & 4) != 0 ? avfoVar.e : null;
                                            str2.getClass();
                                        }
                                        if (next instanceof apis) {
                                            avfo avfoVar2 = aakyVar.a;
                                            str3 = (avfoVar2.b & 4) != 0 ? avfoVar2.e : null;
                                            str3.getClass();
                                            arrayList2.add((apis) next);
                                        }
                                        if (next instanceof apiq) {
                                            avfo avfoVar3 = aakyVar.a;
                                            str = (avfoVar3.b & 4) != 0 ? avfoVar3.e : null;
                                            str.getClass();
                                            arrayList.add(zjl.a((apiq) next));
                                        }
                                        it = it2;
                                    }
                                }
                            }
                        }
                    }
                    zjkVar = new zjk();
                    if (str != null && !arrayList.isEmpty()) {
                        zjkVar.a = new FeaturedTrackSelection(str, arrayList, 0);
                    }
                    if (str3 != null && !arrayList2.isEmpty()) {
                        zjkVar.b = new CategorySelection(str3, arrayList2);
                    }
                    if (zfn.a(context, "android.permission.READ_EXTERNAL_STORAGE") && str2 != null) {
                        Cursor b = OnDeviceTrackSelection.b(context);
                        int i3 = 0;
                        while (b.moveToNext()) {
                            try {
                                if (OnDeviceTrackSelection.c(b)) {
                                    i3++;
                                }
                            } finally {
                                b.close();
                            }
                        }
                        if (i3 > 0) {
                            zjkVar.c = new OnDeviceTrackSelection(str2);
                        }
                    }
                }
                if (zjkVar == null || ((featuredTrackSelection = zjkVar.a) == null && zjkVar.b == null && zjkVar.c == null)) {
                    zjqVar2.a();
                    return;
                }
                CategorySelection categorySelection = zjkVar.b;
                OnDeviceTrackSelection onDeviceTrackSelection = zjkVar.c;
                AudioSelectionActivity audioSelectionActivity = zjqVar2.a;
                if (audioSelectionActivity.l) {
                    return;
                }
                audioSelectionActivity.b = new zjs(audioSelectionActivity.a, featuredTrackSelection, categorySelection, onDeviceTrackSelection);
                audioSelectionActivity.d.lb();
                for (int i4 = 0; i4 < audioSelectionActivity.b.j(); i4++) {
                    AudioSwapTabsBar audioSwapTabsBar = audioSelectionActivity.d;
                    CharSequence l = audioSelectionActivity.b.l(i4);
                    audioSwapTabsBar.p(l, l);
                }
                audioSelectionActivity.d.setVisibility(0);
                audioSelectionActivity.c.k(audioSelectionActivity.b);
                acti actiVar = audioSelectionActivity.h;
                if (actiVar != null && ((acsx) actiVar).i != null) {
                    for (int i5 = 0; i5 < audioSelectionActivity.b.j(); i5++) {
                        audioSelectionActivity.h.n(new acte(audioSelectionActivity.b.o(i5)));
                    }
                    audioSelectionActivity.d.k = new zjr(audioSelectionActivity);
                }
                zag.o(audioSelectionActivity.e, false);
                dp f2 = audioSelectionActivity.a.f("category_contents_fragment_tag");
                AudioSwapTabsBar audioSwapTabsBar2 = audioSelectionActivity.d;
                boolean z = f2 == null;
                zag.o(audioSwapTabsBar2, z);
                zag.o(audioSelectionActivity.c, z);
            }
        });
    }

    @Override // defpackage.zke
    public final void f(apis apisVar) {
        zkc zkcVar = new zkc();
        apzg apzgVar = apisVar.e;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        String str = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).d;
        str.getClass();
        zkcVar.af = str;
        zkcVar.ah = this;
        ex l = this.a.l();
        l.q(R.id.audio_swap_audio_selection_contents_view, zkcVar, "category_contents_fragment_tag");
        l.s();
        l.i = 4097;
        l.a();
    }

    @Override // defpackage.zkb
    public final void g() {
        zag.o(this.d, true);
        zag.o(this.c, true);
        l(false);
    }

    @Override // defpackage.zkb
    public final void h() {
        l(true);
        zag.o(this.d, false);
        zag.o(this.c, false);
    }

    @Override // defpackage.zko
    public final void i(Track track) {
        acti actiVar = this.h;
        if (actiVar != null && ((acsx) actiVar).i != null) {
            actiVar.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_SELECT_BUTTON), null);
        }
        track.getClass();
        Uri uri = track.d;
        String scheme = uri.getScheme();
        if ((scheme != null && !scheme.equals("content")) || vrk.b(this.k.d(uri))) {
            setResult(-1, new Intent().putExtra("audio_track", track));
            finish();
            return;
        }
        zag.q(this, R.string.upload_edit_audio_swap_loading_error_text, 0);
    }

    public final void j() {
        this.e.setVisibility(0);
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.c.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.audio_swap_audio_selection);
        this.a = getSupportFragmentManager();
        View findViewById = findViewById(R.id.audio_swap_loading_view);
        this.e = findViewById;
        this.g = findViewById.findViewById(R.id.audio_swap_error_indicator);
        this.f = (ProgressBar) this.e.findViewById(R.id.audio_swap_loading_indicator);
        this.c = (ViewPager) findViewById(R.id.audio_swap_audio_selection_view_pager);
        AudioSwapTabsBar audioSwapTabsBar = (AudioSwapTabsBar) findViewById(R.id.audio_swap_audio_selection_tabs_bar);
        this.d = audioSwapTabsBar;
        ViewPager viewPager = this.c;
        audioSwapTabsBar.a = viewPager;
        viewPager.p(audioSwapTabsBar);
        Button button = (Button) this.e.findViewById(R.id.audio_swap_retry_button);
        this.o = button;
        button.setOnClickListener(new zjp(this));
        nj supportActionBar = getSupportActionBar();
        supportActionBar.getClass();
        this.n = supportActionBar;
        supportActionBar.C();
        this.n.j(true);
        this.n.A();
        l(false);
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        String stringExtra = getIntent().getStringExtra("parent_csn");
        aopa createBuilder = atnp.a.createBuilder();
        int intExtra = getIntent().getIntExtra("parent_ve_type", 0);
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = intExtra;
        if (stringExtra != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b = 1 | atnpVar2.b;
            atnpVar2.c = stringExtra;
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        this.h.d(acuo.a(9729), (apzg) aopcVar.mo39build(), null);
        this.h.n(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_SELECT_BUTTON));
        this.k = new vrk(this);
        j();
        c();
        Intent intent = getIntent();
        this.p = new zjy(this, this.h, intent.getBooleanExtra("extractor_sample_source", false));
        if (intent.getBooleanExtra("sunset_banner_enabled", false)) {
            findViewById(R.id.audio_sunset_container).setVisibility(0);
            final acte acteVar = new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_DEPRECATED_LEARN_MORE);
            this.h.n(acteVar);
            findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: zjo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AudioSelectionActivity audioSelectionActivity = AudioSelectionActivity.this;
                    audioSelectionActivity.h.H(3, acteVar, null);
                    aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                    aopg aopgVar = ApplicationHelpEndpointOuterClass.applicationHelpEndpoint;
                    aopa createBuilder2 = aphv.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aphv aphvVar = (aphv) createBuilder2.instance;
                    aphvVar.b |= 2;
                    aphvVar.c = "yt_android_upload_audio_swap_LML";
                    aopcVar2.e(aopgVar, (aphv) createBuilder2.mo39build());
                    audioSelectionActivity.j.c((apzg) aopcVar2.mo39build(), null);
                }
            });
        }
        dp f = this.a.f("category_contents_fragment_tag");
        if (f instanceof zkc) {
            ((zkc) f).ah = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        zjy zjyVar = this.p;
        otb otbVar = zjyVar.b;
        if (otbVar != null) {
            otbVar.h();
        }
        zjyVar.b = null;
        this.p = null;
        super.onDestroy();
        this.l = true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.a.a() > 0) {
                this.a.L();
                return true;
            }
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public final void onPause() {
        this.p.a(false);
        super.onPause();
    }
}
