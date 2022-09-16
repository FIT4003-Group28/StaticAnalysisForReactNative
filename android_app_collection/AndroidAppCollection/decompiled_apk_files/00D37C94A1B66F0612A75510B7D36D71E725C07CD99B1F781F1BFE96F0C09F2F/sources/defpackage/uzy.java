package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: uzy  reason: default package */
/* loaded from: classes4.dex */
public final class uzy {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public uzy(Random random) {
        this.c = (random.nextInt() & (-131075)) | 65537;
    }
}
