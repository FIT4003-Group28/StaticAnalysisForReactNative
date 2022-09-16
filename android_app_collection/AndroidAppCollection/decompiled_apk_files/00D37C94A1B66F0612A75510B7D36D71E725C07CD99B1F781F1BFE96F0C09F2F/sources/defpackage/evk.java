package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: evk  reason: default package */
/* loaded from: classes3.dex */
public class evk extends ymg {
    private final Intent a;

    public evk(Intent intent) {
        intent.getClass();
        this.a = intent;
    }

    public String a() {
        if (this.a.getComponent() != null) {
            return this.a.getComponent().getClassName();
        }
        return this.a.getAction();
    }
}
