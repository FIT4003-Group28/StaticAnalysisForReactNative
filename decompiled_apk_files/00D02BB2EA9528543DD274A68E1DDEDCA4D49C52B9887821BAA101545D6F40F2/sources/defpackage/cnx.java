package defpackage;

import com.google.android.apps.auto.sdk.nav.state.NavigationSummary;
/* compiled from: PG */
/* renamed from: cnx  reason: default package */
/* loaded from: classes5.dex */
public final class cnx {
    public static final void a(int i, NavigationSummary navigationSummary) {
        if (i == 2 || i == 1 || i == 4 || i == 3 || i == 5) {
            navigationSummary.a = i;
            return;
        }
        throw new IllegalArgumentException("Invalid navigation status value");
    }
}
