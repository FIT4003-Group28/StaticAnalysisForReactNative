package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
final class y extends f {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Intent f7063b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f7064c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f7065d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Intent intent, Activity activity, int i) {
        this.f7063b = intent;
        this.f7064c = activity;
        this.f7065d = i;
    }

    @Override // com.google.android.gms.common.internal.f
    public final void a() {
        Intent intent = this.f7063b;
        if (intent != null) {
            this.f7064c.startActivityForResult(intent, this.f7065d);
        }
    }
}
