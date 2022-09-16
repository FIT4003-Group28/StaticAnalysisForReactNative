package defpackage;

import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ajou  reason: default package */
/* loaded from: classes.dex */
public final class ajou implements cnr {
    private final ajox a;
    private final /* synthetic */ int b;

    public ajou(ajox ajoxVar) {
        this.a = ajoxVar;
    }

    public ajou(ajox ajoxVar, int i) {
        this.b = i;
        this.a = ajoxVar;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        if (this.b == 0) {
            return new ajov(this.a, cnyVar.a(File.class, InputStream.class));
        }
        return new ajov(this.a, cnyVar.a(File.class, ByteBuffer.class));
    }
}
