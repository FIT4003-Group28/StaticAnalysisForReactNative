package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: akwt  reason: default package */
/* loaded from: classes.dex */
public final class akwt implements yjo {
    private final axnm a;
    private final axnm b;

    public akwt(axnm axnmVar, axnm axnmVar2) {
        this.a = axnmVar;
        this.b = axnmVar2;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        if (((albq) this.b.get()).g().b) {
            ((akye) this.a.get()).a();
            return 0;
        }
        return 2;
    }
}
