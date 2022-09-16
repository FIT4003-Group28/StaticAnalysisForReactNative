package defpackage;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctkf  reason: default package */
/* loaded from: classes5.dex */
public final class ctkf {
    public static cugu a(ConversationId conversationId, Cursor cursor) {
        int i;
        dbsg dbsgVar;
        int length = ctlz.a.length;
        cugi p = cugu.p();
        p.h(cursor.getString(ctly.a(2)));
        int i2 = cursor.getInt(ctly.a(3));
        if (i2 == 0) {
            i = 1;
        } else if (i2 != 1) {
            throw new InvalidParameterException("Invalid message type.");
        } else {
            i = 2;
        }
        p.o(i);
        p.i(cugo.a(cursor.getInt(ctly.a(8))));
        p.m(Long.valueOf(cursor.getLong(ctly.a(6))));
        p.c(conversationId);
        p.b(cursor.getInt(ctly.a(10)));
        p.e(cursor.getInt(ctly.a(12)));
        HashMap<String, byte[]> d = d(cursor.getBlob(ctly.a(7)));
        if (d.containsKey("content_type")) {
            int c = cugj.c(decl.j(d.get("content_type")));
            if (d.containsKey("message_content")) {
                cugt cugtVar = cugt.DEFAULT_RENDERING_TYPE;
                int i3 = c - 1;
                if (i3 == 0) {
                    byte[] bArr = d.get("message_content");
                    p.g(cuas.d(bArr != null ? dspd.x(bArr) : dspd.b));
                } else if (i3 == 1) {
                    p.u(new String(d.get("message_content")));
                } else if (i3 == 2) {
                    cugk c2 = cugl.c();
                    ((cudv) c2).a = new String(d.get("custom_message_content_type"));
                    c2.b(d.get("message_content"));
                    p.s(c2.a());
                } else if (i3 != 3) {
                    p.q();
                } else {
                    HashMap<String, Object> d2 = csto.d(d.get("message_content"));
                    if (d2.isEmpty()) {
                        cstl.a("MessageCursors");
                    }
                    dbsg<cuhv> b = ctkr.b(d2);
                    if (b.a()) {
                        p.p(b.b());
                    } else {
                        p.g(cuas.d(dspd.b));
                    }
                }
            } else {
                p.g(cuas.d(dspd.b));
            }
        } else {
            p.g(cuas.d(dspd.b));
        }
        byte[] bArr2 = d.get("metadata");
        if (bArr2 != null) {
            dcdg dcdgVar = new dcdg();
            for (Map.Entry<String, byte[]> entry : csto.e(bArr2).entrySet()) {
                dcdgVar.f(entry.getKey(), dspd.x(entry.getValue()));
            }
            p.j(dcdgVar.b());
        }
        byte[] bArr3 = d.get("fallback");
        if (bArr3 != null) {
            p.d(new String(bArr3));
        }
        byte[] bArr4 = d.get("snippet");
        if (bArr4 != null) {
            p.n(new String(bArr4));
        }
        p.f(decl.j(d.get("intended_rendering_type")));
        final int i4 = cursor.getInt(ctly.a(11));
        cugt cugtVar2 = cugt.DEFAULT_RENDERING_TYPE;
        cugt cugtVar3 = (cugt) dcbg.c(cugt.values()).r(new dbsl(i4) { // from class: cugs
            private final int a;

            {
                this.a = i4;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i5 = this.a;
                cugt cugtVar4 = cugt.DEFAULT_RENDERING_TYPE;
                return ((cugt) obj).h == i5;
            }
        }).f();
        if (cugtVar3 != null) {
            int ordinal = cugtVar3.ordinal();
            if (ordinal == 0) {
                p.k(cuat.a);
            } else if (ordinal == 1) {
                p.k(cuaw.a);
            } else if (ordinal == 2) {
                HashMap<String, Object> d3 = csto.d(d.get("overlay_header"));
                cugp k = cugq.k();
                k.k(((Integer) d3.get("time_to_live_sec")).intValue());
                k.j(((Integer) d3.get("OVERLAY_STYLE")).intValue());
                if (d3.containsKey("display_icon")) {
                    k.d(dspd.x((byte[]) d3.get("display_icon")));
                }
                if (d3.containsKey("display_text")) {
                    k.e((String) d3.get("display_text"));
                }
                if (d3.containsKey("dismiss_action")) {
                    dbsg b2 = cstn.b(csto.h(d3.get("dismiss_action")), ctke.a);
                    ctze j = ctzl.j();
                    j.s();
                    k.b((ctzl) b2.c(j.a()));
                }
                if (d3.containsKey("overlay_expire_time")) {
                    k.f(decl.j((byte[]) d3.get("overlay_expire_time")));
                }
                if (d3.containsKey("overlay_lighter_icon")) {
                    dbsgVar = ctkb.b(csto.d((byte[]) d3.get("overlay_lighter_icon")));
                } else {
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    k.i((cugd) dbsgVar.b());
                } else {
                    k.i(cugd.i());
                }
                if (d3.containsKey("hide_snippet_in_conversation_list")) {
                    k.h(((Boolean) d3.get("hide_snippet_in_conversation_list")).booleanValue());
                }
                if (d3.containsKey("hide_dismiss_button")) {
                    k.g(((Boolean) d3.get("hide_dismiss_button")).booleanValue());
                }
                if (d3.containsKey("dismissible_by_tapping_outside")) {
                    k.c(((Boolean) d3.get("dismissible_by_tapping_outside")).booleanValue());
                }
                p.k(cuay.a(k.a()));
            } else if (ordinal == 3) {
                p.k(cuau.a);
            }
            p.l(ctjt.b(12, cursor));
            return p.a();
        }
        throw new InvalidParameterException("Invalid ElementType.");
    }

