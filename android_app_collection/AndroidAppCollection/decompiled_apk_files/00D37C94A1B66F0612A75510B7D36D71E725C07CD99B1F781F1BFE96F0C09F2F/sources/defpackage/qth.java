package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qth  reason: default package */
/* loaded from: classes4.dex */
public final class qth extends UnsupportedOperationException {
    private final Feature a;

    public qth(Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
