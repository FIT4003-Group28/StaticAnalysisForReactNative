package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpjg  reason: default package */
/* loaded from: classes5.dex */
public final class cpjg implements cnom {
    public final Status a;
    public final List<NodeParcelable> b;

    public cpjg(Status status, List<NodeParcelable> list) {
        this.a = status;
        this.b = list;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }
}
