package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbga  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbga implements cqjb {
    static final cqjb a = new bbga();

    private bbga() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bbhr bbhrVar = (bbhr) cqkpVar;
        int i = bbgc.a;
        if (!bbhrVar.g().booleanValue()) {
            return "";
        }
        bbho bbhoVar = bbho.PLACE;
        int ordinal = bbhrVar.a().ordinal();
        return (ordinal == 1 || ordinal != 2) ? "" : context.getString(R.string.EXEMPLAR_RATE_MORE_PLACES);
    }
}
