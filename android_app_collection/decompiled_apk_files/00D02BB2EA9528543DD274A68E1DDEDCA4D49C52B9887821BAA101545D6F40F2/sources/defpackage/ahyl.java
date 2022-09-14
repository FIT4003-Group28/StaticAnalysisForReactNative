package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyl  reason: default package */
/* loaded from: classes2.dex */
public final class ahyl implements awnl {
    @dzsi
    public transient aiki a;
    @dzsi
    public transient aijz b;
    @dzsi
    public transient ajsj c;

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.LOCATION_SHARING_SETTINGS;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        ((ahyk) btsr.a(ahyk.class)).ss(this);
        aiki aikiVar = this.a;
        dbsk.s(aikiVar);
        aijz aijzVar = this.b;
        dbsk.s(aijzVar);
        ajsj ajsjVar = this.c;
        dbsk.s(ajsjVar);
        btlu a = ajsjVar.a();
        aikiVar.u(a);
        aijzVar.b(a);
    }
}
