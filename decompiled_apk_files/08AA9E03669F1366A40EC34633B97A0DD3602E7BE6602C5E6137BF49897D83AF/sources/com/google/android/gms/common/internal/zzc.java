package com.google.android.gms.common.internal;

import android.content.Intent;
import android.support.v4.app.i;
/* loaded from: classes.dex */
final class zzc extends DialogRedirect {
    private final /* synthetic */ i val$fragment;
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ Intent zzsh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(Intent intent, i iVar, int i) {
        this.zzsh = intent;
        this.val$fragment = iVar;
        this.val$requestCode = i;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    public final void redirect() {
        if (this.zzsh != null) {
            this.val$fragment.startActivityForResult(this.zzsh, this.val$requestCode);
        }
    }
}
