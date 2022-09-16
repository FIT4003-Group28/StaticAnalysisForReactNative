package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbfr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbfr implements cqjb {
    static final cqjb a = new bbfr();

    private bbfr() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqtv cqtvVar = bbfu.a;
        bbho d = ((bbhq) cqkpVar).d();
        String string = context.getString(R.string.EXEMPLAR_SKIP_CARD);
        if (d == null) {
            return string;
        }
        int ordinal = d.ordinal();
        if (ordinal == 1) {
            return context.getString(R.string.EXEMPLAR_NEXT_CARD);
        }
        return ordinal != 2 ? string : "";
    }
}
