package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afiz  reason: default package */
/* loaded from: classes2.dex */
final class afiz implements akey {
    final /* synthetic */ Intent a;
    final /* synthetic */ String b;
    final /* synthetic */ afja c;

    public afiz(afja afjaVar, Intent intent, String str) {
        this.c = afjaVar;
        this.a = intent;
        this.b = str;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        dbsk.l(!this.c.c.a().j().m());
        this.c.d.a().f(this.c.a, this.a, 1);
        if (!dbsd.a(this.b, this.c.d())) {
            this.c.b.a().p(true);
        }
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
