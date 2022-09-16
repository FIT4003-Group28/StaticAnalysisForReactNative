package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.service;

import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.model.SelectableItemKey;
import com.google.android.apps.youtube.embeddedplayer.service.model.j;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements j {
    public SelectableItemKey a;
    public SelectableItemKey b;
    public SelectableItemKey c;
    public final SparseArray d = new SparseArray();
    public long e;
    public auao f;
    private final f g;
    private final aafo h;
    private final a i;

    public c(f fVar, aafo aafoVar, a aVar) {
        this.g = fVar;
        this.h = aafoVar;
        this.i = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.model.j
    public final void a(int i) {
        if (this.f == null) {
            return;
        }
        Object obj = this.d.get(i);
        if (obj == null || (obj instanceof auao) || (obj instanceof auan)) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint.starttime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.e)));
            aafo aafoVar = this.h;
            apzg apzgVar = this.f.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else if (obj instanceof auap) {
            aafo aafoVar2 = this.h;
            apzg apzgVar2 = ((auap) obj).b;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafn.a(aafoVar2, apzgVar2);
        }
        if (obj != null) {
            byte[] bArr = null;
            if (obj instanceof auao) {
                auao auaoVar = (auao) obj;
                if ((auaoVar.b & 32) != 0) {
                    bArr = auaoVar.f.I();
                }
            } else if (obj instanceof auan) {
                auan auanVar = (auan) obj;
                if ((auanVar.b & 4) != 0) {
                    bArr = auanVar.d.I();
                }
            } else if (obj instanceof auap) {
                bArr = ((auap) obj).d.I();
            }
            if (bArr != null) {
                this.g.j(bArr);
            }
        }
        this.i.a.a(3);
    }
}
