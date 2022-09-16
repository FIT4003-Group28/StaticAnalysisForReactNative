package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cogr  reason: default package */
/* loaded from: classes5.dex */
final class cogr implements degu<Object> {
    final /* synthetic */ cogs a;
    final /* synthetic */ cohh b;

    public cogr(cogs cogsVar, cohh cohhVar) {
        this.a = cogsVar;
        this.b = cohhVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cohh cohhVar = this.b;
        try {
            cohhVar.d.f(new Status(8, dbue.g(th)), cohhVar.b.a() - cohhVar.c);
        } catch (RemoteException unused) {
            cohhVar.a.b();
        }
    }

    @Override // defpackage.degu
    public final void b(Object obj) {
        synchronized (this.a.a) {
            if (this.a.a.isEmpty()) {
                this.b.a(null, null);
                return;
            }
            dbsi<dgyq, byte[]> removeFirst = this.a.a.removeFirst();
            this.b.a(removeFirst.b, removeFirst.a.bS());
        }
    }
}
