package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.AutoValue_FetchState;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: tga  reason: default package */
/* loaded from: classes7.dex */
public final class tga extends tgj {
    public FetchState.Fetch a;

    public tga() {
    }

    public tga(FetchState fetchState) {
        this.a = fetchState.a();
    }

    @Override // defpackage.tgj
    public final void b(FetchState.Fetch fetch) {
        this.a = fetch;
    }

    @Override // defpackage.tgj
    public final FetchState a() {
        String str = this.a == null ? " directionsFetch" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new AutoValue_FetchState(this.a);
    }
}
