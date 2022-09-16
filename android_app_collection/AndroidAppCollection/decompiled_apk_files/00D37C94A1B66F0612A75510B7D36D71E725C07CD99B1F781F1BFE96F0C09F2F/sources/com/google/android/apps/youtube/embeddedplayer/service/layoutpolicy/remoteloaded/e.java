package com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.model.MutedAutoplayState;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements ayqb {
    public final /* synthetic */ h a;
    private final /* synthetic */ int b;

    public /* synthetic */ e(h hVar) {
        this.a = hVar;
    }

    public /* synthetic */ e(h hVar, int i) {
        this.b = i;
        this.a = hVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            h hVar = this.a;
            aqtp aqtpVar = (aqtp) obj;
            if (aqtpVar == null) {
                return;
            }
            hVar.n = (!aqtpVar.c || !h.b.contains(hVar.c.getContext().getPackageName())) ? g.STRICT : g.RELAXED;
            hVar.g = aqtpVar.d;
            hVar.h = aqtpVar.j;
            return;
        }
        this.a.m = ((MutedAutoplayState) obj).g;
    }
}
