package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.AgeVerificationEndpointOuterClass$AgeVerificationEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eax  reason: default package */
/* loaded from: classes3.dex */
public final class eax implements aafl, yiu {
    public final yjk a;
    private final aafo b;
    private final dt c;
    private final Executor d;
    private final afvn e;
    private final emo f;
    private final aire g;
    private final adoa h;
    private apzg i;
    private final vzc j;

    public eax(aafo aafoVar, dt dtVar, vzc vzcVar, Executor executor, yjk yjkVar, afvn afvnVar, emo emoVar, aire aireVar, adoa adoaVar) {
        this.b = aafoVar;
        this.c = dtVar;
        this.j = vzcVar;
        this.d = executor;
        this.a = yjkVar;
        this.e = afvnVar;
        this.f = emoVar;
        this.g = aireVar;
        this.h = adoaVar;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        if (i == 2300) {
            if (this.h.e() == null || this.h.e().a() != 1) {
                this.f.f();
                apzg apzgVar = this.i;
                if (apzgVar != null) {
                    this.b.a(apzgVar);
                }
                this.i = null;
                return;
            }
            if (this.i != null) {
                aire aireVar = this.g;
                aijl d = PlaybackStartDescriptor.d();
                d.a = this.i;
                aireVar.d(d.a());
            }
            this.i = null;
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!this.e.t() || apzgVar == null || !apzgVar.qn(AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint)) {
            return;
        }
        AgeVerificationEndpointOuterClass$AgeVerificationEndpoint ageVerificationEndpointOuterClass$AgeVerificationEndpoint = (AgeVerificationEndpointOuterClass$AgeVerificationEndpoint) apzgVar.qm(AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint);
        apzg apzgVar2 = ageVerificationEndpointOuterClass$AgeVerificationEndpoint.c;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        this.i = apzgVar2;
        try {
            this.d.execute(new afvj(this.c, this.j.a(this.e.c()), ageVerificationEndpointOuterClass$AgeVerificationEndpoint.b, new zdt() { // from class: eaw
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    eax eaxVar = eax.this;
                    aer a = new aeq().a();
                    a.a.setData(Uri.parse((String) obj));
                    eaxVar.a.a(a.a, 2300, eaxVar);
                }
            }));
        } catch (Exception unused) {
            this.f.f();
        }
    }
}
