package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atul  reason: default package */
/* loaded from: classes2.dex */
public class atul extends atss<crqt> {
    private static final long a = TimeUnit.SECONDS.toMillis(2);
    private final String b;

    public atul(crqt crqtVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, Context context, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crqtVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, a);
        this.b = context.getString(true != crqtVar.a ? R.string.OFFLINE_TO_ONLINE_NAVIGATION_ETA_TRANSITION_VOICE : R.string.OFFLINE_TO_ONLINE_NAVIGATION_ROUTE_TRANSITION_VOICE);
        this.p = context.getString(R.string.OFFLINE_TO_ONLINE_NAVIGATION_TRANSITION_TITLE);
        B(context.getString(true != crqtVar.a ? R.string.OFFLINE_TO_ONLINE_NAVIGATION_ETA_TRANSITION_SHORT_TEXT : R.string.OFFLINE_TO_ONLINE_NAVIGATION_ROUTE_TRANSITION_SHORT_TEXT));
        L(S(true).a());
        H(asab.a);
    }

    @Override // defpackage.atss
    protected final crfj u() {
        return this.i.q().g(this.b);
    }
}
