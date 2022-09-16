package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;
/* compiled from: PG */
/* renamed from: cnz  reason: default package */
/* loaded from: classes5.dex */
public final class cnz extends cla implements IInterface {
    public cnz(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.auto.sdk.nav.suggestion.INavigationSuggestionCallback");
    }

    public final void e(NavigationSuggestion[] navigationSuggestionArr) {
        Parcel a = a();
        a.writeTypedArray(navigationSuggestionArr, 0);
        Sj(1, a);
    }
}
