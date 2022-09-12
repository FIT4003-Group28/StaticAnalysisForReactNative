package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cryy  reason: default package */
/* loaded from: classes5.dex */
public final class cryy {
    public static long a(cryx cryxVar) {
        long lastModified = new File(cryxVar.a, "base.apk").lastModified();
        return Math.max(TimeUnit.MINUTES.convert(cryxVar.c.lastModified() - lastModified, TimeUnit.MILLISECONDS), -1L);
    }
}
