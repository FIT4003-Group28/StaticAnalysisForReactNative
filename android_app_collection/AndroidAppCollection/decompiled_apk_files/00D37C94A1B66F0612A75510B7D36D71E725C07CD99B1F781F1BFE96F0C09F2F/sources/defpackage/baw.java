package defpackage;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baw  reason: default package */
/* loaded from: classes2.dex */
public final class baw {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final bbc c = new bbc();
    public int d;
    public int e;
    public long f;
    public bax g;

    public final long a(azf azfVar, int i) {
        azfVar.k(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
