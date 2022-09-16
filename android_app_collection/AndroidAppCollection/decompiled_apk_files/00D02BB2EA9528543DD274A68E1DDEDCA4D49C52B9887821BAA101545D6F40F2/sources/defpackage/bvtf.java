package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bvtf  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvtf {
    public abstract int a();

    public abstract int b();

    public abstract int c();

    public final String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(a()), Integer.valueOf(b()), Integer.valueOf(c()));
    }
}
