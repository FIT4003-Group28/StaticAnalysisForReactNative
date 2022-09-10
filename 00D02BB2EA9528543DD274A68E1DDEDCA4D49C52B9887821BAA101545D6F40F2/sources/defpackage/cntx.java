package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cntx  reason: default package */
/* loaded from: classes5.dex */
public final class cntx {
    public static cnob a(Status status) {
        if (status.c()) {
            return new cnok(status);
        }
        return new cnob(status);
    }
}
