package defpackage;

import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deom  reason: default package */
/* loaded from: classes6.dex */
public final class deom extends deon {
    private final SliceManager a;

    public deom(Context context) {
        this.a = (SliceManager) context.getSystemService(SliceManager.class);
    }

    @Override // defpackage.deon
    public final void a(String str, Uri uri) {
        this.a.grantSlicePermission(str, uri);
    }
}
