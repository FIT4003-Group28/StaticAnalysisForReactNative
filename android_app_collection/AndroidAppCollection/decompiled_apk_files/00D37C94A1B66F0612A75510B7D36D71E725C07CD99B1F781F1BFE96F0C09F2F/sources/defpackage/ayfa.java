package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ayfa  reason: default package */
/* loaded from: classes2.dex */
final class ayfa {
    private ArrayList a = new ArrayList();
    private volatile axyt b = axyt.IDLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(axyt axytVar) {
        axytVar.getClass();
        if (this.b == axytVar || this.b == axyt.SHUTDOWN) {
            return;
        }
        this.b = axytVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        aztk aztkVar = (aztk) arrayList.get(0);
        throw null;
    }
}
