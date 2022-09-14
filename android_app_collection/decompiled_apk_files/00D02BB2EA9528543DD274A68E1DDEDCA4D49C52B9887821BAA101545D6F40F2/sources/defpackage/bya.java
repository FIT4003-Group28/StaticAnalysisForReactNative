package defpackage;

import android.graphics.Bitmap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bya  reason: default package */
/* loaded from: classes.dex */
public final class bya implements bxy {
    int a;
    public Bitmap.Config b;
    private final byb c;

    public bya(byb bybVar) {
        this.c = bybVar;
    }

    @Override // defpackage.bxy
    public final void a() {
        this.c.b(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bya) {
            bya byaVar = (bya) obj;
            if (this.a == byaVar.a && cjp.j(this.b, byaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return byc.c(this.a, this.b);
    }
}
