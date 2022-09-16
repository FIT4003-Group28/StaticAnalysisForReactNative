package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: esk  reason: default package */
/* loaded from: classes6.dex */
final class esk<T> implements dzsj<T> {
    final /* synthetic */ esl a;
    private final int b;

    public esk(esl eslVar, int i) {
        this.a = eslVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) this.a.b();
        }
        esl eslVar = this.a;
        akox ap = eslVar.a.ap();
        alec bJ = eslVar.a.bJ();
        Resources c = eslVar.a.eW.a.c();
        dxjg.e(c);
        return (T) new zzh(ap, bJ, c);
    }
}