    public static dcdc<ctjz<cugu>> b(ConversationId conversationId, Cursor cursor) {
        dccx F = dcdc.F();
        if (cursor.moveToFirst()) {
            do {
                try {
                    F.g(ctjm.b(a(conversationId, cursor)));
                } catch (Exception unused) {
                    ctxm r = ctxn.r();
                    r.g(10032);
                    r.d(conversationId);
                    F.g(ctjm.a(r.a()));
                }
            } while (cursor.moveToNext());
            return F.f();
        }
        return F.f();
    }

    public static HashMap<String, byte[]> c(cugu cuguVar) {
        byte[] bArr;
        HashMap<String, byte[]> hashMap = new HashMap<>();
        int a = cuguVar.f().a();
        int i = a - 1;
        if (a != 0) {
            hashMap.put("content_type", decl.i(i));
            cugt cugtVar = cugt.DEFAULT_RENDERING_TYPE;
            int a2 = cuguVar.f().a();
            int i2 = a2 - 1;
            if (a2 == 0) {
                throw null;
            }
            if (i2 == 0) {
                hashMap.put("message_content", cuguVar.f().e().G());
            } else if (i2 == 1) {
                hashMap.put("message_content", cstp.a(cuguVar.f().d()));
            } else if (i2 == 2) {
                hashMap.put("message_content", cuguVar.f().b().b());
                hashMap.put("custom_message_content_type", cstp.a(cuguVar.f().b().a()));
            } else if (i2 == 3) {
                hashMap.put("message_content", csto.a(ctkr.a(cuguVar.f().c())));
            }
            if (!cuguVar.i().isEmpty()) {
                HashMap e = dcjz.e(cuguVar.i());
                try {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : e.entrySet()) {
                        hashMap2.put((String) entry.getKey(), ((dspd) entry.getValue()).G());
                    }
                    bArr = csto.a(hashMap2);
                } catch (IOException unused) {
                    cstl.a("MessageCursors");
                    bArr = new byte[0];
                }
                hashMap.put("metadata", bArr);
            }
            dbsg<String> e2 = cuguVar.e();
            if (e2.a()) {
                hashMap.put("fallback", cstp.a(e2.b()));
            }
            dbsg<String> h = cuguVar.h();
            if (h.a()) {
                hashMap.put("snippet", cstp.a(h.b()));
            }
            cugr k = cuguVar.k();
            if (k.a().ordinal() == 2) {
                cugq b = k.b();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("time_to_live_sec", Integer.valueOf(b.e()));
                hashMap3.put("OVERLAY_STYLE", Integer.valueOf(b.j()));
                if (b.a().a()) {
                    hashMap3.put("dismiss_action", ctjh.a(b.a().b()));
                }
                if (b.b().a()) {
                    hashMap3.put("display_icon", b.b().b().G());
                }
                if (b.d().a()) {
                    hashMap3.put("display_text", b.d().b());
                }
                if (b.c().a()) {
                    hashMap3.put("overlay_lighter_icon", csto.a(ctkb.a(b.c().b())));
                }
                if (b.i().a()) {
                    hashMap3.put("overlay_expire_time", decl.i(b.i().b().intValue()));
                }
                hashMap3.put("hide_snippet_in_conversation_list", Boolean.valueOf(b.f()));
                hashMap3.put("hide_dismiss_button", Boolean.valueOf(b.g()));
                hashMap3.put("dismissible_by_tapping_outside", Boolean.valueOf(b.h()));
                hashMap.put("overlay_header", csto.a(hashMap3));
            }
            hashMap.put("intended_rendering_type", decl.i(cuguVar.l()));
            return hashMap;
        }
        throw null;
    }

    public static HashMap<String, byte[]> d(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap<String, byte[]> hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException unused) {
            cstl.a("MessageCursors");
            return new HashMap<>();
        }
    }
}
