package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cwov  reason: default package */
/* loaded from: classes5.dex */
public abstract class cwov extends Exception {
    public abstract cnom a();

    public abstract Status b();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return b().toString();
    }
}
