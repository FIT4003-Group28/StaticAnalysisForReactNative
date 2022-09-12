package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: buv  reason: default package */
/* loaded from: classes.dex */
public final class buv implements bul<InputStream> {
    public final cdz a;

    public buv(InputStream inputStream, bxl bxlVar) {
        cdz cdzVar = new cdz(inputStream, bxlVar);
        this.a = cdzVar;
        cdzVar.mark(5242880);
    }

    @Override // defpackage.bul
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.bul
    /* renamed from: c */
    public final InputStream a() {
        this.a.reset();
        return this.a;
    }
}
