package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ax;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class j implements alya {
    final /* synthetic */ m a;

    public j(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.alya
    public final String a(String str) {
        ax axVar;
        m mVar = this.a;
        if (mVar.c == null || (axVar = mVar.d) == null) {
            ax axVar2 = mVar.b;
            return axVar2 != null ? axVar2.d(str) : "";
        }
        return axVar.d(str);
    }
}
