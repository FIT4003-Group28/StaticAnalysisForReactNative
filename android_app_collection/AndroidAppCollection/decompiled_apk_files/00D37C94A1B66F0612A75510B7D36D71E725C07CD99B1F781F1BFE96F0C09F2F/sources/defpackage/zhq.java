package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: zhq  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zhq implements aypw {
    private final /* synthetic */ int f;
    public static final /* synthetic */ zhq e = new zhq(4);
    public static final /* synthetic */ zhq d = new zhq(3);
    public static final /* synthetic */ zhq c = new zhq(2);
    public static final /* synthetic */ zhq b = new zhq(1);
    public static final /* synthetic */ zhq a = new zhq();

    private /* synthetic */ zhq() {
    }

    private /* synthetic */ zhq(int i) {
        this.f = i;
    }

    @Override // defpackage.aypw
    public final void a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            ((amuf) obj).h(obj2);
        } else if (i == 1) {
            ampr amprVar = (ampr) obj2;
            ((amum) obj).f(amprVar.a, amprVar.b);
        } else if (i == 2) {
            ((amvl) obj).c(obj2);
        } else if (i == 3) {
            Intent intent = (Intent) obj2;
            apzg apzgVar = ((apgp) obj).h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar == null) {
                return;
            }
            intent.putExtra("notification_opt_out_dialog_command", apzgVar.toByteArray());
        } else {
            apgp apgpVar = (apgp) obj;
            Intent intent2 = (Intent) obj2;
            apzg apzgVar2 = apgpVar.g;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            agee.f(intent2, apzgVar2);
            asvv asvvVar = apgpVar.i;
            if (asvvVar == null) {
                asvvVar = asvv.b;
            }
            agec.c(intent2, asvvVar);
        }
    }
}
