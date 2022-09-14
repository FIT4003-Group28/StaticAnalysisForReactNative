package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t9 implements j4 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f7713a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r9 f7714b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t9(r9 r9Var, String str) {
        this.f7714b = r9Var;
        this.f7713a = str;
    }

    @Override // com.google.android.gms.measurement.internal.j4
    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f7714b.a(i, th, bArr, this.f7713a);
    }
}
