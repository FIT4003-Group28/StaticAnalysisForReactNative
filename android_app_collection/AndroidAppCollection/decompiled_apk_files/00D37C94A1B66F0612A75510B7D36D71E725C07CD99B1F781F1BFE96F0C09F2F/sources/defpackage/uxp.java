package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uxp  reason: default package */
/* loaded from: classes4.dex */
public final class uxp implements uue {
    final /* synthetic */ ankx a;
    final /* synthetic */ uxt b;

    public uxp(uxt uxtVar, ankx ankxVar) {
        this.b = uxtVar;
        this.a = ankxVar;
    }

    @Override // defpackage.uue
    public final void d(Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(3, simpleName);
        this.b.a();
        this.b.c = this.a.b(new Runnable() { // from class: uxo
            @Override // java.lang.Runnable
            public final void run() {
                uxp uxpVar = uxp.this;
                uxpVar.b.a.a(5, simpleName);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
