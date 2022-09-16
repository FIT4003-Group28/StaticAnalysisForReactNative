package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqj  reason: default package */
/* loaded from: classes2.dex */
public final class aqj implements u {
    public final aqp a;
    public final aqg b;
    public boolean c = false;

    public aqj(aqp aqpVar, aqg aqgVar) {
        this.a = aqpVar;
        this.b = aqgVar;
    }

    @Override // defpackage.u
    public final void a(Object obj) {
        if (aqh.b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("  onLoadFinished in ");
            sb.append(this.a);
            sb.append(": ");
            sb.append(aqp.e(obj));
        }
        this.c = true;
        vgg vggVar = (vgg) this.b;
        vggVar.a.clear();
        vggVar.a.addAll((List) obj);
        vggVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.b.toString();
    }
}
