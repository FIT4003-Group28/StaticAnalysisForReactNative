package defpackage;

import android.content.ContentValues;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: aahw  reason: default package */
/* loaded from: classes.dex */
abstract class aahw {
    /* JADX INFO: Access modifiers changed from: protected */
    public static void c(aaip aaipVar, vox voxVar, aakd aakdVar, long j, aorw aorwVar) {
        aajj aajjVar = aakdVar.b;
        aajjVar.getClass();
        String d = aajjVar.d();
        try {
            long d2 = d(d);
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", d);
                contentValues.put("entity", aajjVar.c());
                contentValues.put("last_modified_datetime", Long.valueOf(j));
                contentValues.put("data_type", Long.valueOf(d2));
                aosw.g(aorwVar);
                contentValues.put("batch_update_timestamp", Long.valueOf(anhg.c(anhg.d(aorwVar.b, 1000000000L), aorwVar.c)));
                contentValues.put("metadata", aakdVar.c.b.toByteArray());
                long f = voxVar.f("entity_table", contentValues);
                if (f >= 0) {
                    aajk aajkVar = aakdVar.c;
                    aaipVar.b(voxVar);
                    Collection<aahn> collection = (Collection) aaipVar.b.b.get(aajjVar.getClass());
                    if (collection != null) {
                        for (aahn aahnVar : collection) {
                            voxVar.d(aaip.a(aahnVar, aajjVar, aajkVar));
                        }
                    }
                    voxVar.e("DELETE FROM entity_associations WHERE parent_entity_key=?", aajjVar.d());
                    aais.b(voxVar, aajjVar);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 59);
                sb.append("Could not insert entity: ");
                sb.append(d);
                sb.append(" with status: ");
                sb.append(f);
                throw new IllegalStateException(sb.toString());
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw aahd.c(e, (int) d2);
            }
        } catch (Exception e2) {
            throw aahd.c(e2, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long d(String str) {
        int a = aakj.a(str);
        if (a != Integer.MIN_VALUE) {
            return a;
        }
        throw aahd.b(null, -1, 4, 3);
    }

    public abstract void b(aaip aaipVar, vox voxVar, amuf amufVar);
}
