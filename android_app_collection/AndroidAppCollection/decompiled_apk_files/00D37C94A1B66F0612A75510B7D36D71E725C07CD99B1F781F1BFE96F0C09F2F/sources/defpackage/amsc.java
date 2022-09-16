package defpackage;

import j$.util.function.BiConsumer;
/* compiled from: PG */
/* renamed from: amsc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class amsc implements BiConsumer {
    private final /* synthetic */ int d;
    public static final /* synthetic */ amsc c = new amsc(2);
    public static final /* synthetic */ amsc b = new amsc(1);
    public static final /* synthetic */ amsc a = new amsc();

    private /* synthetic */ amsc() {
    }

    private /* synthetic */ amsc(int i) {
        this.d = i;
    }

    @Override // j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            ((amvi) obj).a((amxt) obj2);
        } else if (i == 1) {
            ((amuf) obj).h(obj2);
        } else {
            ((amvl) obj).c(obj2);
        }
    }

    @Override // j$.util.function.BiConsumer
    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.d;
        if (i != 0 && i == 1) {
            return biConsumer.getClass();
        }
        return biConsumer.getClass();
    }
}
