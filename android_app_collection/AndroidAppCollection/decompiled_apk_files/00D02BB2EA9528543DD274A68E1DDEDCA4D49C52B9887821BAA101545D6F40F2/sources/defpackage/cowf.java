package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cowf  reason: default package */
/* loaded from: classes.dex */
final class cowf implements couj {
    private final Status a;
    private final cowv b;

    public cowf(Status status, cowv cowvVar) {
        this.a = status;
        this.b = cowvVar;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.cnoj
    public final void b() {
        cowv cowvVar = this.b;
        if (cowvVar != null) {
            cowvVar.b();
        }
    }

    @Override // defpackage.couj
    public final cowv c() {
        return this.b;
    }
}
