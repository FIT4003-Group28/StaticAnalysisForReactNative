package defpackage;

import android.webkit.WebView;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: sjy  reason: default package */
/* loaded from: classes4.dex */
public final class sjy implements skq, sky {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/web/WebManager");
    public final sjw b;
    private final skl c;
    private skr d;

    public sjy(skl sklVar) {
        this.c = sklVar;
        this.b = new sjw(sklVar);
    }

    @Override // defpackage.sky
    public final void a() {
        sjw sjwVar = this.b;
        aopa createBuilder = awfl.a.createBuilder();
        awfr awfrVar = awfr.a;
        createBuilder.copyOnWrite();
        awfl awflVar = (awfl) createBuilder.instance;
        awfrVar.getClass();
        awflVar.c = awfrVar;
        awflVar.b = 16;
        sjwVar.a((awfl) createBuilder.mo39build());
    }

    @Override // defpackage.skq
    public final void b() {
        skc skcVar = (skc) this.c;
        skcVar.b.destroy();
        skcVar.b = null;
    }

    @Override // defpackage.skq
    public final void c(skr skrVar) {
        anvx anvxVar;
        this.d = skrVar;
        skl sklVar = this.c;
        anvy anvyVar = skrVar.a.a;
        if (anvyVar.e == 5) {
            anvxVar = (anvx) anvyVar.f;
        } else {
            anvxVar = anvx.a;
        }
        String str = anvxVar.c;
        WebView webView = ((skc) sklVar).b;
        if (webView != null) {
            webView.loadUrl(str);
        }
        this.b.d = skrVar;
        String languageTag = Locale.getDefault().toLanguageTag();
        aopa createBuilder = awgh.a.createBuilder();
        createBuilder.copyOnWrite();
        awgh awghVar = (awgh) createBuilder.instance;
        languageTag.getClass();
        awghVar.b |= 1;
        awghVar.c = languageTag;
        if (this.d.a.b == 2) {
            createBuilder.copyOnWrite();
            awgh awghVar2 = (awgh) createBuilder.instance;
            awghVar2.b |= 2;
            awghVar2.d = "dark";
        }
        final awgh awghVar3 = (awgh) createBuilder.mo39build();
        skr skrVar2 = this.d;
        ankt d = skrVar2.e.c().d();
        SettableFuture settableFuture = ((shx) skrVar2.e.a()).d;
        final ankt a2 = anlz.m(d, settableFuture).a(new ambx(d, settableFuture, 1), skrVar2.c);
        anlz.m(a2, this.b.c).c(new Runnable() { // from class: sjx
            @Override // java.lang.Runnable
            public final void run() {
                sjy sjyVar = sjy.this;
                awgh awghVar4 = awghVar3;
                ankt anktVar = a2;
                if (awghVar4 != null) {
                    sjw sjwVar = sjyVar.b;
                    aopa createBuilder2 = awfl.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    awfl awflVar = (awfl) createBuilder2.instance;
                    awflVar.c = awghVar4;
                    awflVar.b = 2;
                    sjwVar.a((awfl) createBuilder2.mo39build());
                }
                try {
                    awgg awggVar = (awgg) anlz.y(anktVar);
                    if (awggVar != null) {
                        sjw sjwVar2 = sjyVar.b;
                        aopa createBuilder3 = awfl.a.createBuilder();
                        createBuilder3.copyOnWrite();
                        awfl awflVar2 = (awfl) createBuilder3.instance;
                        awflVar2.c = awggVar;
                        awflVar2.b = 1;
                        sjwVar2.a((awfl) createBuilder3.mo39build());
                        return;
                    }
                    ((amzw) ((amzw) sjy.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebManager", "lambda$sendContextAndConfig$0", 69, "WebManager.java")).q("Error getting Web config. Null returned.");
                } catch (ExecutionException e) {
                    ((amzw) ((amzw) ((amzw) sjy.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/web/WebManager", "lambda$sendContextAndConfig$0", 'H', "WebManager.java")).q("Exception getting Web config.");
                }
            }
        }, this.d.c);
    }
}
