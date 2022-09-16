package defpackage;

import android.os.CancellationSignal;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* renamed from: adz  reason: default package */
/* loaded from: classes.dex */
public class adz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CancellationSignal a() {
        return new CancellationSignal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static void c(LinkedHashSet linkedHashSet) {
        linkedHashSet.add(new aeb());
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static boolean e(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ void f(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }

    public static adz g() {
        return new bqc();
    }

    public static adz h() {
        return new bqd();
    }

    public static adz i() {
        return new bqe(bpx.a);
    }
}
