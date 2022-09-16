package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cohh  reason: default package */
/* loaded from: classes5.dex */
public final class cohh {
    public final cohg a;
    public final dbug b;
    public final long c;
    public final cohj d;

    public cohh(cohg cohgVar, cohj cohjVar, dbug dbugVar) {
        this.a = cohgVar;
        this.d = cohjVar;
        this.b = dbugVar;
        this.c = dbugVar.a();
    }

    public final void a(@dzsi byte[] bArr, @dzsi byte[] bArr2) {
        long a = this.b.a() - this.c;
        try {
            cohj cohjVar = this.d;
            coba cobaVar = null;
            coba b = bArr == null ? null : cobb.b(bArr);
            if (bArr2 != null) {
                cobaVar = cobb.b(bArr2);
            }
            cohjVar.e(b, cobaVar, a);
        } catch (RemoteException unused) {
            this.a.b();
        }
    }
}
