package defpackage;

import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: btjh  reason: default package */
/* loaded from: classes4.dex */
final class btjh implements btzi<diez, diff> {
    final /* synthetic */ btjj a;

    public btjh(btjj btjjVar) {
        this.a = btjjVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diez> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diez> btzrVar, diff diffVar) {
        final diff diffVar2 = diffVar;
        this.a.e.b(new Runnable(this, diffVar2) { // from class: btjg
            private final btjh a;
            private final diff b;

            {
                this.a = this;
                this.b = diffVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btjh btjhVar = this.a;
                dife difeVar = this.b.a;
                if (difeVar == null) {
                    difeVar = dife.b;
                }
                int a = difd.a(difeVar.a);
                boolean z = true;
                if (a == 0) {
                    a = 1;
                }
                Preference preference = btjhVar.a.a;
                if (a != 3 && a != 2) {
                    z = false;
                }
                preference.B(z);
            }
        }, bvrj.UI_THREAD);
    }
}
