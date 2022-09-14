package com.google.android.gms.common.m;

import com.google.android.gms.common.m.a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements a.InterfaceC0150a {
    @Override // com.google.android.gms.common.m.a.InterfaceC0150a
    public final ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
