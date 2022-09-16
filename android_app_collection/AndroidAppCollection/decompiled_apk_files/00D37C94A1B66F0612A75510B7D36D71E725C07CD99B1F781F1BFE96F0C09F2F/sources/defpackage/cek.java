package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cek  reason: default package */
/* loaded from: classes2.dex */
public final class cek implements cej {
    private final FileChannel a;
    private final long b;
    private final long c;

    public cek(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.cej
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cej
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
