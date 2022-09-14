package defpackage;

import android.content.Intent;
/* renamed from: btba  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class btba implements dbsl {
    static final dbsl a = new btba();

    private btba() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        if (!btbb.d(afgaVar.a)) {
            Intent intent = afgaVar.a;
            return intent.getExtras() != null && intent.getExtras().getBoolean("notificationSettingIntentExtra", false);
        }
        return true;
    }
}
