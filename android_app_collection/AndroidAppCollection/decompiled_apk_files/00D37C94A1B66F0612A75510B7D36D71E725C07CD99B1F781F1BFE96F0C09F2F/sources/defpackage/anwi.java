package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: anwi  reason: default package */
/* loaded from: classes.dex */
public final class anwi implements qvs {
    private final /* synthetic */ int a;

    public anwi() {
    }

    public anwi(int i) {
        this.a = i;
    }

    @Override // defpackage.qvs
    public final Exception a(Status status) {
        if (this.a != 0) {
            return tjk.h(status);
        }
        if (status.g == 8) {
            return new anwh(status.b());
        }
        return new anwa(status.b());
    }
}
