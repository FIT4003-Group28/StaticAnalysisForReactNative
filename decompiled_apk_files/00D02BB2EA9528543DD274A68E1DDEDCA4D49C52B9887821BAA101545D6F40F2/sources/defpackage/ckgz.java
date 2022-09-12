package defpackage;
/* compiled from: PG */
/* renamed from: ckgz  reason: default package */
/* loaded from: classes.dex */
public class ckgz extends ckhb<ckco> {
    public ckgz(String str, ckgy ckgyVar) {
        super(str, ckgyVar);
    }

    @Override // defpackage.ckhb
    public final /* bridge */ /* synthetic */ ckco a(ckcs ckcsVar) {
        cnkl cnklVar;
        String str = this.b;
        cnkr cnkrVar = ckcsVar.a;
        if (cnkrVar == null) {
            return new ckco(null);
        }
        cnkrVar.h.writeLock().lock();
        try {
            cnkb cnkbVar = cnkrVar.k.get(str);
            if (cnkbVar == null) {
                cnkrVar.h.writeLock().lock();
                cnklVar = new cnkl(cnkrVar, str);
                cnkrVar.k.put(str, cnklVar);
                cnkrVar.h.writeLock().unlock();
            } else {
                try {
                    cnklVar = (cnkl) cnkbVar;
                } catch (ClassCastException unused) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "another type of counter exists with name: ".concat(valueOf) : new String("another type of counter exists with name: "));
                }
            }
            cnkrVar.h.writeLock().unlock();
            return new ckco(cnklVar);
        } catch (Throwable th) {
            cnkrVar.h.writeLock().unlock();
            throw th;
        }
    }
}
