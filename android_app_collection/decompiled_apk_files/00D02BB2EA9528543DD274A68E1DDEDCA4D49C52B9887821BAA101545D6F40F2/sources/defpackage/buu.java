package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: buu  reason: default package */
/* loaded from: classes.dex */
public final class buu implements buk<InputStream> {
    private final bxl a;

    public buu(bxl bxlVar) {
        this.a = bxlVar;
    }

    @Override // defpackage.buk
    public final /* bridge */ /* synthetic */ bul<InputStream> a(InputStream inputStream) {
        return new buv(inputStream, this.a);
    }

    @Override // defpackage.buk
    public final Class<InputStream> b() {
        return InputStream.class;
    }
}
