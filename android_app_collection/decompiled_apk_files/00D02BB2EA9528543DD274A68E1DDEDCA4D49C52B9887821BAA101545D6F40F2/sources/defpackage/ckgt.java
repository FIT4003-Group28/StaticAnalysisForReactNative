package defpackage;
/* compiled from: PG */
/* renamed from: ckgt  reason: default package */
/* loaded from: classes.dex */
public final class ckgt extends ckhb<ckcm> {
    public ckgt(String str, ckgy ckgyVar) {
        super(str, ckgyVar);
    }

    @Override // defpackage.ckhb
    public final /* bridge */ /* synthetic */ ckcm a(ckcs ckcsVar) {
        cnke cnkeVar;
        String str = this.b;
        cnkr cnkrVar = ckcsVar.a;
        if (cnkrVar == null) {
            return new ckcm(null);
        }
        cnkrVar.h.writeLock().lock();
        try {
            cnkb cnkbVar = cnkrVar.k.get(str);
            if (cnkbVar == null) {
                cnkrVar.h.writeLock().lock();
                cnkeVar = new cnke(cnkrVar, str);
                cnkrVar.k.put(str, cnkeVar);
                cnkrVar.h.writeLock().unlock();
            } else {
                try {
                    cnkeVar = (cnke) cnkbVar;
                } catch (ClassCastException unused) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "another type of counter exists with name: ".concat(valueOf) : new String("another type of counter exists with name: "));
                }
            }
            cnkrVar.h.writeLock().unlock();
            return new ckcm(cnkeVar);
        } catch (Throwable th) {
            cnkrVar.h.writeLock().unlock();
            throw th;
        }
    }
}
