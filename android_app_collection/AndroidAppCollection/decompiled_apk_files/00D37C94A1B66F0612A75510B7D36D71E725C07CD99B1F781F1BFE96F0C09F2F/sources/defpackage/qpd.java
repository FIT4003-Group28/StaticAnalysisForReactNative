package defpackage;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qpd  reason: default package */
/* loaded from: classes4.dex */
public final class qpd implements qte {
    public final Status a;
    public final ApplicationMetadata b;
    public final String c;
    public final String d;
    public final boolean e;

    public qpd(Status status, ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        this.a = status;
        this.b = applicationMetadata;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.a;
    }
}
