package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: puh  reason: default package */
/* loaded from: classes4.dex */
final class puh implements psk {
    public static final puh a = new puh();
    private final List b;

    private puh() {
        this.b = Collections.emptyList();
    }

    @Override // defpackage.psk
    public final int a() {
        return 1;
    }

    @Override // defpackage.psk
    public final int b(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.psk
    public final long c(int i) {
        ptx.c(i == 0);
        return 0L;
    }

    @Override // defpackage.psk
    public final List d(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public puh(psg psgVar) {
        this.b = Collections.singletonList(psgVar);
    }
}
