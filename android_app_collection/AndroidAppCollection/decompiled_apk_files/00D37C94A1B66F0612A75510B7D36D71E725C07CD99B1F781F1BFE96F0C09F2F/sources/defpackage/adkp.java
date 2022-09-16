package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
/* compiled from: PG */
/* renamed from: adkp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adkp implements ayqb {
    public final /* synthetic */ adkq a;
    private final /* synthetic */ int b;

    public /* synthetic */ adkp(adkq adkqVar) {
        this.a = adkqVar;
    }

    public /* synthetic */ adkp(adkq adkqVar, int i) {
        this.b = i;
        this.a = adkqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            adkq adkqVar = this.a;
            ahhm ahhmVar = (ahhm) obj;
            if (ahhmVar.a() != null) {
                adkqVar.a.g = ahhmVar.a().b;
            } else {
                adkqVar.a.g = null;
            }
            if (ahhmVar.d() == null || !ahhmVar.d().qn(WatchEndpointOuterClass.watchEndpoint)) {
                adkqVar.a.c = null;
            } else {
                adkqVar.a.c = (awel) ahhmVar.d().qm(WatchEndpointOuterClass.watchEndpoint);
            }
            adkqVar.a.b = null;
            return;
        }
        ahhk ahhkVar = (ahhk) obj;
        adkr adkrVar = this.a.a;
        adkrVar.g = null;
        adkrVar.b = null;
    }
}
