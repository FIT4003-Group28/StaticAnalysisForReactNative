package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: afbz  reason: default package */
/* loaded from: classes2.dex */
final class afbz {
    @dzsi
    private final File[] a;
    private final int b;

    public afbz(@dzsi File[] fileArr, int i) {
        this.a = fileArr;
        this.b = i;
    }

    @dzsi
    public final File a() {
        return this.a[this.b];
    }

    public final void b(@dzsi File file) {
        this.a[this.b] = file;
    }
}
