package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: unf  reason: default package */
/* loaded from: classes.dex */
public final class unf extends afhx {
    public static final dbsl<afga> a = une.a;
    private final ros b;

    public unf(Intent intent, @dzsi String str, ros rosVar) {
        super(intent, str, afid.START_COMMUTE_SETUP);
        this.b = rosVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        Bundle extras = this.f.getExtras();
        boolean z = false;
        if (extras != null) {
            z = extras.getBoolean("StartCommuteSetupExitIfNoChangesMade", false);
        }
        this.b.j(z);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_START_COMMUTE_SETUP;
    }
}
