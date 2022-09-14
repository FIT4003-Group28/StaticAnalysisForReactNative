package com.google.android.apps.gmm.shared.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gmm.shared.webview.NativeApiImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NativeApiImpl implements NativeApi, bwcb {
    public static final dcqe a = dcqe.c("com.google.android.apps.gmm.shared.webview.NativeApiImpl");
    public final bvtz b;
    public final dxio<ckcw> d;
    private final Executor f;
    private final Executor g;
    public final Map<String, bvwz> c = new HashMap();
    public final HashMap<String, String> e = new HashMap<>();

    public NativeApiImpl(Executor executor, Executor executor2, dxio<ckcw> dxioVar, bvtz bvtzVar) {
        this.f = executor2;
        this.g = executor;
        this.d = dxioVar;
        this.b = bvtzVar;
    }

    public static String b(bvwz bvwzVar) {
        return bvwzVar.getClass().getName();
    }

    public static Map<String, Object> c(Throwable th) {
        return dcdn.k("err", dbsj.e(th.getMessage()));
    }

    @Override // defpackage.bwcb
    public final void a(@dzsi Object obj) {
        if (obj == null) {
            return;
        }
        for (bvwz bvwzVar : this.c.values()) {
            dehn<Map<String, Object>> b = bvwzVar.b(obj);
            String b2 = b(bvwzVar);
            if (b != null && this.e.containsKey(b2)) {
                String remove = this.e.remove(b2);
                dbsk.s(remove);
                deha.q(b, new bvue(this, remove), this.g);
                return;
            }
        }
    }

    @Override // com.google.android.apps.gmm.shared.webview.NativeApi
    @JavascriptInterface
    public void callFunction(final String str, final String str2, final String str3) {
        final ckgz ckgzVar = ckku.i;
        String str4 = ckgzVar.b;
        this.f.execute(new Runnable(this, ckgzVar, str) { // from class: bvuc
            private final NativeApiImpl a;
            private final ckgz b;
            private final String c;

            {
                this.a = this;
                this.b = ckgzVar;
                this.c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NativeApiImpl nativeApiImpl = this.a;
                nativeApiImpl.d.a().s(this.b, bwdb.a(this.c) - 1);
            }
        });
        this.g.execute(new Runnable(this, str, str2, str3) { // from class: bvub
            private final NativeApiImpl a;
            private final String b;
            private final String c;
            private final String d;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NativeApiImpl nativeApiImpl = this.a;
                String str5 = this.b;
                String str6 = this.c;
                String str7 = this.d;
                if (!nativeApiImpl.c.containsKey(str5)) {
                    nativeApiImpl.b.h(str6, 2, new HashMap());
                    return;
                }
                try {
                    Map<String, Object> b = bvtu.b(str7);
                    bvwz bvwzVar = nativeApiImpl.c.get(str5);
                    Map<String, Object> a2 = bvwzVar.a().a(b);
                    if (a2 != null) {
                        nativeApiImpl.b.h(str6, 1, a2);
                    } else {
                        nativeApiImpl.e.put(NativeApiImpl.b(bvwzVar), str6);
                    }
                } catch (JSONException e) {
                    bvoo.j(e);
                    nativeApiImpl.b.h(str6, 4, NativeApiImpl.c(e));
                }
            }
        });
    }

    public final void d(bvwz bvwzVar) {
        if (this.c.containsKey(bvwzVar.c())) {
            bvoo.h("FunctionId %s is already registered", bvwzVar.c());
        } else {
            this.c.put(bvwzVar.c(), bvwzVar);
        }
    }

    @Override // com.google.android.apps.gmm.shared.webview.NativeApi
    @JavascriptInterface
    public void returnValue(final String str, final String str2, final int i) {
        this.g.execute(new Runnable(this, str, str2, i) { // from class: bvud
            private final NativeApiImpl a;
            private final String b;
            private final String c;
            private final int d;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
                this.d = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NativeApiImpl nativeApiImpl = this.a;
                try {
                    nativeApiImpl.b.g(this.b, this.c, new int[]{1, 2, 3, 4}[this.d]);
                } catch (JSONException e) {
                    bvoo.j(e);
                }
            }
        });
    }
}
