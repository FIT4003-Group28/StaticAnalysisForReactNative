package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cmt  reason: default package */
/* loaded from: classes2.dex */
public final class cmt implements cnr {
    private final /* synthetic */ int a;

    public cmt() {
    }

    public cmt(int i) {
        this.a = i;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new cmu(new cms(1));
            }
            if (i == 2) {
                return new cmx();
            }
            if (i == 3) {
                return new cop(cnyVar.a(Uri.class, AssetFileDescriptor.class), 1);
            }
            if (i == 4) {
                return new cop(cnyVar.a(Uri.class, ParcelFileDescriptor.class), 1);
            }
            return new cop(cnyVar.a(Uri.class, InputStream.class), 1);
        }
        return new cmu(new cms());
    }
}
