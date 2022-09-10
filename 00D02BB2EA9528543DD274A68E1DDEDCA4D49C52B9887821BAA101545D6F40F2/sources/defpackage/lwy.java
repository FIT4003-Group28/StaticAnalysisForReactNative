package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lwy  reason: default package */
/* loaded from: classes7.dex */
public final class lwy implements dbty<arzw> {
    final /* synthetic */ Application a;
    final /* synthetic */ dxio b;
    final /* synthetic */ dxio c;
    final /* synthetic */ cqat d;

    public lwy(Application application, dxio dxioVar, dxio dxioVar2, cqat cqatVar) {
        this.a = application;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = cqatVar;
    }

    @Override // defpackage.dbty
    public final /* bridge */ /* synthetic */ arzw a() {
        return new arzw(this.a, this.b, this.c, this.d);
    }
}
