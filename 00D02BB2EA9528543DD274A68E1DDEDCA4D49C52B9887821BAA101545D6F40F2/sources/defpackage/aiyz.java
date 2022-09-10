package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* compiled from: PG */
/* renamed from: aiyz  reason: default package */
/* loaded from: classes2.dex */
final class aiyz {
    Future<Boolean> a;
    final Map<dbsg<PersonId>, Future<Boolean>> b = new HashMap();

    public aiyz(Future<Boolean> future) {
        this.a = future;
    }
}
