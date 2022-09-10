package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* renamed from: bqnr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bqnr implements cqjb {
    static final cqjb a = new bqnr();

    private bqnr() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, final Context context) {
        final bqtc bqtcVar = (bqtc) cqkpVar;
        int i = bqns.a;
        return (CharSequence) dbsg.j(bqtcVar.a()).h(new dbrn(context, bqtcVar) { // from class: bqnq
            private final Context a;
            private final bqtc b;

            {
                this.a = context;
                this.b = bqtcVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Context context2 = this.a;
                bqtc bqtcVar2 = this.b;
                String str = (String) obj;
                int i2 = bqns.a;
                Resources resources = context2.getResources();
                return resources.getString(R.string.TRIP_TYPE_OPTION_DESCRIPTION, str, resources.getString(true != bqtcVar2.c().booleanValue() ? R.string.TRIP_TYPE_UNSELECTED : R.string.TRIP_TYPE_SELECTED));
            }
        }).f();
    }
}
