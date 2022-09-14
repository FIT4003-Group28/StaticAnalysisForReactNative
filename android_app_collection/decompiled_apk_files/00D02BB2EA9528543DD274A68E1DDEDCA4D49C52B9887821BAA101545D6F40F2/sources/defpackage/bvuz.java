package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.NativeApiImpl;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bvuz  reason: default package */
/* loaded from: classes4.dex */
public final class bvuz implements bwce {
    public final bvxu a;
    @dzsi
    public final WebViewCallbacks b;
    public final WebView c;
    public final bwcc d;
    private final View e;
    private final boolean f;
    @dzsi
    private final bwcb g;
    private final bwcd h;
    private final bwcf i;
    private final bvwv j;

    public bvuz(bvxu bvxuVar, @dzsi WebViewCallbacks webViewCallbacks, WebView webView, View view, @dzsi bwcb bwcbVar, bwcc bwccVar, bwcd bwcdVar, bwcf bwcfVar, bvwv bvwvVar) {
        this.a = bvxuVar;
        this.b = webViewCallbacks;
        this.c = webView;
        this.e = view;
        this.g = bwcbVar;
        this.d = bwccVar;
        this.f = bvxuVar.g;
        this.h = bwcdVar;
        this.i = bwcfVar;
        this.j = bvwvVar;
        bwcfVar.f(bvwvVar.d());
    }

    @Override // defpackage.bwce
    public final bvwv a() {
        return this.j;
    }

    @Override // defpackage.bwce
    public final bvxu b() {
        return this.a;
    }

    @Override // defpackage.bwce
    @dzsi
    public final WebViewCallbacks c() {
        return this.b;
    }

    @Override // defpackage.bwce
    public final View d() {
        return this.e;
    }

    @Override // defpackage.bwce
    public final WebView e() {
        return this.c;
    }

    @Override // defpackage.bwce
    public final void f(@dzsi Object obj) {
        this.g.a(obj);
    }

    @Override // defpackage.bwce
    public final void g(Bundle bundle) {
        if (this.f) {
            this.c.saveState(bundle);
        }
        NativeApiImpl nativeApiImpl = ((bvuu) this.g).b;
        if (nativeApiImpl != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry<String, String> entry : nativeApiImpl.e.entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            bundle.putStringArrayList("NativeApiImpl.pendingCallbacksMap", arrayList);
        }
    }

    @Override // defpackage.bwce
    public final void h(@dzsi Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.f) {
            this.c.restoreState(bundle);
        }
        NativeApiImpl nativeApiImpl = ((bvuu) this.g).b;
        if (nativeApiImpl == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("NativeApiImpl.pendingCallbacksMap");
        if (stringArrayList.size() % 2 == 0) {
            for (int i = 0; i < stringArrayList.size(); i += 2) {
                nativeApiImpl.e.put(stringArrayList.get(i), stringArrayList.get(i + 1));
            }
            return;
        }
        bvoo.h("Serialized pendingCallbacksMap is corrupted: %s.", dbrz.e(", ").g(stringArrayList));
    }

    @Override // defpackage.bwce
    public final void i(dfvg dfvgVar) {
        this.h.m(dfvgVar);
    }

    @Override // defpackage.bwce
    public final void j() {
        ViewGroup viewGroup = (ViewGroup) this.e.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.e);
        }
    }

    @Override // defpackage.bvxh
    public final bvxi k() {
        return this.i;
    }

    @Override // defpackage.bvxh
    public final String l() {
        return this.c.getUrl();
    }
}
