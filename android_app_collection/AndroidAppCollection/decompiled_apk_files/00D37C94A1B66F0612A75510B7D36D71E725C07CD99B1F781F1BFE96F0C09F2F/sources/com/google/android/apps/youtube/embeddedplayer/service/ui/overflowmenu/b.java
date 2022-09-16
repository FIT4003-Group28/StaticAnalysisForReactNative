package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements aibg, aich, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b {
    private static final String u = "b";
    public final DialogInterface.OnShowListener a;
    public final DialogInterface.OnDismissListener b;
    public final d c;
    public final f d;
    public ahyo e;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e f;
    public Context g;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a i;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a j;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a k;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a l;
    public boolean m;
    public boolean n;
    public boolean o;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a p;
    public boolean r;
    public final pce t;
    private VideoQuality[] v;
    private int w;
    private int x;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d h = new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.a();
    public WatchLaterButtonData q = WatchLaterButtonData.a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d s = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.g;

    public b(Context context, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, d dVar, f fVar, pce pceVar, byte[] bArr, byte[] bArr2) {
        this.g = context;
        this.a = onShowListener;
        this.b = onDismissListener;
        this.c = dVar;
        this.d = fVar;
        this.t = pceVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.p = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        this.q = watchLaterButtonData;
    }

    public final void a() {
        String str;
        if (f()) {
            Resources resources = this.g.getResources();
            Drawable drawable = resources.getDrawable(R.drawable.embeds_quality_icon, this.g.getTheme());
            com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a aVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.a(resources.getString(R.string.overflow_quality), 0);
            aVar.d = drawable;
            int i = this.w;
            if (i >= 0) {
                VideoQuality[] videoQualityArr = this.v;
                if (i < videoQualityArr.length) {
                    str = videoQualityArr[i].b;
                    aVar.e = str;
                    aVar.f = this.g.getText(R.string.accessibility_quality);
                    aVar.g = actj.PLAYER_OVERFLOW_MENU_QUALITY_BUTTON;
                    this.j = aVar;
                }
            }
            Log.w(u, "Video quality index is out of bounds");
            str = "";
            aVar.e = str;
            aVar.f = this.g.getText(R.string.accessibility_quality);
            aVar.g = actj.PLAYER_OVERFLOW_MENU_QUALITY_BUTTON;
            this.j = aVar;
        }
    }

    public final void b(actj actjVar) {
        try {
            this.h.b(actjVar.II);
        } catch (RemoteException e) {
            pcu.h(e);
        }
    }

    public final boolean d() {
        return !this.n && !f();
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
    }

    public final boolean f() {
        VideoQuality[] videoQualityArr;
        return this.m && (videoQualityArr = this.v) != null && videoQualityArr.length > 0;
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        this.n = z;
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
        this.d.e = subtitleTrack;
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.d.g = aibfVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
    public final void pE(com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d dVar) {
        this.s = dVar;
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        this.m = z;
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        int i2;
        this.v = videoQualityArr;
        this.w = i;
        String str = null;
        if (videoQualityArr != null && i >= 0 && i < videoQualityArr.length) {
            str = videoQualityArr[i].b;
        }
        if (z) {
            if (str == null || i == 0) {
                str = (videoQualityArr == null || (i2 = this.x) <= 0 || i2 >= videoQualityArr.length) ? "" : videoQualityArr[i2].b;
            }
            String string = this.g.getString(R.string.quality_auto);
            String string2 = this.g.getString(R.string.quality_label, str);
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" ");
            sb.append(string2);
            str = sb.toString();
        }
        int i3 = this.w;
        if (i3 != 0) {
            this.x = i3;
        }
        if (this.j == null) {
            a();
        }
        this.j.e = amps.d(str);
        d dVar = this.c;
        dVar.f = videoQualityArr;
        dVar.h = dVar.g;
        dVar.g = i;
        dVar.i = z;
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.c.e = aicgVar;
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        final f fVar = this.d;
        com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e eVar = this.f;
        fVar.f = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubtitleTrack subtitleTrack = (SubtitleTrack) it.next();
            com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b bVar = new com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.model.b(subtitleTrack.toString());
            arrayList.add(bVar);
            if (subtitleTrack.equals(fVar.e)) {
                bVar.b();
            }
        }
        fVar.d = pce.j(R.string.subtitles, arrayList, new AdapterView.OnItemClickListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.e
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                f fVar2 = f.this;
                if (i < 0 || i >= fVar2.f.size()) {
                    return;
                }
                fVar2.g.pA((SubtitleTrack) fVar2.f.get(i));
                fVar2.d.cancel();
            }
        }, fVar.c, fVar.a, fVar.b);
        eVar.b(fVar.d);
    }
}
