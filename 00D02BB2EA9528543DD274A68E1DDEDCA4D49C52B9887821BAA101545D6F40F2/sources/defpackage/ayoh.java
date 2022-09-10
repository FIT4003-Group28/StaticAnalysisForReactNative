package defpackage;

import android.app.Activity;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ayoh  reason: default package */
/* loaded from: classes3.dex */
final class ayoh implements awnl {
    @dzsi
    private final transient ayoi a;

    public ayoh(ayoi ayoiVar) {
        this.a = ayoiVar;
    }

    @Override // defpackage.awnl
    public final awnn a() {
        return awnn.UDC_CONSENT;
    }

    @Override // defpackage.awnl
    public final void b(Activity activity, int i, Intent intent) {
        if (i == -1) {
            this.a.B();
        }
    }
}
