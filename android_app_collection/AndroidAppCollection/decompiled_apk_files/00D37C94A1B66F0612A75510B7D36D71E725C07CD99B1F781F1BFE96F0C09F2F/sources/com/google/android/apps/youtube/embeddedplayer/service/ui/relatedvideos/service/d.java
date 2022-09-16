package com.google.android.apps.youtube.embeddedplayer.service.ui.relatedvideos.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.j;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements j {
    public static int a = 1;
    public int b;
    public final SparseArray c = new SparseArray();
    private final f d;
    private final aafo e;

    public d(f fVar, aafo aafoVar) {
        this.d = fVar;
        this.e = aafoVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.j
    public final void a(int i) {
        aquw aquwVar = (aquw) this.c.get(i);
        if (aquwVar == null) {
            return;
        }
        this.d.j(aquwVar.k.I());
        aafo aafoVar = this.e;
        apzg apzgVar = aquwVar.j;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafn.a(aafoVar, apzgVar);
    }
}
