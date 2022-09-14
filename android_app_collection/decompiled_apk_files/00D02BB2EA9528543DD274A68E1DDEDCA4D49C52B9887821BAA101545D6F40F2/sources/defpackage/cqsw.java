package defpackage;

import android.content.Context;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqsw  reason: default package */
/* loaded from: classes.dex */
public class cqsw<T> implements cqtu {
    private final T a;
    private final T b;
    private final T c;
    private final T d;

    /* JADX INFO: Access modifiers changed from: protected */
    public cqsw(T t, T t2, T t3, T t4) {
        this.a = t;
        this.b = t2;
        this.c = t3;
        this.d = t4;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqsw) {
            cqsw cqswVar = (cqsw) obj;
            if (dbsd.a(this.a, cqswVar.a) && dbsd.a(this.b, cqswVar.b) && dbsd.a(this.c, cqswVar.c) && dbsd.a(this.d, cqswVar.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T g(Context context) {
        boolean b = cqhl.b(context);
        return cqhl.c(context) ? b ? this.c : this.d : b ? this.a : this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
