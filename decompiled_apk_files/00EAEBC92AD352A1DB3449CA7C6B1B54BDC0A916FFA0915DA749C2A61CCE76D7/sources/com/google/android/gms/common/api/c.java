package com.google.android.gms.common.api;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends Exception {

    /* renamed from: b  reason: collision with root package name */
    private final a.e.a<com.google.android.gms.common.api.internal.b<?>, com.google.android.gms.common.b> f6807b;

    public c(a.e.a<com.google.android.gms.common.api.internal.b<?>, com.google.android.gms.common.b> aVar) {
        this.f6807b = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.b<?> bVar : this.f6807b.keySet()) {
            com.google.android.gms.common.b bVar2 = this.f6807b.get(bVar);
            if (bVar2.u()) {
                z = false;
            }
            String a2 = bVar.a();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
