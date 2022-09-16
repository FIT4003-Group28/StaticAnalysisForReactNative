package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ayjv  reason: default package */
/* loaded from: classes2.dex */
final class ayjv implements aymm {
    private InputStream a;

    public ayjv(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.aymm
    public final InputStream f() {
        InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
