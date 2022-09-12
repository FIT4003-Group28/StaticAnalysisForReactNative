package defpackage;

import android.content.Intent;
/* renamed from: akmm  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class akmm implements dbsl {
    static final dbsl a = new akmm();

    private akmm() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        afga afgaVar = (afga) obj;
        Intent intent = afgaVar.a;
        return (intent == null || intent.getComponent() == null || !afgaVar.a.getComponent().getShortClassName().endsWith("EventNotificationActivity")) ? false : true;
    }
}
