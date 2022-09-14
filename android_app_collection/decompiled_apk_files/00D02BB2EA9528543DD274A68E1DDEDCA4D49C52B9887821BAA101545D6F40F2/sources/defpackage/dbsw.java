package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: dbsw  reason: default package */
/* loaded from: classes5.dex */
final class dbsw extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private final boolean a = true;

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.a) {
            throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
        }
        super.setSeed(j);
    }
}
