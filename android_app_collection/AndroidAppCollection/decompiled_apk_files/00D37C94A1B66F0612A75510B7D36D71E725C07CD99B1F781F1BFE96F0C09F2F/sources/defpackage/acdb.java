package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: acdb  reason: default package */
/* loaded from: classes.dex */
final class acdb implements Runnable {
    final /* synthetic */ acdh a;
    private final /* synthetic */ int b;

    public acdb(acdh acdhVar) {
        this.a = acdhVar;
    }

    public acdb(acdh acdhVar, int i) {
        this.b = i;
        this.a = acdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acdn acdnVar;
        if (this.b == 0) {
            acdd acddVar = this.a.g;
            if (acddVar == null || (acdnVar = ((accv) acddVar).f) == null) {
                return;
            }
            acdnVar.f(0);
            return;
        }
        acdh acdhVar = this.a;
        acdd acddVar2 = acdhVar.g;
        if (acddVar2 == null) {
            return;
        }
        int i = acdhVar.i;
        accv accvVar = (accv) acddVar2;
        acdn acdnVar2 = accvVar.f;
        if (acdnVar2 == null) {
            return;
        }
        try {
            aqxo.p(true);
            acdnVar2.a.clear();
            acdn.i(acdnVar2.a, 2, 0, 4, 3, 0);
            acdnVar2.a.putInt(i);
            acdnVar2.a.flip();
            acdnVar2.g(acdnVar2.a);
            acdnVar2.f(4);
            acdh acdhVar2 = ((accv) acddVar2).e;
            if (acdhVar2 == null) {
                return;
            }
            acdhVar2.l(i);
        } catch (Exception e) {
            Log.e("RtmpConnection", "Error sending acknowledgment", e);
            accu accuVar = accvVar.b;
            if (accuVar == null) {
                return;
            }
            accuVar.p();
        }
    }
}
