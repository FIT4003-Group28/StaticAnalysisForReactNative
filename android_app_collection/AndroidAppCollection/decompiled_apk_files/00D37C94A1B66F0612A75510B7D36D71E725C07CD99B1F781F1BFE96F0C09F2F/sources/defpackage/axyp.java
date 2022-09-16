package defpackage;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: axyp  reason: default package */
/* loaded from: classes2.dex */
public final class axyp implements axyq {
    public static final axyq a = new axyp();
    private final /* synthetic */ int b;

    private axyp() {
    }

    public axyp(int i) {
        this.b = i;
    }

    @Override // defpackage.axyz
    public final InputStream a(InputStream inputStream) {
        return this.b != 0 ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Override // defpackage.axyr, defpackage.axyz
    public final String b() {
        return this.b != 0 ? "gzip" : "identity";
    }
}
