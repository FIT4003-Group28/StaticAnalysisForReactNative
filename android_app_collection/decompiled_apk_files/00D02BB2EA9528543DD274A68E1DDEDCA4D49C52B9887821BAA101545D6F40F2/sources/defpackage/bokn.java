package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: bokn  reason: default package */
/* loaded from: classes3.dex */
public final class bokn {
    public final String a = System.getProperty("line.separator", "\n");
    private final String b;

    public bokn(Resources resources) {
        this.b = resources.getString(R.string.EDIT_PUBLISHED_STRING_SEPARATOR);
    }

    public final String a(Collection<String> collection) {
        return dbrz.e(this.b).j().g(collection);
    }
}
