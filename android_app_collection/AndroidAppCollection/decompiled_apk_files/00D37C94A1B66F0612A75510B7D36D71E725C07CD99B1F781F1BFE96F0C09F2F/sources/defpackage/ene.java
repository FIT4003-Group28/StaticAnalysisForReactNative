package defpackage;

import android.content.Context;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: ene  reason: default package */
/* loaded from: classes3.dex */
public final class ene {
    public boolean a;

    public ene() {
        this.a = false;
    }

    public ene(Context context) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
