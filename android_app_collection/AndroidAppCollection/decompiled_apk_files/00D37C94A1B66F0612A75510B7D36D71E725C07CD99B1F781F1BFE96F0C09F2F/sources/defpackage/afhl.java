package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afhl  reason: default package */
/* loaded from: classes.dex */
public final class afhl {
    public final Context a;
    public volatile afhn d;
    private final afhj f;
    private volatile afhu g;
    public volatile int e = 1;
    public final List b = new ArrayList();
    public final Object c = new Object();

    public afhl(Context context, afhj afhjVar) {
        this.a = context;
        this.f = afhjVar;
    }

    public final afhu a() {
        boolean z = true;
        if (this.e == 1) {
            z = false;
        }
        afms.d(z);
        afhu afhuVar = this.g;
        afms.a(afhuVar);
        return afhuVar;
    }

    public final void b(String str) {
        synchronized (this.c) {
            try {
                try {
                    this.f.a();
                    long nativeCreateIsolate = NativeSupport.nativeCreateIsolate();
                    aqxo.z(nativeCreateIsolate != 0, "Cannot create JavaScript VM isolate");
                    this.g = new afhu(NativeSupport.nativeCreateContext(nativeCreateIsolate));
                    try {
                        afhu afhuVar = this.g;
                        byte[] bytes = str.getBytes();
                        if (bytes != null) {
                            afhuVar.a(bytes);
                        }
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("new MediaFetchControllerNativeHandler(");
                        sb.append("new MediaFetchController()");
                        sb.append(")");
                        afhv a = afhuVar.a(sb.toString().getBytes());
                        if (a == null) {
                            StringBuilder sb2 = new StringBuilder(51);
                            sb2.append("Instance \"");
                            sb2.append("new MediaFetchController()");
                            sb2.append("\" is not valid.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        this.d = new afhn(a);
                        this.e = 2;
                    } catch (RuntimeException e) {
                        throw new afgy(6, "Failed to create JS MFC.", e);
                    }
                } catch (UnsatisfiedLinkError e2) {
                    throw new afgy(6, "JsApi not loaded.", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
