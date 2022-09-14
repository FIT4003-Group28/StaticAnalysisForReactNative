package com.google.android.gms.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
/* loaded from: classes.dex */
final class zza implements Continuation<Map<com.google.android.gms.common.api.internal.zzh<?>, String>, Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(GoogleApiAvailability googleApiAvailability) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Void then(Task<Map<com.google.android.gms.common.api.internal.zzh<?>, String>> task) {
        task.getResult();
        return null;
    }
}
