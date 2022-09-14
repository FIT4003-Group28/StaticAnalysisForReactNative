package defpackage;

import android.database.Cursor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bz  reason: default package */
/* loaded from: classes4.dex */
public final class bz {
    private static final String[] d = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    public final String a;
    public final Set<String> b;
    public final Set<String> c;

    public bz(String str, Set<String> set, String str2) {
        this.a = str;
        this.b = set;
        this.c = b(str2);
    }

    public bz(String str, Set<String> set, Set<String> set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public static bz a(avu avuVar, String str) {
        Cursor f = avuVar.f("PRAGMA table_info(`" + str + "`)");
        HashSet hashSet = new HashSet();
        try {
            if (f.getColumnCount() > 0) {
                int columnIndex = f.getColumnIndex("name");
                while (f.moveToNext()) {
                    hashSet.add(f.getString(columnIndex));
                }
            }
            f.close();
            f = avuVar.f("SELECT * FROM sqlite_master WHERE `name` = '" + str + "'");
            try {
                String string = f.moveToFirst() ? f.getString(f.getColumnIndexOrThrow("sql")) : "";
                f.close();
                return new bz(str, hashSet, b(string));
            } finally {
            }
        } finally {
        }
    }

    static Set<String> b(String str) {
        int i;
        if (str.isEmpty()) {
            return new HashSet();
        }
        String substring = str.substring(str.indexOf(40) + 1, str.lastIndexOf(41));
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = -1;
        for (int i3 = 0; i3 < substring.length(); i3++) {
            char charAt = substring.charAt(i3);
            if (charAt != '\"' && charAt != '\'') {
                if (charAt != ',') {
                    if (charAt != '[') {
                        if (charAt != ']') {
                            if (charAt != '`') {
                            }
                        } else if (!arrayDeque.isEmpty() && ((Character) arrayDeque.peek()).charValue() == '[') {
                            arrayDeque.pop();
                        }
                    } else if (arrayDeque.isEmpty()) {
                        arrayDeque.push(Character.valueOf(charAt));
                    }
                } else if (arrayDeque.isEmpty()) {
                    arrayList.add(substring.substring(i2 + 1, i3).trim());
                    i2 = i3;
                }
            }
            if (arrayDeque.isEmpty()) {
                arrayDeque.push(Character.valueOf(charAt));
            } else if (((Character) arrayDeque.peek()).charValue() == charAt) {
                arrayDeque.pop();
            }
        }
        arrayList.add(substring.substring(i2 + 1).trim());
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            String str2 = (String) arrayList.get(i4);
            String[] strArr = d;
            int i5 = 0;
            while (true) {
                i = i4 + 1;
                if (i5 < 9) {
                    if (str2.startsWith(strArr[i5])) {
                        hashSet.add(str2);
                    }
                    i5++;
                }
            }
            i4 = i;
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        if (this.a.equals(bzVar.a) && this.b.equals(bzVar.b)) {
            return this.c.equals(bzVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "FtsTableInfo{name='" + this.a + "', columns=" + this.b + ", options=" + this.c + '}';
    }
}
