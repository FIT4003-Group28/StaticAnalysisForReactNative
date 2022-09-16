package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rdx  reason: default package */
/* loaded from: classes4.dex */
public final class rdx {
    public final Activity a;
    public final amqo b;

    public rdx(final Activity activity) {
        this.a = activity;
        this.b = new amqo() { // from class: rdv
            @Override // defpackage.amqo
            public final Object get() {
                return rdz.a(activity);
            }
        };
    }
}
