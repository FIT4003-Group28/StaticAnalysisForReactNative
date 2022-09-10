package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fxk  reason: default package */
/* loaded from: classes6.dex */
public final class fxk<T> implements dzsj<T> {
    final /* synthetic */ fxl a;
    private final int b;

    public fxk(fxl fxlVar, int i) {
        this.a = fxlVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i != 0) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? (T) new crgh(this.a.c()) : (T) this.a.b() : (T) this.a.a() : (T) dbpy.a : (T) false;
        }
        fxl fxlVar = this.a;
        Object obj2 = fxlVar.a;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = fxlVar.a;
                if (obj instanceof dxjf) {
                    Application a = fxlVar.b.a.a();
                    dxjg.e(a);
                    obj = audy.c(a);
                    dxjc.d(fxlVar.a, obj);
                    fxlVar.a = obj;
                }
            }
            obj2 = obj;
        }
        return (T) ((atsr) obj2);
    }
}
