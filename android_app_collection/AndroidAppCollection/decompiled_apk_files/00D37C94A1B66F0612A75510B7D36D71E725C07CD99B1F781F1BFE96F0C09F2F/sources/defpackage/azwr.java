package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: azwr  reason: default package */
/* loaded from: classes2.dex */
public class azwr implements azxb {
    public final azxt a = new azxt();

    public azwr() {
        ayme.f(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void a(azxa azxaVar) {
        azwx azwxVar = null;
        while (true) {
            azxw i = azxaVar.i();
            azwx azwxVar2 = i instanceof azwx ? (azwx) i : null;
            if (azwxVar2 == null) {
                break;
            } else if (azwxVar2.m()) {
                boolean z = azuy.a;
                if (azwxVar == null) {
                    azwxVar = azwxVar2;
                } else if (azwxVar instanceof ArrayList) {
                    ((ArrayList) azwxVar).add(azwxVar2);
                } else {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(azwxVar);
                    arrayList.add(azwxVar2);
                    azwxVar = arrayList;
                }
            } else {
                ((azyd) azwxVar2.g()).a.n();
            }
        }
        if (azwxVar == null) {
            return;
        }
        if (!(azwxVar instanceof ArrayList)) {
            azwxVar.c(azxaVar);
            return;
        }
        ArrayList arrayList2 = (ArrayList) azwxVar;
        int size = arrayList2.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((azwx) arrayList2.get(size)).c(azxaVar);
            if (i2 < 0) {
                return;
            }
            size = i2;
        }
    }

    private static final void b(azxa azxaVar) {
        a(azxaVar);
        throw null;
    }

    protected Object d(Object obj) {
        throw null;
    }

    protected String e() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final azxa f() {
        azxw i = this.a.i();
        azxa azxaVar = i instanceof azxa ? (azxa) i : null;
        if (azxaVar == null) {
            return null;
        }
        a(azxaVar);
        return azxaVar;
    }

    @Override // defpackage.azxb
    public final void g(Object obj) {
        Object d = d(obj);
        if (d == azwq.b) {
            return;
        }
        if (d == azwq.c) {
            azxa f = f();
            if (f == null) {
                return;
            }
            b(f);
        } else if (d instanceof azxa) {
            b((azxa) d);
        } else {
            throw new IllegalStateException(azst.a("trySend returned ", d).toString());
        }
    }

    public final String toString() {
        String a;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(banl.j(this));
        sb.append('@');
        sb.append(banl.k(this));
        sb.append('{');
        azxw h = this.a.h();
        if (h == this.a) {
            str = "EmptyQueue";
        } else {
            if (h instanceof azxa) {
                a = h.toString();
            } else {
                a = h instanceof azwx ? "ReceiveQueued" : azst.a("UNEXPECTED:", h);
            }
            azxw i = this.a.i();
            if (i != h) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a);
                sb2.append(",queueSize=");
                azxt azxtVar = this.a;
                int i2 = 0;
                for (azxw azxwVar = (azxw) azxtVar.g(); !azst.c(azxwVar, azxtVar); azxwVar = azxwVar.h()) {
                    if (azxwVar instanceof azxw) {
                        i2++;
                    }
                }
                sb2.append(i2);
                str = sb2.toString();
                if (i instanceof azxa) {
                    str = str + ",closedForSend=" + i;
                }
            } else {
                str = a;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(e());
        return sb.toString();
    }
}
