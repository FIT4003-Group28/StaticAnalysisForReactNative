package defpackage;

import android.content.pm.ResolveInfo;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: arup  reason: default package */
/* loaded from: classes2.dex */
public final class arup implements arxk {
    public final aruu a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public arup(aruv aruvVar, ResolveInfo resolveInfo) {
        this.a = aruvVar.a(resolveInfo);
        String str = resolveInfo.serviceInfo.packageName;
    }

    @Override // defpackage.arxk
    public final void a(arxm arxmVar) {
        this.b.set(false);
        this.a.a(new aruo(this, arxmVar));
    }
}
