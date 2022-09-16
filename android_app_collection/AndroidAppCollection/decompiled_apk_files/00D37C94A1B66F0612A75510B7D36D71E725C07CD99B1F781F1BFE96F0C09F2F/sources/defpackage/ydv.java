package defpackage;

import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
/* compiled from: PG */
/* renamed from: ydv  reason: default package */
/* loaded from: classes4.dex */
final class ydv implements xyk {
    final /* synthetic */ ydw a;
    private final apzg b;

    public ydv(ydw ydwVar, apzg apzgVar) {
        this.a = ydwVar;
        this.b = apzgVar;
    }

    @Override // defpackage.xyk
    public final void d() {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) this.b.qm(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        if ((unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b & 32) != 0) {
            aafo aafoVar = this.a.c;
            apzg apzgVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // defpackage.xyk
    public final void e() {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) this.b.qm(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        int i = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.b;
        asku askuVar = null;
        if ((i & 16) != 0) {
            aafo aafoVar = this.a.c;
            apzg apzgVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            return;
        }
        if ((i & 4) != 0) {
            avoh avohVar = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.d;
            if (avohVar == null) {
                avohVar = avoh.a;
            }
            if (avohVar.b == 86135402) {
                askuVar = (asku) avohVar.c;
            } else {
                askuVar = asku.a;
            }
        }
        if (askuVar == null) {
            return;
        }
        this.a.b.e(askuVar);
    }

    @Override // defpackage.xym
    public final boolean g() {
        return true;
    }
}
