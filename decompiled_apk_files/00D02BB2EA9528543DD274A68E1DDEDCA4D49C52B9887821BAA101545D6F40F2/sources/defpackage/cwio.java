package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwio  reason: default package */
/* loaded from: classes5.dex */
public final class cwio {
    public static m a(View view) {
        Object tag = view.getRootView().getTag(R.id.og_fragment_lifecycle_tag);
        dbsk.t(tag, "Did you forget to call tagWithLifecycleOwner()?");
        return (m) tag;
    }
}
