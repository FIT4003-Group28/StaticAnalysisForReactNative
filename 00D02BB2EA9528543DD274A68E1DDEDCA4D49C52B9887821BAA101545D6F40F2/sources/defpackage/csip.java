package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: csip  reason: default package */
/* loaded from: classes5.dex */
public final class csip implements csio {
    public final List<cshb> a;
    public final int b;
    private final int c;

    public csip(int i, List<cshb> list, int i2) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
        this.c = i2;
        boolean z = true;
        if (i == 3) {
            dbsk.a(i2 != -1 ? false : z);
        } else {
            dbsk.a(i2 == -1 ? false : z);
        }
    }

    @Override // defpackage.csio
    public final List<cshb> a() {
        return this.a;
    }

    @Override // defpackage.csio
    public final cshb b() {
        return csin.b(this);
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        dbsk.l(z);
        return this.c;
    }
}
