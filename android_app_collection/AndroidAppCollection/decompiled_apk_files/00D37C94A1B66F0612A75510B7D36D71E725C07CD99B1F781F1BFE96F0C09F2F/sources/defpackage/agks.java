package defpackage;

import android.database.Cursor;
import com.google.android.libraries.backup.Backup;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: agks  reason: default package */
/* loaded from: classes.dex */
public final class agks {
    @Backup
    public static final String CATEGORY = "offline_category";
    @Backup
    public static final String CATEGORY_BACKGROUND = "offline_category_background";
    @Backup
    public static final String CATEGORY_PRIMARY_STORAGE = "offline_category_primary_storage";
    @Backup
    public static final String CATEGORY_SDCARD_STORAGE = "offline_category_sdcard_storage";
    @Backup
    public static final String DOWNLOAD_NETWORK_PREFERENCE = "offline_network_preference";
    @Backup
    public static final String PLAYLIST_WARNING = "offline_playlist_warning";
    @Backup
    public static final String QUALITY = "offline_quality";
    @Backup
    public static final String WIFI_OR_UNRESTRICTED_DATA_POLICY = "offline_unrestricted_data_policy";
    @Backup
    public static final String WIFI_POLICY = "offline_policy";
    @Backup
    public static final String WIFI_POLICY_STRING = "offline_policy_string";

    public static final agqa a(Cursor cursor, agpj agpjVar, int i, int i2) {
        String string = cursor.getString(i);
        aopa createBuilder = atqf.a.createBuilder();
        try {
            createBuilder.mo38mergeFrom(cursor.getBlob(i2), aoos.b());
            aalc aalcVar = new aalc();
            atqe atqeVar = ((atqf) createBuilder.instance).c;
            if (atqeVar == null) {
                atqeVar = atqe.a;
            }
            if ((atqeVar.b & 2) != 0) {
                atqe atqeVar2 = ((atqf) createBuilder.instance).c;
                if (atqeVar2 == null) {
                    atqeVar2 = atqe.a;
                }
                avhn avhnVar = atqeVar2.d;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                aalcVar = new aalc(avhnVar);
                aalc a = agpjVar.a(string, aalcVar);
                if (!a.a.isEmpty()) {
                    aalcVar = a;
                }
            }
            return agqa.b((atqf) createBuilder.mo39build(), aalcVar);
        } catch (aopx e) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 36);
            sb.append("Error loading proto for channelId=[");
            sb.append(string);
            sb.append("]");
            zep.d(sb.toString(), e);
            return null;
        }
    }

    public static final agqo b(Cursor cursor, agpj agpjVar, aglb aglbVar, int i, int i2, int i3, int i4, int i5) {
        agqa agqaVar = null;
        if (!cursor.isNull(i) || i5 < 0) {
            String string = cursor.getString(i);
            aopa createBuilder = atsl.a.createBuilder();
            try {
                createBuilder.mo38mergeFrom(cursor.getBlob(i2), aoos.b());
            } catch (aopx e) {
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 34);
                sb.append("Error loading proto for videoId=[");
                sb.append(string);
                sb.append("]");
                zep.d(sb.toString(), e);
                createBuilder = atsl.a.createBuilder();
                createBuilder.copyOnWrite();
                atsl atslVar = (atsl) createBuilder.instance;
                string.getClass();
                atslVar.b |= 1;
                atslVar.c = string;
            }
            boolean g = ymr.g(cursor, i3, false);
            aalc aalcVar = new aalc();
            atsl atslVar2 = (atsl) createBuilder.instance;
            if ((atslVar2.b & 2) != 0) {
                avhn avhnVar = atslVar2.d;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                aalcVar = agpjVar.d(string, new aalc(avhnVar));
            }
            String string2 = cursor.getString(i4);
            if (string2 != null && aglbVar != null) {
                agqaVar = aglbVar.b(string2);
            }
            if (agqaVar == null) {
                atqf atqfVar = ((atsl) createBuilder.instance).e;
                if (atqfVar == null) {
                    atqfVar = atqf.a;
                }
                agqaVar = agqa.a(atqfVar);
            }
            return new agqo((atsl) createBuilder.mo39build(), g, aalcVar, agqaVar);
        }
        String string3 = cursor.getString(i5);
        aopa createBuilder2 = atsl.a.createBuilder();
        createBuilder2.copyOnWrite();
        atsl atslVar3 = (atsl) createBuilder2.instance;
        string3.getClass();
        atslVar3.b |= 1;
        atslVar3.c = string3;
        return new agqo((atsl) createBuilder2.mo39build(), true, null, null);
    }

    public static final List c(Cursor cursor, agpj agpjVar, aglb aglbVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(b(cursor, agpjVar, aglbVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }

    public static final agqf d(Cursor cursor, agpj agpjVar, aglb aglbVar, int i, int i2, int i3, int i4, int i5) {
        atrp atrpVar;
        String string = cursor.getString(i);
        try {
            atrpVar = (atrp) aopi.parseFrom(atrp.a, cursor.getBlob(i2), aoos.b());
        } catch (aopx e) {
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 37);
            sb.append("Error loading proto for playlistId=[");
            sb.append(string);
            sb.append("]");
            zep.d(sb.toString(), e);
            aopa createBuilder = atrp.a.createBuilder();
            createBuilder.copyOnWrite();
            atrp atrpVar2 = (atrp) createBuilder.instance;
            string.getClass();
            atrpVar2.b |= 1;
            atrpVar2.c = string;
            atrpVar = (atrp) createBuilder.mo39build();
        }
        boolean g = ymr.g(cursor, i3, false);
        int i6 = cursor.getInt(i4);
        String string2 = cursor.getString(i5);
        atqf atqfVar = null;
        agqa b = (string2 == null || aglbVar == null) ? null : aglbVar.b(string2);
        if (b == null) {
            if ((atrpVar.b & 4) != 0 && (atqfVar = atrpVar.e) == null) {
                atqfVar = atqf.a;
            }
            b = agqa.a(atqfVar);
        }
        aalc aalcVar = new aalc();
        avhn x = agpj.x(atrpVar);
        if (x != null) {
            aalcVar = agpjVar.c(string, new aalc(x));
        }
        return agqf.c(atrpVar, g, i6, aalcVar, b);
    }

    public static final List e(Cursor cursor, agpj agpjVar, aglb aglbVar, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            arrayList.add(d(cursor, agpjVar, aglbVar, i, i2, i3, i4, i5));
        }
        return arrayList;
    }
}
