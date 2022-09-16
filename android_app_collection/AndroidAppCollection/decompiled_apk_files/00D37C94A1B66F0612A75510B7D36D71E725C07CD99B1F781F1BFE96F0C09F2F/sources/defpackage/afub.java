package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: afub  reason: default package */
/* loaded from: classes.dex */
public final class afub implements yjo {
    private final axnm a;
    private final /* synthetic */ int b;

    public afub(axnm axnmVar) {
        this.a = axnmVar;
    }

    public afub(axnm axnmVar, int i) {
        this.b = i;
        this.a = axnmVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        int i = this.b;
        if (i == 0) {
            ((afug) this.a.get()).g(aqll.b(((Integer) bundle.get("tier_type")).intValue()));
            return 0;
        } else if (i == 1) {
            ((afug) this.a.get()).f();
            return 0;
        } else {
            ((akye) this.a.get()).a();
            return 0;
        }
    }
}
