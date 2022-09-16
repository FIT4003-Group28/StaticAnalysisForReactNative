package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cowm  reason: default package */
/* loaded from: classes.dex */
public final class cowm {
    public static final cnoh<couj> a(GoogleApiClient googleApiClient, @dzsi coui couiVar) {
        if (couiVar == null) {
            couiVar = coui.a;
        }
        return googleApiClient.enqueue(new cowl(googleApiClient, couiVar));
    }
}
