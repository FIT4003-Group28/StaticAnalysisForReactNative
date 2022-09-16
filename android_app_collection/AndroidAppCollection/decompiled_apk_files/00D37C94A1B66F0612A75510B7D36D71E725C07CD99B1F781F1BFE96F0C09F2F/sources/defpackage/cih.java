package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
/* compiled from: PG */
/* renamed from: cih  reason: default package */
/* loaded from: classes2.dex */
public final class cih extends cix {
    public cih(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.cil
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.cix
    protected final /* bridge */ /* synthetic */ Object f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FileDescriptor is null for: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }

    @Override // defpackage.cix
    protected final /* bridge */ /* synthetic */ void g(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
