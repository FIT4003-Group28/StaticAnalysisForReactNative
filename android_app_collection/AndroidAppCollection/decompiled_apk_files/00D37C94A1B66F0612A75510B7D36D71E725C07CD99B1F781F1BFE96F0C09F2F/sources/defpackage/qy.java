package defpackage;
/* compiled from: PG */
/* renamed from: qy  reason: default package */
/* loaded from: classes4.dex */
final class qy {
    private static qy i;
    private static final Object j = new Object();
    qy a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Object h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qy a(int i2, int i3, int i4) {
        return c(i2, i3, i4, 0, 0, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qy b(int i2, int i3, Object obj) {
        return c(i2, i3, 0, 0, 0, 0, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qy c(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        qy qyVar;
        synchronized (j) {
            qyVar = i;
            if (qyVar == null) {
                qyVar = new qy();
            } else {
                i = qyVar.a;
                qyVar.a = null;
            }
            qyVar.b = i2;
            qyVar.c = i3;
            qyVar.d = i4;
            qyVar.e = i5;
            qyVar.f = i6;
            qyVar.g = i7;
            qyVar.h = obj;
        }
        return qyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.a = null;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.h = null;
        synchronized (j) {
            qy qyVar = i;
            if (qyVar != null) {
                this.a = qyVar;
            }
            i = this;
        }
    }
}
