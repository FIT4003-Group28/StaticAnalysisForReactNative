package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
import com.google.android.libraries.ar.faceviewer.runtime.NativeCallback;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: skc  reason: default package */
/* loaded from: classes4.dex */
public final class skc implements skl {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/components/web/WebViewWebInterface");
    public WebView b;
    public skk c;

    public skc(Context context) {
        ska skaVar = new ska(context);
        this.b = skaVar;
        skaVar.getSettings().setJavaScriptEnabled(true);
        this.b.setWebViewClient(new skb());
        this.b.setBackgroundColor(0);
        this.b.addJavascriptInterface(this, "ytArAdsAndroidBridge");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @JavascriptInterface
    public void postMessage(String str) {
        awga awgaVar;
        awft awftVar;
        skk skkVar = this.c;
        if (skkVar == null) {
            ((amzw) ((amzw) a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebViewWebInterface", "postMessage", 37, "WebViewWebInterface.java")).q("Received message before handler is initialized.");
        } else if (str == null) {
        } else {
            int i = 2;
            try {
                awfk awfkVar = (awfk) aopi.parseFrom(awfk.a, Base64.decode(str, 2), aoos.b());
                skr skrVar = ((sjw) skkVar).d;
                if (skrVar == null) {
                    ((amzw) ((amzw) sjw.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 97, "WebBridge.java")).q("handleMessageFromWeb before context initialized.");
                    return;
                }
                switch (awfkVar.b) {
                    case 0:
                        i = 19;
                        break;
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 5;
                        break;
                    case 6:
                        i = 6;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 9:
                        i = 9;
                        break;
                    case 10:
                        i = 10;
                        break;
                    case 11:
                        i = 11;
                        break;
                    case 12:
                        i = 12;
                        break;
                    case 13:
                        i = 13;
                        break;
                    case 14:
                        i = 14;
                        break;
                    case 15:
                        i = 15;
                        break;
                    case 16:
                        i = 16;
                        break;
                    case 17:
                        i = 17;
                        break;
                    case 18:
                        i = 18;
                        break;
                    default:
                        i = 0;
                        break;
                }
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 13) {
                    sks a2 = skrVar.e.a();
                    ((shx) a2).f = false;
                    if (((shx) a2).e.a.a()) {
                        sjw sjwVar = ((sjy) ((shx) a2).e.e.d()).b;
                        aopa createBuilder = awfl.a.createBuilder();
                        awfm awfmVar = awfm.a;
                        createBuilder.copyOnWrite();
                        awfl awflVar = (awfl) createBuilder.instance;
                        awfmVar.getClass();
                        awflVar.c = awfmVar;
                        awflVar.b = 13;
                        sjwVar.a((awfl) createBuilder.mo39build());
                    }
                    ((shx) a2).e.e.c().e();
                } else if (i2 == 17) {
                    sks a3 = skrVar.e.a();
                    ((shx) a3).f = true;
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", ((shx) a3).b.getPackageName(), null));
                    ((shx) a3).b.startActivity(intent);
                } else {
                    switch (i2) {
                        case 0:
                            shr shrVar = skrVar.e;
                            shrVar.a.a(shrVar.b.a());
                            ((sjw) skkVar).d.e.a.f(skt.ASSET_SWITCH);
                            if (awfkVar.b == 1) {
                                awgaVar = (awga) awfkVar.c;
                            } else {
                                awgaVar = awga.a;
                            }
                            String str2 = awgaVar.b;
                            skr skrVar2 = ((sjw) skkVar).d;
                            if (skrVar2 != null) {
                                skx c = skrVar2.e.c();
                                final List singletonList = Collections.singletonList(str2);
                                skr skrVar3 = ((sju) c).k;
                                if (skrVar3 == null) {
                                    return;
                                }
                                final SettableFuture settableFuture = ((shx) skrVar3.e.a()).d;
                                ((sju) c).k.e.a.f(skt.RENDER_INIT);
                                final sju sjuVar = (sju) c;
                                anlz.A(((sju) c).j.b(new slc() { // from class: sjn
                                    @Override // defpackage.slc
                                    public final ankt a() {
                                        final sju sjuVar2 = sju.this;
                                        final ankt anktVar = settableFuture;
                                        final List list = singletonList;
                                        return anlz.m(sjuVar2.c, sjuVar2.d, anktVar).b(new aniq() { // from class: sjp
                                            @Override // defpackage.aniq
                                            public final ankt a() {
                                                sju sjuVar3 = sju.this;
                                                ankt anktVar2 = anktVar;
                                                final List list2 = list;
                                                if (((Boolean) anlz.y(anktVar2)).booleanValue()) {
                                                    final sja sjaVar = (sja) anlz.y(sjuVar3.c);
                                                    final awxb awxbVar = (awxb) anlz.y(sjuVar3.d);
                                                    return aed.c(new agr() { // from class: siz
                                                        @Override // defpackage.agr
                                                        public final Object a(agp agpVar) {
                                                            sja sjaVar2 = sja.this;
                                                            List list3 = list2;
                                                            awxb awxbVar2 = awxbVar;
                                                            ExperienceJni experienceJni = sjaVar2.a;
                                                            experienceJni.nativeActivateItems(experienceJni.b, list3, awxbVar2.d.get() ? awxbVar2.c : 0L, NativeCallback.a(siu.a(agpVar)));
                                                            return "Experience.activateItems";
                                                        }
                                                    });
                                                }
                                                return anlz.p(new RuntimeException("GPU not supported."));
                                            }
                                        }, sjuVar2.i);
                                    }
                                }), new sjt((sju) c, singletonList), ((sju) c).k.c);
                                return;
                            }
                            ((amzw) ((amzw) sjw.a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "setEffect", 145, "WebBridge.java")).q("Cannot set effect when faceViewerContext is null.");
                            return;
                        case 1:
                            ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 111, "WebBridge.java")).q("handle log");
                            return;
                        case 2:
                            sks a4 = skrVar.e.a();
                            ((shx) a4).f = true;
                            ((shx) a4).f();
                            return;
                        case 3:
                            ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", R.styleable.AppCompatTheme_windowMinWidthMajor, "WebBridge.java")).q("handle capture start");
                            return;
                        case 4:
                            ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 127, "WebBridge.java")).q("handle capture image");
                            break;
                        case 5:
                            break;
                        case 6:
                            ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 114, "WebBridge.java")).q("handle open link");
                            sks a5 = ((sjw) skkVar).d.e.a();
                            if (awfkVar.b == 7) {
                                awftVar = (awft) awfkVar.c;
                            } else {
                                awftVar = awft.a;
                            }
                            String str3 = awftVar.b;
                            Intent intent2 = new Intent("android.intent.action.VIEW");
                            intent2.setData(Uri.parse(str3));
                            ((shx) a5).b.startActivity(intent2);
                            return;
                        case 7:
                            ((sjw) skkVar).c.o(true);
                            return;
                        case 8:
                            ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 108, "WebBridge.java")).q("handle effect input");
                            return;
                        default:
                            return;
                    }
                    ((amzw) ((amzw) sjw.a.e()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessageFromWeb", 130, "WebBridge.java")).q("handle capture end");
                }
            } catch (aopx e) {
                ((amzw) ((amzw) ((amzw) sjw.a.f()).h(e)).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "handleMessage", '9', "WebBridge.java")).q("Unable to parse protocol buffer from Web Message");
            }
        }
    }
}
