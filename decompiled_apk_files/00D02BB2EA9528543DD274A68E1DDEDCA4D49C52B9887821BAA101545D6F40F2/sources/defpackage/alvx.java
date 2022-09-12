package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: alvx  reason: default package */
/* loaded from: classes.dex */
public final class alvx implements alyg {
    private amze a;
    private akrx b;
    private final akry c;
    private final alyh d;

    public alvx(amze amzeVar, akry akryVar, alyh alyhVar, akrx akrxVar) {
        akrx akrxVar2 = akrx.UNKNOWN;
        this.a = amzeVar;
        this.b = akrxVar;
        this.c = akryVar;
        this.d = alyhVar;
    }

    @Override // defpackage.alyg
    public final alyh a() {
        return this.d;
    }

    @Override // defpackage.alyg
    public final akry b() {
        return this.c;
    }

    @Override // defpackage.alyg
    public final synchronized amze c() {
        return this.a;
    }

    @Override // defpackage.alyg
    public final synchronized void d(amze amzeVar) {
        this.a = amzeVar;
    }

    @Override // defpackage.alyg
    public final synchronized void e(akrx akrxVar) {
        this.b = akrxVar;
    }

    public final synchronized boolean equals(@dzsi Object obj) {
        amze amzeVar;
        akrx akrxVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alvx)) {
            return false;
        }
        alvx alvxVar = (alvx) obj;
        synchronized (alvxVar) {
            amzeVar = alvxVar.a;
            akrxVar = alvxVar.b;
        }
        if (dbsd.a(this.a, amzeVar) && dbsd.a(this.b, akrxVar) && dbsd.a(this.c, alvxVar.c)) {
            if (dbsd.a(this.d, alvxVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alyg
    public final int f() {
        return 0;
    }

    @Override // defpackage.alyg
    public final synchronized akrx g() {
        return this.b;
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
