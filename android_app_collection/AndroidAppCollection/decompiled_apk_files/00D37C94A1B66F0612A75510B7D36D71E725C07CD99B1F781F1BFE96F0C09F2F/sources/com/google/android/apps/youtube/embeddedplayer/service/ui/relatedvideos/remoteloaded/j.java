package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.BusSupported$Data;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideoItem;
import com.google.android.apps.youtube.embeddedplayer.service.model.RelatedVideosScreen;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j extends ahyf implements com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c {
    public final aypg a;
    public boolean b;
    private FrameLayout c;
    private RecyclerView d;
    private GridLayoutManager e;
    private TextView f;
    private final AtomicBoolean g;
    private WeakReference h;
    private i i;
    private RelatedVideosScreen j;
    private com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d k;
    private boolean l;
    private com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e m;

    public j(Context context) {
        super(context);
        this.g = new AtomicBoolean(false);
        this.a = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ae(azpj.c()).X(aypa.a()).as(new ayqb() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.b
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                j.this.b = ((aqtp) obj).m;
            }
        });
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.c = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.b) {
            try {
                from.inflate(R.layout.relateds_overlay, this.c);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Unable to inflate LazyRelatedVideosOverlay: ");
                sb.append(valueOf);
                aqvb.k(sb.toString(), new Object[0]);
                return this.c;
            }
        } else {
            from.inflate(R.layout.relateds_overlay, this.c);
        }
        this.l = true;
        this.e = new GridLayoutManager(1);
        this.d = new RecyclerView(context);
        d dVar = new d(this.e, this.g);
        this.d.ag(this.e);
        this.d.aE(dVar);
        this.d.aC(new c());
        zgd.u(this.d, new ecp(20), zgd.b(zgd.s(-1, -1), zgd.m(0, 0, 0, 8)), ViewGroup.MarginLayoutParams.class);
        ((FixedAspectRatioRelativeLayout) this.c.findViewById(R.id.related_video_fixed_aspect_ratio_layout)).addView(this.d);
        this.f = (TextView) this.c.findViewById(R.id.related_overlay_title);
        this.c.findViewById(R.id.exit_related_page_button).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.remoteloaded.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.this.kT();
            }
        });
        this.c.setOnClickListener(ija.h);
        return this.c;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void b(BusSupported$Data busSupported$Data) {
        if (!busSupported$Data.d().equals(com.google.android.apps.youtube.embeddedplayer.service.model.b.RELATED_VIDEOS_SCREEN)) {
            return;
        }
        RelatedVideosScreen relatedVideosScreen = (RelatedVideosScreen) busSupported$Data;
        amuk amukVar = relatedVideosScreen.c;
        if (amukVar == null || relatedVideosScreen.equals(RelatedVideosScreen.a) || amukVar.isEmpty() || ((RelatedVideoItem) amukVar.get(0)).equals(RelatedVideoItem.a)) {
            this.j = null;
            kT();
        } else {
            this.j = relatedVideosScreen;
            kU();
        }
        X();
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        if (!nI()) {
            return;
        }
        if (this.i == null) {
            i iVar = new i(this.b, this.m, this.h, this.k, this.g);
            this.i = iVar;
            this.d.ad(iVar);
        }
        RelatedVideosScreen relatedVideosScreen = this.j;
        if (relatedVideosScreen == null) {
            return;
        }
        this.f.setText(relatedVideosScreen.b);
        i iVar2 = this.i;
        iVar2.d = relatedVideosScreen.c;
        iVar2.e.set(false);
        iVar2.mr();
        this.e.Z(0);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.databus.remoteloaded.c
    public final void e() {
    }

    public final void g(com.google.android.apps.youtube.embeddedplayer.service.imageclient.shared.e eVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar, com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar) {
        this.h = new WeakReference(cVar);
        this.m = eVar;
        this.k = dVar;
    }

    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        kS.b();
        kS.a();
        return kS;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.j != null;
    }

    @Override // defpackage.ahyf, defpackage.ahyh
    public final boolean nI() {
        return this.l && super.nI();
    }
}
