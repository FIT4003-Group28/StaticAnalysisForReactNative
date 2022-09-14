package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: east  reason: default package */
/* loaded from: classes6.dex */
public abstract class east extends eaox implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final eaoz d;

    /* JADX INFO: Access modifiers changed from: protected */
    public east(eaoz eaozVar) {
        if (eaozVar != null) {
            this.d = eaozVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // defpackage.eaox
    public final eaoz a() {
        return this.d;
    }

    @Override // defpackage.eaox
    public final boolean b() {
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eaox eaoxVar) {
        long d = eaoxVar.d();
        long d2 = d();
        if (d2 == d) {
            return 0;
        }
        return d2 < d ? -1 : 1;
    }

    @Override // defpackage.eaox
    public int h(long j, long j2) {
        return easy.d(i(j, j2));
    }

    public final String toString() {
        String str = this.d.m;
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append("DurationField[");
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
