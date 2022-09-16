package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amez  reason: default package */
/* loaded from: classes.dex */
public final class amez extends anie {
    private amfb a;
    private final int b;

    public amez(amfb amfbVar, int i) {
        this.a = amfbVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        aniq aniqVar;
        amfb amfbVar = this.a;
        if (amfbVar == null || (aniqVar = amfbVar.a.a) == null) {
            return null;
        }
        String valueOf = String.valueOf(aniqVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("callable=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        amfa amfaVar = (amfa) this.a.c.get();
        if (amfaVar == null) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        String valueOf3 = String.valueOf(amfaVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(valueOf3).length());
        sb3.append(valueOf2);
        sb3.append(", trial=[");
        sb3.append(valueOf3);
        sb3.append("]");
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final boolean lV(ankt anktVar) {
        return super.lV(anktVar);
    }

    @Override // defpackage.anie
    protected final void qu() {
        long j;
        int i;
        int a;
        amfa amfaVar;
        amfb amfbVar = this.a;
        this.a = null;
        if (amfbVar == null) {
            return;
        }
        do {
            j = amfbVar.b.get();
            i = (int) j;
            a = amfb.a(j);
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            } else if (i == -2147483647) {
                a++;
            }
        } while (!amfbVar.b.compareAndSet(j, amfb.b(a, i - 1)));
        if (i != -2147483647) {
            return;
        }
        do {
            amfaVar = (amfa) amfbVar.c.get();
            if (amfaVar == null || amfaVar.a > this.b) {
                return;
            }
            amfaVar.cancel(true);
        } while (!amfbVar.c.compareAndSet(amfaVar, null));
    }
}
