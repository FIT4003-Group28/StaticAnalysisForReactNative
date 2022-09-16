package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: akdt  reason: default package */
/* loaded from: classes.dex */
public final class akdt extends akdu {
    final /* synthetic */ dt a;

    public akdt(dt dtVar) {
        this.a = dtVar;
    }

    @Override // defpackage.akdu
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.akdu
    public final eo b() {
        return this.a.getSupportFragmentManager();
    }

    @Override // defpackage.akdu
    public final void c(String[] strArr, int i) {
        this.a.requestPermissions(strArr, i);
    }
}
