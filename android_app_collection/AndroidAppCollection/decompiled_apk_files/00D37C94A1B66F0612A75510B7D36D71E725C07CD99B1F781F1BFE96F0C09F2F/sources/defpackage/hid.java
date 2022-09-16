package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
/* compiled from: PG */
/* renamed from: hid  reason: default package */
/* loaded from: classes3.dex */
public final class hid extends hia implements hig {
    public Context a;
    public hkl ae;
    public akho af;
    public hin ag;
    public TextView ah;
    public boolean ai;
    public MusicSearchResultsController b;
    public SfvAudioItemPlaybackController c;
    public acth d;
    public MusicSearchSuggestionsController e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, ajsa] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        int i;
        ajzq ajzqVar;
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            zep.b("No args found for MusicSearchFragment, pass the command in the args.");
            return;
        }
        byte[] byteArray = bundle2.getByteArray("SfvMusicSearchFragmentCommandKey");
        if (byteArray == null) {
            zep.b("No search command found.");
            return;
        }
        apzg c = aafr.c(byteArray);
        this.d.oi().e(acuo.a(100355), acuc.DEFAULT, c, acty.a(c, askh.b), acty.a(c, askh.a));
        this.d.oi().n(new acte(actj.MOBILE_BACK_BUTTON));
        this.c.j();
        this.X.c(this.c);
        if (this.ae.e()) {
            ((TextView) view.findViewById(R.id.music_search_title)).setText(R.string.sounds_search_page_title);
        } else {
            ((TextView) view.findViewById(R.id.music_search_title)).setText(R.string.music_search_page_title);
        }
        view.findViewById(R.id.music_search_exit).setOnClickListener(new View.OnClickListener() { // from class: hib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hid.this.p(true);
            }
        });
        ((LoadingFrameLayout) view.findViewById(R.id.music_search_loading_frame_layout)).h("");
        MusicSearchResultsController musicSearchResultsController = this.b;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.music_search_contents_container);
        musicSearchResultsController.r = (LoadingFrameLayout) frameLayout.findViewById(R.id.music_search_loading_frame_layout);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.music_search_content_recycler_view);
        musicSearchResultsController.u = recyclerView;
        musicSearchResultsController.v = (RecyclerView) frameLayout.findViewById(R.id.music_search_suggestions_recycler_view);
        aqxo.p(recyclerView != null);
        Context context = musicSearchResultsController.s;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(1);
        recyclerView.ag(linearLayoutManager);
        akaq a = musicSearchResultsController.d.a(musicSearchResultsController.j, musicSearchResultsController.f.oi());
        auuw auuwVar = musicSearchResultsController.h.a().z;
        if (auuwVar == null) {
            auuwVar = auuw.a;
        }
        if (auuwVar.u) {
            gew gewVar = musicSearchResultsController.n;
            ajpa ajpaVar = musicSearchResultsController.o;
            abcx abcxVar = musicSearchResultsController.j;
            acti oi = musicSearchResultsController.f.oi();
            ?? r18 = musicSearchResultsController.g.get();
            akai akaiVar = akai.Ws;
            ajzs ajzsVar = ajzs.d;
            ajkb ajkbVar = ajkb.SHORTS;
            tdu tduVar = musicSearchResultsController.p;
            Context context2 = musicSearchResultsController.s;
            i = R.id.music_search_suggestions_recycler_view;
            ajzqVar = gewVar.a(null, ajpaVar, recyclerView, abcxVar, a, oi, r18, akaiVar, ajzsVar, ajkbVar, tduVar, context2);
        } else {
            i = R.id.music_search_suggestions_recycler_view;
            ajzqVar = new ajzq(null, recyclerView, musicSearchResultsController.a, musicSearchResultsController.b, musicSearchResultsController.j, musicSearchResultsController.c, a, musicSearchResultsController.e, musicSearchResultsController.f.oi(), musicSearchResultsController.g.get(), akai.Ws, ajzs.d, musicSearchResultsController.h, musicSearchResultsController.i);
        }
        musicSearchResultsController.q = ajzqVar;
        this.b.t = c;
        auuw auuwVar2 = this.ae.a.a().z;
        if (auuwVar2 == null) {
            auuwVar2 = auuw.a;
        }
        boolean z = auuwVar2.r;
        this.ai = z;
        if (z) {
            final MusicSearchSuggestionsController musicSearchSuggestionsController = this.e;
            FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.music_search_contents_container);
            musicSearchSuggestionsController.p = (LoadingFrameLayout) frameLayout2.findViewById(R.id.music_search_loading_frame_layout);
            musicSearchSuggestionsController.q = (RecyclerView) frameLayout2.findViewById(i);
            musicSearchSuggestionsController.r = (RecyclerView) frameLayout2.findViewById(R.id.music_search_content_recycler_view);
            aqxo.p(musicSearchSuggestionsController.q != null);
            Activity activity = musicSearchSuggestionsController.l;
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager();
            linearLayoutManager2.ab(1);
            musicSearchSuggestionsController.q.ag(linearLayoutManager2);
            musicSearchSuggestionsController.q.aE(musicSearchSuggestionsController.s);
            musicSearchSuggestionsController.m = new ajzq(null, musicSearchSuggestionsController.q, musicSearchSuggestionsController.a, musicSearchSuggestionsController.b, aari.n, musicSearchSuggestionsController.c, musicSearchSuggestionsController.d.a(aari.n, musicSearchSuggestionsController.f.oi()), musicSearchSuggestionsController.e, musicSearchSuggestionsController.f.oi(), musicSearchSuggestionsController.g.get(), akai.Ws, ajzs.d, musicSearchSuggestionsController.h, musicSearchSuggestionsController.i);
            musicSearchSuggestionsController.n = musicSearchSuggestionsController.k.a(musicSearchSuggestionsController.j);
            musicSearchSuggestionsController.o = musicSearchSuggestionsController.n.a().as(new ayqb() { // from class: hih
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    MusicSearchSuggestionsController musicSearchSuggestionsController2 = MusicSearchSuggestionsController.this;
                    aksu aksuVar = (aksu) obj;
                    if (musicSearchSuggestionsController2.m == null || musicSearchSuggestionsController2.p == null) {
                        return;
                    }
                    musicSearchSuggestionsController2.f.oi().n(new acte(aksuVar.a.d));
                    musicSearchSuggestionsController2.p.a();
                    musicSearchSuggestionsController2.q.setVisibility(0);
                    musicSearchSuggestionsController2.r.setVisibility(8);
                    musicSearchSuggestionsController2.m.K(aksuVar.a());
                }
            });
            MusicSearchSuggestionsController musicSearchSuggestionsController2 = this.e;
            if (c.qn(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) && (((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) c.qm(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).b & 2) != 0) {
                musicSearchSuggestionsController2.j.c = ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) c.qm(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).d;
            }
            this.b.w = this.ai;
        }
        hin hinVar = new hin(this.a, (ViewGroup) view.findViewById(R.id.search_input_container));
        this.ag = hinVar;
        hinVar.c = new hic(this);
        this.af.g();
        this.af.d();
        hin hinVar2 = this.ag;
        hinVar2.a.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) hinVar2.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(hinVar2.a, 1);
        }
        this.ah = (TextView) view.findViewById(R.id.search_input_text);
    }

    @Override // defpackage.dp
    public final void mR() {
        if (mJ() != null) {
            zag.h(mJ());
        }
        super.mR();
        this.ag.c = null;
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(this.a).inflate(R.layout.music_search_fragment, viewGroup, false);
    }

    @Override // defpackage.hig
    public final void o(String str) {
        hin hinVar = this.ag;
        hinVar.a.setText(str);
        zag.j(hinVar.a);
        zag.p(hinVar.a);
    }

    public final void p(boolean z) {
        eo supportFragmentManager = mJ().getSupportFragmentManager();
        supportFragmentManager.L();
        this.d.oi().H(3, new acte(actj.MOBILE_BACK_BUTTON), null);
        this.d.oi().t();
        if (z && supportFragmentManager.f("ReelBrowseFragmentTag") != null) {
            supportFragmentManager.L();
        }
        supportFragmentManager.ab();
    }

    public final void q(String str) {
        ampq ampqVar;
        aksj aksjVar;
        this.c.j();
        if (this.ai && (aksjVar = this.e.n) != null) {
            aksjVar.b();
        }
        final MusicSearchResultsController musicSearchResultsController = this.b;
        LoadingFrameLayout loadingFrameLayout = musicSearchResultsController.r;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.c();
        }
        RecyclerView recyclerView = musicSearchResultsController.v;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        abcv d = musicSearchResultsController.j.d();
        d.a = abcv.g(str);
        apzg apzgVar = musicSearchResultsController.t;
        if (apzgVar != null) {
            d.j(apzgVar.c);
        } else {
            d.j(aoob.b);
        }
        if (musicSearchResultsController.w) {
            d.d = musicSearchResultsController.m.a("youtube-sfv");
        }
        apzg apzgVar2 = musicSearchResultsController.t;
        if (apzgVar2 == null || !apzgVar2.qn(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand) || ((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apzgVar2.qm(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c.isEmpty()) {
            ampqVar = amon.a;
        } else {
            ampqVar = ampq.j(((SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand) apzgVar2.qm(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand)).c);
        }
        if (ampqVar.h()) {
            d.c = (String) ampqVar.c();
        }
        ylx.k(musicSearchResultsController.j.a.g(d, musicSearchResultsController.k), musicSearchResultsController.l, new ylv() { // from class: hie
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                LoadingFrameLayout loadingFrameLayout2 = MusicSearchResultsController.this.r;
                if (loadingFrameLayout2 == null) {
                    return;
                }
                loadingFrameLayout2.b(th.getLocalizedMessage(), true);
            }
        }, new ylw() { // from class: hif
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                MusicSearchResultsController musicSearchResultsController2 = MusicSearchResultsController.this;
                SearchResponseModel searchResponseModel = (SearchResponseModel) obj;
                if (musicSearchResultsController2.q == null || musicSearchResultsController2.r == null) {
                    return;
                }
                RecyclerView recyclerView2 = musicSearchResultsController2.v;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                RecyclerView recyclerView3 = musicSearchResultsController2.u;
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(0);
                }
                musicSearchResultsController2.f.oi().D(new acte(searchResponseModel.d()));
                musicSearchResultsController2.r.a();
                musicSearchResultsController2.q.K(searchResponseModel.e());
            }
        });
    }
}
