package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: ury  reason: default package */
/* loaded from: classes4.dex */
public abstract class ury extends Exception {
    public abstract qte a();

    public abstract Status b();

    @Override // java.lang.Throwable
    public final String getMessage() {
        return b().toString();
    }
}
