package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: amnb  reason: default package */
/* loaded from: classes.dex */
final class amnb extends AtomicInteger {
    public final String a;
    public final int b;
    public final amlt c;
    public int d;
    public amnb e;
    public volatile int f;
    private final amnb g;

    public amnb(amnb amnbVar, String str, int i, amlt amltVar) {
        this.f = 0;
        this.g = amnbVar;
        this.a = str;
        this.d = -1;
        this.b = i;
        this.c = amltVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        amnb amnbVar = this.g;
        if (amnbVar == null) {
            return -1;
        }
        return amnbVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, amnb amnbVar) {
        this.d = i;
        this.e = amnbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.f != 0;
    }

    public amnb(String str, amlt amltVar) {
        this.f = 0;
        this.g = null;
        this.a = str;
        this.d = 0;
        this.b = 0;
        this.c = amltVar;
        this.f = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }
}
