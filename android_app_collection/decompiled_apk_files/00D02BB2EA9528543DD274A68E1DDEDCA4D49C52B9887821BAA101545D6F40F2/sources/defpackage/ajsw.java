package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
/* renamed from: ajsw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class ajsw implements dbrn {
    static final dbrn a = new ajsw();

    private ajsw() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dqzv dqzvVar = ((disy) obj).c;
        if (dqzvVar == null) {
            dqzvVar = dqzv.h;
        }
        return PersonId.b(dqzvVar);
    }
}
