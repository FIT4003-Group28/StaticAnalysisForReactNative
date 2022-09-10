package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Registrar implements depb {
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(deox deoxVar) {
        dela delaVar = (dela) deoxVar.a(dela.class);
        return new FirebaseInstanceId(delaVar, new derx(delaVar.a()), dero.a(), dero.a(), deoxVar.b(devr.class), deoxVar.b(derf.class), (desz) deoxVar.a(desz.class));
    }

    public static final /* synthetic */ desp lambda$getComponents$1$Registrar(deox deoxVar) {
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) deoxVar.a(FirebaseInstanceId.class);
        return new desa();
    }

    @Override // defpackage.depb
    public List<deow<?>> getComponents() {
        deov builder = deow.builder(FirebaseInstanceId.class);
        builder.b(depi.required(dela.class));
        builder.b(depi.optionalProvider(devr.class));
        builder.b(depi.optionalProvider(derf.class));
        builder.b(depi.required(desz.class));
        builder.c(dery.a);
        builder.e();
        deow a = builder.a();
        deov builder2 = deow.builder(desp.class);
        builder2.b(depi.required(FirebaseInstanceId.class));
        builder2.c(derz.a);
        return Arrays.asList(a, builder2.a(), devq.create("fire-iid", "21.0.1"));
    }
}
