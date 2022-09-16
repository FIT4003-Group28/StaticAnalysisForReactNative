package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vnb  reason: default package */
/* loaded from: classes4.dex */
public final class vnb implements aniq {
    public List a;
    final /* synthetic */ vne b;

    public vnb(vne vneVar) {
        this.b = vneVar;
    }

    @Override // defpackage.aniq
    public final ankt a() {
        vne vneVar = this.b;
        amlc amlcVar = vneVar.e;
        String valueOf = String.valueOf(vneVar.a);
        amlp b = amlcVar.b(valueOf.length() != 0 ? "Initialize ".concat(valueOf) : new String("Initialize "));
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    vne vneVar2 = this.b;
                    this.a = vneVar2.f;
                    vneVar2.f = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            vnd vndVar = new vnd(this.b);
            for (anir anirVar : this.a) {
                try {
                    arrayList.add(anirVar.a(vndVar));
                } catch (Exception e) {
                    arrayList.add(anlz.p(e));
                }
            }
            ankt a = anlz.l(arrayList).a(new Callable() { // from class: vna
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    vnb vnbVar = vnb.this;
                    synchronized (vnbVar.b.d) {
                        vnbVar.a = null;
                    }
                    return null;
                }
            }, anjk.a);
            b.a(a);
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
