package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abxz  reason: default package */
/* loaded from: classes.dex */
public final class abxz implements abzk {
    final /* synthetic */ abyk a;
    private int b = 5;

    public abxz(abyk abykVar) {
        this.a = abykVar;
    }

    @Override // defpackage.abzk
    public final void a(athj athjVar, List list) {
        if (!this.a.d.d()) {
            return;
        }
        abyk abykVar = this.a;
        abykVar.X = athjVar;
        abykVar.g(list);
        String.valueOf(String.valueOf(athjVar)).length();
        abyp abypVar = this.a.j;
        int i = abypVar.a;
        aqxo.y(i == 9 || i == 8 || i == 11 || i == 10);
        abypVar.e = true;
        abypVar.h();
    }

    @Override // defpackage.abzk
    public final void b(int i, String str) {
        if (!this.a.d.d()) {
            return;
        }
        if (i == 33) {
            this.a.b(false);
            this.a.i(33, str, false);
            return;
        }
        int i2 = this.b - 1;
        this.b = i2;
        StringBuilder sb = new StringBuilder(69);
        sb.append("Stop stream failed: status=");
        sb.append(i);
        sb.append(", attemptsRemaining=");
        sb.append(i2);
        zep.b(sb.toString());
        if (this.b <= 0) {
            this.a.b(false);
        } else {
            this.a.t.postDelayed(new Runnable() { // from class: abxy
                @Override // java.lang.Runnable
                public final void run() {
                    abxz abxzVar = abxz.this;
                    abzk abzkVar = this;
                    abyk abykVar = abxzVar.a;
                    abykVar.l.e(abykVar.z, abzkVar);
                }
            }, 400L);
        }
    }
}
