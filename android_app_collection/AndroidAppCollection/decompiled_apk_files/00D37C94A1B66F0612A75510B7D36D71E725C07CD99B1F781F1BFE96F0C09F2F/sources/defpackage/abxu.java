package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abxu  reason: default package */
/* loaded from: classes.dex */
public final class abxu implements abzk {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ abyk c;

    public abxu(abyk abykVar, int i, String str) {
        this.c = abykVar;
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.abzk
    public final void a(athj athjVar, List list) {
        if (!this.c.d.d()) {
            return;
        }
        this.c.X = athjVar;
        String.valueOf(String.valueOf(athjVar)).length();
        this.c.d(this.a, null);
        this.c.g(list);
    }

    @Override // defpackage.abzk
    public final void b(int i, String str) {
        if (!this.c.d.d()) {
            return;
        }
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(38);
        sb.append("Stop stream failed: status=");
        sb.append(i2);
        zep.b(sb.toString());
        this.c.d(this.a, this.b);
    }
}
