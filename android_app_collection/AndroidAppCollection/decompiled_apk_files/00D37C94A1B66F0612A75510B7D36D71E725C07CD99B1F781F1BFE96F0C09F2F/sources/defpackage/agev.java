package defpackage;
/* compiled from: PG */
/* renamed from: agev  reason: default package */
/* loaded from: classes.dex */
public final class agev {
    private int a = 1;

    public final synchronized int a(ageu ageuVar) {
        ageu ageuVar2 = ageu.REGISTRATION;
        int ordinal = ageuVar.ordinal();
        if (ordinal == 0) {
            int i = this.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1 || i2 == 2) {
                    this.a = 4;
                }
            }
            this.a = 2;
        } else if (ordinal == 1) {
            int i3 = this.a;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    this.a = 5;
                }
            }
            this.a = 3;
        } else if (ordinal == 2) {
            int i5 = this.a;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 1 || i6 == 2) {
                this.a = 1;
            } else {
                if (i6 != 3) {
                    if (i6 != 4) {
                    }
                    this.a = 3;
                }
                this.a = 2;
            }
        }
        return this.a;
    }
}
