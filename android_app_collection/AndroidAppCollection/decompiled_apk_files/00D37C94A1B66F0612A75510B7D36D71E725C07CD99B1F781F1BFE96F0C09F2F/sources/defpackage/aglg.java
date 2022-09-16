package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aglg  reason: default package */
/* loaded from: classes.dex */
public final class aglg {
    public final agpj a;
    private final aglb b;
    private final agmu c;
    private final azpx d;
    private final aglj e;
    private final agmk f;

    public aglg(agpj agpjVar, aglb aglbVar, agmu agmuVar, agmk agmkVar, agmk agmkVar2, aglj agljVar, azpx azpxVar, byte[] bArr) {
        this.a = agpjVar;
        this.b = aglbVar;
        this.c = agmuVar;
        this.f = agmkVar;
        this.e = agljVar;
        this.d = azpxVar;
        aglbVar.b.add(new aglc(this));
        agmuVar.e(new aglf(this));
        agmkVar.x(new agld(this));
        agmkVar2.g(new agle(this));
    }

    public final void a(String str) {
        Cursor rawQuery = this.c.a.a().rawQuery("SELECT COUNT(*) FROM videosV2 WHERE channel_id=?", new String[]{str});
        try {
            rawQuery.moveToFirst();
            if (rawQuery.getInt(0) != 0) {
                return;
            }
            rawQuery = this.f.a.a().rawQuery("SELECT COUNT(*) FROM playlistsV13 WHERE channel_id=?", new String[]{str});
            try {
                rawQuery.moveToFirst();
                if (rawQuery.getInt(0) != 0) {
                    return;
                }
                try {
                    aglb aglbVar = this.b;
                    long delete = aglbVar.a.a().delete("channelsV13", "id = ?", new String[]{str});
                    if (delete != 1) {
                        StringBuilder sb = new StringBuilder(49);
                        sb.append("Delete channel affected ");
                        sb.append(delete);
                        sb.append(" rows");
                        throw new SQLException(sb.toString());
                    }
                    for (aglc aglcVar : aglbVar.b) {
                        agpj.w(aglcVar.a.a.e(str));
                    }
                } catch (SQLException e) {
                    zep.d("[Offline] Error deleting channel", e);
                }
            } finally {
            }
        } finally {
        }
    }

    public final void b(Collection collection) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            agqo agqoVar = (agqo) it.next();
            String f = agqoVar.f();
            if (hashSet.add(f)) {
                aglj agljVar = this.e;
                agqoVar.getClass();
                String f2 = agqoVar.f();
                if (!agljVar.m.A(f2) && !agljVar.m.B(f2) && (ymr.a(agljVar.e.a.a(), "video_list_videos", "video_list_id IS NOT NULL AND video_id = ?", new String[]{f2}) <= 0 || agljVar.e.j(f2))) {
                    agljVar.w(agqoVar);
                    if (!agljVar.h(f2)) {
                        agljVar.b.c(f2, false);
                    }
                    arrayList.add(f);
                }
            }
        }
        if (arrayList.size() > 0) {
            this.d.c(new agny(arrayList));
        }
    }
}
