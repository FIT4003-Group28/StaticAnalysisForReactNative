package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: qot  reason: default package */
/* loaded from: classes4.dex */
public final class qot {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qot)) {
            return false;
        }
        qot qotVar = (qot) obj;
        int i = qotVar.a;
        if (this.b != qotVar.b) {
            return false;
        }
        int i2 = qotVar.c;
        int i3 = qotVar.d;
        int i4 = qotVar.e;
        boolean z = qotVar.f;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.b), 0, 0, 0, false});
    }
}
