package defpackage;
/* compiled from: PG */
/* renamed from: ajrd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajrd implements ampg {
    public final /* synthetic */ ajrf a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajrd(ajrf ajrfVar, int i) {
        this.b = i;
        this.a = ajrfVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return Integer.valueOf((int) zew.g(this.a.b, ((Float) obj).floatValue()));
            }
            return Integer.valueOf(zew.i(this.a.b, ((Integer) obj).intValue()));
        }
        return Integer.valueOf((int) zew.g(this.a.b, ((Float) obj).floatValue()));
    }
}
