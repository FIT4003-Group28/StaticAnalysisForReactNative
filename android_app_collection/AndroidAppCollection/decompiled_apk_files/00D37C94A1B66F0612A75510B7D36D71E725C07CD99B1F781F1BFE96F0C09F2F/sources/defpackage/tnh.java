package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: tnh  reason: default package */
/* loaded from: classes4.dex */
public final class tnh implements tng {
    public final List a;
    public final int b;
    private final int c;

    public tnh(int i, List list, int i2) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
        this.c = i2;
        boolean z = true;
        if (i == 3) {
            aqxo.p(i2 != -1 ? false : z);
        } else {
            aqxo.p(i2 == -1 ? false : z);
        }
    }

    @Override // defpackage.tng
    public final /* synthetic */ tmh a() {
        return tnk.d(this);
    }

    @Override // defpackage.tng
    public final List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        aqxo.y(z);
        return this.c;
    }
}
