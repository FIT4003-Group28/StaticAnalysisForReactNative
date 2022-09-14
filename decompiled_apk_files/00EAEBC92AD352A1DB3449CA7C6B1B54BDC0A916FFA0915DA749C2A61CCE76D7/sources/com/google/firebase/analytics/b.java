package com.google.firebase.analytics;

import android.os.Bundle;
import c.e.a.b.d.g.h;
import com.google.android.gms.measurement.internal.h7;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class b implements h7 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ h f8271a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(h hVar) {
        this.f8271a = hVar;
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final List<Bundle> a(String str, String str2) {
        return this.f8271a.b(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final Map<String, Object> a(String str, String str2, boolean z) {
        return this.f8271a.a(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void a(Bundle bundle) {
        this.f8271a.a(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void a(String str) {
        this.f8271a.b(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void a(String str, String str2, Bundle bundle) {
        this.f8271a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final int b(String str) {
        return this.f8271a.d(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void b(String str, String str2, Bundle bundle) {
        this.f8271a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final void c(String str) {
        this.f8271a.c(str);
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String f() {
        return this.f8271a.f();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final long g() {
        return this.f8271a.e();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String j() {
        return this.f8271a.g();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String k() {
        return this.f8271a.c();
    }

    @Override // com.google.android.gms.measurement.internal.h7
    public final String l() {
        return this.f8271a.d();
    }
}
