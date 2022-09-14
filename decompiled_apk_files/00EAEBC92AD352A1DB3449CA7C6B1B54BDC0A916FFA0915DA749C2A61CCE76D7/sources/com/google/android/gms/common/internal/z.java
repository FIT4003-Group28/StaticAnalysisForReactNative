package com.google.android.gms.common.internal;

import android.content.Intent;
/* loaded from: classes.dex */
final class z extends f {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f7066b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.common.api.internal.h f7067c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f7068d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(Intent intent, com.google.android.gms.common.api.internal.h hVar, int i) {
        this.f7066b = intent;
        this.f7067c = hVar;
        this.f7068d = i;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void a() {
        Intent intent = this.f7066b;
        if (intent != null) {
            this.f7067c.startActivityForResult(intent, this.f7068d);
        }
    }
}
