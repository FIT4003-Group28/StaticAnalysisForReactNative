package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: cit  reason: default package */
/* loaded from: classes2.dex */
public final class cit extends cix {
    public cit(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.cil
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.cix
    protected final /* bridge */ /* synthetic */ Object f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("FileDescriptor is null for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }

    @Override // defpackage.cix
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
