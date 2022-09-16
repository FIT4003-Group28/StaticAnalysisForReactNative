package defpackage;

import android.support.v7.widget.Toolbar;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: lgv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lgv implements Function {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgv(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return (Toolbar) this.a.cast(obj);
        }
        return (gto) this.a.cast((dp) obj);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }
}
