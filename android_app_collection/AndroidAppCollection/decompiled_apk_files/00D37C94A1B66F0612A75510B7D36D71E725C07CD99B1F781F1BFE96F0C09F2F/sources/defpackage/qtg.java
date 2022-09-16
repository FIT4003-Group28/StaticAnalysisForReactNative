package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: qtg  reason: default package */
/* loaded from: classes4.dex */
public final class qtg implements qtf {
    private final /* synthetic */ int a;

    public /* synthetic */ qtg(int i) {
        this.a = i;
    }

    @Override // defpackage.qtf
    public final void a(qte qteVar) {
        if (this.a == 0) {
            throw null;
        }
        Status status = (Status) qteVar;
        if (status.c()) {
            return;
        }
        new ExecutionException(String.format("%s: %d", status.h, Integer.valueOf(status.g)), null);
    }
}
