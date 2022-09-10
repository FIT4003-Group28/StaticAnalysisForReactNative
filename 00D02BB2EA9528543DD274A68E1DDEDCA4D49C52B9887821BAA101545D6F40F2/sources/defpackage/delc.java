package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: delc  reason: default package */
/* loaded from: classes6.dex */
public final class delc implements cnsw {
    @Override // defpackage.cnsw
    public final Exception a(Status status) {
        if (status.g == 8) {
            return new delb(status.e());
        }
        return new deku(status.e());
    }
}
