package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ckcs  reason: default package */
/* loaded from: classes.dex */
public final class ckcs {
    @dzsi
    public final cnkr a;

    public ckcs() {
        this(null);
    }

    public ckcs(@dzsi cnkr cnkrVar) {
        this.a = cnkrVar;
    }

    public final void a(byte[] bArr) {
        cnkr cnkrVar = this.a;
        if (cnkrVar != null) {
            cnkrVar.c(bArr);
        }
    }

    public final ckcp b(String str, cnkc cnkcVar) {
        cnkn cnknVar;
        ReentrantReadWriteLock reentrantReadWriteLock;
        cnkr cnkrVar = this.a;
        if (cnkrVar == null) {
            return new ckcp(null);
        }
        cnkrVar.h.writeLock().lock();
        try {
            cnkb cnkbVar = cnkrVar.k.get(str);
            if (cnkbVar == null) {
                cnkrVar.h.writeLock().lock();
                cnknVar = new cnkn(cnkrVar, str, cnkcVar);
                cnkrVar.k.put(str, cnknVar);
                cnkrVar.h.writeLock().unlock();
                reentrantReadWriteLock = cnkrVar.h;
            } else {
                try {
                    cnknVar = (cnkn) cnkbVar;
                    if (!cnkcVar.equals(cnknVar.e)) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "alias mismatch: ".concat(valueOf) : new String("alias mismatch: "));
                    }
                    reentrantReadWriteLock = cnkrVar.h;
                } catch (ClassCastException unused) {
                    String valueOf2 = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf2.length() != 0 ? "another type of counter exists with name: ".concat(valueOf2) : new String("another type of counter exists with name: "));
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            return new ckcp(cnknVar);
        } catch (Throwable th) {
            cnkrVar.h.writeLock().unlock();
            throw th;
        }
    }

    public final ckcr c(String str, cnkc cnkcVar) {
        cnkq cnkqVar;
        ReentrantReadWriteLock reentrantReadWriteLock;
        cnkr cnkrVar = this.a;
        if (cnkrVar == null) {
            return new ckcr(null);
        }
        cnkrVar.h.writeLock().lock();
        try {
            cnkb cnkbVar = cnkrVar.k.get(str);
            if (cnkbVar == null) {
                cnkrVar.h.writeLock().lock();
                cnkqVar = new cnkq(cnkrVar, str, cnkcVar);
                cnkrVar.k.put(str, cnkqVar);
                cnkrVar.h.writeLock().unlock();
                reentrantReadWriteLock = cnkrVar.h;
            } else {
                try {
                    cnkqVar = (cnkq) cnkbVar;
                    if (!cnkcVar.equals(cnkqVar.e)) {
                        String valueOf = String.valueOf(str);
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "alias mismatch: ".concat(valueOf) : new String("alias mismatch: "));
                    }
                    reentrantReadWriteLock = cnkrVar.h;
                } catch (ClassCastException unused) {
                    String valueOf2 = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf2.length() != 0 ? "another type of counter exists with name: ".concat(valueOf2) : new String("another type of counter exists with name: "));
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            return new ckcr(cnkqVar);
        } catch (Throwable th) {
            cnkrVar.h.writeLock().unlock();
            throw th;
        }
    }
}
