package defpackage;

import android.net.Uri;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cog  reason: default package */
/* loaded from: classes2.dex */
public final class cog implements cnr {
    public static final cog a = new cog(1);
    private final /* synthetic */ int b;

    public cog() {
    }

    @Deprecated
    public cog(int i) {
        this.b = i;
    }

    public cog(int i, byte[] bArr) {
        this.b = i;
    }

    public cog(int i, char[] cArr) {
        this.b = i;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return cnw.a;
            }
            if (i == 2) {
                return new cop(cnyVar.a(cnf.class, InputStream.class));
            }
            return new ajoj(cnyVar.a(Uri.class, InputStream.class));
        }
        return new coh(cnyVar.a(cnf.class, InputStream.class));
    }
}
