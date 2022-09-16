package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akmf  reason: default package */
/* loaded from: classes.dex */
public final class akmf implements aafl {
    public final yzj a;
    public final aafo b;
    public final ajqa c;
    private final aaun d;
    private final Context e;
    private final agbd f;

    public akmf(aaun aaunVar, yzj yzjVar, aafo aafoVar, ajqa ajqaVar, Context context, agbd agbdVar) {
        aaunVar.getClass();
        this.d = aaunVar;
        yzjVar.getClass();
        this.a = yzjVar;
        aafoVar.getClass();
        this.b = aafoVar;
        ajqaVar.getClass();
        this.c = ajqaVar;
        this.e = context;
        agbdVar.getClass();
        this.f = agbdVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        akme akmeVar = I instanceof akme ? (akme) I : null;
        if (akmeVar != null) {
            I = akmeVar.a();
            if (I == null) {
                I = akmeVar;
            }
            akmeVar.b();
        }
        EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) apzgVar.qm(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint);
        this.b.e(editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d, new akmd(true, I));
        akmd akmdVar = new akmd(false, I);
        aaun aaunVar = this.d;
        String str = editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.c;
        Boolean valueOf = Boolean.valueOf(this.f.d(this.e));
        aaunVar.c(aron.a, aaunVar.b, aass.p, aauh.f).e(new aauo(aaunVar.e, aaunVar.a.c(), str, valueOf), new akmc(this, akmdVar, akmeVar));
    }
}
