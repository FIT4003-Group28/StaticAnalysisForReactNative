package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qrb  reason: default package */
/* loaded from: classes4.dex */
public abstract class qrb {
    final int a;
    final rvh b = new rvh();
    final int c;
    final Bundle d;

    public qrb(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(qrc qrcVar) {
        this.b.a(qrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Object obj) {
        this.b.b(obj);
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
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
