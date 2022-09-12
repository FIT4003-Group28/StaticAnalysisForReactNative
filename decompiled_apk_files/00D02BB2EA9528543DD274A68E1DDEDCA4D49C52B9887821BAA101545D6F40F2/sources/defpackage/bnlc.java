package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: bnlc  reason: default package */
/* loaded from: classes3.dex */
final class bnlc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(Context context) {
        return new File(bnow.a(context).getParent(), "persisted_server_signal.pb");
    }
}
