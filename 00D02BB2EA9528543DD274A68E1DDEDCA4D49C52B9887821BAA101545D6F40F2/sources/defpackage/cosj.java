package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cosj  reason: default package */
/* loaded from: classes5.dex */
public final class cosj extends cosl {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cosu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosj(cosu cosuVar, String str, String str2, Bundle bundle, boolean z) {
        super(cosuVar);
        this.e = cosuVar;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = z;
    }

    @Override // defpackage.cosl
    public final void a() {
        this.e.f.n(this.a, this.b, this.c, this.d, this.f);
    }
}
