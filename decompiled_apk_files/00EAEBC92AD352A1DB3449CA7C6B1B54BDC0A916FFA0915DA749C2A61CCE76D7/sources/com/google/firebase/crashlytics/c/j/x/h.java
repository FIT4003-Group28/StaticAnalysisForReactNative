package com.google.firebase.crashlytics.c.j.x;

import android.util.Base64;
import android.util.JsonReader;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.firebase.crashlytics.c.j.v;
import com.google.firebase.crashlytics.c.j.w;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final c.e.b.k.a f9021a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a<T> {
        T a(JsonReader jsonReader);
    }

    static {
        c.e.b.k.i.d dVar = new c.e.b.k.i.d();
        dVar.a(com.google.firebase.crashlytics.c.j.a.f8827a);
        dVar.a(true);
        f9021a = dVar.a();
    }

    private static <T> w<T> a(JsonReader jsonReader, a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return w.a(arrayList);
    }

    private static v.d.a h(JsonReader jsonReader) {
        v.d.a.AbstractC0170a f2 = v.d.a.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                f2.b(jsonReader.nextString());
            } else if (c2 == 1) {
                f2.d(jsonReader.nextString());
            } else if (c2 == 2) {
                f2.a(jsonReader.nextString());
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                f2.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return f2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.b i(JsonReader jsonReader) {
        v.b.a c2 = v.b.c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c3 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 106079) {
                if (hashCode == 111972721 && nextName.equals("value")) {
                    c3 = 1;
                }
            } else if (nextName.equals("key")) {
                c3 = 0;
            }
            if (c3 == 0) {
                c2.a(jsonReader.nextString());
            } else if (c3 != 1) {
                jsonReader.skipValue();
            } else {
                c2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return c2.a();
    }

    private static v.d.c j(JsonReader jsonReader) {
        v.d.c.a j = v.d.c.j();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    j.a(jsonReader.nextInt());
                    break;
                case 1:
                    j.b(jsonReader.nextString());
                    break;
                case 2:
                    j.b(jsonReader.nextInt());
                    break;
                case 3:
                    j.b(jsonReader.nextLong());
                    break;
                case 4:
                    j.a(jsonReader.nextLong());
                    break;
                case 5:
                    j.a(jsonReader.nextBoolean());
                    break;
                case 6:
                    j.c(jsonReader.nextInt());
                    break;
                case 7:
                    j.a(jsonReader.nextString());
                    break;
                case '\b':
                    j.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return j.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0171d k(JsonReader jsonReader) {
        v.d.AbstractC0171d.b g2 = v.d.AbstractC0171d.g();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                g2.a(jsonReader.nextLong());
            } else if (c2 == 1) {
                g2.a(jsonReader.nextString());
            } else if (c2 == 2) {
                g2.a(l(jsonReader));
            } else if (c2 == 3) {
                g2.a(n(jsonReader));
            } else if (c2 != 4) {
                jsonReader.skipValue();
            } else {
                g2.a(r(jsonReader));
            }
        }
        jsonReader.endObject();
        return g2.a();
    }

    private static v.d.AbstractC0171d.a l(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.AbstractC0172a f2 = v.d.AbstractC0171d.a.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                f2.a(Boolean.valueOf(jsonReader.nextBoolean()));
            } else if (c2 == 1) {
                f2.a(jsonReader.nextInt());
            } else if (c2 == 2) {
                f2.a(o(jsonReader));
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                f2.a(a(jsonReader, c.a()));
            }
        }
        jsonReader.endObject();
        return f2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0171d.a.b.AbstractC0173a m(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.AbstractC0173a.AbstractC0174a f2 = v.d.AbstractC0171d.a.b.AbstractC0173a.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                f2.a(jsonReader.nextString());
            } else if (c2 == 1) {
                f2.a(jsonReader.nextLong());
            } else if (c2 == 2) {
                f2.b(jsonReader.nextLong());
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                f2.a(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return f2.a();
    }

    private static v.d.AbstractC0171d.c n(JsonReader jsonReader) {
        v.d.AbstractC0171d.c.a g2 = v.d.AbstractC0171d.c.g();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                g2.a(Double.valueOf(jsonReader.nextDouble()));
            } else if (c2 == 1) {
                g2.a(jsonReader.nextInt());
            } else if (c2 == 2) {
                g2.a(jsonReader.nextLong());
            } else if (c2 == 3) {
                g2.a(jsonReader.nextBoolean());
            } else if (c2 == 4) {
                g2.b(jsonReader.nextInt());
            } else if (c2 != 5) {
                jsonReader.skipValue();
            } else {
                g2.b(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return g2.a();
    }

    private static v.d.AbstractC0171d.a.b o(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.AbstractC0175b e2 = v.d.AbstractC0171d.a.b.e();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                e2.b(a(jsonReader, d.a()));
            } else if (c2 == 1) {
                e2.a(p(jsonReader));
            } else if (c2 == 2) {
                e2.a(s(jsonReader));
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                e2.a(a(jsonReader, e.a()));
            }
        }
        jsonReader.endObject();
        return e2.a();
    }

    private static v.d.AbstractC0171d.a.b.c p(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.c.AbstractC0176a f2 = v.d.AbstractC0171d.a.b.c.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                f2.a(p(jsonReader));
            } else if (c2 == 1) {
                f2.a(a(jsonReader, f.a()));
            } else if (c2 == 2) {
                f2.a(jsonReader.nextInt());
            } else if (c2 == 3) {
                f2.b(jsonReader.nextString());
            } else if (c2 != 4) {
                jsonReader.skipValue();
            } else {
                f2.a(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return f2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0171d.a.b.e.AbstractC0180b q(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.e.AbstractC0180b.AbstractC0181a f2 = v.d.AbstractC0171d.a.b.e.AbstractC0180b.f();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                f2.a(jsonReader.nextInt());
            } else if (c2 == 1) {
                f2.a(jsonReader.nextString());
            } else if (c2 == 2) {
                f2.a(jsonReader.nextLong());
            } else if (c2 == 3) {
                f2.b(jsonReader.nextLong());
            } else if (c2 != 4) {
                jsonReader.skipValue();
            } else {
                f2.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return f2.a();
    }

    private static v.d.AbstractC0171d.AbstractC0182d r(JsonReader jsonReader) {
        v.d.AbstractC0171d.AbstractC0182d.a b2 = v.d.AbstractC0171d.AbstractC0182d.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            if (nextName.hashCode() == 951530617 && nextName.equals("content")) {
                c2 = 0;
            }
            if (c2 != 0) {
                jsonReader.skipValue();
            } else {
                b2.a(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return b2.a();
    }

    private static v.d.AbstractC0171d.a.b.AbstractC0177d s(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.AbstractC0177d.AbstractC0178a d2 = v.d.AbstractC0171d.a.b.AbstractC0177d.d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3059181) {
                    if (hashCode == 3373707 && nextName.equals("name")) {
                        c2 = 0;
                    }
                } else if (nextName.equals("code")) {
                    c2 = 1;
                }
            } else if (nextName.equals("address")) {
                c2 = 2;
            }
            if (c2 == 0) {
                d2.b(jsonReader.nextString());
            } else if (c2 == 1) {
                d2.a(jsonReader.nextString());
            } else if (c2 != 2) {
                jsonReader.skipValue();
            } else {
                d2.a(jsonReader.nextLong());
            }
        }
        jsonReader.endObject();
        return d2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.d.AbstractC0171d.a.b.e t(JsonReader jsonReader) {
        v.d.AbstractC0171d.a.b.e.AbstractC0179a d2 = v.d.AbstractC0171d.a.b.e.d();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -1266514778) {
                if (hashCode != 3373707) {
                    if (hashCode == 2125650548 && nextName.equals("importance")) {
                        c2 = 0;
                    }
                } else if (nextName.equals("name")) {
                    c2 = 1;
                }
            } else if (nextName.equals("frames")) {
                c2 = 2;
            }
            if (c2 == 0) {
                d2.a(jsonReader.nextInt());
            } else if (c2 == 1) {
                d2.a(jsonReader.nextString());
            } else if (c2 != 2) {
                jsonReader.skipValue();
            } else {
                d2.a(a(jsonReader, g.a()));
            }
        }
        jsonReader.endObject();
        return d2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static v.c.b u(JsonReader jsonReader) {
        v.c.b.a c2 = v.c.b.c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c3 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -734768633) {
                if (hashCode == -567321830 && nextName.equals("contents")) {
                    c3 = 1;
                }
            } else if (nextName.equals("filename")) {
                c3 = 0;
            }
            if (c3 == 0) {
                c2.a(jsonReader.nextString());
            } else if (c3 != 1) {
                jsonReader.skipValue();
            } else {
                c2.a(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return c2.a();
    }

    private static v.c v(JsonReader jsonReader) {
        v.c.a c2 = v.c.c();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c3 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 97434231) {
                if (hashCode == 106008351 && nextName.equals("orgId")) {
                    c3 = 1;
                }
            } else if (nextName.equals("files")) {
                c3 = 0;
            }
            if (c3 == 0) {
                c2.a(a(jsonReader, b.a()));
            } else if (c3 != 1) {
                jsonReader.skipValue();
            } else {
                c2.a(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return c2.a();
    }

    private static v.d.e w(JsonReader jsonReader) {
        v.d.e.a e2 = v.d.e.e();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                e2.a(jsonReader.nextInt());
            } else if (c2 == 1) {
                e2.b(jsonReader.nextString());
            } else if (c2 == 2) {
                e2.a(jsonReader.nextString());
            } else if (c2 != 3) {
                jsonReader.skipValue();
            } else {
                e2.a(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
        return e2.a();
    }

    private static v x(JsonReader jsonReader) {
        v.a l = v.l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    l.e(jsonReader.nextString());
                    break;
                case 1:
                    l.c(jsonReader.nextString());
                    break;
                case 2:
                    l.a(jsonReader.nextInt());
                    break;
                case 3:
                    l.d(jsonReader.nextString());
                    break;
                case 4:
                    l.a(jsonReader.nextString());
                    break;
                case 5:
                    l.b(jsonReader.nextString());
                    break;
                case 6:
                    l.a(y(jsonReader));
                    break;
                case 7:
                    l.a(v(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return l.a();
    }

    private static v.d y(JsonReader jsonReader) {
        v.d.b n = v.d.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c2 = '\n';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    n.a(jsonReader.nextString());
                    break;
                case 1:
                    n.a(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    n.a(jsonReader.nextLong());
                    break;
                case 3:
                    n.a(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 4:
                    n.a(jsonReader.nextBoolean());
                    break;
                case 5:
                    n.a(z(jsonReader));
                    break;
                case 6:
                    n.a(h(jsonReader));
                    break;
                case 7:
                    n.a(w(jsonReader));
                    break;
                case '\b':
                    n.a(j(jsonReader));
                    break;
                case '\t':
                    n.a(a(jsonReader, com.google.firebase.crashlytics.c.j.x.a.a()));
                    break;
                case '\n':
                    n.a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return n.a();
    }

    private static v.d.f z(JsonReader jsonReader) {
        v.d.f.a b2 = v.d.f.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c2 = 65535;
            if (nextName.hashCode() == -1618432855 && nextName.equals("identifier")) {
                c2 = 0;
            }
            if (c2 != 0) {
                jsonReader.skipValue();
            } else {
                b2.a(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return b2.a();
    }

    public v.d.AbstractC0171d a(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            v.d.AbstractC0171d k = k(jsonReader);
            jsonReader.close();
            return k;
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public String a(v.d.AbstractC0171d abstractC0171d) {
        return f9021a.a(abstractC0171d);
    }

    public String a(v vVar) {
        return f9021a.a(vVar);
    }

    public v b(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            v x = x(jsonReader);
            jsonReader.close();
            return x;
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }
}
