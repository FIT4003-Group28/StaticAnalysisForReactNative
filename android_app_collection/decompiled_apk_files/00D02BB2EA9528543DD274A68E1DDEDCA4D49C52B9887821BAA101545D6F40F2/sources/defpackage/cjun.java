package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/* compiled from: PG */
/* renamed from: cjun  reason: default package */
/* loaded from: classes.dex */
public final class cjun {
    private final Stack<cjsa> a = new Stack<>();

    public final synchronized boolean a() {
        return this.a.isEmpty();
    }

    public final List<cjsa> b() {
        return dcdc.r(this.a);
    }

    public final synchronized void c(cjsa cjsaVar) {
        this.a.add(cjsaVar);
    }

    public final synchronized cjsa d() {
        return this.a.pop();
    }

    public final synchronized cjsa e() {
        return this.a.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final cjsa f(@dzsi cjtg cjtgVar) {
        if (cjtgVar == null) {
            return null;
        }
        ArrayList a = dchl.a();
        a.addAll(b());
        int size = a.size();
        int i = 0;
        while (i < size) {
            cjsa cjsaVar = (cjsa) a.get(i);
            i++;
            if (cjtgVar.equals(cjsaVar.d)) {
                return cjsaVar;
            }
        }
        return null;
    }
}
