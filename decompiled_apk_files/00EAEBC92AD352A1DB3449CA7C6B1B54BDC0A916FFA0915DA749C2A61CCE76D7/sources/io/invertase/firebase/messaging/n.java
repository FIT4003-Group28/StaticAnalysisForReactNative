package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.s;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {
    static WritableMap a(s.c cVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (cVar.n() != null) {
            createMap.putString("title", cVar.n());
        }
        if (cVar.p() != null) {
            createMap.putString("titleLocKey", cVar.p());
        }
        if (cVar.o() != null) {
            createMap.putArray("titleLocArgs", Arguments.fromJavaArgs(cVar.o()));
        }
        if (cVar.a() != null) {
            createMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            createMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            createMap.putArray("bodyLocArgs", Arguments.fromJavaArgs(cVar.b()));
        }
        if (cVar.d() != null) {
            createMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            createMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            createMap2.putString("color", cVar.f());
        }
        if (cVar.g() != null) {
            createMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            createMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            createMap2.putString("link", cVar.i().toString());
        }
        if (cVar.j() != null) {
            createMap2.putInt("count", cVar.j().intValue());
        }
        if (cVar.k() != null) {
            createMap2.putInt("priority", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            createMap2.putString("sound", cVar.l());
        }
        if (cVar.m() != null) {
            createMap2.putString("ticker", cVar.m());
        }
        if (cVar.q() != null) {
            createMap2.putInt("visibility", cVar.q().intValue());
        }
        createMap.putMap("android", createMap2);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap a(s sVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (sVar.q() != null) {
            createMap.putString("collapseKey", sVar.q());
        }
        if (sVar.s() != null) {
            createMap.putString("from", sVar.s());
        }
        if (sVar.y() != null) {
            createMap.putString("to", sVar.y());
        }
        if (sVar.t() != null) {
            createMap.putString("messageId", sVar.t());
        }
        if (sVar.u() != null) {
            createMap.putString("messageType", sVar.u());
        }
        if (sVar.r().size() > 0) {
            for (Map.Entry<String, String> entry : sVar.r().entrySet()) {
                createMap2.putString(entry.getKey(), entry.getValue());
            }
        }
        createMap.putMap("data", createMap2);
        createMap.putDouble("ttl", sVar.z());
        createMap.putDouble("sentTime", sVar.x());
        if (sVar.v() != null) {
            createMap.putMap("notification", a(sVar.v()));
        }
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(ReadableMap readableMap) {
        s.b bVar = new s.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.a(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.b(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.c(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.a(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap mo210getMap = readableMap.mo210getMap("data");
            ReadableMapKeySetIterator keySetIterator = mo210getMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                bVar.a(nextKey, mo210getMap.getString(nextKey));
            }
        }
        return bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static io.invertase.firebase.common.f a() {
        return new io.invertase.firebase.common.f("messaging_message_deleted", Arguments.createMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static io.invertase.firebase.common.f a(s sVar, Boolean bool) {
        return new io.invertase.firebase.common.f(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", a(sVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static io.invertase.firebase.common.f a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        return new io.invertase.firebase.common.f("messaging_message_sent", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static io.invertase.firebase.common.f a(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        createMap.putMap("error", io.invertase.firebase.common.l.a(exc));
        return new io.invertase.firebase.common.f("messaging_message_send_error", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static io.invertase.firebase.common.f b(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("token", str);
        return new io.invertase.firebase.common.f("messaging_token_refresh", createMap);
    }
}
