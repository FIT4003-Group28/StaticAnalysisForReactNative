package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ydk  reason: default package */
/* loaded from: classes4.dex */
final class ydk implements yiu {
    final /* synthetic */ ydl a;

    public ydk(ydl ydlVar) {
        this.a = ydlVar;
    }

    @Override // defpackage.yiu
    public final void kC(int i, int i2, Intent intent) {
        if (i == 1901) {
            if (i2 == -1) {
                for (ycn ycnVar : this.a.d) {
                    ycnVar.a.a.b();
                }
                this.a.d.clear();
            } else if (i2 == 0) {
                for (ycn ycnVar2 : this.a.d) {
                    ycnVar2.a.a.b();
                }
                this.a.d.clear();
            } else if (i2 == 1) {
                for (ycn ycnVar3 : this.a.d) {
                }
                this.a.d.clear();
            } else {
                String str = ydl.a;
                StringBuilder sb = new StringBuilder(56);
                sb.append("Unknown add instrument result code received: ");
                sb.append(i2);
                zep.c(str, sb.toString());
            }
        }
    }
}
