package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cbv  reason: default package */
/* loaded from: classes4.dex */
public final class cbv implements cap<cac, InputStream> {
    public static final btz<Integer> a = btz.b("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final can<cac, cac> b;

    public cbv() {
        this(null);
    }

    public cbv(can<cac, cac> canVar) {
        this.b = canVar;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ boolean a(cac cacVar) {
        return true;
    }

    @Override // defpackage.cap
    public final /* bridge */ /* synthetic */ cao<InputStream> b(cac cacVar, int i, int i2, bua buaVar) {
        cac cacVar2 = cacVar;
        cac a2 = this.b.a(cacVar2, 0, 0);
        if (a2 == null) {
            this.b.b(cacVar2, 0, 0, cacVar2);
        } else {
            cacVar2 = a2;
        }
        return new cao<>(cacVar2, new but(cacVar2, ((Integer) buaVar.c(a)).intValue()));
    }
}
