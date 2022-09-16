package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bvgq  reason: default package */
/* loaded from: classes4.dex */
public final class bvgq {
    public static final String a = "bvgq";
    public final btmy b;
    public final cqat c;
    public final long d;
    private final File e;
    @dzsi
    private dxdz f;

    public bvgq(Context context, File file, cqat cqatVar, long j) {
        this.b = new btmy(context, new File(file, "disk_cache_expiry_journal"), cqatVar);
        this.e = file;
        this.c = cqatVar;
        this.d = j;
    }

    public final synchronized void a() {
        this.b.e();
        try {
            b().i();
        } catch (IOException unused) {
        }
        this.f = null;
    }

    public final synchronized dxdz b() {
        if (this.f == null) {
            this.f = dxdz.k(new File(this.e, "disk_cache"), 5242880L);
        }
        return this.f;
    }
}
