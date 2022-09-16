package defpackage;

import android.graphics.Typeface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alkx  reason: default package */
/* loaded from: classes.dex */
public final class alkx implements almj {
    final /* synthetic */ alky a;
    private final /* synthetic */ int b;

    public alkx(alky alkyVar) {
        this.a = alkyVar;
    }

    public alkx(alky alkyVar, int i) {
        this.b = i;
        this.a = alkyVar;
    }

    @Override // defpackage.almj
    public final void a(Typeface typeface) {
        if (this.b == 0) {
            alky alkyVar = this.a;
            if (!alkyVar.x(typeface)) {
                return;
            }
            alkyVar.h();
            return;
        }
        alky alkyVar2 = this.a;
        if (!alkyVar2.w(typeface)) {
            return;
        }
        alkyVar2.h();
    }
}
