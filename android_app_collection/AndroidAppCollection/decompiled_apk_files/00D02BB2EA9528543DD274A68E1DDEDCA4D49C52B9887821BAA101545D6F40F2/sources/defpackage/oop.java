package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: oop  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class oop implements cqlc {
    static final cqlc a = new oop();

    private oop() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxs oxsVar = (oxs) cqkpVar;
        int i = ooq.a;
        if (cqjv.v(oxsVar.l()).booleanValue()) {
            return cqrt.l(R.string.DIRECTIONS_TRIGGER_BUTTON_TEXT);
        }
        return oxsVar.l();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
