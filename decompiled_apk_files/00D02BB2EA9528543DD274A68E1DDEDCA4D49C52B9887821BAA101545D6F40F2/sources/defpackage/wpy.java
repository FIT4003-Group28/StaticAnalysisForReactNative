package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: wpy  reason: default package */
/* loaded from: classes7.dex */
public class wpy implements wpm {
    private final wpw a;
    private final List<wpx> b;

    public wpy(eapd eapdVar, mw<eaow> mwVar, eaow eaowVar, Runnable runnable) {
        this.a = new wpw(runnable);
        ArrayList arrayList = new ArrayList();
        for (int i = 5; i <= 30; i += 5) {
            eaow c = eaow.c(i);
            if (!eapdVar.f(c).K()) {
                arrayList.add(new wpx(c, c.compareTo(eaowVar == null ? eaow.a : eaowVar) == 0, mwVar));
            }
        }
        this.b = arrayList;
    }

    @Override // defpackage.wpm
    public List<wpx> a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // defpackage.wpm
    /* renamed from: c */
    public wpw b() {
        return this.a;
    }
}
