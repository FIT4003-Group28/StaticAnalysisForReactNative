package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kpq  reason: default package */
/* loaded from: classes7.dex */
public class kpq implements kpp {
    private final Context a;

    public kpq(Context context) {
        this.a = context;
    }

    @Override // defpackage.kpp
    public CharSequence a() {
        return this.a.getString(R.string.INCOGNITO_HEADER_TITLE);
    }
}
