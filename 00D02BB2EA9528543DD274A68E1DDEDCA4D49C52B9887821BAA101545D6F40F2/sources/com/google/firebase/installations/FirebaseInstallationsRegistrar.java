package com.google.firebase.installations;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseInstallationsRegistrar implements depb {
    public static final /* synthetic */ desz lambda$getComponents$0$FirebaseInstallationsRegistrar(deox deoxVar) {
        return new desy((dela) deoxVar.a(dela.class), deoxVar.b(devr.class), deoxVar.b(derf.class));
    }

    @Override // defpackage.depb
    public List<deow<?>> getComponents() {
        deov builder = deow.builder(desz.class);
        builder.b(depi.required(dela.class));
        builder.b(depi.optionalProvider(derf.class));
        builder.b(depi.optionalProvider(devr.class));
        builder.c(detb.a);
        return Arrays.asList(builder.a(), devq.create("fire-installations", "16.3.4_1p"));
    }
}
