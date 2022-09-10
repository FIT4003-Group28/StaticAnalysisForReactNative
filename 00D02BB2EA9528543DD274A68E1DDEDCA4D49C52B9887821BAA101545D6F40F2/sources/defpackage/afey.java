package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: afey  reason: default package */
/* loaded from: classes.dex */
public class afey implements afex {
    private final gga a;
    private final cjmt b;

    public afey(gga ggaVar, cjmt cjmtVar, affr affrVar) {
        this.a = ggaVar;
        this.b = cjmtVar;
    }

    @Override // defpackage.afex
    public CharSequence a() {
        return this.a.getString(R.string.INCOGNITO_HEADER_TITLE);
    }

    @Override // defpackage.afex
    public Integer b() {
        return Integer.valueOf(this.b.f(efe.INCOGNITO_BANNER));
    }
}
