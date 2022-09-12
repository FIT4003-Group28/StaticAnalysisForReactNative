package defpackage;

import android.app.Service;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzce  reason: default package */
/* loaded from: classes4.dex */
public final class bzce implements bzch {
    public static final String a = String.valueOf(bzce.class.getCanonicalName()).concat(".ACTION");
    protected final Service b;

    public bzce(Service service) {
        this.b = service;
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        bzcf.c(this.b);
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return a.equals(intent.getAction());
    }
}
