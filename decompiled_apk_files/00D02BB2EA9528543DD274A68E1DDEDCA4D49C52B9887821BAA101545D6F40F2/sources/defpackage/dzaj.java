package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dzaj  reason: default package */
/* loaded from: classes6.dex */
public final class dzaj implements dzak, dzbc {
    dzft<dzak> a;
    public volatile boolean b;

    @Override // defpackage.dzak
    public final void SQ() {
        dzak[] dzakVarArr;
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            dzft<dzak> dzftVar = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (dzftVar == null) {
                return;
            }
            for (dzak dzakVar : dzftVar.d) {
                if (dzakVar instanceof dzak) {
                    try {
                        dzakVar.SQ();
                    } catch (Throwable th) {
                        dzas.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw dzfo.a((Throwable) arrayList.get(0));
            }
            throw new dzar(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T[], java.lang.Object[]] */
    @Override // defpackage.dzbc
    public final boolean b(dzak dzakVar) {
        dzak dzakVar2;
        dzak dzakVar3;
        dzbm.a(dzakVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    dzft<dzak> dzftVar = this.a;
                    if (dzftVar == null) {
                        dzftVar = new dzft<>();
                        this.a = dzftVar;
                    }
                    dzak[] dzakVarArr = dzftVar.d;
                    int i = dzftVar.a;
                    int a = dzft.a(dzakVar.hashCode()) & i;
                    dzak dzakVar4 = dzakVarArr[a];
                    if (dzakVar4 != null) {
                        if (!dzakVar4.equals(dzakVar)) {
                            do {
                                a = (a + 1) & i;
                                dzakVar3 = dzakVarArr[a];
                                if (dzakVar3 == null) {
                                }
                            } while (!dzakVar3.equals(dzakVar));
                        }
                        return true;
                    }
                    dzakVarArr[a] = dzakVar;
                    int i2 = dzftVar.b + 1;
                    dzftVar.b = i2;
                    if (i2 >= dzftVar.c) {
                        dzak[] dzakVarArr2 = dzftVar.d;
                        int length = dzakVarArr2.length;
                        int i3 = length + length;
                        int i4 = i3 - 1;
                        ?? r6 = new Object[i3];
                        while (true) {
                            int i5 = i2 - 1;
                            if (i2 == 0) {
                                break;
                            }
                            while (true) {
                                length--;
                                dzakVar2 = dzakVarArr2[length];
                                if (dzakVar2 != null) {
                                    break;
                                }
                            }
                            int a2 = dzft.a(dzakVar2.hashCode()) & i4;
                            if (r6[a2] != 0) {
                                do {
                                    a2 = (a2 + 1) & i4;
                                } while (r6[a2] != 0);
                            }
                            r6[a2] = dzakVarArr2[length];
                            i2 = i5;
                        }
                        dzftVar.a = i4;
                        dzftVar.c = (int) (i3 * 0.75f);
                        dzftVar.d = r6;
                    }
                    return true;
                }
            }
        }
        dzakVar.SQ();
        return false;
    }

    @Override // defpackage.dzbc
    public final boolean c(dzak dzakVar) {
        dzak[] dzakVarArr;
        int i;
        int a;
        dzak dzakVar2;
        dzak dzakVar3;
        dzbm.a(dzakVar, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            dzft<dzak> dzftVar = this.a;
            if (dzftVar != null && (dzakVar2 = (dzakVarArr = dzftVar.d)[(a = dzft.a(dzakVar.hashCode()) & (i = dzftVar.a))]) != null) {
                if (!dzakVar2.equals(dzakVar)) {
                    do {
                        a = (a + 1) & i;
                        dzakVar3 = dzakVarArr[a];
                        if (dzakVar3 != null) {
                        }
                    } while (!dzakVar3.equals(dzakVar));
                    dzftVar.b(a, dzakVarArr, i);
                } else {
                    dzftVar.b(a, dzakVarArr, i);
                }
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.dzbc
    public final void d(dzak dzakVar) {
        if (c(dzakVar)) {
            dzakVar.SQ();
        }
    }
}
