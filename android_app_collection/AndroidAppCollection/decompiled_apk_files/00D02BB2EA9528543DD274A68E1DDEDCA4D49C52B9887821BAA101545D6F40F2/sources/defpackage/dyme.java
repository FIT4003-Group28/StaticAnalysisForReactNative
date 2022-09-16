package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dyme  reason: default package */
/* loaded from: classes6.dex */
final class dyme {
    private ArrayList<dymd> b = new ArrayList<>();
    public volatile dyfk a = dyfk.IDLE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dyfk dyfkVar) {
        dbsk.t(dyfkVar, "newState");
        if (this.a == dyfkVar || this.a == dyfk.SHUTDOWN) {
            return;
        }
        this.a = dyfkVar;
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList<dymd> arrayList = this.b;
        this.b = new ArrayList<>();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0);
        throw null;
    }
}
