package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayug  reason: default package */
/* loaded from: classes2.dex */
public final class ayug extends AtomicInteger implements bamf {
    private static final long serialVersionUID = 6770240836423125754L;
    final bame a;
    final ayui b;
    final AtomicLong c = new AtomicLong();
    ayuh d;
    int e;
    long f;

    public ayug(bame bameVar, ayui ayuiVar) {
        this.a = bameVar;
        this.b = ayuiVar;
        this.d = ayuiVar.h;
    }

    @Override // defpackage.bamf
    public final void si() {
        ayug[] ayugVarArr;
        ayug[] ayugVarArr2;
        if (this.c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            ayui ayuiVar = this.b;
            do {
                ayugVarArr = (ayug[]) ayuiVar.f.get();
                int length = ayugVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (ayugVarArr[i] == this) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    ayugVarArr2 = ayui.c;
                } else {
                    ayug[] ayugVarArr3 = new ayug[length - 1];
                    System.arraycopy(ayugVarArr, 0, ayugVarArr3, 0, i);
                    System.arraycopy(ayugVarArr, i + 1, ayugVarArr3, i, (length - i) - 1);
                    ayugVarArr2 = ayugVarArr3;
                }
            } while (!ayuiVar.f.compareAndSet(ayugVarArr, ayugVarArr2));
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.b(this.c, j);
            this.b.ar(this);
        }
    }
}
