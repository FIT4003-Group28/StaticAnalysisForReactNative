package defpackage;

import android.database.Cursor;
import com.google.android.libraries.social.populous.core.AutoValue_ContainerInfo;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyzi  reason: default package */
/* loaded from: classes5.dex */
public final class cyzi {
    public final Set<Long> a = new HashSet();
    public final List<cyvy> b = new ArrayList();
    public final List<cyvv> c = new ArrayList();
    public final cyzk d;
    public final cyxf e;
    private final long f;
    private final String g;

    public cyzi(Cursor cursor, ClientConfigInternal clientConfigInternal, cyuj cyujVar) {
        long e = cyzj.e(cursor, "contact_id");
        this.f = e;
        this.g = Long.toHexString(e);
        cyza cyzaVar = new cyza();
        cyzaVar.a = Long.valueOf(e);
        String g = cyzj.g(cursor, "lookup");
        if (g != null) {
            cyzaVar.b = g;
            this.d = cyzaVar;
            cyxf d = d(cursor);
            this.e = d;
            ((cyuw) d).c = Boolean.valueOf(cyzj.d(cursor, "starred"));
            ((cyuw) d).i = Boolean.valueOf(cyzj.d(cursor, "send_to_voicemail"));
            ((cyuw) d).g = Boolean.valueOf(!cyzj.h(cursor, "custom_ringtone"));
            int j = cyzj.j(cursor, "pinned");
            ((cyuw) d).m = Integer.valueOf(j);
            ((cyuw) d).l = Boolean.valueOf(j != 0);
            if (!cyzj.h(cursor, "photo_thumb_uri")) {
                ((cyuw) d).h = true;
                cygi f = Photo.f();
                f.d(0);
                f.e(cyzj.g(cursor, "photo_thumb_uri"));
                f.c(c(cursor, true));
                cyzaVar.d = f.a();
            } else {
                ((cyuw) d).h = false;
            }
            a(cursor, clientConfigInternal, cyujVar);
            return;
        }
        throw new NullPointerException("Null deviceLookupKey");
    }

    private final PersonFieldMetadata b(Cursor cursor) {
        return c(cursor, false);
    }

    private final PersonFieldMetadata c(Cursor cursor, boolean z) {
        boolean d = cyzj.d(cursor, "is_primary");
        cygd l = PersonFieldMetadata.l();
        l.b(duej.DEVICE_CONTACT);
        l.j(cygl.DEVICE);
        l.e(d);
        ((cybr) l).a = this.g;
        l.k = dcdc.f(new AutoValue_ContainerInfo(duej.DEVICE_CONTACT, this.g));
        l.l = z;
        return l.i();
    }

    private static final cyxf d(Cursor cursor) {
        cyxf t = cyxg.t();
        cyuw cyuwVar = (cyuw) t;
        cyuwVar.c = false;
        cyuwVar.d = false;
        cyuwVar.e = false;
        cyuwVar.f = false;
        cyuwVar.g = false;
        cyuwVar.h = false;
        cyuwVar.i = false;
        cyuwVar.j = false;
        cyuwVar.k = false;
        cyuwVar.l = false;
        cyuwVar.m = 0;
        cyuwVar.n = 0;
        cyuwVar.o = 0;
        t.e(cyzj.f(cursor, "times_contacted"));
        t.d(cyzj.e(cursor, "last_time_contacted"));
        cyuwVar.a = cyzj.g(cursor, "account_type");
        cyuwVar.b = cyzj.g(cursor, "account_name");
        t.c(cyzj.j(cursor, "times_used"));
        t.b(cyzj.k(cursor));
        cyuwVar.j = Boolean.valueOf(cyzj.d(cursor, "is_primary"));
        cyuwVar.k = Boolean.valueOf(cyzj.d(cursor, "is_super_primary"));
        return t;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Cursor cursor, ClientConfigInternal clientConfigInternal, cyuj cyujVar) {
        char c;
        this.a.add(Long.valueOf(cyzj.e(cursor, "raw_contact_id")));
        String g = cyzj.g(cursor, "mimetype");
        switch (g.hashCode()) {
            case -1569536764:
                if (g.equals("vnd.android.cursor.item/email_v2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1328682538:
                if (g.equals("vnd.android.cursor.item/contact_event")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1079224304:
                if (g.equals("vnd.android.cursor.item/name")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -601229436:
                if (g.equals("vnd.android.cursor.item/postal-address_v2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 684173810:
                if (g.equals("vnd.android.cursor.item/phone_v2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2034973555:
                if (g.equals("vnd.android.cursor.item/nickname")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String g2 = cyzj.g(cursor, "data1");
            if (dbsj.d(g2)) {
                return;
            }
            List<cyvy> list = this.b;
            cyvx i = cyvy.i();
            i.f(cyfj.EMAIL);
            i.j(g2);
            i.d(cyez.a(g2));
            i.h(b(cursor));
            i.i(d(cursor).a());
            list.add(i.k());
        } else if (c == 1) {
            String g3 = cyzj.g(cursor, "data1");
            String g4 = cyzj.g(cursor, "data4");
            if (clientConfigInternal.b()) {
                g3 = cyujVar.a(g3);
            }
            if (dbsj.d(g4)) {
                g4 = cyujVar.b(g3);
            }
            if (dbsj.d(g3)) {
                return;
            }
            List<cyvy> list2 = this.b;
            cyvx i2 = cyvy.i();
            i2.f(cyfj.PHONE_NUMBER);
            i2.j(g3);
            i2.d(g4);
            i2.h(b(cursor));
            i2.i(d(cursor).a());
            list2.add(i2.k());
        } else if (c != 2) {
            if (c == 3) {
                if (cyzj.h(cursor, "data1")) {
                    return;
                }
                ((cyuw) this.e).d = true;
            } else if (c != 4) {
                if (c != 5 || cyzj.f(cursor, "data2") != 3 || cyzj.h(cursor, "data1")) {
                    return;
                }
                ((cyuw) this.e).f = true;
            } else if (cyzj.h(cursor, "data1")) {
            } else {
                ((cyuw) this.e).e = true;
            }
        } else {
            String g5 = cyzj.g(cursor, "data1");
            String g6 = cyzj.g(cursor, "data2");
            String g7 = cyzj.g(cursor, "data3");
            if (dbsj.d(g5)) {
                return;
            }
            String g8 = cyzj.g(cursor, "phonebook_label");
            List<cyvv> list3 = this.c;
            cyvu g9 = cyvv.g();
            g9.d(2);
            g9.e(g5);
            cyum cyumVar = (cyum) g9;
            cyumVar.a = g6;
            cyumVar.b = g7;
            cyumVar.c = dbsj.e(g8);
            g9.c(b(cursor));
            list3.add(g9.f());
        }
    }
}
