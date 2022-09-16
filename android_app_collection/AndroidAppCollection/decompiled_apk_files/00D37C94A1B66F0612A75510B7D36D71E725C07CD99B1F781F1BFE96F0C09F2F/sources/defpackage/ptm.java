package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ptm  reason: default package */
/* loaded from: classes4.dex */
public final class ptm implements psk {
    private final List a;
    private final /* synthetic */ int b;

    public ptm(List list) {
        this.a = list;
    }

    public ptm(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public ptm(List list, int i, byte[] bArr) {
        this.b = i;
        this.a = Collections.unmodifiableList(list);
    }

    @Override // defpackage.psk
    public final int a() {
        return 1;
    }

    @Override // defpackage.psk
    public final int b(long j) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (i == 2 || j >= 0) ? -1 : 0;
            } else if (j < 0) {
                return 0;
            }
        }
        return -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            boolean z = false;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i == 0) {
                        z = true;
                    }
                    ptx.c(z);
                }
                return 0L;
            }
            if (i == 0) {
                z = true;
            }
            ptx.c(z);
        }
        return 0L;
    }

    @Override // defpackage.psk
    public final List d(long j) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return j >= 0 ? this.a : Collections.emptyList();
            }
            if (i != 2 && j < 0) {
                return Collections.emptyList();
            }
            return this.a;
        }
        return this.a;
    }
}
