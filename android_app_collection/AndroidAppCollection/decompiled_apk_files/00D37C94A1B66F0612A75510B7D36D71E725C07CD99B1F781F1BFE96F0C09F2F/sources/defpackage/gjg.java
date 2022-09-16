package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: gjg  reason: default package */
/* loaded from: classes3.dex */
public final class gjg implements aafl {
    private final jxn a;
    private final /* synthetic */ int b;

    public gjg(jxn jxnVar, int i) {
        this.b = i;
        jxnVar.getClass();
        this.a = jxnVar;
    }

    public gjg(jxn jxnVar) {
        jxnVar.getClass();
        this.a = jxnVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.b == 0) {
            this.a.e(true);
        } else {
            this.a.e(false);
        }
    }
}
