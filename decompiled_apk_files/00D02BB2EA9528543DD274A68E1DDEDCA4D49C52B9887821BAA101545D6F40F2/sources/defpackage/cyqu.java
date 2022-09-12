package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cyqu  reason: default package */
/* loaded from: classes5.dex */
public final class cyqu extends bw {
    final /* synthetic */ cyqw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyqu(cyqw cyqwVar) {
        super(7, 8);
        this.c = cyqwVar;
    }

    @Override // defpackage.bw
    public final void a(avu avuVar) {
        cyph cyphVar = this.c.a;
        dbtp b = cyphVar == null ? null : cyphVar.b();
        avuVar.h("ALTER TABLE CacheInfo ADD COLUMN num_contacts INTEGER NOT NULL DEFAULT 0");
        Cursor f = avuVar.f("SELECT COUNT(*) FROM Contacts");
        try {
            if (f.moveToFirst()) {
                int i = 0;
                long j = f.getLong(0);
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("num_contacts", Long.valueOf(j));
                String[] strArr = new String[0];
                if (contentValues.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowFixedHeightMajor);
                sb.append("UPDATE ");
                sb.append(awd.a[4]);
                sb.append("CacheInfo");
                sb.append(" SET ");
                int size = contentValues.size();
                Object[] objArr = new Object[size];
                for (String str : contentValues.keySet()) {
                    String str2 = ",";
                    if (i <= 0) {
                        str2 = "";
                    }
                    sb.append(str2);
                    sb.append(str);
                    objArr[i] = contentValues.get(str);
                    sb.append("=?");
                    i++;
                }
                for (int i2 = size; i2 < size; i2++) {
                    objArr[i2] = strArr[i2 - size];
                }
                if (!TextUtils.isEmpty("rowid = 1")) {
                    sb.append(" WHERE ");
                    sb.append("rowid = 1");
                }
                awj l = ((awd) avuVar).l(sb.toString());
                avt.a(l, objArr);
                l.a();
            }
            if (f != null) {
                f.close();
            }
            cyph cyphVar2 = this.c.a;
            if (cyphVar2 == null || b == null) {
                return;
            }
            cypg.a(cyphVar2, 64, b, cyor.a);
        } catch (Throwable th) {
            if (f != null) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }
}
