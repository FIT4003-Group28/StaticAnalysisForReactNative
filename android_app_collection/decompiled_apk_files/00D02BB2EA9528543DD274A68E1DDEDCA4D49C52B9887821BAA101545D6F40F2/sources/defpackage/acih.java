package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: acih  reason: default package */
/* loaded from: classes2.dex */
final class acih extends cqvf {
    public acih() {
        super(R.string.LOCATION_FEEDBACK_FIX_IT_NOW);
    }

    @Override // defpackage.cqvf, defpackage.cqsn
    public final CharSequence a(Context context) {
        return super.a(context).toString().toLowerCase(Locale.getDefault());
    }
}
