package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: adoq  reason: default package */
/* loaded from: classes.dex */
final class adoq implements Handler.Callback {
    final /* synthetic */ ados a;

    public adoq(ados adosVar) {
        this.a = adosVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ylr.c();
        ados adosVar = this.a;
        adnw adnwVar = adosVar.i;
        if (adnwVar == null) {
            return true;
        }
        if (adosVar.g && !adosVar.c.r()) {
            ados adosVar2 = this.a;
            if (!adosVar2.j) {
                adosVar2.d.g(adosVar2.f);
                this.a.j = true;
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        bhc bhcVar = message.what == 2 ? (bhc) message.obj : null;
        if (bhcVar == null) {
            arrayList.addAll(bhd.i());
        } else {
            arrayList.add(bhcVar);
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            bhc bhcVar2 = (bhc) arrayList.get(i);
            i++;
            if (adgl.c(bhcVar2.c, adnwVar.d)) {
                this.a.b(bhcVar2);
                break;
            }
        }
        return true;
    }
}
