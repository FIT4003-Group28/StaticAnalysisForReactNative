package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cod  reason: default package */
/* loaded from: classes2.dex */
public final class cod implements cnr, coe {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public cod(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public cod(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.cnr
    public final void d() {
    }

    @Override // defpackage.coe
    public final cil a(Uri uri) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new cih(this.a, uri);
            }
            return new cjb(this.a, uri);
        }
        return new cit(this.a, uri);
    }

    @Override // defpackage.cnr
    public final cnq c(cny cnyVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return new cof(this);
            }
            return new cof(this);
        }
        return new cof(this);
    }
}
