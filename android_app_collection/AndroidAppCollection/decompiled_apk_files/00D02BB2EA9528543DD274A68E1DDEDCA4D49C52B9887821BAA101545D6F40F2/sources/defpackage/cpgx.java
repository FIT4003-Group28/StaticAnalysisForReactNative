package defpackage;

import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cpgx  reason: default package */
/* loaded from: classes5.dex */
final class cpgx implements Runnable {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ cphf b;

    public cpgx(cphf cphfVar, DataHolder dataHolder) {
        this.b = cphfVar;
        this.a = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cpgk cpgkVar = new cpgk(this.a);
        try {
            this.b.a.a(cpgkVar);
        } finally {
            cpgkVar.b();
        }
    }
}
