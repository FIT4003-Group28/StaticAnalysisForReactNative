package defpackage;

import android.net.Uri;
import androidx.preference.Preference;
import com.google.android.apps.gmm.mapsactivity.locationhistory.retention.webview.RetentionWebViewCallbacks;
import com.google.ar.core.ImageMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btjb  reason: default package */
/* loaded from: classes4.dex */
public final class btjb implements auc {
    final /* synthetic */ btjc a;

    public btjb(btjc btjcVar) {
        this.a = btjcVar;
    }

    @Override // defpackage.auc
    public final boolean a(Preference preference) {
        this.a.c.i(cjtd.a(dtyi.bp));
        bvvw a = this.a.d.a();
        btjc btjcVar = this.a;
        Uri parse = Uri.parse(btjcVar.b.getMapsActivitiesParameters().e);
        dkyw bZ = dkyx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkyx.b((dkyx) bZ.b);
        dkyx bK = bZ.bK();
        bvxn bZ2 = bvxu.A.bZ();
        String uri = parse.toString();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ2.b;
        uri.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = uri;
        bvxuVar.a = i | 4;
        bvxuVar.d = true;
        bvxp f = bvoa.f(ibm.b(), btjcVar.a);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ2.b;
        f.getClass();
        bvxuVar2.x = f;
        int i2 = bvxuVar2.a | 4194304;
        bvxuVar2.a = i2;
        bK.getClass();
        bvxuVar2.j = bK;
        int i3 = i2 | 256;
        bvxuVar2.a = i3;
        int i4 = i3 | 8;
        bvxuVar2.a = i4;
        bvxuVar2.e = true;
        bvxuVar2.a = i4 | 16384;
        bvxuVar2.p = true;
        bvxu bvxuVar3 = (bvxu) bZ2.b;
        bvxuVar3.a |= 2048;
        bvxuVar3.m = true;
        bvxu.c(bvxuVar3);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ2.b;
        bvxuVar4.a |= 512;
        bvxuVar4.k = true;
        bvxu.b(bvxuVar4);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ2.b;
        bvxuVar5.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        bvxuVar5.r = true;
        a.k(bZ2.bK(), new RetentionWebViewCallbacks(), dtyi.bQ);
        return true;
    }
}
