package defpackage;

import android.content.Intent;
import android.os.Binder;
/* compiled from: PG */
/* renamed from: agxm  reason: default package */
/* loaded from: classes.dex */
public final class agxm extends Binder {
    public final /* synthetic */ agxn a;

    public agxm(agxn agxnVar) {
        this.a = agxnVar;
    }

    public final String a() {
        return ((agyb) this.a.e).f;
    }

    public final void b() {
        agxn agxnVar = this.a;
        ahdm.a(agxnVar, new Intent(agxnVar, agxnVar.getClass()));
    }
}
