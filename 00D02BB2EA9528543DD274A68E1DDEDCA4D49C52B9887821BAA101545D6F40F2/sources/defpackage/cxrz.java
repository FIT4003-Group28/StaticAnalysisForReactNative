package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxrz  reason: default package */
/* loaded from: classes5.dex */
public final class cxrz implements Runnable {
    final /* synthetic */ cxsc a;

    public cxrz(cxsc cxscVar) {
        this.a = cxscVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cursor query;
        String str;
        int i;
        String b;
        String f;
        cxsc cxscVar = this.a;
        Uri build = ContactsContract.Data.CONTENT_URI.buildUpon().appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
        if (cxscVar.i.n()) {
            query = cxscVar.e.getContentResolver().query(build, cxsc.a, cxsc.b, null, "sort_key ASC");
        } else {
            query = cxscVar.e.getContentResolver().query(build, cxsc.a, cxsc.c, null, "sort_key ASC");
        }
        HashMap hashMap = new HashMap();
        String[] stringArray = query.getExtras().getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
        int[] intArray = query.getExtras().getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
        int i2 = 0;
        for (int i3 = 0; i3 < stringArray.length; i3++) {
            hashMap.put(Integer.valueOf(i2), stringArray[i3]);
            i2 += intArray[i3];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList<cxsb> arrayList = new ArrayList();
        String str2 = "";
        while (query.moveToNext()) {
            if (hashMap.containsKey(Integer.valueOf(query.getPosition()))) {
                str2 = (String) hashMap.get(Integer.valueOf(query.getPosition()));
            }
            String b2 = cxsc.b(query, "mimetype");
            if ("vnd.android.cursor.item/email_v2".equals(b2)) {
                str = cxsc.b(query, "data1");
                if (!cxscVar.i.j() || str.toLowerCase(Locale.US).endsWith("@gmail.com") || str.toLowerCase(Locale.US).endsWith("@googlemail.com") || str.toLowerCase(Locale.US).endsWith("@google.com")) {
                    i = 1;
                }
            } else if ("vnd.android.cursor.item/phone_v2".equals(b2)) {
                str = cxsc.b(query, "data1");
                i = 2;
            } else {
                str = null;
                i = 0;
            }
            if (i != 0 && !TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(query.getString(cxsc.d.get("display_name_source").intValue()));
                if (parseInt == 40 || parseInt == 35 || parseInt == 30) {
                    b = cxsc.b(query, "display_name");
                    f = cxrc.f(b);
                } else {
                    b = "";
                    f = b;
                }
                String b3 = cxsc.b(query, "photo_thumb_uri");
                cxrn C = PopulousChannel.C();
                C.a = 4;
                C.b(str, i);
                C.c(b, true, false);
                C.j = f;
                C.k = b3;
                C.m = str2;
                C.n = false;
                PopulousChannel a = C.a();
                String b4 = cxsc.b(query, "contact_id");
                Set set = (Set) linkedHashMap.get(b4);
                if (set == null) {
                    set = new LinkedHashSet();
                    linkedHashMap.put(b4, set);
                }
                set.add(a);
                if (cxscVar.i.m()) {
                    arrayList.add(new cxsb(b4, a, cxscVar.j));
                }
                if (cxsc.b(query, "starred").equals("1")) {
                    Set set2 = (Set) linkedHashMap2.get(b4);
                    if (set2 == null) {
                        set2 = new LinkedHashSet();
                        linkedHashMap2.put(b4, set2);
                    }
                    C.m = "";
                    C.n = true;
                    set2.add(C.a());
                }
            }
        }
        query.close();
        HashSet hashSet = new HashSet();
        HashMap hashMap2 = new HashMap();
        for (cxsb cxsbVar : arrayList) {
            if (hashSet.add(cxsbVar.c)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(cxsbVar);
                hashMap2.put(cxsbVar.c, arrayList2);
            } else {
                ((List) hashMap2.get(cxsbVar.c)).add(cxsbVar);
            }
        }
        cybo cyboVar = cxscVar.g;
        ArrayList arrayList3 = new ArrayList(hashSet);
        cxzv d = cxzw.d();
        d.b(true);
        ((cxxu) d).a = 1;
        cyboVar.g(arrayList3, d.a(), new cxsa(cxscVar, hashMap2, linkedHashMap2, linkedHashMap));
    }
}
