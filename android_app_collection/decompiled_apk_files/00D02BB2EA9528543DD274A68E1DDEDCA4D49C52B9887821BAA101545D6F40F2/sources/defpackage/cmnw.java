package defpackage;

import android.os.Trace;
/* compiled from: PG */
/* renamed from: cmnw  reason: default package */
/* loaded from: classes5.dex */
public final class cmnw {
    public static void a(String str) {
        if (cmny.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (cmny.a >= 18) {
            Trace.endSection();
        }
    }
}
