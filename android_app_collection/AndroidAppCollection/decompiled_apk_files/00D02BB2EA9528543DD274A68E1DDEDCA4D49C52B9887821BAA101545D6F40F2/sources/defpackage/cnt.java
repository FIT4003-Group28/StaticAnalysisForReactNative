package defpackage;

import com.google.android.apps.auto.sdk.nav.state.DestinationDistance;
import com.google.android.apps.auto.sdk.nav.state.Distance;
/* compiled from: PG */
/* renamed from: cnt  reason: default package */
/* loaded from: classes5.dex */
public final class cnt {
    public Distance a;
    public String b;
    public long c = -1;

    public final DestinationDistance a() {
        return new DestinationDistance(this.a, this.b, this.c);
    }
}
