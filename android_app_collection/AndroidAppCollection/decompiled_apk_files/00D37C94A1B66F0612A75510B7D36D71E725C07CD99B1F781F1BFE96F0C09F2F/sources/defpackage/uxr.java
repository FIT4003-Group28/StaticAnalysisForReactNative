package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uxr  reason: default package */
/* loaded from: classes4.dex */
public final class uxr implements uuf {
    final /* synthetic */ ankx a;
    final /* synthetic */ uxt b;

    public uxr(uxt uxtVar, ankx ankxVar) {
        this.b = uxtVar;
        this.a = ankxVar;
    }

    @Override // defpackage.uuf
    public final void c(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(4, simpleName);
        this.b.a();
        this.b.b = this.a.b(new Runnable() { // from class: uxq
            @Override // java.lang.Runnable
            public final void run() {
                uxr uxrVar = uxr.this;
                uxrVar.b.a.a(6, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
