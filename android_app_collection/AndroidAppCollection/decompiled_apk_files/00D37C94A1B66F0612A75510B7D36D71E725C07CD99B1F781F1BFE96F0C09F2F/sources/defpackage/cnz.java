package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cnz  reason: default package */
/* loaded from: classes2.dex */
public final class cnz implements cnr {
    private final Resources a;
    private final /* synthetic */ int b;

    public cnz(Resources resources) {
        this.a = resources;
    }

    public cnz(Resources resources, int i) {
        this.b = i;
        this.a = resources;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new coa(this.a, cnyVar.a(Uri.class, AssetFileDescriptor.class));
            }
            if (i == 2) {
                return new coa(this.a, cnyVar.a(Uri.class, InputStream.class));
            }
            return new coa(this.a, cnw.a);
        }
        return new coa(this.a, cnyVar.a(Uri.class, ParcelFileDescriptor.class));
    }
}
