package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ayqb {
    public final /* synthetic */ e a;
    private final /* synthetic */ int b;

    public /* synthetic */ a(e eVar) {
        this.a = eVar;
    }

    public /* synthetic */ a(e eVar, int i) {
        this.b = i;
        this.a = eVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        aubk aubkVar;
        int i = this.b;
        if (i == 0) {
            this.a.k.d(R.id.related_videos_screen_button, ((Boolean) obj).booleanValue());
        } else if (i == 1) {
            this.a.b((MutedAutoplayState) obj);
        } else if (i == 2) {
            e eVar = this.a;
            if (!((Boolean) obj).booleanValue() || (aubkVar = eVar.c) == null || (aubkVar.c & 4) == 0) {
                return;
            }
            eVar.j.q(aubkVar.g.I());
        } else {
            Throwable th = (Throwable) obj;
            this.a.b(MutedAutoplayState.a);
        }
    }
}
