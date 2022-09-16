package defpackage;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: amsd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amsd implements BinaryOperator {
    private final /* synthetic */ int e;
    public static final /* synthetic */ amsd d = new amsd(3);
    public static final /* synthetic */ amsd c = new amsd(2);
    public static final /* synthetic */ amsd b = new amsd(1);
    public static final /* synthetic */ amsd a = new amsd();

    private /* synthetic */ amsd() {
    }

    private /* synthetic */ amsd(int i) {
        this.e = i;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.e;
        if (i != 0 && i != 1 && i == 2) {
            return function.getClass();
        }
        return function.getClass();
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            amum amumVar = (amum) obj;
            amumVar.e((amum) obj2);
            return amumVar;
        } else if (i == 1) {
            amuf amufVar = (amuf) obj;
            amuf amufVar2 = (amuf) obj2;
            amufVar.a(amufVar2.a, amufVar2.b);
            return amufVar;
        } else if (i == 2) {
            amvi amviVar = (amvi) obj;
            for (amxt amxtVar : ((amvi) obj2).a) {
                amviVar.a(amxtVar);
            }
            return amviVar;
        } else {
            amvl amvlVar = (amvl) obj;
            amvlVar.l((amvl) obj2);
            return amvlVar;
        }
    }
}
