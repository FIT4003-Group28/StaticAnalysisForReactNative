package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cnly  reason: default package */
/* loaded from: classes5.dex */
abstract class cnly<T> {
    final int a;
    final cpct<T> b = new cpct<>();
    final int c;
    final Bundle d;

    public cnly(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract boolean a();

    public abstract void b(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(T t) {
        this.b.a(t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(cnlz cnlzVar) {
        this.b.c(cnlzVar);
    }

    public final String toString() {
        int i = this.c;
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a());
        sb.append("}");
        return sb.toString();
    }
}
