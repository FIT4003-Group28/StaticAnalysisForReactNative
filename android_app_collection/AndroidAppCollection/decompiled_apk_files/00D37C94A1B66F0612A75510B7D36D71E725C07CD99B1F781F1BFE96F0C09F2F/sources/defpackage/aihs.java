package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aihs  reason: default package */
/* loaded from: classes.dex */
public final class aihs {
    private final List a;

    public aihs() {
        this.a = new ArrayList();
    }

    public aihs(List list) {
        this.a = list;
    }

    public final aihu a(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return (aihu) this.a.get(i);
    }

    public final synchronized crm b(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return cro.a;
        }
        for (crn crnVar : this.a) {
            if (crnVar.a(cls, cls2)) {
                return crnVar.b;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("No transcoder registered to transcode from ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final synchronized List c(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (crn crnVar : this.a) {
            if (crnVar.a(cls, cls2) && !arrayList.contains(crnVar.a)) {
                arrayList.add(crnVar.a);
            }
        }
        return arrayList;
    }

    public final synchronized void d(Class cls, Class cls2, crm crmVar) {
        this.a.add(new crn(cls, cls2, crmVar));
    }
}
