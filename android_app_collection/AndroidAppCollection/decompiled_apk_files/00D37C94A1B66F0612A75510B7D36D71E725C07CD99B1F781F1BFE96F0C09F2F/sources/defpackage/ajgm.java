package defpackage;

import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: ajgm  reason: default package */
/* loaded from: classes.dex */
final class ajgm extends gt {
    final /* synthetic */ String a;
    final /* synthetic */ ajgn b;

    public ajgm(String str, ajgn ajgnVar) {
        this.a = str;
        this.b = ajgnVar;
    }

    @Override // defpackage.gt
    public final void a(Typeface typeface) {
        synchronized (ajgo.s) {
            ajgo.s.put(this.a, ajgo.b(typeface, ajgo.a(this.b)));
        }
    }

    @Override // defpackage.gt
    public final void e() {
    }
}
