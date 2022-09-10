package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dayw  reason: default package */
/* loaded from: classes5.dex */
public final class dayw<T> extends dees<T> {
    private dayy<T> a;
    private final int b;

    public dayw(dayy<T> dayyVar, int i) {
        this.a = dayyVar;
        this.b = i;
    }

    @Override // defpackage.dees
    protected final void OO() {
        long j;
        int i;
        int c;
        dayx<T> dayxVar;
        dayy<T> dayyVar = this.a;
        this.a = null;
        if (dayyVar == null) {
            return;
        }
        do {
            j = dayyVar.b.get();
            i = (int) j;
            c = dayy.c(j);
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            } else if (i == -2147483647) {
                c++;
            }
        } while (!dayyVar.b.compareAndSet(j, dayy.d(c, i - 1)));
        if (i != -2147483647) {
            return;
        }
        do {
            dayxVar = dayyVar.c.get();
            if (dayxVar == null || dayxVar.a > this.b) {
                return;
            }
            dayxVar.cancel(true);
        } while (!dayyVar.c.compareAndSet(dayxVar, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        deff<T> deffVar;
        dayy<T> dayyVar = this.a;
        if (dayyVar == null || (deffVar = dayyVar.a.a) == null) {
            return null;
        }
        String valueOf = String.valueOf(deffVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("callable=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        dayx<T> dayxVar = this.a.c.get();
        if (dayxVar == null) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        String valueOf3 = String.valueOf(dayxVar);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(valueOf3).length());
        sb3.append(valueOf2);
        sb3.append(", trial=[");
        sb3.append(valueOf3);
        sb3.append("]");
        return sb3.toString();
    }
}
