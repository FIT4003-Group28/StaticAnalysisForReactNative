package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aypf  reason: default package */
/* loaded from: classes2.dex */
public final class aypf implements aypg, ayqh {
    azor a;
    public volatile boolean b;

    public aypf() {
    }

    public aypf(aypg... aypgVarArr) {
        this.a = new azor(aypgVarArr.length + 1);
        for (aypg aypgVar : aypgVarArr) {
            ayrd.b(aypgVar, "A Disposable in the disposables array is null");
            this.a.b(aypgVar);
        }
    }

    static final void h(azor azorVar) {
        Object[] objArr;
        if (azorVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : azorVar.d) {
            if (obj instanceof aypg) {
                try {
                    ((aypg) obj).qr();
                } catch (Throwable th) {
                    bapv.j(th);
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
            throw azom.b((Throwable) arrayList.get(0));
        }
        throw new aypo(arrayList);
    }

    public final int a() {
        int i = 0;
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            if (this.b) {
                return 0;
            }
            azor azorVar = this.a;
            if (azorVar != null) {
                i = azorVar.b;
            }
            return i;
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            azor azorVar = this.a;
            this.a = null;
            h(azorVar);
        }
    }

    @Override // defpackage.ayqh
    public final boolean d(aypg aypgVar) {
        ayrd.b(aypgVar, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    azor azorVar = this.a;
                    if (azorVar == null) {
                        azorVar = new azor(16, null);
                        this.a = azorVar;
                    }
                    azorVar.b(aypgVar);
                    return true;
                }
            }
        }
        aypgVar.qr();
        return false;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ayqh
    public final boolean f(aypg aypgVar) {
        Object[] objArr;
        int i;
        int a;
        Object obj;
        Object obj2;
        ayrd.b(aypgVar, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            azor azorVar = this.a;
            if (azorVar != null && (obj = (objArr = azorVar.d)[(a = azor.a(aypgVar.hashCode()) & (i = azorVar.a))]) != null) {
                if (!obj.equals(aypgVar)) {
                    do {
                        a = (a + 1) & i;
                        obj2 = objArr[a];
                        if (obj2 != null) {
                        }
                    } while (!obj2.equals(aypgVar));
                    azorVar.c(a, objArr, i);
                } else {
                    azorVar.c(a, objArr, i);
                }
                return true;
            }
            return false;
        }
    }

    public final void g(aypg... aypgVarArr) {
        ayrd.b(aypgVarArr, "disposables is null");
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    azor azorVar = this.a;
                    if (azorVar == null) {
                        azorVar = new azor(aypgVarArr.length + 1);
                        this.a = azorVar;
                    }
                    int length = aypgVarArr.length;
                    while (i < length) {
                        aypg aypgVar = aypgVarArr[i];
                        ayrd.b(aypgVar, "A Disposable in the disposables array is null");
                        azorVar.b(aypgVar);
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = aypgVarArr.length;
        while (i < length2) {
            aypgVarArr[i].qr();
            i++;
        }
    }

    @Override // defpackage.ayqh
    public final void i(aypg aypgVar) {
        if (f(aypgVar)) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            azor azorVar = this.a;
            this.a = null;
            h(azorVar);
        }
    }
}
