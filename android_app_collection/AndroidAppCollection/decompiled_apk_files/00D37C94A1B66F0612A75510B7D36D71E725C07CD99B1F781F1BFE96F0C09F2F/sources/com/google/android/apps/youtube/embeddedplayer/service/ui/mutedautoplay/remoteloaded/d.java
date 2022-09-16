package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.ui.preview.remoteloaded.n;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends ahyf {
    public TouchImageView a;
    public RelativeLayout b;
    public final aypf c;
    public final View.OnClickListener d;
    public Handler e;
    public SelectableItemKey f;
    public SelectableItemKey g;
    public SelectableItemKey h;
    public WeakReference i;
    public long j;
    public int k;
    public MutedAutoplayState l;
    public int m;
    public boolean n;
    private MutedAutoplayIndicator o;
    private TextView p;
    private n q;
    private FrameLayout r;
    private boolean s;
    private final aypg t;

    public d(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.c = new aypf();
        this.d = onClickListener;
        this.t = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ae(azpj.c()).X(aypa.a()).as(new c(this, 2));
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.r = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.n) {
            try {
                from.inflate(R.layout.muted_autoplay_overlay, this.r);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                sb.append("Unable to inflate LazyMutedAutoplayOverlay: ");
                sb.append(valueOf);
                aqvb.k(sb.toString(), new Object[0]);
                return this.r;
            }
        } else {
            from.inflate(R.layout.muted_autoplay_overlay, this.r);
        }
        if (!this.t.e()) {
            ayqi.c((AtomicReference) this.t);
        }
        this.s = true;
        this.o = (MutedAutoplayIndicator) this.r.findViewById(R.id.audio_indicator);
        this.b = (RelativeLayout) this.r.findViewById(R.id.end_screen_layout);
        this.p = (TextView) this.r.findViewById(R.id.end_screen_text);
        this.a = (TouchImageView) this.r.findViewById(R.id.api_youtube_watermark);
        this.q = new n((TouchImageView) this.r.findViewById(R.id.end_screen_play_button));
        this.r.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey == null) {
                    return;
                }
                try {
                    cVar.a(selectableItemKey);
                } catch (RemoteException unused) {
                }
                dVar.d.onClick(view);
                dVar.W();
            }
        });
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey == null) {
                    return;
                }
                try {
                    cVar.a(selectableItemKey);
                } catch (RemoteException unused) {
                }
                dVar.d.onClick(view);
                dVar.W();
            }
        });
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectableItemKey selectableItemKey;
                d dVar = d.this;
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c cVar = (com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.c) dVar.i.get();
                if (cVar == null) {
                    return;
                }
                if (view == dVar.b) {
                    selectableItemKey = dVar.g;
                } else {
                    selectableItemKey = view == dVar.a ? dVar.h : dVar.f;
                }
                if (selectableItemKey == null) {
                    return;
                }
                try {
                    cVar.a(selectableItemKey);
                } catch (RemoteException unused) {
                }
                dVar.d.onClick(view);
                dVar.W();
            }
        });
        return this.r;
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
        this.q.a(this.k);
        this.p.setText(this.l.c);
        g(this.l.g);
    }

    public final void g(int i) {
        if (!nI()) {
            return;
        }
        if (i == 1) {
            this.o.setVisibility(0);
            this.a.setVisibility(0);
            this.b.setVisibility(8);
            if (this.e.hasMessages(1)) {
                this.e.removeMessages(1);
            }
            this.e.sendEmptyMessageDelayed(1, this.j);
        } else if (i == 2) {
            this.o.setVisibility(8);
            this.a.setVisibility(8);
            this.b.setVisibility(0);
        } else {
            this.o.setVisibility(8);
            this.a.setVisibility(8);
            this.b.setVisibility(8);
        }
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
        return this.m == 2;
    }

    @Override // defpackage.ahyf, defpackage.ahyh
    public final boolean nI() {
        return this.s && super.nI();
    }
}
