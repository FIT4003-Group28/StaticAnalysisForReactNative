package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: acdc  reason: default package */
/* loaded from: classes.dex */
final class acdc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ acdh c;

    public acdc(acdh acdhVar, int i, int i2) {
        this.c = acdhVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acdd acddVar = this.c.g;
        if (acddVar != null) {
            int i = this.a;
            int i2 = this.b;
            accv accvVar = (accv) acddVar;
            acdn acdnVar = accvVar.f;
            if (acdnVar == null) {
                return;
            }
            try {
                acdnVar.d(i, i2);
            } catch (Exception e) {
                Log.e("RtmpConnection", "Error setting window size", e);
                accu accuVar = accvVar.b;
                if (accuVar == null) {
                    return;
                }
                accuVar.p();
            }
        }
    }
}
