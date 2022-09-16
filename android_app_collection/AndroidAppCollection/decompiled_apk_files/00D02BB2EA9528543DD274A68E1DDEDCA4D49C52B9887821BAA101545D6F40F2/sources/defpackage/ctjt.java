package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctjt  reason: default package */
/* loaded from: classes5.dex */
public final class ctjt {
    public static dbsg<cufj> a(Cursor cursor) {
        dbsg dbsgVar;
        Bitmap c;
        dbsg dbsgVar2;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            cufi n = cufj.n();
            n.c(b(0, cursor));
            HashMap<String, Object> d = csto.d(cursor.getBlob(ctlt.a(6)));
            if (d.containsKey("expiration_time_ms")) {
                n.e((Long) d.get("expiration_time_ms"));
            } else {
                n.e(-1L);
            }
            if (d.containsKey("name")) {
                n.k((String) d.get("name"));
            }
            if (d.containsKey("image_url")) {
                n.g((String) d.get("image_url"));
            }
            if (d.containsKey("image_stale")) {
                n.h(((Boolean) d.get("image_stale")).booleanValue());
            }
            if (d.containsKey("custom_view_content") && ((Integer) d.get("custom_view_content_type")).intValue() == 1) {
                byte[] bArr = (byte[]) d.get("custom_view_content");
                if (bArr == null || bArr.length == 0) {
                    dbsgVar2 = dbpy.a;
                } else {
                    HashMap<String, Object> d2 = csto.d(bArr);
                    if (!d2.containsKey("TYPE") || ((Integer) d2.get("TYPE")).intValue() != 1) {
                        dbsgVar2 = dbpy.a;
                    } else {
                        dbsg<HashMap<String, Object>> h = csto.h(d2.get("CONTENT"));
                        if (h.a()) {
                            dbsg<cuhv> b = ctkr.b(h.b());
                            if (b.a()) {
                                cuhw c2 = cuhx.c();
                                c2.b(b.b());
                                dbsgVar2 = dbsg.i(c2.a());
                            }
                        }
                        dbsgVar2 = dbpy.a;
                    }
                }
                if (dbsgVar2.a()) {
                    n.d((cufx) dbsgVar2.b());
                }
            }
            n.j(d(d, "menu_items").f());
            n.m(d(d, "toolbar_buttons").f());
            if (d.containsKey("image") && (c = csto.c((byte[]) d.get("image"))) != null) {
                n.f(c);
            }
            if (d.containsKey("ui_configurations")) {
                try {
                    HashMap hashMap = (HashMap) d.get("ui_configurations");
                    try {
                        cugg c3 = cugh.c();
                        c3.b(0);
                        c3.c(0);
                        if (hashMap.containsKey("BADGE")) {
                            c3.b(((Integer) hashMap.get("BADGE")).intValue());
                        }
                        if (hashMap.containsKey("PROFILE_LABEL_STYLE")) {
                            c3.c(((Integer) hashMap.get("PROFILE_LABEL_STYLE")).intValue());
                        }
                        dbsgVar = dbsg.i(c3.a());
                    } catch (ClassCastException unused) {
                        cstl.a("ContactCursors");
                        dbsgVar = dbpy.a;
                    }
                    if (dbsgVar.a()) {
                        n.i((cugh) dbsgVar.b());
                    }
                } catch (ClassCastException unused2) {
                    cstl.a("ContactCursors");
                }
            }
            if (d.containsKey("server_timestamp_us")) {
                n.l(((Long) d.get("server_timestamp_us")).longValue());
            }
            return dbsg.i(n.a());
        }
        return dbpy.a;
    }

    public static ContactId b(int i, Cursor cursor) {
        cufk f = ContactId.f();
        f.c(cursor.getString(ctlt.a(3) + i));
        f.d(cursor.getString(ctlt.a(5) + i));
        f.e(ContactId.ContactType.a(cursor.getInt(ctlt.a(2) + i)));
        String string = cursor.getString(i + ctlt.a(4));
        if (string != null) {
            f.b(string);
        }
        return f.a();
    }

    public static ContentValues c(cufj cufjVar) {
        String a;
        byte[] bArr;
        dbsg dbsgVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("lighter_id_type", Integer.valueOf(cufjVar.a().c().f));
        contentValues.put("lighter_id_id", cufjVar.a().a());
        if (cufjVar.a().c() == ContactId.ContactType.EMAIL) {
            a = cstg.a(cufjVar.a().a());
        } else {
            a = cufjVar.a().a();
        }
        contentValues.put("lighter_id_normalized_id", a);
        contentValues.put("lighter_handler_id", cufjVar.a().d().f());
        contentValues.put("lighter_id_app_name", cufjVar.a().b());
        HashMap hashMap = new HashMap();
        hashMap.put("expiration_time_ms", cufjVar.g());
        hashMap.put("image_stale", Boolean.valueOf(cufjVar.f()));
        hashMap.put("server_timestamp_us", cufjVar.l());
        if (cufjVar.b().a()) {
            hashMap.put("name", cufjVar.b().b());
        }
        if (cufjVar.d().a()) {
            hashMap.put("image_url", cufjVar.d().b());
        }
        if (cufjVar.e().a()) {
            hashMap.put("image", csto.b(cufjVar.e().b()));
        }
        if (!cufjVar.h().isEmpty()) {
            hashMap.put("menu_items", cstr.b(cufjVar.h(), ctjr.a));
        }
        if (cufjVar.j().a()) {
            cufx b = cufjVar.j().b();
            if (b.b() == 1) {
                if (b.b() != 1) {
                    dbsgVar = dbpy.a;
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("TYPE", 1);
                    hashMap2.put("CONTENT", ctkr.a(((cuhx) b).a()));
                    try {
                        dbsgVar = dbsg.i(csto.a(hashMap2));
                    } catch (IOException unused) {
                        cstl.a("SerRichTextModel");
                        dbsgVar = dbpy.a;
                    }
                }
                if (dbsgVar.a()) {
                    hashMap.put("custom_view_content_type", 1);
                    hashMap.put("custom_view_content", dbsgVar.b());
                }
            }
        }
        if (!cufjVar.i().isEmpty()) {
            hashMap.put("toolbar_buttons", cstr.b(cufjVar.i(), ctjs.a));
        }
        if (cufjVar.k().a()) {
            cugh b2 = cufjVar.k().b();
            HashMap hashMap3 = new HashMap();
            hashMap3.put("BADGE", Integer.valueOf(b2.a()));
            hashMap3.put("PROFILE_LABEL_STYLE", Integer.valueOf(b2.b()));
            hashMap.put("ui_configurations", hashMap3);
        }
        try {
            bArr = csto.a(hashMap);
        } catch (IOException unused2) {
            cstl.a("ContactCursors");
            bArr = new byte[0];
        }
        contentValues.put("contact_properties", bArr);
        return contentValues;
    }

    private static dccx<cugf> d(HashMap<String, Object> hashMap, String str) {
        ArrayList arrayList;
        dbsg dbsgVar;
        dccx<cugf> F = dcdc.F();
        if (hashMap.containsKey(str)) {
            try {
                arrayList = (ArrayList) hashMap.get(str);
            } catch (ClassCastException unused) {
                if (str.length() == 0) {
                    new String("Failed to deserialize ");
                }
                cstl.a("ContactCursors");
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Map map = (Map) arrayList.get(i);
                if (!map.containsKey("ACTION") || !map.containsKey("MENU_NAME")) {
                    cstl.a("MenuItemConv");
                    dbsgVar = dbpy.a;
                } else {
                    cuge d = cugf.d();
                    d.d((String) map.get("MENU_NAME"));
                    dbsg b = cstn.b(csto.h(map.get("ACTION")), ctkc.a);
                    if (!b.a()) {
                        cstl.a("MenuItemConv");
                        dbsgVar = dbpy.a;
                    } else {
                        d.b((ctzl) b.b());
                        if (map.containsKey("ICON")) {
                            d.c(Base64.decode((String) map.get("ICON"), 2));
                        }
                        dbsgVar = dbsg.i(d.a());
                    }
                }
                if (dbsgVar.a()) {
                    F.g((cugf) dbsgVar.b());
                }
            }
        }
        return F;
    }
}
