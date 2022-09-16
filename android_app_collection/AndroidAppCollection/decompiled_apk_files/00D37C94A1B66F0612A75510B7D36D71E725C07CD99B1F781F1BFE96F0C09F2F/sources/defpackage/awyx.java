package defpackage;

import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: awyx  reason: default package */
/* loaded from: classes2.dex */
public final class awyx implements awxz {
    private final CronetEngine a;
    private final snc b;
    private final ExecutorService c;

    public awyx(CronetEngine cronetEngine, snc sncVar, ExecutorService executorService) {
        this.a = cronetEngine;
        this.b = sncVar;
        executorService.getClass();
        this.c = executorService;
    }

    @Override // defpackage.awxz
    public final awyp a(String str, String str2, awya awyaVar, awxx awxxVar) {
        str.getClass();
        str2.getClass();
        return new awzc(str, str2, awyaVar, this.a, this.c, new awyz(this.c), awxxVar != null ? new awze(this.c, awxxVar) : null);
    }
}
