package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f6926a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(e eVar) {
        this.f6926a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z) {
        this.f6926a.m.sendMessage(this.f6926a.m.obtainMessage(1, Boolean.valueOf(z)));
    }
}
