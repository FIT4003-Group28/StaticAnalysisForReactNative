package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.a.a;
import com.google.firebase.analytics.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements a.InterfaceC0152a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f8279a;

    public d(e eVar) {
        this.f8279a = eVar;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final void a(String str, String str2, Bundle bundle, long j) {
        a.b bVar;
        if (!this.f8279a.f8280a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", b.c(str2));
        bVar = this.f8279a.f8281b;
        bVar.a(2, bundle2);
    }
}
