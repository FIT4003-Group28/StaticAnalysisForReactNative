package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: bur  reason: default package */
/* loaded from: classes4.dex */
public final class bur extends buw<ParcelFileDescriptor> {
    public bur(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.buj
    public final Class<ParcelFileDescriptor> d() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.buw
    protected final /* bridge */ /* synthetic */ void f(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.buw
    protected final /* bridge */ /* synthetic */ ParcelFileDescriptor g(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FileDescriptor is null for: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }
}
