package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: bqt  reason: default package */
/* loaded from: classes4.dex */
final class bqt implements bqs {
    private final FileChannel a;
    private final long b;
    private final long c;

    public bqt(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.bqs
    public final long a() {
        return this.c;
    }

    @Override // defpackage.bqs
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
