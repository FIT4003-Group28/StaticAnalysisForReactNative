package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dait  reason: default package */
/* loaded from: classes5.dex */
public final class dait {
    private final daix a;

    public dait(daix daixVar) {
        this.a = daixVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File file : set) {
            int intValue = ((Integer) dakl.a(assets, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
            StringBuilder sb = new StringBuilder(39);
            sb.append("addAssetPath completed with ");
            sb.append(intValue);
            sb.toString();
        }
    }

    public final synchronized void b(Context context, Set<String> set) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.allowThreadDiskReads();
                StrictMode.allowThreadDiskWrites();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            threadPolicy = null;
        }
        try {
            HashSet hashSet = new HashSet();
            for (String str : set) {
                hashSet.add(this.a.b(str));
            }
            a(context, hashSet);
            if (threadPolicy == null) {
                return;
            }
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Exception unused3) {
            if (threadPolicy == null) {
                return;
            }
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Throwable th) {
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
            throw th;
        }
    }
}
