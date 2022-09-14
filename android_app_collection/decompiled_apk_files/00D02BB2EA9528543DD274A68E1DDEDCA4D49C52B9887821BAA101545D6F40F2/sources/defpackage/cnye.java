package defpackage;

import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.QueryFilterParameters;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: cnye  reason: default package */
/* loaded from: classes5.dex */
public final class cnye {
    private HashSet<ContextDataFilterImpl.Inclusion> a;
    private final cnzl b = new cnzl();

    public final void a(int i, TimeFilterImpl timeFilterImpl) {
        if (this.a == null) {
            this.a = new HashSet<>();
        }
        this.a.add(new ContextDataFilterImpl.Inclusion(-1, i, timeFilterImpl, null));
    }

    public final ContextDataFilterImpl b() {
        HashSet<ContextDataFilterImpl.Inclusion> hashSet = this.a;
        return new ContextDataFilterImpl(hashSet == null ? null : new ArrayList(hashSet), null, new QueryFilterParameters(0, -1, null));
    }
}
