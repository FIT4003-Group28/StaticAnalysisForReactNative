package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: bajs  reason: default package */
/* loaded from: classes2.dex */
public abstract class bajs extends bahv implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final bahx d;

    /* JADX INFO: Access modifiers changed from: protected */
    public bajs(bahx bahxVar) {
        if (bahxVar != null) {
            this.d = bahxVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // defpackage.bahv
    public int a(long j, long j2) {
        return bajw.a(d(j, j2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long e = ((bahv) obj).e();
        long e2 = e();
        if (e2 == e) {
            return 0;
        }
        return e2 < e ? -1 : 1;
    }

    @Override // defpackage.bahv
    public final bahx f() {
        return this.d;
    }

    @Override // defpackage.bahv
    public final boolean h() {
        return true;
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
