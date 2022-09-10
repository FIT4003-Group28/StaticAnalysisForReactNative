package defpackage;

import android.content.Intent;
import java.util.List;
/* compiled from: PG */
/* renamed from: dajm  reason: default package */
/* loaded from: classes5.dex */
final class dajm implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ dakq b;
    final /* synthetic */ dajn c;

    public dajm(dajn dajnVar, List list, dakq dakqVar) {
        this.c = dajnVar;
        this.a = list;
        this.b = dakqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dajo dajoVar = this.c.b;
            for (Intent intent : this.a) {
                if (!dajoVar.a.b(intent.getStringExtra("split_id")).exists()) {
                    dajn dajnVar = this.c;
                    List<Intent> list = this.a;
                    dakq dakqVar = this.b;
                    Integer b = dajnVar.b(list);
                    if (b == null) {
                        return;
                    }
                    if (b.intValue() == 0) {
                        dakqVar.b();
                        return;
                    } else {
                        dakqVar.c(b.intValue());
                        return;
                    }
                }
            }
            dajn dajnVar2 = this.c;
            dakq dakqVar2 = this.b;
            try {
                if (!dajk.b(dank.a(dajnVar2.a), true)) {
                    dakqVar2.c(-12);
                } else {
                    dakqVar2.a();
                }
            } catch (Exception unused) {
                dakqVar2.c(-12);
            }
        } catch (Exception unused2) {
            this.b.c(-11);
        }
    }
}
