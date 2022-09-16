package defpackage;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abum  reason: default package */
/* loaded from: classes.dex */
public final class abum implements acbr {
    final /* synthetic */ abus a;
    private boolean b;
    private boolean c;

    public abum(abus abusVar) {
        this.a = abusVar;
    }

    @Override // defpackage.acbr
    public final void a(acbt acbtVar) {
        abus abusVar = this.a;
        if (acbtVar == abusVar.j) {
            this.b = true;
        }
        if (acbtVar == abusVar.k) {
            this.c = true;
        }
        if (!this.b || !this.c) {
            return;
        }
        this.b = false;
        this.c = false;
        Handler handler = abusVar.c;
        handler.getClass();
        handler.post(abusVar.y);
    }
}
