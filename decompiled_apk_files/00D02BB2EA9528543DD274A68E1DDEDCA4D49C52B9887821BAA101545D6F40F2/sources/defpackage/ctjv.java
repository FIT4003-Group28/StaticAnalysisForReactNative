package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ctjv  reason: default package */
/* loaded from: classes5.dex */
public final class ctjv {
    public static dbsg<cufp> a(Cursor cursor) {
        dbsg<cuib> dbsgVar;
        Bitmap c;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            int length = ctlw.b.length;
            int i = length + 7;
            String[] strArr = ctlu.a;
            cufo o = cufp.o();
            if (ConversationId.IdType.a(cursor.getInt(ctlv.a(2))) == ConversationId.IdType.GROUP) {
                cufq f = ConversationId.f();
                cufr c2 = ConversationId.GroupId.c();
                c2.c(cursor.getString(ctlv.a(3)));
                c2.b(cursor.getString(ctlv.a(4)));
                f.d(c2.a());
                f.c(ctjt.b(length, cursor));
                o.n(f);
            } else {
                cufq f2 = ConversationId.f();
                f2.e(ctjt.b(i, cursor));
                f2.c(ctjt.b(length, cursor));
                o.n(f2);
            }
            o.b(csto.e(cursor.getBlob(ctlv.a(8))));
            cudc cudcVar = (cudc) o;
            cudcVar.a = Long.valueOf(cursor.getLong(ctlv.a(9)));
            HashMap<String, Object> d = csto.d(cursor.getBlob(ctlv.a(10)));
            if (d.isEmpty()) {
                cstl.a("ConversationCursors");
            } else {
                if (d.containsKey("expiration_time_ms")) {
                    o.f((Long) d.get("expiration_time_ms"));
                } else {
                    o.f(-1L);
                }
                if (d.containsKey("blockable")) {
                    o.c(((Boolean) d.get("blockable")).booleanValue());
                }
                if (d.containsKey("title")) {
                    o.m((String) d.get("title"));
                }
                if (d.containsKey("image_url")) {
                    o.h((String) d.get("image_url"));
                }
                if (d.containsKey("image_stale")) {
                    o.i(((Boolean) d.get("image_stale")).booleanValue());
                }
                if (d.containsKey("image") && (c = csto.c((byte[]) d.get("image"))) != null) {
                    o.g(c);
                }
                if (d.containsKey("suggestion_list")) {
                    HashMap<String, Object> d2 = csto.d((byte[]) d.get("suggestion_list"));
                    try {
                        cuia g = cuib.g();
                        g.c((String) d2.get("ID"));
                        g.e(((Integer) d2.get("RENDER_STYLE")).intValue());
                        g.d((String) d2.get("MESSAGE_ID"));
                        g.b((String) d2.get("HINT_TEXT"));
                        dcdc<cuhz> c3 = cstr.c((ArrayList) d2.get("SUGGESTIONS"), ctkt.a);
                        if (c3.isEmpty()) {
                            dbsgVar = dbpy.a;
                        } else {
                            g.f(c3);
                            dbsgVar = dbsg.i(g.a());
                        }
                    } catch (ClassCastException | IllegalStateException | NullPointerException unused) {
                        cstl.a("ChipsListConverters");
                        dbsgVar = dbpy.a;
                    }
                    cudcVar.b = dbsgVar;
                }
                if (d.containsKey("capabilities")) {
                    try {
                        o.d(dcdc.r((ArrayList) d.get("capabilities")));
                    } catch (ClassCastException unused2) {
                        cstl.a("ConversationCursors");
                    }
                }
                if (d.containsKey("properties_expiration_time_ms")) {
                    o.j((Long) d.get("properties_expiration_time_ms"));
                } else {
                    o.j(-1L);
                }
                if (d.containsKey("server_timestamp_us")) {
                    o.k(((Long) d.get("server_timestamp_us")).longValue());
                }
            }
            try {
                return dbsg.i(o.a());
            } catch (IllegalStateException unused3) {
                return dbpy.a;
            }
        }
        return dbpy.a;
    }

    public static HashMap<String, Object> b(cufp cufpVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        f(hashMap, cufpVar);
        if (cufpVar.j().a()) {
            cuib b = cufpVar.j().b();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ID", b.a());
            hashMap2.put("MESSAGE_ID", b.b());
            hashMap2.put("RENDER_STYLE", Integer.valueOf(b.d()));
            hashMap2.put("SUGGESTIONS", cstr.b(b.c(), ctks.a));
            hashMap2.put("HINT_TEXT", b.e());
            hashMap.put("suggestion_list", csto.a(hashMap2));
        }
        hashMap.put("capabilities", new ArrayList(cufpVar.k()));
        hashMap.put("properties_expiration_time_ms", cufpVar.l());
        return hashMap;
    }

    public static byte[] c(cufp cufpVar) {
        try {
            return csto.a(b(cufpVar));
        } catch (IOException unused) {
            cstl.a("ConversationCursors");
            return new byte[0];
        }
    }

    public static byte[] d(HashMap<String, byte[]> hashMap) {
        try {
            return csto.a(hashMap);
        } catch (IOException unused) {
            cstl.a("ConversationCursors");
            return new byte[0];
        }
    }

    public static HashMap<String, Object> e(byte[] bArr) {
        try {
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            return readObject instanceof HashMap ? (HashMap) readObject : new HashMap<>();
        } catch (IOException | ClassNotFoundException unused) {
            cstl.a("ConversationCursors");
            return new HashMap<>();
        }
    }

    public static void f(HashMap<String, Object> hashMap, cufp cufpVar) {
        hashMap.put("expiration_time_ms", cufpVar.f());
        hashMap.put("blockable", Boolean.valueOf(cufpVar.h()));
        hashMap.put("image_stale", Boolean.valueOf(cufpVar.e()));
        hashMap.put("server_timestamp_us", cufpVar.m());
        if (cufpVar.b().a()) {
            hashMap.put("title", cufpVar.b().b());
        }
        if (cufpVar.c().a()) {
            hashMap.put("image_url", cufpVar.c().b());
        }
        if (cufpVar.d().a()) {
            hashMap.put("image", csto.b(cufpVar.d().b()));
        }
    }
}
