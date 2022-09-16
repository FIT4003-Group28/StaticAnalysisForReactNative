package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.widget.Button;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.setupcompat.logging.CustomEvent;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: alwb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alwb {
    public static void a(Context context, CustomEvent customEvent) {
        apwt.n(context, "Context cannot be null.");
        alvw a = alvw.a(context);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CustomEvent_bundle", CustomEvent.b(customEvent));
        a.e(1, bundle);
    }

    public static int b(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void c(Context context, Button button, alwe alweVar) {
        int c = alwg.f(context).c(context, alweVar);
        if (c != 0) {
            button.setTextColor(ColorStateList.valueOf(c));
        }
    }

    public static final alwj d(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return q(xml, context);
        } finally {
            xml.close();
        }
    }

    public static String e(akqe akqeVar) {
        String encode;
        String str = File.separator;
        String valueOf = String.valueOf(akqeVar.b);
        String concat = valueOf.length() != 0 ? "BLOB_STORAGE.".concat(valueOf) : new String("BLOB_STORAGE.");
        try {
            concat = URLEncoder.encode(concat, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        String str2 = File.separator;
        String str3 = akqeVar.c;
        try {
            try {
                encode = URLEncoder.encode(akqeVar.a, "UTF-8");
            } catch (UnsupportedEncodingException unused2) {
            }
            String encode2 = URLEncoder.encode(str3, "UTF-8");
            StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 1 + String.valueOf(encode2).length());
            sb.append(encode);
            sb.append(".");
            sb.append(encode2);
            str3 = sb.toString();
        } catch (UnsupportedEncodingException unused3) {
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(concat);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static void f(snc sncVar, final Snackbar snackbar, aabj aabjVar, long j, aafo aafoVar, Integer num) {
        apoj apojVar;
        Spanned spanned = (Spanned) aabjVar.f().b(aiyy.p).b(aiyy.o).f();
        String str = null;
        arag aragVar = null;
        if (TextUtils.isEmpty(spanned) || !aabjVar.f().h()) {
            if (!aabjVar.e().h()) {
                return;
            }
            atoo atooVar = (atoo) aabjVar.e().c();
            arag aragVar2 = atooVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b = ajgl.b(aragVar2);
            if (TextUtils.isEmpty(b)) {
                return;
            }
            apok apokVar = atooVar.d;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) != 0) {
                apok apokVar2 = atooVar.d;
                if (apokVar2 == null) {
                    apokVar2 = apok.a;
                }
                apojVar = apokVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
            } else {
                apojVar = null;
            }
            if (apojVar != null) {
                if ((apojVar.b & 256) != 0) {
                    arag aragVar3 = apojVar.i;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    str = ajgl.b(aragVar3).toString();
                }
                apzg apzgVar = apojVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                snackbar.e(b, str, r(aabjVar, snackbar, aafoVar, apzgVar));
            } else {
                snackbar.d(b);
            }
        } else {
            atpl atplVar = (atpl) aabjVar.f().c();
            int i = atplVar.b;
            if ((i & 4) != 0) {
                if ((i & 2) != 0 && (aragVar = atplVar.d) == null) {
                    aragVar = arag.a;
                }
                String obj = ajgl.b(aragVar).toString();
                apzg apzgVar2 = atplVar.e;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                snackbar.e(spanned, obj, r(aabjVar, snackbar, aafoVar, apzgVar2));
                if (num != null) {
                    snackbar.c.setTextColor(num.intValue());
                }
            } else {
                snackbar.d(spanned);
            }
        }
        Handler handler = snackbar.getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(snackbar);
            veu veuVar = snackbar.a;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(snackbar, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("translationY", snackbar.getHeight(), 0.0f));
            ofPropertyValuesHolder.addListener(new vfd(snackbar));
            veuVar.a();
            if (veuVar.a.b()) {
                veuVar.b = ofPropertyValuesHolder;
                veuVar.b.start();
            }
            snackbar.getClass();
            handler.postAtTime(new Runnable() { // from class: akpt
                @Override // java.lang.Runnable
                public final void run() {
                    Snackbar.this.c();
                }
            }, snackbar, sncVar.g() + j);
        }
    }

    public static final void g(Object obj, aurt aurtVar, akjl akjlVar, akjm akjmVar, akjh akjhVar) {
        akjlVar.h.b(akjl.b(aurtVar).bS);
        List c = akjl.c(aurtVar);
        int i = 0;
        while (true) {
            if (i >= c.size()) {
                i = -1;
                break;
            } else if (((auro) c.get(i)).e.equals(obj.toString())) {
                break;
            } else {
                i++;
            }
        }
        auro auroVar = (auro) c.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        aafo aafoVar = akjlVar.d;
        apzg apzgVar = auroVar.g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
        if (akjhVar != null) {
            akjhVar.a.n(auroVar.c);
        }
        int i2 = 0;
        while (i2 < c.size()) {
            akjmVar.e((auro) c.get(i2), i2 == i);
            i2++;
        }
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int i(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int j(int i) {
        if (i != 0) {
            if (i == 10) {
                return 11;
            }
            if (i == 20) {
                return 21;
            }
            if (i == 30) {
                return 31;
            }
            if (i == 80) {
                return 81;
            }
            return i != 100 ? 0 : 101;
        }
        return 1;
    }

    public static int k(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int l(int i) {
        return i - 2;
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "UNRECOGNIZED";
            case 2:
                return "CODEC_INIT_REASON_UNKNOWN";
            case 3:
                return "CODEC_INIT_REASON_ROTATION_DEGREE";
            case 4:
                return "CODEC_INIT_REASON_COLOR_INFO";
            case 5:
                return "CODEC_INIT_REASON_MIME_TYPE";
            case 6:
                return "CODEC_INIT_REASON_DIMENSIONS";
            case 7:
                return "CODEC_INIT_REASON_CODEC_OPERATING_RATE";
            case 8:
                return "CODEC_INIT_REASON_MAX_WIDTH";
            case 9:
                return "CODEC_INIT_REASON_MAX_HEIGHT";
            case 10:
                return "CODEC_INIT_REASON_MAX_INPUT_SIZE";
            case 11:
                return "CODEC_INIT_REASON_FIRST_PLAYBACK";
            case 12:
                return "CODEC_INIT_REASON_ABRUPT_SPLICING";
            case 13:
                return "CODEC_INIT_REASON_BACKGROUND";
            case 14:
                return "CODEC_INIT_REASON_PREWARM";
            case 15:
                return "CODEC_INIT_REASON_TRACK_RENDERER_TYPE_SWITCH";
            case 16:
                return "CODEC_INIT_REASON_RESELECT_STREAMS";
            case 17:
                return "CODEC_INIT_REASON_DETACH_MEDIA_VIEW";
            case 18:
                return "CODEC_INIT_REASON_NULL_MEDIA_VIEW_SWITCH";
            case 19:
                return "CODEC_INIT_REASON_PLAYER_SWITCH";
            case 20:
                return "CODEC_INIT_REASON_PLAYER_RESET";
            case 21:
                return "CODEC_INIT_REASON_EXOPLAYER_OVERRIDE";
            case 22:
                return "CODEC_INIT_REASON_DRM_HD";
            case 23:
                return "CODEC_INIT_REASON_DRM_STOPPED";
            case 24:
                return "CODEC_INIT_REASON_STOP";
            case 25:
                return "CODEC_INIT_REASON_CODEC_NAME";
            case 26:
                return "CODEC_INIT_REASON_REUSE_DISABLED";
            case 27:
                return "CODEC_INIT_REASON_CONFIGURE_FAILED";
            case 28:
                return "CODEC_INIT_REASON_SET_OUTPUT_SURFACE_FAILED";
            case 29:
                return "CODEC_INIT_REASON_INITIALIZATION_DATA";
            default:
                return "null";
        }
    }

    public static int n(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int o(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int p(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    private static final alwj q(XmlPullParser xmlPullParser, Context context) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new alwj(context, asAttributeSet);
                    }
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": not a FooterButton"));
                } else if (next == 1) {
                    throw new InflateException(String.valueOf(xmlPullParser.getPositionDescription()).concat(": No start tag found!"));
                }
            } catch (IOException e) {
                String positionDescription = xmlPullParser.getPositionDescription();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 2 + String.valueOf(message).length());
                sb.append(positionDescription);
                sb.append(": ");
                sb.append(message);
                throw new InflateException(sb.toString(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        }
    }

    private static View.OnClickListener r(final aabj aabjVar, final Snackbar snackbar, final aafo aafoVar, final apzg apzgVar) {
        return new View.OnClickListener() { // from class: akps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aabj aabjVar2 = aabj.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar2 = apzgVar;
                Snackbar snackbar2 = snackbar;
                HashMap hashMap = new HashMap();
                if (aabjVar2.g() != null) {
                    hashMap.putAll(aabjVar2.g());
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ((ampq) aabjVar2.h()).f());
                if (aafoVar2 != null) {
                    aafoVar2.c(apzgVar2, hashMap);
                }
                snackbar2.c();
            }
        };
    }
}
