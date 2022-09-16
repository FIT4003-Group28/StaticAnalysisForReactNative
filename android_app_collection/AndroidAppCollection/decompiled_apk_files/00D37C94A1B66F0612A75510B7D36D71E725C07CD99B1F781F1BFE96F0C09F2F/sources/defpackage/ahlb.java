package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: ahlb  reason: default package */
/* loaded from: classes.dex */
public class ahlb extends ahmh implements Iterable {
    private ahmf c;
    private final String b = getClass().getSimpleName();
    private final LinkedList a = new LinkedList();
    public boolean d = false;

    @Override // defpackage.ahmf
    public void i() {
        String valueOf = String.valueOf(this.b);
        if (valueOf.length() != 0) {
            "Shutting down renderer on ".concat(valueOf);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).i();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }

    @Override // defpackage.ahmf
    public void j(ahjy ahjyVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).j(ahjyVar);
        }
    }

    @Override // defpackage.ahmf
    public void m(ahjy ahjyVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).m(ahjyVar);
        }
    }

    @Override // defpackage.ahmf
    public void n(float f, float f2, float f3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahmf) it.next()).n(f, f2, f3);
        }
    }

    @Override // defpackage.ahmf
    public boolean o(ahjy ahjyVar) {
        if (v()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ahmf ahmfVar = (ahmf) it.next();
            if (!ahmfVar.v() && ahmfVar.o(ahjyVar)) {
                return true;
            }
        }
        return false;
    }

    public final void q(ahmf ahmfVar) {
        r(this.a.size(), ahmfVar);
    }

    @Override // defpackage.ahmf
    public void qQ(ahoh ahohVar) {
        if (!v()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ahmf ahmfVar = (ahmf) it.next();
                if (!ahmfVar.v()) {
                    ahmfVar.qQ(ahohVar);
                }
            }
        }
    }

    @Override // defpackage.ahmf
    public void qR(boolean z, ahjy ahjyVar) {
        ahmf ahmfVar = this.c;
        ahmf ahmfVar2 = null;
        if (ahmfVar != null) {
            ahmfVar.qR(false, ahjyVar);
            this.c = null;
        }
        if (z) {
            Iterator it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ahmf ahmfVar3 = (ahmf) it.next();
                if (!ahmfVar3.v() && ahmfVar3.o(ahjyVar)) {
                    ahmfVar2 = ahmfVar3;
                    break;
                }
            }
            this.c = ahmfVar2;
            if (ahmfVar2 == null) {
                return;
            }
            ahmfVar2.qR(true, ahjyVar);
        }
    }

    public final void r(int i, ahmf ahmfVar) {
        if (this.a.contains(ahmfVar)) {
            String str = this.b;
            String simpleName = ahmfVar.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(simpleName).length());
            sb.append(str);
            sb.append(" NOT adding child - already has been added ");
            sb.append(simpleName);
            zep.l(sb.toString());
            return;
        }
        String str2 = this.b;
        String simpleName2 = ahmfVar.getClass().getSimpleName();
        String.valueOf(str2).length();
        String.valueOf(simpleName2).length();
        this.a.add(i, ahmfVar);
        ahmfVar.u(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean s() {
        return this.c != null;
    }
}
