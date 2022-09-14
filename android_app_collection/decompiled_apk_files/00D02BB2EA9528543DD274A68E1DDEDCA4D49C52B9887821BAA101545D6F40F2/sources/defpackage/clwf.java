package defpackage;

import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: clwf  reason: default package */
/* loaded from: classes5.dex */
final class clwf {
    public final byte[] a = new byte[8];
    public final ArrayDeque<clwe> b = new ArrayDeque<>();
    public final clwn c = new clwn();
    public clwg d;
    public int e;
    public int f;
    public long g;

    public final long a(cluk clukVar, int i) {
        clukVar.c(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
