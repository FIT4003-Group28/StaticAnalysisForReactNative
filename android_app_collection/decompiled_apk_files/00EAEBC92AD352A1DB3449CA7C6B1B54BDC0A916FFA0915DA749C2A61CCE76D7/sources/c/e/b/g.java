package c.e.b;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.m;
/* loaded from: classes.dex */
public class g implements m {
    @Override // com.google.android.gms.common.api.internal.m
    public Exception a(Status status) {
        return status.q() == 8 ? new f(status.u()) : new b(status.u());
    }
}
