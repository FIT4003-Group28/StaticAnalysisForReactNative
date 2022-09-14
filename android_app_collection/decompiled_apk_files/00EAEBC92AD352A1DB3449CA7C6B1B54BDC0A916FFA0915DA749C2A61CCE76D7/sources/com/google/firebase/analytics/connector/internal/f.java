package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.a.a;
import com.google.firebase.analytics.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements a.InterfaceC0152a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g f8284a;

    public f(g gVar) {
        this.f8284a = gVar;
    }

    @Override // com.google.android.gms.measurement.internal.h6
    public final void a(String str, String str2, Bundle bundle, long j) {
        a.b bVar;
        if (str == null || str.equals("crash") || !b.b(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        bVar = this.f8284a.f8285a;
        bVar.a(3, bundle2);
    }
}
