package com.google.android.apps.youtube.app.settings.videoquality;

import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoQualityPrefsFragment extends lls {
    public llw c;
    public aadd d;

    @Override // defpackage.dp
    public final void U() {
        final llw llwVar = this.c;
        if (llwVar.i) {
            ylx.m(llwVar.c.b(new ampg() { // from class: llu
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    llw llwVar2 = llw.this;
                    aopa mo52toBuilder = ((awuj) obj).mo52toBuilder();
                    long c = llwVar2.d.c();
                    mo52toBuilder.copyOnWrite();
                    awuj awujVar = (awuj) mo52toBuilder.instance;
                    awujVar.b |= 64;
                    awujVar.o = c;
                    return (awuj) mo52toBuilder.mo39build();
                }
            }), jou.u);
        }
        if (llwVar.h) {
            llwVar.g.t();
        }
        llwVar.e.qr();
        super.U();
    }

    @Override // defpackage.bjr
    public final void aG() {
        p(true != eog.U(this.d) ? R.xml.videoquality_prefs : R.xml.videoquality_nonbeta_prefs);
        mJ().setTitle(R.string.persistent_settings_video_quality_title);
        llw llwVar = this.c;
        bkb bkbVar = this.a;
        atdy atdyVar = llwVar.f.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        atdz atdzVar = atdyVar.k;
        if (atdzVar == null) {
            atdzVar = atdz.a;
        }
        boolean z = atdzVar.f;
        llwVar.h = z;
        if (z) {
            llwVar.g.d(acuo.a(93926), null, null);
        }
        llwVar.b(bkbVar, llw.a, lhh.h);
        llwVar.b(bkbVar, llw.b, lhh.i);
    }
}
