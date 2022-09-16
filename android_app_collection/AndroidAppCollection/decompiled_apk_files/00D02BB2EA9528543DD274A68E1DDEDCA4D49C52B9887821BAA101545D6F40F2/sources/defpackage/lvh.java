package defpackage;

import android.text.TextUtils;
/* renamed from: lvh  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class lvh implements cqlc {
    static final cqlc a = new lvh();

    private lvh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lvw lvwVar = (lvw) cqkpVar;
        boolean z = true;
        if (!lvwVar.a().booleanValue() && !TextUtils.isEmpty(lvwVar.h())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
