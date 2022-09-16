package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aldh  reason: default package */
/* loaded from: classes.dex */
public class aldh extends FilterInputStream {
    private final boolean a;
    private final long b;

    public aldh(InputStream inputStream) {
        super(inputStream);
        this.a = false;
        this.b = -1L;
    }

    public long a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public aldh(InputStream inputStream, long j) {
        super(inputStream);
        aqxo.p(j >= 0);
        this.a = true;
        this.b = j;
    }
}
