package defpackage;

import android.os.Bundle;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
/* compiled from: PG */
/* renamed from: wig  reason: default package */
/* loaded from: classes4.dex */
public final class wig {
    public static final wiy a(atwq atwqVar, boolean z) {
        wja wjaVar = new wja();
        Bundle bundle = new Bundle();
        aphq.m(bundle, "ARG_INTRO_RENDERER", atwqVar);
        bundle.putBoolean("ARG_SHOW_AS_DIALOG", z);
        bundle.putBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        wjaVar.ae(bundle);
        if (z) {
            wjaVar.mN(2, 0);
            wjaVar.n(false);
        }
        return wjaVar;
    }

    public static apzg b(apzg apzgVar) {
        if (apzgVar != null) {
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.copyOnWrite();
            apzg apzgVar2 = (apzg) aopcVar.instance;
            apzgVar2.b &= -2;
            apzgVar2.c = apzg.a.c;
            aopcVar.copyOnWrite();
            ((apzg) aopcVar.instance).d = apzg.emptyProtobufList();
            aopcVar.d(auqs.b);
            aopa createBuilder = atnp.a.createBuilder();
            createBuilder.copyOnWrite();
            atnp atnpVar = (atnp) createBuilder.instance;
            atnpVar.b |= 512;
            atnpVar.g = true;
            aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
            return (apzg) aopcVar.mo39build();
        }
        return null;
    }

    public static apzg c(apzg apzgVar) {
        apzg apzgVar2 = null;
        auvx auvxVar = apzgVar == null ? null : (auvx) apzgVar.qm(SignInEndpointOuterClass.signInEndpoint);
        if (auvxVar != null && (auvxVar.b & 2) != 0 && (apzgVar2 = auvxVar.c) == null) {
            apzgVar2 = apzg.a;
        }
        apzg b = b(apzgVar2);
        if (auvxVar == null || b == null) {
            return apzgVar;
        }
        aopa createBuilder = auvx.a.createBuilder(auvxVar);
        createBuilder.copyOnWrite();
        auvx auvxVar2 = (auvx) createBuilder.instance;
        auvxVar2.c = b;
        auvxVar2.b |= 2;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(SignInEndpointOuterClass.signInEndpoint, (auvx) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }
}
