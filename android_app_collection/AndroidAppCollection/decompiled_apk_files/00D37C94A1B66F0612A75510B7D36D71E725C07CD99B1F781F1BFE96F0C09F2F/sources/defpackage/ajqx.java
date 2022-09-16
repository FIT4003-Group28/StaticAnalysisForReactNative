package defpackage;
/* compiled from: PG */
/* renamed from: ajqx  reason: default package */
/* loaded from: classes.dex */
public final class ajqx {
    private static final ajqx b = new ajqx(0, 1);
    public final int a;

    public ajqx(int i, int i2) {
        boolean z = true;
        aqxo.p(i >= 0);
        aqxo.p(i2 <= i ? false : z);
        this.a = i2;
    }

    public static final ajqx a(ajrs ajrsVar) {
        Object c = ajrsVar.c("rowData");
        return c instanceof ajqx ? (ajqx) c : b;
    }

    public final boolean b() {
        return this.a == 1;
    }
}
