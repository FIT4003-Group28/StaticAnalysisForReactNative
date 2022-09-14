package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmte  reason: default package */
/* loaded from: classes5.dex */
public final class cmte implements cnom {
    public final Status a;
    public String b;

    public cmte(Status status) {
        cnwc.a(status);
        this.a = status;
    }

    public cmte(String str) {
        this.b = str;
        this.a = Status.a;
    }

    @Override // defpackage.cnom
    @dzsi
    public final Status a() {
        return this.a;
    }
}
