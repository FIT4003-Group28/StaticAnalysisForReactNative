package defpackage;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cmli  reason: default package */
/* loaded from: classes5.dex */
public final class cmli {
    public static final cmlc a = new cmlc(2, -9223372036854775807L);
    public static final cmlc b = new cmlc(3, -9223372036854775807L);
    public final ExecutorService c = cmny.ai();
    public cmld<? extends cmle> d;
    public IOException e;

    public static cmlc a(boolean z, long j) {
        return new cmlc(z ? 1 : 0, j);
    }

    public final boolean b() {
        return this.d != null;
    }

    public final void c() {
        cmld<? extends cmle> cmldVar = this.d;
        cmmn.e(cmldVar);
        cmldVar.b(false);
    }
}
