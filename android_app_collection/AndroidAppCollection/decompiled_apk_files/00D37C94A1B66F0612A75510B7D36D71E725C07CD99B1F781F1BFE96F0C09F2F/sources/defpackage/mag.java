package defpackage;

import android.content.Context;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mag  reason: default package */
/* loaded from: classes3.dex */
public final class mag extends lzm implements wkg {
    public mag(ajmy ajmyVar, ajyc ajycVar, aafo aafoVar, acti actiVar, Context context, aaar aaarVar, lzu lzuVar) {
        super(ajmyVar, ajycVar, aafoVar, actiVar, context, aaarVar, lzuVar);
    }

    @Override // defpackage.wke
    public final void h(wxo wxoVar) {
        aaar aaarVar;
        this.g = false;
        if (this.f != null && wxoVar.a() == wzq.USER_SKIPPED && (aaarVar = this.e) != null) {
            aaarVar.b();
        }
        auuk auukVar = this.f;
        if (auukVar == null || (auukVar.b & 4096) == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.f);
        aafo aafoVar = this.b;
        apzg apzgVar = this.f.m;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
    }

    @Override // defpackage.wkg
    public final boolean i(String str, aqfd aqfdVar, asit asitVar) {
        auuk auukVar;
        if ((aqfdVar.b & 4) != 0) {
            auukVar = aqfdVar.e;
            if (auukVar == null) {
                auukVar = auuk.a;
            }
        } else {
            auukVar = null;
        }
        this.f = auukVar;
        auuk auukVar2 = this.f;
        return auukVar2 != null && auukVar2.f.size() > 0;
    }
}
