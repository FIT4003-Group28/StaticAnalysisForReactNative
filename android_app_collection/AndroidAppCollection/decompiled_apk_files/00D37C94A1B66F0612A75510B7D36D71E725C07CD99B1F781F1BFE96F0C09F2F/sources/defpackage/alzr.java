package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: alzr  reason: default package */
/* loaded from: classes.dex */
public final class alzr implements ambk {
    private final dt a;
    private aby b;
    private aby c;
    private final amhu d;

    public alzr(dt dtVar, amhu amhuVar) {
        this.a = dtVar;
        this.d = amhuVar;
    }

    @Override // defpackage.ambk
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.ambk
    public final aby b() {
        return this.c;
    }

    @Override // defpackage.ambk
    public final aby c() {
        return this.b;
    }

    @Override // defpackage.ambk
    public final void d(abw abwVar, abw abwVar2) {
        this.b = this.a.registerForActivityResult(new acj(), abwVar);
        this.c = this.a.registerForActivityResult(new acj(), abwVar2);
    }

    @Override // defpackage.ambk
    public final boolean e() {
        return this.a.isChangingConfigurations();
    }

    @Override // defpackage.ambk
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.ambk
    public final boolean g() {
        return this.d.b().Z();
    }
}
