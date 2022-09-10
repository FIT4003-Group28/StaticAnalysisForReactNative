package com.google.firebase.dynamiclinks.internal;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseDynamicLinkRegistrar implements depb {
    public static final /* synthetic */ deps lambda$getComponents$0$FirebaseDynamicLinkRegistrar(deox deoxVar) {
        return new deqc(new depw(((dela) deoxVar.a(dela.class)).a()), (delh) deoxVar.a(delh.class));
    }

    @Override // defpackage.depb
    public List<deow<?>> getComponents() {
        deov builder = deow.builder(deps.class);
        builder.b(depi.required(dela.class));
        builder.b(depi.optional(delh.class));
        builder.c(depy.a);
        return Arrays.asList(builder.a());
    }
}
