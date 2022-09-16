package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ffe  reason: default package */
/* loaded from: classes6.dex */
final class ffe<T> implements dzsj<T> {
    final /* synthetic */ fff a;
    private final int b;

    public ffe(fff fffVar, int i) {
        this.a = fffVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            Application a = this.a.a.eW.a.a();
            dxjg.e(a);
            return (T) new bdin(a);
        }
        fff fffVar = this.a;
        return (T) new bdis(fffVar.a.ad(), fffVar.a.eW.il());
    }
}
