package defpackage;

import android.os.Binder;
/* renamed from: cxiu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cxiu {
    public static <V> V a(cxiv<V> cxivVar) {
        try {
            return cxivVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return cxivVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
