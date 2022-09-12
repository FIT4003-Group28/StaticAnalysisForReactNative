package defpackage;
/* compiled from: PG */
/* renamed from: cdks  reason: default package */
/* loaded from: classes4.dex */
final class cdks<T> implements aa<Boolean> {
    final /* synthetic */ x a;
    final /* synthetic */ v b;

    public cdks(x xVar, v vVar) {
        this.a = xVar;
        this.b = vVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(Boolean bool) {
        Boolean bool2 = bool;
        Boolean bool3 = (Boolean) this.b.h();
        if (bool3 != null) {
            x xVar = this.a;
            boolean z = false;
            if (bool3.booleanValue()) {
                dzvx.b(bool2, "otherValue");
                if (bool2.booleanValue()) {
                    z = true;
                }
            }
            xVar.g(Boolean.valueOf(z));
        }
    }
}
