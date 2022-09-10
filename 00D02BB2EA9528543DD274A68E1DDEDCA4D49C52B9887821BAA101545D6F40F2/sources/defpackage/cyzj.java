package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: cyzj  reason: default package */
/* loaded from: classes5.dex */
public final class cyzj {
    public static final String[] c;
    private static final String d = String.format("%s DESC, %s DESC, %s DESC", "starred", "times_contacted", "last_time_contacted");
    private static final String e = String.format("%s DESC, %s DESC, %s DESC LIMIT 0, 200", "starred", "times_contacted", "last_time_contacted");
    public static final String a = String.format("%s ASC", "sort_key");
    public static final String[] b = {"contact_id"};

    static {
        dcen N = dcep.N();
        N.b("contact_id");
        N.b("raw_contact_id");
        N.b("lookup");
        N.b("mimetype");
        N.b("is_primary");
        N.b("is_super_primary");
        N.b("account_type");
        N.b("account_name");
        N.b("times_used");
        N.b("last_time_used");
        N.b("starred");
        N.b("pinned");
        N.b("times_contacted");
        N.b("last_time_contacted");
        N.b("custom_ringtone");
        N.b("send_to_voicemail");
        N.b("photo_thumb_uri");
        N.b("phonebook_label");
        N.b("data1");
        N.b("data2");
        N.b("data3");
        N.b("data1");
        N.b("data1");
        N.b("data4");
        N.b("data1");
        N.b("data1");
        N.b("data2");
        N.b("data1");
        c = (String[]) N.f().toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<cyzl> a(Context context, String str, ClientConfigInternal clientConfigInternal, cyuj cyujVar, cyph cyphVar, cyor cyorVar) {
        return b(context, str, clientConfigInternal, cyujVar, cyphVar, cyorVar, !dbsj.d(str) ? d : e);
    }

    public static dcdc<cyzl> b(Context context, String str, ClientConfigInternal clientConfigInternal, cyuj cyujVar, cyph cyphVar, cyor cyorVar, String str2) {
        dcfc dcfcVar;
        String[] strArr;
        if (!dbsj.d(str)) {
            dcep<cydt> dcepVar = clientConfigInternal.l;
            dcfa U = dcfc.U();
            if (dcepVar.contains(cydt.PHONE_NUMBER)) {
                U.m(c(context, str, ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, cyphVar, cyorVar));
            }
            if (dcepVar.contains(cydt.EMAIL)) {
                U.m(c(context, str, ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI, cyphVar, cyorVar));
            }
            dcfcVar = U.f();
            if (dcfcVar.isEmpty()) {
                return dcdc.e();
            }
        } else {
            dcfcVar = null;
        }
        dcfc dcfcVar2 = dcfcVar;
        dcep<cydt> dcepVar2 = clientConfigInternal.l;
        ArrayList arrayList = new ArrayList(6);
        arrayList.add("vnd.android.cursor.item/name");
        arrayList.add("vnd.android.cursor.item/postal-address_v2");
        arrayList.add("vnd.android.cursor.item/nickname");
        arrayList.add("vnd.android.cursor.item/contact_event");
        if (dcepVar2.contains(cydt.EMAIL)) {
            arrayList.add("vnd.android.cursor.item/email_v2");
        }
        if (dcepVar2.contains(cydt.PHONE_NUMBER)) {
            arrayList.add("vnd.android.cursor.item/phone_v2");
        }
        StringBuilder sb = new StringBuilder("mimetype");
        sb.append(" IN (");
        sb.append("?");
        for (int i = 1; i < arrayList.size(); i++) {
            sb.append(",");
            sb.append("?");
        }
        sb.append(")");
        if (m(dcfcVar2)) {
            sb.append(" AND ");
            sb.append("contact_id");
            sb.append(" IN (");
            sb.append("?");
            for (int i2 = 1; i2 < dcfcVar2.size(); i2++) {
                sb.append(",");
                sb.append("?");
            }
            sb.append(")");
        }
        String sb2 = sb.toString();
        if (m(dcfcVar2)) {
            Collection[] collectionArr = {arrayList, dcfcVar2};
            int i3 = 0;
            for (int i4 = 0; i4 < 2; i4++) {
                i3 += collectionArr[i4].size();
            }
            String[] strArr2 = new String[i3];
            int i5 = 0;
            for (int i6 = 0; i6 < 2; i6++) {
                for (Object obj : collectionArr[i6]) {
                    strArr2[i5] = obj.toString();
                    i5++;
                }
            }
            strArr = strArr2;
        } else {
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        Cursor l = l(context, ContactsContract.Data.CONTENT_URI, c, sb2, strArr, str2, cyphVar, cyorVar);
        try {
            if (l != null) {
                try {
                    ArrayList<cyzi> arrayList2 = new ArrayList(l.getCount());
                    aik aikVar = new aik(l.getCount());
                    while (l.moveToNext()) {
                        long e2 = e(l, "contact_id");
                        if (dcfcVar2 == null || dcfcVar2.contains(Long.valueOf(e2))) {
                            cyzi cyziVar = (cyzi) aikVar.b(e2);
                            if (cyziVar == null) {
                                cyzi cyziVar2 = new cyzi(l, clientConfigInternal, cyujVar);
                                arrayList2.add(cyziVar2);
                                aikVar.d(e2, cyziVar2);
                            } else {
                                cyziVar.a(l, clientConfigInternal, cyujVar);
                            }
                        }
                    }
                    dccx G = dcdc.G(arrayList2.size());
                    for (cyzi cyziVar3 : arrayList2) {
                        cyzk cyzkVar = cyziVar3.d;
                        dcdc<cyvv> r = dcdc.r(cyziVar3.c);
                        if (r != null) {
                            ((cyza) cyzkVar).c = r;
                            dcdc<cyvy> r2 = dcdc.r(cyziVar3.b);
                            if (r2 != null) {
                                ((cyza) cyzkVar).e = r2;
                                cyxf cyxfVar = cyziVar3.e;
                                ((cyuw) cyxfVar).n = Integer.valueOf(cyziVar3.b.size());
                                ((cyuw) cyxfVar).o = Integer.valueOf(cyziVar3.a.size());
                                cyxg a2 = cyxfVar.a();
                                if (a2 != null) {
                                    ((cyza) cyzkVar).f = a2;
                                    cyzk cyzkVar2 = cyziVar3.d;
                                    String str3 = " deviceContactId";
                                    if (((cyza) cyzkVar2).a != null) {
                                        str3 = "";
                                    }
                                    if (((cyza) cyzkVar2).b == null) {
                                        str3 = str3.concat(" deviceLookupKey");
                                    }
                                    if (((cyza) cyzkVar2).c == null) {
                                        str3 = String.valueOf(str3).concat(" displayNames");
                                    }
                                    if (((cyza) cyzkVar2).e == null) {
                                        str3 = String.valueOf(str3).concat(" fields");
                                    }
                                    if (((cyza) cyzkVar2).f == null) {
                                        str3 = String.valueOf(str3).concat(" rankingFeatureSet");
                                    }
                                    if (!str3.isEmpty()) {
                                        String valueOf = String.valueOf(str3);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                    }
                                    G.g(new cyzb(((cyza) cyzkVar2).a.longValue(), ((cyza) cyzkVar2).b, ((cyza) cyzkVar2).c, ((cyza) cyzkVar2).d, ((cyza) cyzkVar2).e, ((cyza) cyzkVar2).f));
                                } else {
                                    throw new NullPointerException("Null rankingFeatureSet");
                                }
                            } else {
                                throw new NullPointerException("Null fields");
                            }
                        } else {
                            throw new NullPointerException("Null displayNames");
                        }
                    }
                    dcdc<cyzl> f = G.f();
                    dcpe<cyzl> listIterator = f.listIterator();
                    while (listIterator.hasNext()) {
                        cyzl next = listIterator.next();
                        if (next.d() != null) {
                            dcpe<cyvy> listIterator2 = next.e().listIterator();
                            while (listIterator2.hasNext()) {
                                listIterator2.next().c().l = true;
                            }
                            dcpe<cyvv> listIterator3 = next.c().listIterator();
                            while (listIterator3.hasNext()) {
                                listIterator3.next().b().l = true;
                            }
                        }
                    }
                    l.close();
                    return f;
                } catch (Exception e3) {
                    cyphVar.f(4, 8, cyorVar);
                    throw e3;
                }
            }
            return dcdc.e();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable th2) {
                deki.a(th, th2);
            }
            throw th;
        }
    }

    static dcdc<Long> c(Context context, String str, Uri uri, cyph cyphVar, cyor cyorVar) {
        Cursor l = l(context, uri.buildUpon().appendPath(str).appendQueryParameter("directory", "0").build(), b, null, null, null, cyphVar, cyorVar);
        if (l != null) {
            try {
                dccx G = dcdc.G(l.getCount());
                while (l.moveToNext()) {
                    G.g(Long.valueOf(e(l, "contact_id")));
                }
                dcdc<Long> f = G.f();
                l.close();
                return f;
            } catch (Throwable th) {
                try {
                    l.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
                throw th;
            }
        }
        return dcdc.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(Cursor cursor, String str) {
        return cursor.isNull(cursor.getColumnIndexOrThrow(str));
    }

    public static boolean i(Context context) {
        return akm.d(context, "android.permission.READ_CONTACTS") == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long k(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("last_time_used");
        if (columnIndex == -1) {
            return 0L;
        }
        return cursor.getLong(columnIndex);
    }

    private static Cursor l(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, cyph cyphVar, cyor cyorVar) {
        try {
            return context.getContentResolver().query(uri, strArr, str, strArr2, str2);
        } catch (Exception unused) {
            cyphVar.f(4, 9, cyorVar);
            return null;
        }
    }

    private static boolean m(@dzsi Collection<Long> collection) {
        return collection != null && ((long) collection.size()) <= dybc.a.a().b();
    }
}
