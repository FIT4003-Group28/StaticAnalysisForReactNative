package defpackage;

import android.content.Context;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cquu  reason: default package */
/* loaded from: classes5.dex */
public final class cquu extends cqrt implements cqsn {
    private final int c;

    public cquu(int i, int i2) {
        super(i);
        this.c = i2;
    }

    @Override // defpackage.cqsn
    public final CharSequence a(Context context) {
        Object[] objArr = this.b;
        if (objArr.length == 0) {
            return context.getResources().getQuantityText(this.a, this.c);
        }
        return context.getResources().getQuantityString(this.a, this.c, objArr);
    }

    @Override // defpackage.cqrt
    public final boolean equals(@dzsi Object obj) {
        return (obj instanceof cquu) && super.equals(obj) && ((cquu) obj).c == this.c;
    }

    @Override // defpackage.cqrt
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.c)});
    }

    public cquu(int i, int i2, Object... objArr) {
        super(i, objArr);
        this.c = i2;
    }
}
