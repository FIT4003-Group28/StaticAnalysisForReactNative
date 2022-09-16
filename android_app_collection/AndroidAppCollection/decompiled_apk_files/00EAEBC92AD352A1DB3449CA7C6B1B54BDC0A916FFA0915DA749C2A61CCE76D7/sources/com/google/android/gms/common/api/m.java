package com.google.android.gms.common.api;
/* loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.gms.common.d f6939b;

    public m(com.google.android.gms.common.d dVar) {
        this.f6939b = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.f6939b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
