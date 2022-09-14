package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: nov  reason: default package */
/* loaded from: classes7.dex */
public final class nov {
    private int b;
    public final ArrayList<nof> a = new ArrayList<>();
    private final ArrayList<nof> c = new ArrayList<>();

    public final void a() {
        bvrj.UI_THREAD.c();
        this.b++;
    }

    public final void b() {
        bvrj.UI_THREAD.c();
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.c.addAll(this.a);
            ArrayList<nof> arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                nof nofVar = arrayList.get(i2);
                dbsk.l(nofVar.a.c);
                nog nogVar = nofVar.a;
                if (nogVar.a) {
                    nogVar.l(nogVar.b);
                    nofVar.a.a = false;
                }
            }
            this.c.clear();
        }
    }

    public final boolean c() {
        bvrj.UI_THREAD.c();
        return this.b > 0;
    }
}
