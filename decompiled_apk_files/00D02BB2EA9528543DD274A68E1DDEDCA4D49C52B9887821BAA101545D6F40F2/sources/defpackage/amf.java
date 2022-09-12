package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
/* compiled from: PG */
/* renamed from: amf  reason: default package */
/* loaded from: classes2.dex */
public final class amf extends InputConnectionWrapper {
    final /* synthetic */ cuxh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amf(InputConnection inputConnection, cuxh cuxhVar) {
        super(inputConnection, false);
        this.a = cuxhVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z;
        ResultReceiver resultReceiver;
        cuxh cuxhVar = this.a;
        if (bundle != null) {
            int i = 0;
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                z = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                try {
                    Uri uri = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                    ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                    Uri uri2 = (Uri) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                    bundle.getInt(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    Bundle bundle2 = (Bundle) bundle.getParcelable(true != z ? "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                    if (uri != null && clipDescription != null) {
                        new amh(uri, clipDescription, uri2);
                        cuxhVar.a();
                        i = 1;
                    }
                    if (resultReceiver != null) {
                        resultReceiver.send(i, null);
                    }
                    if (i != 0) {
                        return true;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (resultReceiver != null) {
                        resultReceiver.send(0, null);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                resultReceiver = null;
            }
        }
        return super.performPrivateCommand(str, bundle);
    }
}
