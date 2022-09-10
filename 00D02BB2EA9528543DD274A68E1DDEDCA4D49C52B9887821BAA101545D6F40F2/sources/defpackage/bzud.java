package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bzud  reason: default package */
/* loaded from: classes4.dex */
public final class bzud {
    public static final String a = String.format(Locale.US, "(%s in (%d, %d))", "media_type", 1, 3);
    public static final String b;
    public static final String c;
    private static final String d;
    private static final String e;

    static {
        String format = String.format(Locale.US, "(LOWER(%s) REGEXP \"%s\")", "_data", "^.*(?:snapchat|instagram).*$");
        d = format;
        String format2 = String.format(Locale.US, "(LOWER(%s) NOT LIKE \"%%dcim%%\" OR LOWER(%s) REGEXP \"%s\")", "_data", "_data", "^.*(screenshot|download).*$");
        e = format2;
        b = String.format(Locale.US, "(%s OR NOT %s)", format, format2);
        c = String.format(Locale.US, "(%s IS NOT NULL OR %s IS NOT NULL)", "date_added", "datetaken");
    }

    public static Set<Uri> a(Iterable<Uri> iterable, Context context) {
        Set c2;
        dbsk.a(true);
        dcfl dcflVar = new dcfl(iterable);
        HashSet c3 = dcnm.c();
        for (List list : dcflVar) {
            dcdc q = dcdc.q(list);
            dbsk.h(q.size() <= 500, "photoUris size too big (>%s): %s", 500, q.size());
            String g = dbrz.e(",").g(dcbg.b(q).s(bztq.a).o(bztu.a).s(bztv.a));
            btop h = btoq.h();
            h.b("_id", "_data", "mime_type");
            h.c(String.format(Locale.US, "(%s AND (%s IN (%s)))", a, "_id", g));
            try {
                btou btouVar = new btou(context, MediaStore.Files.getContentUri("external"), h.a());
                final HashSet e2 = dcnm.e(list);
                final btor<Long> c4 = btouVar.c("_id");
                final btor<String> a2 = btouVar.a("_data");
                final btor<String> a3 = btouVar.a("mime_type");
                dcbg s = dcbg.b(btouVar).o(new dbsl(a2) { // from class: bztw
                    private final btor a;

                    {
                        this.a = a2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        btor btorVar = this.a;
                        String str = bzud.a;
                        return ((Boolean) ((btos) obj).a(btorVar).h(bztt.a).c(false)).booleanValue();
                    }
                }).s(new dbrn(a3, c4) { // from class: bztx
                    private final btor a;
                    private final btor b;

                    {
                        this.a = a3;
                        this.b = c4;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        btor btorVar = this.a;
                        btor btorVar2 = this.b;
                        btos btosVar = (btos) obj;
                        String str = bzud.a;
                        return Uri.withAppendedPath((Uri) bbti.a((String) btosVar.a(btorVar).c("")).h(bztr.a).c(MediaStore.Images.Media.EXTERNAL_CONTENT_URI), (String) btosVar.a(btorVar2).h(bzts.a).b());
                    }
                });
                e2.getClass();
                c2 = s.o(new dbsl(e2) { // from class: bzty
                    private final HashSet a;

                    {
                        this.a = e2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return this.a.contains((Uri) obj);
                    }
                }).B();
                c2.size();
                btouVar.close();
            } catch (btnx unused) {
                c2 = dcnm.c();
            }
            c3.addAll(c2);
        }
        return c3;
    }
}
