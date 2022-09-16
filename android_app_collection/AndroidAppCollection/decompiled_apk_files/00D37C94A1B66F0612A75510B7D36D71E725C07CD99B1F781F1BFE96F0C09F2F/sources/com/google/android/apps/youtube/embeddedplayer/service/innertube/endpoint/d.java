package com.google.android.apps.youtube.embeddedplayer.service.innertube.endpoint;

import android.content.Intent;
import android.net.Uri;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements aafo {
    private final oos a;

    public d(oos oosVar) {
        this.a = oosVar;
    }

    @Override // defpackage.aafo
    public final void a(apzg apzgVar) {
        c(apzgVar, null);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void b(List list) {
        aafn.b(this, list);
    }

    @Override // defpackage.aafo
    public final void c(apzg apzgVar, Map map) {
        oos oosVar = this.a;
        apff apffVar = (apff) apzgVar.qm(AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint);
        Intent intent = new Intent(apffVar.d);
        intent.setPackage(apffVar.c);
        if ((apffVar.b & 4) != 0) {
            intent.setData(Uri.parse(apffVar.e));
        }
        for (asmc asmcVar : apffVar.f) {
            intent.putExtra(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
        }
        oosVar.a.t(intent);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void d(List list, Map map) {
        aafn.c(this, list, map);
    }

    @Override // defpackage.aafo
    public final /* synthetic */ void e(List list, Object obj) {
        aafn.d(this, list, obj);
    }
}
