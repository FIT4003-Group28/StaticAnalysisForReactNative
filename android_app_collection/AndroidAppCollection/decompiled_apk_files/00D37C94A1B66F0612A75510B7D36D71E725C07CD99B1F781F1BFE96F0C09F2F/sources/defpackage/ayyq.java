package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ayyq  reason: default package */
/* loaded from: classes2.dex */
public final class ayyq implements Callable {
    private final /* synthetic */ int a;

    public ayyq() {
    }

    public ayyq(int i) {
        this.a = i;
    }

    public static final List a() {
        return new ArrayList(16);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            if (i == 2) {
                return azpf.a;
            }
            if (i == 3) {
                return azpg.a;
            }
            if (i == 4) {
                return azph.a;
            }
            return azpi.a;
        }
        return new ayyt();
    }
}
