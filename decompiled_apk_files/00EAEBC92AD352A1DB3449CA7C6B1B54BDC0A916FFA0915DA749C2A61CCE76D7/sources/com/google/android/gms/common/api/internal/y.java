package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y implements c.e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e.a f6936a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(e.a aVar) {
        this.f6936a = aVar;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        e.this.m.post(new x(this));
    }
}
