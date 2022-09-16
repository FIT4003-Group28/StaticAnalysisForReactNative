package defpackage;

import j$.util.function.Function;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: akry  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akry implements Function {
    public final /* synthetic */ NumberFormat a;
    private final /* synthetic */ int b;

    public /* synthetic */ akry(NumberFormat numberFormat, int i) {
        this.b = i;
        this.a = numberFormat;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return function.getClass();
        }
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        int i = this.b;
        if (i != 0 && i == 1) {
            return function.getClass();
        }
        return function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return this.a.format((Double) obj);
            }
            return this.a.format(((Double) obj).doubleValue() / 1000.0d);
        }
        return this.a.format(((Double) obj).doubleValue() * 100.0d);
    }
}
