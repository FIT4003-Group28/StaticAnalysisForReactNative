package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctc  reason: default package */
/* loaded from: classes3.dex */
public final class ctc {
    private final List a = new ArrayList();

    public final synchronized cif a(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ctb ctbVar = (ctb) this.a.get(i);
            if (ctbVar.a.isAssignableFrom(cls)) {
                return ctbVar.b;
            }
        }
        return null;
    }

    public final synchronized void b(Class cls, cif cifVar) {
        this.a.add(new ctb(cls, cifVar));
    }
}
