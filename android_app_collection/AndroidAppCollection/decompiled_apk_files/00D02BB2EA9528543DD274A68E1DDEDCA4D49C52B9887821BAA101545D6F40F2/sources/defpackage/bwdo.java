package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwdo  reason: default package */
/* loaded from: classes4.dex */
public final class bwdo implements degu<Boolean> {
    final /* synthetic */ ResolveInfo a;
    final /* synthetic */ Intent b;
    final /* synthetic */ bwdr c;

    public bwdo(bwdr bwdrVar, ResolveInfo resolveInfo, Intent intent) {
        this.c = bwdrVar;
        this.a = resolveInfo;
        this.b = intent;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            bwdr bwdrVar = this.c;
            ResolveInfo resolveInfo = this.a;
            bwfs[] aN = bwdrVar.aN();
            if (aN == null) {
                return;
            }
            for (bwfs bwfsVar : aN) {
                bwfsVar.a(bwdrVar.ae, bwdrVar.af, resolveInfo);
            }
        }
    }
}
